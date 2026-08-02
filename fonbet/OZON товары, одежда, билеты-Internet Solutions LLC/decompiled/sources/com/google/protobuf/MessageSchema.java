package com.google.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5951b;
import com.google.protobuf.Internal;
import com.google.protobuf.T;
import com.google.protobuf.u;
import g.C6594f;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class MessageSchema<T> implements J<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final AbstractC5958i<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final InterfaceC5967s listFieldSchema;
    private final boolean lite;
    private final w mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final C newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final N<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.z();

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60141a;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f60141a = iArr;
            try {
                iArr[WireFormat$FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60141a[WireFormat$FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60141a[WireFormat$FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60141a[WireFormat$FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60141a[WireFormat$FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60141a[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60141a[WireFormat$FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60141a[WireFormat$FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60141a[WireFormat$FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60141a[WireFormat$FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60141a[WireFormat$FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f60141a[WireFormat$FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f60141a[WireFormat$FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f60141a[WireFormat$FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f60141a[WireFormat$FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f60141a[WireFormat$FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f60141a[WireFormat$FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i11, int i12, MessageLite messageLite, boolean z11, int[] iArr2, int i13, int i14, C c11, InterfaceC5967s interfaceC5967s, N<?, ?> n11, AbstractC5958i<?> abstractC5958i, w wVar) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i11;
        this.maxFieldNumber = i12;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.hasExtensions = abstractC5958i != null && abstractC5958i.hasExtensions(messageLite);
        this.useCachedSizeField = z11;
        this.intArray = iArr2;
        this.checkInitializedCount = i13;
        this.repeatedFieldOffsetStart = i14;
        this.newInstanceSchema = c11;
        this.listFieldSchema = interfaceC5967s;
        this.unknownFieldSchema = n11;
        this.extensionSchema = abstractC5958i;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = wVar;
    }

    private boolean arePresentForEquals(T t2, T t11, int i11) {
        return isFieldPresent(t2, i11) == isFieldPresent(t11, i11);
    }

    private static <T> boolean booleanAt(T t2, long j11) {
        return UnsafeUtil.q(t2, j11);
    }

    private static void checkMutable(Object obj) {
        if (!isMutable(obj)) {
            throw new IllegalArgumentException(U7.m.b(obj, "Mutating immutable message: "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i11, int i12, u.a<K, V> aVar, Map<K, V> map, C5951b.C0915b c0915b) throws IOException {
        int G11 = C5951b.G(bArr, i11, c0915b);
        int i13 = c0915b.f60195a;
        if (i13 < 0 || i13 > i12 - G11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i14 = G11 + i13;
        K k11 = aVar.f60236b;
        V v11 = aVar.f60238d;
        Object obj = k11;
        Object obj2 = v11;
        while (G11 < i14) {
            int i15 = G11 + 1;
            int i16 = bArr[G11];
            if (i16 < 0) {
                i15 = C5951b.F(i16, bArr, i15, c0915b);
                i16 = c0915b.f60195a;
            }
            int i17 = i15;
            int i18 = i16 >>> 3;
            int i19 = i16 & 7;
            if (i18 != 1) {
                if (i18 == 2 && i19 == aVar.f60237c.getWireType()) {
                    G11 = decodeMapEntryValue(bArr, i17, i12, aVar.f60237c, v11.getClass(), c0915b);
                    obj2 = c0915b.f60197c;
                }
                G11 = C5951b.M(i16, bArr, i17, i12, c0915b);
            } else if (i19 == aVar.f60235a.getWireType()) {
                G11 = decodeMapEntryValue(bArr, i17, i12, aVar.f60235a, null, c0915b);
                obj = c0915b.f60197c;
            } else {
                G11 = C5951b.M(i16, bArr, i17, i12, c0915b);
            }
        }
        if (G11 != i14) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i14;
    }

    private int decodeMapEntryValue(byte[] bArr, int i11, int i12, WireFormat$FieldType wireFormat$FieldType, Class<?> cls, C5951b.C0915b c0915b) throws IOException {
        switch (a.f60141a[wireFormat$FieldType.ordinal()]) {
            case 1:
                int I11 = C5951b.I(bArr, i11, c0915b);
                c0915b.f60197c = Boolean.valueOf(c0915b.f60196b != 0);
                return I11;
            case 2:
                return C5951b.b(bArr, i11, c0915b);
            case 3:
                c0915b.f60197c = Double.valueOf(C5951b.d(i11, bArr));
                return i11 + 8;
            case 4:
            case 5:
                c0915b.f60197c = Integer.valueOf(C5951b.g(i11, bArr));
                return i11 + 4;
            case 6:
            case 7:
                c0915b.f60197c = Long.valueOf(C5951b.i(i11, bArr));
                return i11 + 8;
            case 8:
                c0915b.f60197c = Float.valueOf(C5951b.k(i11, bArr));
                return i11 + 4;
            case 9:
            case 10:
            case 11:
                int G11 = C5951b.G(bArr, i11, c0915b);
                c0915b.f60197c = Integer.valueOf(c0915b.f60195a);
                return G11;
            case 12:
            case 13:
                int I12 = C5951b.I(bArr, i11, c0915b);
                c0915b.f60197c = Long.valueOf(c0915b.f60196b);
                return I12;
            case 14:
                return C5951b.n(H.a().b(cls), bArr, i11, i12, c0915b);
            case 15:
                int G12 = C5951b.G(bArr, i11, c0915b);
                c0915b.f60197c = Integer.valueOf(CodedInputStream.decodeZigZag32(c0915b.f60195a));
                return G12;
            case 16:
                int I13 = C5951b.I(bArr, i11, c0915b);
                c0915b.f60197c = Long.valueOf(CodedInputStream.decodeZigZag64(c0915b.f60196b));
                return I13;
            case 17:
                return C5951b.D(bArr, i11, c0915b);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t2, long j11) {
        return UnsafeUtil.t(t2, j11);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i11, UB ub2, N<UT, UB> n11, Object obj2) {
        Internal.c enumFieldVerifier;
        int numberAt = numberAt(i11);
        Object y11 = UnsafeUtil.y(obj, offset(typeAndOffsetAt(i11)));
        return (y11 == null || (enumFieldVerifier = getEnumFieldVerifier(i11)) == null) ? ub2 : (UB) filterUnknownEnumMap(i11, numberAt, this.mapFieldSchema.forMutableMapData(y11), enumFieldVerifier, ub2, n11, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i11, int i12, Map<K, V> map, Internal.c cVar, UB ub2, N<UT, UB> n11, Object obj) {
        u.a<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!cVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = n11.getBuilderFromMessage(obj);
                }
                ByteString.d newCodedBuilder = ByteString.newCodedBuilder(u.b(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    u.e(newCodedBuilder.b(), forMapMetadata, next.getKey(), next.getValue());
                    n11.addLengthDelimited(ub2, i12, newCodedBuilder.a());
                    it.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T t2, long j11) {
        return UnsafeUtil.u(t2, j11);
    }

    private Internal.c getEnumFieldVerifier(int i11) {
        return (Internal.c) this.objects[I1.w.a(i11, 3, 2, 1)];
    }

    private Object getMapFieldDefaultEntry(int i11) {
        return this.objects[(i11 / 3) * 2];
    }

    private J getMessageFieldSchema(int i11) {
        int i12 = (i11 / 3) * 2;
        J j11 = (J) this.objects[i12];
        if (j11 != null) {
            return j11;
        }
        J<T> b11 = H.a().b((Class) this.objects[i12 + 1]);
        this.objects[i12] = b11;
        return b11;
    }

    static O getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        O o11 = generatedMessageLite.unknownFields;
        if (o11 != O.c()) {
            return o11;
        }
        O j11 = O.j();
        generatedMessageLite.unknownFields = j11;
        return j11;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(N<UT, UB> n11, T t2) {
        return n11.getSerializedSize(n11.getFromMessage(t2));
    }

    private static <T> int intAt(T t2, long j11) {
        return UnsafeUtil.v(t2, j11);
    }

    private static boolean isEnforceUtf8(int i11) {
        return (i11 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t2, int i11, int i12, int i13, int i14) {
        return i12 == 1048575 ? isFieldPresent(t2, i11) : (i13 & i14) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i11) {
        return (i11 & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i11, int i12) {
        List list = (List) UnsafeUtil.y(obj, offset(i11));
        if (list.isEmpty()) {
            return true;
        }
        J messageFieldSchema = getMessageFieldSchema(i12);
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!messageFieldSchema.isInitialized(list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.J] */
    private boolean isMapInitialized(T t2, int i11, int i12) {
        Map<?, ?> forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.y(t2, offset(i11)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i12)).f60237c.getJavaType() != Q.MESSAGE) {
            return true;
        }
        ?? r52 = 0;
        for (Object obj : forMapData.values()) {
            r52 = r52;
            if (r52 == 0) {
                r52 = H.a().b(obj.getClass());
            }
            if (!r52.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t2, T t11, int i11) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i11) & 1048575;
        return UnsafeUtil.v(t2, presenceMaskAndOffsetAt) == UnsafeUtil.v(t11, presenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t2, int i11, int i12) {
        return UnsafeUtil.v(t2, (long) (presenceMaskAndOffsetAt(i12) & 1048575)) == i11;
    }

    private static boolean isRequired(int i11) {
        return (i11 & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t2, long j11) {
        return UnsafeUtil.x(t2, j11);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends com.google.protobuf.C5961l.b<ET>> void mergeFromHelper(com.google.protobuf.N<UT, UB> r18, com.google.protobuf.AbstractC5958i<ET> r19, T r20, com.google.protobuf.I r21, com.google.protobuf.C5957h r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.N, com.google.protobuf.i, java.lang.Object, com.google.protobuf.I, com.google.protobuf.h):void");
    }

    private final <K, V> void mergeMap(Object obj, int i11, Object obj2, C5957h c5957h, I i12) throws IOException {
        long offset = offset(typeAndOffsetAt(i11));
        Object y11 = UnsafeUtil.y(obj, offset);
        if (y11 == null) {
            y11 = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.M(obj, offset, y11);
        } else if (this.mapFieldSchema.isImmutable(y11)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, y11);
            UnsafeUtil.M(obj, offset, newMapField);
            y11 = newMapField;
        }
        i12.readMap(this.mapFieldSchema.forMutableMapData(y11), this.mapFieldSchema.forMapMetadata(obj2), c5957h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t2, T t11, int i11) {
        if (isFieldPresent(t11, i11)) {
            long offset = offset(typeAndOffsetAt(i11));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t11, offset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i11) + " is present but null: " + t11);
            }
            J messageFieldSchema = getMessageFieldSchema(i11);
            if (!isFieldPresent(t2, i11)) {
                if (isMutable(object)) {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t2, offset, newInstance);
                } else {
                    unsafe.putObject(t2, offset, object);
                }
                setFieldPresent(t2, i11);
                return;
            }
            Object object2 = unsafe.getObject(t2, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t2, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t2, T t11, int i11) {
        int numberAt = numberAt(i11);
        if (isOneofPresent(t11, numberAt, i11)) {
            long offset = offset(typeAndOffsetAt(i11));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t11, offset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i11) + " is present but null: " + t11);
            }
            J messageFieldSchema = getMessageFieldSchema(i11);
            if (!isOneofPresent(t2, numberAt, i11)) {
                if (isMutable(object)) {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t2, offset, newInstance);
                } else {
                    unsafe.putObject(t2, offset, object);
                }
                setOneofPresent(t2, numberAt, i11);
                return;
            }
            Object object2 = unsafe.getObject(t2, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t2, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t2, T t11, int i11) {
        int typeAndOffsetAt = typeAndOffsetAt(i11);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i11);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.I(t2, offset, UnsafeUtil.t(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.J(t2, offset, UnsafeUtil.u(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.L(t2, offset, UnsafeUtil.x(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.L(t2, offset, UnsafeUtil.x(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.K(t2, offset, UnsafeUtil.v(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.L(t2, offset, UnsafeUtil.x(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.K(t2, offset, UnsafeUtil.v(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.D(t2, offset, UnsafeUtil.q(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.M(t2, offset, UnsafeUtil.y(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 9:
                mergeMessage(t2, t11, i11);
                break;
            case 10:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.M(t2, offset, UnsafeUtil.y(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.K(t2, offset, UnsafeUtil.v(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.K(t2, offset, UnsafeUtil.v(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.K(t2, offset, UnsafeUtil.v(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.L(t2, offset, UnsafeUtil.x(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.K(t2, offset, UnsafeUtil.v(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(t11, i11)) {
                    UnsafeUtil.L(t2, offset, UnsafeUtil.x(t11, offset));
                    setFieldPresent(t2, i11);
                    break;
                }
                break;
            case 17:
                mergeMessage(t2, t11, i11);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
            case 29:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case 34:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 40:
            case 41:
            case 42:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t2, t11, offset);
                break;
            case 50:
                w wVar = this.mapFieldSchema;
                int i12 = L.f60134d;
                UnsafeUtil.M(t2, offset, wVar.mergeFrom(UnsafeUtil.y(t2, offset), UnsafeUtil.y(t11, offset)));
                break;
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t11, numberAt, i11)) {
                    UnsafeUtil.M(t2, offset, UnsafeUtil.y(t11, offset));
                    setOneofPresent(t2, numberAt, i11);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(t2, t11, i11);
                break;
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
                if (isOneofPresent(t11, numberAt, i11)) {
                    UnsafeUtil.M(t2, offset, UnsafeUtil.y(t11, offset));
                    setOneofPresent(t2, numberAt, i11);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(t2, t11, i11);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t2, int i11) {
        J messageFieldSchema = getMessageFieldSchema(i11);
        long offset = offset(typeAndOffsetAt(i11));
        if (!isFieldPresent(t2, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t2, offset);
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t2, int i11, int i12) {
        J messageFieldSchema = getMessageFieldSchema(i12);
        if (!isOneofPresent(t2, i11, i12)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t2, offset(typeAndOffsetAt(i12)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    static <T> MessageSchema<T> newSchema(Class<T> cls, y yVar, C c11, InterfaceC5967s interfaceC5967s, N<?, ?> n11, AbstractC5958i<?> abstractC5958i, w wVar) {
        return yVar instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) yVar, c11, interfaceC5967s, n11, abstractC5958i, wVar) : newSchemaForMessageInfo((StructuralMessageInfo) yVar, c11, interfaceC5967s, n11, abstractC5958i, wVar);
    }

    static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, C c11, InterfaceC5967s interfaceC5967s, N<?, ?> n11, AbstractC5958i<?> abstractC5958i, w wVar) {
        int[] iArr;
        C5960k[] fields = structuralMessageInfo.getFields();
        if (fields.length != 0) {
            C5960k c5960k = fields[0];
            throw null;
        }
        int length = fields.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (fields.length > 0) {
            C5960k c5960k2 = fields[0];
            throw null;
        }
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        if (fields.length > 0) {
            C5960k c5960k3 = fields[0];
            throw null;
        }
        int[] iArr3 = EMPTY_INT_ARRAY;
        int[] iArr4 = EMPTY_INT_ARRAY;
        int length2 = checkInitialized.length + iArr3.length + iArr4.length;
        if (length2 > 0) {
            iArr = new int[length2];
            System.arraycopy(checkInitialized, 0, iArr, 0, checkInitialized.length);
            System.arraycopy(iArr3, 0, iArr, checkInitialized.length, iArr3.length);
            System.arraycopy(iArr4, 0, iArr, checkInitialized.length + iArr3.length, iArr4.length);
        } else {
            iArr = EMPTY_INT_ARRAY;
        }
        return new MessageSchema<>(iArr2, objArr, 0, 0, structuralMessageInfo.getDefaultInstance(), true, iArr, checkInitialized.length, checkInitialized.length + iArr3.length, c11, interfaceC5967s, n11, abstractC5958i, wVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, C c11, InterfaceC5967s interfaceC5967s, N<?, ?> n11, AbstractC5958i<?> abstractC5958i, w wVar) {
        int i11;
        int charAt;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        int i18;
        char charAt2;
        int i19;
        char charAt3;
        int i21;
        char charAt4;
        int i22;
        char charAt5;
        int i23;
        char charAt6;
        int i24;
        char charAt7;
        int i25;
        char charAt8;
        int i26;
        char charAt9;
        int i27;
        int i28;
        int i29;
        int i31;
        int objectFieldOffset;
        int i32;
        int i33;
        int i34;
        int i35;
        java.lang.reflect.Field reflectField;
        char charAt10;
        int i36;
        int i37;
        java.lang.reflect.Field reflectField2;
        java.lang.reflect.Field reflectField3;
        int i38;
        char charAt11;
        int i39;
        char charAt12;
        int i41;
        char charAt13;
        int i42;
        char charAt14;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        int i43 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i44 = 1;
            while (true) {
                i11 = i44 + 1;
                if (stringInfo.charAt(i44) < 55296) {
                    break;
                }
                i44 = i11;
            }
        } else {
            i11 = 1;
        }
        int i45 = i11 + 1;
        int charAt15 = stringInfo.charAt(i11);
        if (charAt15 >= 55296) {
            int i46 = charAt15 & 8191;
            int i47 = 13;
            while (true) {
                i42 = i45 + 1;
                charAt14 = stringInfo.charAt(i45);
                if (charAt14 < 55296) {
                    break;
                }
                i46 |= (charAt14 & 8191) << i47;
                i47 += 13;
                i45 = i42;
            }
            charAt15 = i46 | (charAt14 << i47);
            i45 = i42;
        }
        if (charAt15 == 0) {
            i13 = 0;
            i15 = 0;
            charAt = 0;
            i12 = 0;
            i14 = 0;
            i17 = 0;
            iArr = EMPTY_INT_ARRAY;
            i16 = 0;
        } else {
            int i48 = i45 + 1;
            int charAt16 = stringInfo.charAt(i45);
            if (charAt16 >= 55296) {
                int i49 = charAt16 & 8191;
                int i51 = 13;
                while (true) {
                    i26 = i48 + 1;
                    charAt9 = stringInfo.charAt(i48);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i49 |= (charAt9 & 8191) << i51;
                    i51 += 13;
                    i48 = i26;
                }
                charAt16 = i49 | (charAt9 << i51);
                i48 = i26;
            }
            int i52 = i48 + 1;
            int charAt17 = stringInfo.charAt(i48);
            if (charAt17 >= 55296) {
                int i53 = charAt17 & 8191;
                int i54 = 13;
                while (true) {
                    i25 = i52 + 1;
                    charAt8 = stringInfo.charAt(i52);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i53 |= (charAt8 & 8191) << i54;
                    i54 += 13;
                    i52 = i25;
                }
                charAt17 = i53 | (charAt8 << i54);
                i52 = i25;
            }
            int i55 = i52 + 1;
            int charAt18 = stringInfo.charAt(i52);
            if (charAt18 >= 55296) {
                int i56 = charAt18 & 8191;
                int i57 = 13;
                while (true) {
                    i24 = i55 + 1;
                    charAt7 = stringInfo.charAt(i55);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i56 |= (charAt7 & 8191) << i57;
                    i57 += 13;
                    i55 = i24;
                }
                charAt18 = i56 | (charAt7 << i57);
                i55 = i24;
            }
            int i58 = i55 + 1;
            int charAt19 = stringInfo.charAt(i55);
            if (charAt19 >= 55296) {
                int i59 = charAt19 & 8191;
                int i61 = 13;
                while (true) {
                    i23 = i58 + 1;
                    charAt6 = stringInfo.charAt(i58);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i59 |= (charAt6 & 8191) << i61;
                    i61 += 13;
                    i58 = i23;
                }
                charAt19 = i59 | (charAt6 << i61);
                i58 = i23;
            }
            int i62 = i58 + 1;
            charAt = stringInfo.charAt(i58);
            if (charAt >= 55296) {
                int i63 = charAt & 8191;
                int i64 = 13;
                while (true) {
                    i22 = i62 + 1;
                    charAt5 = stringInfo.charAt(i62);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i63 |= (charAt5 & 8191) << i64;
                    i64 += 13;
                    i62 = i22;
                }
                charAt = i63 | (charAt5 << i64);
                i62 = i22;
            }
            int i65 = i62 + 1;
            int charAt20 = stringInfo.charAt(i62);
            if (charAt20 >= 55296) {
                int i66 = charAt20 & 8191;
                int i67 = 13;
                while (true) {
                    i21 = i65 + 1;
                    charAt4 = stringInfo.charAt(i65);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i66 |= (charAt4 & 8191) << i67;
                    i67 += 13;
                    i65 = i21;
                }
                charAt20 = i66 | (charAt4 << i67);
                i65 = i21;
            }
            int i68 = i65 + 1;
            int charAt21 = stringInfo.charAt(i65);
            if (charAt21 >= 55296) {
                int i69 = charAt21 & 8191;
                int i71 = 13;
                while (true) {
                    i19 = i68 + 1;
                    charAt3 = stringInfo.charAt(i68);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i69 |= (charAt3 & 8191) << i71;
                    i71 += 13;
                    i68 = i19;
                }
                charAt21 = i69 | (charAt3 << i71);
                i68 = i19;
            }
            int i72 = i68 + 1;
            int charAt22 = stringInfo.charAt(i68);
            if (charAt22 >= 55296) {
                int i73 = charAt22 & 8191;
                int i74 = 13;
                while (true) {
                    i18 = i72 + 1;
                    charAt2 = stringInfo.charAt(i72);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i73 |= (charAt2 & 8191) << i74;
                    i74 += 13;
                    i72 = i18;
                }
                charAt22 = i73 | (charAt2 << i74);
                i72 = i18;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i75 = (charAt16 * 2) + charAt17;
            int i76 = charAt20;
            i12 = charAt18;
            i13 = i76;
            i14 = charAt19;
            i15 = i75;
            iArr = iArr2;
            i16 = charAt16;
            i17 = charAt22;
            i45 = i72;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i77 = i17 + i13;
        int i78 = i77;
        int i79 = i17;
        int i81 = 0;
        int i82 = 0;
        while (i45 < length) {
            int i83 = i45 + 1;
            int charAt23 = stringInfo.charAt(i45);
            if (charAt23 >= i43) {
                int i84 = charAt23 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i41 = i85 + 1;
                    charAt13 = stringInfo.charAt(i85);
                    i27 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i84 |= (charAt13 & 8191) << i86;
                    i86 += 13;
                    i85 = i41;
                    length = i27;
                }
                charAt23 = i84 | (charAt13 << i86);
                i28 = i41;
            } else {
                i27 = length;
                i28 = i83;
            }
            int i87 = i28 + 1;
            int charAt24 = stringInfo.charAt(i28);
            int i88 = charAt23;
            char c12 = 55296;
            if (charAt24 >= 55296) {
                int i89 = charAt24 & 8191;
                int i91 = 13;
                while (true) {
                    i39 = i87 + 1;
                    charAt12 = stringInfo.charAt(i87);
                    if (charAt12 < c12) {
                        break;
                    }
                    i89 |= (charAt12 & 8191) << i91;
                    i91 += 13;
                    i87 = i39;
                    c12 = 55296;
                }
                charAt24 = i89 | (charAt12 << i91);
                i87 = i39;
            }
            int i92 = charAt24 & 255;
            int i93 = i16;
            if ((charAt24 & 1024) != 0) {
                iArr[i82] = i81;
                i82++;
            }
            int[] iArr4 = iArr3;
            if (i92 >= ONEOF_TYPE_OFFSET) {
                int i94 = i87 + 1;
                int charAt25 = stringInfo.charAt(i87);
                char c13 = 55296;
                if (charAt25 >= 55296) {
                    int i95 = charAt25 & 8191;
                    int i96 = 13;
                    while (true) {
                        i38 = i94 + 1;
                        charAt11 = stringInfo.charAt(i94);
                        if (charAt11 < c13) {
                            break;
                        }
                        i95 |= (charAt11 & 8191) << i96;
                        i96 += 13;
                        i94 = i38;
                        c13 = 55296;
                    }
                    charAt25 = i95 | (charAt11 << i96);
                    i94 = i38;
                }
                int i97 = i92 - 51;
                int i98 = charAt25;
                if (i97 == 9 || i97 == 17) {
                    i37 = i94;
                    objArr[I1.w.a(i81, 3, 2, 1)] = objects[i15];
                    i15++;
                } else if (i97 != 12 || (!rawMessageInfo.getSyntax().equals(G.PROTO2) && (charAt24 & LEGACY_ENUM_IS_CLOSED_BIT) == 0)) {
                    i37 = i94;
                } else {
                    i37 = i94;
                    objArr[I1.w.a(i81, 3, 2, 1)] = objects[i15];
                    i15++;
                }
                int i99 = i98 * 2;
                Object obj = objects[i99];
                if (obj instanceof java.lang.reflect.Field) {
                    reflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    reflectField2 = reflectField(cls, (String) obj);
                    objects[i99] = reflectField2;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(reflectField2);
                int i100 = i99 + 1;
                Object obj2 = objects[i100];
                if (obj2 instanceof java.lang.reflect.Field) {
                    reflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    reflectField3 = reflectField(cls, (String) obj2);
                    objects[i100] = reflectField3;
                }
                i35 = objectFieldOffset2;
                i33 = i37;
                i29 = i77;
                i32 = (int) unsafe.objectFieldOffset(reflectField3);
                i34 = 0;
            } else {
                int i101 = i15 + 1;
                java.lang.reflect.Field reflectField4 = reflectField(cls, (String) objects[i15]);
                if (i92 == 9 || i92 == 17) {
                    i29 = i77;
                    objArr[I1.w.a(i81, 3, 2, 1)] = reflectField4.getType();
                } else {
                    if (i92 == 27 || i92 == 49) {
                        i29 = i77;
                        i36 = i15 + 2;
                        objArr[I1.w.a(i81, 3, 2, 1)] = objects[i101];
                    } else if (i92 == 12 || i92 == 30 || i92 == 44) {
                        i29 = i77;
                        if (rawMessageInfo.getSyntax() == G.PROTO2 || (charAt24 & LEGACY_ENUM_IS_CLOSED_BIT) != 0) {
                            i36 = i15 + 2;
                            objArr[I1.w.a(i81, 3, 2, 1)] = objects[i101];
                        }
                    } else if (i92 == 50) {
                        int i102 = i79 + 1;
                        iArr[i79] = i81;
                        int i103 = (i81 / 3) * 2;
                        int i104 = i15 + 2;
                        objArr[i103] = objects[i101];
                        if ((charAt24 & LEGACY_ENUM_IS_CLOSED_BIT) != 0) {
                            i31 = i15 + 3;
                            objArr[i103 + 1] = objects[i104];
                            i29 = i77;
                            i79 = i102;
                        } else {
                            i31 = i104;
                            i79 = i102;
                            i29 = i77;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                        if ((charAt24 & 4096) != 0 || i92 > 17) {
                            i32 = 1048575;
                            i33 = i87;
                            i34 = 0;
                        } else {
                            int i105 = i87 + 1;
                            int charAt26 = stringInfo.charAt(i87);
                            if (charAt26 >= 55296) {
                                int i106 = charAt26 & 8191;
                                int i107 = 13;
                                while (true) {
                                    i33 = i105 + 1;
                                    charAt10 = stringInfo.charAt(i105);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i106 |= (charAt10 & 8191) << i107;
                                    i107 += 13;
                                    i105 = i33;
                                }
                                charAt26 = i106 | (charAt10 << i107);
                            } else {
                                i33 = i105;
                            }
                            int i108 = (charAt26 / 32) + (i93 * 2);
                            Object obj3 = objects[i108];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                reflectField = (java.lang.reflect.Field) obj3;
                            } else {
                                reflectField = reflectField(cls, (String) obj3);
                                objects[i108] = reflectField;
                            }
                            i32 = (int) unsafe.objectFieldOffset(reflectField);
                            i34 = charAt26 % 32;
                        }
                        if (i92 >= 18 && i92 <= 49) {
                            iArr[i78] = objectFieldOffset;
                            i78++;
                        }
                        i15 = i31;
                        i35 = objectFieldOffset;
                    } else {
                        i29 = i77;
                    }
                    i31 = i36;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i32 = 1048575;
                    i33 = i87;
                    i34 = 0;
                    if (i92 >= 18) {
                        iArr[i78] = objectFieldOffset;
                        i78++;
                    }
                    i15 = i31;
                    i35 = objectFieldOffset;
                }
                i31 = i101;
                objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                if ((charAt24 & 4096) != 0) {
                }
                i32 = 1048575;
                i33 = i87;
                i34 = 0;
                if (i92 >= 18) {
                }
                i15 = i31;
                i35 = objectFieldOffset;
            }
            int i109 = i81 + 1;
            iArr4[i81] = i88;
            int i110 = i81 + 2;
            String str = stringInfo;
            iArr4[i109] = ((charAt24 & 512) != 0 ? ENFORCE_UTF8_MASK : 0) | ((charAt24 & 256) != 0 ? REQUIRED_MASK : 0) | ((charAt24 & LEGACY_ENUM_IS_CLOSED_BIT) != 0 ? Integer.MIN_VALUE : 0) | (i92 << 20) | i35;
            i81 += 3;
            iArr4[i110] = (i34 << 20) | i32;
            stringInfo = str;
            i16 = i93;
            length = i27;
            i77 = i29;
            i45 = i33;
            iArr3 = iArr4;
            i43 = 55296;
        }
        return new MessageSchema<>(iArr3, objArr, i12, i14, rawMessageInfo.getDefaultInstance(), false, iArr, i17, i77, c11, interfaceC5967s, n11, abstractC5958i, wVar);
    }

    private int numberAt(int i11) {
        return this.buffer[i11];
    }

    private static long offset(int i11) {
        return i11 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t2, long j11) {
        return ((Boolean) UnsafeUtil.y(t2, j11)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t2, long j11) {
        return ((Double) UnsafeUtil.y(t2, j11)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t2, long j11) {
        return ((Float) UnsafeUtil.y(t2, j11)).floatValue();
    }

    private static <T> int oneofIntAt(T t2, long j11) {
        return ((Integer) UnsafeUtil.y(t2, j11)).intValue();
    }

    private static <T> long oneofLongAt(T t2, long j11) {
        return ((Long) UnsafeUtil.y(t2, j11)).longValue();
    }

    private <K, V> int parseMapField(T t2, byte[] bArr, int i11, int i12, int i13, long j11, C5951b.C0915b c0915b) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i13);
        Object object = unsafe.getObject(t2, j11);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(t2, j11, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i11, i12, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), c0915b);
    }

    private int parseOneofField(T t2, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, C5951b.C0915b c0915b) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j12 = this.buffer[i18 + 2] & 1048575;
        switch (i17) {
            case ONEOF_TYPE_OFFSET /* 51 */:
                if (i15 != 1) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Double.valueOf(C5951b.d(i11, bArr)));
                int i19 = i11 + 8;
                unsafe.putInt(t2, j12, i14);
                return i19;
            case 52:
                if (i15 != 5) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Float.valueOf(C5951b.k(i11, bArr)));
                int i21 = i11 + 4;
                unsafe.putInt(t2, j12, i14);
                return i21;
            case 53:
            case 54:
                if (i15 != 0) {
                    return i11;
                }
                int I11 = C5951b.I(bArr, i11, c0915b);
                unsafe.putObject(t2, j11, Long.valueOf(c0915b.f60196b));
                unsafe.putInt(t2, j12, i14);
                return I11;
            case 55:
            case 62:
                if (i15 != 0) {
                    return i11;
                }
                int G11 = C5951b.G(bArr, i11, c0915b);
                unsafe.putObject(t2, j11, Integer.valueOf(c0915b.f60195a));
                unsafe.putInt(t2, j12, i14);
                return G11;
            case 56:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                if (i15 != 1) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Long.valueOf(C5951b.i(i11, bArr)));
                int i22 = i11 + 8;
                unsafe.putInt(t2, j12, i14);
                return i22;
            case 57:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                if (i15 != 5) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Integer.valueOf(C5951b.g(i11, bArr)));
                int i23 = i11 + 4;
                unsafe.putInt(t2, j12, i14);
                return i23;
            case 58:
                if (i15 != 0) {
                    return i11;
                }
                int I12 = C5951b.I(bArr, i11, c0915b);
                unsafe.putObject(t2, j11, Boolean.valueOf(c0915b.f60196b != 0));
                unsafe.putInt(t2, j12, i14);
                return I12;
            case 59:
                if (i15 != 2) {
                    return i11;
                }
                int G12 = C5951b.G(bArr, i11, c0915b);
                int i24 = c0915b.f60195a;
                if (i24 == 0) {
                    unsafe.putObject(t2, j11, "");
                } else {
                    if ((i16 & ENFORCE_UTF8_MASK) != 0 && !Utf8.o(bArr, G12, G12 + i24)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t2, j11, new String(bArr, G12, i24, Internal.f60125a));
                    G12 += i24;
                }
                unsafe.putInt(t2, j12, i14);
                return G12;
            case 60:
                if (i15 != 2) {
                    return i11;
                }
                Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t2, i14, i18);
                int L11 = C5951b.L(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i18), bArr, i11, i12, c0915b);
                storeOneofMessageField(t2, i14, i18, mutableOneofMessageFieldForMerge);
                return L11;
            case 61:
                if (i15 != 2) {
                    return i11;
                }
                int b11 = C5951b.b(bArr, i11, c0915b);
                unsafe.putObject(t2, j11, c0915b.f60197c);
                unsafe.putInt(t2, j12, i14);
                return b11;
            case 63:
                if (i15 != 0) {
                    return i11;
                }
                int G13 = C5951b.G(bArr, i11, c0915b);
                int i25 = c0915b.f60195a;
                Internal.c enumFieldVerifier = getEnumFieldVerifier(i18);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i25)) {
                    getMutableUnknownFields(t2).l(i13, Long.valueOf(i25));
                    return G13;
                }
                unsafe.putObject(t2, j11, Integer.valueOf(i25));
                unsafe.putInt(t2, j12, i14);
                return G13;
            case 66:
                if (i15 != 0) {
                    return i11;
                }
                int G14 = C5951b.G(bArr, i11, c0915b);
                unsafe.putObject(t2, j11, Integer.valueOf(CodedInputStream.decodeZigZag32(c0915b.f60195a)));
                unsafe.putInt(t2, j12, i14);
                return G14;
            case 67:
                if (i15 != 0) {
                    return i11;
                }
                int I13 = C5951b.I(bArr, i11, c0915b);
                unsafe.putObject(t2, j11, Long.valueOf(CodedInputStream.decodeZigZag64(c0915b.f60196b)));
                unsafe.putInt(t2, j12, i14);
                return I13;
            case 68:
                if (i15 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t2, i14, i18);
                    int K11 = C5951b.K(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i18), bArr, i11, i12, (i13 & (-8)) | 4, c0915b);
                    storeOneofMessageField(t2, i14, i18, mutableOneofMessageFieldForMerge2);
                    return K11;
                }
                break;
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t2, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11, int i17, long j12, C5951b.C0915b c0915b) throws IOException {
        int H11;
        Unsafe unsafe = UNSAFE;
        Internal.e eVar = (Internal.e) unsafe.getObject(t2, j12);
        if (!eVar.isModifiable()) {
            eVar = eVar.mutableCopyWithCapacity2(eVar.size() * 2);
            unsafe.putObject(t2, j12, eVar);
        }
        Internal.e eVar2 = eVar;
        switch (i17) {
            case 18:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                if (i15 == 2) {
                    return C5951b.q(bArr, i11, eVar2, c0915b);
                }
                if (i15 == 1) {
                    return C5951b.e(i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case 19:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i15 == 2) {
                    return C5951b.t(bArr, i11, eVar2, c0915b);
                }
                if (i15 == 5) {
                    return C5951b.l(i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case 20:
            case 21:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
                if (i15 == 2) {
                    return C5951b.x(bArr, i11, eVar2, c0915b);
                }
                if (i15 == 0) {
                    return C5951b.J(i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case 22:
            case 29:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i15 == 2) {
                    return C5951b.w(bArr, i11, eVar2, c0915b);
                }
                if (i15 == 0) {
                    return C5951b.H(i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i15 == 2) {
                    return C5951b.s(bArr, i11, eVar2, c0915b);
                }
                if (i15 == 1) {
                    return C5951b.j(i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case 24:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 41:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i15 == 2) {
                    return C5951b.r(bArr, i11, eVar2, c0915b);
                }
                if (i15 == 5) {
                    return C5951b.h(i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case 42:
                if (i15 == 2) {
                    return C5951b.p(bArr, i11, eVar2, c0915b);
                }
                if (i15 == 0) {
                    return C5951b.a(i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                if (i15 == 2) {
                    return (j11 & 536870912) == 0 ? C5951b.B(i13, bArr, i11, i12, eVar2, c0915b) : C5951b.C(i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (i15 == 2) {
                    return C5951b.o(getMessageFieldSchema(i16), i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case 28:
                if (i15 == 2) {
                    return C5951b.c(i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i15 != 2) {
                    if (i15 == 0) {
                        H11 = C5951b.H(i13, bArr, i11, i12, eVar2, c0915b);
                    }
                    return i11;
                }
                H11 = C5951b.w(bArr, i11, eVar2, c0915b);
                L.k(t2, i14, eVar2, getEnumFieldVerifier(i16), null, this.unknownFieldSchema);
                return H11;
            case 33:
            case 47:
                if (i15 == 2) {
                    return C5951b.u(bArr, i11, eVar2, c0915b);
                }
                if (i15 == 0) {
                    return C5951b.y(i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case 34:
            case 48:
                if (i15 == 2) {
                    return C5951b.v(bArr, i11, eVar2, c0915b);
                }
                if (i15 == 0) {
                    return C5951b.z(i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            case 49:
                if (i15 == 3) {
                    return C5951b.m(getMessageFieldSchema(i16), i13, bArr, i11, i12, eVar2, c0915b);
                }
                return i11;
            default:
                return i11;
        }
    }

    private int positionForFieldNumber(int i11) {
        if (i11 < this.minFieldNumber || i11 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i11, 0);
    }

    private int presenceMaskAndOffsetAt(int i11) {
        return this.buffer[i11 + 2];
    }

    private <E> void readGroupList(Object obj, long j11, I i11, J<E> j12, C5957h c5957h) throws IOException {
        i11.readGroupList(this.listFieldSchema.mutableListAt(obj, j11), j12, c5957h);
    }

    private <E> void readMessageList(Object obj, int i11, I i12, J<E> j11, C5957h c5957h) throws IOException {
        i12.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i11)), j11, c5957h);
    }

    private void readString(Object obj, int i11, I i12) throws IOException {
        if (isEnforceUtf8(i11)) {
            UnsafeUtil.M(obj, offset(i11), i12.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.M(obj, offset(i11), i12.readString());
        } else {
            UnsafeUtil.M(obj, offset(i11), i12.readBytes());
        }
    }

    private void readStringList(Object obj, int i11, I i12) throws IOException {
        if (isEnforceUtf8(i11)) {
            i12.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i11)));
        } else {
            i12.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i11)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e11) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder b11 = C6594f.b("Field ", str, " for ");
            b11.append(cls.getName());
            b11.append(" not found. Known fields are ");
            b11.append(Arrays.toString(declaredFields));
            throw new RuntimeException(b11.toString(), e11);
        }
    }

    private void setFieldPresent(T t2, int i11) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i11);
        long j11 = 1048575 & presenceMaskAndOffsetAt;
        if (j11 == 1048575) {
            return;
        }
        UnsafeUtil.K(t2, j11, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.v(t2, j11));
    }

    private void setOneofPresent(T t2, int i11, int i12) {
        UnsafeUtil.K(t2, presenceMaskAndOffsetAt(i12) & 1048575, i11);
    }

    private int slowPositionForFieldNumber(int i11, int i12) {
        int length = (this.buffer.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int numberAt = numberAt(i14);
            if (i11 == numberAt) {
                return i14;
            }
            if (i11 < numberAt) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    private static void storeFieldData(C5960k c5960k, int[] iArr, int i11, Object[] objArr) {
        throw null;
    }

    private void storeMessageField(T t2, int i11, Object obj) {
        UNSAFE.putObject(t2, offset(typeAndOffsetAt(i11)), obj);
        setFieldPresent(t2, i11);
    }

    private void storeOneofMessageField(T t2, int i11, int i12, Object obj) {
        UNSAFE.putObject(t2, offset(typeAndOffsetAt(i12)), obj);
        setOneofPresent(t2, i11, i12);
    }

    private static int type(int i11) {
        return (i11 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i11) {
        return this.buffer[i11 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInAscendingOrder(T t2, T t11) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i11;
        boolean z11;
        Map.Entry<?, ?> entry2;
        int i12;
        int i13;
        int i14;
        boolean z12;
        MessageSchema<T> messageSchema = this;
        if (messageSchema.hasExtensions) {
            C5961l<?> extensions = messageSchema.extensionSchema.getExtensions(t2);
            if (!extensions.q()) {
                Iterator<Map.Entry<?, Object>> u11 = extensions.u();
                entry = (Map.Entry) u11.next();
                it = u11;
                length = messageSchema.buffer.length;
                Unsafe unsafe = UNSAFE;
                int i15 = 1048575;
                i11 = 0;
                int i16 = 0;
                while (i11 < length) {
                    int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i11);
                    int numberAt = messageSchema.numberAt(i11);
                    int type = type(typeAndOffsetAt);
                    if (type <= 17) {
                        int i17 = messageSchema.buffer[i11 + 2];
                        z11 = true;
                        int i18 = i17 & 1048575;
                        if (i18 != i15) {
                            i16 = i18 == 1048575 ? 0 : unsafe.getInt(t2, i18);
                            i15 = i18;
                        }
                        int i19 = 1 << (i17 >>> 20);
                        entry2 = entry;
                        i12 = i15;
                        i13 = i16;
                        i14 = i19;
                    } else {
                        z11 = true;
                        entry2 = entry;
                        i12 = i15;
                        i13 = i16;
                        i14 = 0;
                    }
                    while (entry2 != null && messageSchema.extensionSchema.extensionNumber(entry2) <= numberAt) {
                        messageSchema.extensionSchema.serializeExtension(t11, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long offset = offset(typeAndOffsetAt);
                    switch (type) {
                        case 0:
                            if (!messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                break;
                            } else {
                                t11.writeDouble(numberAt, doubleAt(t2, offset));
                                break;
                            }
                        case 1:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeFloat(numberAt, floatAt(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 2:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeInt64(numberAt, unsafe.getLong(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 3:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeUInt64(numberAt, unsafe.getLong(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 4:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeInt32(numberAt, unsafe.getInt(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 5:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeFixed64(numberAt, unsafe.getLong(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 6:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeFixed32(numberAt, unsafe.getInt(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 7:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeBool(numberAt, booleanAt(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 8:
                            if (!messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                break;
                            } else {
                                messageSchema.writeString(numberAt, unsafe.getObject(t2, offset), t11);
                                break;
                            }
                        case 9:
                            if (!messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                break;
                            } else {
                                t11.writeMessage(numberAt, unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i11));
                                break;
                            }
                        case 10:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeBytes(numberAt, (ByteString) unsafe.getObject(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 11:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeUInt32(numberAt, unsafe.getInt(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 12:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeEnum(numberAt, unsafe.getInt(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 13:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeSFixed32(numberAt, unsafe.getInt(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 14:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeSFixed64(numberAt, unsafe.getLong(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 15:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeSInt32(numberAt, unsafe.getInt(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 16:
                            if (messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                t11.writeSInt64(numberAt, unsafe.getLong(t2, offset));
                            }
                            messageSchema = this;
                            break;
                        case 17:
                            if (!messageSchema.isFieldPresent(t2, i11, i12, i13, i14)) {
                                break;
                            } else {
                                t11.writeGroup(numberAt, unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i11));
                                break;
                            }
                        case 18:
                            L.r(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case 19:
                            L.u(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case 20:
                            L.w(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case 21:
                            L.C(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case 22:
                            L.v(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case 23:
                            L.t(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case 24:
                            L.s(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            L.q(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            int numberAt2 = messageSchema.numberAt(i11);
                            List<String> list = (List) unsafe.getObject(t2, offset);
                            int i21 = L.f60134d;
                            if (list != null && !list.isEmpty()) {
                                t11.writeStringList(numberAt2, list);
                            }
                            break;
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            int numberAt3 = messageSchema.numberAt(i11);
                            List<?> list2 = (List) unsafe.getObject(t2, offset);
                            J messageFieldSchema = messageSchema.getMessageFieldSchema(i11);
                            int i22 = L.f60134d;
                            if (list2 != null && !list2.isEmpty()) {
                                t11.writeMessageList(numberAt3, list2, messageFieldSchema);
                            }
                            break;
                        case 28:
                            int numberAt4 = messageSchema.numberAt(i11);
                            List<ByteString> list3 = (List) unsafe.getObject(t2, offset);
                            int i23 = L.f60134d;
                            if (list3 != null && !list3.isEmpty()) {
                                t11.writeBytesList(numberAt4, list3);
                            }
                            break;
                        case 29:
                            z12 = false;
                            L.B(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            z12 = false;
                            int numberAt5 = messageSchema.numberAt(i11);
                            List<Integer> list4 = (List) unsafe.getObject(t2, offset);
                            int i24 = L.f60134d;
                            if (list4 != null && !list4.isEmpty()) {
                                t11.writeEnumList(numberAt5, list4, false);
                            }
                            break;
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            z12 = false;
                            L.x(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case 32:
                            z12 = false;
                            L.y(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case 33:
                            z12 = false;
                            L.z(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case 34:
                            z12 = false;
                            L.A(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, false);
                            break;
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            L.r(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            L.u(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            L.w(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case 38:
                            L.C(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            L.v(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case 40:
                            L.t(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case 41:
                            L.s(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case 42:
                            L.q(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case 43:
                            L.B(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            boolean z13 = z11;
                            int numberAt6 = messageSchema.numberAt(i11);
                            List<Integer> list5 = (List) unsafe.getObject(t2, offset);
                            int i25 = L.f60134d;
                            if (list5 != null && !list5.isEmpty()) {
                                t11.writeEnumList(numberAt6, list5, z13);
                            }
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            L.x(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case 46:
                            L.y(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case 47:
                            L.z(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case 48:
                            L.A(messageSchema.numberAt(i11), (List) unsafe.getObject(t2, offset), t11, z11);
                            break;
                        case 49:
                            int numberAt7 = messageSchema.numberAt(i11);
                            List<?> list6 = (List) unsafe.getObject(t2, offset);
                            J messageFieldSchema2 = messageSchema.getMessageFieldSchema(i11);
                            int i26 = L.f60134d;
                            if (list6 != null && !list6.isEmpty()) {
                                t11.writeGroupList(numberAt7, list6, messageFieldSchema2);
                            }
                            break;
                        case 50:
                            messageSchema.writeMapHelper(t11, numberAt, unsafe.getObject(t2, offset), i11);
                            break;
                        case ONEOF_TYPE_OFFSET /* 51 */:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeDouble(numberAt, oneofDoubleAt(t2, offset));
                            }
                            break;
                        case 52:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeFloat(numberAt, oneofFloatAt(t2, offset));
                            }
                            break;
                        case 53:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeInt64(numberAt, oneofLongAt(t2, offset));
                            }
                            break;
                        case 54:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeUInt64(numberAt, oneofLongAt(t2, offset));
                            }
                            break;
                        case 55:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeInt32(numberAt, oneofIntAt(t2, offset));
                            }
                            break;
                        case 56:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeFixed64(numberAt, oneofLongAt(t2, offset));
                            }
                            break;
                        case 57:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeFixed32(numberAt, oneofIntAt(t2, offset));
                            }
                            break;
                        case 58:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeBool(numberAt, oneofBooleanAt(t2, offset));
                            }
                            break;
                        case 59:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                messageSchema.writeString(numberAt, unsafe.getObject(t2, offset), t11);
                            }
                            break;
                        case 60:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeMessage(numberAt, unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i11));
                            }
                            break;
                        case 61:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeBytes(numberAt, (ByteString) unsafe.getObject(t2, offset));
                            }
                            break;
                        case 62:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeUInt32(numberAt, oneofIntAt(t2, offset));
                            }
                            break;
                        case 63:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeEnum(numberAt, oneofIntAt(t2, offset));
                            }
                            break;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeSFixed32(numberAt, oneofIntAt(t2, offset));
                            }
                            break;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeSFixed64(numberAt, oneofLongAt(t2, offset));
                            }
                            break;
                        case 66:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeSInt32(numberAt, oneofIntAt(t2, offset));
                            }
                            break;
                        case 67:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeSInt64(numberAt, oneofLongAt(t2, offset));
                            }
                            break;
                        case 68:
                            if (messageSchema.isOneofPresent(t2, numberAt, i11)) {
                                t11.writeGroup(numberAt, unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i11));
                            }
                            break;
                    }
                    i11 += 3;
                    i16 = i13;
                    i15 = i12;
                    entry = entry2;
                }
                while (entry != null) {
                    messageSchema.extensionSchema.serializeExtension(t11, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, t2, t11);
            }
        }
        entry = null;
        it = null;
        length = messageSchema.buffer.length;
        Unsafe unsafe2 = UNSAFE;
        int i152 = 1048575;
        i11 = 0;
        int i162 = 0;
        while (i11 < length) {
        }
        while (entry != null) {
        }
        messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, t2, t11);
    }

    /* JADX WARN: Removed duplicated region for block: B:311:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInDescendingOrder(T t2, T t11) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        writeUnknownInMessageTo(this.unknownFieldSchema, t2, t11);
        if (this.hasExtensions) {
            C5961l<?> extensions = this.extensionSchema.getExtensions(t2);
            if (!extensions.q()) {
                it = extensions.g();
                entry = (Map.Entry) it.next();
                for (length = this.buffer.length - 3; length >= 0; length -= 3) {
                    int typeAndOffsetAt = typeAndOffsetAt(length);
                    int numberAt = numberAt(length);
                    while (entry != null && this.extensionSchema.extensionNumber(entry) > numberAt) {
                        this.extensionSchema.serializeExtension(t11, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (type(typeAndOffsetAt)) {
                        case 0:
                            if (isFieldPresent(t2, length)) {
                                t11.writeDouble(numberAt, doubleAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (isFieldPresent(t2, length)) {
                                t11.writeFloat(numberAt, floatAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (isFieldPresent(t2, length)) {
                                t11.writeInt64(numberAt, longAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (isFieldPresent(t2, length)) {
                                t11.writeUInt64(numberAt, longAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (isFieldPresent(t2, length)) {
                                t11.writeInt32(numberAt, intAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (isFieldPresent(t2, length)) {
                                t11.writeFixed64(numberAt, longAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (isFieldPresent(t2, length)) {
                                t11.writeFixed32(numberAt, intAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (isFieldPresent(t2, length)) {
                                t11.writeBool(numberAt, booleanAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (isFieldPresent(t2, length)) {
                                writeString(numberAt, UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (isFieldPresent(t2, length)) {
                                t11.writeMessage(numberAt, UnsafeUtil.y(t2, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (isFieldPresent(t2, length)) {
                                t11.writeBytes(numberAt, (ByteString) UnsafeUtil.y(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (isFieldPresent(t2, length)) {
                                t11.writeUInt32(numberAt, intAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (isFieldPresent(t2, length)) {
                                t11.writeEnum(numberAt, intAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (isFieldPresent(t2, length)) {
                                t11.writeSFixed32(numberAt, intAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (isFieldPresent(t2, length)) {
                                t11.writeSFixed64(numberAt, longAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (isFieldPresent(t2, length)) {
                                t11.writeSInt32(numberAt, intAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (isFieldPresent(t2, length)) {
                                t11.writeSInt64(numberAt, longAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (isFieldPresent(t2, length)) {
                                t11.writeGroup(numberAt, UnsafeUtil.y(t2, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            L.r(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case 19:
                            L.u(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case 20:
                            L.w(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case 21:
                            L.C(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case 22:
                            L.v(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case 23:
                            L.t(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case 24:
                            L.s(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            L.q(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            List<String> list = (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt));
                            int i11 = L.f60134d;
                            if (list != null && !list.isEmpty()) {
                                t11.writeStringList(numberAt, list);
                                break;
                            }
                            break;
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            List<?> list2 = (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt));
                            J messageFieldSchema = getMessageFieldSchema(length);
                            int i12 = L.f60134d;
                            if (list2 != null && !list2.isEmpty()) {
                                t11.writeMessageList(numberAt, list2, messageFieldSchema);
                                break;
                            }
                            break;
                        case 28:
                            List<ByteString> list3 = (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt));
                            int i13 = L.f60134d;
                            if (list3 != null && !list3.isEmpty()) {
                                t11.writeBytesList(numberAt, list3);
                                break;
                            }
                            break;
                        case 29:
                            L.B(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            List<Integer> list4 = (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt));
                            int i14 = L.f60134d;
                            if (list4 != null && !list4.isEmpty()) {
                                t11.writeEnumList(numberAt, list4, false);
                                break;
                            }
                            break;
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            L.x(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case 32:
                            L.y(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case 33:
                            L.z(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case 34:
                            L.A(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, false);
                            break;
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            L.r(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            L.u(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            L.w(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case 38:
                            L.C(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            L.v(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case 40:
                            L.t(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case 41:
                            L.s(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case 42:
                            L.q(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case 43:
                            L.B(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            List<Integer> list5 = (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt));
                            int i15 = L.f60134d;
                            if (list5 != null && !list5.isEmpty()) {
                                t11.writeEnumList(numberAt, list5, true);
                                break;
                            }
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            L.x(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case 46:
                            L.y(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case 47:
                            L.z(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case 48:
                            L.A(numberAt, (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11, true);
                            break;
                        case 49:
                            List<?> list6 = (List) UnsafeUtil.y(t2, offset(typeAndOffsetAt));
                            J messageFieldSchema2 = getMessageFieldSchema(length);
                            int i16 = L.f60134d;
                            if (list6 != null && !list6.isEmpty()) {
                                t11.writeGroupList(numberAt, list6, messageFieldSchema2);
                                break;
                            }
                            break;
                        case 50:
                            writeMapHelper(t11, numberAt, UnsafeUtil.y(t2, offset(typeAndOffsetAt)), length);
                            break;
                        case ONEOF_TYPE_OFFSET /* 51 */:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeDouble(numberAt, oneofDoubleAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeFloat(numberAt, oneofFloatAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeInt64(numberAt, oneofLongAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeUInt64(numberAt, oneofLongAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeInt32(numberAt, oneofIntAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeFixed64(numberAt, oneofLongAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeFixed32(numberAt, oneofIntAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeBool(numberAt, oneofBooleanAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (isOneofPresent(t2, numberAt, length)) {
                                writeString(numberAt, UnsafeUtil.y(t2, offset(typeAndOffsetAt)), t11);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeMessage(numberAt, UnsafeUtil.y(t2, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeBytes(numberAt, (ByteString) UnsafeUtil.y(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeUInt32(numberAt, oneofIntAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeEnum(numberAt, oneofIntAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeSFixed32(numberAt, oneofIntAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeSFixed64(numberAt, oneofLongAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeSInt32(numberAt, oneofIntAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeSInt64(numberAt, oneofLongAt(t2, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (isOneofPresent(t2, numberAt, length)) {
                                t11.writeGroup(numberAt, UnsafeUtil.y(t2, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.extensionSchema.serializeExtension(t11, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
            }
        }
        it = null;
        entry = null;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    private <K, V> void writeMapHelper(T t2, int i11, Object obj, int i12) throws IOException {
        if (obj != null) {
            t2.writeMap(i11, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i12)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i11, Object obj, T t2) throws IOException {
        if (obj instanceof String) {
            t2.writeString(i11, (String) obj);
        } else {
            t2.writeBytes(i11, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(N<UT, UB> n11, T t2, T t11) throws IOException {
        n11.writeTo(n11.getFromMessage(t2), t11);
    }

    @Override // com.google.protobuf.J
    public boolean equals(T t2, T t11) {
        int length = this.buffer.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            if (!equals(t2, t11, i11)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t2).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t2).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // com.google.protobuf.J
    public int getSerializedSize(T t2) {
        int i11;
        Unsafe unsafe;
        int i12;
        int computeFloatSize;
        int computeInt64Size;
        int computeTagSize;
        int computeLengthDelimitedFieldSize;
        int computeSize;
        int computeBytesSize;
        int computeSFixed32Size;
        int computeTagSize2;
        int serializedSize;
        int computeTagSize3;
        int size;
        int i13;
        int computeTagSize4;
        int computeTagSize5;
        int computeTagSize6;
        int computeUInt32SizeNoTag;
        int i14;
        int computeDoubleSize;
        MessageSchema<T> messageSchema = this;
        T t11 = t2;
        int i15 = 1;
        Unsafe unsafe2 = UNSAFE;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i21 = 1048575;
        while (i17 < messageSchema.buffer.length) {
            int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i17);
            int type = type(typeAndOffsetAt);
            int numberAt = messageSchema.numberAt(i17);
            int i22 = messageSchema.buffer[i17 + 2];
            int i23 = i22 & i16;
            if (type <= 17) {
                if (i23 != i21) {
                    i18 = i23 == i16 ? 0 : unsafe2.getInt(t11, i23);
                    i21 = i23;
                }
                i11 = i15 << (i22 >>> 20);
            } else {
                i11 = 0;
            }
            int i24 = i19;
            long offset = offset(typeAndOffsetAt);
            if (type < EnumC5962m.DOUBLE_LIST_PACKED.a() || type > EnumC5962m.SINT64_LIST_PACKED.a()) {
                i23 = 0;
            }
            Unsafe unsafe3 = unsafe2;
            switch (type) {
                case 0:
                    int i25 = i11;
                    unsafe = unsafe3;
                    i12 = 1;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i25)) {
                        i19 = CodedOutputStream.computeDoubleSize(numberAt, 0.0d) + i24;
                        break;
                    }
                    i19 = i24;
                    break;
                case 1:
                    int i26 = i11;
                    unsafe = unsafe3;
                    i12 = 1;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i26)) {
                        computeFloatSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i19 = computeFloatSize + i24;
                        messageSchema = this;
                        t11 = t2;
                        break;
                    }
                    messageSchema = this;
                    t11 = t2;
                    i19 = i24;
                    break;
                case 2:
                    int i27 = i11;
                    unsafe = unsafe3;
                    i12 = 1;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i27)) {
                        computeInt64Size = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i19 = computeInt64Size + i24;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i19 = i24;
                    break;
                case 3:
                    int i28 = i11;
                    unsafe = unsafe3;
                    i12 = 1;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i28)) {
                        computeInt64Size = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i19 = computeInt64Size + i24;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i19 = i24;
                    break;
                case 4:
                    int i29 = i11;
                    unsafe = unsafe3;
                    i12 = 1;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i29)) {
                        computeInt64Size = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i19 = computeInt64Size + i24;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i19 = i24;
                    break;
                case 5:
                    int i31 = i11;
                    unsafe = unsafe3;
                    i12 = 1;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i31)) {
                        computeFloatSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i19 = computeFloatSize + i24;
                        messageSchema = this;
                        t11 = t2;
                        break;
                    }
                    messageSchema = this;
                    t11 = t2;
                    i19 = i24;
                    break;
                case 6:
                    int i32 = i11;
                    unsafe = unsafe3;
                    i12 = 1;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i32)) {
                        computeFloatSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i19 = computeFloatSize + i24;
                        messageSchema = this;
                        t11 = t2;
                        break;
                    }
                    messageSchema = this;
                    t11 = t2;
                    i19 = i24;
                    break;
                case 7:
                    unsafe = unsafe3;
                    boolean isFieldPresent = messageSchema.isFieldPresent(t11, i17, i21, i18, i11);
                    i12 = 1;
                    if (isFieldPresent) {
                        computeFloatSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i19 = computeFloatSize + i24;
                        messageSchema = this;
                        t11 = t2;
                        break;
                    }
                    messageSchema = this;
                    t11 = t2;
                    i19 = i24;
                    break;
                case 8:
                    unsafe = unsafe3;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i11)) {
                        Object object = unsafe.getObject(t11, offset);
                        i19 = (object instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object) : CodedOutputStream.computeStringSize(numberAt, (String) object)) + i24;
                        i12 = 1;
                        messageSchema = this;
                        break;
                    }
                    i12 = 1;
                    messageSchema = this;
                    i19 = i24;
                    break;
                case 9:
                    unsafe = unsafe3;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i11)) {
                        Object object2 = unsafe.getObject(t11, offset);
                        J messageFieldSchema = messageSchema.getMessageFieldSchema(i17);
                        int i33 = L.f60134d;
                        if (object2 instanceof r) {
                            computeSize = ((r) object2).computeSize(numberAt);
                            i19 = i24 + computeSize;
                            i12 = 1;
                            break;
                        } else {
                            computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                            computeLengthDelimitedFieldSize = CodedOutputStream.computeLengthDelimitedFieldSize(((AbstractMessageLite) object2).getSerializedSize(messageFieldSchema));
                            computeSize = computeLengthDelimitedFieldSize + computeTagSize;
                            i19 = i24 + computeSize;
                            i12 = 1;
                        }
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 10:
                    unsafe = unsafe3;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i11)) {
                        computeBytesSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t11, offset));
                        i19 = computeBytesSize + i24;
                        i12 = 1;
                        messageSchema = this;
                        break;
                    }
                    i12 = 1;
                    messageSchema = this;
                    i19 = i24;
                    break;
                case 11:
                    unsafe = unsafe3;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i11)) {
                        computeBytesSize = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i19 = computeBytesSize + i24;
                        i12 = 1;
                        messageSchema = this;
                        break;
                    }
                    i12 = 1;
                    messageSchema = this;
                    i19 = i24;
                    break;
                case 12:
                    unsafe = unsafe3;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i11)) {
                        computeBytesSize = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t11, offset));
                        i19 = computeBytesSize + i24;
                        i12 = 1;
                        messageSchema = this;
                        break;
                    }
                    i12 = 1;
                    messageSchema = this;
                    i19 = i24;
                    break;
                case 13:
                    unsafe = unsafe3;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i11)) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i19 = computeSFixed32Size + i24;
                        messageSchema = this;
                        t11 = t2;
                        i12 = 1;
                        break;
                    }
                    messageSchema = this;
                    t11 = t2;
                    i12 = 1;
                    i19 = i24;
                    break;
                case 14:
                    unsafe = unsafe3;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i11)) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i19 = computeSFixed32Size + i24;
                        messageSchema = this;
                        t11 = t2;
                        i12 = 1;
                        break;
                    }
                    messageSchema = this;
                    t11 = t2;
                    i12 = 1;
                    i19 = i24;
                    break;
                case 15:
                    unsafe = unsafe3;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i11)) {
                        computeBytesSize = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i19 = computeBytesSize + i24;
                        i12 = 1;
                        messageSchema = this;
                        break;
                    }
                    i12 = 1;
                    messageSchema = this;
                    i19 = i24;
                    break;
                case 16:
                    unsafe = unsafe3;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i11)) {
                        computeBytesSize = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i19 = computeBytesSize + i24;
                        i12 = 1;
                        messageSchema = this;
                        break;
                    }
                    i12 = 1;
                    messageSchema = this;
                    i19 = i24;
                    break;
                case 17:
                    unsafe = unsafe3;
                    if (messageSchema.isFieldPresent(t11, i17, i21, i18, i11)) {
                        MessageLite messageLite = (MessageLite) unsafe.getObject(t11, offset);
                        J messageFieldSchema2 = messageSchema.getMessageFieldSchema(i17);
                        int i34 = L.f60134d;
                        computeTagSize2 = CodedOutputStream.computeTagSize(numberAt) * 2;
                        serializedSize = ((AbstractMessageLite) messageLite).getSerializedSize(messageFieldSchema2);
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 18:
                    unsafe = unsafe3;
                    computeSize = L.c(numberAt, (List) unsafe.getObject(t11, offset));
                    i19 = i24 + computeSize;
                    i12 = 1;
                    break;
                case 19:
                    unsafe = unsafe3;
                    computeSize = L.b(numberAt, (List) unsafe.getObject(t11, offset));
                    i19 = i24 + computeSize;
                    i12 = 1;
                    break;
                case 20:
                    unsafe = unsafe3;
                    List list = (List) unsafe.getObject(t11, offset);
                    int i35 = L.f60134d;
                    if (list.size() != 0) {
                        computeTagSize3 = (CodedOutputStream.computeTagSize(numberAt) * list.size()) + L.e(list);
                        i19 = i24 + computeTagSize3;
                        i12 = 1;
                        break;
                    }
                    computeTagSize3 = 0;
                    i19 = i24 + computeTagSize3;
                    i12 = 1;
                case 21:
                    unsafe = unsafe3;
                    List list2 = (List) unsafe.getObject(t11, offset);
                    int i36 = L.f60134d;
                    size = list2.size();
                    if (size != 0) {
                        i13 = L.i(list2);
                        computeTagSize4 = CodedOutputStream.computeTagSize(numberAt);
                        computeTagSize3 = (computeTagSize4 * size) + i13;
                        i19 = i24 + computeTagSize3;
                        i12 = 1;
                        break;
                    }
                    computeTagSize3 = 0;
                    i19 = i24 + computeTagSize3;
                    i12 = 1;
                case 22:
                    unsafe = unsafe3;
                    List list3 = (List) unsafe.getObject(t11, offset);
                    int i37 = L.f60134d;
                    size = list3.size();
                    if (size != 0) {
                        i13 = L.d(list3);
                        computeTagSize4 = CodedOutputStream.computeTagSize(numberAt);
                        computeTagSize3 = (computeTagSize4 * size) + i13;
                        i19 = i24 + computeTagSize3;
                        i12 = 1;
                        break;
                    }
                    computeTagSize3 = 0;
                    i19 = i24 + computeTagSize3;
                    i12 = 1;
                case 23:
                    unsafe = unsafe3;
                    computeSize = L.c(numberAt, (List) unsafe.getObject(t11, offset));
                    i19 = i24 + computeSize;
                    i12 = 1;
                    break;
                case 24:
                    unsafe = unsafe3;
                    computeSize = L.b(numberAt, (List) unsafe.getObject(t11, offset));
                    i19 = i24 + computeSize;
                    i12 = 1;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    unsafe = unsafe3;
                    List list4 = (List) unsafe.getObject(t11, offset);
                    int i38 = L.f60134d;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        computeTagSize3 = CodedOutputStream.computeBoolSize(numberAt, true) * size2;
                        i19 = i24 + computeTagSize3;
                        i12 = 1;
                        break;
                    }
                    computeTagSize3 = 0;
                    i19 = i24 + computeTagSize3;
                    i12 = 1;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    unsafe = unsafe3;
                    List list5 = (List) unsafe.getObject(t11, offset);
                    int i39 = L.f60134d;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        computeTagSize3 = CodedOutputStream.computeTagSize(numberAt) * size3;
                        if (list5 instanceof LazyStringList) {
                            LazyStringList lazyStringList = (LazyStringList) list5;
                            for (int i41 = 0; i41 < size3; i41++) {
                                Object raw = lazyStringList.getRaw(i41);
                                computeTagSize3 = (raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw)) + computeTagSize3;
                            }
                        } else {
                            for (int i42 = 0; i42 < size3; i42++) {
                                Object obj = list5.get(i42);
                                computeTagSize3 = (obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj)) + computeTagSize3;
                            }
                        }
                        i19 = i24 + computeTagSize3;
                        i12 = 1;
                        break;
                    }
                    computeTagSize3 = 0;
                    i19 = i24 + computeTagSize3;
                    i12 = 1;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    unsafe = unsafe3;
                    List list6 = (List) unsafe.getObject(t11, offset);
                    J messageFieldSchema3 = messageSchema.getMessageFieldSchema(i17);
                    int i43 = L.f60134d;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        computeTagSize5 = 0;
                    } else {
                        computeTagSize5 = CodedOutputStream.computeTagSize(numberAt) * size4;
                        for (int i44 = 0; i44 < size4; i44++) {
                            Object obj2 = list6.get(i44);
                            computeTagSize5 = obj2 instanceof r ? ((r) obj2).computeSizeNoTag() + computeTagSize5 : computeTagSize5 + CodedOutputStream.computeLengthDelimitedFieldSize(((AbstractMessageLite) obj2).getSerializedSize(messageFieldSchema3));
                        }
                    }
                    i19 = i24 + computeTagSize5;
                    i12 = 1;
                    break;
                case 28:
                    unsafe = unsafe3;
                    List list7 = (List) unsafe.getObject(t11, offset);
                    int i45 = L.f60134d;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        computeTagSize3 = CodedOutputStream.computeTagSize(numberAt) * size5;
                        for (int i46 = 0; i46 < list7.size(); i46++) {
                            computeTagSize3 += CodedOutputStream.computeBytesSizeNoTag((ByteString) list7.get(i46));
                        }
                        i19 = i24 + computeTagSize3;
                        i12 = 1;
                        break;
                    }
                    computeTagSize3 = 0;
                    i19 = i24 + computeTagSize3;
                    i12 = 1;
                case 29:
                    unsafe = unsafe3;
                    List list8 = (List) unsafe.getObject(t11, offset);
                    int i47 = L.f60134d;
                    size = list8.size();
                    if (size != 0) {
                        i13 = L.h(list8);
                        computeTagSize4 = CodedOutputStream.computeTagSize(numberAt);
                        computeTagSize3 = (computeTagSize4 * size) + i13;
                        i19 = i24 + computeTagSize3;
                        i12 = 1;
                        break;
                    }
                    computeTagSize3 = 0;
                    i19 = i24 + computeTagSize3;
                    i12 = 1;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    unsafe = unsafe3;
                    List list9 = (List) unsafe.getObject(t11, offset);
                    int i48 = L.f60134d;
                    size = list9.size();
                    if (size != 0) {
                        i13 = L.a(list9);
                        computeTagSize4 = CodedOutputStream.computeTagSize(numberAt);
                        computeTagSize3 = (computeTagSize4 * size) + i13;
                        i19 = i24 + computeTagSize3;
                        i12 = 1;
                        break;
                    }
                    computeTagSize3 = 0;
                    i19 = i24 + computeTagSize3;
                    i12 = 1;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    unsafe = unsafe3;
                    computeSize = L.b(numberAt, (List) unsafe.getObject(t11, offset));
                    i19 = i24 + computeSize;
                    i12 = 1;
                    break;
                case 32:
                    unsafe = unsafe3;
                    computeSize = L.c(numberAt, (List) unsafe.getObject(t11, offset));
                    i19 = i24 + computeSize;
                    i12 = 1;
                    break;
                case 33:
                    unsafe = unsafe3;
                    List list10 = (List) unsafe.getObject(t11, offset);
                    int i49 = L.f60134d;
                    size = list10.size();
                    if (size != 0) {
                        i13 = L.f(list10);
                        computeTagSize4 = CodedOutputStream.computeTagSize(numberAt);
                        computeTagSize3 = (computeTagSize4 * size) + i13;
                        i19 = i24 + computeTagSize3;
                        i12 = 1;
                        break;
                    }
                    computeTagSize3 = 0;
                    i19 = i24 + computeTagSize3;
                    i12 = 1;
                case 34:
                    unsafe = unsafe3;
                    List list11 = (List) unsafe.getObject(t11, offset);
                    int i51 = L.f60134d;
                    size = list11.size();
                    if (size != 0) {
                        i13 = L.g(list11);
                        computeTagSize4 = CodedOutputStream.computeTagSize(numberAt);
                        computeTagSize3 = (computeTagSize4 * size) + i13;
                        i19 = i24 + computeTagSize3;
                        i12 = 1;
                        break;
                    }
                    computeTagSize3 = 0;
                    i19 = i24 + computeTagSize3;
                    i12 = 1;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    unsafe = unsafe3;
                    List list12 = (List) unsafe.getObject(t11, offset);
                    int i52 = L.f60134d;
                    serializedSize = list12.size() * 8;
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    unsafe = unsafe3;
                    List list13 = (List) unsafe.getObject(t11, offset);
                    int i53 = L.f60134d;
                    serializedSize = list13.size() * 4;
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    unsafe = unsafe3;
                    serializedSize = L.e((List) unsafe.getObject(t11, offset));
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 38:
                    unsafe = unsafe3;
                    serializedSize = L.i((List) unsafe.getObject(t11, offset));
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    unsafe = unsafe3;
                    serializedSize = L.d((List) unsafe.getObject(t11, offset));
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 40:
                    unsafe = unsafe3;
                    List list14 = (List) unsafe.getObject(t11, offset);
                    int i54 = L.f60134d;
                    serializedSize = list14.size() * 8;
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 41:
                    unsafe = unsafe3;
                    List list15 = (List) unsafe.getObject(t11, offset);
                    int i55 = L.f60134d;
                    serializedSize = list15.size() * 4;
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 42:
                    unsafe = unsafe3;
                    List list16 = (List) unsafe.getObject(t11, offset);
                    int i56 = L.f60134d;
                    serializedSize = list16.size();
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 43:
                    unsafe = unsafe3;
                    serializedSize = L.h((List) unsafe.getObject(t11, offset));
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    unsafe = unsafe3;
                    serializedSize = L.a((List) unsafe.getObject(t11, offset));
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    unsafe = unsafe3;
                    List list17 = (List) unsafe.getObject(t11, offset);
                    int i57 = L.f60134d;
                    serializedSize = list17.size() * 4;
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 46:
                    unsafe = unsafe3;
                    List list18 = (List) unsafe.getObject(t11, offset);
                    int i58 = L.f60134d;
                    serializedSize = list18.size() * 8;
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 47:
                    unsafe = unsafe3;
                    serializedSize = L.f((List) unsafe.getObject(t11, offset));
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 48:
                    unsafe = unsafe3;
                    serializedSize = L.g((List) unsafe.getObject(t11, offset));
                    if (serializedSize > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i23, serializedSize);
                        }
                        computeTagSize6 = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(serializedSize);
                        computeTagSize2 = computeUInt32SizeNoTag + computeTagSize6;
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 49:
                    unsafe = unsafe3;
                    List list19 = (List) unsafe.getObject(t11, offset);
                    J messageFieldSchema4 = messageSchema.getMessageFieldSchema(i17);
                    int i59 = L.f60134d;
                    int size6 = list19.size();
                    if (size6 == 0) {
                        i14 = 0;
                    } else {
                        i14 = 0;
                        for (int i61 = 0; i61 < size6; i61++) {
                            i14 += (CodedOutputStream.computeTagSize(numberAt) * 2) + ((AbstractMessageLite) ((MessageLite) list19.get(i61))).getSerializedSize(messageFieldSchema4);
                        }
                    }
                    i19 = i24 + i14;
                    i12 = 1;
                    break;
                case 50:
                    unsafe = unsafe3;
                    computeSize = messageSchema.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t11, offset), messageSchema.getMapFieldDefaultEntry(i17));
                    i19 = i24 + computeSize;
                    i12 = 1;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 52:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 53:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t11, offset));
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 54:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t11, offset));
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 55:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t11, offset));
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 56:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 57:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 58:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        i19 = CodedOutputStream.computeBoolSize(numberAt, true) + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 59:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        Object object3 = unsafe.getObject(t11, offset);
                        i19 = (object3 instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object3) : CodedOutputStream.computeStringSize(numberAt, (String) object3)) + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 60:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        Object object4 = unsafe.getObject(t11, offset);
                        J messageFieldSchema5 = messageSchema.getMessageFieldSchema(i17);
                        int i62 = L.f60134d;
                        if (object4 instanceof r) {
                            computeSize = ((r) object4).computeSize(numberAt);
                            i19 = i24 + computeSize;
                            i12 = 1;
                            break;
                        } else {
                            computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                            computeLengthDelimitedFieldSize = CodedOutputStream.computeLengthDelimitedFieldSize(((AbstractMessageLite) object4).getSerializedSize(messageFieldSchema5));
                            computeSize = computeLengthDelimitedFieldSize + computeTagSize;
                            i19 = i24 + computeSize;
                            i12 = 1;
                        }
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 61:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t11, offset));
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 62:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t11, offset));
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 63:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t11, offset));
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 66:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t11, offset));
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 67:
                    unsafe = unsafe3;
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t11, offset));
                        i19 = computeDoubleSize + i24;
                        i12 = 1;
                        break;
                    }
                    i12 = 1;
                    i19 = i24;
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(t11, numberAt, i17)) {
                        unsafe = unsafe3;
                        MessageLite messageLite2 = (MessageLite) unsafe.getObject(t11, offset);
                        J messageFieldSchema6 = messageSchema.getMessageFieldSchema(i17);
                        int i63 = L.f60134d;
                        computeTagSize2 = CodedOutputStream.computeTagSize(numberAt) * 2;
                        serializedSize = ((AbstractMessageLite) messageLite2).getSerializedSize(messageFieldSchema6);
                        i19 = computeTagSize2 + serializedSize + i24;
                        i12 = 1;
                        break;
                    }
                default:
                    unsafe = unsafe3;
                    i12 = 1;
                    i19 = i24;
                    break;
            }
            i17 += 3;
            unsafe2 = unsafe;
            i15 = i12;
            i16 = 1048575;
        }
        int unknownFieldsSerializedSize = i19 + messageSchema.getUnknownFieldsSerializedSize(messageSchema.unknownFieldSchema, t11);
        return messageSchema.hasExtensions ? unknownFieldsSerializedSize + messageSchema.extensionSchema.getExtensions(t11).n() : unknownFieldsSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01df, code lost:
    
        if (r3 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d2, code lost:
    
        if (r3 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
    
        r7 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d5, code lost:
    
        r2 = r7 + r2;
     */
    @Override // com.google.protobuf.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode(T t2) {
        int i11;
        int b11;
        int i12;
        int v11;
        int i13;
        int length = this.buffer.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i15);
            int numberAt = numberAt(i15);
            long offset = offset(typeAndOffsetAt);
            int i16 = 1237;
            int i17 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i11 = i14 * 53;
                    b11 = Internal.b(Double.doubleToLongBits(UnsafeUtil.t(t2, offset)));
                    i14 = b11 + i11;
                    break;
                case 1:
                    i11 = i14 * 53;
                    b11 = Float.floatToIntBits(UnsafeUtil.u(t2, offset));
                    i14 = b11 + i11;
                    break;
                case 2:
                    i11 = i14 * 53;
                    b11 = Internal.b(UnsafeUtil.x(t2, offset));
                    i14 = b11 + i11;
                    break;
                case 3:
                    i11 = i14 * 53;
                    b11 = Internal.b(UnsafeUtil.x(t2, offset));
                    i14 = b11 + i11;
                    break;
                case 4:
                    i12 = i14 * 53;
                    v11 = UnsafeUtil.v(t2, offset);
                    i14 = i12 + v11;
                    break;
                case 5:
                    i11 = i14 * 53;
                    b11 = Internal.b(UnsafeUtil.x(t2, offset));
                    i14 = b11 + i11;
                    break;
                case 6:
                    i12 = i14 * 53;
                    v11 = UnsafeUtil.v(t2, offset);
                    i14 = i12 + v11;
                    break;
                case 7:
                    i13 = i14 * 53;
                    boolean q11 = UnsafeUtil.q(t2, offset);
                    byte[] bArr = Internal.f60126b;
                    break;
                case 8:
                    i11 = i14 * 53;
                    b11 = ((String) UnsafeUtil.y(t2, offset)).hashCode();
                    i14 = b11 + i11;
                    break;
                case 9:
                    Object y11 = UnsafeUtil.y(t2, offset);
                    if (y11 != null) {
                        i17 = y11.hashCode();
                    }
                    i14 = (i14 * 53) + i17;
                    break;
                case 10:
                    i11 = i14 * 53;
                    b11 = UnsafeUtil.y(t2, offset).hashCode();
                    i14 = b11 + i11;
                    break;
                case 11:
                    i12 = i14 * 53;
                    v11 = UnsafeUtil.v(t2, offset);
                    i14 = i12 + v11;
                    break;
                case 12:
                    i12 = i14 * 53;
                    v11 = UnsafeUtil.v(t2, offset);
                    i14 = i12 + v11;
                    break;
                case 13:
                    i12 = i14 * 53;
                    v11 = UnsafeUtil.v(t2, offset);
                    i14 = i12 + v11;
                    break;
                case 14:
                    i11 = i14 * 53;
                    b11 = Internal.b(UnsafeUtil.x(t2, offset));
                    i14 = b11 + i11;
                    break;
                case 15:
                    i12 = i14 * 53;
                    v11 = UnsafeUtil.v(t2, offset);
                    i14 = i12 + v11;
                    break;
                case 16:
                    i11 = i14 * 53;
                    b11 = Internal.b(UnsafeUtil.x(t2, offset));
                    i14 = b11 + i11;
                    break;
                case 17:
                    Object y12 = UnsafeUtil.y(t2, offset);
                    if (y12 != null) {
                        i17 = y12.hashCode();
                    }
                    i14 = (i14 * 53) + i17;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i14 * 53;
                    b11 = UnsafeUtil.y(t2, offset).hashCode();
                    i14 = b11 + i11;
                    break;
                case 50:
                    i11 = i14 * 53;
                    b11 = UnsafeUtil.y(t2, offset).hashCode();
                    i14 = b11 + i11;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i11 = i14 * 53;
                        b11 = Internal.b(Double.doubleToLongBits(oneofDoubleAt(t2, offset)));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i11 = i14 * 53;
                        b11 = Float.floatToIntBits(oneofFloatAt(t2, offset));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i11 = i14 * 53;
                        b11 = Internal.b(oneofLongAt(t2, offset));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i11 = i14 * 53;
                        b11 = Internal.b(oneofLongAt(t2, offset));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i12 = i14 * 53;
                        v11 = oneofIntAt(t2, offset);
                        i14 = i12 + v11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i11 = i14 * 53;
                        b11 = Internal.b(oneofLongAt(t2, offset));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i12 = i14 * 53;
                        v11 = oneofIntAt(t2, offset);
                        i14 = i12 + v11;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i13 = i14 * 53;
                        boolean oneofBooleanAt = oneofBooleanAt(t2, offset);
                        byte[] bArr2 = Internal.f60126b;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i11 = i14 * 53;
                        b11 = ((String) UnsafeUtil.y(t2, offset)).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i11 = i14 * 53;
                        b11 = UnsafeUtil.y(t2, offset).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i11 = i14 * 53;
                        b11 = UnsafeUtil.y(t2, offset).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i12 = i14 * 53;
                        v11 = oneofIntAt(t2, offset);
                        i14 = i12 + v11;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i12 = i14 * 53;
                        v11 = oneofIntAt(t2, offset);
                        i14 = i12 + v11;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i12 = i14 * 53;
                        v11 = oneofIntAt(t2, offset);
                        i14 = i12 + v11;
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i11 = i14 * 53;
                        b11 = Internal.b(oneofLongAt(t2, offset));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i12 = i14 * 53;
                        v11 = oneofIntAt(t2, offset);
                        i14 = i12 + v11;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i11 = i14 * 53;
                        b11 = Internal.b(oneofLongAt(t2, offset));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t2, numberAt, i15)) {
                        i11 = i14 * 53;
                        b11 = UnsafeUtil.y(t2, offset).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.unknownFieldSchema.getFromMessage(t2).hashCode() + (i14 * 53);
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(t2).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.J
    public final boolean isInitialized(T t2) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.checkInitializedCount) {
            int i16 = this.intArray[i14];
            int numberAt = numberAt(i16);
            int typeAndOffsetAt = typeAndOffsetAt(i16);
            int i17 = this.buffer[i16 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i13) {
                if (i18 != 1048575) {
                    i15 = UNSAFE.getInt(t2, i18);
                }
                i12 = i15;
                i11 = i18;
            } else {
                i11 = i13;
                i12 = i15;
            }
            T t11 = t2;
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(t11, i16, i11, i12, i19)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(t11, numberAt, i16) && !isInitialized(t11, typeAndOffsetAt, getMessageFieldSchema(i16))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(t11, typeAndOffsetAt, i16)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(t11, typeAndOffsetAt, i16)) {
                    return false;
                }
            } else if (isFieldPresent(t11, i16, i11, i12, i19) && !isInitialized(t11, typeAndOffsetAt, getMessageFieldSchema(i16))) {
                return false;
            }
            i14++;
            t2 = t11;
            i13 = i11;
            i15 = i12;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t2).s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.J
    public void makeImmutable(T t2) {
        if (isMutable(t2)) {
            if (t2 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t2;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int typeAndOffsetAt = typeAndOffsetAt(i11);
                long offset = offset(typeAndOffsetAt);
                int type = type(typeAndOffsetAt);
                if (type != 9) {
                    if (type != 60 && type != 68) {
                        switch (type) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            case 28:
                            case 29:
                            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            case 38:
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(t2, offset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(t2, offset);
                                if (object != null) {
                                    unsafe.putObject(t2, offset, this.mapFieldSchema.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (isOneofPresent(t2, numberAt(i11), i11)) {
                        getMessageFieldSchema(i11).makeImmutable(UNSAFE.getObject(t2, offset));
                    }
                }
                if (isFieldPresent(t2, i11)) {
                    getMessageFieldSchema(i11).makeImmutable(UNSAFE.getObject(t2, offset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t2);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t2);
            }
        }
    }

    @Override // com.google.protobuf.J
    public void mergeFrom(T t2, T t11) {
        checkMutable(t2);
        t11.getClass();
        for (int i11 = 0; i11 < this.buffer.length; i11 += 3) {
            mergeSingleField(t2, t11, i11);
        }
        N<?, ?> n11 = this.unknownFieldSchema;
        int i12 = L.f60134d;
        n11.setToMessage(t2, n11.merge(n11.getFromMessage(t2), n11.getFromMessage(t11)));
        if (this.hasExtensions) {
            AbstractC5958i<?> abstractC5958i = this.extensionSchema;
            C5961l<?> extensions = abstractC5958i.getExtensions(t11);
            if (extensions.q()) {
                return;
            }
            abstractC5958i.getMutableExtensions(t2).w(extensions);
        }
    }

    @Override // com.google.protobuf.J
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0422  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int parseMessage(T t2, byte[] bArr, int i11, int i12, int i13, C5951b.C0915b c0915b) throws IOException {
        T t11;
        int i14;
        int i15;
        Unsafe unsafe;
        MessageSchema<T> messageSchema;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        C5951b.C0915b c0915b2;
        T t12;
        int E11;
        int i23;
        long j11;
        C5951b.C0915b c0915b3;
        int i24;
        Unsafe unsafe2;
        int i25;
        byte[] bArr2;
        int i26;
        Unsafe unsafe3;
        C5951b.C0915b c0915b4;
        T t13;
        byte[] bArr3;
        int i27;
        int i28;
        byte[] bArr4;
        int i29;
        C5951b.C0915b c0915b5;
        int i31;
        int i32;
        MessageSchema<T> messageSchema2 = this;
        T t14 = t2;
        byte[] bArr5 = bArr;
        int i33 = i12;
        C5951b.C0915b c0915b6 = c0915b;
        checkMutable(t14);
        Unsafe unsafe4 = UNSAFE;
        int i34 = -1;
        int i35 = i11;
        int i36 = -1;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i41 = 1048575;
        while (true) {
            if (i35 < i33) {
                int i42 = i35 + 1;
                int i43 = bArr5[i35];
                if (i43 < 0) {
                    i42 = C5951b.F(i43, bArr5, i42, c0915b6);
                    i43 = c0915b6.f60195a;
                }
                int i44 = i42;
                i39 = i43;
                int i45 = i39 >>> 3;
                int i46 = i39 & 7;
                int positionForFieldNumber = i45 > i36 ? messageSchema2.positionForFieldNumber(i45, i37 / 3) : messageSchema2.positionForFieldNumber(i45);
                if (positionForFieldNumber == i34) {
                    i17 = i44;
                    i15 = i41;
                    unsafe = unsafe4;
                    i18 = i34;
                    i19 = i45;
                    i21 = 0;
                    messageSchema = messageSchema2;
                    i22 = i39;
                } else {
                    int i47 = messageSchema2.buffer[positionForFieldNumber + 1];
                    int i48 = i34;
                    int type = type(i47);
                    long offset = offset(i47);
                    if (type <= 17) {
                        int i49 = messageSchema2.buffer[positionForFieldNumber + 2];
                        int i51 = 1 << (i49 >>> 20);
                        int i52 = i49 & 1048575;
                        if (i52 != i41) {
                            i19 = i45;
                            j11 = offset;
                            if (i41 != 1048575) {
                                unsafe4.putInt(t14, i41, i38);
                            }
                            i38 = i52 == 1048575 ? 0 : unsafe4.getInt(t14, i52);
                        } else {
                            j11 = offset;
                            i19 = i45;
                            i52 = i41;
                        }
                        switch (type) {
                            case 0:
                                c0915b3 = c0915b;
                                i24 = positionForFieldNumber;
                                unsafe2 = unsafe4;
                                i25 = i44;
                                long j12 = j11;
                                bArr2 = bArr;
                                if (i46 == 1) {
                                    UnsafeUtil.I(t14, j12, C5951b.d(i25, bArr2));
                                    i26 = i25 + 8;
                                    i38 |= i51;
                                    Unsafe unsafe5 = unsafe2;
                                    i35 = i26;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe5;
                                    i33 = i12;
                                    c0915b6 = c0915b3;
                                    i41 = i52;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    break;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13 && i13 != 0) {
                                        t11 = t2;
                                        i14 = i12;
                                        i39 = i22;
                                        i16 = i17;
                                        break;
                                    } else {
                                        if (messageSchema.hasExtensions || c0915b2.f60198d == C5957h.b()) {
                                            t12 = t2;
                                            E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                            i23 = i12;
                                        } else {
                                            E11 = C5951b.f(i22, bArr, i17, i12, t2, messageSchema.defaultInstance, messageSchema.unknownFieldSchema, c0915b2);
                                            t12 = t2;
                                            i23 = i12;
                                        }
                                        i35 = E11;
                                        bArr5 = bArr;
                                        i39 = i22;
                                        t14 = t12;
                                        i33 = i23;
                                        i37 = i21;
                                        messageSchema2 = messageSchema;
                                        i41 = i15;
                                        i34 = i18;
                                        i36 = i19;
                                        unsafe4 = unsafe;
                                        c0915b6 = c0915b;
                                        break;
                                    }
                                }
                            case 1:
                                c0915b3 = c0915b;
                                i24 = positionForFieldNumber;
                                unsafe2 = unsafe4;
                                i25 = i44;
                                long j13 = j11;
                                bArr2 = bArr;
                                if (i46 == 5) {
                                    UnsafeUtil.J(t14, j13, C5951b.k(i25, bArr2));
                                    i26 = i25 + 4;
                                    i38 |= i51;
                                    Unsafe unsafe52 = unsafe2;
                                    i35 = i26;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe52;
                                    i33 = i12;
                                    c0915b6 = c0915b3;
                                    i41 = i52;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    break;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                        break;
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                c0915b3 = c0915b;
                                i24 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i25 = i44;
                                long j14 = j11;
                                if (i46 == 0) {
                                    int I11 = C5951b.I(bArr, i25, c0915b3);
                                    T t15 = t14;
                                    unsafe3.putLong(t15, j14, c0915b3.f60196b);
                                    t14 = t15;
                                    i38 |= i51;
                                    i33 = i12;
                                    bArr5 = bArr;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    unsafe4 = unsafe3;
                                    i35 = I11;
                                    c0915b6 = c0915b3;
                                    i41 = i52;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                c0915b3 = c0915b;
                                i24 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i25 = i44;
                                long j15 = j11;
                                if (i46 == 0) {
                                    int G11 = C5951b.G(bArr, i25, c0915b3);
                                    unsafe3.putInt(t14, j15, c0915b3.f60195a);
                                    i38 |= i51;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr;
                                    i33 = i12;
                                    i35 = G11;
                                    c0915b6 = c0915b3;
                                    i41 = i52;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                T t16 = t14;
                                i24 = positionForFieldNumber;
                                i25 = i44;
                                long j16 = j11;
                                if (i46 == 1) {
                                    Unsafe unsafe6 = unsafe4;
                                    c0915b3 = c0915b;
                                    unsafe6.putLong(t16, j16, C5951b.i(i25, bArr));
                                    t14 = t16;
                                    i35 = i25 + 8;
                                    i38 |= i51;
                                    unsafe4 = unsafe6;
                                    bArr5 = bArr;
                                    i33 = i12;
                                    c0915b6 = c0915b3;
                                    i41 = i52;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    break;
                                } else {
                                    unsafe3 = unsafe4;
                                    c0915b3 = c0915b;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                c0915b4 = c0915b;
                                t13 = t14;
                                i24 = positionForFieldNumber;
                                i25 = i44;
                                long j17 = j11;
                                bArr3 = bArr;
                                if (i46 == 5) {
                                    unsafe4.putInt(t13, j17, C5951b.g(i25, bArr3));
                                    i27 = i25 + 4;
                                    i38 |= i51;
                                    i33 = i12;
                                    c0915b6 = c0915b4;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    i35 = i27;
                                    bArr5 = bArr3;
                                    t14 = t13;
                                    i41 = i52;
                                    break;
                                } else {
                                    c0915b3 = c0915b4;
                                    unsafe2 = unsafe4;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            case 7:
                                c0915b4 = c0915b;
                                t13 = t14;
                                i24 = positionForFieldNumber;
                                i28 = i44;
                                long j18 = j11;
                                bArr3 = bArr;
                                if (i46 == 0) {
                                    i27 = C5951b.I(bArr3, i28, c0915b4);
                                    UnsafeUtil.D(t13, j18, c0915b4.f60196b != 0);
                                    i38 |= i51;
                                    i33 = i12;
                                    c0915b6 = c0915b4;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    i35 = i27;
                                    bArr5 = bArr3;
                                    t14 = t13;
                                    i41 = i52;
                                    break;
                                } else {
                                    c0915b3 = c0915b4;
                                    unsafe2 = unsafe4;
                                    i25 = i28;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            case 8:
                                c0915b4 = c0915b;
                                t13 = t14;
                                i24 = positionForFieldNumber;
                                i28 = i44;
                                long j19 = j11;
                                bArr3 = bArr;
                                if (i46 == 2) {
                                    i27 = isEnforceUtf8(i47) ? C5951b.D(bArr3, i28, c0915b4) : C5951b.A(bArr3, i28, c0915b4);
                                    unsafe4.putObject(t13, j19, c0915b4.f60197c);
                                    i38 |= i51;
                                    i33 = i12;
                                    c0915b6 = c0915b4;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    i35 = i27;
                                    bArr5 = bArr3;
                                    t14 = t13;
                                    i41 = i52;
                                    break;
                                } else {
                                    c0915b3 = c0915b4;
                                    unsafe2 = unsafe4;
                                    i25 = i28;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            case 9:
                                i24 = positionForFieldNumber;
                                Unsafe unsafe7 = unsafe4;
                                if (i46 == 2) {
                                    T t17 = t14;
                                    Object mutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t17, i24);
                                    t13 = t17;
                                    unsafe4 = unsafe7;
                                    i27 = C5951b.L(mutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i24), bArr, i44, i12, c0915b);
                                    bArr3 = bArr;
                                    c0915b4 = c0915b;
                                    messageSchema2.storeMessageField(t13, i24, mutableMessageFieldForMerge);
                                    i38 |= i51;
                                    i33 = i12;
                                    c0915b6 = c0915b4;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    i35 = i27;
                                    bArr5 = bArr3;
                                    t14 = t13;
                                    i41 = i52;
                                    break;
                                } else {
                                    t13 = t14;
                                    bArr3 = bArr;
                                    unsafe4 = unsafe7;
                                    i28 = i44;
                                    c0915b4 = c0915b;
                                    c0915b3 = c0915b4;
                                    unsafe2 = unsafe4;
                                    i25 = i28;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            case 10:
                                bArr4 = bArr;
                                i24 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i29 = i44;
                                long j21 = j11;
                                c0915b5 = c0915b;
                                if (i46 == 2) {
                                    i35 = C5951b.b(bArr4, i29, c0915b5);
                                    unsafe3.putObject(t14, j21, c0915b5.f60197c);
                                    i38 |= i51;
                                    i33 = i12;
                                    c0915b6 = c0915b5;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i41 = i52;
                                    break;
                                } else {
                                    c0915b3 = c0915b5;
                                    i25 = i29;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            case 12:
                                bArr4 = bArr;
                                i24 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i29 = i44;
                                long j22 = j11;
                                c0915b5 = c0915b;
                                if (i46 != 0) {
                                    c0915b3 = c0915b5;
                                    i25 = i29;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                } else {
                                    i35 = C5951b.G(bArr4, i29, c0915b5);
                                    int i53 = c0915b5.f60195a;
                                    Internal.c enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i24);
                                    if (!isLegacyEnumIsClosed(i47) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i53)) {
                                        unsafe3.putInt(t14, j22, i53);
                                        i38 |= i51;
                                        i33 = i12;
                                        c0915b6 = c0915b5;
                                        i37 = i24;
                                        i34 = i48;
                                        i36 = i19;
                                        unsafe4 = unsafe3;
                                        bArr5 = bArr4;
                                        i41 = i52;
                                        break;
                                    } else {
                                        getMutableUnknownFields(t14).l(i39, Long.valueOf(i53));
                                        i33 = i12;
                                        c0915b6 = c0915b5;
                                        i37 = i24;
                                        i34 = i48;
                                        i36 = i19;
                                        unsafe4 = unsafe3;
                                        bArr5 = bArr4;
                                        i41 = i52;
                                    }
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                i24 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i29 = i44;
                                long j23 = j11;
                                c0915b5 = c0915b;
                                if (i46 == 0) {
                                    i35 = C5951b.G(bArr4, i29, c0915b5);
                                    unsafe3.putInt(t14, j23, CodedInputStream.decodeZigZag32(c0915b5.f60195a));
                                    i38 |= i51;
                                    i33 = i12;
                                    c0915b6 = c0915b5;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i41 = i52;
                                    break;
                                } else {
                                    c0915b3 = c0915b5;
                                    i25 = i29;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            case 16:
                                bArr4 = bArr;
                                i24 = positionForFieldNumber;
                                i29 = i44;
                                if (i46 == 0) {
                                    int I12 = C5951b.I(bArr4, i29, c0915b);
                                    T t18 = t14;
                                    Unsafe unsafe8 = unsafe4;
                                    c0915b5 = c0915b;
                                    unsafe8.putLong(t18, j11, CodedInputStream.decodeZigZag64(c0915b.f60196b));
                                    unsafe3 = unsafe8;
                                    t14 = t18;
                                    i38 |= i51;
                                    i33 = i12;
                                    i35 = I12;
                                    c0915b6 = c0915b5;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i41 = i52;
                                    break;
                                } else {
                                    Unsafe unsafe9 = unsafe4;
                                    c0915b5 = c0915b;
                                    unsafe3 = unsafe9;
                                    c0915b3 = c0915b5;
                                    i25 = i29;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            case 17:
                                if (i46 == 3) {
                                    Object mutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t14, positionForFieldNumber);
                                    i24 = positionForFieldNumber;
                                    i35 = C5951b.K(mutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(positionForFieldNumber), bArr, i44, i12, (i19 << 3) | 4, c0915b);
                                    messageSchema2.storeMessageField(t14, i24, mutableMessageFieldForMerge2);
                                    i38 |= i51;
                                    i33 = i12;
                                    c0915b6 = c0915b;
                                    bArr5 = bArr;
                                    i41 = i52;
                                    i37 = i24;
                                    i34 = i48;
                                    i36 = i19;
                                    break;
                                } else {
                                    i24 = positionForFieldNumber;
                                    c0915b3 = c0915b;
                                    unsafe2 = unsafe4;
                                    i25 = i44;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i15 = i52;
                                    i22 = i39;
                                    i17 = i25;
                                    i18 = i48;
                                    c0915b2 = c0915b3;
                                    i21 = i24;
                                    if (i22 != i13) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t2;
                                    E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                    i23 = i12;
                                    i35 = E11;
                                    bArr5 = bArr;
                                    i39 = i22;
                                    t14 = t12;
                                    i33 = i23;
                                    i37 = i21;
                                    messageSchema2 = messageSchema;
                                    i41 = i15;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                    break;
                                }
                                break;
                            default:
                                c0915b3 = c0915b;
                                i24 = positionForFieldNumber;
                                unsafe2 = unsafe4;
                                i25 = i44;
                                messageSchema = messageSchema2;
                                unsafe = unsafe2;
                                i15 = i52;
                                i22 = i39;
                                i17 = i25;
                                i18 = i48;
                                c0915b2 = c0915b3;
                                i21 = i24;
                                if (i22 != i13) {
                                }
                                if (messageSchema.hasExtensions) {
                                }
                                t12 = t2;
                                E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                i23 = i12;
                                i35 = E11;
                                bArr5 = bArr;
                                i39 = i22;
                                t14 = t12;
                                i33 = i23;
                                i37 = i21;
                                messageSchema2 = messageSchema;
                                i41 = i15;
                                i34 = i18;
                                i36 = i19;
                                unsafe4 = unsafe;
                                c0915b6 = c0915b;
                                break;
                        }
                    } else {
                        int i54 = i41;
                        i19 = i45;
                        i21 = positionForFieldNumber;
                        Unsafe unsafe10 = unsafe4;
                        if (type != 27) {
                            i31 = i44;
                            if (type <= 49) {
                                unsafe = unsafe10;
                                i15 = i54;
                                i18 = i48;
                                i32 = i38;
                                int parseRepeatedField = messageSchema2.parseRepeatedField(t2, bArr, i31, i12, i39, i19, i46, i21, i47, type, offset, c0915b);
                                i39 = i39;
                                if (parseRepeatedField != i31) {
                                    messageSchema2 = this;
                                    t14 = t2;
                                    bArr5 = bArr;
                                    i33 = i12;
                                    i35 = parseRepeatedField;
                                    i37 = i21;
                                    i41 = i15;
                                    i38 = i32;
                                    i34 = i18;
                                    i36 = i19;
                                    unsafe4 = unsafe;
                                    c0915b6 = c0915b;
                                } else {
                                    messageSchema = this;
                                    i17 = parseRepeatedField;
                                }
                            } else {
                                i39 = i39;
                                unsafe = unsafe10;
                                i15 = i54;
                                i18 = i48;
                                i32 = i38;
                                if (type != 50) {
                                    c0915b2 = c0915b;
                                    int parseOneofField = parseOneofField(t2, bArr, i31, i12, i39, i19, i46, i47, type, offset, i21, c0915b2);
                                    messageSchema = this;
                                    i22 = i39;
                                    i21 = i21;
                                    if (parseOneofField != i31) {
                                        t14 = t2;
                                        bArr5 = bArr;
                                        i33 = i12;
                                        i35 = parseOneofField;
                                        i37 = i21;
                                        c0915b6 = c0915b2;
                                        i41 = i15;
                                        i38 = i32;
                                        i34 = i18;
                                        i36 = i19;
                                        i39 = i22;
                                        messageSchema2 = messageSchema;
                                    } else {
                                        i17 = parseOneofField;
                                        i38 = i32;
                                        if (i22 != i13) {
                                        }
                                        if (messageSchema.hasExtensions) {
                                        }
                                        t12 = t2;
                                        E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                                        i23 = i12;
                                        i35 = E11;
                                        bArr5 = bArr;
                                        i39 = i22;
                                        t14 = t12;
                                        i33 = i23;
                                        i37 = i21;
                                        messageSchema2 = messageSchema;
                                        i41 = i15;
                                        i34 = i18;
                                        i36 = i19;
                                        unsafe4 = unsafe;
                                        c0915b6 = c0915b;
                                    }
                                } else if (i46 == 2) {
                                    int parseMapField = parseMapField(t2, bArr, i31, i12, i21, offset, c0915b);
                                    i21 = i21;
                                    if (parseMapField != i31) {
                                        messageSchema2 = this;
                                        t14 = t2;
                                        bArr5 = bArr;
                                        i33 = i12;
                                        c0915b6 = c0915b;
                                        i35 = parseMapField;
                                        i37 = i21;
                                        i41 = i15;
                                        i38 = i32;
                                        i34 = i18;
                                        i36 = i19;
                                    } else {
                                        messageSchema = this;
                                        i17 = parseMapField;
                                    }
                                } else {
                                    messageSchema = this;
                                    i17 = i31;
                                }
                                unsafe4 = unsafe;
                            }
                        } else if (i46 == 2) {
                            Internal.e eVar = (Internal.e) unsafe10.getObject(t14, offset);
                            if (!eVar.isModifiable()) {
                                int size = eVar.size();
                                eVar = eVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe10.putObject(t14, offset, eVar);
                            }
                            unsafe4 = unsafe10;
                            c0915b6 = c0915b;
                            i33 = i12;
                            i35 = C5951b.o(messageSchema2.getMessageFieldSchema(i21), i39, bArr, i44, i12, eVar, c0915b6);
                            i37 = i21;
                            i41 = i54;
                            i34 = i48;
                            i36 = i19;
                            t14 = t2;
                            bArr5 = bArr;
                        } else {
                            unsafe = unsafe10;
                            i15 = i54;
                            i31 = i44;
                            i18 = i48;
                            i32 = i38;
                            messageSchema = this;
                            i17 = i31;
                        }
                        i22 = i39;
                        i38 = i32;
                    }
                }
                c0915b2 = c0915b;
                if (i22 != i13) {
                }
                if (messageSchema.hasExtensions) {
                }
                t12 = t2;
                E11 = C5951b.E(i22, bArr, i17, i12, getMutableUnknownFields(t12), c0915b);
                i23 = i12;
                i35 = E11;
                bArr5 = bArr;
                i39 = i22;
                t14 = t12;
                i33 = i23;
                i37 = i21;
                messageSchema2 = messageSchema;
                i41 = i15;
                i34 = i18;
                i36 = i19;
                unsafe4 = unsafe;
                c0915b6 = c0915b;
            } else {
                t11 = t14;
                i14 = i33;
                i15 = i41;
                unsafe = unsafe4;
                messageSchema = messageSchema2;
                i16 = i35;
            }
        }
        int i55 = i15;
        if (i55 != 1048575) {
            unsafe.putInt(t11, i55, i38);
        }
        O o11 = null;
        for (int i56 = messageSchema.checkInitializedCount; i56 < messageSchema.repeatedFieldOffsetStart; i56++) {
            o11 = (O) messageSchema.filterMapUnknownEnumValues(t11, messageSchema.intArray[i56], o11, messageSchema.unknownFieldSchema, t2);
        }
        T t19 = t11;
        MessageSchema<T> messageSchema3 = messageSchema;
        if (o11 != null) {
            messageSchema3.unknownFieldSchema.setBuilderToMessage(t19, o11);
        }
        if (i13 == 0) {
            if (i16 != i14) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i16 > i14 || i39 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i16;
    }

    @Override // com.google.protobuf.J
    public void writeTo(T t2, T t11) throws IOException {
        if (t11.fieldOrder() == T.a.DESCENDING) {
            writeFieldsInDescendingOrder(t2, t11);
        } else {
            writeFieldsInAscendingOrder(t2, t11);
        }
    }

    private boolean isFieldPresent(T t2, int i11) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i11);
        long j11 = 1048575 & presenceMaskAndOffsetAt;
        if (j11 != 1048575) {
            return (UnsafeUtil.v(t2, j11) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i11);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.t(t2, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.u(t2, offset)) != 0;
            case 2:
                return UnsafeUtil.x(t2, offset) != 0;
            case 3:
                return UnsafeUtil.x(t2, offset) != 0;
            case 4:
                return UnsafeUtil.v(t2, offset) != 0;
            case 5:
                return UnsafeUtil.x(t2, offset) != 0;
            case 6:
                return UnsafeUtil.v(t2, offset) != 0;
            case 7:
                return UnsafeUtil.q(t2, offset);
            case 8:
                Object y11 = UnsafeUtil.y(t2, offset);
                if (y11 instanceof String) {
                    return !((String) y11).isEmpty();
                }
                if (y11 instanceof ByteString) {
                    return !ByteString.EMPTY.equals(y11);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.y(t2, offset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.y(t2, offset));
            case 11:
                return UnsafeUtil.v(t2, offset) != 0;
            case 12:
                return UnsafeUtil.v(t2, offset) != 0;
            case 13:
                return UnsafeUtil.v(t2, offset) != 0;
            case 14:
                return UnsafeUtil.x(t2, offset) != 0;
            case 15:
                return UnsafeUtil.v(t2, offset) != 0;
            case 16:
                return UnsafeUtil.x(t2, offset) != 0;
            case 17:
                return UnsafeUtil.y(t2, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i11, int i12) {
        if (i11 < this.minFieldNumber || i11 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i11, i12);
    }

    private boolean equals(T t2, T t11, int i11) {
        int typeAndOffsetAt = typeAndOffsetAt(i11);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(t2, t11, i11) || Double.doubleToLongBits(UnsafeUtil.t(t2, offset)) != Double.doubleToLongBits(UnsafeUtil.t(t11, offset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(t2, t11, i11) || Float.floatToIntBits(UnsafeUtil.u(t2, offset)) != Float.floatToIntBits(UnsafeUtil.u(t11, offset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.x(t2, offset) != UnsafeUtil.x(t11, offset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.x(t2, offset) != UnsafeUtil.x(t11, offset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.v(t2, offset) != UnsafeUtil.v(t11, offset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.x(t2, offset) != UnsafeUtil.x(t11, offset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.v(t2, offset) != UnsafeUtil.v(t11, offset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.q(t2, offset) != UnsafeUtil.q(t11, offset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(t2, t11, i11) || !L.m(UnsafeUtil.y(t2, offset), UnsafeUtil.y(t11, offset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(t2, t11, i11) || !L.m(UnsafeUtil.y(t2, offset), UnsafeUtil.y(t11, offset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(t2, t11, i11) || !L.m(UnsafeUtil.y(t2, offset), UnsafeUtil.y(t11, offset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.v(t2, offset) != UnsafeUtil.v(t11, offset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.v(t2, offset) != UnsafeUtil.v(t11, offset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.v(t2, offset) != UnsafeUtil.v(t11, offset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.x(t2, offset) != UnsafeUtil.x(t11, offset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.v(t2, offset) != UnsafeUtil.v(t11, offset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(t2, t11, i11) || UnsafeUtil.x(t2, offset) != UnsafeUtil.x(t11, offset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(t2, t11, i11) || !L.m(UnsafeUtil.y(t2, offset), UnsafeUtil.y(t11, offset))) {
                }
                break;
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
            case 66:
            case 67:
            case 68:
                if (!isOneofCaseEqual(t2, t11, i11) || !L.m(UnsafeUtil.y(t2, offset), UnsafeUtil.y(t11, offset))) {
                }
                break;
        }
        return true;
    }

    @Override // com.google.protobuf.J
    public void mergeFrom(T t2, I i11, C5957h c5957h) throws IOException {
        c5957h.getClass();
        checkMutable(t2);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t2, i11, c5957h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i11, J j11) {
        return j11.isInitialized(UnsafeUtil.y(obj, offset(i11)));
    }

    @Override // com.google.protobuf.J
    public void mergeFrom(T t2, byte[] bArr, int i11, int i12, C5951b.C0915b c0915b) throws IOException {
        parseMessage(t2, bArr, i11, i12, 0, c0915b);
    }
}
