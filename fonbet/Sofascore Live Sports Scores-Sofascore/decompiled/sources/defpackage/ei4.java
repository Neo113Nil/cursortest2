package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ei4 implements knh {
    public final /* synthetic */ gsa a;

    public ei4(gsa gsaVar) {
        this.a = gsaVar;
    }

    @Override // defpackage.knh
    public final float a(float f) {
        return this.a.a(f);
    }

    @Override // defpackage.knh
    public final float b(float f, float f2) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
