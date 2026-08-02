package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class ExtensionSchemaLite extends AbstractC5958i<GeneratedMessageLite.ExtensionDescriptor> {

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60114a;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f60114a = iArr;
            try {
                iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60114a[WireFormat$FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60114a[WireFormat$FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60114a[WireFormat$FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60114a[WireFormat$FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60114a[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60114a[WireFormat$FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60114a[WireFormat$FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60114a[WireFormat$FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60114a[WireFormat$FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60114a[WireFormat$FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f60114a[WireFormat$FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f60114a[WireFormat$FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f60114a[WireFormat$FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f60114a[WireFormat$FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f60114a[WireFormat$FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f60114a[WireFormat$FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f60114a[WireFormat$FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    ExtensionSchemaLite() {
    }

    @Override // com.google.protobuf.AbstractC5958i
    int extensionNumber(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.AbstractC5958i
    Object findExtensionByNumber(C5957h c5957h, MessageLite messageLite, int i11) {
        return c5957h.a(i11, messageLite);
    }

    @Override // com.google.protobuf.AbstractC5958i
    C5961l<GeneratedMessageLite.ExtensionDescriptor> getExtensions(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.AbstractC5958i
    C5961l<GeneratedMessageLite.ExtensionDescriptor> getMutableExtensions(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.AbstractC5958i
    boolean hasExtensions(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.AbstractC5958i
    void makeImmutable(Object obj) {
        getExtensions(obj).v();
    }

    @Override // com.google.protobuf.AbstractC5958i
    <UT, UB> UB parseExtension(Object obj, I i11, Object obj2, C5957h c5957h, C5961l<GeneratedMessageLite.ExtensionDescriptor> c5961l, UB ub2, N<UT, UB> n11) throws IOException {
        Object valueOf;
        Object i12;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (a.f60114a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    i11.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    i11.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    i11.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    i11.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    i11.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    i11.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    i11.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    i11.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    i11.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    i11.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    i11.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    i11.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    i11.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    i11.readEnumList(arrayList);
                    ub2 = (UB) L.j(obj, number, arrayList, generatedExtension.descriptor.getEnumType(), ub2, n11);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            c5961l.z(generatedExtension.descriptor, arrayList);
            return ub2;
        }
        if (generatedExtension.getLiteType() != WireFormat$FieldType.ENUM) {
            switch (a.f60114a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    valueOf = Double.valueOf(i11.readDouble());
                    break;
                case 2:
                    valueOf = Float.valueOf(i11.readFloat());
                    break;
                case 3:
                    valueOf = Long.valueOf(i11.readInt64());
                    break;
                case 4:
                    valueOf = Long.valueOf(i11.readUInt64());
                    break;
                case 5:
                    valueOf = Integer.valueOf(i11.readInt32());
                    break;
                case 6:
                    valueOf = Long.valueOf(i11.readFixed64());
                    break;
                case 7:
                    valueOf = Integer.valueOf(i11.readFixed32());
                    break;
                case 8:
                    valueOf = Boolean.valueOf(i11.readBool());
                    break;
                case 9:
                    valueOf = Integer.valueOf(i11.readUInt32());
                    break;
                case 10:
                    valueOf = Integer.valueOf(i11.readSFixed32());
                    break;
                case 11:
                    valueOf = Long.valueOf(i11.readSFixed64());
                    break;
                case 12:
                    valueOf = Integer.valueOf(i11.readSInt32());
                    break;
                case 13:
                    valueOf = Long.valueOf(i11.readSInt64());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    valueOf = i11.readBytes();
                    break;
                case 16:
                    valueOf = i11.readString();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object i13 = c5961l.i(generatedExtension.descriptor);
                        if (i13 instanceof GeneratedMessageLite) {
                            J c11 = H.a().c(i13);
                            if (!((GeneratedMessageLite) i13).isMutable()) {
                                Object newInstance = c11.newInstance();
                                c11.mergeFrom(newInstance, i13);
                                c5961l.z(generatedExtension.descriptor, newInstance);
                                i13 = newInstance;
                            }
                            i11.mergeGroupField(i13, c11, c5957h);
                            return ub2;
                        }
                    }
                    valueOf = i11.readGroup(generatedExtension.getMessageDefaultInstance().getClass(), c5957h);
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object i14 = c5961l.i(generatedExtension.descriptor);
                        if (i14 instanceof GeneratedMessageLite) {
                            J c12 = H.a().c(i14);
                            if (!((GeneratedMessageLite) i14).isMutable()) {
                                Object newInstance2 = c12.newInstance();
                                c12.mergeFrom(newInstance2, i14);
                                c5961l.z(generatedExtension.descriptor, newInstance2);
                                i14 = newInstance2;
                            }
                            i11.mergeMessageField(i14, c12, c5957h);
                            return ub2;
                        }
                    }
                    valueOf = i11.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), c5957h);
                    break;
                default:
                    valueOf = null;
                    break;
            }
        } else {
            int readInt32 = i11.readInt32();
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(readInt32) == null) {
                return (UB) L.n(obj, number, readInt32, ub2, n11);
            }
            valueOf = Integer.valueOf(readInt32);
        }
        if (generatedExtension.isRepeated()) {
            c5961l.a(generatedExtension.descriptor, valueOf);
            return ub2;
        }
        int i15 = a.f60114a[generatedExtension.getLiteType().ordinal()];
        if ((i15 == 17 || i15 == 18) && (i12 = c5961l.i(generatedExtension.descriptor)) != null) {
            valueOf = ((MessageLite) i12).toBuilder().mergeFrom((MessageLite) valueOf).buildPartial();
        }
        c5961l.z(generatedExtension.descriptor, valueOf);
        return ub2;
    }

    @Override // com.google.protobuf.AbstractC5958i
    void parseLengthPrefixedMessageSetItem(I i11, Object obj, C5957h c5957h, C5961l<GeneratedMessageLite.ExtensionDescriptor> c5961l) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        c5961l.z(generatedExtension.descriptor, i11.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), c5957h));
    }

    @Override // com.google.protobuf.AbstractC5958i
    void parseMessageSetItem(ByteString byteString, Object obj, C5957h c5957h, C5961l<GeneratedMessageLite.ExtensionDescriptor> c5961l) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder newBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream newCodedInput = byteString.newCodedInput();
        newBuilderForType.mergeFrom(newCodedInput, c5957h);
        c5961l.z(generatedExtension.descriptor, newBuilderForType.buildPartial());
        newCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.AbstractC5958i
    void serializeExtension(T t2, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        if (!extensionDescriptor.isRepeated()) {
            switch (a.f60114a[extensionDescriptor.getLiteType().ordinal()]) {
                case 1:
                    t2.writeDouble(extensionDescriptor.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    t2.writeFloat(extensionDescriptor.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    t2.writeInt64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    t2.writeUInt64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    t2.writeInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    t2.writeFixed64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    t2.writeFixed32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    t2.writeBool(extensionDescriptor.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    t2.writeUInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    t2.writeSFixed32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    t2.writeSFixed64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    t2.writeSInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    t2.writeSInt64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    t2.writeInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    t2.writeBytes(extensionDescriptor.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    t2.writeString(extensionDescriptor.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    t2.writeGroup(extensionDescriptor.getNumber(), entry.getValue(), H.a().b(entry.getValue().getClass()));
                    break;
                case 18:
                    t2.writeMessage(extensionDescriptor.getNumber(), entry.getValue(), H.a().b(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f60114a[extensionDescriptor.getLiteType().ordinal()]) {
            case 1:
                L.r(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 2:
                L.u(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 3:
                L.w(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 4:
                L.C(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 5:
                L.v(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 6:
                L.t(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 7:
                L.s(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 8:
                L.q(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 9:
                L.B(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 10:
                L.x(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 11:
                L.y(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 12:
                L.z(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 13:
                L.A(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 14:
                L.v(extensionDescriptor.getNumber(), (List) entry.getValue(), t2, extensionDescriptor.isPacked());
                break;
            case 15:
                int number = extensionDescriptor.getNumber();
                List<ByteString> list = (List) entry.getValue();
                int i11 = L.f60134d;
                if (list != null && !list.isEmpty()) {
                    t2.writeBytesList(number, list);
                    break;
                }
                break;
            case 16:
                int number2 = extensionDescriptor.getNumber();
                List<String> list2 = (List) entry.getValue();
                int i12 = L.f60134d;
                if (list2 != null && !list2.isEmpty()) {
                    t2.writeStringList(number2, list2);
                    break;
                }
                break;
            case 17:
                List list3 = (List) entry.getValue();
                if (list3 != null && !list3.isEmpty()) {
                    int number3 = extensionDescriptor.getNumber();
                    List<?> list4 = (List) entry.getValue();
                    J b11 = H.a().b(list3.get(0).getClass());
                    int i13 = L.f60134d;
                    if (list4 != null && !list4.isEmpty()) {
                        t2.writeGroupList(number3, list4, b11);
                        break;
                    }
                }
                break;
            case 18:
                List list5 = (List) entry.getValue();
                if (list5 != null && !list5.isEmpty()) {
                    int number4 = extensionDescriptor.getNumber();
                    List<?> list6 = (List) entry.getValue();
                    J b12 = H.a().b(list5.get(0).getClass());
                    int i14 = L.f60134d;
                    if (list6 != null && !list6.isEmpty()) {
                        t2.writeMessageList(number4, list6, b12);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC5958i
    void setExtensions(Object obj, C5961l<GeneratedMessageLite.ExtensionDescriptor> c5961l) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions = c5961l;
    }
}
