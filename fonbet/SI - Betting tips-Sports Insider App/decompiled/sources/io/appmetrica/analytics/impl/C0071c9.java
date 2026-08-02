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
/* renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071c9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0071c9[] f13506c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f13507a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f13508b;

    public C0071c9() {
        a();
    }

    public static C0071c9[] b() {
        if (f13506c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13506c == null) {
                        f13506c = new C0071c9[0];
                    }
                } finally {
                }
            }
        }
        return f13506c;
    }

    public final C0071c9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f13507a = bArr;
        this.f13508b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f13507a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f13507a);
        }
        return !Arrays.equals(this.f13508b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f13508b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f13507a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f13507a);
        }
        if (!Arrays.equals(this.f13508b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f13508b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0071c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13507a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13508b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0071c9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0071c9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0071c9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0071c9) MessageNano.mergeFrom(new C0071c9(), bArr);
    }
}
