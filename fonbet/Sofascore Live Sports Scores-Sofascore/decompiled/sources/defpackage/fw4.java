package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw4 implements jw4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iw4 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ fw4(iw4 iw4Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = iw4Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.jw4
    public final ScheduledFuture a(t9d t9dVar) {
        int i = this.a;
        Runnable runnable = this.c;
        iw4 iw4Var = this.b;
        switch (i) {
            case 0:
                return iw4Var.b.scheduleAtFixedRate(new gw4(iw4Var, runnable, t9dVar, 0), this.d, this.e, this.f);
            default:
                return iw4Var.b.scheduleWithFixedDelay(new gw4(iw4Var, runnable, t9dVar, 2), this.d, this.e, this.f);
        }
    }
}
