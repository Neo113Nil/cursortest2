package com.facebook.internal;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q {
    public static final q a = new q();
    public static final HashMap b = new HashMap();

    public static final void a(n nVar, o oVar) {
        oVar.getClass();
        s.d(new p(nVar, oVar));
    }

    public static final boolean b(o oVar) {
        boolean z;
        oVar.getClass();
        boolean z2 = false;
        if (o.Unknown != oVar) {
            if (o.Core != oVar) {
                String string = com.facebook.w.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString("FBSDKFeature" + oVar, null);
                if (string == null || !string.equals("18.3.0")) {
                    int i = oVar.a;
                    o a2 = (i & 255) > 0 ? h.a(i & (-256)) : (65280 & i) > 0 ? h.a(i & (-65536)) : (16711680 & i) > 0 ? h.a(i & (-16777216)) : h.a(0);
                    if (a2 == oVar) {
                        switch (oVar.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 43:
                            case 44:
                            case 45:
                                break;
                            case 35:
                            case 36:
                            case 37:
                            case 42:
                            default:
                                z2 = true;
                                break;
                        }
                        return s.b("FBSDKFeature" + oVar, com.facebook.w.b(), z2);
                    }
                    if (b(a2)) {
                        switch (oVar.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 43:
                            case 44:
                            case 45:
                                z = false;
                                break;
                            case 35:
                            case 36:
                            case 37:
                            case 42:
                            default:
                                z = true;
                                break;
                        }
                        if (s.b("FBSDKFeature" + oVar, com.facebook.w.b(), z)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
