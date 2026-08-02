package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225i8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0225i8[] f13931c;

    /* renamed from: a, reason: collision with root package name */
    public int f13932a;

    /* renamed from: b, reason: collision with root package name */
    public C0121e8 f13933b;

    public C0225i8() {
        a();
    }

    public static C0225i8[] b() {
        if (f13931c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13931c == null) {
                        f13931c = new C0225i8[0];
                    }
                } finally {
                }
            }
        }
        return f13931c;
    }

    public final C0225i8 a() {
        this.f13932a = 0;
        this.f13933b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f13932a;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i5);
        }
        C0121e8 c0121e8 = this.f13933b;
        return c0121e8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0121e8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f13932a;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i5);
        }
        C0121e8 c0121e8 = this.f13933b;
        if (c0121e8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0121e8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0225i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f13932a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f13933b == null) {
                    this.f13933b = new C0121e8();
                }
                codedInputByteBufferNano.readMessage(this.f13933b);
            }
        }
        return this;
    }

    public static C0225i8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0225i8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0225i8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0225i8) MessageNano.mergeFrom(new C0225i8(), bArr);
    }
}
