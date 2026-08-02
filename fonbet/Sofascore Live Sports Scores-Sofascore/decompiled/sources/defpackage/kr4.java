package defpackage;

import com.inmobi.media.core.config.models.CrashConfig;
import java.math.BigInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kr4 implements b0h {
    public final /* synthetic */ lr4 a;

    public kr4(lr4 lr4Var) {
        this.a = lr4Var;
    }

    @Override // defpackage.b0h
    public final long getDurationUs() {
        return (this.a.e * 1000000) / ((qgi) r5.m).f;
    }

    @Override // defpackage.b0h
    public final zzg getSeekPoints(long j) {
        lr4 lr4Var = this.a;
        long j2 = lr4Var.b;
        BigInteger valueOf = BigInteger.valueOf((((qgi) lr4Var.m).f * j) / 1000000);
        long j3 = lr4Var.c;
        f0h f0hVar = new f0h(j, nik.k((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(lr4Var.e)).longValue() + j2) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, lr4Var.b, j3 - 1));
        return new zzg(f0hVar, f0hVar);
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        return true;
    }
}
