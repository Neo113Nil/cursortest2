package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.facebook.internal.g0;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.w;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b15 {
    public static final b15 a = new b15();
    public static final HashMap b = new HashMap();

    public static final void a(String str) {
        Set set = cw3.a;
        if (set.contains(b15.class)) {
            return;
        }
        try {
            b15 b15Var = a;
            HashMap hashMap = b;
            if (set.contains(b15Var)) {
                return;
            }
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) hashMap.get(str);
                if (registrationListener != null) {
                    Object systemService = w.a().getSystemService("servicediscovery");
                    systemService.getClass();
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        w wVar = w.a;
                    }
                    hashMap.remove(str);
                }
            } catch (Throwable th) {
                cw3.a(b15Var, th);
            }
        } catch (Throwable th2) {
            cw3.a(b15.class, th2);
        }
    }

    public static final boolean b() {
        if (!cw3.a.contains(b15.class)) {
            try {
                u b2 = x.b(w.b());
                if (b2 != null) {
                    if (b2.c.contains(g0.c)) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                cw3.a(b15.class, th);
                return false;
            }
        }
        return false;
    }

    public final boolean c(String str) {
        if (cw3.a.contains(this)) {
            return false;
        }
        try {
            HashMap hashMap = b;
            if (hashMap.containsKey(str)) {
                return true;
            }
            w wVar = w.a;
            String replace = "18.3.0".replace('.', '|');
            replace.getClass();
            String str2 = "fbsdk_" + "android-".concat(replace) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = w.a().getSystemService("servicediscovery");
            systemService.getClass();
            a15 a15Var = new a15(str2, str);
            hashMap.put(str, a15Var);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, a15Var);
            return true;
        } catch (Throwable th) {
            cw3.a(this, th);
            return false;
        }
    }
}
