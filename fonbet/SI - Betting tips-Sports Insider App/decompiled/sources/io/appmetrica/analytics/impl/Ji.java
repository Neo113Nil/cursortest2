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
public final class Ji extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f12435c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12436d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12437e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12438f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f12439g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Ji[] f12440h;

    /* renamed from: a, reason: collision with root package name */
    public int f12441a;

    /* renamed from: b, reason: collision with root package name */
    public int f12442b;

    public Ji() {
        a();
    }

    public static Ji[] b() {
        if (f12440h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12440h == null) {
                        f12440h = new Ji[0];
                    }
                } finally {
                }
            }
        }
        return f12440h;
    }

    public final Ji a() {
        this.f12441a = 0;
        this.f12442b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f12441a;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i5);
        }
        int i10 = this.f12442b;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i10) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f12441a;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i5);
        }
        int i10 = this.f12442b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ji mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f12441a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                    this.f12442b = readInt32;
                }
            }
        }
        return this;
    }

    public static Ji b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ji().mergeFrom(codedInputByteBufferNano);
    }

    public static Ji a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ji) MessageNano.mergeFrom(new Ji(), bArr);
    }
}
