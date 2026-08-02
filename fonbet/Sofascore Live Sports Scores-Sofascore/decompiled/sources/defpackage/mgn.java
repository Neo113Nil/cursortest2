package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class mgn implements Callable {
    public final /* synthetic */ ddb a;
    public final /* synthetic */ sen b;
    public final /* synthetic */ long c;
    public final /* synthetic */ e7p d;
    public final /* synthetic */ ddb e;
    public final /* synthetic */ l1p f;

    public /* synthetic */ mgn(gl glVar, ddb ddbVar, sen senVar, long j, e7p e7pVar, ddb ddbVar2, l1p l1pVar) {
        this.a = ddbVar;
        this.b = senVar;
        this.c = j;
        this.d = e7pVar;
        this.e = ddbVar2;
        this.f = l1pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List list = (List) qha.S(this.a).h(new ArrayList());
        qen c = t6o.c(this.c, System.currentTimeMillis());
        sen senVar = this.b;
        senVar.b();
        ((uen) senVar.b).y(c);
        b2p S = qha.S(this.d);
        b2p b2pVar = !S.d() ? u1p.a : (b2p) S.g();
        b2p S2 = qha.S(this.e);
        q3p u = q3p.u(list);
        b2p S3 = qha.S(this.f);
        return new pkn(b2pVar, S2, u, !S3.d() ? u1p.a : (b2p) S3.g());
    }
}
