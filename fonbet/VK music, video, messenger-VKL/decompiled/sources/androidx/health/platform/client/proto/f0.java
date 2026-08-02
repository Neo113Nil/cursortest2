package androidx.health.platform.client.proto;

import java.io.IOException;

/* compiled from: MapEntryLite.java */
/* loaded from: classes12.dex */
public final class f0<K, V> {
    public final a<K, V> a;
    public final V b;

    /* compiled from: MapEntryLite.java */
    public static class a<K, V> {
        public final WireFormat$FieldType a;
        public final WireFormat$FieldType b;
        public final V c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, Object obj) {
            this.a = wireFormat$FieldType;
            this.b = wireFormat$FieldType2;
            this.c = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, Object obj) {
        this.a = new a<>(wireFormat$FieldType, wireFormat$FieldType2, obj);
        this.b = obj;
    }

    public static <K, V> int a(a<K, V> aVar, K k, V v) {
        return y.b(aVar.b, 2, v) + y.b(aVar.a, 1, k);
    }

    public static <K, V> void b(CodedOutputStream codedOutputStream, a<K, V> aVar, K k, V v) throws IOException {
        y.k(codedOutputStream, aVar.a, 1, k);
        y.k(codedOutputStream, aVar.b, 2, v);
    }
}
