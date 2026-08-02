package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import xsna.u8e0;

/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes13.dex */
public final class d implements t {
    public final CodedInputStream a;
    public int b;
    public int c;
    public int d = 0;

    /* compiled from: CodedInputStreamReader.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public d(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.a = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static void Z(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static d a(CodedInputStream codedInputStream) {
        d dVar = codedInputStream.wrapper;
        return dVar != null ? dVar : new d(codedInputStream);
    }

    public static void a0(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final long A() throws IOException {
        X(0);
        return this.a.readInt64();
    }

    public final void B(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof l;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
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
            W(totalBytesRead);
            return;
        }
        l lVar = (l) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                lVar.addLong(codedInputStream.readInt64());
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
            lVar.addLong(codedInputStream.readInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        W(totalBytesRead2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        r1.popLimit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void C(Map<K, V> map, MapEntryLite.b<K, V> bVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        X(2);
        CodedInputStream codedInputStream = this.a;
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readUInt32());
        Object obj = bVar.b;
        V v = bVar.d;
        Object obj2 = v;
        while (true) {
            try {
                int b = b();
                if (b == Integer.MAX_VALUE || codedInputStream.isAtEnd()) {
                    break;
                }
                if (b == 1) {
                    obj = p(bVar.a, null, null);
                } else if (b != 2) {
                    try {
                        if (!Y()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!Y()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = p(bVar.c, v.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th) {
                codedInputStream.popLimit(pushLimit);
                throw th;
            }
        }
    }

    public final <T> T D(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        X(2);
        v<T> a2 = u8e0.c.a(cls);
        T b = a2.b();
        g(b, a2, extensionRegistryLite);
        a2.d(b);
        return b;
    }

    public final <T> void E(List<T> list, v<T> vVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readTag;
        if (WireFormat.getTagWireType(this.b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.b;
        do {
            T b = vVar.b();
            g(b, vVar, extensionRegistryLite);
            vVar.d(b);
            list.add(b);
            CodedInputStream codedInputStream = this.a;
            if (codedInputStream.isAtEnd() || this.d != 0) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == i);
        this.d = readTag;
    }

    public final int F() throws IOException {
        X(5);
        return this.a.readSFixed32();
    }

    public final void G(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof j;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 2) {
                int readUInt32 = codedInputStream.readUInt32();
                Z(readUInt32);
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
        j jVar = (j) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 2) {
            int readUInt322 = codedInputStream.readUInt32();
            Z(readUInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
            do {
                jVar.addInt(codedInputStream.readSFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            jVar.addInt(codedInputStream.readSFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag2 = codedInputStream.readTag();
            }
        } while (readTag2 == this.b);
        this.d = readTag2;
    }

    public final long H() throws IOException {
        X(1);
        return this.a.readSFixed64();
    }

    public final void I(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof l;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
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
            a0(readUInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readSFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        l lVar = (l) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 1) {
            do {
                lVar.addLong(codedInputStream.readSFixed64());
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
        a0(readUInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
        do {
            lVar.addLong(codedInputStream.readSFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final int J() throws IOException {
        X(0);
        return this.a.readSInt32();
    }

    public final void K(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof j;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
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
            W(totalBytesRead);
            return;
        }
        j jVar = (j) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                jVar.addInt(codedInputStream.readSInt32());
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
            jVar.addInt(codedInputStream.readSInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        W(totalBytesRead2);
    }

    public final long L() throws IOException {
        X(0);
        return this.a.readSInt64();
    }

    public final void M(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof l;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
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
            W(totalBytesRead);
            return;
        }
        l lVar = (l) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                lVar.addLong(codedInputStream.readSInt64());
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
            lVar.addLong(codedInputStream.readSInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        W(totalBytesRead2);
    }

    public final String N() throws IOException {
        X(2);
        return this.a.readString();
    }

    public final void O(List<String> list) throws IOException {
        P(list, false);
    }

    public final void P(List<String> list, boolean z) throws IOException {
        int readTag;
        int readTag2;
        if (WireFormat.getTagWireType(this.b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z2 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.a;
        if (!z2 || z) {
            do {
                list.add(z ? R() : N());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag = codedInputStream.readTag();
                }
            } while (readTag == this.b);
            this.d = readTag;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.add(j());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag2 = codedInputStream.readTag();
            }
        } while (readTag2 == this.b);
        this.d = readTag2;
    }

    public final void Q(List<String> list) throws IOException {
        P(list, true);
    }

    public final String R() throws IOException {
        X(2);
        return this.a.readStringRequireUtf8();
    }

    public final int S() throws IOException {
        X(0);
        return this.a.readUInt32();
    }

    public final void T(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof j;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
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
            W(totalBytesRead);
            return;
        }
        j jVar = (j) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                jVar.addInt(codedInputStream.readUInt32());
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
            jVar.addInt(codedInputStream.readUInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        W(totalBytesRead2);
    }

    public final long U() throws IOException {
        X(0);
        return this.a.readUInt64();
    }

    public final void V(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof l;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
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
            W(totalBytesRead);
            return;
        }
        l lVar = (l) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                lVar.addLong(codedInputStream.readUInt64());
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
            lVar.addLong(codedInputStream.readUInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        W(totalBytesRead2);
    }

    public final void W(int i) throws IOException {
        if (this.a.getTotalBytesRead() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void X(int i) throws IOException {
        if (WireFormat.getTagWireType(this.b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final boolean Y() throws IOException {
        int i;
        CodedInputStream codedInputStream = this.a;
        if (codedInputStream.isAtEnd() || (i = this.b) == this.c) {
            return false;
        }
        return codedInputStream.skipField(i);
    }

    public final int b() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.readTag();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.getTagFieldNumber(i2);
    }

    public final int c() {
        return this.b;
    }

    public final <T> void d(T t, v<T> vVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        X(3);
        e(t, vVar, extensionRegistryLite);
    }

    public final <T> void e(T t, v<T> vVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i = this.c;
        this.c = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.b), 4);
        try {
            vVar.i(t, this, extensionRegistryLite);
            if (this.b == this.c) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.c = i;
        }
    }

    public final <T> void f(T t, v<T> vVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        X(2);
        g(t, vVar, extensionRegistryLite);
    }

    public final <T> void g(T t, v<T> vVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        CodedInputStream codedInputStream = this.a;
        int readUInt32 = codedInputStream.readUInt32();
        if (codedInputStream.recursionDepth >= codedInputStream.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int pushLimit = codedInputStream.pushLimit(readUInt32);
        codedInputStream.recursionDepth++;
        vVar.i(t, this, extensionRegistryLite);
        codedInputStream.checkLastTagWas(0);
        codedInputStream.recursionDepth--;
        codedInputStream.popLimit(pushLimit);
    }

    public final boolean h() throws IOException {
        X(0);
        return this.a.readBool();
    }

    public final void i(List<Boolean> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof c;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
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
            W(totalBytesRead);
            return;
        }
        c cVar = (c) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                cVar.addBoolean(codedInputStream.readBool());
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
            cVar.addBoolean(codedInputStream.readBool());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        W(totalBytesRead2);
    }

    public final ByteString j() throws IOException {
        X(2);
        return this.a.readBytes();
    }

    public final void k(List<ByteString> list) throws IOException {
        int readTag;
        if (WireFormat.getTagWireType(this.b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(j());
            CodedInputStream codedInputStream = this.a;
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.b);
        this.d = readTag;
    }

    public final double l() throws IOException {
        X(1);
        return this.a.readDouble();
    }

    public final void m(List<Double> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof f;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
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
            a0(readUInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
            do {
                list.add(Double.valueOf(codedInputStream.readDouble()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        f fVar = (f) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 1) {
            do {
                fVar.addDouble(codedInputStream.readDouble());
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
        a0(readUInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
        do {
            fVar.addDouble(codedInputStream.readDouble());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final int n() throws IOException {
        X(0);
        return this.a.readEnum();
    }

    public final void o(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof j;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
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
            W(totalBytesRead);
            return;
        }
        j jVar = (j) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                jVar.addInt(codedInputStream.readEnum());
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
            jVar.addInt(codedInputStream.readEnum());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        W(totalBytesRead2);
    }

    public final Object p(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        switch (a.a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(h());
            case 2:
                return j();
            case 3:
                return Double.valueOf(l());
            case 4:
                return Integer.valueOf(n());
            case 5:
                return Integer.valueOf(q());
            case 6:
                return Long.valueOf(s());
            case 7:
                return Float.valueOf(u());
            case 8:
                return Integer.valueOf(y());
            case 9:
                return Long.valueOf(A());
            case 10:
                return D(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(F());
            case 12:
                return Long.valueOf(H());
            case 13:
                return Integer.valueOf(J());
            case 14:
                return Long.valueOf(L());
            case 15:
                return R();
            case 16:
                return Integer.valueOf(S());
            case 17:
                return Long.valueOf(U());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final int q() throws IOException {
        X(5);
        return this.a.readFixed32();
    }

    public final void r(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof j;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 2) {
                int readUInt32 = codedInputStream.readUInt32();
                Z(readUInt32);
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
        j jVar = (j) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 2) {
            int readUInt322 = codedInputStream.readUInt32();
            Z(readUInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
            do {
                jVar.addInt(codedInputStream.readFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            jVar.addInt(codedInputStream.readFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag2 = codedInputStream.readTag();
            }
        } while (readTag2 == this.b);
        this.d = readTag2;
    }

    public final long s() throws IOException {
        X(1);
        return this.a.readFixed64();
    }

    public final void t(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof l;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
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
            a0(readUInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        l lVar = (l) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 1) {
            do {
                lVar.addLong(codedInputStream.readFixed64());
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
        a0(readUInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
        do {
            lVar.addLong(codedInputStream.readFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final float u() throws IOException {
        X(5);
        return this.a.readFloat();
    }

    public final void v(List<Float> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof i;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
            if (tagWireType == 2) {
                int readUInt32 = codedInputStream.readUInt32();
                Z(readUInt32);
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
        i iVar = (i) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 2) {
            int readUInt322 = codedInputStream.readUInt32();
            Z(readUInt322);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
            do {
                iVar.addFloat(codedInputStream.readFloat());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            iVar.addFloat(codedInputStream.readFloat());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag2 = codedInputStream.readTag();
            }
        } while (readTag2 == this.b);
        this.d = readTag2;
    }

    @Deprecated
    public final <T> T w(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        X(3);
        v<T> a2 = u8e0.c.a(cls);
        T b = a2.b();
        e(b, a2, extensionRegistryLite);
        a2.d(b);
        return b;
    }

    @Deprecated
    public final <T> void x(List<T> list, v<T> vVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readTag;
        if (WireFormat.getTagWireType(this.b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.b;
        do {
            T b = vVar.b();
            e(b, vVar, extensionRegistryLite);
            vVar.d(b);
            list.add(b);
            CodedInputStream codedInputStream = this.a;
            if (codedInputStream.isAtEnd() || this.d != 0) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == i);
        this.d = readTag;
    }

    public final int y() throws IOException {
        X(0);
        return this.a.readInt32();
    }

    public final void z(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        boolean z = list instanceof j;
        CodedInputStream codedInputStream = this.a;
        if (!z) {
            int tagWireType = WireFormat.getTagWireType(this.b);
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
            W(totalBytesRead);
            return;
        }
        j jVar = (j) list;
        int tagWireType2 = WireFormat.getTagWireType(this.b);
        if (tagWireType2 == 0) {
            do {
                jVar.addInt(codedInputStream.readInt32());
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
            jVar.addInt(codedInputStream.readInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        W(totalBytesRead2);
    }
}
