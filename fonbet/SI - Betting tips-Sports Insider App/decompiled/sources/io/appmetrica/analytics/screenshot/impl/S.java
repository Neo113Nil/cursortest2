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
public final class S extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile S[] f15329c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15330a;

    /* renamed from: b, reason: collision with root package name */
    public Q f15331b;

    public S() {
        a();
    }

    public static S[] b() {
        if (f15329c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f15329c == null) {
                        f15329c = new S[0];
                    }
                } finally {
                }
            }
        }
        return f15329c;
    }

    public final S a() {
        this.f15330a = true;
        this.f15331b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f15330a;
        if (!z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        Q q = this.f15331b;
        return q != null ? CodedOutputByteBufferNano.computeMessageSize(2, q) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z5 = this.f15330a;
        if (!z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        Q q = this.f15331b;
        if (q != null) {
            codedOutputByteBufferNano.writeMessage(2, q);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f15330a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f15331b == null) {
                    this.f15331b = new Q();
                }
                codedInputByteBufferNano.readMessage(this.f15331b);
            }
        }
        return this;
    }

    public static S b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S().mergeFrom(codedInputByteBufferNano);
    }

    public static S a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S) MessageNano.mergeFrom(new S(), bArr);
    }
}
