package Lg;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: g, reason: collision with root package name */
    public static g f7178g = new g();

    /* renamed from: d, reason: collision with root package name */
    public ReactContext f7182d;

    /* renamed from: f, reason: collision with root package name */
    public int f7184f;

    /* renamed from: a, reason: collision with root package name */
    public final List f7179a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f7180b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7181c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public Boolean f7183e = Boolean.FALSE;

    public static g i() {
        return f7178g;
    }

    public void e(String str) {
        synchronized (this.f7181c) {
            try {
                this.f7184f++;
                if (this.f7181c.containsKey(str)) {
                    this.f7181c.put(str, Integer.valueOf(((Integer) this.f7181c.get(str)).intValue() + 1));
                } else {
                    this.f7181c.put(str, 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f7180b.post(new Runnable() { // from class: Lg.e
            @Override // java.lang.Runnable
            public final void run() {
                g.this.p();
            }
        });
    }

    public void f(final ReactContext reactContext) {
        this.f7180b.post(new Runnable() { // from class: Lg.d
            @Override // java.lang.Runnable
            public final void run() {
                g.this.j(reactContext);
            }
        });
    }

    public final boolean g(Mg.a aVar) {
        ReactContext reactContext;
        if (this.f7183e.booleanValue() && (reactContext = this.f7182d) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f7182d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + aVar.getEventName(), aVar.a());
                return true;
            } catch (Exception e10) {
                Log.wtf("RNFB_EMITTER", "Error sending Event " + aVar.getEventName(), e10);
            }
        }
        return false;
    }

    public WritableMap h() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putInt("listeners", this.f7184f);
        createMap.putInt("queued", this.f7179a.size());
        synchronized (this.f7181c) {
            try {
                for (Map.Entry entry : this.f7181c.entrySet()) {
                    createMap2.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        createMap.putMap("events", createMap2);
        return createMap;
    }

    public final /* synthetic */ void j(ReactContext reactContext) {
        this.f7182d = reactContext;
        p();
    }

    public final /* synthetic */ void k(Boolean bool) {
        this.f7183e = bool;
        p();
    }

    public final /* synthetic */ void l(Mg.a aVar) {
        synchronized (this.f7181c) {
            try {
                if (this.f7181c.containsKey(aVar.getEventName())) {
                    if (!g(aVar)) {
                    }
                }
                this.f7179a.add(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(final Boolean bool) {
        this.f7180b.post(new Runnable() { // from class: Lg.c
            @Override // java.lang.Runnable
            public final void run() {
                g.this.k(bool);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(String str, Boolean bool) {
        synchronized (this.f7181c) {
            try {
                if (this.f7181c.containsKey(str)) {
                    int intValue = ((Integer) this.f7181c.get(str)).intValue();
                    if (intValue > 1 && !bool.booleanValue()) {
                        this.f7181c.put(str, Integer.valueOf(intValue - 1));
                        int i10 = this.f7184f;
                        if (bool.booleanValue()) {
                            intValue = 1;
                        }
                        this.f7184f = i10 - intValue;
                    }
                    this.f7181c.remove(str);
                    int i102 = this.f7184f;
                    if (bool.booleanValue()) {
                    }
                    this.f7184f = i102 - intValue;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void o(final Mg.a aVar) {
        this.f7180b.post(new Runnable() { // from class: Lg.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.l(aVar);
            }
        });
    }

    public final void p() {
        synchronized (this.f7181c) {
            try {
                Iterator it = new ArrayList(this.f7179a).iterator();
                while (it.hasNext()) {
                    Mg.a aVar = (Mg.a) it.next();
                    if (this.f7181c.containsKey(aVar.getEventName())) {
                        this.f7179a.remove(aVar);
                        o(aVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
