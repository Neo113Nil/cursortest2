package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zka extends AtomicReference implements ed8, iki, k55 {
    public final kt4 a;

    public zka(kt4 kt4Var) {
        this.a = kt4Var;
    }

    @Override // defpackage.ed8
    public final void b(iki ikiVar) {
        if (pki.b(this, ikiVar)) {
            try {
                rc8.a.accept(this);
            } catch (Throwable th) {
                td4.w0(th);
                ikiVar.cancel();
                onError(th);
            }
        }
    }

    @Override // defpackage.iki
    public final void cancel() {
        pki.a(this);
    }

    @Override // defpackage.k55
    public final void d() {
        pki.a(this);
    }

    @Override // defpackage.ed8
    public final void onComplete() {
        Object obj = get();
        pki pkiVar = pki.a;
        if (obj != pkiVar) {
            lazySet(pkiVar);
        }
    }

    @Override // defpackage.ed8
    public final void onError(Throwable th) {
        Object obj = get();
        pki pkiVar = pki.a;
        if (obj == pkiVar) {
            hda.L(th);
            return;
        }
        lazySet(pkiVar);
        try {
            hda.L(new bqd(th));
        } catch (Throwable th2) {
            td4.w0(th2);
            hda.L(new yf3(th, th2));
        }
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        if (get() == pki.a) {
            return;
        }
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            td4.w0(th);
            ((iki) get()).cancel();
            onError(th);
        }
    }

    @Override // defpackage.iki
    public final void request(long j) {
        ((iki) get()).request(j);
    }
}
