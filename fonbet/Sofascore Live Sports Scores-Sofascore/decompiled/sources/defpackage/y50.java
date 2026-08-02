package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class y50 {
    public static final wj9 a = wj9.J("a", TtmlNode.TAG_P, "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final wj9 b = wj9.J(CampaignEx.JSON_KEY_AD_K);

    public static void a(s50 s50Var, plb plbVar) {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        List list = (List) s50Var.b;
        if (list.isEmpty()) {
            list.add(new nja(plbVar, valueOf, valueOf, (Interpolator) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(plbVar.m)));
        } else if (((nja) list.get(0)).b == null) {
            list.set(0, new nja(plbVar, valueOf, valueOf, (Interpolator) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(plbVar.m)));
        }
    }

    public static boolean b(s50 s50Var) {
        if (s50Var != null) {
            return s50Var.isStatic() && ((Float) ((nja) ((List) s50Var.b).get(0)).b).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x011b, code lost:
    
        if (r1.b == 1.0f) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x50 c(lha lhaVar, plb plbVar) {
        r50 r50Var;
        boolean z = lhaVar.Z() == 3;
        if (z) {
            lhaVar.k();
        }
        t50 t50Var = null;
        z50 z50Var = null;
        s50 s50Var = null;
        r50 r50Var2 = null;
        s50 s50Var2 = null;
        s50 s50Var3 = null;
        s50 s50Var4 = null;
        s50 s50Var5 = null;
        s50 s50Var6 = null;
        r50 r50Var3 = null;
        s50 s50Var7 = null;
        s50 s50Var8 = null;
        while (lhaVar.t()) {
            switch (lhaVar.e0(a)) {
                case 0:
                    lhaVar.k();
                    while (lhaVar.t()) {
                        if (lhaVar.e0(b) != 0) {
                            lhaVar.f0();
                            lhaVar.g0();
                        } else {
                            t50Var = u50.a(lhaVar, plbVar);
                        }
                    }
                    lhaVar.n();
                    break;
                case 1:
                    z50Var = u50.b(lhaVar, plbVar);
                    break;
                case 2:
                    r50Var2 = new r50(qja.a(lhaVar, plbVar, 1.0f, tnf.f, false), 4);
                    break;
                case 3:
                    s50Var6 = un0.C(lhaVar, plbVar, false);
                    a(s50Var6, plbVar);
                    break;
                case 4:
                    s50Var = un0.C(lhaVar, plbVar, false);
                    a(s50Var, plbVar);
                    break;
                case 5:
                    r50Var3 = un0.E(lhaVar, plbVar);
                    break;
                case 6:
                    s50Var7 = un0.C(lhaVar, plbVar, false);
                    break;
                case 7:
                    s50Var8 = un0.C(lhaVar, plbVar, false);
                    break;
                case 8:
                    s50Var2 = un0.C(lhaVar, plbVar, false);
                    break;
                case 9:
                    s50Var3 = un0.C(lhaVar, plbVar, false);
                    break;
                case 10:
                    s50Var4 = un0.C(lhaVar, plbVar, false);
                    a(s50Var4, plbVar);
                    break;
                case 11:
                    s50Var5 = un0.C(lhaVar, plbVar, false);
                    a(s50Var5, plbVar);
                    break;
                default:
                    lhaVar.f0();
                    lhaVar.g0();
                    break;
            }
        }
        if (z) {
            lhaVar.n();
        }
        if (t50Var == null || (t50Var.isStatic() && ((PointF) ((nja) t50Var.b.get(0)).b).equals(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
            t50Var = null;
        }
        z50 z50Var2 = (z50Var == null || (!(z50Var instanceof v50) && z50Var.isStatic() && ((PointF) ((nja) z50Var.h().get(0)).b).equals(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) ? null : z50Var;
        s50 s50Var9 = b(s50Var) ? null : s50Var;
        if (r50Var2 != null) {
            if (r50Var2.isStatic()) {
                prg prgVar = (prg) ((nja) ((List) r50Var2.b).get(0)).b;
                if (prgVar.a == 1.0f) {
                }
            }
            r50Var = r50Var2;
            return new x50(t50Var, z50Var2, r50Var, s50Var9, r50Var3, s50Var7, s50Var8, (s50Var2 != null || (s50Var2.isStatic() && ((Float) ((nja) ((List) s50Var2.b).get(0)).b).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) ? null : s50Var2, (s50Var3 != null || (s50Var3.isStatic() && ((Float) ((nja) ((List) s50Var3.b).get(0)).b).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) ? null : s50Var3, !b(s50Var4) ? null : s50Var4, !b(s50Var5) ? null : s50Var5, !b(s50Var6) ? null : s50Var6);
        }
        r50Var = null;
        return new x50(t50Var, z50Var2, r50Var, s50Var9, r50Var3, s50Var7, s50Var8, (s50Var2 != null || (s50Var2.isStatic() && ((Float) ((nja) ((List) s50Var2.b).get(0)).b).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) ? null : s50Var2, (s50Var3 != null || (s50Var3.isStatic() && ((Float) ((nja) ((List) s50Var3.b).get(0)).b).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) ? null : s50Var3, !b(s50Var4) ? null : s50Var4, !b(s50Var5) ? null : s50Var5, !b(s50Var6) ? null : s50Var6);
    }
}
