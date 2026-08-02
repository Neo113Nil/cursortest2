package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.u8e0;

/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes.dex */
public final class h extends g<GeneratedMessageLite.b> {

    /* compiled from: ExtensionSchemaLite.java */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.g
    public final int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.b) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.g
    public final GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
    }

    @Override // com.google.protobuf.g
    public final FieldSet<GeneratedMessageLite.b> c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.g
    public final FieldSet<GeneratedMessageLite.b> d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.g
    public final boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.g
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.u();
    }

    @Override // com.google.protobuf.g
    public final Object g(Object obj, d dVar, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, z zVar) throws IOException {
        Object valueOf;
        Object h;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (a.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    dVar.m(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    dVar.v(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    dVar.B(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    dVar.V(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    dVar.z(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    dVar.t(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    dVar.r(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    dVar.i(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    dVar.T(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    dVar.G(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    dVar.I(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    dVar.K(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    dVar.M(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    dVar.o(arrayList);
                    obj3 = w.j(obj, number, arrayList, generatedExtension.descriptor.getEnumType(), obj3, zVar);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            fieldSet.y(generatedExtension.descriptor, arrayList);
            return obj3;
        }
        if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
            switch (a.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    valueOf = Double.valueOf(dVar.l());
                    break;
                case 2:
                    valueOf = Float.valueOf(dVar.u());
                    break;
                case 3:
                    valueOf = Long.valueOf(dVar.A());
                    break;
                case 4:
                    valueOf = Long.valueOf(dVar.U());
                    break;
                case 5:
                    valueOf = Integer.valueOf(dVar.y());
                    break;
                case 6:
                    valueOf = Long.valueOf(dVar.s());
                    break;
                case 7:
                    valueOf = Integer.valueOf(dVar.q());
                    break;
                case 8:
                    valueOf = Boolean.valueOf(dVar.h());
                    break;
                case 9:
                    valueOf = Integer.valueOf(dVar.S());
                    break;
                case 10:
                    valueOf = Integer.valueOf(dVar.F());
                    break;
                case 11:
                    valueOf = Long.valueOf(dVar.H());
                    break;
                case 12:
                    valueOf = Integer.valueOf(dVar.J());
                    break;
                case 13:
                    valueOf = Long.valueOf(dVar.L());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    valueOf = dVar.j();
                    break;
                case 16:
                    valueOf = dVar.N();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object h2 = fieldSet.h(generatedExtension.descriptor);
                        if (h2 instanceof GeneratedMessageLite) {
                            v b = u8e0.c.b(h2);
                            if (!((GeneratedMessageLite) h2).isMutable()) {
                                Object b2 = b.b();
                                b.a(b2, h2);
                                fieldSet.y(generatedExtension.descriptor, b2);
                                h2 = b2;
                            }
                            dVar.d(h2, b, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    valueOf = dVar.w(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object h3 = fieldSet.h(generatedExtension.descriptor);
                        if (h3 instanceof GeneratedMessageLite) {
                            v b3 = u8e0.c.b(h3);
                            if (!((GeneratedMessageLite) h3).isMutable()) {
                                Object b4 = b3.b();
                                b3.a(b4, h3);
                                fieldSet.y(generatedExtension.descriptor, b4);
                                h3 = b4;
                            }
                            dVar.f(h3, b3, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    valueOf = dVar.D(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                default:
                    valueOf = null;
                    break;
            }
        } else {
            int y = dVar.y();
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(y) == null) {
                return w.m(obj, number, y, obj3, zVar);
            }
            valueOf = Integer.valueOf(y);
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.a(generatedExtension.descriptor, valueOf);
            return obj3;
        }
        int i = a.a[generatedExtension.getLiteType().ordinal()];
        if ((i == 17 || i == 18) && (h = fieldSet.h(generatedExtension.descriptor)) != null) {
            valueOf = Internal.mergeMessage(h, valueOf);
        }
        fieldSet.y(generatedExtension.descriptor, valueOf);
        return obj3;
    }

    @Override // com.google.protobuf.g
    public final void h(t tVar, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.y(generatedExtension.descriptor, ((d) tVar).D(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // com.google.protobuf.g
    public final void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder newBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream newCodedInput = byteString.newCodedInput();
        newBuilderForType.mergeFrom(newCodedInput, extensionRegistryLite);
        fieldSet.y(generatedExtension.descriptor, newBuilderForType.buildPartial());
        newCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.g
    public final void j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.b bVar = (GeneratedMessageLite.b) entry.getKey();
        if (bVar.isRepeated()) {
            switch (a.a[bVar.getLiteType().ordinal()]) {
                case 1:
                    w.p(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 2:
                    w.t(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 3:
                    w.w(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 4:
                    w.E(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 5:
                    w.v(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 6:
                    w.s(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 7:
                    w.r(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 8:
                    w.n(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 9:
                    w.D(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 10:
                    w.y(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 11:
                    w.z(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 12:
                    w.A(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 13:
                    w.B(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 14:
                    w.v(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 15:
                    w.o(bVar.getNumber(), (List) entry.getValue(), writer);
                    break;
                case 16:
                    w.C(bVar.getNumber(), (List) entry.getValue(), writer);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        w.u(bVar.getNumber(), (List) entry.getValue(), writer, u8e0.c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        w.x(bVar.getNumber(), (List) entry.getValue(), writer, u8e0.c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (a.a[bVar.getLiteType().ordinal()]) {
            case 1:
                ((e) writer).a.writeDouble(bVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                ((e) writer).a.writeFloat(bVar.getNumber(), ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                ((e) writer).f(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((e) writer).a.writeUInt64(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((e) writer).e(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((e) writer).c(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((e) writer).b(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((e) writer).a.writeBool(bVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((e) writer).a.writeUInt32(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((e) writer).a.writeSFixed32(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((e) writer).a.writeSFixed64(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                ((e) writer).a.writeSInt32(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((e) writer).a.writeSInt64(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((e) writer).e(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ((e) writer).a(bVar.getNumber(), (ByteString) entry.getValue());
                break;
            case 16:
                ((e) writer).a.writeString(bVar.getNumber(), (String) entry.getValue());
                break;
            case 17:
                ((e) writer).d(bVar.getNumber(), entry.getValue(), u8e0.c.a(entry.getValue().getClass()));
                break;
            case 18:
                ((e) writer).g(bVar.getNumber(), entry.getValue(), u8e0.c.a(entry.getValue().getClass()));
                break;
        }
    }
}
