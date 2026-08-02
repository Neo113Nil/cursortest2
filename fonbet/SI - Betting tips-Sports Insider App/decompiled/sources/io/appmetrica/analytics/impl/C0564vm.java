package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564vm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0564vm[] f14804b;

    /* renamed from: a, reason: collision with root package name */
    public long f14805a;

    public C0564vm() {
        a();
    }

    public static C0564vm[] b() {
        if (f14804b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14804b == null) {
                        f14804b = new C0564vm[0];
                    }
                } finally {
                }
            }
        }
        return f14804b;
    }

    public final C0564vm a() {
        this.f14805a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f14805a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f14805a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0564vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f14805a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0564vm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0564vm) MessageNano.mergeFrom(new C0564vm(), bArr);
    }

    public static C0564vm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0564vm().mergeFrom(codedInputByteBufferNano);
    }
}
