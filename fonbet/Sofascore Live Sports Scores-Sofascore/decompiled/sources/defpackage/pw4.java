package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pw4 implements c23 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pw4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.c23
    public final long a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qw4 qw4Var = (qw4) obj;
                long j = ((p5g) ((pw4) qw4Var.v).b).c;
                if (j != 16) {
                    return j;
                }
                h5g h5gVar = (h5g) tgj.x(qw4Var, n5g.a);
                if (h5gVar != null) {
                    long j2 = h5gVar.a;
                    if (j2 != 16) {
                        return j2;
                    }
                }
                return ((r13) tgj.x(qw4Var, lo3.a)).a;
            case 1:
                qw4 qw4Var2 = (qw4) obj;
                long j3 = ((q5g) ((pw4) qw4Var2.v).b).b;
                if (j3 != 16) {
                    return j3;
                }
                i5g i5gVar = (i5g) tgj.x(qw4Var2, o5g.a);
                if (i5gVar != null) {
                    long j4 = i5gVar.a;
                    if (j4 != 16) {
                        return j4;
                    }
                }
                long j5 = ((r13) tgj.x(qw4Var2, mo3.a)).a;
                return (((p23) tgj.x(qw4Var2, q23.a)).d() || ((double) hkg.e0(j5)) >= 0.5d) ? j5 : r13.d;
            case 2:
                return ((p5g) obj).c;
            default:
                return ((q5g) obj).b;
        }
    }
}
