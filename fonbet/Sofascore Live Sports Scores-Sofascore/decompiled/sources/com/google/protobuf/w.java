package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.cik;
import defpackage.fik;
import defpackage.vsg;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w extends CodedOutputStream {
    public final ByteBuffer a;
    public final ByteBuffer b;
    public final int c;

    public w(ByteBuffer byteBuffer) {
        super();
        this.a = byteBuffer;
        this.b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.c = byteBuffer.position();
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.a.position(this.b.position());
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.b.position() - this.c;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.b.remaining();
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.b.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        } catch (BufferOverflowException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
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
            this.b.putInt(i);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
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
            this.b.putLong(j);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
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
        ByteBuffer byteBuffer = this.b;
        int position = byteBuffer.position();
        try {
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                writeUInt32NoTag(fik.d(str));
                try {
                    fik.c(str, byteBuffer);
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream.OutOfSpaceException(e);
                }
            }
            int position2 = byteBuffer.position() + computeUInt32SizeNoTag2;
            byteBuffer.position(position2);
            try {
                fik.c(str, byteBuffer);
                int position3 = byteBuffer.position();
                byteBuffer.position(position);
                writeUInt32NoTag(position3 - position2);
                byteBuffer.position(position3);
            } catch (IndexOutOfBoundsException e2) {
                throw new CodedOutputStream.OutOfSpaceException(e2);
            }
        } catch (cik e3) {
            byteBuffer.position(position);
            inefficientWriteStringNoTag(str, e3);
        } catch (IllegalArgumentException e4) {
            throw new CodedOutputStream.OutOfSpaceException(e4);
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
            ByteBuffer byteBuffer = this.b;
            if (i2 == 0) {
                byteBuffer.put((byte) i);
                return;
            }
            try {
                byteBuffer.put((byte) ((i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
                i >>>= 7;
            } catch (BufferOverflowException e) {
                throw new CodedOutputStream.OutOfSpaceException(e);
            }
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i, long j) {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) {
        while (true) {
            long j2 = (-128) & j;
            ByteBuffer byteBuffer = this.b;
            if (j2 == 0) {
                byteBuffer.put((byte) j);
                return;
            }
            try {
                byteBuffer.put((byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e) {
                throw new CodedOutputStream.OutOfSpaceException(e);
            }
            throw new CodedOutputStream.OutOfSpaceException(e);
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
        try {
            this.b.put(b);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) {
        try {
            this.b.put(byteBuffer);
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }
}
