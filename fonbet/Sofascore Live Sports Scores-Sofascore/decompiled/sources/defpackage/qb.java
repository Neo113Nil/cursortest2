package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qb {
    public final float a;
    public final float b;
    public final b20 c;
    public final jii d;

    public qb(float f, float f2, b20 b20Var) {
        this.a = f;
        this.b = f2;
        this.c = b20Var;
        this.d = new jii(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30);
    }
}
