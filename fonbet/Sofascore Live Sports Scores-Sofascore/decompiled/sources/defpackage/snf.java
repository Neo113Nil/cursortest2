package defpackage;

import java.io.IOException;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class snf implements db2 {
    public final n4a b;
    public final CoroutineContext c;
    public gz2 d;
    public final w52 e;
    public final aea f;
    public final CoroutineContext g;

    public snf(n4a n4aVar, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.b = n4aVar;
        this.c = coroutineContext;
        this.e = new w52();
        aea aeaVar = new aea((yda) coroutineContext.get(uic.g));
        this.f = aeaVar;
        this.g = coroutineContext.plus(aeaVar).plus(new gu3("RawSourceChannel"));
    }

    @Override // defpackage.db2
    public final void a(Throwable th) {
        if (this.d != null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        bea.o(this.f, message, th);
        this.b.close();
        String message2 = th.getMessage();
        this.d = new gz2(new IOException(message2 != null ? message2 : "Channel was cancelled", th));
    }

    @Override // defpackage.db2
    public final Throwable b() {
        gz2 gz2Var = this.d;
        if (gz2Var != null) {
            return gz2Var.a(fz2.b);
        }
        return null;
    }

    @Override // defpackage.db2
    public final w52 f() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.db2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, sq3 sq3Var) {
        rnf rnfVar;
        int i2;
        if (sq3Var instanceof rnf) {
            rnfVar = (rnf) sq3Var;
            int i3 = rnfVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rnfVar.u = i3 - Integer.MIN_VALUE;
                Object obj = rnfVar.s;
                lu3 lu3Var = lu3.a;
                i2 = rnfVar.u;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (this.d != null) {
                        return Boolean.TRUE;
                    }
                    ppa ppaVar = new ppa(this, i, rq3Var, 29);
                    rnfVar.r = i;
                    rnfVar.u = 1;
                    if (xw3.R(this.g, ppaVar, rnfVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = rnfVar.r;
                    y6a.M(obj);
                }
                return Boolean.valueOf(this.e.c >= ((long) i));
            }
        }
        rnfVar = new rnf(this, sq3Var);
        Object obj2 = rnfVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = rnfVar.u;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return Boolean.valueOf(this.e.c >= ((long) i));
    }

    @Override // defpackage.db2
    public final boolean h() {
        return this.d != null && this.e.w();
    }
}
