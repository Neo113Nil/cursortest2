package com.google.protobuf;

import com.google.protobuf.WireFormat;
import defpackage.a70;
import defpackage.jff;
import defpackage.vsg;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class s {
    public final CodedInputStream a;
    public int b;
    public int c;
    public int d = 0;

    public s(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.a = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static void A(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static void z(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = this.a.readTag();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.getTagFieldNumber(i);
    }

    public final void b(Object obj, vsg vsgVar, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.c;
        this.c = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.b), 4);
        try {
            vsgVar.g(obj, this, extensionRegistryLite);
            if (this.b == this.c) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.c = i;
        }
    }

    public final void c(Object obj, vsg vsgVar, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream codedInputStream = this.a;
        int readUInt32 = codedInputStream.readUInt32();
        if (codedInputStream.recursionDepth >= codedInputStream.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int pushLimit = codedInputStream.pushLimit(readUInt32);
        codedInputStream.recursionDepth++;
        vsgVar.g(obj, this, extensionRegistryLite);
        codedInputStream.checkLastTagWas(0);
        codedInputStream.recursionDepth--;
        codedInputStream.popLimit(pushLimit);
    }

    public final void d(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof h;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.readBool()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        readTag = codedInputStream.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Boolean.valueOf(codedInputStream.readBool()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        h hVar = (h) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                hVar.addBoolean(codedInputStream.readBool());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            hVar.addBoolean(codedInputStream.readBool());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final ByteString e() {
        x(2);
        return this.a.readBytes();
    }

    public final void f(List list) {
        int readTag;
        if (WireFormat.getTagWireType(this.b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(e());
            CodedInputStream codedInputStream = this.a;
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.b);
        this.d = readTag;
    }

    public final void g(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof n0;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.readDouble()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        readTag = codedInputStream.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = codedInputStream.readUInt32();
            A(readUInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
            do {
                list.add(Double.valueOf(codedInputStream.readDouble()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        n0 n0Var = (n0) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 1) {
            do {
                n0Var.addDouble(codedInputStream.readDouble());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = codedInputStream.readUInt32();
        A(readUInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
        do {
            n0Var.addDouble(codedInputStream.readDouble());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void h(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof k1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readEnum()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        readTag = codedInputStream.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readEnum()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        k1 k1Var = (k1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                k1Var.addInt(codedInputStream.readEnum());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            k1Var.addInt(codedInputStream.readEnum());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final Object i(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        int i = r.a[fieldType.ordinal()];
        CodedInputStream codedInputStream = this.a;
        switch (i) {
            case 1:
                x(0);
                return Boolean.valueOf(codedInputStream.readBool());
            case 2:
                return e();
            case 3:
                x(1);
                return Double.valueOf(codedInputStream.readDouble());
            case 4:
                x(0);
                return Integer.valueOf(codedInputStream.readEnum());
            case 5:
                x(5);
                return Integer.valueOf(codedInputStream.readFixed32());
            case 6:
                x(1);
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                x(5);
                return Float.valueOf(codedInputStream.readFloat());
            case 8:
                x(0);
                return Integer.valueOf(codedInputStream.readInt32());
            case 9:
                x(0);
                return Long.valueOf(codedInputStream.readInt64());
            case 10:
                return o(cls, extensionRegistryLite);
            case 11:
                x(5);
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 12:
                x(1);
                return Long.valueOf(codedInputStream.readSFixed64());
            case 13:
                x(0);
                return Integer.valueOf(codedInputStream.readSInt32());
            case 14:
                x(0);
                return Long.valueOf(codedInputStream.readSInt64());
            case 15:
                x(2);
                return codedInputStream.readStringRequireUtf8();
            case 16:
                x(0);
                return Integer.valueOf(codedInputStream.readUInt32());
            case 17:
                x(0);
                return Long.valueOf(codedInputStream.readUInt64());
            default:
                a70.p("unsupported field type.");
                return null;
        }
    }

    public final void j(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof k1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 2) {
                int readUInt32 = codedInputStream.readUInt32();
                z(readUInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
                do {
                    list.add(Integer.valueOf(codedInputStream.readFixed32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readFixed32()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag = codedInputStream.readTag();
                }
            } while (readTag == this.b);
            this.d = readTag;
            return;
        }
        k1 k1Var = (k1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 2) {
            int readUInt322 = codedInputStream.readUInt32();
            z(readUInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
            do {
                k1Var.addInt(codedInputStream.readFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            k1Var.addInt(codedInputStream.readFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag2 = codedInputStream.readTag();
            }
        } while (readTag2 == this.b);
        this.d = readTag2;
    }

    public final void k(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof t1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        readTag = codedInputStream.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = codedInputStream.readUInt32();
            A(readUInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        t1 t1Var = (t1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 1) {
            do {
                t1Var.addLong(codedInputStream.readFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = codedInputStream.readUInt32();
        A(readUInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
        do {
            t1Var.addLong(codedInputStream.readFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void l(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof e1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 2) {
                int readUInt32 = codedInputStream.readUInt32();
                z(readUInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
                do {
                    list.add(Float.valueOf(codedInputStream.readFloat()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(codedInputStream.readFloat()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag = codedInputStream.readTag();
                }
            } while (readTag == this.b);
            this.d = readTag;
            return;
        }
        e1 e1Var = (e1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 2) {
            int readUInt322 = codedInputStream.readUInt32();
            z(readUInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
            do {
                e1Var.addFloat(codedInputStream.readFloat());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            e1Var.addFloat(codedInputStream.readFloat());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag2 = codedInputStream.readTag();
            }
        } while (readTag2 == this.b);
        this.d = readTag2;
    }

    public final void m(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof k1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        readTag = codedInputStream.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        k1 k1Var = (k1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                k1Var.addInt(codedInputStream.readInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            k1Var.addInt(codedInputStream.readInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void n(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof t1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        readTag = codedInputStream.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        t1 t1Var = (t1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                t1Var.addLong(codedInputStream.readInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            t1Var.addLong(codedInputStream.readInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final Object o(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        x(2);
        vsg a = jff.c.a(cls);
        Object d = a.d();
        c(d, a, extensionRegistryLite);
        a.b(d);
        return d;
    }

    public final void p(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof k1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 2) {
                int readUInt32 = codedInputStream.readUInt32();
                z(readUInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
                do {
                    list.add(Integer.valueOf(codedInputStream.readSFixed32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readSFixed32()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag = codedInputStream.readTag();
                }
            } while (readTag == this.b);
            this.d = readTag;
            return;
        }
        k1 k1Var = (k1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 2) {
            int readUInt322 = codedInputStream.readUInt32();
            z(readUInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
            do {
                k1Var.addInt(codedInputStream.readSFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            k1Var.addInt(codedInputStream.readSFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag2 = codedInputStream.readTag();
            }
        } while (readTag2 == this.b);
        this.d = readTag2;
    }

    public final void q(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof t1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        readTag = codedInputStream.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readUInt32 = codedInputStream.readUInt32();
            A(readUInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readSFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        t1 t1Var = (t1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 1) {
            do {
                t1Var.addLong(codedInputStream.readSFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readUInt322 = codedInputStream.readUInt32();
        A(readUInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
        do {
            t1Var.addLong(codedInputStream.readSFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void r(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof k1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readSInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        readTag = codedInputStream.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readSInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        k1 k1Var = (k1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                k1Var.addInt(codedInputStream.readSInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            k1Var.addInt(codedInputStream.readSInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void s(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof t1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        readTag = codedInputStream.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readSInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        t1 t1Var = (t1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                t1Var.addLong(codedInputStream.readSInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            t1Var.addLong(codedInputStream.readSInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void t(List list, boolean z) {
        String readString;
        int readTag;
        int readTag2;
        if (WireFormat.getTagWireType(this.b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z2 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.a;
        if (z2 && !z) {
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.add(e());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        do {
            if (z) {
                x(2);
                readString = codedInputStream.readStringRequireUtf8();
            } else {
                x(2);
                readString = codedInputStream.readString();
            }
            list.add(readString);
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.b);
        this.d = readTag;
    }

    public final void u(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof k1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readUInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        readTag = codedInputStream.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readUInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        k1 k1Var = (k1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                k1Var.addInt(codedInputStream.readUInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            k1Var.addInt(codedInputStream.readUInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void v(List list) {
        int readTag;
        int readTag2;
        boolean z = list instanceof t1;
        int i = this.b;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readUInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        readTag = codedInputStream.readTag();
                    }
                } while (readTag == this.b);
                this.d = readTag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readUInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        t1 t1Var = (t1) list;
        int tagWireType2 = WireFormat.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                t1Var.addLong(codedInputStream.readUInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag2 = codedInputStream.readTag();
                }
            } while (readTag2 == this.b);
            this.d = readTag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            t1Var.addLong(codedInputStream.readUInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void w(int i) {
        if (this.a.getTotalBytesRead() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void x(int i) {
        if (WireFormat.getTagWireType(this.b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final boolean y() {
        int i;
        CodedInputStream codedInputStream = this.a;
        if (codedInputStream.isAtEnd() || (i = this.b) == this.c) {
            return false;
        }
        return codedInputStream.skipField(i);
    }
}
