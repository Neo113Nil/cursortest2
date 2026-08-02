package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ja implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qhe b;
    public final /* synthetic */ int c;

    public /* synthetic */ ja(qhe qheVar, int i, int i2) {
        this.a = i2;
        this.b = qheVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        qhe qheVar = this.b;
        phe pheVar = (phe) obj;
        switch (i) {
            case 0:
                pheVar.e(qheVar, 0, -i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 1:
                pheVar.e(qheVar, -i2, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 2:
                pheVar.getClass();
                pheVar.e(qheVar, 0, i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            default:
                pheVar.getClass();
                pheVar.e(qheVar, 0, i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
        }
        return Unit.a;
    }
}
