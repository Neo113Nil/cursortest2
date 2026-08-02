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
public final class W1 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile W1[] f13075c;

    /* renamed from: a, reason: collision with root package name */
    public String f13076a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13077b;

    public W1() {
        a();
    }

    public static W1[] b() {
        if (f13075c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13075c == null) {
                        f13075c = new W1[0];
                    }
                } finally {
                }
            }
        }
        return f13075c;
    }

    public final W1 a() {
        this.f13076a = "";
        this.f13077b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f13077b) + CodedOutputByteBufferNano.computeStringSize(1, this.f13076a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f13076a);
        codedOutputByteBufferNano.writeBool(2, this.f13077b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13076a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13077b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static W1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new W1().mergeFrom(codedInputByteBufferNano);
    }

    public static W1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (W1) MessageNano.mergeFrom(new W1(), bArr);
    }
}
