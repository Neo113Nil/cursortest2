package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p0 extends kvd {
    public static final p0 a = new p0();

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.kvd
    public final Object d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.kvd
    public final boolean g() {
        return false;
    }

    @Override // defpackage.kvd
    public final Object h(ewo ewoVar) {
        return ewoVar.get();
    }

    public final int hashCode() {
        return 2040732332;
    }

    @Override // defpackage.kvd
    public final Object i() {
        return null;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
