package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sc8 extends zn1 {
    public final hpo f;

    public sc8(ed8 ed8Var, hpo hpoVar) {
        super(ed8Var);
        this.f = hpoVar;
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (this.d) {
            return;
        }
        int i = this.e;
        ed8 ed8Var = this.a;
        if (i != 0) {
            ed8Var.onNext(null);
            return;
        }
        try {
            Object apply = this.f.apply(obj);
            rha.x(apply, "The mapper function returned a null value.");
            ed8Var.onNext(apply);
        } catch (Throwable th) {
            td4.w0(th);
            this.b.cancel();
            onError(th);
        }
    }

    @Override // defpackage.ohh
    public final Object poll() {
        Object poll = this.c.poll();
        if (poll == null) {
            return null;
        }
        Object apply = this.f.apply(poll);
        rha.x(apply, "The mapper function returned a null value.");
        return apply;
    }
}
