package io.sentry.react;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4861w2;
import io.sentry.android.core.C4683i0;
import io.sentry.android.core.b1;
import io.sentry.react.RNSentryOnDrawReporterManager;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class RNSentryOnDrawReporterManager extends SimpleViewManager<a> {
    public static final String REACT_CLASS = "RNSentryOnDrawReporter";
    public static final String TTFD_PREFIX = "ttfd-";
    public static final String TTID_PREFIX = "ttid-";

    @NotNull
    private final ReactApplicationContext mCallerContext;

    public static class a extends View {

        /* renamed from: h, reason: collision with root package name */
        public static final ILogger f52567h = new io.sentry.android.core.C("RNSentryOnDrawReporterView");

        /* renamed from: a, reason: collision with root package name */
        public final ReactApplicationContext f52568a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC4861w2 f52569b;

        /* renamed from: c, reason: collision with root package name */
        public final C4683i0 f52570c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f52571d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f52572e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f52573f;

        /* renamed from: g, reason: collision with root package name */
        public String f52574g;

        public a(ReactApplicationContext reactApplicationContext, C4683i0 c4683i0) {
            super(reactApplicationContext);
            this.f52569b = new b1();
            this.f52571d = false;
            this.f52572e = false;
            this.f52573f = false;
            this.f52574g = null;
            this.f52568a = reactApplicationContext;
            this.f52570c = c4683i0;
        }

        public final /* synthetic */ void b() {
            Double valueOf = Double.valueOf(this.f52569b.now().f() / 1.0E9d);
            if (this.f52574g == null) {
                f52567h.c(EnumC4788n3.ERROR, "[TimeToDisplay] parentSpanId removed before frame was rendered.", new Object[0]);
                return;
            }
            if (this.f52571d) {
                J.e(RNSentryOnDrawReporterManager.TTID_PREFIX + this.f52574g, valueOf);
                return;
            }
            if (!this.f52572e) {
                f52567h.c(EnumC4788n3.DEBUG, "[TimeToDisplay] display type removed before frame was rendered.", new Object[0]);
                return;
            }
            J.e(RNSentryOnDrawReporterManager.TTFD_PREFIX + this.f52574g, valueOf);
        }

        public final void c() {
            if (this.f52574g == null) {
                return;
            }
            if (this.f52573f) {
                f52567h.c(EnumC4788n3.DEBUG, "[TimeToDisplay] Already recorded time to display for spanId: " + this.f52574g, new Object[0]);
                return;
            }
            if (this.f52571d) {
                f52567h.c(EnumC4788n3.DEBUG, "[TimeToDisplay] Register initial display event emitter.", new Object[0]);
            } else {
                if (!this.f52572e) {
                    f52567h.c(EnumC4788n3.DEBUG, "[TimeToDisplay] Not ready, missing displayType prop.", new Object[0]);
                    return;
                }
                f52567h.c(EnumC4788n3.DEBUG, "[TimeToDisplay] Register full display event emitter.", new Object[0]);
            }
            if (this.f52570c == null) {
                f52567h.c(EnumC4788n3.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, buildInfo is null.", new Object[0]);
                return;
            }
            ReactApplicationContext reactApplicationContext = this.f52568a;
            if (reactApplicationContext == null) {
                f52567h.c(EnumC4788n3.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, reactContext is null.", new Object[0]);
                return;
            }
            ILogger iLogger = f52567h;
            Activity a10 = io.sentry.react.utils.a.a(reactApplicationContext, iLogger);
            if (a10 == null) {
                iLogger.c(EnumC4788n3.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, activity is null.", new Object[0]);
            } else {
                this.f52573f = true;
                d(a10, new Runnable() { // from class: io.sentry.react.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        RNSentryOnDrawReporterManager.a.this.b();
                    }
                }, this.f52570c);
            }
        }

        public void d(Activity activity, Runnable runnable, C4683i0 c4683i0) {
            io.sentry.android.core.internal.util.r.c(activity, runnable, c4683i0);
        }

        public void setFullDisplay(boolean z10) {
            if (z10 != this.f52572e) {
                this.f52572e = z10;
                c();
            }
        }

        public void setInitialDisplay(boolean z10) {
            if (z10 != this.f52571d) {
                this.f52571d = z10;
                c();
            }
        }

        public void setParentSpanId(@Nullable String str) {
            if (Objects.equals(str, this.f52574g)) {
                return;
            }
            this.f52574g = str;
            this.f52573f = false;
            c();
        }
    }

    public RNSentryOnDrawReporterManager(ReactApplicationContext reactApplicationContext) {
        this.mCallerContext = reactApplicationContext;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(defaultBoolean = false, name = "fullDisplay")
    public void setFullDisplay(a aVar, boolean z10) {
        aVar.setFullDisplay(z10);
    }

    @ReactProp(defaultBoolean = false, name = "initialDisplay")
    public void setInitialDisplay(a aVar, boolean z10) {
        aVar.setInitialDisplay(z10);
    }

    @ReactProp(name = "parentSpanId")
    public void setParentSpanId(a aVar, String str) {
        aVar.setParentSpanId(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public a createViewInstance(@NotNull ThemedReactContext themedReactContext) {
        return new a(this.mCallerContext, new C4683i0(new io.sentry.android.core.C()));
    }
}
