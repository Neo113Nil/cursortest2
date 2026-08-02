package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.cik;
import defpackage.fik;
import defpackage.sw9;
import defpackage.uck;
import defpackage.vsg;
import defpackage.yhk;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class t extends CodedOutputStream {
    public final byte[] a;
    public final int b;
    public final int c;
    public int d;

    public t(byte[] bArr, int i, int i2) {
        super();
        if (bArr == null) {
            yhk.s("buffer");
            throw null;
        }
        int i3 = i + i2;
        if ((i | i2 | (bArr.length - i3)) < 0) {
            sw9.n("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            throw null;
        }
        this.a = bArr;
        this.b = i;
        this.d = i;
        this.c = i3;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.d - this.b;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.c - this.d;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.a, this.d, remaining);
            this.d += remaining;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(remaining)), e);
        }
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
        try {
            byte[] bArr = this.a;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i, long j) {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j) {
        try {
            byte[] bArr = this.a;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e);
        }
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
    public final void writeMessage(int i, MessageLite messageLite, vsg vsgVar) {
        writeTag(i, 2);
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(vsgVar));
        vsgVar.e(messageLite, this.wrapper);
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
        int i = this.d;
        try {
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            byte[] bArr = this.a;
            if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                writeUInt32NoTag(fik.d(str));
                this.d = fik.b(str, bArr, this.d, spaceLeft());
                return;
            }
            int i2 = i + computeUInt32SizeNoTag2;
            this.d = i2;
            int b = fik.b(str, bArr, i2, spaceLeft());
            this.d = i;
            writeUInt32NoTag((b - i) - computeUInt32SizeNoTag2);
            this.d = b;
        } catch (cik e) {
            this.d = i;
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
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i) {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.a;
            if (i2 == 0) {
                int i3 = this.d;
                this.d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.d;
                    this.d = i4 + 1;
                    bArr[i4] = (byte) ((i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e);
                }
            }
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i, long j) {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) {
        boolean z;
        z = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.a;
        if (!z || spaceLeft() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i = this.d;
                    this.d = i + 1;
                    bArr[i] = (byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e);
                }
            }
            int i2 = this.d;
            this.d = i2 + 1;
            bArr[i2] = (byte) j;
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.d;
            this.d = i3 + 1;
            uck.m(bArr, (byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128), i3);
            j >>>= 7;
        }
        int i4 = this.d;
        this.d = i4 + 1;
        uck.m(bArr, (byte) j, i4);
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
    public void flush() {
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite) {
        writeUInt32NoTag(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i, MessageLite messageLite) {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.a, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b) {
        try {
            byte[] bArr = this.a;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e);
        }
    }
}
