package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class za3 implements ya3, k55, w0c {
    public final /* synthetic */ int a;
    public k55 b;
    public final Object c;
    public final Object d;

    public za3(ab3 ab3Var, ya3 ya3Var) {
        this.a = 0;
        this.d = ab3Var;
        this.c = ya3Var;
    }

    @Override // defpackage.ya3
    public final void a(k55 k55Var) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ya3 ya3Var = (ya3) obj;
                if (r55.f(this.b, k55Var)) {
                    this.b = k55Var;
                    ya3Var.a(this);
                    break;
                }
                break;
            case 1:
                if (r55.f(this.b, k55Var)) {
                    this.b = k55Var;
                    ((w0c) obj).a(this);
                    break;
                }
                break;
            default:
                w0c w0cVar = (w0c) obj;
                if (r55.f(this.b, k55Var)) {
                    this.b = k55Var;
                    w0cVar.a(this);
                    break;
                }
                break;
        }
    }

    public void b(Throwable th) {
        try {
            ((x0c) this.d).c.accept(th);
        } catch (Throwable th2) {
            td4.w0(th2);
            th = new yf3(th, th2);
        }
        this.b = r55.a;
        ((w0c) this.c).onError(th);
    }

    @Override // defpackage.k55
    public final void d() {
        int i = this.a;
        r55 r55Var = r55.a;
        switch (i) {
            case 0:
                this.b.d();
                break;
            case 1:
                k55 k55Var = this.b;
                this.b = r55Var;
                k55Var.d();
                break;
            default:
                this.b.d();
                this.b = r55Var;
                break;
        }
    }

    @Override // defpackage.ya3
    public final void onComplete() {
        int i = this.a;
        r55 r55Var = r55.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ya3 ya3Var = (ya3) obj;
                ab3 ab3Var = (ab3) this.d;
                if (this.b != r55Var) {
                    try {
                        ab3Var.c.run();
                        ya3Var.onComplete();
                        break;
                    } catch (Throwable th) {
                        td4.w0(th);
                        ya3Var.onError(th);
                        return;
                    }
                }
                break;
            case 1:
                ((w0c) obj).onComplete();
                break;
            default:
                if (this.b != r55Var) {
                    this.b = r55Var;
                    ((w0c) obj).onComplete();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ya3
    public final void onError(Throwable th) {
        int i = this.a;
        Object obj = this.c;
        r55 r55Var = r55.a;
        switch (i) {
            case 0:
                ab3 ab3Var = (ab3) this.d;
                if (this.b != r55Var) {
                    try {
                        ab3Var.b.accept(th);
                    } catch (Throwable th2) {
                        td4.w0(th2);
                        th = new yf3(th, th2);
                    }
                    ((ya3) obj).onError(th);
                    break;
                } else {
                    hda.L(th);
                    break;
                }
            case 1:
                ((w0c) obj).onError(th);
                break;
            default:
                if (this.b != r55Var) {
                    b(th);
                    break;
                } else {
                    hda.L(th);
                    break;
                }
        }
    }

    @Override // defpackage.w0c
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 1:
                w0c w0cVar = (w0c) obj2;
                try {
                    Object apply = ((bt8) obj3).apply(obj);
                    rha.x(apply, "The mapper returned a null item");
                    w0cVar.onSuccess(apply);
                    break;
                } catch (Throwable th) {
                    td4.w0(th);
                    w0cVar.onError(th);
                    return;
                }
            default:
                k55 k55Var = this.b;
                r55 r55Var = r55.a;
                if (k55Var != r55Var) {
                    try {
                        ((x0c) obj3).b.accept(obj);
                        this.b = r55Var;
                        ((w0c) obj2).onSuccess(obj);
                        break;
                    } catch (Throwable th2) {
                        td4.w0(th2);
                        b(th2);
                    }
                }
                break;
        }
    }

    public /* synthetic */ za3(w0c w0cVar, Object obj, int i) {
        this.a = i;
        this.c = w0cVar;
        this.d = obj;
    }
}
