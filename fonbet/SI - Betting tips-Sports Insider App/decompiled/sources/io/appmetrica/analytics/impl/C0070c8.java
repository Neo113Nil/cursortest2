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
/* renamed from: io.appmetrica.analytics.impl.c8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070c8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0070c8[] f13503c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f13504a;

    /* renamed from: b, reason: collision with root package name */
    public C0173g8 f13505b;

    public C0070c8() {
        a();
    }

    public static C0070c8[] b() {
        if (f13503c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13503c == null) {
                        f13503c = new C0070c8[0];
                    }
                } finally {
                }
            }
        }
        return f13503c;
    }

    public final C0070c8 a() {
        this.f13504a = WireFormatNano.EMPTY_BYTES;
        this.f13505b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f13504a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f13504a);
        }
        C0173g8 c0173g8 = this.f13505b;
        return c0173g8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0173g8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f13504a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f13504a);
        }
        C0173g8 c0173g8 = this.f13505b;
        if (c0173g8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0173g8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0070c8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13504a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f13505b == null) {
                    this.f13505b = new C0173g8();
                }
                codedInputByteBufferNano.readMessage(this.f13505b);
            }
        }
        return this;
    }

    public static C0070c8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0070c8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0070c8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0070c8) MessageNano.mergeFrom(new C0070c8(), bArr);
    }
}
