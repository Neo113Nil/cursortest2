package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yb8 extends vb8 {
    @Override // defpackage.vb8
    public final void g(Object obj) {
        long j;
        if (this.b.g()) {
            return;
        }
        if (obj == null) {
            f(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        this.a.onNext(obj);
        do {
            j = get();
            if (j == 0) {
                return;
            }
        } while (!compareAndSet(j, j - 1));
    }
}
