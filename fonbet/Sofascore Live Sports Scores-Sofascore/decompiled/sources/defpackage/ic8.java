package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ic8 extends zn1 implements ai3 {
    public final k3f f;

    public ic8(ed8 ed8Var, k3f k3fVar) {
        super(ed8Var);
        this.f = k3fVar;
    }

    @Override // defpackage.ai3
    public final boolean e(Object obj) {
        if (this.d) {
            return false;
        }
        int i = this.e;
        ed8 ed8Var = this.a;
        if (i != 0) {
            ed8Var.onNext(null);
            return true;
        }
        try {
            boolean test = this.f.test(obj);
            if (test) {
                ed8Var.onNext(obj);
            }
            return test;
        } catch (Throwable th) {
            td4.w0(th);
            this.b.cancel();
            this.onError(th);
            return true;
        }
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (e(obj)) {
            return;
        }
        this.b.request(1L);
    }

    @Override // defpackage.ohh
    public final Object poll() {
        ajf ajfVar = this.c;
        while (true) {
            Object poll = ajfVar.poll();
            if (poll == null) {
                return null;
            }
            if (this.f.test(poll)) {
                return poll;
            }
            if (this.e == 2) {
                ajfVar.request(1L);
            }
        }
    }
}
