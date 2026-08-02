package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f1h extends d1h {
    public final hcc j;
    public final hcc k;
    public final long l;

    public f1h(jlf jlfVar, long j, long j2, long j3, long j4, long j5, List list, long j6, hcc hccVar, hcc hccVar2, long j7, long j8) {
        super(jlfVar, j, j2, j3, j5, list, j6, j7, j8);
        this.j = hccVar;
        this.k = hccVar2;
        this.l = j4;
    }

    @Override // defpackage.i1h
    public final jlf a(ozf ozfVar) {
        hcc hccVar = this.j;
        if (hccVar == null) {
            return this.a;
        }
        b bVar = ozfVar.a;
        return new jlf(hccVar.I(bVar.a, 0L, bVar.j, 0L), 0L, -1L);
    }

    @Override // defpackage.d1h
    public final long d(long j) {
        if (this.f != null) {
            return r0.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == C.TIME_UNSET) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = wv1.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.d1h
    public final jlf h(mzf mzfVar, long j) {
        List list = this.f;
        long j2 = this.d;
        long j3 = list != null ? ((g1h) list.get((int) (j - j2))).a : (j - j2) * this.e;
        b bVar = mzfVar.a;
        return new jlf(this.k.I(bVar.a, j, bVar.j, j3), 0L, -1L);
    }
}
