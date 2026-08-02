package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xpa {
    public znh a;
    public znh b;

    public static xtc a(xpa xpaVar, xtc xtcVar, int i) {
        g0i e0 = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
        Map map = hwk.a;
        g0i e02 = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new r6a(4294967297L), 1);
        g0i e03 = (i & 4) != 0 ? s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5) : null;
        xpaVar.getClass();
        return xtcVar.z(new zpa(e0, e02, e03));
    }

    public static xtc b(xpa xpaVar) {
        return new h9e(xpaVar.a);
    }
}
