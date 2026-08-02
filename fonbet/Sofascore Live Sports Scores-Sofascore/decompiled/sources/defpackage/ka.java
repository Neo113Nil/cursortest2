package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ka {
    public static final xtc a;

    static {
        gd3 gd3Var = new gd3(5);
        utc utcVar = utc.a;
        l98.d0(o3h.a(s9a.A(utcVar, gd3Var), true, new ia(0)), 10.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        a = l98.d0(o3h.a(s9a.A(utcVar, new gd3(6)), true, new ia(1)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f, 1);
    }
}
