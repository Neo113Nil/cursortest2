package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* compiled from: AtProtobuf.java */
/* loaded from: classes13.dex */
public final class a {
    public int a;
    public Protobuf.IntEncoding b;

    /* compiled from: AtProtobuf.java */
    /* renamed from: com.google.firebase.encoders.proto.a$a, reason: collision with other inner class name */
    public static final class C0136a implements Protobuf {
        public final int d;
        public final Protobuf.IntEncoding e;

        public C0136a(int i, Protobuf.IntEncoding intEncoding) {
            this.d = i;
            this.e = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public final Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            C0136a c0136a = (C0136a) ((Protobuf) obj);
            return this.d == c0136a.d && this.e.equals(c0136a.e);
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return (14552422 ^ this.d) + (this.e.hashCode() ^ 2041407134);
        }

        @Override // java.lang.annotation.Annotation
        public final String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.d + "intEncoding=" + this.e + ')';
        }
    }

    public static a b() {
        a aVar = new a();
        aVar.b = Protobuf.IntEncoding.DEFAULT;
        return aVar;
    }

    public final C0136a a() {
        return new C0136a(this.a, this.b);
    }
}
