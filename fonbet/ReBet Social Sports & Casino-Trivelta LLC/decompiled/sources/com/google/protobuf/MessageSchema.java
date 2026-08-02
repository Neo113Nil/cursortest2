package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

@CheckReturnValue
/* loaded from: classes3.dex */
final class MessageSchema<T> implements Schema<T> {
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
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z10, int[] iArr2, int i12, int i13, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i10;
        this.maxFieldNumber = i11;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z10;
        this.intArray = iArr2;
        this.checkInitializedCount = i12;
        this.repeatedFieldOffsetStart = i13;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t10, T t11, int i10) {
        return isFieldPresent(t10, i10) == isFieldPresent(t11, i10);
    }

    private static <T> boolean booleanAt(T t10, long j10) {
        return UnsafeUtil.getBoolean(t10, j10);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i10, int i11, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) {
        int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
        int i12 = registers.int1;
        if (i12 < 0 || i12 > i11 - decodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = decodeVarint32 + i12;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (decodeVarint32 < i13) {
            int i14 = decodeVarint32 + 1;
            int i15 = bArr[decodeVarint32];
            if (i15 < 0) {
                i14 = ArrayDecoders.decodeVarint32(i15, bArr, i14, registers);
                i15 = registers.int1;
            }
            int i16 = i14;
            int i17 = i15 >>> 3;
            int i18 = i15 & 7;
            if (i17 != 1) {
                if (i17 == 2 && i18 == metadata.valueType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i16, i11, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                }
                decodeVarint32 = ArrayDecoders.skipField(i15, bArr, i16, i11, registers);
            } else if (i18 == metadata.keyType.getWireType()) {
                decodeVarint32 = decodeMapEntryValue(bArr, i16, i11, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                decodeVarint32 = ArrayDecoders.skipField(i15, bArr, i16, i11, registers);
            }
        }
        if (decodeVarint32 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i13;
    }

    private int decodeMapEntryValue(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return decodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i10, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i10));
                return i10 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return decodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i10, i11, registers);
            case 15:
                int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return decodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i10, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t10, long j10) {
        return UnsafeUtil.getDouble(t10, j10);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i10, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int numberAt = numberAt(i10);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i10)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i10)) == null) ? ub2 : (UB) filterUnknownEnumMap(i10, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i10, int i11, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub2, i11, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T t10, long j10) {
        return UnsafeUtil.getFloat(t10, j10);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i10) {
        return (Internal.EnumVerifier) this.objects[((i10 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i10) {
        int i11 = (i10 / 3) * 2;
        Schema schema = (Schema) this.objects[i11];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i11 + 1]);
        this.objects[i11] = schemaFor;
        return schemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = newInstance;
        return newInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t10) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t10));
    }

    private static <T> int intAt(T t10, long j10) {
        return UnsafeUtil.getInt(t10, j10);
    }

    private static boolean isEnforceUtf8(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean isFieldPresent(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? isFieldPresent(t10, i10) : (i12 & i13) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i10, int i11) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i10));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!messageFieldSchema.isInitialized(list.get(i12))) {
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
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t10, int i10, int i11) {
        Map<?, ?> forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t10, offset(i10)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? r52 = 0;
        for (Object obj : forMapData.values()) {
            r52 = r52;
            if (r52 == 0) {
                r52 = Protobuf.getInstance().schemaFor((Class) obj.getClass());
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

    private boolean isOneofCaseEqual(T t10, T t11, int i10) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10) & 1048575;
        return UnsafeUtil.getInt(t10, presenceMaskAndOffsetAt) == UnsafeUtil.getInt(t11, presenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t10, int i10, int i11) {
        return UnsafeUtil.getInt(t10, (long) (presenceMaskAndOffsetAt(i11) & 1048575)) == i10;
    }

    private static boolean isRequired(int i10) {
        return (i10 & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t10, long j10) {
        return UnsafeUtil.getLong(t10, j10);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r18, com.google.protobuf.ExtensionSchema<ET> r19, T r20, com.google.protobuf.Reader r21, com.google.protobuf.ExtensionRegistryLite r22) {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long offset = offset(typeAndOffsetAt(i10));
        Object object = UnsafeUtil.getObject(obj, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t10, T t11, int i10) {
        if (isFieldPresent(t11, i10)) {
            long offset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t11, offset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t11);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i10);
            if (!isFieldPresent(t10, i10)) {
                if (isMutable(object)) {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t10, offset, newInstance);
                } else {
                    unsafe.putObject(t10, offset, object);
                }
                setFieldPresent(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t10, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t10, T t11, int i10) {
        int numberAt = numberAt(i10);
        if (isOneofPresent(t11, numberAt, i10)) {
            long offset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t11, offset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t11);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i10);
            if (!isOneofPresent(t10, numberAt, i10)) {
                if (isMutable(object)) {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t10, offset, newInstance);
                } else {
                    unsafe.putObject(t10, offset, object);
                }
                setOneofPresent(t10, numberAt, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t10, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t10, T t11, int i10) {
        int typeAndOffsetAt = typeAndOffsetAt(i10);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i10);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putDouble(t10, offset, UnsafeUtil.getDouble(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putFloat(t10, offset, UnsafeUtil.getFloat(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, offset, UnsafeUtil.getLong(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, offset, UnsafeUtil.getLong(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, offset, UnsafeUtil.getLong(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putBoolean(t10, offset, UnsafeUtil.getBoolean(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putObject(t10, offset, UnsafeUtil.getObject(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 9:
                mergeMessage(t10, t11, i10);
                break;
            case 10:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putObject(t10, offset, UnsafeUtil.getObject(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, offset, UnsafeUtil.getLong(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, offset, UnsafeUtil.getLong(t11, offset));
                    setFieldPresent(t10, i10);
                    break;
                }
                break;
            case 17:
                mergeMessage(t10, t11, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t10, t11, offset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t10, t11, offset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t11, numberAt, i10)) {
                    UnsafeUtil.putObject(t10, offset, UnsafeUtil.getObject(t11, offset));
                    setOneofPresent(t10, numberAt, i10);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t11, numberAt, i10)) {
                    UnsafeUtil.putObject(t10, offset, UnsafeUtil.getObject(t11, offset));
                    setOneofPresent(t10, numberAt, i10);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(t10, t11, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t10, int i10) {
        Schema messageFieldSchema = getMessageFieldSchema(i10);
        long offset = offset(typeAndOffsetAt(i10));
        if (!isFieldPresent(t10, i10)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, offset);
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
    private Object mutableOneofMessageFieldForMerge(T t10, int i10, int i11) {
        Schema messageFieldSchema = getMessageFieldSchema(i11);
        if (!isOneofPresent(t10, i10, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, offset(typeAndOffsetAt(i11)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i10;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i11 = 0;
        int i12 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i11++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i12++;
            }
        }
        int[] iArr2 = i11 > 0 ? new int[i11] : null;
        int[] iArr3 = i12 > 0 ? new int[i12] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i13 < fields.length) {
            FieldInfo fieldInfo2 = fields[i13];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i14, objArr);
            if (i15 < checkInitialized.length && checkInitialized[i15] == fieldNumber3) {
                checkInitialized[i15] = i14;
                i15++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i16] = i14;
                i16++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i10 = i14;
                iArr3[i17] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i17++;
                i13++;
                i14 = i10 + 3;
            }
            i10 = i14;
            i13++;
            i14 = i10 + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i10;
        int charAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        char charAt2;
        int i18;
        char charAt3;
        int i19;
        char charAt4;
        int i20;
        char charAt5;
        int i21;
        char charAt6;
        int i22;
        char charAt7;
        int i23;
        char charAt8;
        int i24;
        char charAt9;
        int i25;
        int i26;
        int i27;
        int i28;
        int objectFieldOffset;
        String str;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        java.lang.reflect.Field reflectField;
        char charAt10;
        int i35;
        int i36;
        Object obj;
        java.lang.reflect.Field reflectField2;
        Object obj2;
        java.lang.reflect.Field reflectField3;
        int i37;
        char charAt11;
        int i38;
        char charAt12;
        int i39;
        char charAt13;
        int i40;
        char charAt14;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c10 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i10 = i41 + 1;
                if (stringInfo.charAt(i41) < 55296) {
                    break;
                }
                i41 = i10;
            }
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int charAt15 = stringInfo.charAt(i10);
        if (charAt15 >= 55296) {
            int i43 = charAt15 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                charAt14 = stringInfo.charAt(i42);
                if (charAt14 < 55296) {
                    break;
                }
                i43 |= (charAt14 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            charAt15 = i43 | (charAt14 << i44);
            i42 = i40;
        }
        if (charAt15 == 0) {
            i13 = 0;
            charAt = 0;
            i12 = 0;
            i16 = 0;
            i11 = 0;
            i15 = 0;
            iArr = EMPTY_INT_ARRAY;
            i14 = 0;
        } else {
            int i45 = i42 + 1;
            int charAt16 = stringInfo.charAt(i42);
            if (charAt16 >= 55296) {
                int i46 = charAt16 & 8191;
                int i47 = 13;
                while (true) {
                    i24 = i45 + 1;
                    charAt9 = stringInfo.charAt(i45);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i46 |= (charAt9 & 8191) << i47;
                    i47 += 13;
                    i45 = i24;
                }
                charAt16 = i46 | (charAt9 << i47);
                i45 = i24;
            }
            int i48 = i45 + 1;
            int charAt17 = stringInfo.charAt(i45);
            if (charAt17 >= 55296) {
                int i49 = charAt17 & 8191;
                int i50 = 13;
                while (true) {
                    i23 = i48 + 1;
                    charAt8 = stringInfo.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i23;
                }
                charAt17 = i49 | (charAt8 << i50);
                i48 = i23;
            }
            int i51 = i48 + 1;
            int charAt18 = stringInfo.charAt(i48);
            if (charAt18 >= 55296) {
                int i52 = charAt18 & 8191;
                int i53 = 13;
                while (true) {
                    i22 = i51 + 1;
                    charAt7 = stringInfo.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i22;
                }
                charAt18 = i52 | (charAt7 << i53);
                i51 = i22;
            }
            int i54 = i51 + 1;
            int charAt19 = stringInfo.charAt(i51);
            if (charAt19 >= 55296) {
                int i55 = charAt19 & 8191;
                int i56 = 13;
                while (true) {
                    i21 = i54 + 1;
                    charAt6 = stringInfo.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i21;
                }
                charAt19 = i55 | (charAt6 << i56);
                i54 = i21;
            }
            int i57 = i54 + 1;
            charAt = stringInfo.charAt(i54);
            if (charAt >= 55296) {
                int i58 = charAt & 8191;
                int i59 = 13;
                while (true) {
                    i20 = i57 + 1;
                    charAt5 = stringInfo.charAt(i57);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i58 |= (charAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i20;
                }
                charAt = i58 | (charAt5 << i59);
                i57 = i20;
            }
            int i60 = i57 + 1;
            int charAt20 = stringInfo.charAt(i57);
            if (charAt20 >= 55296) {
                int i61 = charAt20 & 8191;
                int i62 = 13;
                while (true) {
                    i19 = i60 + 1;
                    charAt4 = stringInfo.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i61 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i19;
                }
                charAt20 = i61 | (charAt4 << i62);
                i60 = i19;
            }
            int i63 = i60 + 1;
            int charAt21 = stringInfo.charAt(i60);
            if (charAt21 >= 55296) {
                int i64 = charAt21 & 8191;
                int i65 = 13;
                while (true) {
                    i18 = i63 + 1;
                    charAt3 = stringInfo.charAt(i63);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i18;
                }
                charAt21 = i64 | (charAt3 << i65);
                i63 = i18;
            }
            int i66 = i63 + 1;
            int charAt22 = stringInfo.charAt(i63);
            if (charAt22 >= 55296) {
                int i67 = charAt22 & 8191;
                int i68 = 13;
                while (true) {
                    i17 = i66 + 1;
                    charAt2 = stringInfo.charAt(i66);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i67 |= (charAt2 & 8191) << i68;
                    i68 += 13;
                    i66 = i17;
                }
                charAt22 = i67 | (charAt2 << i68);
                i66 = i17;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            i11 = (charAt16 * 2) + charAt17;
            int i69 = charAt20;
            i12 = charAt18;
            i13 = i69;
            i14 = charAt16;
            iArr = iArr2;
            i15 = charAt22;
            i42 = i66;
            i16 = charAt19;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i70 = i15 + i13;
        int i71 = i70;
        int i72 = i15;
        int i73 = 0;
        int i74 = 0;
        while (i42 < length) {
            int i75 = i42 + 1;
            int charAt23 = stringInfo.charAt(i42);
            if (charAt23 >= c10) {
                int i76 = charAt23 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i39 = i77 + 1;
                    charAt13 = stringInfo.charAt(i77);
                    if (charAt13 < c10) {
                        break;
                    }
                    i76 |= (charAt13 & 8191) << i78;
                    i78 += 13;
                    i77 = i39;
                }
                charAt23 = i76 | (charAt13 << i78);
                i25 = i39;
            } else {
                i25 = i75;
            }
            int i79 = i25 + 1;
            int charAt24 = stringInfo.charAt(i25);
            if (charAt24 >= c10) {
                int i80 = charAt24 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i38 = i81 + 1;
                    charAt12 = stringInfo.charAt(i81);
                    if (charAt12 < c10) {
                        break;
                    }
                    i80 |= (charAt12 & 8191) << i82;
                    i82 += 13;
                    i81 = i38;
                }
                charAt24 = i80 | (charAt12 << i82);
                i26 = i38;
            } else {
                i26 = i79;
            }
            int i83 = charAt24 & 255;
            int i84 = length;
            if ((charAt24 & 1024) != 0) {
                iArr[i73] = i74;
                i73++;
            }
            int[] iArr4 = iArr3;
            if (i83 >= 51) {
                int i85 = i26 + 1;
                int charAt25 = stringInfo.charAt(i26);
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i86 = charAt25 & 8191;
                    int i87 = 13;
                    while (true) {
                        i37 = i85 + 1;
                        charAt11 = stringInfo.charAt(i85);
                        if (charAt11 < c11) {
                            break;
                        }
                        i86 |= (charAt11 & 8191) << i87;
                        i87 += 13;
                        i85 = i37;
                        c11 = 55296;
                    }
                    charAt25 = i86 | (charAt11 << i87);
                    i85 = i37;
                }
                int i88 = i83 - 51;
                int i89 = i85;
                if (i88 == 9 || i88 == 17) {
                    i36 = i11 + 1;
                    objArr[((i74 / 3) * 2) + 1] = objects[i11];
                } else {
                    if (i88 == 12 && (rawMessageInfo.getSyntax().equals(ProtoSyntax.PROTO2) || (charAt24 & 2048) != 0)) {
                        i36 = i11 + 1;
                        objArr[((i74 / 3) * 2) + 1] = objects[i11];
                    }
                    int i90 = charAt25 * 2;
                    obj = objects[i90];
                    if (obj instanceof java.lang.reflect.Field) {
                        reflectField2 = reflectField(cls, (String) obj);
                        objects[i90] = reflectField2;
                    } else {
                        reflectField2 = (java.lang.reflect.Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(reflectField2);
                    int i91 = i90 + 1;
                    obj2 = objects[i91];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        reflectField3 = reflectField(cls, (String) obj2);
                        objects[i91] = reflectField3;
                    } else {
                        reflectField3 = (java.lang.reflect.Field) obj2;
                    }
                    str = stringInfo;
                    i33 = (int) unsafe.objectFieldOffset(reflectField3);
                    i34 = objectFieldOffset2;
                    i32 = 0;
                    i27 = charAt23;
                    i42 = i89;
                }
                i11 = i36;
                int i902 = charAt25 * 2;
                obj = objects[i902];
                if (obj instanceof java.lang.reflect.Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(reflectField2);
                int i912 = i902 + 1;
                obj2 = objects[i912];
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                str = stringInfo;
                i33 = (int) unsafe.objectFieldOffset(reflectField3);
                i34 = objectFieldOffset22;
                i32 = 0;
                i27 = charAt23;
                i42 = i89;
            } else {
                int i92 = i11 + 1;
                java.lang.reflect.Field reflectField4 = reflectField(cls, (String) objects[i11]);
                if (i83 == 9 || i83 == 17) {
                    i27 = charAt23;
                    objArr[((i74 / 3) * 2) + 1] = reflectField4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i27 = charAt23;
                        i35 = i11 + 2;
                        objArr[((i74 / 3) * 2) + 1] = objects[i92];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i27 = charAt23;
                        if (rawMessageInfo.getSyntax() == ProtoSyntax.PROTO2 || (charAt24 & 2048) != 0) {
                            i35 = i11 + 2;
                            objArr[((i74 / 3) * 2) + 1] = objects[i92];
                        }
                    } else if (i83 == 50) {
                        int i93 = i72 + 1;
                        iArr[i72] = i74;
                        int i94 = (i74 / 3) * 2;
                        int i95 = i11 + 2;
                        objArr[i94] = objects[i92];
                        if ((charAt24 & 2048) != 0) {
                            i28 = i11 + 3;
                            objArr[i94 + 1] = objects[i95];
                            i27 = charAt23;
                            i72 = i93;
                        } else {
                            i28 = i95;
                            i72 = i93;
                            i27 = charAt23;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                        if ((charAt24 & 4096) != 0 || i83 > 17) {
                            str = stringInfo;
                            i29 = i28;
                            i30 = 1048575;
                            i31 = i26;
                            i32 = 0;
                        } else {
                            int i96 = i26 + 1;
                            int charAt26 = stringInfo.charAt(i26);
                            if (charAt26 >= 55296) {
                                int i97 = charAt26 & 8191;
                                int i98 = 13;
                                while (true) {
                                    i31 = i96 + 1;
                                    charAt10 = stringInfo.charAt(i96);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i97 |= (charAt10 & 8191) << i98;
                                    i98 += 13;
                                    i96 = i31;
                                }
                                charAt26 = i97 | (charAt10 << i98);
                            } else {
                                i31 = i96;
                            }
                            int i99 = (i14 * 2) + (charAt26 / 32);
                            Object obj3 = objects[i99];
                            str = stringInfo;
                            if (obj3 instanceof java.lang.reflect.Field) {
                                reflectField = (java.lang.reflect.Field) obj3;
                            } else {
                                reflectField = reflectField(cls, (String) obj3);
                                objects[i99] = reflectField;
                            }
                            i29 = i28;
                            i30 = (int) unsafe.objectFieldOffset(reflectField);
                            i32 = charAt26 % 32;
                        }
                        int i100 = i30;
                        if (i83 >= 18 && i83 <= 49) {
                            iArr[i71] = objectFieldOffset;
                            i71++;
                        }
                        i33 = i100;
                        i34 = objectFieldOffset;
                        i11 = i29;
                        i42 = i31;
                    } else {
                        i27 = charAt23;
                    }
                    i28 = i35;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    str = stringInfo;
                    i29 = i28;
                    i30 = 1048575;
                    i31 = i26;
                    i32 = 0;
                    int i1002 = i30;
                    if (i83 >= 18) {
                        iArr[i71] = objectFieldOffset;
                        i71++;
                    }
                    i33 = i1002;
                    i34 = objectFieldOffset;
                    i11 = i29;
                    i42 = i31;
                }
                i28 = i92;
                objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                if ((charAt24 & 4096) != 0) {
                }
                str = stringInfo;
                i29 = i28;
                i30 = 1048575;
                i31 = i26;
                i32 = 0;
                int i10022 = i30;
                if (i83 >= 18) {
                }
                i33 = i10022;
                i34 = objectFieldOffset;
                i11 = i29;
                i42 = i31;
            }
            int i101 = i74 + 1;
            iArr4[i74] = i27;
            int i102 = i74 + 2;
            int i103 = i33;
            iArr4[i101] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? REQUIRED_MASK : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | i34;
            i74 += 3;
            iArr4[i102] = (i32 << 20) | i103;
            length = i84;
            iArr3 = iArr4;
            stringInfo = str;
            c10 = 55296;
        }
        return new MessageSchema<>(iArr3, objArr, i12, i16, rawMessageInfo.getDefaultInstance(), rawMessageInfo.getSyntax(), false, iArr, i15, i70, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int numberAt(int i10) {
        return this.buffer[i10];
    }

    private static long offset(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t10, long j10) {
        return ((Boolean) UnsafeUtil.getObject(t10, j10)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t10, long j10) {
        return ((Double) UnsafeUtil.getObject(t10, j10)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t10, long j10) {
        return ((Float) UnsafeUtil.getObject(t10, j10)).floatValue();
    }

    private static <T> int oneofIntAt(T t10, long j10) {
        return ((Integer) UnsafeUtil.getObject(t10, j10)).intValue();
    }

    private static <T> long oneofLongAt(T t10, long j10) {
        return ((Long) UnsafeUtil.getObject(t10, j10)).longValue();
    }

    private <K, V> int parseMapField(T t10, byte[] bArr, int i10, int i11, int i12, long j10, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(t10, j10, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i10, i11, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        long j11 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t10, j10, Long.valueOf(registers.long1));
                unsafe.putInt(t10, j11, i13);
                return decodeVarint64;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                unsafe.putObject(t10, j10, Integer.valueOf(registers.int1));
                unsafe.putInt(t10, j11, i13);
                return decodeVarint32;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t10, j10, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t10, j11, i13);
                return decodeVarint642;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                int i22 = registers.int1;
                if (i22 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !Utf8.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i22)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, decodeVarint322, i22, Internal.UTF_8));
                    decodeVarint322 += i22;
                }
                unsafe.putInt(t10, j11, i13);
                return decodeVarint322;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t10, i13, i17);
                int mergeMessageField = ArrayDecoders.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i17), bArr, i10, i11, registers);
                storeOneofMessageField(t10, i13, i17, mutableOneofMessageFieldForMerge);
                return mergeMessageField;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int decodeBytes = ArrayDecoders.decodeBytes(bArr, i10, registers);
                unsafe.putObject(t10, j10, registers.object1);
                unsafe.putInt(t10, j11, i13);
                return decodeBytes;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int decodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                int i23 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i17);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i23)) {
                    getMutableUnknownFields(t10).storeField(i12, Long.valueOf(i23));
                    return decodeVarint323;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(i23));
                unsafe.putInt(t10, j11, i13);
                return decodeVarint323;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int decodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                unsafe.putObject(t10, j10, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t10, j11, i13);
                return decodeVarint324;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t10, j10, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t10, j11, i13);
                return decodeVarint643;
            case 68:
                if (i14 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t10, i13, i17);
                    int mergeGroupField = ArrayDecoders.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i17), bArr, i10, i11, (i12 & (-8)) | 4, registers);
                    storeOneofMessageField(t10, i13, i17, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, ArrayDecoders.Registers registers) {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(t10, j11);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, protobufList);
        }
        Internal.ProtobufList protobufList2 = protobufList;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i10, protobufList2, registers);
                }
                if (i14 == 1) {
                    return ArrayDecoders.decodeDoubleList(i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i10, protobufList2, registers);
                }
                if (i14 == 5) {
                    return ArrayDecoders.decodeFloatList(i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i10, protobufList2, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeVarint64List(i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i10, protobufList2, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeVarint32List(i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i10, protobufList2, registers);
                }
                if (i14 == 1) {
                    return ArrayDecoders.decodeFixed64List(i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i10, protobufList2, registers);
                }
                if (i14 == 5) {
                    return ArrayDecoders.decodeFixed32List(i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i10, protobufList2, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeBoolList(i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? ArrayDecoders.decodeStringList(i12, bArr, i10, i11, protobufList2, registers) : ArrayDecoders.decodeStringListRequireUtf8(i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return ArrayDecoders.decodeBytesList(i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        decodeVarint32List = ArrayDecoders.decodeVarint32List(i12, bArr, i10, i11, protobufList2, registers);
                    }
                    return i10;
                }
                decodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i10, protobufList2, registers);
                SchemaUtil.filterUnknownEnumList((Object) t10, i13, (List<Integer>) protobufList2, getEnumFieldVerifier(i15), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case 47:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i10, protobufList2, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeSInt32List(i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i10, protobufList2, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeSInt64List(i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufList2, registers);
                }
                return i10;
            default:
                return i10;
        }
    }

    private int positionForFieldNumber(int i10) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, 0);
    }

    private int presenceMaskAndOffsetAt(int i10) {
        return this.buffer[i10 + 2];
    }

    private <E> void readGroupList(Object obj, long j10, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j10), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i10, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i10)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i10, Reader reader) {
        if (isEnforceUtf8(i10)) {
            UnsafeUtil.putObject(obj, offset(i10), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i10), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i10), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i10, Reader reader) {
        if (isEnforceUtf8(i10)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t10, int i10) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & presenceMaskAndOffsetAt;
        if (j10 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t10, j10, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t10, j10));
    }

    private void setOneofPresent(T t10, int i10, int i11) {
        UnsafeUtil.putInt(t10, presenceMaskAndOffsetAt(i11) & 1048575, i10);
    }

    private int slowPositionForFieldNumber(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int numberAt = numberAt(i13);
            if (i10 == numberAt) {
                return i13;
            }
            if (i10 < numberAt) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i10, Object[] objArr) {
        int objectFieldOffset;
        int id2;
        long objectFieldOffset2;
        int i11;
        int i12;
        OneofInfo oneof = fieldInfo.getOneof();
        if (oneof == null) {
            FieldType type = fieldInfo.getType();
            objectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            id2 = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                i11 = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
                i12 = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                i11 = 0;
                i12 = 0;
            } else {
                objectFieldOffset2 = UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i10] = fieldInfo.getFieldNumber();
            iArr[i10 + 1] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | (!fieldInfo.isEnforceUtf8() ? 536870912 : 0) | (id2 << 20) | objectFieldOffset;
            iArr[i10 + 2] = i11 | (i12 << 20);
            Class<?> messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[((i10 / 3) * 2) + 1] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[((i10 / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            int i13 = (i10 / 3) * 2;
            objArr[i13] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i13 + 1] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[i13 + 1] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        id2 = fieldInfo.getType().id() + 51;
        objectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
        objectFieldOffset2 = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        i11 = (int) objectFieldOffset2;
        i12 = 0;
        iArr[i10] = fieldInfo.getFieldNumber();
        if (!fieldInfo.isEnforceUtf8()) {
        }
        iArr[i10 + 1] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | (!fieldInfo.isEnforceUtf8() ? 536870912 : 0) | (id2 << 20) | objectFieldOffset;
        iArr[i10 + 2] = i11 | (i12 << 20);
        Class<?> messageFieldClass2 = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
        }
    }

    private void storeMessageField(T t10, int i10, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i10)), obj);
        setFieldPresent(t10, i10);
    }

    private void storeOneofMessageField(T t10, int i10, int i11, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i11)), obj);
        setOneofPresent(t10, i10, i11);
    }

    private static int type(int i10) {
        return (i10 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i10) {
        return this.buffer[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInAscendingOrder(T t10, Writer writer) {
        Map.Entry<?, ?> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i10;
        boolean z10;
        Map.Entry<?, ?> entry2;
        int i11;
        int i12;
        int i13;
        boolean z11;
        MessageSchema<T> messageSchema = this;
        if (messageSchema.hasExtensions) {
            FieldSet<?> extensions = messageSchema.extensionSchema.getExtensions(t10);
            if (!extensions.isEmpty()) {
                Iterator<Map.Entry<?, Object>> it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
                length = messageSchema.buffer.length;
                Unsafe unsafe = UNSAFE;
                int i14 = 1048575;
                i10 = 0;
                int i15 = 0;
                while (i10 < length) {
                    int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i10);
                    int numberAt = messageSchema.numberAt(i10);
                    int type = type(typeAndOffsetAt);
                    if (type <= 17) {
                        int i16 = messageSchema.buffer[i10 + 2];
                        z10 = true;
                        int i17 = i16 & 1048575;
                        if (i17 != i14) {
                            i15 = i17 == 1048575 ? 0 : unsafe.getInt(t10, i17);
                            i14 = i17;
                        }
                        int i18 = 1 << (i16 >>> 20);
                        entry2 = entry;
                        i11 = i14;
                        i12 = i15;
                        i13 = i18;
                    } else {
                        z10 = true;
                        entry2 = entry;
                        i11 = i14;
                        i12 = i15;
                        i13 = 0;
                    }
                    while (entry2 != null && messageSchema.extensionSchema.extensionNumber(entry2) <= numberAt) {
                        messageSchema.extensionSchema.serializeExtension(writer, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long offset = offset(typeAndOffsetAt);
                    switch (type) {
                        case 0:
                            if (!messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                break;
                            } else {
                                writer.writeDouble(numberAt, doubleAt(t10, offset));
                                break;
                            }
                        case 1:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeFloat(numberAt, floatAt(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 2:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeInt64(numberAt, unsafe.getLong(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 3:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeUInt64(numberAt, unsafe.getLong(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 4:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeInt32(numberAt, unsafe.getInt(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 5:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeFixed64(numberAt, unsafe.getLong(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 6:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeFixed32(numberAt, unsafe.getInt(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 7:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeBool(numberAt, booleanAt(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 8:
                            if (!messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                break;
                            } else {
                                messageSchema.writeString(numberAt, unsafe.getObject(t10, offset), writer);
                                break;
                            }
                        case 9:
                            if (!messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                break;
                            } else {
                                writer.writeMessage(numberAt, unsafe.getObject(t10, offset), messageSchema.getMessageFieldSchema(i10));
                                break;
                            }
                        case 10:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeBytes(numberAt, (ByteString) unsafe.getObject(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 11:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeUInt32(numberAt, unsafe.getInt(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 12:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeEnum(numberAt, unsafe.getInt(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 13:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeSFixed32(numberAt, unsafe.getInt(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 14:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeSFixed64(numberAt, unsafe.getLong(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 15:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeSInt32(numberAt, unsafe.getInt(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 16:
                            if (messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                writer.writeSInt64(numberAt, unsafe.getLong(t10, offset));
                            }
                            messageSchema = this;
                            break;
                        case 17:
                            if (!messageSchema.isFieldPresent(t10, i10, i11, i12, i13)) {
                                break;
                            } else {
                                writer.writeGroup(numberAt, unsafe.getObject(t10, offset), messageSchema.getMessageFieldSchema(i10));
                                break;
                            }
                        case 18:
                            SchemaUtil.writeDoubleList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 19:
                            SchemaUtil.writeFloatList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 20:
                            SchemaUtil.writeInt64List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 21:
                            SchemaUtil.writeUInt64List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 22:
                            SchemaUtil.writeInt32List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 23:
                            SchemaUtil.writeFixed64List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 24:
                            SchemaUtil.writeFixed32List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 25:
                            SchemaUtil.writeBoolList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 26:
                            SchemaUtil.writeStringList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer);
                            break;
                        case 27:
                            SchemaUtil.writeMessageList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, messageSchema.getMessageFieldSchema(i10));
                            break;
                        case 28:
                            SchemaUtil.writeBytesList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer);
                            break;
                        case 29:
                            z11 = false;
                            SchemaUtil.writeUInt32List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 30:
                            z11 = false;
                            SchemaUtil.writeEnumList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 31:
                            z11 = false;
                            SchemaUtil.writeSFixed32List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 32:
                            z11 = false;
                            SchemaUtil.writeSFixed64List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 33:
                            z11 = false;
                            SchemaUtil.writeSInt32List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 34:
                            z11 = false;
                            SchemaUtil.writeSInt64List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, false);
                            break;
                        case 35:
                            SchemaUtil.writeDoubleList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 36:
                            SchemaUtil.writeFloatList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 37:
                            SchemaUtil.writeInt64List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 38:
                            SchemaUtil.writeUInt64List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 39:
                            SchemaUtil.writeInt32List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 40:
                            SchemaUtil.writeFixed64List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 41:
                            SchemaUtil.writeFixed32List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 42:
                            SchemaUtil.writeBoolList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 43:
                            SchemaUtil.writeUInt32List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 44:
                            SchemaUtil.writeEnumList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 45:
                            SchemaUtil.writeSFixed32List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 46:
                            SchemaUtil.writeSFixed64List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 47:
                            SchemaUtil.writeSInt32List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 48:
                            SchemaUtil.writeSInt64List(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, z10);
                            break;
                        case 49:
                            SchemaUtil.writeGroupList(messageSchema.numberAt(i10), (List) unsafe.getObject(t10, offset), writer, messageSchema.getMessageFieldSchema(i10));
                            break;
                        case 50:
                            messageSchema.writeMapHelper(writer, numberAt, unsafe.getObject(t10, offset), i10);
                            break;
                        case 51:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(t10, offset));
                            }
                            break;
                        case 52:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeFloat(numberAt, oneofFloatAt(t10, offset));
                            }
                            break;
                        case 53:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeInt64(numberAt, oneofLongAt(t10, offset));
                            }
                            break;
                        case 54:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeUInt64(numberAt, oneofLongAt(t10, offset));
                            }
                            break;
                        case 55:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeInt32(numberAt, oneofIntAt(t10, offset));
                            }
                            break;
                        case 56:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeFixed64(numberAt, oneofLongAt(t10, offset));
                            }
                            break;
                        case 57:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeFixed32(numberAt, oneofIntAt(t10, offset));
                            }
                            break;
                        case 58:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeBool(numberAt, oneofBooleanAt(t10, offset));
                            }
                            break;
                        case 59:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                messageSchema.writeString(numberAt, unsafe.getObject(t10, offset), writer);
                            }
                            break;
                        case 60:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeMessage(numberAt, unsafe.getObject(t10, offset), messageSchema.getMessageFieldSchema(i10));
                            }
                            break;
                        case 61:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeBytes(numberAt, (ByteString) unsafe.getObject(t10, offset));
                            }
                            break;
                        case 62:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeUInt32(numberAt, oneofIntAt(t10, offset));
                            }
                            break;
                        case 63:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeEnum(numberAt, oneofIntAt(t10, offset));
                            }
                            break;
                        case 64:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(t10, offset));
                            }
                            break;
                        case 65:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(t10, offset));
                            }
                            break;
                        case 66:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeSInt32(numberAt, oneofIntAt(t10, offset));
                            }
                            break;
                        case 67:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeSInt64(numberAt, oneofLongAt(t10, offset));
                            }
                            break;
                        case 68:
                            if (messageSchema.isOneofPresent(t10, numberAt, i10)) {
                                writer.writeGroup(numberAt, unsafe.getObject(t10, offset), messageSchema.getMessageFieldSchema(i10));
                            }
                            break;
                    }
                    i10 += 3;
                    i15 = i12;
                    i14 = i11;
                    entry = entry2;
                }
                while (entry != null) {
                    messageSchema.extensionSchema.serializeExtension(writer, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, t10, writer);
            }
        }
        entry = null;
        it = null;
        length = messageSchema.buffer.length;
        Unsafe unsafe2 = UNSAFE;
        int i142 = 1048575;
        i10 = 0;
        int i152 = 0;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, t10, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInDescendingOrder(T t10, Writer writer) {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        writeUnknownInMessageTo(this.unknownFieldSchema, t10, writer);
        if (this.hasExtensions) {
            FieldSet<?> extensions = this.extensionSchema.getExtensions(t10);
            if (!extensions.isEmpty()) {
                it = extensions.descendingIterator();
                entry = (Map.Entry) it.next();
                for (length = this.buffer.length - 3; length >= 0; length -= 3) {
                    int typeAndOffsetAt = typeAndOffsetAt(length);
                    int numberAt = numberAt(length);
                    while (entry != null && this.extensionSchema.extensionNumber(entry) > numberAt) {
                        this.extensionSchema.serializeExtension(writer, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (type(typeAndOffsetAt)) {
                        case 0:
                            if (isFieldPresent(t10, length)) {
                                writer.writeDouble(numberAt, doubleAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (isFieldPresent(t10, length)) {
                                writer.writeFloat(numberAt, floatAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (isFieldPresent(t10, length)) {
                                writer.writeInt64(numberAt, longAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (isFieldPresent(t10, length)) {
                                writer.writeUInt64(numberAt, longAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (isFieldPresent(t10, length)) {
                                writer.writeInt32(numberAt, intAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (isFieldPresent(t10, length)) {
                                writer.writeFixed64(numberAt, longAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (isFieldPresent(t10, length)) {
                                writer.writeFixed32(numberAt, intAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (isFieldPresent(t10, length)) {
                                writer.writeBool(numberAt, booleanAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (isFieldPresent(t10, length)) {
                                writeString(numberAt, UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (isFieldPresent(t10, length)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (isFieldPresent(t10, length)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (isFieldPresent(t10, length)) {
                                writer.writeUInt32(numberAt, intAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (isFieldPresent(t10, length)) {
                                writer.writeEnum(numberAt, intAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (isFieldPresent(t10, length)) {
                                writer.writeSFixed32(numberAt, intAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (isFieldPresent(t10, length)) {
                                writer.writeSFixed64(numberAt, longAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (isFieldPresent(t10, length)) {
                                writer.writeSInt32(numberAt, intAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (isFieldPresent(t10, length)) {
                                writer.writeSInt64(numberAt, longAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (isFieldPresent(t10, length)) {
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 19:
                            SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 20:
                            SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 21:
                            SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 22:
                            SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 23:
                            SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 24:
                            SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 25:
                            SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 26:
                            SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer);
                            break;
                        case 27:
                            SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 28:
                            SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer);
                            break;
                        case 29:
                            SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 30:
                            SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 31:
                            SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 32:
                            SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 33:
                            SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 34:
                            SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 35:
                            SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 36:
                            SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 37:
                            SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 38:
                            SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 39:
                            SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 40:
                            SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 41:
                            SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 42:
                            SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 43:
                            SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 44:
                            SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 45:
                            SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 46:
                            SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 47:
                            SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 48:
                            SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 49:
                            SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), length);
                            break;
                        case 51:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeFloat(numberAt, oneofFloatAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeInt64(numberAt, oneofLongAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeUInt64(numberAt, oneofLongAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeInt32(numberAt, oneofIntAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeFixed64(numberAt, oneofLongAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeFixed32(numberAt, oneofIntAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeBool(numberAt, oneofBooleanAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writeString(numberAt, UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeUInt32(numberAt, oneofIntAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeEnum(numberAt, oneofIntAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeSInt32(numberAt, oneofIntAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeSInt64(numberAt, oneofLongAt(t10, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (isOneofPresent(t10, numberAt, length)) {
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(t10, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.extensionSchema.serializeExtension(writer, entry);
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

    private <K, V> void writeMapHelper(Writer writer, int i10, Object obj, int i11) {
        if (obj != null) {
            writer.writeMap(i10, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i10, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i10, (String) obj);
        } else {
            writer.writeBytes(i10, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t10, Writer writer) {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t10), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t10, T t11) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!equals(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t10).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t10).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t10) {
        int i10;
        int computeDoubleSize;
        int computeFloatSize;
        int computeInt64Size;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        MessageSchema<T> messageSchema = this;
        T t11 = t10;
        Unsafe unsafe = UNSAFE;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i12 < messageSchema.buffer.length) {
            int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i12);
            int type = type(typeAndOffsetAt);
            int numberAt = messageSchema.numberAt(i12);
            int i16 = messageSchema.buffer[i12 + 2];
            int i17 = i16 & i11;
            if (type <= 17) {
                if (i17 != i15) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(t11, i17);
                    i15 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = i14;
            long offset = offset(typeAndOffsetAt);
            if (type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) {
                i17 = 0;
            }
            switch (type) {
                case 0:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeFloatSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i14 = i18 + computeFloatSize;
                        messageSchema = this;
                        t11 = t10;
                        break;
                    }
                    messageSchema = this;
                    t11 = t10;
                    i14 = i18;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeInt64Size = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i14 = i18 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i14 = i18;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeInt64Size = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i14 = i18 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i14 = i18;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeInt64Size = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i14 = i18 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i14 = i18;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeFloatSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i14 = i18 + computeFloatSize;
                        messageSchema = this;
                        t11 = t10;
                        break;
                    }
                    messageSchema = this;
                    t11 = t10;
                    i14 = i18;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeFloatSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i14 = i18 + computeFloatSize;
                        messageSchema = this;
                        t11 = t10;
                        break;
                    }
                    messageSchema = this;
                    t11 = t10;
                    i14 = i18;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeFloatSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i14 = i18 + computeFloatSize;
                        messageSchema = this;
                        t11 = t10;
                        break;
                    }
                    messageSchema = this;
                    t11 = t10;
                    i14 = i18;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        Object object = unsafe.getObject(t11, offset);
                        computeInt64Size = object instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object) : CodedOutputStream.computeStringSize(numberAt, (String) object);
                        i14 = i18 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i14 = i18;
                    break;
                case 9:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i12));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeInt64Size = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t11, offset));
                        i14 = i18 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i14 = i18;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeInt64Size = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i14 = i18 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i14 = i18;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeInt64Size = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t11, offset));
                        i14 = i18 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i14 = i18;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeFloatSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i14 = i18 + computeFloatSize;
                        messageSchema = this;
                        t11 = t10;
                        break;
                    }
                    messageSchema = this;
                    t11 = t10;
                    i14 = i18;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeFloatSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i14 = i18 + computeFloatSize;
                        messageSchema = this;
                        t11 = t10;
                        break;
                    }
                    messageSchema = this;
                    t11 = t10;
                    i14 = i18;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeInt64Size = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i14 = i18 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i14 = i18;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeInt64Size = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i14 = i18 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i14 = i18;
                    break;
                case 17:
                    if (messageSchema.isFieldPresent(t11, i12, i15, i13, i10)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i12));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 18:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 23:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(t11, offset));
                    i14 = i18 + computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i12));
                    i14 = i18 + computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(t11, offset));
                    i14 = i18 + computeDoubleSize;
                    break;
                case 29:
                    computeDoubleSize = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 31:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 33:
                    computeDoubleSize = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 34:
                    computeDoubleSize = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i14 = i18 + computeDoubleSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i17, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i14 = i18 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 49:
                    computeDoubleSize = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i12));
                    i14 = i18 + computeDoubleSize;
                    break;
                case 50:
                    computeDoubleSize = messageSchema.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t11, offset), messageSchema.getMapFieldDefaultEntry(i12));
                    i14 = i18 + computeDoubleSize;
                    break;
                case 51:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 52:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 53:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t11, offset));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 54:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t11, offset));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 55:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t11, offset));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 56:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 57:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 58:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 59:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        Object object2 = unsafe.getObject(t11, offset);
                        computeDoubleSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 60:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i12));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 61:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t11, offset));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 62:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t11, offset));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 63:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t11, offset));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 64:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 65:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 66:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t11, offset));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 67:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t11, offset));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(t11, numberAt, i12)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i12));
                        i14 = i18 + computeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                default:
                    i14 = i18;
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        int unknownFieldsSerializedSize = i14 + messageSchema.getUnknownFieldsSerializedSize(messageSchema.unknownFieldSchema, t11);
        return messageSchema.hasExtensions ? unknownFieldsSerializedSize + messageSchema.extensionSchema.getExtensions(t11).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t10) {
        int i10;
        int hashLong;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i12);
            int numberAt = numberAt(i12);
            long offset = offset(typeAndOffsetAt);
            int i13 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t10, offset)));
                    i11 = i10 + hashLong;
                    break;
                case 1:
                    i10 = i11 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 2:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 3:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 4:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 5:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 6:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 7:
                    i10 = i11 * 53;
                    hashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 8:
                    i10 = i11 * 53;
                    hashLong = ((String) UnsafeUtil.getObject(t10, offset)).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t10, offset);
                    if (object != null) {
                        i13 = object.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 10:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 11:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 12:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 13:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 14:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 15:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 16:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t10, offset);
                    if (object2 != null) {
                        i13 = object2.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 50:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 51:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t10, offset)));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashBoolean(oneofBooleanAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = ((String) UnsafeUtil.getObject(t10, offset)).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.unknownFieldSchema.getFromMessage(t10).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(t10).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.checkInitializedCount) {
            int i15 = this.intArray[i13];
            int numberAt = numberAt(i15);
            int typeAndOffsetAt = typeAndOffsetAt(i15);
            int i16 = this.buffer[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = UNSAFE.getInt(t10, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            T t11 = t10;
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(t11, i15, i10, i11, i18)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(t11, numberAt, i15) && !isInitialized(t11, typeAndOffsetAt, getMessageFieldSchema(i15))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(t11, typeAndOffsetAt, i15)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(t11, typeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (isFieldPresent(t11, i15, i10, i11, i18) && !isInitialized(t11, typeAndOffsetAt, getMessageFieldSchema(i15))) {
                return false;
            }
            i13++;
            t10 = t11;
            i12 = i10;
            i14 = i11;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t10).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t10) {
        if (isMutable(t10)) {
            if (t10 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int typeAndOffsetAt = typeAndOffsetAt(i10);
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
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(t10, offset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(t10, offset);
                                if (object != null) {
                                    unsafe.putObject(t10, offset, this.mapFieldSchema.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (isOneofPresent(t10, numberAt(i10), i10)) {
                        getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t10, offset));
                    }
                }
                if (isFieldPresent(t10, i10)) {
                    getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t10, offset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t10);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t10);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t10, T t11) {
        checkMutable(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            mergeSingleField(t10, t11, i10);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0422  */
    @CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int parseMessage(T t10, byte[] bArr, int i10, int i11, int i12, ArrayDecoders.Registers registers) {
        T t11;
        int i13;
        int i14;
        Unsafe unsafe;
        MessageSchema<T> messageSchema;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ArrayDecoders.Registers registers2;
        T t12;
        int decodeUnknownField;
        int i21;
        long j10;
        ArrayDecoders.Registers registers3;
        int i22;
        Unsafe unsafe2;
        int i23;
        byte[] bArr2;
        int i24;
        Unsafe unsafe3;
        ArrayDecoders.Registers registers4;
        T t13;
        byte[] bArr3;
        int i25;
        int i26;
        byte[] bArr4;
        int i27;
        ArrayDecoders.Registers registers5;
        int i28;
        int i29;
        MessageSchema<T> messageSchema2 = this;
        T t14 = t10;
        byte[] bArr5 = bArr;
        int i30 = i11;
        ArrayDecoders.Registers registers6 = registers;
        checkMutable(t14);
        Unsafe unsafe4 = UNSAFE;
        int i31 = -1;
        int i32 = i10;
        int i33 = -1;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 1048575;
        while (true) {
            if (i32 < i30) {
                int i38 = i32 + 1;
                int i39 = bArr5[i32];
                if (i39 < 0) {
                    i38 = ArrayDecoders.decodeVarint32(i39, bArr5, i38, registers6);
                    i39 = registers6.int1;
                }
                int i40 = i38;
                i36 = i39;
                int i41 = i36 >>> 3;
                int i42 = i36 & 7;
                int positionForFieldNumber = i41 > i33 ? messageSchema2.positionForFieldNumber(i41, i34 / 3) : messageSchema2.positionForFieldNumber(i41);
                if (positionForFieldNumber == i31) {
                    i16 = i40;
                    i14 = i37;
                    unsafe = unsafe4;
                    i17 = i31;
                    i18 = i41;
                    i19 = 0;
                    messageSchema = messageSchema2;
                    i20 = i36;
                } else {
                    int i43 = messageSchema2.buffer[positionForFieldNumber + 1];
                    int i44 = i31;
                    int type = type(i43);
                    long offset = offset(i43);
                    if (type <= 17) {
                        int i45 = messageSchema2.buffer[positionForFieldNumber + 2];
                        int i46 = 1 << (i45 >>> 20);
                        int i47 = i45 & 1048575;
                        if (i47 != i37) {
                            i18 = i41;
                            j10 = offset;
                            if (i37 != 1048575) {
                                unsafe4.putInt(t14, i37, i35);
                            }
                            i35 = i47 == 1048575 ? 0 : unsafe4.getInt(t14, i47);
                        } else {
                            j10 = offset;
                            i18 = i41;
                            i47 = i37;
                        }
                        switch (type) {
                            case 0:
                                registers3 = registers;
                                i22 = positionForFieldNumber;
                                unsafe2 = unsafe4;
                                i23 = i40;
                                long j11 = j10;
                                bArr2 = bArr;
                                if (i42 == 1) {
                                    UnsafeUtil.putDouble(t14, j11, ArrayDecoders.decodeDouble(bArr2, i23));
                                    i24 = i23 + 8;
                                    i35 |= i46;
                                    Unsafe unsafe5 = unsafe2;
                                    i32 = i24;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe5;
                                    i30 = i11;
                                    registers6 = registers3;
                                    i37 = i47;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    break;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12 && i12 != 0) {
                                        t11 = t10;
                                        i13 = i11;
                                        i36 = i20;
                                        i15 = i16;
                                        break;
                                    } else {
                                        if (messageSchema.hasExtensions || registers2.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) {
                                            t12 = t10;
                                            decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                            i21 = i11;
                                        } else {
                                            decodeUnknownField = ArrayDecoders.decodeExtensionOrUnknownField(i20, bArr, i16, i11, t10, messageSchema.defaultInstance, messageSchema.unknownFieldSchema, registers2);
                                            t12 = t10;
                                            i21 = i11;
                                        }
                                        i32 = decodeUnknownField;
                                        bArr5 = bArr;
                                        i36 = i20;
                                        t14 = t12;
                                        i30 = i21;
                                        i34 = i19;
                                        messageSchema2 = messageSchema;
                                        i37 = i14;
                                        i31 = i17;
                                        i33 = i18;
                                        unsafe4 = unsafe;
                                        registers6 = registers;
                                        break;
                                    }
                                }
                            case 1:
                                registers3 = registers;
                                i22 = positionForFieldNumber;
                                unsafe2 = unsafe4;
                                i23 = i40;
                                long j12 = j10;
                                bArr2 = bArr;
                                if (i42 == 5) {
                                    UnsafeUtil.putFloat(t14, j12, ArrayDecoders.decodeFloat(bArr2, i23));
                                    i24 = i23 + 4;
                                    i35 |= i46;
                                    Unsafe unsafe52 = unsafe2;
                                    i32 = i24;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe52;
                                    i30 = i11;
                                    registers6 = registers3;
                                    i37 = i47;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    break;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                        break;
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                registers3 = registers;
                                i22 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i23 = i40;
                                long j13 = j10;
                                if (i42 == 0) {
                                    int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i23, registers3);
                                    T t15 = t14;
                                    unsafe3.putLong(t15, j13, registers3.long1);
                                    t14 = t15;
                                    i35 |= i46;
                                    i30 = i11;
                                    bArr5 = bArr;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    unsafe4 = unsafe3;
                                    i32 = decodeVarint64;
                                    registers6 = registers3;
                                    i37 = i47;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                registers3 = registers;
                                i22 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i23 = i40;
                                long j14 = j10;
                                if (i42 == 0) {
                                    int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i23, registers3);
                                    unsafe3.putInt(t14, j14, registers3.int1);
                                    i35 |= i46;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr;
                                    i30 = i11;
                                    i32 = decodeVarint32;
                                    registers6 = registers3;
                                    i37 = i47;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                T t16 = t14;
                                i22 = positionForFieldNumber;
                                i23 = i40;
                                long j15 = j10;
                                if (i42 == 1) {
                                    Unsafe unsafe6 = unsafe4;
                                    registers3 = registers;
                                    unsafe6.putLong(t16, j15, ArrayDecoders.decodeFixed64(bArr, i23));
                                    t14 = t16;
                                    i32 = i23 + 8;
                                    i35 |= i46;
                                    unsafe4 = unsafe6;
                                    bArr5 = bArr;
                                    i30 = i11;
                                    registers6 = registers3;
                                    i37 = i47;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    break;
                                } else {
                                    unsafe3 = unsafe4;
                                    registers3 = registers;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                registers4 = registers;
                                t13 = t14;
                                i22 = positionForFieldNumber;
                                i23 = i40;
                                long j16 = j10;
                                bArr3 = bArr;
                                if (i42 == 5) {
                                    unsafe4.putInt(t13, j16, ArrayDecoders.decodeFixed32(bArr3, i23));
                                    i25 = i23 + 4;
                                    i35 |= i46;
                                    i30 = i11;
                                    registers6 = registers4;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    i32 = i25;
                                    bArr5 = bArr3;
                                    t14 = t13;
                                    i37 = i47;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 7:
                                registers4 = registers;
                                t13 = t14;
                                i22 = positionForFieldNumber;
                                i26 = i40;
                                long j17 = j10;
                                bArr3 = bArr;
                                if (i42 == 0) {
                                    i25 = ArrayDecoders.decodeVarint64(bArr3, i26, registers4);
                                    UnsafeUtil.putBoolean(t13, j17, registers4.long1 != 0);
                                    i35 |= i46;
                                    i30 = i11;
                                    registers6 = registers4;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    i32 = i25;
                                    bArr5 = bArr3;
                                    t14 = t13;
                                    i37 = i47;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i23 = i26;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 8:
                                registers4 = registers;
                                t13 = t14;
                                i22 = positionForFieldNumber;
                                i26 = i40;
                                long j18 = j10;
                                bArr3 = bArr;
                                if (i42 == 2) {
                                    i25 = isEnforceUtf8(i43) ? ArrayDecoders.decodeStringRequireUtf8(bArr3, i26, registers4) : ArrayDecoders.decodeString(bArr3, i26, registers4);
                                    unsafe4.putObject(t13, j18, registers4.object1);
                                    i35 |= i46;
                                    i30 = i11;
                                    registers6 = registers4;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    i32 = i25;
                                    bArr5 = bArr3;
                                    t14 = t13;
                                    i37 = i47;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i23 = i26;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 9:
                                i22 = positionForFieldNumber;
                                Unsafe unsafe7 = unsafe4;
                                if (i42 == 2) {
                                    T t17 = t14;
                                    Object mutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t17, i22);
                                    t13 = t17;
                                    unsafe4 = unsafe7;
                                    i25 = ArrayDecoders.mergeMessageField(mutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i22), bArr, i40, i11, registers);
                                    bArr3 = bArr;
                                    registers4 = registers;
                                    messageSchema2.storeMessageField(t13, i22, mutableMessageFieldForMerge);
                                    i35 |= i46;
                                    i30 = i11;
                                    registers6 = registers4;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    i32 = i25;
                                    bArr5 = bArr3;
                                    t14 = t13;
                                    i37 = i47;
                                    break;
                                } else {
                                    t13 = t14;
                                    bArr3 = bArr;
                                    unsafe4 = unsafe7;
                                    i26 = i40;
                                    registers4 = registers;
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i23 = i26;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 10:
                                bArr4 = bArr;
                                i22 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i27 = i40;
                                long j19 = j10;
                                registers5 = registers;
                                if (i42 == 2) {
                                    i32 = ArrayDecoders.decodeBytes(bArr4, i27, registers5);
                                    unsafe3.putObject(t14, j19, registers5.object1);
                                    i35 |= i46;
                                    i30 = i11;
                                    registers6 = registers5;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i37 = i47;
                                    break;
                                } else {
                                    registers3 = registers5;
                                    i23 = i27;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 12:
                                bArr4 = bArr;
                                i22 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i27 = i40;
                                long j20 = j10;
                                registers5 = registers;
                                if (i42 != 0) {
                                    registers3 = registers5;
                                    i23 = i27;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                } else {
                                    i32 = ArrayDecoders.decodeVarint32(bArr4, i27, registers5);
                                    int i48 = registers5.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i22);
                                    if (!isLegacyEnumIsClosed(i43) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i48)) {
                                        unsafe3.putInt(t14, j20, i48);
                                        i35 |= i46;
                                        i30 = i11;
                                        registers6 = registers5;
                                        i34 = i22;
                                        i31 = i44;
                                        i33 = i18;
                                        unsafe4 = unsafe3;
                                        bArr5 = bArr4;
                                        i37 = i47;
                                        break;
                                    } else {
                                        getMutableUnknownFields(t14).storeField(i36, Long.valueOf(i48));
                                        i30 = i11;
                                        registers6 = registers5;
                                        i34 = i22;
                                        i31 = i44;
                                        i33 = i18;
                                        unsafe4 = unsafe3;
                                        bArr5 = bArr4;
                                        i37 = i47;
                                    }
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                i22 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i27 = i40;
                                long j21 = j10;
                                registers5 = registers;
                                if (i42 == 0) {
                                    i32 = ArrayDecoders.decodeVarint32(bArr4, i27, registers5);
                                    unsafe3.putInt(t14, j21, CodedInputStream.decodeZigZag32(registers5.int1));
                                    i35 |= i46;
                                    i30 = i11;
                                    registers6 = registers5;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i37 = i47;
                                    break;
                                } else {
                                    registers3 = registers5;
                                    i23 = i27;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 16:
                                bArr4 = bArr;
                                i22 = positionForFieldNumber;
                                i27 = i40;
                                if (i42 == 0) {
                                    int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr4, i27, registers);
                                    T t18 = t14;
                                    Unsafe unsafe8 = unsafe4;
                                    registers5 = registers;
                                    unsafe8.putLong(t18, j10, CodedInputStream.decodeZigZag64(registers.long1));
                                    unsafe3 = unsafe8;
                                    t14 = t18;
                                    i35 |= i46;
                                    i30 = i11;
                                    i32 = decodeVarint642;
                                    registers6 = registers5;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i37 = i47;
                                    break;
                                } else {
                                    Unsafe unsafe9 = unsafe4;
                                    registers5 = registers;
                                    unsafe3 = unsafe9;
                                    registers3 = registers5;
                                    i23 = i27;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 17:
                                if (i42 == 3) {
                                    Object mutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t14, positionForFieldNumber);
                                    i22 = positionForFieldNumber;
                                    i32 = ArrayDecoders.mergeGroupField(mutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(positionForFieldNumber), bArr, i40, i11, (i18 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t14, i22, mutableMessageFieldForMerge2);
                                    i35 |= i46;
                                    i30 = i11;
                                    registers6 = registers;
                                    bArr5 = bArr;
                                    i37 = i47;
                                    i34 = i22;
                                    i31 = i44;
                                    i33 = i18;
                                    break;
                                } else {
                                    i22 = positionForFieldNumber;
                                    registers3 = registers;
                                    unsafe2 = unsafe4;
                                    i23 = i40;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i14 = i47;
                                    i20 = i36;
                                    i16 = i23;
                                    i17 = i44;
                                    registers2 = registers3;
                                    i19 = i22;
                                    if (i20 != i12) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t12 = t10;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                    i21 = i11;
                                    i32 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i36 = i20;
                                    t14 = t12;
                                    i30 = i21;
                                    i34 = i19;
                                    messageSchema2 = messageSchema;
                                    i37 = i14;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            default:
                                registers3 = registers;
                                i22 = positionForFieldNumber;
                                unsafe2 = unsafe4;
                                i23 = i40;
                                messageSchema = messageSchema2;
                                unsafe = unsafe2;
                                i14 = i47;
                                i20 = i36;
                                i16 = i23;
                                i17 = i44;
                                registers2 = registers3;
                                i19 = i22;
                                if (i20 != i12) {
                                }
                                if (messageSchema.hasExtensions) {
                                }
                                t12 = t10;
                                decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                i21 = i11;
                                i32 = decodeUnknownField;
                                bArr5 = bArr;
                                i36 = i20;
                                t14 = t12;
                                i30 = i21;
                                i34 = i19;
                                messageSchema2 = messageSchema;
                                i37 = i14;
                                i31 = i17;
                                i33 = i18;
                                unsafe4 = unsafe;
                                registers6 = registers;
                                break;
                        }
                    } else {
                        int i49 = i37;
                        i18 = i41;
                        i19 = positionForFieldNumber;
                        Unsafe unsafe10 = unsafe4;
                        if (type != 27) {
                            i28 = i40;
                            if (type <= 49) {
                                unsafe = unsafe10;
                                i14 = i49;
                                i17 = i44;
                                i29 = i35;
                                int parseRepeatedField = messageSchema2.parseRepeatedField(t10, bArr, i28, i11, i36, i18, i42, i19, i43, type, offset, registers);
                                i36 = i36;
                                if (parseRepeatedField != i28) {
                                    messageSchema2 = this;
                                    t14 = t10;
                                    bArr5 = bArr;
                                    i30 = i11;
                                    i32 = parseRepeatedField;
                                    i34 = i19;
                                    i37 = i14;
                                    i35 = i29;
                                    i31 = i17;
                                    i33 = i18;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                } else {
                                    messageSchema = this;
                                    i16 = parseRepeatedField;
                                }
                            } else {
                                i36 = i36;
                                unsafe = unsafe10;
                                i14 = i49;
                                i17 = i44;
                                i29 = i35;
                                if (type != 50) {
                                    registers2 = registers;
                                    int parseOneofField = parseOneofField(t10, bArr, i28, i11, i36, i18, i42, i43, type, offset, i19, registers2);
                                    messageSchema = this;
                                    i20 = i36;
                                    i19 = i19;
                                    if (parseOneofField != i28) {
                                        t14 = t10;
                                        bArr5 = bArr;
                                        i30 = i11;
                                        i32 = parseOneofField;
                                        i34 = i19;
                                        registers6 = registers2;
                                        i37 = i14;
                                        i35 = i29;
                                        i31 = i17;
                                        i33 = i18;
                                        i36 = i20;
                                        messageSchema2 = messageSchema;
                                    } else {
                                        i16 = parseOneofField;
                                        i35 = i29;
                                        if (i20 != i12) {
                                        }
                                        if (messageSchema.hasExtensions) {
                                        }
                                        t12 = t10;
                                        decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                                        i21 = i11;
                                        i32 = decodeUnknownField;
                                        bArr5 = bArr;
                                        i36 = i20;
                                        t14 = t12;
                                        i30 = i21;
                                        i34 = i19;
                                        messageSchema2 = messageSchema;
                                        i37 = i14;
                                        i31 = i17;
                                        i33 = i18;
                                        unsafe4 = unsafe;
                                        registers6 = registers;
                                    }
                                } else if (i42 == 2) {
                                    int parseMapField = parseMapField(t10, bArr, i28, i11, i19, offset, registers);
                                    i19 = i19;
                                    if (parseMapField != i28) {
                                        messageSchema2 = this;
                                        t14 = t10;
                                        bArr5 = bArr;
                                        i30 = i11;
                                        registers6 = registers;
                                        i32 = parseMapField;
                                        i34 = i19;
                                        i37 = i14;
                                        i35 = i29;
                                        i31 = i17;
                                        i33 = i18;
                                    } else {
                                        messageSchema = this;
                                        i16 = parseMapField;
                                    }
                                } else {
                                    messageSchema = this;
                                    i16 = i28;
                                }
                                unsafe4 = unsafe;
                            }
                        } else if (i42 == 2) {
                            Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe10.getObject(t14, offset);
                            if (!protobufList.isModifiable()) {
                                int size = protobufList.size();
                                protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe10.putObject(t14, offset, protobufList);
                            }
                            unsafe4 = unsafe10;
                            registers6 = registers;
                            i30 = i11;
                            i32 = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i19), i36, bArr, i40, i11, protobufList, registers6);
                            i34 = i19;
                            i37 = i49;
                            i31 = i44;
                            i33 = i18;
                            t14 = t10;
                            bArr5 = bArr;
                        } else {
                            unsafe = unsafe10;
                            i14 = i49;
                            i28 = i40;
                            i17 = i44;
                            i29 = i35;
                            messageSchema = this;
                            i16 = i28;
                        }
                        i20 = i36;
                        i35 = i29;
                    }
                }
                registers2 = registers;
                if (i20 != i12) {
                }
                if (messageSchema.hasExtensions) {
                }
                t12 = t10;
                decodeUnknownField = ArrayDecoders.decodeUnknownField(i20, bArr, i16, i11, getMutableUnknownFields(t12), registers);
                i21 = i11;
                i32 = decodeUnknownField;
                bArr5 = bArr;
                i36 = i20;
                t14 = t12;
                i30 = i21;
                i34 = i19;
                messageSchema2 = messageSchema;
                i37 = i14;
                i31 = i17;
                i33 = i18;
                unsafe4 = unsafe;
                registers6 = registers;
            } else {
                t11 = t14;
                i13 = i30;
                i14 = i37;
                unsafe = unsafe4;
                messageSchema = messageSchema2;
                i15 = i32;
            }
        }
        int i50 = i14;
        if (i50 != 1048575) {
            unsafe.putInt(t11, i50, i35);
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i51 = messageSchema.checkInitializedCount; i51 < messageSchema.repeatedFieldOffsetStart; i51++) {
            unknownFieldSetLite = (UnknownFieldSetLite) messageSchema.filterMapUnknownEnumValues(t11, messageSchema.intArray[i51], unknownFieldSetLite, messageSchema.unknownFieldSchema, t10);
        }
        T t19 = t11;
        MessageSchema<T> messageSchema3 = messageSchema;
        if (unknownFieldSetLite != null) {
            messageSchema3.unknownFieldSchema.setBuilderToMessage(t19, unknownFieldSetLite);
        }
        if (i12 == 0) {
            if (i15 != i13) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i15 > i13 || i36 != i12) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i15;
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t10, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t10, writer);
        } else {
            writeFieldsInAscendingOrder(t10, writer);
        }
    }

    private boolean isFieldPresent(T t10, int i10) {
        boolean equals;
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & presenceMaskAndOffsetAt;
        if (j10 != 1048575) {
            return (UnsafeUtil.getInt(t10, j10) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i10);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t10, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t10, offset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t10, offset) != 0;
            case 3:
                return UnsafeUtil.getLong(t10, offset) != 0;
            case 4:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 5:
                return UnsafeUtil.getLong(t10, offset) != 0;
            case 6:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t10, offset);
            case 8:
                Object object = UnsafeUtil.getObject(t10, offset);
                if (object instanceof String) {
                    equals = ((String) object).isEmpty();
                    break;
                } else {
                    if (!(object instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    equals = ByteString.EMPTY.equals(object);
                    break;
                }
            case 9:
                return UnsafeUtil.getObject(t10, offset) != null;
            case 10:
                equals = ByteString.EMPTY.equals(UnsafeUtil.getObject(t10, offset));
                break;
            case 11:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 12:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 13:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 14:
                return UnsafeUtil.getLong(t10, offset) != 0;
            case 15:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 16:
                return UnsafeUtil.getLong(t10, offset) != 0;
            case 17:
                return UnsafeUtil.getObject(t10, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    private int positionForFieldNumber(int i10, int i11) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, i11);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t10, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        checkMutable(t10);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, reader, extensionRegistryLite);
    }

    private boolean equals(T t10, T t11, int i10) {
        int typeAndOffsetAt = typeAndOffsetAt(i10);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(t10, t11, i10) || Double.doubleToLongBits(UnsafeUtil.getDouble(t10, offset)) != Double.doubleToLongBits(UnsafeUtil.getDouble(t11, offset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(t10, t11, i10) || Float.floatToIntBits(UnsafeUtil.getFloat(t10, offset)) != Float.floatToIntBits(UnsafeUtil.getFloat(t11, offset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getLong(t10, offset) != UnsafeUtil.getLong(t11, offset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getLong(t10, offset) != UnsafeUtil.getLong(t11, offset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getInt(t10, offset) != UnsafeUtil.getInt(t11, offset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getLong(t10, offset) != UnsafeUtil.getLong(t11, offset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getInt(t10, offset) != UnsafeUtil.getInt(t11, offset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getBoolean(t10, offset) != UnsafeUtil.getBoolean(t11, offset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(t10, t11, i10) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(t10, t11, i10) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(t10, t11, i10) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getInt(t10, offset) != UnsafeUtil.getInt(t11, offset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getInt(t10, offset) != UnsafeUtil.getInt(t11, offset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getInt(t10, offset) != UnsafeUtil.getInt(t11, offset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getLong(t10, offset) != UnsafeUtil.getLong(t11, offset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getInt(t10, offset) != UnsafeUtil.getInt(t11, offset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(t10, t11, i10) || UnsafeUtil.getLong(t10, offset) != UnsafeUtil.getLong(t11, offset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(t10, t11, i10) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset))) {
                }
                break;
            case 51:
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
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!isOneofCaseEqual(t10, t11, i10) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset))) {
                }
                break;
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t10, byte[] bArr, int i10, int i11, ArrayDecoders.Registers registers) {
        parseMessage(t10, bArr, i10, i11, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i10, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i10)));
    }
}
