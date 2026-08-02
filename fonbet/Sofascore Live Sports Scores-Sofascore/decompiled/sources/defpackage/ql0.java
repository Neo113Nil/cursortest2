package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ql0 implements iff {
    public final int d;

    public ql0(int i) {
        this.d = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return iff.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iff)) {
            return false;
        }
        iff iffVar = (iff) obj;
        return this.d == iffVar.tag() && gff.a.equals(iffVar.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.d ^ 14552422) + (gff.a.hashCode() ^ 2041407134);
    }

    @Override // defpackage.iff
    public final gff intEncoding() {
        return gff.a;
    }

    @Override // defpackage.iff
    public final int tag() {
        return this.d;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.d + "intEncoding=" + gff.a + ')';
    }
}
