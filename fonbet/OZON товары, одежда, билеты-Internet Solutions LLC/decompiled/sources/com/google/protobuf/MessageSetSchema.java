package com.google.protobuf;

import com.google.protobuf.C5951b;
import com.google.protobuf.C5961l;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.LazyField;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class MessageSetSchema<T> implements J<T> {
    private final MessageLite defaultInstance;
    private final AbstractC5958i<?> extensionSchema;
    private final boolean hasExtensions;
    private final N<?, ?> unknownFieldSchema;

    private MessageSetSchema(N<?, ?> n11, AbstractC5958i<?> abstractC5958i, MessageLite messageLite) {
        this.unknownFieldSchema = n11;
        this.hasExtensions = abstractC5958i.hasExtensions(messageLite);
        this.extensionSchema = abstractC5958i;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(N<UT, UB> n11, T t2) {
        return n11.getSerializedSizeAsMessageSet(n11.getFromMessage(t2));
    }

    private <UT, UB, ET extends C5961l.b<ET>> void mergeFromHelper(N<UT, UB> n11, AbstractC5958i<ET> abstractC5958i, T t2, I i11, C5957h c5957h) throws IOException {
        N<UT, UB> n12;
        UB builderFromMessage = n11.getBuilderFromMessage(t2);
        C5961l<ET> mutableExtensions = abstractC5958i.getMutableExtensions(t2);
        while (i11.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                n12 = n11;
                AbstractC5958i<ET> abstractC5958i2 = abstractC5958i;
                I i12 = i11;
                C5957h c5957h2 = c5957h;
                try {
                    if (!parseMessageSetItemOrUnknownField(i12, c5957h2, abstractC5958i2, mutableExtensions, n12, builderFromMessage)) {
                        n12.setBuilderToMessage(t2, builderFromMessage);
                        return;
                    }
                    i11 = i12;
                    c5957h = c5957h2;
                    abstractC5958i = abstractC5958i2;
                    n11 = n12;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    n12.setBuilderToMessage(t2, builderFromMessage);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                n12 = n11;
            }
        }
        n11.setBuilderToMessage(t2, builderFromMessage);
    }

    static <T> MessageSetSchema<T> newSchema(N<?, ?> n11, AbstractC5958i<?> abstractC5958i, MessageLite messageLite) {
        return new MessageSetSchema<>(n11, abstractC5958i, messageLite);
    }

    private <UT, UB, ET extends C5961l.b<ET>> boolean parseMessageSetItemOrUnknownField(I i11, C5957h c5957h, AbstractC5958i<ET> abstractC5958i, C5961l<ET> c5961l, N<UT, UB> n11, UB ub2) throws IOException {
        int tag = i11.getTag();
        int i12 = 0;
        if (tag != 11) {
            if ((tag & 7) != 2) {
                return i11.skipField();
            }
            Object findExtensionByNumber = abstractC5958i.findExtensionByNumber(c5957h, this.defaultInstance, tag >>> 3);
            if (findExtensionByNumber == null) {
                return n11.mergeOneFieldFrom(ub2, i11, 0);
            }
            abstractC5958i.parseLengthPrefixedMessageSetItem(i11, findExtensionByNumber, c5957h, c5961l);
            return true;
        }
        Object obj = null;
        ByteString byteString = null;
        while (i11.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = i11.getTag();
            if (tag2 != 16) {
                if (tag2 != 26) {
                    if (tag2 == 12 || !i11.skipField()) {
                        break;
                    }
                } else if (obj != null) {
                    abstractC5958i.parseLengthPrefixedMessageSetItem(i11, obj, c5957h, c5961l);
                } else {
                    byteString = i11.readBytes();
                }
            } else {
                i12 = i11.readUInt32();
                obj = abstractC5958i.findExtensionByNumber(c5957h, this.defaultInstance, i12);
            }
        }
        if (i11.getTag() != 12) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteString != null) {
            if (obj != null) {
                abstractC5958i.parseMessageSetItem(byteString, obj, c5957h, c5961l);
            } else {
                n11.addLengthDelimited(ub2, i12, byteString);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(N<UT, UB> n11, T t2, T t11) throws IOException {
        n11.writeAsMessageSetTo(n11.getFromMessage(t2), t11);
    }

    @Override // com.google.protobuf.J
    public boolean equals(T t2, T t11) {
        if (!this.unknownFieldSchema.getFromMessage(t2).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t2).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.J
    public int getSerializedSize(T t2) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t2);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t2).j() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.J
    public int hashCode(T t2) {
        int hashCode = this.unknownFieldSchema.getFromMessage(t2).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(t2).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.J
    public final boolean isInitialized(T t2) {
        return this.extensionSchema.getExtensions(t2).s();
    }

    @Override // com.google.protobuf.J
    public void makeImmutable(T t2) {
        this.unknownFieldSchema.makeImmutable(t2);
        this.extensionSchema.makeImmutable(t2);
    }

    @Override // com.google.protobuf.J
    public void mergeFrom(T t2, T t11) {
        N<?, ?> n11 = this.unknownFieldSchema;
        int i11 = L.f60134d;
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
        MessageLite messageLite = this.defaultInstance;
        return messageLite instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) messageLite).newMutableInstance() : (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.J
    public void writeTo(T t2, T t11) throws IOException {
        Iterator<Map.Entry<?, Object>> u11 = this.extensionSchema.getExtensions(t2).u();
        while (u11.hasNext()) {
            Map.Entry<?, Object> next = u11.next();
            C5961l.b bVar = (C5961l.b) next.getKey();
            if (bVar.getLiteJavaType() != Q.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof LazyField.a) {
                t11.writeMessageSetItem(bVar.getNumber(), ((LazyField.a) next).a().toByteString());
            } else {
                t11.writeMessageSetItem(bVar.getNumber(), next.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t2, t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb A[EDGE_INSN: B:34:0x00cb->B:35:0x00cb BREAK  A[LOOP:1: B:20:0x0071->B:28:0x0071], SYNTHETIC] */
    @Override // com.google.protobuf.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mergeFrom(T t2, byte[] bArr, int i11, int i12, C5951b.C0915b c0915b) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t2;
        O o11 = generatedMessageLite.unknownFields;
        if (o11 == O.c()) {
            o11 = O.j();
            generatedMessageLite.unknownFields = o11;
        }
        O o12 = o11;
        C5961l<GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) t2).ensureExtensionsAreMutable();
        int i13 = i11;
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i13 < i12) {
            GeneratedMessageLite.GeneratedExtension generatedExtension2 = generatedExtension;
            int G11 = C5951b.G(bArr, i13, c0915b);
            int i14 = c0915b.f60195a;
            C5957h c5957h = c0915b.f60198d;
            if (i14 == 11) {
                int i15 = 0;
                ByteString byteString = null;
                while (G11 < i12) {
                    G11 = C5951b.G(bArr, G11, c0915b);
                    int i16 = c0915b.f60195a;
                    int i17 = i16 >>> 3;
                    int i18 = i16 & 7;
                    if (i17 != 2) {
                        if (i17 == 3) {
                            if (generatedExtension2 != null) {
                                G11 = C5951b.n(H.a().b(generatedExtension2.getMessageDefaultInstance().getClass()), bArr, G11, i12, c0915b);
                                ensureExtensionsAreMutable.z(generatedExtension2.descriptor, c0915b.f60197c);
                            } else if (i18 == 2) {
                                G11 = C5951b.b(bArr, G11, c0915b);
                                byteString = (ByteString) c0915b.f60197c;
                            }
                        }
                        if (i16 != 12) {
                            break;
                        } else {
                            G11 = C5951b.M(i16, bArr, G11, i12, c0915b);
                        }
                    } else if (i18 == 0) {
                        G11 = C5951b.G(bArr, G11, c0915b);
                        i15 = c0915b.f60195a;
                        generatedExtension2 = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(c5957h, this.defaultInstance, i15);
                    } else if (i16 != 12) {
                    }
                }
                if (byteString != null) {
                    o12.l((i15 << 3) | 2, byteString);
                }
                i13 = G11;
            } else if ((i14 & 7) == 2) {
                generatedExtension2 = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(c5957h, this.defaultInstance, i14 >>> 3);
                if (generatedExtension2 != null) {
                    i13 = C5951b.n(H.a().b(generatedExtension2.getMessageDefaultInstance().getClass()), bArr, G11, i12, c0915b);
                    ensureExtensionsAreMutable.z(generatedExtension2.descriptor, c0915b.f60197c);
                } else {
                    i13 = C5951b.E(i14, bArr, G11, i12, o12, c0915b);
                }
            } else {
                i13 = C5951b.M(i14, bArr, G11, i12, c0915b);
            }
            generatedExtension = generatedExtension2;
        }
        if (i13 != i12) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.J
    public void mergeFrom(T t2, I i11, C5957h c5957h) throws IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t2, i11, c5957h);
    }
}
