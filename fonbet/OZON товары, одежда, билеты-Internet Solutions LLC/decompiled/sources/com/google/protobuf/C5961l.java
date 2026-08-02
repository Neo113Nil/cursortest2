package com.google.protobuf;

import com.google.protobuf.C5961l.b;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5961l<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final C5961l<?> f60212d = new C5961l<>(0);

    /* renamed from: a, reason: collision with root package name */
    private final SmallSortedMap<T, Object> f60213a = SmallSortedMap.newFieldMap();

    /* renamed from: b, reason: collision with root package name */
    private boolean f60214b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f60215c;

    /* renamed from: com.google.protobuf.l$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60216a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f60217b;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f60217b = iArr;
            try {
                iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60217b[WireFormat$FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60217b[WireFormat$FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60217b[WireFormat$FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60217b[WireFormat$FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60217b[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60217b[WireFormat$FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60217b[WireFormat$FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60217b[WireFormat$FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60217b[WireFormat$FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60217b[WireFormat$FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f60217b[WireFormat$FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f60217b[WireFormat$FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f60217b[WireFormat$FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f60217b[WireFormat$FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f60217b[WireFormat$FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f60217b[WireFormat$FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f60217b[WireFormat$FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[Q.values().length];
            f60216a = iArr2;
            try {
                iArr2[Q.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f60216a[Q.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f60216a[Q.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f60216a[Q.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f60216a[Q.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f60216a[Q.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f60216a[Q.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f60216a[Q.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f60216a[Q.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: com.google.protobuf.l$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        Q getLiteJavaType();

        WireFormat$FieldType getLiteType();

        int getNumber();

        void internalMergeFrom(Object obj, Object obj2);

        boolean internalMessageIsImmutable(Object obj);

        boolean isPacked();

        boolean isRepeated();
    }

    private C5961l() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if ((r4 instanceof com.google.protobuf.LazyField) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if ((r4 instanceof com.google.protobuf.Internal.a) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void B(b bVar, Object obj) {
        WireFormat$FieldType liteType = bVar.getLiteType();
        byte[] bArr = Internal.f60126b;
        obj.getClass();
        boolean z11 = true;
        switch (a.f60216a[liteType.getJavaType().ordinal()]) {
            case 1:
                z11 = obj instanceof Integer;
                break;
            case 2:
                z11 = obj instanceof Long;
                break;
            case 3:
                z11 = obj instanceof Float;
                break;
            case 4:
                z11 = obj instanceof Double;
                break;
            case 5:
                z11 = obj instanceof Boolean;
                break;
            case 6:
                z11 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof ByteString)) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof MessageLite)) {
                    break;
                }
                break;
            default:
                z11 = false;
                break;
        }
        if (!z11) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.getNumber()), bVar.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    static void C(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i11, Object obj) throws IOException {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            codedOutputStream.writeGroup(i11, (MessageLite) obj);
        }
        codedOutputStream.writeTag(i11, wireFormat$FieldType.getWireType());
        switch (a.f60217b[wireFormat$FieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                    break;
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.a)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.a) obj).getNumber());
                    break;
                }
        }
    }

    static int d(WireFormat$FieldType wireFormat$FieldType, int i11, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i11);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + e(wireFormat$FieldType, obj);
    }

    static int e(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (a.f60217b[wireFormat$FieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return ((MessageLite) obj).getSerializedSize();
            case 10:
                return obj instanceof LazyField ? ((LazyField) obj).computeSizeNoTag() : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.a ? CodedOutputStream.computeEnumSizeNoTag(((Internal.a) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        WireFormat$FieldType liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return d(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i11 = 0;
        if (!bVar.isPacked()) {
            int i12 = 0;
            while (i11 < size) {
                i12 += d(liteType, number, list.get(i11));
                i11++;
            }
            return i12;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i13 = 0;
        while (i11 < size) {
            i13 += e(liteType, list.get(i11));
            i11++;
        }
        return CodedOutputStream.computeUInt32SizeNoTag(i13) + CodedOutputStream.computeTagSize(number) + i13;
    }

    public static <T extends b<T>> C5961l<T> h() {
        return (C5961l<T>) f60212d;
    }

    private static int k(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        return (bVar.getLiteJavaType() != Q.MESSAGE || bVar.isRepeated() || bVar.isPacked()) ? f(bVar, value) : value instanceof LazyField ? ((LazyField) value).computeMessageSetExtensionSize(((b) entry.getKey()).getNumber()) : CodedOutputStream.computeMessageSetExtensionSize(((b) entry.getKey()).getNumber(), (MessageLite) value);
    }

    static int o(WireFormat$FieldType wireFormat$FieldType, boolean z11) {
        if (z11) {
            return 2;
        }
        return wireFormat$FieldType.getWireType();
    }

    private static <T extends b<T>> boolean t(Map.Entry<T, Object> entry) {
        boolean z11;
        T key = entry.getKey();
        if (key.getLiteJavaType() == Q.MESSAGE) {
            if (!key.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof A) {
                    return ((A) value).isInitialized();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                if (obj instanceof A) {
                    z11 = ((A) obj).isInitialized();
                } else {
                    if (!(obj instanceof LazyField)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    z11 = true;
                }
                if (!z11) {
                    return false;
                }
            }
        }
        return true;
    }

    private void x(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z11 = value instanceof LazyField;
        boolean isRepeated = key.isRepeated();
        SmallSortedMap<T, Object> smallSortedMap = this.f60213a;
        if (isRepeated) {
            if (z11) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object i11 = i(key);
            List list = (List) value;
            int size = list.size();
            if (i11 == null) {
                i11 = new ArrayList(size);
            }
            List list2 = (List) i11;
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list2.add(obj);
            }
            smallSortedMap.put((SmallSortedMap<T, Object>) key, (T) i11);
            return;
        }
        if (key.getLiteJavaType() != Q.MESSAGE) {
            if (z11) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                Object obj2 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, obj2, 0, bArr3.length);
                value = obj2;
            }
            smallSortedMap.put((SmallSortedMap<T, Object>) key, (T) value);
            return;
        }
        Object i13 = i(key);
        if (i13 != null) {
            if (z11) {
                value = ((LazyField) value).getValue();
            }
            if (!key.internalMessageIsImmutable(i13)) {
                key.internalMergeFrom(i13, value);
                return;
            }
            MessageLite.Builder builder = ((MessageLite) i13).toBuilder();
            key.internalMergeFrom(builder, value);
            smallSortedMap.put((SmallSortedMap<T, Object>) key, (T) builder.build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr4 = (byte[]) value;
            Object obj3 = new byte[bArr4.length];
            System.arraycopy(bArr4, 0, obj3, 0, bArr4.length);
            value = obj3;
        }
        smallSortedMap.put((SmallSortedMap<T, Object>) key, (T) value);
        if (z11) {
            this.f60215c = true;
        }
    }

    public static Object y(CodedInputStream codedInputStream, WireFormat$FieldType wireFormat$FieldType) throws IOException {
        return codedInputStream.readPrimitiveField(wireFormat$FieldType, S.LOOSE);
    }

    public final void A(T t2, int i11, Object obj) {
        if (!t2.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object i12 = i(t2);
        if (i12 == null) {
            throw new IndexOutOfBoundsException();
        }
        B(t2, obj);
        ((List) i12).set(i11, obj);
    }

    public final void a(T t2, Object obj) {
        List list;
        if (!t2.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        B(t2, obj);
        Object i11 = i(t2);
        if (i11 == null) {
            list = new ArrayList();
            this.f60213a.put((SmallSortedMap<T, Object>) t2, (T) list);
        } else {
            list = (List) i11;
        }
        list.add(obj);
    }

    public final void b(T t2) {
        SmallSortedMap<T, Object> smallSortedMap = this.f60213a;
        smallSortedMap.remove(t2);
        if (smallSortedMap.isEmpty()) {
            this.f60215c = false;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C5961l<T> clone() {
        C5961l<T> c5961l = new C5961l<>();
        SmallSortedMap<T, Object> smallSortedMap = this.f60213a;
        int numArrayEntries = smallSortedMap.getNumArrayEntries();
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            Map.Entry<T, Object> arrayEntryAt = smallSortedMap.getArrayEntryAt(i11);
            c5961l.z(arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<T, Object> entry : smallSortedMap.getOverflowEntries()) {
            c5961l.z(entry.getKey(), entry.getValue());
        }
        c5961l.f60215c = this.f60215c;
        return c5961l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5961l) {
            return this.f60213a.equals(((C5961l) obj).f60213a);
        }
        return false;
    }

    final Iterator<Map.Entry<T, Object>> g() {
        SmallSortedMap<T, Object> smallSortedMap = this.f60213a;
        return smallSortedMap.isEmpty() ? Collections.emptyIterator() : this.f60215c ? new LazyField.b(smallSortedMap.descendingEntrySet().iterator()) : smallSortedMap.descendingEntrySet().iterator();
    }

    public final int hashCode() {
        return this.f60213a.hashCode();
    }

    public final Object i(T t2) {
        Object obj = this.f60213a.get(t2);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public final int j() {
        SmallSortedMap<T, Object> smallSortedMap = this.f60213a;
        int numArrayEntries = smallSortedMap.getNumArrayEntries();
        int i11 = 0;
        for (int i12 = 0; i12 < numArrayEntries; i12++) {
            i11 += k(smallSortedMap.getArrayEntryAt(i12));
        }
        Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i11 += k(it.next());
        }
        return i11;
    }

    public final Object l(T t2, int i11) {
        if (!t2.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object i12 = i(t2);
        if (i12 != null) {
            return ((List) i12).get(i11);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int m(T t2) {
        if (!t2.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object i11 = i(t2);
        if (i11 == null) {
            return 0;
        }
        return ((List) i11).size();
    }

    public final int n() {
        SmallSortedMap<T, Object> smallSortedMap = this.f60213a;
        int numArrayEntries = smallSortedMap.getNumArrayEntries();
        int i11 = 0;
        for (int i12 = 0; i12 < numArrayEntries; i12++) {
            Map.Entry<T, Object> arrayEntryAt = smallSortedMap.getArrayEntryAt(i12);
            i11 += f(arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<T, Object> entry : smallSortedMap.getOverflowEntries()) {
            i11 += f(entry.getKey(), entry.getValue());
        }
        return i11;
    }

    public final boolean p(T t2) {
        if (t2.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f60213a.get(t2) != null;
    }

    final boolean q() {
        return this.f60213a.isEmpty();
    }

    public final boolean r() {
        return this.f60214b;
    }

    public final boolean s() {
        SmallSortedMap<T, Object> smallSortedMap = this.f60213a;
        int numArrayEntries = smallSortedMap.getNumArrayEntries();
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            if (!t(smallSortedMap.getArrayEntryAt(i11))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!t(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<T, Object>> u() {
        SmallSortedMap<T, Object> smallSortedMap = this.f60213a;
        return smallSortedMap.isEmpty() ? Collections.emptyIterator() : this.f60215c ? new LazyField.b(smallSortedMap.entrySet().iterator()) : smallSortedMap.entrySet().iterator();
    }

    public final void v() {
        if (this.f60214b) {
            return;
        }
        SmallSortedMap<T, Object> smallSortedMap = this.f60213a;
        int numArrayEntries = smallSortedMap.getNumArrayEntries();
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            Object value = smallSortedMap.getArrayEntryAt(i11).getValue();
            if (value instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) value).makeImmutable();
            }
        }
        Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Object value2 = it.next().getValue();
            if (value2 instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) value2).makeImmutable();
            }
        }
        smallSortedMap.makeImmutable();
        this.f60214b = true;
    }

    public final void w(C5961l<T> c5961l) {
        SmallSortedMap<T, Object> smallSortedMap;
        int numArrayEntries = c5961l.f60213a.getNumArrayEntries();
        int i11 = 0;
        while (true) {
            smallSortedMap = c5961l.f60213a;
            if (i11 >= numArrayEntries) {
                break;
            }
            x(smallSortedMap.getArrayEntryAt(i11));
            i11++;
        }
        Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            x(it.next());
        }
    }

    public final void z(T t2, Object obj) {
        if (!t2.isRepeated()) {
            B(t2, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                Object obj2 = list.get(i11);
                B(t2, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f60215c = true;
        }
        this.f60213a.put((SmallSortedMap<T, Object>) t2, (T) obj);
    }

    private C5961l(int i11) {
        v();
        v();
    }
}
