package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.o7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375o7 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0375o7[] f14398d;

    /* renamed from: a, reason: collision with root package name */
    public long f14399a;

    /* renamed from: b, reason: collision with root package name */
    public long f14400b;

    /* renamed from: c, reason: collision with root package name */
    public int f14401c;

    public C0375o7() {
        a();
    }

    public static C0375o7[] b() {
        if (f14398d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14398d == null) {
                        f14398d = new C0375o7[0];
                    }
                } finally {
                }
            }
        }
        return f14398d;
    }

    public final C0375o7 a() {
        this.f14399a = -1L;
        this.f14400b = -1L;
        this.f14401c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f14399a;
        if (j != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        long j6 = this.f14400b;
        if (j6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j6);
        }
        int i5 = this.f14401c;
        return i5 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f14399a;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        long j6 = this.f14400b;
        if (j6 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j6);
        }
        int i5 = this.f14401c;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0375o7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f14399a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 16) {
                this.f14400b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f14401c = readInt32;
                }
            }
        }
        return this;
    }

    public static C0375o7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0375o7().mergeFrom(codedInputByteBufferNano);
    }

    public static C0375o7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0375o7) MessageNano.mergeFrom(new C0375o7(), bArr);
    }
}
