package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zw {
    public final /* synthetic */ dx a;

    public zw(dx dxVar) {
        this.a = dxVar;
    }

    public static void a(zw zwVar, float f) {
        dx dxVar = zwVar.a;
        ((xnh) dxVar.f).i(f);
        ((xnh) dxVar.g).i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
