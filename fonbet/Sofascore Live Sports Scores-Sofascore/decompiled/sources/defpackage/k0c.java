package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k0c implements w0c, k55, zhh {
    public final /* synthetic */ int a;
    public final w0c b;
    public final k3f c;
    public k55 d;

    public /* synthetic */ k0c(w0c w0cVar, k3f k3fVar, int i) {
        this.a = i;
        this.b = w0cVar;
        this.c = k3fVar;
    }

    @Override // defpackage.w0c
    public final void a(k55 k55Var) {
        int i = this.a;
        w0c w0cVar = this.b;
        switch (i) {
            case 0:
                if (r55.f(this.d, k55Var)) {
                    this.d = k55Var;
                    w0cVar.a(this);
                    break;
                }
                break;
            default:
                if (r55.f(this.d, k55Var)) {
                    this.d = k55Var;
                    w0cVar.a(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.k55
    public final void d() {
        int i = this.a;
        r55 r55Var = r55.a;
        switch (i) {
            case 0:
                k55 k55Var = this.d;
                this.d = r55Var;
                k55Var.d();
                break;
            default:
                k55 k55Var2 = this.d;
                this.d = r55Var;
                k55Var2.d();
                break;
        }
    }

    @Override // defpackage.w0c
    public void onComplete() {
        this.b.onComplete();
    }

    @Override // defpackage.w0c
    public final void onError(Throwable th) {
        int i = this.a;
        w0c w0cVar = this.b;
        switch (i) {
            case 0:
                w0cVar.onError(th);
                break;
            default:
                w0cVar.onError(th);
                break;
        }
    }

    @Override // defpackage.w0c
    public final void onSuccess(Object obj) {
        int i = this.a;
        k3f k3fVar = this.c;
        w0c w0cVar = this.b;
        switch (i) {
            case 0:
                try {
                    if (!k3fVar.test(obj)) {
                        w0cVar.onComplete();
                        break;
                    } else {
                        w0cVar.onSuccess(obj);
                        break;
                    }
                } catch (Throwable th) {
                    td4.w0(th);
                    w0cVar.onError(th);
                    return;
                }
            default:
                try {
                    if (!k3fVar.test(obj)) {
                        w0cVar.onComplete();
                        break;
                    } else {
                        w0cVar.onSuccess(obj);
                        break;
                    }
                } catch (Throwable th2) {
                    td4.w0(th2);
                    w0cVar.onError(th2);
                }
        }
    }
}
