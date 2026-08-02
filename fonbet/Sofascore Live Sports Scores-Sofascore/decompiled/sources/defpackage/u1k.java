package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u1k extends x8a {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ v1k g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1k(v1k v1kVar, Callable callable) {
        super(0);
        this.g = v1kVar;
        callable.getClass();
        this.h = callable;
    }

    @Override // defpackage.x8a
    public final void a(Throwable th) {
        int i = this.f;
        v1k v1kVar = this.g;
        switch (i) {
            case 0:
                v1kVar.m(th);
                break;
            default:
                v1kVar.m(th);
                break;
        }
    }

    @Override // defpackage.x8a
    public final void b(Object obj) {
        int i = this.f;
        v1k v1kVar = this.g;
        switch (i) {
            case 0:
                v1kVar.n((ddb) obj);
                break;
            default:
                v1kVar.l(obj);
                break;
        }
    }

    @Override // defpackage.x8a
    public final boolean g() {
        int i = this.f;
        v1k v1kVar = this.g;
        switch (i) {
        }
        return v1kVar.isDone();
    }

    @Override // defpackage.x8a
    public final Object h() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                cj0 cj0Var = (cj0) obj;
                ddb call = cj0Var.call();
                z1a.x(call, cj0Var, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
                return call;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.x8a
    public final String i() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                return ((cj0) obj).toString();
            default:
                return ((Callable) obj).toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1k(v1k v1kVar, cj0 cj0Var) {
        super(0);
        this.g = v1kVar;
        this.h = cj0Var;
    }
}
