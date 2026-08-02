package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i60 extends xka implements Function1 {
    public final /* synthetic */ qhe[] i;
    public final /* synthetic */ j60 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(qhe[] qheVarArr, j60 j60Var, int i, int i2) {
        super(1);
        this.i = qheVarArr;
        this.j = j60Var;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        phe pheVar = (phe) obj;
        for (qhe qheVar : this.i) {
            if (qheVar != null) {
                long a = this.j.a.b.a((qheVar.a << 32) | (qheVar.b & 4294967295L), (this.k << 32) | (this.l & 4294967295L), ema.a);
                pheVar.e(qheVar, (int) (a >> 32), (int) (a & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        return Unit.a;
    }
}
