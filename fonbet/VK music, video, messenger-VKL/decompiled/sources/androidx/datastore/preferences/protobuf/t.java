package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.IOException;

/* compiled from: MapEntryLite.java */
/* loaded from: classes.dex */
public final class t<K, V> {
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
    public t(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, PreferencesProto$Value preferencesProto$Value) {
        this.a = new a<>(wireFormat$FieldType, wireFormat$FieldType2, preferencesProto$Value);
        this.b = preferencesProto$Value;
    }

    public static <K, V> int a(a<K, V> aVar, K k, V v) {
        return m.b(aVar.b, 2, v) + m.b(aVar.a, 1, k);
    }

    public static <K, V> void b(CodedOutputStream codedOutputStream, a<K, V> aVar, K k, V v) throws IOException {
        m.k(codedOutputStream, aVar.a, 1, k);
        m.k(codedOutputStream, aVar.b, 2, v);
    }
}
