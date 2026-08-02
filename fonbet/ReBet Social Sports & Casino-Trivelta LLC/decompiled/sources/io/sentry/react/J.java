package io.sentry.react;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.facebook.react.bridge.Promise;
import io.sentry.InterfaceC4861w2;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f52565a = new a(51, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public static String f52566b = null;

    public class a extends LinkedHashMap {
        public a(int i10, float f10, boolean z10) {
            super(i10, f10, z10);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 50;
        }
    }

    public static /* synthetic */ void a(final InterfaceC4861w2 interfaceC4861w2, final Promise promise) {
        try {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: io.sentry.react.I
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    InterfaceC4861w2 interfaceC4861w22 = InterfaceC4861w2.this;
                    promise.resolve(Double.valueOf(interfaceC4861w22.now().f() / 1.0E9d));
                }
            });
        } catch (Exception e10) {
            promise.reject("Failed to receive the instance of Choreographer", e10);
        }
    }

    public static void c(final Promise promise, final InterfaceC4861w2 interfaceC4861w2) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            promise.reject("GetTimeToDisplay is not able to measure the time to display: Main looper not available.");
        } else {
            new Handler(mainLooper).post(new Runnable() { // from class: io.sentry.react.H
                @Override // java.lang.Runnable
                public final void run() {
                    J.a(InterfaceC4861w2.this, promise);
                }
            });
        }
    }

    public static Double d(String str) {
        return (Double) f52565a.remove(str);
    }

    public static void e(String str, Double d10) {
        f52565a.put(str, d10);
    }

    public static void f(Double d10) {
        if (f52566b != null) {
            e("ttid-navigation-" + f52566b, d10);
        }
    }

    public static void g(String str) {
        f52566b = str;
    }
}
