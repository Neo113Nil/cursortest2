package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile t[] f11444c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11445a;

    /* renamed from: b, reason: collision with root package name */
    public s f11446b;

    public t() {
        a();
    }

    public static t[] b() {
        if (f11444c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11444c == null) {
                        f11444c = new t[0];
                    }
                } finally {
                }
            }
        }
        return f11444c;
    }

    public final t a() {
        this.f11445a = true;
        this.f11446b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f11445a;
        if (!z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        s sVar = this.f11446b;
        return sVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, sVar) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z5 = this.f11445a;
        if (!z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        s sVar = this.f11446b;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(2, sVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f11445a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f11446b == null) {
                    this.f11446b = new s();
                }
                codedInputByteBufferNano.readMessage(this.f11446b);
            }
        }
        return this;
    }

    public static t b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new t().mergeFrom(codedInputByteBufferNano);
    }

    public static t a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (t) MessageNano.mergeFrom(new t(), bArr);
    }
}
