package defpackage;

import com.inmobi.media.core.config.models.CrashConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jr4 implements a0h {
    public final /* synthetic */ lr4 a;

    public jr4(lr4 lr4Var) {
        this.a = lr4Var;
    }

    @Override // defpackage.a0h
    public final long getDurationUs() {
        return (this.a.e * 1000000) / ((qgi) r5.m).f;
    }

    @Override // defpackage.a0h
    public final yzg getSeekPoints(long j) {
        lr4 lr4Var = this.a;
        long j2 = lr4Var.b;
        long j3 = lr4Var.c;
        e0h e0hVar = new e0h(j, lik.i(((((j3 - j2) * ((((qgi) lr4Var.m).f * j) / 1000000)) / lr4Var.e) + j2) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, j2, j3 - 1));
        return new yzg(e0hVar, e0hVar);
    }

    @Override // defpackage.a0h
    public final boolean isSeekable() {
        return true;
    }
}
