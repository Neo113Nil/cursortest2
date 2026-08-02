package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import defpackage.cik;
import defpackage.e03;
import defpackage.fik;
import defpackage.vsg;
import defpackage.yhk;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u extends e03 {
    public final ByteOutput e;

    public u(ByteOutput byteOutput, int i) {
        super(i);
        if (byteOutput != null) {
            this.e = byteOutput;
        } else {
            yhk.s("out");
            throw null;
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        if (this.c > 0) {
            g();
        }
    }

    public final void g() {
        this.e.write(this.a, 0, this.c);
        this.c = 0;
    }

    public final void h(int i) {
        if (this.b - this.c < i) {
            g();
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) {
        flush();
        int remaining = byteBuffer.remaining();
        this.e.write(byteBuffer);
        this.d += remaining;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i, boolean z) {
        h(11);
        d(i, 0);
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i, byte[] bArr, int i2, int i3) {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr, i2, i3);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
        writeUInt32NoTag(i2);
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteBuffer(int i, ByteBuffer byteBuffer) {
        writeTag(i, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytes(int i, ByteString byteString) {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytesNoTag(ByteString byteString) {
        writeUInt32NoTag(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32(int i, int i2) {
        h(14);
        d(i, 5);
        b(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i) {
        h(4);
        b(i);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i, long j) {
        h(18);
        d(i, 1);
        c(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j) {
        h(8);
        c(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i, int i2) {
        h(20);
        d(i, 0);
        if (i2 >= 0) {
            e(i2);
        } else {
            f(i2);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i) {
        if (i >= 0) {
            writeUInt32NoTag(i);
        } else {
            writeUInt64NoTag(i);
        }
    }

    @Override // defpackage.e03, com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(ByteBuffer byteBuffer) {
        flush();
        int remaining = byteBuffer.remaining();
        this.e.writeLazy(byteBuffer);
        this.d += remaining;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i, MessageLite messageLite) {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, vsg vsgVar) {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(vsgVar));
        vsgVar.e(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageSetExtension(int i, MessageLite messageLite) {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawBytes(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        write(duplicate);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawMessageSetExtension(int i, ByteString byteString) {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeString(int i, String str) {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeStringNoTag(String str) {
        int length = str.length() * 3;
        int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
        int i = computeUInt32SizeNoTag + length;
        int i2 = this.b;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int b = fik.b(str, bArr, 0, length);
            writeUInt32NoTag(b);
            writeLazy(bArr, 0, b);
            return;
        }
        if (i > i2 - this.c) {
            g();
        }
        int i3 = this.c;
        try {
            int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            byte[] bArr2 = this.a;
            if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                int d = fik.d(str);
                e(d);
                this.c = fik.b(str, bArr2, this.c, d);
                this.d += d;
                return;
            }
            int i4 = i3 + computeUInt32SizeNoTag2;
            this.c = i4;
            int b2 = fik.b(str, bArr2, i4, i2 - i4);
            this.c = i3;
            int i5 = (b2 - i3) - computeUInt32SizeNoTag2;
            e(i5);
            this.c = b2;
            this.d += i5;
        } catch (cik e) {
            this.d -= this.c - i3;
            this.c = i3;
            inefficientWriteStringNoTag(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i, int i2) {
        writeUInt32NoTag(WireFormat.makeTag(i, i2));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i, int i2) {
        h(20);
        d(i, 0);
        e(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i) {
        h(5);
        e(i);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i, long j) {
        h(20);
        d(i, 0);
        f(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) {
        h(10);
        f(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i, byte[] bArr) {
        writeByteArray(i, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i, MessageLite messageLite, vsg vsgVar) {
        writeTag(i, 2);
        writeMessageNoTag(messageLite, vsgVar);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite) {
        writeUInt32NoTag(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i, int i2) {
        flush();
        this.e.write(bArr, i, i2);
        this.d += i2;
    }

    @Override // defpackage.e03, com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(byte[] bArr, int i, int i2) {
        flush();
        this.e.writeLazy(bArr, i, i2);
        this.d += i2;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b) {
        if (this.c == this.b) {
            g();
        }
        a(b);
    }
}
