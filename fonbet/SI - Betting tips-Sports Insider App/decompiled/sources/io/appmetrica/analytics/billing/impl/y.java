package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f11467f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11468g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11469h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile y[] f11470i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11471a;

    /* renamed from: b, reason: collision with root package name */
    public long f11472b;

    /* renamed from: c, reason: collision with root package name */
    public int f11473c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f11474d;

    /* renamed from: e, reason: collision with root package name */
    public long f11475e;

    public y() {
        a();
    }

    public static y[] b() {
        if (f11470i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11470i == null) {
                        f11470i = new y[0];
                    }
                } finally {
                }
            }
        }
        return f11470i;
    }

    public final y a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f11471a = bArr;
        this.f11472b = 0L;
        this.f11473c = 0;
        this.f11474d = bArr;
        this.f11475e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f11471a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f11471a);
        }
        long j = this.f11472b;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        int i5 = this.f11473c;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i5);
        }
        if (!Arrays.equals(this.f11474d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f11474d);
        }
        long j6 = this.f11475e;
        return j6 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j6) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f11471a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f11471a);
        }
        long j = this.f11472b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        int i5 = this.f11473c;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i5);
        }
        if (!Arrays.equals(this.f11474d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f11474d);
        }
        long j6 = this.f11475e;
        if (j6 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11471a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f11472b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f11473c = readInt32;
                }
            } else if (readTag == 34) {
                this.f11474d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11475e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static y a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }
}
