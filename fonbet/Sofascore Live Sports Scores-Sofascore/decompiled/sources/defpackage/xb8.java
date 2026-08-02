package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xb8 extends vb8 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb8(ed8 ed8Var, int i) {
        super(ed8Var);
        this.c = i;
    }

    @Override // defpackage.vb8
    public final void g(Object obj) {
        if (this.b.g()) {
        }
        if (obj == null) {
            f(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (get() != 0) {
            this.a.onNext(obj);
            wkn.J(this, 1L);
        } else {
            switch (this.c) {
                case 0:
                    break;
                default:
                    f(new qkc("create: could not emit value due to lack of requests"));
                    break;
            }
        }
    }

    private final void k() {
    }
}
