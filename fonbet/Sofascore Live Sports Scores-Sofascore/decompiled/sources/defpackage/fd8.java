package defpackage;

import java.util.Collection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fd8 extends dv4 implements ed8, iki {
    public iki c;

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
        d(this.b);
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        this.b = null;
        this.a.onError(th);
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        Collection collection = (Collection) this.b;
        if (collection != null) {
            collection.add(obj);
        }
    }
}
