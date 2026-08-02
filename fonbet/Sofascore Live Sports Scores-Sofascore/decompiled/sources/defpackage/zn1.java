package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class zn1 implements ed8, ajf {
    public final ed8 a;
    public iki b;
    public ajf c;
    public boolean d;
    public int e;

    public zn1(ed8 ed8Var) {
        this.a = ed8Var;
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
