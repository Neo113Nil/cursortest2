package com.google.protobuf;

import com.google.protobuf.T;
import com.google.protobuf.u;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class CodedOutputStreamWriter implements T {
    private final CodedOutputStream output;

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60106a;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f60106a = iArr;
            try {
                iArr[WireFormat$FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60106a[WireFormat$FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60106a[WireFormat$FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60106a[WireFormat$FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60106a[WireFormat$FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60106a[WireFormat$FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60106a[WireFormat$FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60106a[WireFormat$FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60106a[WireFormat$FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60106a[WireFormat$FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60106a[WireFormat$FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f60106a[WireFormat$FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        Internal.a(codedOutputStream, "output");
        this.output = codedOutputStream;
        codedOutputStream.wrapper = this;
    }

    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream codedOutputStream) {
        Object obj = codedOutputStream.wrapper;
        return obj != null ? (CodedOutputStreamWriter) obj : new CodedOutputStreamWriter(codedOutputStream);
    }

    private void writeBoolListInternal(int i11, BooleanArrayList booleanArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < booleanArrayList.size()) {
                this.output.writeBool(i11, booleanArrayList.getBoolean(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < booleanArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeBoolSizeNoTag(booleanArrayList.getBoolean(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < booleanArrayList.size()) {
            this.output.writeBoolNoTag(booleanArrayList.getBoolean(i12));
            i12++;
        }
    }

    private <V> void writeDeterministicBooleanMapEntry(int i11, boolean z11, V v11, u.a<Boolean, V> aVar) throws IOException {
        this.output.writeTag(i11, 2);
        this.output.writeUInt32NoTag(u.b(aVar, Boolean.valueOf(z11), v11));
        u.e(this.output, aVar, Boolean.valueOf(z11), v11);
    }

    private <V> void writeDeterministicIntegerMap(int i11, u.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            iArr[i12] = it.next().intValue();
            i12++;
        }
        Arrays.sort(iArr);
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = iArr[i13];
            V v11 = map.get(Integer.valueOf(i14));
            this.output.writeTag(i11, 2);
            this.output.writeUInt32NoTag(u.b(aVar, Integer.valueOf(i14), v11));
            u.e(this.output, aVar, Integer.valueOf(i14), v11);
        }
    }

    private <V> void writeDeterministicLongMap(int i11, u.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            jArr[i12] = it.next().longValue();
            i12++;
        }
        Arrays.sort(jArr);
        for (int i13 = 0; i13 < size; i13++) {
            long j11 = jArr[i13];
            V v11 = map.get(Long.valueOf(j11));
            this.output.writeTag(i11, 2);
            this.output.writeUInt32NoTag(u.b(aVar, Long.valueOf(j11), v11));
            u.e(this.output, aVar, Long.valueOf(j11), v11);
        }
    }

    private <K, V> void writeDeterministicMap(int i11, u.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.f60106a[aVar.f60235a.ordinal()]) {
            case 1:
                V v11 = map.get(Boolean.FALSE);
                if (v11 != null) {
                    writeDeterministicBooleanMapEntry(i11, false, v11, aVar);
                }
                V v12 = map.get(Boolean.TRUE);
                if (v12 != null) {
                    writeDeterministicBooleanMapEntry(i11, true, v12, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i11, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i11, aVar, map);
                return;
            case 12:
                writeDeterministicStringMap(i11, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f60235a);
        }
    }

    private <V> void writeDeterministicStringMap(int i11, u.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            strArr[i12] = it.next();
            i12++;
        }
        Arrays.sort(strArr);
        for (int i13 = 0; i13 < size; i13++) {
            String str = strArr[i13];
            V v11 = map.get(str);
            this.output.writeTag(i11, 2);
            this.output.writeUInt32NoTag(u.b(aVar, str, v11));
            u.e(this.output, aVar, str, v11);
        }
    }

    private void writeDoubleListInternal(int i11, DoubleArrayList doubleArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < doubleArrayList.size()) {
                this.output.writeDouble(i11, doubleArrayList.getDouble(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < doubleArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeDoubleSizeNoTag(doubleArrayList.getDouble(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < doubleArrayList.size()) {
            this.output.writeDoubleNoTag(doubleArrayList.getDouble(i12));
            i12++;
        }
    }

    private void writeEnumListInternal(int i11, IntArrayList intArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < intArrayList.size()) {
                this.output.writeEnum(i11, intArrayList.getInt(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < intArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < intArrayList.size()) {
            this.output.writeEnumNoTag(intArrayList.getInt(i12));
            i12++;
        }
    }

    private void writeFixed32ListInternal(int i11, IntArrayList intArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < intArrayList.size()) {
                this.output.writeFixed32(i11, intArrayList.getInt(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < intArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeFixed32SizeNoTag(intArrayList.getInt(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < intArrayList.size()) {
            this.output.writeFixed32NoTag(intArrayList.getInt(i12));
            i12++;
        }
    }

    private void writeFixed64ListInternal(int i11, LongArrayList longArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < longArrayList.size()) {
                this.output.writeFixed64(i11, longArrayList.getLong(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < longArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeFixed64SizeNoTag(longArrayList.getLong(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < longArrayList.size()) {
            this.output.writeFixed64NoTag(longArrayList.getLong(i12));
            i12++;
        }
    }

    private void writeFloatListInternal(int i11, FloatArrayList floatArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < floatArrayList.size()) {
                this.output.writeFloat(i11, floatArrayList.getFloat(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < floatArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeFloatSizeNoTag(floatArrayList.getFloat(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < floatArrayList.size()) {
            this.output.writeFloatNoTag(floatArrayList.getFloat(i12));
            i12++;
        }
    }

    private void writeInt32ListInternal(int i11, IntArrayList intArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < intArrayList.size()) {
                this.output.writeInt32(i11, intArrayList.getInt(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < intArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < intArrayList.size()) {
            this.output.writeInt32NoTag(intArrayList.getInt(i12));
            i12++;
        }
    }

    private void writeInt64ListInternal(int i11, LongArrayList longArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < longArrayList.size()) {
                this.output.writeInt64(i11, longArrayList.getLong(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < longArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < longArrayList.size()) {
            this.output.writeInt64NoTag(longArrayList.getLong(i12));
            i12++;
        }
    }

    private void writeLazyString(int i11, Object obj) throws IOException {
        if (obj instanceof String) {
            this.output.writeString(i11, (String) obj);
        } else {
            this.output.writeBytes(i11, (ByteString) obj);
        }
    }

    private void writeSFixed32ListInternal(int i11, IntArrayList intArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < intArrayList.size()) {
                this.output.writeSFixed32(i11, intArrayList.getInt(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < intArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeSFixed32SizeNoTag(intArrayList.getInt(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < intArrayList.size()) {
            this.output.writeSFixed32NoTag(intArrayList.getInt(i12));
            i12++;
        }
    }

    private void writeSFixed64ListInternal(int i11, LongArrayList longArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < longArrayList.size()) {
                this.output.writeSFixed64(i11, longArrayList.getLong(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < longArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeSFixed64SizeNoTag(longArrayList.getLong(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < longArrayList.size()) {
            this.output.writeSFixed64NoTag(longArrayList.getLong(i12));
            i12++;
        }
    }

    private void writeSInt32ListInternal(int i11, IntArrayList intArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < intArrayList.size()) {
                this.output.writeSInt32(i11, intArrayList.getInt(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < intArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < intArrayList.size()) {
            this.output.writeSInt32NoTag(intArrayList.getInt(i12));
            i12++;
        }
    }

    private void writeSInt64ListInternal(int i11, LongArrayList longArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < longArrayList.size()) {
                this.output.writeSInt64(i11, longArrayList.getLong(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < longArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < longArrayList.size()) {
            this.output.writeSInt64NoTag(longArrayList.getLong(i12));
            i12++;
        }
    }

    private void writeUInt32ListInternal(int i11, IntArrayList intArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < intArrayList.size()) {
                this.output.writeUInt32(i11, intArrayList.getInt(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < intArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < intArrayList.size()) {
            this.output.writeUInt32NoTag(intArrayList.getInt(i12));
            i12++;
        }
    }

    private void writeUInt64ListInternal(int i11, LongArrayList longArrayList, boolean z11) throws IOException {
        int i12 = 0;
        if (!z11) {
            while (i12 < longArrayList.size()) {
                this.output.writeUInt64(i11, longArrayList.getLong(i12));
                i12++;
            }
            return;
        }
        this.output.writeTag(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < longArrayList.size(); i14++) {
            i13 += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i14));
        }
        this.output.writeUInt32NoTag(i13);
        while (i12 < longArrayList.size()) {
            this.output.writeUInt64NoTag(longArrayList.getLong(i12));
            i12++;
        }
    }

    @Override // com.google.protobuf.T
    public T.a fieldOrder() {
        return T.a.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // com.google.protobuf.T
    public void writeBool(int i11, boolean z11) throws IOException {
        this.output.writeBool(i11, z11);
    }

    @Override // com.google.protobuf.T
    public void writeBoolList(int i11, List<Boolean> list, boolean z11) throws IOException {
        if (list instanceof BooleanArrayList) {
            writeBoolListInternal(i11, (BooleanArrayList) list, z11);
        } else {
            writeBoolListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public void writeBytes(int i11, ByteString byteString) throws IOException {
        this.output.writeBytes(i11, byteString);
    }

    @Override // com.google.protobuf.T
    public void writeBytesList(int i11, List<ByteString> list) throws IOException {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.output.writeBytes(i11, list.get(i12));
        }
    }

    @Override // com.google.protobuf.T
    public void writeDouble(int i11, double d11) throws IOException {
        this.output.writeDouble(i11, d11);
    }

    @Override // com.google.protobuf.T
    public void writeDoubleList(int i11, List<Double> list, boolean z11) throws IOException {
        if (list instanceof DoubleArrayList) {
            writeDoubleListInternal(i11, (DoubleArrayList) list, z11);
        } else {
            writeDoubleListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    @Deprecated
    public void writeEndGroup(int i11) throws IOException {
        this.output.writeTag(i11, 4);
    }

    @Override // com.google.protobuf.T
    public void writeEnum(int i11, int i12) throws IOException {
        this.output.writeEnum(i11, i12);
    }

    @Override // com.google.protobuf.T
    public void writeEnumList(int i11, List<Integer> list, boolean z11) throws IOException {
        if (list instanceof IntArrayList) {
            writeEnumListInternal(i11, (IntArrayList) list, z11);
        } else {
            writeEnumListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public void writeFixed32(int i11, int i12) throws IOException {
        this.output.writeFixed32(i11, i12);
    }

    @Override // com.google.protobuf.T
    public void writeFixed32List(int i11, List<Integer> list, boolean z11) throws IOException {
        if (list instanceof IntArrayList) {
            writeFixed32ListInternal(i11, (IntArrayList) list, z11);
        } else {
            writeFixed32ListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public void writeFixed64(int i11, long j11) throws IOException {
        this.output.writeFixed64(i11, j11);
    }

    @Override // com.google.protobuf.T
    public void writeFixed64List(int i11, List<Long> list, boolean z11) throws IOException {
        if (list instanceof LongArrayList) {
            writeFixed64ListInternal(i11, (LongArrayList) list, z11);
        } else {
            writeFixed64ListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public void writeFloat(int i11, float f7) throws IOException {
        this.output.writeFloat(i11, f7);
    }

    @Override // com.google.protobuf.T
    public void writeFloatList(int i11, List<Float> list, boolean z11) throws IOException {
        if (list instanceof FloatArrayList) {
            writeFloatListInternal(i11, (FloatArrayList) list, z11);
        } else {
            writeFloatListInternal(i11, list, z11);
        }
    }

    @Deprecated
    public void writeGroup(int i11, Object obj) throws IOException {
        this.output.writeGroup(i11, (MessageLite) obj);
    }

    @Deprecated
    public void writeGroupList(int i11, List<?> list) throws IOException {
        for (int i12 = 0; i12 < list.size(); i12++) {
            writeGroup(i11, list.get(i12));
        }
    }

    @Override // com.google.protobuf.T
    public void writeInt32(int i11, int i12) throws IOException {
        this.output.writeInt32(i11, i12);
    }

    @Override // com.google.protobuf.T
    public void writeInt32List(int i11, List<Integer> list, boolean z11) throws IOException {
        if (list instanceof IntArrayList) {
            writeInt32ListInternal(i11, (IntArrayList) list, z11);
        } else {
            writeInt32ListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public void writeInt64(int i11, long j11) throws IOException {
        this.output.writeInt64(i11, j11);
    }

    @Override // com.google.protobuf.T
    public void writeInt64List(int i11, List<Long> list, boolean z11) throws IOException {
        if (list instanceof LongArrayList) {
            writeInt64ListInternal(i11, (LongArrayList) list, z11);
        } else {
            writeInt64ListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public <K, V> void writeMap(int i11, u.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i11, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i11, 2);
            this.output.writeUInt32NoTag(u.b(aVar, entry.getKey(), entry.getValue()));
            u.e(this.output, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.T
    public void writeMessage(int i11, Object obj) throws IOException {
        this.output.writeMessage(i11, (MessageLite) obj);
    }

    public void writeMessageList(int i11, List<?> list) throws IOException {
        for (int i12 = 0; i12 < list.size(); i12++) {
            writeMessage(i11, list.get(i12));
        }
    }

    @Override // com.google.protobuf.T
    public final void writeMessageSetItem(int i11, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.output.writeRawMessageSetExtension(i11, (ByteString) obj);
        } else {
            this.output.writeMessageSetExtension(i11, (MessageLite) obj);
        }
    }

    @Override // com.google.protobuf.T
    public void writeSFixed32(int i11, int i12) throws IOException {
        this.output.writeSFixed32(i11, i12);
    }

    @Override // com.google.protobuf.T
    public void writeSFixed32List(int i11, List<Integer> list, boolean z11) throws IOException {
        if (list instanceof IntArrayList) {
            writeSFixed32ListInternal(i11, (IntArrayList) list, z11);
        } else {
            writeSFixed32ListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public void writeSFixed64(int i11, long j11) throws IOException {
        this.output.writeSFixed64(i11, j11);
    }

    @Override // com.google.protobuf.T
    public void writeSFixed64List(int i11, List<Long> list, boolean z11) throws IOException {
        if (list instanceof LongArrayList) {
            writeSFixed64ListInternal(i11, (LongArrayList) list, z11);
        } else {
            writeSFixed64ListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public void writeSInt32(int i11, int i12) throws IOException {
        this.output.writeSInt32(i11, i12);
    }

    @Override // com.google.protobuf.T
    public void writeSInt32List(int i11, List<Integer> list, boolean z11) throws IOException {
        if (list instanceof IntArrayList) {
            writeSInt32ListInternal(i11, (IntArrayList) list, z11);
        } else {
            writeSInt32ListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public void writeSInt64(int i11, long j11) throws IOException {
        this.output.writeSInt64(i11, j11);
    }

    @Override // com.google.protobuf.T
    public void writeSInt64List(int i11, List<Long> list, boolean z11) throws IOException {
        if (list instanceof LongArrayList) {
            writeSInt64ListInternal(i11, (LongArrayList) list, z11);
        } else {
            writeSInt64ListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    @Deprecated
    public void writeStartGroup(int i11) throws IOException {
        this.output.writeTag(i11, 3);
    }

    @Override // com.google.protobuf.T
    public void writeString(int i11, String str) throws IOException {
        this.output.writeString(i11, str);
    }

    @Override // com.google.protobuf.T
    public void writeStringList(int i11, List<String> list) throws IOException {
        int i12 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i12 < list.size()) {
                this.output.writeString(i11, list.get(i12));
                i12++;
            }
        } else {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i12 < list.size()) {
                writeLazyString(i11, lazyStringList.getRaw(i12));
                i12++;
            }
        }
    }

    @Override // com.google.protobuf.T
    public void writeUInt32(int i11, int i12) throws IOException {
        this.output.writeUInt32(i11, i12);
    }

    @Override // com.google.protobuf.T
    public void writeUInt32List(int i11, List<Integer> list, boolean z11) throws IOException {
        if (list instanceof IntArrayList) {
            writeUInt32ListInternal(i11, (IntArrayList) list, z11);
        } else {
            writeUInt32ListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public void writeUInt64(int i11, long j11) throws IOException {
        this.output.writeUInt64(i11, j11);
    }

    @Override // com.google.protobuf.T
    public void writeUInt64List(int i11, List<Long> list, boolean z11) throws IOException {
        if (list instanceof LongArrayList) {
            writeUInt64ListInternal(i11, (LongArrayList) list, z11);
        } else {
            writeUInt64ListInternal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public void writeGroup(int i11, Object obj, J j11) throws IOException {
        this.output.writeTag(i11, 3);
        j11.writeTo((AbstractMessageLite) obj, this);
        this.output.writeTag(i11, 4);
    }

    @Override // com.google.protobuf.T
    public void writeMessage(int i11, Object obj, J j11) throws IOException {
        AbstractMessageLite abstractMessageLite = (AbstractMessageLite) obj;
        this.output.writeTag(i11, 2);
        this.output.writeUInt32NoTag(abstractMessageLite.getSerializedSize(j11));
        j11.writeTo(abstractMessageLite, this);
    }

    @Override // com.google.protobuf.T
    public void writeGroupList(int i11, List<?> list, J j11) throws IOException {
        for (int i12 = 0; i12 < list.size(); i12++) {
            writeGroup(i11, list.get(i12), j11);
        }
    }

    @Override // com.google.protobuf.T
    public void writeMessageList(int i11, List<?> list, J j11) throws IOException {
        for (int i12 = 0; i12 < list.size(); i12++) {
            writeMessage(i11, list.get(i12), j11);
        }
    }

    private void writeBoolListInternal(int i11, List<Boolean> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeBoolSizeNoTag(list.get(i14).booleanValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeBoolNoTag(list.get(i12).booleanValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeBool(i11, list.get(i12).booleanValue());
            i12++;
        }
    }

    private void writeDoubleListInternal(int i11, List<Double> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeDoubleSizeNoTag(list.get(i14).doubleValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeDoubleNoTag(list.get(i12).doubleValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeDouble(i11, list.get(i12).doubleValue());
            i12++;
        }
    }

    private void writeEnumListInternal(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeEnumSizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeEnumNoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeEnum(i11, list.get(i12).intValue());
            i12++;
        }
    }

    private void writeFixed32ListInternal(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeFixed32SizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeFixed32NoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeFixed32(i11, list.get(i12).intValue());
            i12++;
        }
    }

    private void writeFixed64ListInternal(int i11, List<Long> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeFixed64SizeNoTag(list.get(i14).longValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeFixed64NoTag(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeFixed64(i11, list.get(i12).longValue());
            i12++;
        }
    }

    private void writeFloatListInternal(int i11, List<Float> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeFloatSizeNoTag(list.get(i14).floatValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeFloatNoTag(list.get(i12).floatValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeFloat(i11, list.get(i12).floatValue());
            i12++;
        }
    }

    private void writeInt32ListInternal(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeInt32SizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeInt32NoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeInt32(i11, list.get(i12).intValue());
            i12++;
        }
    }

    private void writeInt64ListInternal(int i11, List<Long> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeInt64SizeNoTag(list.get(i14).longValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeInt64NoTag(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeInt64(i11, list.get(i12).longValue());
            i12++;
        }
    }

    private void writeSFixed32ListInternal(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeSFixed32SizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeSFixed32NoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeSFixed32(i11, list.get(i12).intValue());
            i12++;
        }
    }

    private void writeSFixed64ListInternal(int i11, List<Long> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeSFixed64SizeNoTag(list.get(i14).longValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeSFixed64NoTag(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeSFixed64(i11, list.get(i12).longValue());
            i12++;
        }
    }

    private void writeSInt64ListInternal(int i11, List<Long> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i14).longValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeSInt64NoTag(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeSInt64(i11, list.get(i12).longValue());
            i12++;
        }
    }

    private void writeUInt64ListInternal(int i11, List<Long> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i14).longValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeUInt64NoTag(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeUInt64(i11, list.get(i12).longValue());
            i12++;
        }
    }

    public void writeSInt32ListInternal(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeSInt32NoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeSInt32(i11, list.get(i12).intValue());
            i12++;
        }
    }

    public void writeUInt32ListInternal(int i11, List<Integer> list, boolean z11) throws IOException {
        int i12 = 0;
        if (z11) {
            this.output.writeTag(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i14).intValue());
            }
            this.output.writeUInt32NoTag(i13);
            while (i12 < list.size()) {
                this.output.writeUInt32NoTag(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.output.writeUInt32(i11, list.get(i12).intValue());
            i12++;
        }
    }
}
