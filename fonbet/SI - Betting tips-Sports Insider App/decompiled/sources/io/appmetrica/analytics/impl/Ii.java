package io.appmetrica.analytics.impl;

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
public final class Ii extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile Ii[] f12389e;

    /* renamed from: a, reason: collision with root package name */
    public long f12390a;

    /* renamed from: b, reason: collision with root package name */
    public Ji f12391b;

    /* renamed from: c, reason: collision with root package name */
    public int f12392c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f12393d;

    public Ii() {
        a();
    }

    public static Ii[] b() {
        if (f12389e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12389e == null) {
                        f12389e = new Ii[0];
                    }
                } finally {
                }
            }
        }
        return f12389e;
    }

    public final Ii a() {
        this.f12390a = 0L;
        this.f12391b = null;
        this.f12392c = 0;
        this.f12393d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f12390a;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        Ji ji2 = this.f12391b;
        if (ji2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ji2);
        }
        int i5 = this.f12392c;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i5);
        }
        return !Arrays.equals(this.f12393d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f12393d) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f12390a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        Ji ji2 = this.f12391b;
        if (ji2 != null) {
            codedOutputByteBufferNano.writeMessage(2, ji2);
        }
        int i5 = this.f12392c;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i5);
        }
        if (!Arrays.equals(this.f12393d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f12393d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f12390a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f12391b == null) {
                    this.f12391b = new Ji();
                }
                codedInputByteBufferNano.readMessage(this.f12391b);
            } else if (readTag == 24) {
                this.f12392c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12393d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Ii b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ii().mergeFrom(codedInputByteBufferNano);
    }

    public static Ii a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ii) MessageNano.mergeFrom(new Ii(), bArr);
    }
}
