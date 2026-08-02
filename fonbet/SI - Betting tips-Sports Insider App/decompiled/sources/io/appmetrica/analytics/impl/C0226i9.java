package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226i9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0226i9[] f13934e;

    /* renamed from: a, reason: collision with root package name */
    public long f13935a;

    /* renamed from: b, reason: collision with root package name */
    public int f13936b;

    /* renamed from: c, reason: collision with root package name */
    public long f13937c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13938d;

    public C0226i9() {
        a();
    }

    public static C0226i9[] b() {
        if (f13934e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13934e == null) {
                        f13934e = new C0226i9[0];
                    }
                } finally {
                }
            }
        }
        return f13934e;
    }

    public final C0226i9 a() {
        this.f13935a = 0L;
        this.f13936b = 0;
        this.f13937c = 0L;
        this.f13938d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f13936b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f13935a) + super.computeSerializedSize();
        long j = this.f13937c;
        if (j != 0) {
            computeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j);
        }
        boolean z5 = this.f13938d;
        return z5 ? CodedOutputByteBufferNano.computeBoolSize(4, z5) + computeSInt32Size : computeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f13935a);
        codedOutputByteBufferNano.writeSInt32(2, this.f13936b);
        long j = this.f13937c;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(3, j);
        }
        boolean z5 = this.f13938d;
        if (z5) {
            codedOutputByteBufferNano.writeBool(4, z5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0226i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f13935a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 16) {
                this.f13936b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f13937c = codedInputByteBufferNano.readInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13938d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0226i9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0226i9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0226i9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0226i9) MessageNano.mergeFrom(new C0226i9(), bArr);
    }
}
