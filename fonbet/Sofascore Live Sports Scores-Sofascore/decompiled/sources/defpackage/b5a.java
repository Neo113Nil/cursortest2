package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class b5a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qhe c;
    public final /* synthetic */ int d;

    public /* synthetic */ b5a(int i, qhe qheVar, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = qheVar;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        qhe qheVar = this.c;
        phe pheVar = (phe) obj;
        switch (i) {
            case 0:
                pheVar.e(qheVar, i3, i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 1:
                pheVar.e(qheVar, wzb.b((i3 - qheVar.a) / 2.0f), wzb.b((i2 - qheVar.b) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 2:
                pheVar.e(qheVar, wzb.b((i3 - qheVar.a) / 2.0f), wzb.b((i2 - qheVar.b) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            default:
                pheVar.e(qheVar, i3, i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ b5a(qhe qheVar, int i, int i2, int i3) {
        this.a = i3;
        this.c = qheVar;
        this.b = i;
        this.d = i2;
    }
}
