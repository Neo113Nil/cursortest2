package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wof extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ bpf t;
    public final /* synthetic */ ot9 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wof(bpf bpfVar, ot9 ot9Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = bpfVar;
        this.u = ot9Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ot9 ot9Var = this.u;
        bpf bpfVar = this.t;
        switch (i) {
            case 0:
                return new wof(bpfVar, ot9Var, rq3Var, 0);
            default:
                return new wof(bpfVar, ot9Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((wof) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        zid zidVar;
        int i = this.r;
        ot9 ot9Var = this.u;
        bpf bpfVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = bpfVar.b(ot9Var, 0, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                xt9 xt9Var = (xt9) obj;
                if ((xt9Var instanceof gq5) && (zidVar = bpfVar.d) != null) {
                    Throwable th = ((gq5) xt9Var).c;
                    if (zidVar.b <= 6) {
                        StringWriter stringWriter = new StringWriter();
                        th.printStackTrace(new PrintWriter(stringWriter));
                        stringWriter.toString();
                    }
                }
                return obj;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object b = bpfVar.b(ot9Var, 1, this);
                    return b == lu3Var2 ? lu3Var2 : b;
                }
                if (i3 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
