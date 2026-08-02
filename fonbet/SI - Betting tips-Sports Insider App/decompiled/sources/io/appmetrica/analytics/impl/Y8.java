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
public final class Y8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Y8[] f13214c;

    /* renamed from: a, reason: collision with root package name */
    public String f13215a;

    /* renamed from: b, reason: collision with root package name */
    public String f13216b;

    public Y8() {
        a();
    }

    public static Y8[] b() {
        if (f13214c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13214c == null) {
                        f13214c = new Y8[0];
                    }
                } finally {
                }
            }
        }
        return f13214c;
    }

    public final Y8 a() {
        this.f13215a = "";
        this.f13216b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f13216b) + CodedOutputByteBufferNano.computeStringSize(1, this.f13215a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f13215a);
        codedOutputByteBufferNano.writeString(2, this.f13216b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13215a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13216b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Y8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Y8().mergeFrom(codedInputByteBufferNano);
    }

    public static Y8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Y8) MessageNano.mergeFrom(new Y8(), bArr);
    }
}
