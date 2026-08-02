package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class W5 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile W5[] f13081b;

    /* renamed from: a, reason: collision with root package name */
    public String f13082a;

    public W5() {
        a();
    }

    public static W5[] b() {
        if (f13081b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13081b == null) {
                        f13081b = new W5[0];
                    }
                } finally {
                }
            }
        }
        return f13081b;
    }

    public final W5 a() {
        this.f13082a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f13082a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f13082a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13082a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static W5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (W5) MessageNano.mergeFrom(new W5(), bArr);
    }

    public static W5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new W5().mergeFrom(codedInputByteBufferNano);
    }
}
