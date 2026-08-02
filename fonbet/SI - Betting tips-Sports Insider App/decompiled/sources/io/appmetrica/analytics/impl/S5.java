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
public final class S5 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile S5[] f12857d;

    /* renamed from: a, reason: collision with root package name */
    public R5 f12858a;

    /* renamed from: b, reason: collision with root package name */
    public String f12859b;

    /* renamed from: c, reason: collision with root package name */
    public int f12860c;

    public S5() {
        a();
    }

    public static S5[] b() {
        if (f12857d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12857d == null) {
                        f12857d = new S5[0];
                    }
                } finally {
                }
            }
        }
        return f12857d;
    }

    public final S5 a() {
        this.f12858a = null;
        this.f12859b = "";
        this.f12860c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        R5 r5 = this.f12858a;
        if (r5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, r5);
        }
        if (!this.f12859b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f12859b);
        }
        int i5 = this.f12860c;
        return i5 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        R5 r5 = this.f12858a;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(1, r5);
        }
        if (!this.f12859b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f12859b);
        }
        int i5 = this.f12860c;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f12858a == null) {
                    this.f12858a = new R5();
                }
                codedInputByteBufferNano.readMessage(this.f12858a);
            } else if (readTag == 18) {
                this.f12859b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f12860c = readInt32;
                }
            }
        }
        return this;
    }

    public static S5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S5().mergeFrom(codedInputByteBufferNano);
    }

    public static S5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S5) MessageNano.mergeFrom(new S5(), bArr);
    }
}
