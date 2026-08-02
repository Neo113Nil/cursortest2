package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rw8 implements Cloneable {
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rw8 clone() {
        try {
            return (rw8) super.clone();
        } catch (CloneNotSupportedException e) {
            is8.h(e);
            return null;
        }
    }

    public final boolean b(Object obj) {
        return obj instanceof rw8;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rw8) && b(obj);
    }

    public final int hashCode() {
        return ldd.a.hashCode();
    }
}
