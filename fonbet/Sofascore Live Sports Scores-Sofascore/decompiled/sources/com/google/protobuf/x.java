package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import com.ironsource.U3;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.cik;
import defpackage.fik;
import defpackage.uck;
import defpackage.vsg;
import defpackage.yhk;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x extends CodedOutputStream {
    public final ByteBuffer a;
    public final ByteBuffer b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public long g;

    public x(ByteBuffer byteBuffer) {
        super();
        this.a = byteBuffer;
        this.b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long a = uck.a(byteBuffer);
        this.c = a;
        long position = byteBuffer.position() + a;
        this.d = position;
        long limit = a + byteBuffer.limit();
        this.e = limit;
        this.f = limit - 10;
        this.g = position;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.a.position((int) (this.g - this.c));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return (int) (this.g - this.d);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return (int) (this.e - this.g);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i, int i2) {
        long j = this.e;
        if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
            long j2 = i2;
            long j3 = j - j2;
            long j4 = this.g;
            if (j3 >= j4) {
                uck.c.b(bArr, i, j4, j2);
                this.g += j2;
                return;
            }
        }
        if (bArr != null) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.g), Long.valueOf(j), Integer.valueOf(i2)));
        }
        yhk.s(U3.i.X);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i, boolean z) {
        writeTag(i, 0);
        write(z ? (byte) 1 : (byte) 0);
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
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i) {
        this.b.putInt((int) (this.g - this.c), i);
        this.g += 4;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i, long j) {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j) {
        this.b.putLong((int) (this.g - this.c), j);
        this.g += 8;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i, int i2) {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i) {
        if (i >= 0) {
            writeUInt32NoTag(i);
        } else {
            writeUInt64NoTag(i);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
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
        long j = this.c;
        ByteBuffer byteBuffer = this.b;
        long j2 = this.g;
        try {
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                int d = fik.d(str);
                writeUInt32NoTag(d);
                byteBuffer.position((int) (this.g - j));
                fik.c(str, byteBuffer);
                this.g += d;
                return;
            }
            int i = ((int) (this.g - j)) + computeUInt32SizeNoTag2;
            byteBuffer.position(i);
            fik.c(str, byteBuffer);
            int position = byteBuffer.position() - i;
            writeUInt32NoTag(position);
            this.g += position;
        } catch (cik e) {
            this.g = j2;
            byteBuffer.position((int) (j2 - j));
            inefficientWriteStringNoTag(str, e);
        } catch (IllegalArgumentException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream.OutOfSpaceException(e3);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i, int i2) {
        writeUInt32NoTag(WireFormat.makeTag(i, i2));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i, int i2) {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i) {
        if (this.g <= this.f) {
            while (true) {
                int i2 = i & (-128);
                long j = this.g;
                if (i2 == 0) {
                    this.g = 1 + j;
                    uck.l((byte) i, j);
                    return;
                } else {
                    this.g = j + 1;
                    uck.l((byte) ((i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128), j);
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                long j2 = this.g;
                long j3 = this.e;
                if (j2 >= j3) {
                    throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j2), Long.valueOf(j3), 1));
                }
                if ((i & (-128)) == 0) {
                    this.g = 1 + j2;
                    uck.l((byte) i, j2);
                    return;
                } else {
                    this.g = j2 + 1;
                    uck.l((byte) ((i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128), j2);
                    i >>>= 7;
                }
            }
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i, long j) {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) {
        if (this.g <= this.f) {
            while (true) {
                long j2 = j & (-128);
                long j3 = this.g;
                if (j2 == 0) {
                    this.g = 1 + j3;
                    uck.l((byte) j, j3);
                    return;
                } else {
                    this.g = j3 + 1;
                    uck.l((byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128), j3);
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j4 = this.g;
                long j5 = this.e;
                if (j4 >= j5) {
                    throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j4), Long.valueOf(j5), 1));
                }
                if ((j & (-128)) == 0) {
                    this.g = 1 + j4;
                    uck.l((byte) j, j4);
                    return;
                } else {
                    this.g = j4 + 1;
                    uck.l((byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128), j4);
                    j >>>= 7;
                }
            }
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(ByteBuffer byteBuffer) {
        write(byteBuffer);
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
    public final void write(byte b) {
        long j = this.g;
        long j2 = this.e;
        if (j < j2) {
            this.g = 1 + j;
            uck.l(b, j);
            return;
        }
        throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(j2), 1));
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.b;
        try {
            int remaining = byteBuffer.remaining();
            byteBuffer2.position((int) (this.g - this.c));
            byteBuffer2.put(byteBuffer);
            this.g += remaining;
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }
}
