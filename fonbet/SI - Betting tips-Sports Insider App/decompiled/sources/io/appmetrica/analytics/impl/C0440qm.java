package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440qm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0440qm[] f14525b;

    /* renamed from: a, reason: collision with root package name */
    public long f14526a;

    public C0440qm() {
        a();
    }

    public static C0440qm[] b() {
        if (f14525b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14525b == null) {
                        f14525b = new C0440qm[0];
                    }
                } finally {
                }
            }
        }
        return f14525b;
    }

    public final C0440qm a() {
        this.f14526a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f14526a;
        return j != 864000000 ? CodedOutputByteBufferNano.computeInt64Size(1, j) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f14526a;
        if (j != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0440qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f14526a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0440qm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0440qm) MessageNano.mergeFrom(new C0440qm(), bArr);
    }

    public static C0440qm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0440qm().mergeFrom(codedInputByteBufferNano);
    }
}
