package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class kt3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tbj b;

    public /* synthetic */ kt3(tbj tbjVar, int i) {
        this.a = i;
        this.b = tbjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        oqf oqfVar;
        q5b q5bVar;
        dma c;
        char c2;
        long j;
        float f;
        dma c3;
        dma c4;
        dma c5;
        dma c6;
        int i = this.a;
        tbj tbjVar = this.b;
        switch (i) {
            case 0:
                return new le(tbjVar, 9);
            case 1:
                tbjVar.s();
                return Unit.a;
            default:
                dma dmaVar = (dma) obj;
                q5b q5bVar2 = tbjVar.d;
                if (q5bVar2 != null) {
                    if (q5bVar2.p) {
                        q5bVar2 = null;
                    }
                    if (q5bVar2 != null) {
                        nnd nndVar = tbjVar.b;
                        long j2 = tbjVar.l().b;
                        int i2 = pej.c;
                        int v = nndVar.v((int) (j2 >> 32));
                        int v2 = tbjVar.b.v((int) (tbjVar.l().b & 4294967295L));
                        q5b q5bVar3 = tbjVar.d;
                        long j3 = 0;
                        long P = (q5bVar3 == null || (c6 = q5bVar3.c()) == null) ? 0L : c6.P(tbjVar.j(true));
                        q5b q5bVar4 = tbjVar.d;
                        if (q5bVar4 != null && (c5 = q5bVar4.c()) != null) {
                            j3 = c5.P(tbjVar.j(false));
                        }
                        q5b q5bVar5 = tbjVar.d;
                        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (q5bVar5 == null || (c4 = q5bVar5.c()) == null) {
                            c2 = ' ';
                            j = j3;
                            f = 0.0f;
                        } else {
                            c2 = ' ';
                            j = j3;
                            f = Float.intBitsToFloat((int) (c4.P((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(q5bVar2.d() != null ? r15.a.c(v).b : 0.0f) & 4294967295L)) & 4294967295L));
                        }
                        q5b q5bVar6 = tbjVar.d;
                        if (q5bVar6 != null && (c3 = q5bVar6.c()) != null) {
                            f2 = Float.intBitsToFloat((int) (c3.P((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << c2) | (Float.floatToRawIntBits(q5bVar2.d() != null ? r6.a.c(v2).b : 0.0f) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (P >> c2);
                        int i4 = (int) (j >> c2);
                        oqfVar = new oqf(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(f, f2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (((kx4) q5bVar2.a.d).j() * 25.0f) + Math.max(Float.intBitsToFloat((int) (P & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
                        q5bVar = tbjVar.d;
                        if (q5bVar != null || (c = q5bVar.c()) == null) {
                            return null;
                        }
                        return u6h.V(oqfVar, c, dmaVar);
                    }
                }
                oqfVar = oqf.e;
                q5bVar = tbjVar.d;
                if (q5bVar != null) {
                }
                return null;
        }
    }
}
