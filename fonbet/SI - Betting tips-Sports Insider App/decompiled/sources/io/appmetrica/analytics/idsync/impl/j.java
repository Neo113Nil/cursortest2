package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile j[] f11876b;

    /* renamed from: a, reason: collision with root package name */
    public int f11877a;

    public j() {
        a();
    }

    public static j[] b() {
        if (f11876b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11876b == null) {
                        f11876b = new j[0];
                    }
                } finally {
                }
            }
        }
        return f11876b;
    }

    public final j a() {
        this.f11877a = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f11877a;
        return i5 != 0 ? CodedOutputByteBufferNano.computeInt32Size(1, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f11877a;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1) {
                    this.f11877a = readInt32;
                }
            }
        }
        return this;
    }

    public static j a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (j) MessageNano.mergeFrom(new j(), bArr);
    }

    public static j b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new j().mergeFrom(codedInputByteBufferNano);
    }
}
