package defpackage;

import com.facebook.internal.k0;
import com.facebook.w;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class aqd {
    public static final aqd a = new aqd();
    public static final Set b = ph0.a0(new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a() {
        boolean booleanValue;
        Set set = cw3.a;
        if (set.contains(aqd.class)) {
            return false;
        }
        try {
            if (w.f(w.a()) || k0.y()) {
                return false;
            }
            wxf wxfVar = wxf.b;
            if (!set.contains(wxf.class)) {
                try {
                    Boolean bool = wxf.c;
                    if (bool == null) {
                        bool = Boolean.valueOf(wxf.b.r(w.a()) != null);
                        wxf.c = bool;
                    }
                    booleanValue = bool.booleanValue();
                } catch (Throwable th) {
                    cw3.a(wxf.class, th);
                }
                return !booleanValue;
            }
            booleanValue = false;
            if (!booleanValue) {
            }
        } catch (Throwable th2) {
            cw3.a(aqd.class, th2);
            return false;
        }
    }
}
