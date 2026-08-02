package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class P extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile P[] f15322c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15323a;

    /* renamed from: b, reason: collision with root package name */
    public long f15324b;

    public P() {
        a();
    }

    public static P[] b() {
        if (f15322c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f15322c == null) {
                        f15322c = new P[0];
                    }
                } finally {
                }
            }
        }
        return f15322c;
    }

    public final P a() {
        this.f15323a = true;
        this.f15324b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f15323a;
        if (!z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        long j = this.f15324b;
        return j != 1 ? CodedOutputByteBufferNano.computeInt64Size(2, j) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z5 = this.f15323a;
        if (!z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        long j = this.f15324b;
        if (j != 1) {
            codedOutputByteBufferNano.writeInt64(2, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f15323a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f15324b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static P b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new P().mergeFrom(codedInputByteBufferNano);
    }

    public static P a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (P) MessageNano.mergeFrom(new P(), bArr);
    }
}
