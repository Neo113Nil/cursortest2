package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cc8 extends dv4 implements ed8 {
    public iki c;
    public long d;
    public boolean e;

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.d(this.c, ikiVar)) {
            this.c = ikiVar;
            this.a.b(this);
            ikiVar.request(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.iki
    public final void cancel() {
        set(4);
        this.b = null;
        this.c.cancel();
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.onComplete();
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        if (this.e) {
            hda.L(th);
        } else {
            this.e = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (this.e) {
            return;
        }
        long j = this.d;
        if (j != 0) {
            this.d = j + 1;
            return;
        }
        this.e = true;
        this.c.cancel();
        d(obj);
    }
}
