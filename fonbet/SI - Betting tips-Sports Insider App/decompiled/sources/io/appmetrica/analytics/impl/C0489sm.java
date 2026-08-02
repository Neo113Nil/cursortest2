package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489sm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0489sm[] f14647c;

    /* renamed from: a, reason: collision with root package name */
    public String f14648a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f14649b;

    public C0489sm() {
        a();
    }

    public static C0489sm[] b() {
        if (f14647c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14647c == null) {
                        f14647c = new C0489sm[0];
                    }
                } finally {
                }
            }
        }
        return f14647c;
    }

    public final C0489sm a() {
        this.f14648a = "";
        this.f14649b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f14648a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f14648a);
        }
        return !Arrays.equals(this.f14649b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f14649b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f14648a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f14648a);
        }
        if (!Arrays.equals(this.f14649b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f14649b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0489sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f14648a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f14649b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0489sm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0489sm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0489sm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0489sm) MessageNano.mergeFrom(new C0489sm(), bArr);
    }
}
