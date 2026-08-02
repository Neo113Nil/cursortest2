package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r0c implements ya3, k55, w0c {
    public final /* synthetic */ int a;
    public final Object b;
    public k55 c;

    public /* synthetic */ r0c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ya3
    public final void a(k55 k55Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (r55.f(this.c, k55Var)) {
                    this.c = k55Var;
                    ((w0c) obj).a(this);
                    break;
                }
                break;
            case 1:
                if (r55.f(this.c, k55Var)) {
                    this.c = k55Var;
                    ((w0c) obj).a(this);
                    break;
                }
                break;
            default:
                if (r55.f(this.c, k55Var)) {
                    this.c = k55Var;
                    ((zhh) obj).a(this);
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
                this.c.d();
                this.c = r55Var;
                break;
            case 1:
                this.c.d();
                break;
            default:
                this.c.d();
                this.c = r55Var;
                break;
        }
    }

    @Override // defpackage.ya3
    public final void onComplete() {
        int i = this.a;
        r55 r55Var = r55.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                this.c = r55Var;
                ((w0c) obj).onComplete();
                break;
            case 1:
                ((w0c) obj).onSuccess(Boolean.TRUE);
                break;
            default:
                this.c = r55Var;
                ((zhh) obj).onSuccess(Boolean.TRUE);
                break;
        }
    }

    @Override // defpackage.ya3
    public final void onError(Throwable th) {
        int i = this.a;
        r55 r55Var = r55.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                this.c = r55Var;
                ((w0c) obj).onError(th);
                break;
            case 1:
                ((w0c) obj).onError(th);
                break;
            default:
                this.c = r55Var;
                ((zhh) obj).onError(th);
                break;
        }
    }

    @Override // defpackage.w0c
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((w0c) obj2).onSuccess(Boolean.FALSE);
                break;
            default:
                this.c = r55.a;
                ((zhh) obj2).onSuccess(Boolean.FALSE);
                break;
        }
    }
}
