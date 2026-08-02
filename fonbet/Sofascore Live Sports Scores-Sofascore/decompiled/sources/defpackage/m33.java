package defpackage;

import com.google.android.gms.internal.measurement.zzwx;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m33 extends x8a {
    public final Executor f;
    public final /* synthetic */ n33 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ n33 i;
    public final Object j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m33(n33 n33Var, Callable callable) {
        this(n33Var, f35.a);
        this.h = 1;
        this.i = n33Var;
        this.j = callable;
    }

    @Override // defpackage.x8a
    public final void a(Throwable th) {
        n33 n33Var = this.g;
        n33Var.n = null;
        if (th instanceof ExecutionException) {
            n33Var.m(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            n33Var.cancel(false);
        } else {
            n33Var.m(th);
        }
    }

    @Override // defpackage.x8a
    public final void b(Object obj) {
        this.g.n = null;
        int i = this.h;
        n33 n33Var = this.i;
        switch (i) {
            case 0:
                n33Var.n((ddb) obj);
                break;
            default:
                n33Var.l(obj);
                break;
        }
    }

    @Override // defpackage.x8a
    public final boolean g() {
        return this.g.isDone();
    }

    @Override // defpackage.x8a
    public final Object h() {
        int i = this.h;
        Object obj = this.j;
        switch (i) {
            case 0:
                return ((zzwx) obj).call();
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.x8a
    public final String i() {
        int i = this.h;
        Object obj = this.j;
        switch (i) {
            case 0:
                return ((zzwx) obj).toString();
            default:
                return ((Callable) obj).toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m33(n33 n33Var, zzwx zzwxVar, Executor executor) {
        this(n33Var, executor);
        this.h = 0;
        this.i = n33Var;
        this.j = zzwxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m33(n33 n33Var, Executor executor) {
        super(0);
        this.g = n33Var;
        executor.getClass();
        this.f = executor;
    }
}
