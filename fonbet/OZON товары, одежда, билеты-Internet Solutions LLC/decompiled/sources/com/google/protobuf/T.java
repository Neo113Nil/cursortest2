package com.google.protobuf;

import com.google.protobuf.u;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
interface T {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ASCENDING;
        public static final a DESCENDING;

        static {
            a aVar = new a("ASCENDING", 0);
            ASCENDING = aVar;
            a aVar2 = new a("DESCENDING", 1);
            DESCENDING = aVar2;
            $VALUES = new a[]{aVar, aVar2};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) java.lang.Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    a fieldOrder();

    void writeBool(int i11, boolean z11) throws IOException;

    void writeBoolList(int i11, List<Boolean> list, boolean z11) throws IOException;

    void writeBytes(int i11, ByteString byteString) throws IOException;

    void writeBytesList(int i11, List<ByteString> list) throws IOException;

    void writeDouble(int i11, double d11) throws IOException;

    void writeDoubleList(int i11, List<Double> list, boolean z11) throws IOException;

    @Deprecated
    void writeEndGroup(int i11) throws IOException;

    void writeEnum(int i11, int i12) throws IOException;

    void writeEnumList(int i11, List<Integer> list, boolean z11) throws IOException;

    void writeFixed32(int i11, int i12) throws IOException;

    void writeFixed32List(int i11, List<Integer> list, boolean z11) throws IOException;

    void writeFixed64(int i11, long j11) throws IOException;

    void writeFixed64List(int i11, List<Long> list, boolean z11) throws IOException;

    void writeFloat(int i11, float f7) throws IOException;

    void writeFloatList(int i11, List<Float> list, boolean z11) throws IOException;

    @Deprecated
    void writeGroup(int i11, Object obj, J j11) throws IOException;

    @Deprecated
    void writeGroupList(int i11, List<?> list, J j11) throws IOException;

    void writeInt32(int i11, int i12) throws IOException;

    void writeInt32List(int i11, List<Integer> list, boolean z11) throws IOException;

    void writeInt64(int i11, long j11) throws IOException;

    void writeInt64List(int i11, List<Long> list, boolean z11) throws IOException;

    <K, V> void writeMap(int i11, u.a<K, V> aVar, Map<K, V> map) throws IOException;

    void writeMessage(int i11, Object obj) throws IOException;

    void writeMessage(int i11, Object obj, J j11) throws IOException;

    void writeMessageList(int i11, List<?> list, J j11) throws IOException;

    void writeMessageSetItem(int i11, Object obj) throws IOException;

    void writeSFixed32(int i11, int i12) throws IOException;

    void writeSFixed32List(int i11, List<Integer> list, boolean z11) throws IOException;

    void writeSFixed64(int i11, long j11) throws IOException;

    void writeSFixed64List(int i11, List<Long> list, boolean z11) throws IOException;

    void writeSInt32(int i11, int i12) throws IOException;

    void writeSInt32List(int i11, List<Integer> list, boolean z11) throws IOException;

    void writeSInt64(int i11, long j11) throws IOException;

    void writeSInt64List(int i11, List<Long> list, boolean z11) throws IOException;

    @Deprecated
    void writeStartGroup(int i11) throws IOException;

    void writeString(int i11, String str) throws IOException;

    void writeStringList(int i11, List<String> list) throws IOException;

    void writeUInt32(int i11, int i12) throws IOException;

    void writeUInt32List(int i11, List<Integer> list, boolean z11) throws IOException;

    void writeUInt64(int i11, long j11) throws IOException;

    void writeUInt64List(int i11, List<Long> list, boolean z11) throws IOException;
}
