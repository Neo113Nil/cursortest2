package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bc8 extends zn1 {
    @Override // defpackage.zn1, defpackage.ed8
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override // defpackage.zn1, defpackage.ed8
    public final void onError(Throwable th) {
        if (this.d) {
            hda.L(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
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
            ed8Var.onNext(obj);
        } catch (Throwable th) {
            td4.w0(th);
            this.b.cancel();
            onError(th);
        }
    }

    @Override // defpackage.ohh
    public final Object poll() {
        try {
            Object poll = this.c.poll();
            if (poll == null) {
                return poll;
            }
            try {
                return poll;
            } catch (Throwable th) {
                td4.w0(th);
                ae6 ae6Var = be6.a;
                if (th instanceof Exception) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            td4.w0(th2);
            ae6 ae6Var2 = be6.a;
            if (th2 instanceof Exception) {
                throw th2;
            }
            throw th2;
        }
    }
}
