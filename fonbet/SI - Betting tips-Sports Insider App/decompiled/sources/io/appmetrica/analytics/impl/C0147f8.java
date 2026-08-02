package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147f8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0147f8[] f13720b;

    /* renamed from: a, reason: collision with root package name */
    public byte[][] f13721a;

    public C0147f8() {
        a();
    }

    public static C0147f8[] b() {
        if (f13720b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13720b == null) {
                        f13720b = new C0147f8[0];
                    }
                } finally {
                }
            }
        }
        return f13720b;
    }

    public final C0147f8 a() {
        this.f13721a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f13721a;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[][] bArr2 = this.f13721a;
            if (i5 >= bArr2.length) {
                return computeSerializedSize + i10 + i11;
            }
            byte[] bArr3 = bArr2[i5];
            if (bArr3 != null) {
                i11++;
                i10 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i10;
            }
            i5++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[][] bArr = this.f13721a;
        if (bArr != null && bArr.length > 0) {
            int i5 = 0;
            while (true) {
                byte[][] bArr2 = this.f13721a;
                if (i5 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i5];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0147f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f13721a;
                int length = bArr == null ? 0 : bArr.length;
                int i5 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i5][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i5 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f13721a = bArr2;
            }
        }
        return this;
    }

    public static C0147f8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0147f8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0147f8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0147f8) MessageNano.mergeFrom(new C0147f8(), bArr);
    }
}
