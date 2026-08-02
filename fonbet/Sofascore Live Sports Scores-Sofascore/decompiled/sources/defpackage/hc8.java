package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hc8 extends yn1 {
    public final /* synthetic */ int f;
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc8(ai3 ai3Var, Object obj, int i) {
        super(ai3Var);
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ai3
    public final boolean e(Object obj) {
        int i = this.f;
        ai3 ai3Var = this.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                if (!this.d) {
                    if (this.e != 0) {
                        break;
                    } else {
                        try {
                            if (((k3f) obj2).test(obj) && ai3Var.e(obj)) {
                            }
                        } catch (Throwable th) {
                            this.a(th);
                            return true;
                        }
                    }
                }
                break;
            default:
                if (this.d) {
                    break;
                } else {
                    try {
                        Object apply = ((hpo) obj2).apply(obj);
                        rha.x(apply, "The mapper function returned a null value.");
                        break;
                    } catch (Throwable th2) {
                        a(th2);
                        return true;
                    }
                }
        }
        return true;
    }

    @Override // defpackage.ed8
    public final void onNext(Object obj) {
        switch (this.f) {
            case 0:
                if (!e(obj)) {
                    this.b.request(1L);
                    break;
                }
                break;
            default:
                if (!this.d) {
                    int i = this.e;
                    ai3 ai3Var = this.a;
                    if (i != 0) {
                        ai3Var.onNext(null);
                        break;
                    } else {
                        try {
                            Object apply = ((hpo) this.g).apply(obj);
                            rha.x(apply, "The mapper function returned a null value.");
                            ai3Var.onNext(apply);
                            break;
                        } catch (Throwable th) {
                            a(th);
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.ohh
    public final Object poll() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ajf ajfVar = this.c;
                k3f k3fVar = (k3f) obj;
                while (true) {
                    Object poll = ajfVar.poll();
                    if (poll == null) {
                        return null;
                    }
                    if (k3fVar.test(poll)) {
                        return poll;
                    }
                    if (this.e == 2) {
                        ajfVar.request(1L);
                    }
                }
            default:
                Object poll2 = this.c.poll();
                if (poll2 == null) {
                    return null;
                }
                Object apply = ((hpo) obj).apply(poll2);
                rha.x(apply, "The mapper function returned a null value.");
                return apply;
        }
    }
}
