package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b6f extends kvd {
    public final Object a;

    public b6f(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.kvd
    public final Object d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b6f) {
            return this.a.equals(((b6f) obj).a);
        }
        return false;
    }

    @Override // defpackage.kvd
    public final boolean g() {
        return true;
    }

    @Override // defpackage.kvd
    public final Object h(ewo ewoVar) {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    @Override // defpackage.kvd
    public final Object i() {
        return this.a;
    }

    public final String toString() {
        return mz1.n(new StringBuilder("Optional.of("), this.a, ")");
    }
}
