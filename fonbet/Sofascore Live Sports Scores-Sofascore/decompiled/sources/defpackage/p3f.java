package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p3f implements m3f, Serializable {
    public final o3f a;

    public p3f(o3f o3fVar) {
        this.a = o3fVar;
    }

    @Override // defpackage.m3f
    public final boolean apply(Object obj) {
        return !Object.class.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p3f) {
            return this.a.equals(((p3f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.not(" + this.a + ")";
    }
}
