package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class yn1 implements ai3, ajf {
    public final ai3 a;
    public iki b;
    public ajf c;
    public boolean d;
    public int e;

    public yn1(ai3 ai3Var) {
        this.a = ai3Var;
    }

    public final void a(Throwable th) {
        td4.w0(th);
        this.b.cancel();
        onError(th);
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.d(this.b, ikiVar)) {
            this.b = ikiVar;
            if (ikiVar instanceof ajf) {
                this.c = (ajf) ikiVar;
            }
            this.a.b(this);
        }
    }

    @Override // defpackage.zif
    public int c(int i) {
        ajf ajfVar = this.c;
        if (ajfVar == null || (i & 4) != 0) {
            return 0;
        }
        int c = ajfVar.c(i);
        if (c == 0) {
            return c;
        }
        this.e = c;
        return c;
    }

    @Override // defpackage.iki
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.ohh
    public final void clear() {
        this.c.clear();
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.ohh
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.ed8
    public void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override // defpackage.ed8
    public void onError(Throwable th) {
        if (this.d) {
            hda.L(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.iki
    public final void request(long j) {
        this.b.request(j);
    }
}
