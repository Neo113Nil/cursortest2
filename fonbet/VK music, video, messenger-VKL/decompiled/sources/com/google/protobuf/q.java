package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import com.google.protobuf.b;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import xsna.u8e0;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes13.dex */
public final class q<T> implements v<T> {
    public final MessageLite a;
    public final z<?, ?> b;
    public final boolean c;
    public final g<?> d;

    public q(z<?, ?> zVar, g<?> gVar, MessageLite messageLite) {
        this.b = zVar;
        this.c = gVar.e(messageLite);
        this.d = gVar;
        this.a = messageLite;
    }

    public static <T> q<T> k(z<?, ?> zVar, g<?> gVar, MessageLite messageLite) {
        return new q<>(zVar, gVar, messageLite);
    }

    @Override // com.google.protobuf.v
    public final void a(T t, T t2) {
        Class<?> cls = w.a;
        z<?, ?> zVar = this.b;
        zVar.o(t, zVar.k(zVar.g(t), zVar.g(t2)));
        if (this.c) {
            g<?> gVar = this.d;
            FieldSet<?> c = gVar.c(t2);
            if (c.p()) {
                return;
            }
            gVar.d(t).v(c);
        }
    }

    @Override // com.google.protobuf.v
    public final T b() {
        MessageLite messageLite = this.a;
        return messageLite instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) messageLite).newMutableInstance() : (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.v
    public final boolean c(T t) {
        return this.d.c(t).r();
    }

    @Override // com.google.protobuf.v
    public final void d(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // com.google.protobuf.v
    public final int e(GeneratedMessageLite generatedMessageLite) {
        int hashCode = this.b.g(generatedMessageLite).hashCode();
        if (!this.c) {
            return hashCode;
        }
        return this.d.c(generatedMessageLite).a.hashCode() + (hashCode * 53);
    }

    @Override // com.google.protobuf.v
    public final void f(MessageLite messageLite, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> t = this.d.c(messageLite).t();
        while (t.hasNext()) {
            Map.Entry<?, Object> next = t.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) next.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof LazyField.a) {
                ((e) writer).h(fieldDescriptorLite.getNumber(), ((LazyField.a) next).b.getValue().toByteString());
            } else {
                ((e) writer).h(fieldDescriptorLite.getNumber(), next.getValue());
            }
        }
        z<?, ?> zVar = this.b;
        zVar.q(zVar.g(messageLite), writer);
    }

    @Override // com.google.protobuf.v
    public final int g(AbstractMessageLite abstractMessageLite) {
        z<?, ?> zVar = this.b;
        int i = zVar.i(zVar.g(abstractMessageLite));
        return this.c ? this.d.c(abstractMessageLite).i() + i : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca A[EDGE_INSN: B:37:0x00ca->B:38:0x00ca BREAK  A[LOOP:1: B:20:0x0071->B:28:0x00a2], SYNTHETIC] */
    @Override // com.google.protobuf.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(T t, byte[] bArr, int i, int i2, b.C0151b c0151b) throws IOException {
        q<T> qVar = this;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLite = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = unknownFieldSetLite;
        FieldSet<GeneratedMessageLite.b> ensureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) t).ensureExtensionsAreMutable();
        int i3 = i;
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i3 < i2) {
            GeneratedMessageLite.GeneratedExtension generatedExtension2 = generatedExtension;
            int H = b.H(bArr, i3, c0151b);
            int i4 = c0151b.a;
            ExtensionRegistryLite extensionRegistryLite = c0151b.d;
            int i5 = WireFormat.MESSAGE_SET_ITEM_TAG;
            MessageLite messageLite = qVar.a;
            g<?> gVar = qVar.d;
            int i6 = 2;
            if (i4 == i5) {
                int i7 = 0;
                ByteString byteString = null;
                while (H < i2) {
                    H = b.H(bArr, H, c0151b);
                    int i8 = c0151b.a;
                    int tagFieldNumber = WireFormat.getTagFieldNumber(i8);
                    int tagWireType = WireFormat.getTagWireType(i8);
                    if (tagFieldNumber != i6) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension2 != null) {
                                H = b.o(u8e0.c.a(generatedExtension2.getMessageDefaultInstance().getClass()), bArr, H, i2, c0151b);
                                ensureExtensionsAreMutable.y(generatedExtension2.descriptor, c0151b.c);
                            } else if (tagWireType == 2) {
                                H = b.b(bArr, H, c0151b);
                                byteString = (ByteString) c0151b.c;
                            }
                            i6 = 2;
                        }
                        if (i8 != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        }
                        H = b.N(i8, bArr, H, i2, c0151b);
                        i6 = 2;
                    } else {
                        if (tagWireType == 0) {
                            H = b.H(bArr, H, c0151b);
                            i7 = c0151b.a;
                            generatedExtension2 = gVar.b(extensionRegistryLite, messageLite, i7);
                            i6 = 2;
                        }
                        if (i8 != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                        }
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLite2.storeField(WireFormat.makeTag(i7, 2), byteString);
                }
                qVar = this;
                i3 = H;
            } else if (WireFormat.getTagWireType(i4) == 2) {
                generatedExtension2 = gVar.b(extensionRegistryLite, messageLite, WireFormat.getTagFieldNumber(i4));
                if (generatedExtension2 != null) {
                    i3 = b.o(u8e0.c.a(generatedExtension2.getMessageDefaultInstance().getClass()), bArr, H, i2, c0151b);
                    ensureExtensionsAreMutable.y(generatedExtension2.descriptor, c0151b.c);
                } else {
                    i3 = b.F(i4, bArr, H, i2, unknownFieldSetLite2, c0151b);
                }
            } else {
                i3 = b.N(i4, bArr, H, i2, c0151b);
            }
            generatedExtension = generatedExtension2;
        }
        if (i3 != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.v
    public final void i(Object obj, d dVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        z<?, ?> zVar = this.b;
        UnknownFieldSetLite f = zVar.f(obj);
        g<?> gVar = this.d;
        FieldSet<?> d = gVar.d(obj);
        while (dVar.b() != Integer.MAX_VALUE) {
            try {
                d dVar2 = dVar;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                if (!l(dVar2, extensionRegistryLite2, gVar, d, zVar, f)) {
                    return;
                }
                dVar = dVar2;
                extensionRegistryLite = extensionRegistryLite2;
            } finally {
                zVar.n(obj, f);
            }
        }
    }

    @Override // com.google.protobuf.v
    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        z<?, ?> zVar = this.b;
        if (!zVar.g(generatedMessageLite).equals(zVar.g(generatedMessageLite2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        g<?> gVar = this.d;
        return gVar.c(generatedMessageLite).equals(gVar.c(generatedMessageLite2));
    }

    public final boolean l(d dVar, ExtensionRegistryLite extensionRegistryLite, g gVar, FieldSet fieldSet, z zVar, Object obj) throws IOException {
        int i = dVar.b;
        int i2 = WireFormat.MESSAGE_SET_ITEM_TAG;
        int i3 = 0;
        MessageLite messageLite = this.a;
        if (i != i2) {
            if (WireFormat.getTagWireType(i) != 2) {
                return dVar.Y();
            }
            GeneratedMessageLite.GeneratedExtension b = gVar.b(extensionRegistryLite, messageLite, WireFormat.getTagFieldNumber(i));
            if (b == null) {
                return zVar.l(obj, dVar, 0);
            }
            gVar.h(dVar, b, extensionRegistryLite, fieldSet);
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        ByteString byteString = null;
        while (dVar.b() != Integer.MAX_VALUE) {
            int i4 = dVar.b;
            if (i4 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                i3 = dVar.S();
                generatedExtension = gVar.b(extensionRegistryLite, messageLite, i3);
            } else if (i4 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (generatedExtension != null) {
                    gVar.h(dVar, generatedExtension, extensionRegistryLite, fieldSet);
                } else {
                    byteString = dVar.j();
                }
            } else if (!dVar.Y()) {
                break;
            }
        }
        if (dVar.b != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteString != null) {
            if (generatedExtension != null) {
                gVar.i(byteString, generatedExtension, extensionRegistryLite, fieldSet);
                return true;
            }
            zVar.d(obj, i3, byteString);
        }
        return true;
    }
}
