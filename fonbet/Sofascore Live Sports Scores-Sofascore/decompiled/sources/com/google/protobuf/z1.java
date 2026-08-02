package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import defpackage.a70;
import defpackage.hml;
import defpackage.jff;
import defpackage.pk6;
import defpackage.tg0;
import defpackage.toa;
import defpackage.vsg;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z1 implements vsg {
    public final MessageLite a;
    public final t2 b;
    public final boolean c;
    public final pk6 d;

    public z1(t2 t2Var, pk6 pk6Var, MessageLite messageLite) {
        this.b = t2Var;
        ((u0) pk6Var).getClass();
        this.c = messageLite instanceof GeneratedMessageLite.ExtendableMessage;
        this.d = pk6Var;
        this.a = messageLite;
    }

    @Override // defpackage.vsg
    public final void a(Object obj, Object obj2) {
        i2.l(this.b, obj, obj2);
        if (this.c) {
            ((u0) this.d).getClass();
            d1 d1Var = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
            if (d1Var.a.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable().n(d1Var);
        }
    }

    @Override // defpackage.vsg
    public final void b(Object obj) {
        ((u2) this.b).getClass();
        ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
        ((u0) this.d).getClass();
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m();
    }

    @Override // defpackage.vsg
    public final boolean c(Object obj) {
        ((u0) this.d).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions.j();
    }

    @Override // defpackage.vsg
    public final Object d() {
        MessageLite messageLite = this.a;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).newMutableInstance() : messageLite.newBuilderForType().buildPartial();
    }

    @Override // defpackage.vsg
    public final void e(MessageLite messageLite, hml hmlVar) {
        ((u0) this.d).getClass();
        Iterator l = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.l();
        while (l.hasNext()) {
            Map.Entry entry = (Map.Entry) l.next();
            FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
            if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldSet$FieldDescriptorLite.isRepeated() || fieldSet$FieldDescriptorLite.isPacked()) {
                a70.r("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof toa) {
                ((z) hmlVar).h(fieldSet$FieldDescriptorLite.getNumber(), ((LazyField) ((toa) entry).a.getValue()).toByteString());
            } else {
                ((z) hmlVar).h(fieldSet$FieldDescriptorLite.getNumber(), entry.getValue());
            }
        }
        ((u2) this.b).getClass();
        ((GeneratedMessageLite) messageLite).unknownFields.writeAsMessageSetTo(hmlVar);
    }

    @Override // defpackage.vsg
    public final int f(AbstractMessageLite abstractMessageLite) {
        ((u2) this.b).getClass();
        int serializedSizeAsMessageSet = ((GeneratedMessageLite) abstractMessageLite).unknownFields.getSerializedSizeAsMessageSet();
        if (!this.c) {
            return serializedSizeAsMessageSet;
        }
        ((u0) this.d).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) abstractMessageLite).extensions.g() + serializedSizeAsMessageSet;
    }

    @Override // defpackage.vsg
    public final void g(Object obj, s sVar, ExtensionRegistryLite extensionRegistryLite) {
        t2 t2Var = this.b;
        UnknownFieldSetLite a = t2Var.a(obj);
        pk6 pk6Var = this.d;
        ((u0) pk6Var).getClass();
        d1 ensureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (sVar.a() != Integer.MAX_VALUE) {
            try {
                z1 z1Var = this;
                s sVar2 = sVar;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                if (!z1Var.k(sVar2, extensionRegistryLite2, pk6Var, ensureExtensionsAreMutable, t2Var, a)) {
                    break;
                }
                this = z1Var;
                sVar = sVar2;
                extensionRegistryLite = extensionRegistryLite2;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = a;
            }
        }
    }

    @Override // defpackage.vsg
    public final int h(GeneratedMessageLite generatedMessageLite) {
        ((u2) this.b).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode();
        if (!this.c) {
            return hashCode;
        }
        ((u0) this.d).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.a.hashCode() + (hashCode * 53);
    }

    @Override // defpackage.vsg
    public final boolean i(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        u2 u2Var = (u2) this.b;
        u2Var.getClass();
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        u2Var.getClass();
        if (!unknownFieldSetLite.equals(generatedMessageLite2.unknownFields)) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        u0 u0Var = (u0) this.d;
        u0Var.getClass();
        d1 d1Var = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions;
        u0Var.getClass();
        return d1Var.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7 A[EDGE_INSN: B:37:0x00d7->B:38:0x00d7 BREAK  A[LOOP:1: B:20:0x0078->B:28:0x00a9], SYNTHETIC] */
    @Override // defpackage.vsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Object obj, byte[] bArr, int i, int i2, tg0 tg0Var) {
        z1 z1Var = this;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLite = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = unknownFieldSetLite;
        d1 ensureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        int i3 = i;
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i3 < i2) {
            GeneratedMessageLite.GeneratedExtension generatedExtension2 = generatedExtension;
            int r = f.r(bArr, i3, tg0Var);
            int i4 = tg0Var.a;
            ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) tg0Var.e;
            int i5 = WireFormat.MESSAGE_SET_ITEM_TAG;
            MessageLite messageLite = z1Var.a;
            pk6 pk6Var = z1Var.d;
            int i6 = 2;
            if (i4 == i5) {
                int i7 = 0;
                ByteString byteString = null;
                while (r < i2) {
                    r = f.r(bArr, r, tg0Var);
                    int i8 = tg0Var.a;
                    int tagFieldNumber = WireFormat.getTagFieldNumber(i8);
                    int tagWireType = WireFormat.getTagWireType(i8);
                    if (tagFieldNumber != i6) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension2 != null) {
                                r = f.e(jff.c.a(generatedExtension2.getMessageDefaultInstance().getClass()), bArr, r, i2, tg0Var);
                                ensureExtensionsAreMutable.p(generatedExtension2.descriptor, tg0Var.c);
                            } else if (tagWireType == 2) {
                                r = f.a(bArr, r, tg0Var);
                                byteString = (ByteString) tg0Var.c;
                            }
                            i6 = 2;
                        }
                        if (i8 != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        }
                        r = f.w(i8, bArr, r, i2, tg0Var);
                        i6 = 2;
                    } else {
                        if (tagWireType == 0) {
                            r = f.r(bArr, r, tg0Var);
                            i7 = tg0Var.a;
                            ((u0) pk6Var).getClass();
                            generatedExtension2 = extensionRegistryLite.findLiteExtensionByNumber(messageLite, i7);
                            i6 = 2;
                        }
                        if (i8 != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                        }
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLite2.storeField(WireFormat.makeTag(i7, 2), byteString);
                }
                z1Var = this;
                i3 = r;
            } else if (WireFormat.getTagWireType(i4) == 2) {
                int tagFieldNumber2 = WireFormat.getTagFieldNumber(i4);
                ((u0) pk6Var).getClass();
                generatedExtension2 = extensionRegistryLite.findLiteExtensionByNumber(messageLite, tagFieldNumber2);
                if (generatedExtension2 != null) {
                    i3 = f.e(jff.c.a(generatedExtension2.getMessageDefaultInstance().getClass()), bArr, r, i2, tg0Var);
                    ensureExtensionsAreMutable.p(generatedExtension2.descriptor, tg0Var.c);
                } else {
                    i3 = f.p(i4, bArr, r, i2, unknownFieldSetLite2, tg0Var);
                }
            } else {
                i3 = f.w(i4, bArr, r, i2, tg0Var);
            }
            generatedExtension = generatedExtension2;
        }
        if (i3 != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final boolean k(s sVar, ExtensionRegistryLite extensionRegistryLite, pk6 pk6Var, d1 d1Var, t2 t2Var, UnknownFieldSetLite unknownFieldSetLite) {
        int i = sVar.b;
        int i2 = WireFormat.MESSAGE_SET_ITEM_TAG;
        MessageLite messageLite = this.a;
        if (i != i2) {
            if (WireFormat.getTagWireType(i) != 2) {
                return sVar.y();
            }
            int tagFieldNumber = WireFormat.getTagFieldNumber(i);
            ((u0) pk6Var).getClass();
            GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messageLite, tagFieldNumber);
            if (findLiteExtensionByNumber == null) {
                return t2Var.b(0, sVar, unknownFieldSetLite);
            }
            d1Var.p(findLiteExtensionByNumber.descriptor, sVar.o(findLiteExtensionByNumber.getMessageDefaultInstance().getClass(), extensionRegistryLite));
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        ByteString byteString = null;
        int i3 = 0;
        while (sVar.a() != Integer.MAX_VALUE) {
            int i4 = sVar.b;
            if (i4 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                sVar.x(0);
                i3 = sVar.a.readUInt32();
                ((u0) pk6Var).getClass();
                generatedExtension = extensionRegistryLite.findLiteExtensionByNumber(messageLite, i3);
            } else if (i4 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (generatedExtension != null) {
                    ((u0) pk6Var).getClass();
                    d1Var.p(generatedExtension.descriptor, sVar.o(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
                } else {
                    byteString = sVar.e();
                }
            } else if (!sVar.y()) {
                break;
            }
        }
        if (sVar.b != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteString != null) {
            if (generatedExtension != null) {
                ((u0) pk6Var).getClass();
                MessageLite.Builder newBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                CodedInputStream newCodedInput = byteString.newCodedInput();
                newBuilderForType.mergeFrom(newCodedInput, extensionRegistryLite);
                d1Var.p(generatedExtension.descriptor, newBuilderForType.buildPartial());
                newCodedInput.checkLastTagWas(0);
                return true;
            }
            ((u2) t2Var).getClass();
            unknownFieldSetLite.storeField(WireFormat.makeTag(i3, 2), byteString);
        }
        return true;
    }
}
