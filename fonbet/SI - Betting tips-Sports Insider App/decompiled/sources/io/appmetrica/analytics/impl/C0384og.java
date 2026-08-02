package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384og extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f14415e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14416f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14417g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0384og[] f14418h;

    /* renamed from: a, reason: collision with root package name */
    public String f14419a;

    /* renamed from: b, reason: collision with root package name */
    public long f14420b;

    /* renamed from: c, reason: collision with root package name */
    public long f14421c;

    /* renamed from: d, reason: collision with root package name */
    public int f14422d;

    public C0384og() {
        a();
    }

    public static C0384og[] b() {
        if (f14418h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14418h == null) {
                        f14418h = new C0384og[0];
                    }
                } finally {
                }
            }
        }
        return f14418h;
    }

    public final C0384og a() {
        this.f14419a = "";
        this.f14420b = 0L;
        this.f14421c = 0L;
        this.f14422d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f14419a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f14419a);
        }
        long j = this.f14420b;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j6 = this.f14421c;
        if (j6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j6);
        }
        int i5 = this.f14422d;
        return i5 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f14419a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f14419a);
        }
        long j = this.f14420b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j6 = this.f14421c;
        if (j6 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j6);
        }
        int i5 = this.f14422d;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0384og mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f14419a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f14420b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f14421c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f14422d = readInt32;
                }
            }
        }
        return this;
    }

    public static C0384og b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0384og().mergeFrom(codedInputByteBufferNano);
    }

    public static C0384og a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0384og) MessageNano.mergeFrom(new C0384og(), bArr);
    }
}
