package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class u<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f60232a;

    /* renamed from: b, reason: collision with root package name */
    private final K f60233b;

    /* renamed from: c, reason: collision with root package name */
    private final V f60234c;

    static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final WireFormat$FieldType f60235a;

        /* renamed from: b, reason: collision with root package name */
        public final K f60236b;

        /* renamed from: c, reason: collision with root package name */
        public final WireFormat$FieldType f60237c;

        /* renamed from: d, reason: collision with root package name */
        public final V f60238d;

        public a(WireFormat$FieldType wireFormat$FieldType, K k11, WireFormat$FieldType wireFormat$FieldType2, V v11) {
            this.f60235a = wireFormat$FieldType;
            this.f60236b = k11;
            this.f60237c = wireFormat$FieldType2;
            this.f60238d = v11;
        }
    }

    private u(WireFormat$FieldType wireFormat$FieldType, K k11, WireFormat$FieldType wireFormat$FieldType2, V v11) {
        this.f60232a = new a<>(wireFormat$FieldType, k11, wireFormat$FieldType2, v11);
        this.f60233b = k11;
        this.f60234c = v11;
    }

    static <K, V> int b(a<K, V> aVar, K k11, V v11) {
        return C5961l.d(aVar.f60235a, 1, k11) + C5961l.d(aVar.f60237c, 2, v11);
    }

    public static <K, V> u<K, V> d(WireFormat$FieldType wireFormat$FieldType, K k11, WireFormat$FieldType wireFormat$FieldType2, V v11) {
        return new u<>(wireFormat$FieldType, k11, wireFormat$FieldType2, v11);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k11, V v11) throws IOException {
        C5961l.C(codedOutputStream, aVar.f60235a, 1, k11);
        C5961l.C(codedOutputStream, aVar.f60237c, 2, v11);
    }

    public final int a(int i11, K k11, V v11) {
        return CodedOutputStream.computeTagSize(i11) + CodedOutputStream.computeLengthDelimitedFieldSize(b(this.f60232a, k11, v11));
    }

    final a<K, V> c() {
        return this.f60232a;
    }
}
