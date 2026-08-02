package androidx.media3.exoplayer.dash;

import com.inmobi.media.core.config.models.CrashConfig;
import defpackage.bd4;
import defpackage.fjg;
import defpackage.fp4;
import defpackage.h6c;
import defpackage.id4;
import defpackage.it7;
import defpackage.oe4;
import defpackage.qcc;
import defpackage.sx2;
import defpackage.tnf;
import defpackage.vcc;
import defpackage.w9e;
import defpackage.z41;
import defpackage.zic;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements qcc {
    public final z41 a;
    public final oe4 b;
    public final sx2 c;
    public final tnf d;
    public final it7 e;
    public final long f;
    public final long g;

    public DashMediaSource$Factory(oe4 oe4Var) {
        z41 z41Var = new z41(oe4Var);
        this.a = z41Var;
        this.b = oe4Var;
        this.c = new sx2(7, false);
        this.e = new it7(21);
        this.f = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        this.g = 5000000L;
        this.d = new tnf(20);
        ((fjg) z41Var.c).a = true;
    }

    @Override // defpackage.qcc
    public final vcc a(h6c h6cVar) {
        h6cVar.b.getClass();
        w9e bd4Var = new bd4();
        List list = h6cVar.b.e;
        return new id4(h6cVar, this.b, !list.isEmpty() ? new fp4(21, bd4Var, list) : bd4Var, this.a, this.d, this.c.s(h6cVar), this.e, this.f, this.g);
    }

    @Override // defpackage.qcc
    public final void b() {
        ((fjg) this.a.c).a = true;
    }

    @Override // defpackage.qcc
    public final void c(zic zicVar) {
        ((fjg) this.a.c).b = zicVar;
    }

    @Override // defpackage.qcc
    public final void d() {
        Object obj = this.a.c;
    }

    @Override // defpackage.qcc
    public final int[] getSupportedTypes() {
        return new int[]{0};
    }
}
