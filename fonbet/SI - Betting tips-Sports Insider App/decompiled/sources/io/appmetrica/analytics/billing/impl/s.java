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
public final class s extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile s[] f11441c;

    /* renamed from: a, reason: collision with root package name */
    public int f11442a;

    /* renamed from: b, reason: collision with root package name */
    public int f11443b;

    public s() {
        a();
    }

    public static s[] b() {
        if (f11441c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11441c == null) {
                        f11441c = new s[0];
                    }
                } finally {
                }
            }
        }
        return f11441c;
    }

    public final s a() {
        this.f11442a = 86400;
        this.f11443b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f11442a;
        if (i5 != 86400) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i5);
        }
        int i10 = this.f11443b;
        return i10 != 86400 ? CodedOutputByteBufferNano.computeInt32Size(2, i10) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f11442a;
        if (i5 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i5);
        }
        int i10 = this.f11443b;
        if (i10 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f11442a = codedInputByteBufferNano.readInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11443b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new s().mergeFrom(codedInputByteBufferNano);
    }

    public static s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (s) MessageNano.mergeFrom(new s(), bArr);
    }
}
