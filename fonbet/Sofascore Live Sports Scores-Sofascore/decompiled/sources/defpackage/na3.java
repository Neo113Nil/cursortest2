package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class na3 extends AtomicReference implements ya3, k55, w0c, rkd, zhh {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public na3(w0c w0cVar) {
        this.a = 4;
        this.c = w0cVar;
        this.b = new cm5(3);
    }

    @Override // defpackage.ya3
    public final void a(k55 k55Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (r55.e(this, k55Var)) {
                    ((ya3) obj).a(this);
                    break;
                }
                break;
            case 1:
                r55.c(this, k55Var);
                break;
            case 2:
                r55.c(this, k55Var);
                break;
            case 3:
                if (r55.e(this, k55Var)) {
                    ((w0c) obj).a(this);
                    break;
                }
                break;
            case 4:
                r55.e(this, k55Var);
                break;
            case 5:
                if (r55.e(this, k55Var)) {
                    ((w0c) obj).a(this);
                    break;
                }
                break;
            default:
                if (r55.e(this, k55Var)) {
                    ((zhh) obj).a(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.k55
    public final void d() {
        switch (this.a) {
            case 0:
                r55.a(this);
                break;
            case 1:
                r55.a(this);
                break;
            case 2:
                r55.a(this);
                break;
            case 3:
                r55.a(this);
                break;
            case 4:
                r55.a(this);
                r55.a((cm5) this.b);
                break;
            case 5:
                r55.a(this);
                break;
            default:
                r55.a(this);
                break;
        }
    }

    @Override // defpackage.ya3
    public void onComplete() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ma3) obj).c(new z41(8, this, (ya3) obj2));
                break;
            case 1:
                ((ya3) obj2).onComplete();
                break;
            case 2:
                ((rkd) obj2).onComplete();
                break;
            case 3:
                ((w0c) obj2).onComplete();
                break;
            case 4:
                ((w0c) obj).onComplete();
                break;
            default:
                k55 k55Var = (k55) get();
                if (k55Var != r55.a && compareAndSet(k55Var, null)) {
                    ((g0c) obj).b(new wj9(16, (w0c) obj2, this));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ya3
    public final void onError(Throwable th) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ya3) obj2).onError(th);
                break;
            case 1:
                ((ya3) obj2).onError(th);
                break;
            case 2:
                ((rkd) obj2).onError(th);
                break;
            case 3:
                w0c w0cVar = (w0c) obj2;
                try {
                    Object apply = ((bt8) obj).apply(th);
                    rha.x(apply, "The resumeFunction returned a null MaybeSource");
                    g0c g0cVar = (g0c) apply;
                    r55.c(this, null);
                    g0cVar.b(new wj9(15, w0cVar, this));
                    break;
                } catch (Throwable th2) {
                    td4.w0(th2);
                    w0cVar.onError(new yf3(th, th2));
                    return;
                }
            case 4:
                ((w0c) obj).onError(th);
                break;
            case 5:
                ((w0c) obj2).onError(th);
                break;
            default:
                zhh zhhVar = (zhh) obj2;
                try {
                    ((thh) ((v35) obj).b).a(new k1d(28, this, zhhVar));
                    break;
                } catch (Throwable th3) {
                    td4.w0(th3);
                    zhhVar.onError(new yf3(th, th3));
                }
        }
    }

    @Override // defpackage.rkd
    public void onNext(Object obj) {
        ((rkd) this.b).onNext(obj);
    }

    @Override // defpackage.w0c
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 1:
                try {
                    Object apply = ((bt8) obj2).apply(obj);
                    rha.x(apply, "The mapper returned a null CompletableSource");
                    ma3 ma3Var = (ma3) apply;
                    if (!r55.b((k55) get())) {
                        ma3Var.c(this);
                        break;
                    }
                } catch (Throwable th) {
                    td4.w0(th);
                    onError(th);
                    return;
                }
                break;
            case 2:
                try {
                    ((tz9) ((is8) obj2).apply(obj)).N(this);
                    break;
                } catch (Throwable th2) {
                    td4.w0(th2);
                    ((rkd) obj3).onError(th2);
                    return;
                }
            case 3:
                ((w0c) obj3).onSuccess(obj);
                break;
            case 4:
                ((w0c) obj2).onSuccess(obj);
                break;
            case 5:
                ((w0c) obj3).onSuccess(obj);
                break;
            default:
                ((zhh) obj3).onSuccess(obj);
                break;
        }
    }

    public /* synthetic */ na3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
