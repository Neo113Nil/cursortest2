package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile i[] f11873c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11874a;

    /* renamed from: b, reason: collision with root package name */
    public byte[][] f11875b;

    public i() {
        a();
    }

    public static i[] b() {
        if (f11873c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11873c == null) {
                        f11873c = new i[0];
                    }
                } finally {
                }
            }
        }
        return f11873c;
    }

    public final i a() {
        this.f11874a = WireFormatNano.EMPTY_BYTES;
        this.f11875b = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f11874a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f11874a);
        }
        byte[][] bArr = this.f11875b;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[][] bArr2 = this.f11875b;
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
        if (!Arrays.equals(this.f11874a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f11874a);
        }
        byte[][] bArr = this.f11875b;
        if (bArr != null && bArr.length > 0) {
            int i5 = 0;
            while (true) {
                byte[][] bArr2 = this.f11875b;
                if (i5 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i5];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(2, bArr3);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11874a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                byte[][] bArr = this.f11875b;
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
                this.f11875b = bArr2;
            }
        }
        return this;
    }

    public static i b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new i().mergeFrom(codedInputByteBufferNano);
    }

    public static i a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (i) MessageNano.mergeFrom(new i(), bArr);
    }
}
