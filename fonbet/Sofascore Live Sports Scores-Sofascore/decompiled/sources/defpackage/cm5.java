package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cm5 extends AtomicReference implements ya3, k55, w0c {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm5(Object obj) {
        super(obj);
        this.a = 2;
    }

    @Override // defpackage.ya3
    public void a(k55 k55Var) {
        switch (this.a) {
            case 0:
                r55.e(this, k55Var);
                break;
            default:
                r55.e(this, k55Var);
                break;
        }
    }

    @Override // defpackage.k55
    public final void d() {
        Object andSet;
        switch (this.a) {
            case 0:
                r55.a(this);
                break;
            case 1:
                r55.a(this);
                break;
            case 2:
                if (get() != null && (andSet = getAndSet(null)) != null) {
                    ((Runnable) andSet).run();
                    break;
                }
                break;
            default:
                r55.a(this);
                break;
        }
    }

    public boolean g() {
        switch (this.a) {
            case 2:
                return get() == null;
            default:
                return r55.b((k55) get());
        }
    }

    @Override // defpackage.ya3
    public void onComplete() {
        int i = this.a;
        r55 r55Var = r55.a;
        switch (i) {
            case 0:
                lazySet(r55Var);
                break;
            default:
                lazySet(r55Var);
                break;
        }
    }

    @Override // defpackage.ya3
    public void onError(Throwable th) {
        int i = this.a;
        r55 r55Var = r55.a;
        switch (i) {
            case 0:
                lazySet(r55Var);
                hda.L(new bqd(th));
                break;
            default:
                lazySet(r55Var);
                try {
                    hda.L(new bqd(th));
                    break;
                } catch (Throwable th2) {
                    td4.w0(th2);
                    hda.L(new yf3(th, th2));
                }
        }
    }

    @Override // defpackage.w0c
    public void onSuccess(Object obj) {
        lazySet(r55.a);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 2:
                return "RunnableDisposable(disposed=" + g() + ", " + get() + ")";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ cm5(int i) {
        this.a = i;
    }
}
