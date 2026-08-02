package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fkd implements rkd, tif {
    public final rkd a;
    public k55 b;
    public tif c;
    public boolean d;
    public final /* synthetic */ int e;
    public final Object f;

    public fkd(rkd rkdVar, Object obj, int i) {
        this.e = i;
        this.a = rkdVar;
        this.f = obj;
    }

    @Override // defpackage.rkd
    public final void a(k55 k55Var) {
        if (r55.f(this.b, k55Var)) {
            this.b = k55Var;
            if (k55Var instanceof tif) {
                this.c = (tif) k55Var;
            }
            this.a.a(this);
        }
    }

    @Override // defpackage.ohh
    public final void clear() {
        this.c.clear();
    }

    @Override // defpackage.k55
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.ohh
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.rkd
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override // defpackage.rkd
    public final void onError(Throwable th) {
        if (this.d) {
            hda.L(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.rkd
    public final void onNext(Object obj) {
        int i = this.e;
        rkd rkdVar = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                try {
                    if (((xmf) obj2).test(obj)) {
                        rkdVar.onNext(obj);
                        break;
                    }
                } catch (Throwable th) {
                    td4.w0(th);
                    this.b.d();
                    this.onError(th);
                    return;
                }
                break;
            default:
                if (!this.d) {
                    try {
                        Object apply = ((bt8) obj2).apply(obj);
                        rha.x(apply, "The mapper function returned a null value.");
                        rkdVar.onNext(apply);
                        break;
                    } catch (Throwable th2) {
                        td4.w0(th2);
                        this.b.d();
                        onError(th2);
                    }
                }
                break;
        }
    }

    @Override // defpackage.ohh
    public final Object poll() {
        Object poll;
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                break;
            default:
                Object poll2 = this.c.poll();
                if (poll2 == null) {
                    return null;
                }
                Object apply = ((bt8) obj).apply(poll2);
                rha.x(apply, "The mapper function returned a null value.");
                return apply;
        }
        do {
            poll = this.c.poll();
            if (poll != null) {
            }
            return poll;
        } while (!((xmf) obj).test(poll));
        return poll;
    }
}
