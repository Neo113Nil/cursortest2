package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.g8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173g8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0173g8[] f13809c;

    /* renamed from: a, reason: collision with root package name */
    public long f13810a;

    /* renamed from: b, reason: collision with root package name */
    public int f13811b;

    public C0173g8() {
        a();
    }

    public static C0173g8[] b() {
        if (f13809c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13809c == null) {
                        f13809c = new C0173g8[0];
                    }
                } finally {
                }
            }
        }
        return f13809c;
    }

    public final C0173g8 a() {
        this.f13810a = 0L;
        this.f13811b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f13810a;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        int i5 = this.f13811b;
        return i5 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f13810a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        int i5 = this.f13811b;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0173g8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f13810a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13811b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static C0173g8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0173g8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0173g8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0173g8) MessageNano.mergeFrom(new C0173g8(), bArr);
    }
}
