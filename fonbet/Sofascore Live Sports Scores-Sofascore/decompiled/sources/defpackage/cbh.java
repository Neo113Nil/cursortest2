package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cbh {
    public static final n7g a = xbh.d;
    public static final n7g b = xbh.h;
    public static final n7g c = xbh.g;
    public static final n7g d = xbh.e;
    public static final n7g e = xbh.f;
    public static final n7g f = xbh.b;
    public static final n7g g = xbh.c;
    public static final n7g h = xbh.a;
    public static final q75 i = xbh.i;

    static {
        if (100.0f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || 100.0f > 100.0f) {
            u3a.a("The percent should be in the range of [0, 100]");
        }
    }
}
