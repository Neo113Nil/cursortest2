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
public final class Ki extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Ki[] f12480d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12481a;

    /* renamed from: b, reason: collision with root package name */
    public Ji f12482b;

    /* renamed from: c, reason: collision with root package name */
    public Ii f12483c;

    public Ki() {
        a();
    }

    public static Ki[] b() {
        if (f12480d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12480d == null) {
                        f12480d = new Ki[0];
                    }
                } finally {
                }
            }
        }
        return f12480d;
    }

    public final Ki a() {
        this.f12481a = false;
        this.f12482b = null;
        this.f12483c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f12481a;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        Ji ji2 = this.f12482b;
        if (ji2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ji2);
        }
        Ii ii = this.f12483c;
        return ii != null ? CodedOutputByteBufferNano.computeMessageSize(3, ii) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z5 = this.f12481a;
        if (z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        Ji ji2 = this.f12482b;
        if (ji2 != null) {
            codedOutputByteBufferNano.writeMessage(2, ji2);
        }
        Ii ii = this.f12483c;
        if (ii != null) {
            codedOutputByteBufferNano.writeMessage(3, ii);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ki mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f12481a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f12482b == null) {
                    this.f12482b = new Ji();
                }
                codedInputByteBufferNano.readMessage(this.f12482b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f12483c == null) {
                    this.f12483c = new Ii();
                }
                codedInputByteBufferNano.readMessage(this.f12483c);
            }
        }
        return this;
    }

    public static Ki b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ki().mergeFrom(codedInputByteBufferNano);
    }

    public static Ki a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ki) MessageNano.mergeFrom(new Ki(), bArr);
    }
}
