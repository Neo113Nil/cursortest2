package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class lw3 implements Callable {
    public final /* synthetic */ nw3 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ lw3(nw3 nw3Var, long j, String str) {
        this.a = nw3Var;
        this.b = j;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        nw3 nw3Var = this.a;
        return ((xx3) nw3Var.o.c).g(new jd(nw3Var, this.b, this.c));
    }
}
