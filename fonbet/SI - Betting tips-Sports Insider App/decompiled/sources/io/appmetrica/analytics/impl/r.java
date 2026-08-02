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
public final class r extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile r[] f14529c;

    /* renamed from: a, reason: collision with root package name */
    public long f14530a;

    /* renamed from: b, reason: collision with root package name */
    public int f14531b;

    public r() {
        a();
    }

    public static r[] b() {
        if (f14529c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14529c == null) {
                        f14529c = new r[0];
                    }
                } finally {
                }
            }
        }
        return f14529c;
    }

    public final r a() {
        this.f14530a = 0L;
        this.f14531b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f14530a;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        int i5 = this.f14531b;
        return i5 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f14530a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        int i5 = this.f14531b;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f14530a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f14531b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static r b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new r().mergeFrom(codedInputByteBufferNano);
    }

    public static r a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (r) MessageNano.mergeFrom(new r(), bArr);
    }
}
