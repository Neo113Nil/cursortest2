package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163fo extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f13780e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13781f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13782g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f13783h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static volatile C0163fo[] f13784i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f13785a;

    /* renamed from: b, reason: collision with root package name */
    public int f13786b;

    /* renamed from: c, reason: collision with root package name */
    public C0189go f13787c;

    /* renamed from: d, reason: collision with root package name */
    public C0215ho f13788d;

    public C0163fo() {
        a();
    }

    public static C0163fo[] b() {
        if (f13784i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13784i == null) {
                        f13784i = new C0163fo[0];
                    }
                } finally {
                }
            }
        }
        return f13784i;
    }

    public final C0163fo a() {
        this.f13785a = WireFormatNano.EMPTY_BYTES;
        this.f13786b = 0;
        this.f13787c = null;
        this.f13788d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f13786b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f13785a) + super.computeSerializedSize();
        C0189go c0189go = this.f13787c;
        if (c0189go != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0189go);
        }
        C0215ho c0215ho = this.f13788d;
        return c0215ho != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0215ho) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f13785a);
        codedOutputByteBufferNano.writeInt32(2, this.f13786b);
        C0189go c0189go = this.f13787c;
        if (c0189go != null) {
            codedOutputByteBufferNano.writeMessage(3, c0189go);
        }
        C0215ho c0215ho = this.f13788d;
        if (c0215ho != null) {
            codedOutputByteBufferNano.writeMessage(4, c0215ho);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0163fo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13785a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f13786b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.f13787c == null) {
                    this.f13787c = new C0189go();
                }
                codedInputByteBufferNano.readMessage(this.f13787c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f13788d == null) {
                    this.f13788d = new C0215ho();
                }
                codedInputByteBufferNano.readMessage(this.f13788d);
            }
        }
        return this;
    }

    public static C0163fo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0163fo().mergeFrom(codedInputByteBufferNano);
    }

    public static C0163fo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0163fo) MessageNano.mergeFrom(new C0163fo(), bArr);
    }
}
