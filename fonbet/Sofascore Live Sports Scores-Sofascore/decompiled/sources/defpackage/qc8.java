package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qc8 implements rkd, iki {
    public final ed8 a;
    public k55 b;

    public qc8(ed8 ed8Var) {
        this.a = ed8Var;
    }

    @Override // defpackage.rkd
    public final void a(k55 k55Var) {
        this.b = k55Var;
        this.a.b(this);
    }

    @Override // defpackage.iki
    public final void cancel() {
        this.b.d();
    }

    @Override // defpackage.rkd
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override // defpackage.rkd
    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // defpackage.rkd
    public final void onNext(Object obj) {
        this.a.onNext(obj);
    }

    @Override // defpackage.iki
    public final void request(long j) {
    }
}
