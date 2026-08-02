package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u0c extends g0c implements hrg {
    public final Object a;

    public u0c(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.g0c
    public final void c(w0c w0cVar) {
        w0cVar.a(em5.a);
        w0cVar.onSuccess(this.a);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }
}
