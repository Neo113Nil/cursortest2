package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u1p extends b2p {
    public static final u1p a = new u1p();

    private u1p() {
    }

    @Override // defpackage.b2p
    public final boolean d() {
        return false;
    }

    @Override // defpackage.b2p
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.b2p
    public final Object g() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.b2p
    public final int hashCode() {
        return 2040732332;
    }

    @Override // defpackage.b2p
    public final Object i() {
        return null;
    }

    @Override // defpackage.b2p
    public final b2p j(x1p x1pVar) {
        return a;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // defpackage.b2p
    public final Object h(Serializable serializable) {
        return serializable;
    }
}
