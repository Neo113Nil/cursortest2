package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qhe b;

    public /* synthetic */ b3(qhe qheVar, int i) {
        this.a = i;
        this.b = qheVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        qhe qheVar = this.b;
        switch (i) {
            case 0:
                phe.h((phe) obj, qheVar, 0, 0);
                break;
            case 1:
                phe.h((phe) obj, qheVar, 0, 0);
                break;
            case 2:
                phe.h((phe) obj, qheVar, 0, 0);
                break;
            case 3:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 4:
                phe pheVar = (phe) obj;
                pheVar.getClass();
                phe.h(pheVar, qheVar, 0, 0);
                break;
            case 5:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 6:
                phe pheVar2 = (phe) obj;
                pheVar2.getClass();
                pheVar2.e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 7:
                phe.h((phe) obj, qheVar, 0, 0);
                break;
            case 8:
                phe.h((phe) obj, qheVar, 0, 0);
                break;
            case 9:
                phe pheVar3 = (phe) obj;
                if (pheVar3.b() == ema.a || pheVar3.c() == 0) {
                    pheVar3.d(qheVar);
                    qheVar.b0(r6a.d(0L, qheVar.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
                } else {
                    pheVar3.d(qheVar);
                    qheVar.b0(r6a.d((pheVar3.c() - qheVar.a) << 32, qheVar.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
                }
                break;
            case 10:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 11:
                phe.m((phe) obj, this.b, 0, 0, null, 12);
                break;
            case 12:
                phe pheVar4 = (phe) obj;
                pheVar4.getClass();
                phe.h(pheVar4, qheVar, 0, 0);
                break;
            case 13:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 14:
                phe.h((phe) obj, qheVar, 0, 0);
                break;
            case 15:
                phe pheVar5 = (phe) obj;
                pheVar5.getClass();
                pheVar5.e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 16:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 17:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 18:
                phe.h((phe) obj, qheVar, 0, 0);
                break;
            case 19:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 20:
                ((phe) obj).e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 21:
                phe pheVar6 = (phe) obj;
                pheVar6.getClass();
                pheVar6.e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 22:
                phe pheVar7 = (phe) obj;
                pheVar7.getClass();
                pheVar7.e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 23:
                phe.h((phe) obj, qheVar, 0, 0);
                break;
            default:
                phe pheVar8 = (phe) obj;
                pheVar8.getClass();
                pheVar8.e(qheVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
        }
        return Unit.a;
    }
}
