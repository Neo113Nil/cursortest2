package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ec8 implements ed8, k55 {
    public final w0c a;
    public iki b;
    public long c;
    public boolean d;

    public ec8(w0c w0cVar) {
        this.a = w0cVar;
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.d(this.b, ikiVar)) {
            this.b = ikiVar;
            this.a.a(this);
            ikiVar.request(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.k55
    public final void d() {
        this.b.cancel();
        this.b = pki.a;
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        this.b = pki.a;
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        if (this.d) {
            hda.L(th);
            return;
        }
        this.d = true;
        this.b = pki.a;
        this.a.onError(th);
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (this.d) {
            return;
        }
        long j = this.c;
        if (j != 0) {
            this.c = j + 1;
            return;
        }
        this.d = true;
        this.b.cancel();
        this.b = pki.a;
        this.a.onSuccess(obj);
    }
}
