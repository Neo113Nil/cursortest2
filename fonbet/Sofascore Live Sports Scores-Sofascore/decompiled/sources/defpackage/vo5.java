package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vo5 extends xka implements Function1 {
    public final /* synthetic */ qhe i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ x40 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo5(qhe qheVar, long j, long j2, x40 x40Var) {
        super(1);
        this.i = qheVar;
        this.j = j;
        this.k = j2;
        this.l = x40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = this.j;
        long j2 = this.k;
        ((phe) obj).l(this.i, ((int) (j >> 32)) + ((int) (j2 >> 32)), ((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.l);
        return Unit.a;
    }
}
