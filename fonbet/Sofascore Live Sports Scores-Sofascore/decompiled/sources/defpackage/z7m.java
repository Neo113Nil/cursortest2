package defpackage;

import com.blaze.blazesdk.delegates.models.BlazePlayerType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z7m {
    public static q5m a() {
        tul tulVar = jdm.d;
        if (tulVar != null) {
            return tulVar.d;
        }
        return null;
    }

    public static boolean b(BlazePlayerType blazePlayerType) {
        oql oqlVar;
        wul wulVar;
        String str;
        String str2;
        blazePlayerType.getClass();
        q5m a = a();
        if (a != null) {
            blazePlayerType.getClass();
            if (a.c.length() != 0 && a.d.length() != 0 && (oqlVar = a.a) != null && (wulVar = a.b) != null) {
                int i = uyl.a[blazePlayerType.ordinal()];
                if (i == 1) {
                    str = wulVar.a;
                    str2 = oqlVar.a;
                } else if (i == 2) {
                    str = wulVar.b;
                    str2 = oqlVar.b;
                } else {
                    if (i != 3) {
                        zzl.b();
                        return false;
                    }
                    str = wulVar.c;
                    str2 = oqlVar.c;
                }
                if (str.length() > 0 && str2.length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
