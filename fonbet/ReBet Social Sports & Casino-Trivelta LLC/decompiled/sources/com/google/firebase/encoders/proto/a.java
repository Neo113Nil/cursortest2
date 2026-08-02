package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.d;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f37760a;

    /* renamed from: b, reason: collision with root package name */
    public d.a f37761b = d.a.DEFAULT;

    /* renamed from: com.google.firebase.encoders.proto.a$a, reason: collision with other inner class name */
    public static final class C0526a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f37762a;

        /* renamed from: b, reason: collision with root package name */
        public final d.a f37763b;

        public C0526a(int i10, d.a aVar) {
            this.f37762a = i10;
            this.f37763b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f37762a == dVar.tag() && this.f37763b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f37762a) + (this.f37763b.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.d
        public d.a intEncoding() {
            return this.f37763b;
        }

        @Override // com.google.firebase.encoders.proto.d
        public int tag() {
            return this.f37762a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f37762a + "intEncoding=" + this.f37763b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0526a(this.f37760a, this.f37761b);
    }

    public a c(int i10) {
        this.f37760a = i10;
        return this;
    }
}
