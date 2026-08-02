package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.e8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121e8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0121e8[] f13649e;

    /* renamed from: a, reason: collision with root package name */
    public C0351n8 f13650a;

    /* renamed from: b, reason: collision with root package name */
    public C0401p8 f13651b;

    /* renamed from: c, reason: collision with root package name */
    public C0173g8 f13652c;

    /* renamed from: d, reason: collision with root package name */
    public C0326m8 f13653d;

    public C0121e8() {
        a();
    }

    public static C0121e8[] b() {
        if (f13649e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13649e == null) {
                        f13649e = new C0121e8[0];
                    }
                } finally {
                }
            }
        }
        return f13649e;
    }

    public final C0121e8 a() {
        this.f13650a = null;
        this.f13651b = null;
        this.f13652c = null;
        this.f13653d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0351n8 c0351n8 = this.f13650a;
        if (c0351n8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0351n8);
        }
        C0401p8 c0401p8 = this.f13651b;
        if (c0401p8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0401p8);
        }
        C0173g8 c0173g8 = this.f13652c;
        if (c0173g8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0173g8);
        }
        C0326m8 c0326m8 = this.f13653d;
        return c0326m8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0326m8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0351n8 c0351n8 = this.f13650a;
        if (c0351n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0351n8);
        }
        C0401p8 c0401p8 = this.f13651b;
        if (c0401p8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0401p8);
        }
        C0173g8 c0173g8 = this.f13652c;
        if (c0173g8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0173g8);
        }
        C0326m8 c0326m8 = this.f13653d;
        if (c0326m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0326m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0121e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f13650a == null) {
                    this.f13650a = new C0351n8();
                }
                codedInputByteBufferNano.readMessage(this.f13650a);
            } else if (readTag == 18) {
                if (this.f13651b == null) {
                    this.f13651b = new C0401p8();
                }
                codedInputByteBufferNano.readMessage(this.f13651b);
            } else if (readTag == 26) {
                if (this.f13652c == null) {
                    this.f13652c = new C0173g8();
                }
                codedInputByteBufferNano.readMessage(this.f13652c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f13653d == null) {
                    this.f13653d = new C0326m8();
                }
                codedInputByteBufferNano.readMessage(this.f13653d);
            }
        }
        return this;
    }

    public static C0121e8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0121e8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0121e8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0121e8) MessageNano.mergeFrom(new C0121e8(), bArr);
    }
}
