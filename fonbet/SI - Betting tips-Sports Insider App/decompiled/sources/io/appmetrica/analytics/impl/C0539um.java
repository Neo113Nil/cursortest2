package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539um extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0539um[] f14754b;

    /* renamed from: a, reason: collision with root package name */
    public int f14755a;

    public C0539um() {
        a();
    }

    public static C0539um[] b() {
        if (f14754b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14754b == null) {
                        f14754b = new C0539um[0];
                    }
                } finally {
                }
            }
        }
        return f14754b;
    }

    public final C0539um a() {
        this.f14755a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f14755a;
        return i5 != 86400 ? CodedOutputByteBufferNano.computeUInt32Size(1, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f14755a;
        if (i5 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0539um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f14755a = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0539um a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0539um) MessageNano.mergeFrom(new C0539um(), bArr);
    }

    public static C0539um b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0539um().mergeFrom(codedInputByteBufferNano);
    }
}
