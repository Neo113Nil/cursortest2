package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514tm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0514tm[] f14687c;

    /* renamed from: a, reason: collision with root package name */
    public long f14688a;

    /* renamed from: b, reason: collision with root package name */
    public long f14689b;

    public C0514tm() {
        a();
    }

    public static C0514tm[] b() {
        if (f14687c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14687c == null) {
                        f14687c = new C0514tm[0];
                    }
                } finally {
                }
            }
        }
        return f14687c;
    }

    public final C0514tm a() {
        this.f14688a = 86400L;
        this.f14689b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f14689b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f14688a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f14688a);
        codedOutputByteBufferNano.writeInt64(2, this.f14689b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0514tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f14688a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f14689b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0514tm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0514tm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0514tm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0514tm) MessageNano.mergeFrom(new C0514tm(), bArr);
    }
}
