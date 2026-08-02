package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jy extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ qhe j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy(qhe qheVar, int i) {
        super(1);
        this.i = i;
        this.j = qheVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        qhe qheVar = this.j;
        switch (i) {
            case 0:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 1:
                phe.h((phe) obj, qheVar, 0, 0);
                break;
            case 2:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 3:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 4:
                phe.h((phe) obj, qheVar, 0, 0);
                break;
            case 5:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 6:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 7:
                phe pheVar = (phe) obj;
                pheVar.getClass();
                phe.h(pheVar, qheVar, 0, 0);
                break;
            case 8:
                phe.h((phe) obj, qheVar, 0, 0);
                break;
            default:
                phe.i((phe) obj, qheVar, 0, 0);
                break;
        }
        return Unit.a;
    }
}
