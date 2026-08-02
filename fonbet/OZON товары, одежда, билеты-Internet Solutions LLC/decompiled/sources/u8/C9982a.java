package u8;

import java.lang.annotation.Annotation;
import u8.d;

/* renamed from: u8.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9982a {

    /* renamed from: a, reason: collision with root package name */
    private int f100367a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f100368b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u8.a$a, reason: collision with other inner class name */
    static final class C2200a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f100369a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f100370b;

        C2200a(int i11, d.a aVar) {
            this.f100369a = i11;
            this.f100370b = aVar;
        }

        public final d.a a() {
            return this.f100370b;
        }

        @Override // java.lang.annotation.Annotation
        public final Class<? extends Annotation> annotationType() {
            return d.class;
        }

        public final int b() {
            return this.f100369a;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            C2200a c2200a = (C2200a) ((d) obj);
            return this.f100369a == c2200a.f100369a && this.f100370b.equals(c2200a.f100370b);
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return (14552422 ^ this.f100369a) + (this.f100370b.hashCode() ^ 2041407134);
        }

        @Override // java.lang.annotation.Annotation
        public final String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f100369a + "intEncoding=" + this.f100370b + ')';
        }
    }

    public static C9982a b() {
        C9982a c9982a = new C9982a();
        c9982a.f100368b = d.a.DEFAULT;
        return c9982a;
    }

    public final d a() {
        return new C2200a(this.f100367a, this.f100368b);
    }

    public final void c(int i11) {
        this.f100367a = i11;
    }
}
