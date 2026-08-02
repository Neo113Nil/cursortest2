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
public final class U5 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile U5[] f12956c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12957a;

    /* renamed from: b, reason: collision with root package name */
    public Y5 f12958b;

    public U5() {
        a();
    }

    public static U5[] b() {
        if (f12956c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12956c == null) {
                        f12956c = new U5[0];
                    }
                } finally {
                }
            }
        }
        return f12956c;
    }

    public final U5 a() {
        this.f12957a = WireFormatNano.EMPTY_BYTES;
        this.f12958b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f12957a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f12957a);
        }
        Y5 y5 = this.f12958b;
        return y5 != null ? CodedOutputByteBufferNano.computeMessageSize(2, y5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f12957a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f12957a);
        }
        Y5 y5 = this.f12958b;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, y5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12957a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f12958b == null) {
                    this.f12958b = new Y5();
                }
                codedInputByteBufferNano.readMessage(this.f12958b);
            }
        }
        return this;
    }

    public static U5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new U5().mergeFrom(codedInputByteBufferNano);
    }

    public static U5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (U5) MessageNano.mergeFrom(new U5(), bArr);
    }
}
