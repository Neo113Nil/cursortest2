package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415pm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0415pm[] f14489c;

    /* renamed from: a, reason: collision with root package name */
    public String f14490a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f14491b;

    public C0415pm() {
        a();
    }

    public static C0415pm[] b() {
        if (f14489c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14489c == null) {
                        f14489c = new C0415pm[0];
                    }
                } finally {
                }
            }
        }
        return f14489c;
    }

    public final C0415pm a() {
        this.f14490a = "";
        this.f14491b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f14490a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f14490a);
        }
        String[] strArr = this.f14491b;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr2 = this.f14491b;
            if (i5 >= strArr2.length) {
                return computeSerializedSize + i10 + i11;
            }
            String str = strArr2[i5];
            if (str != null) {
                i11++;
                i10 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i10;
            }
            i5++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f14490a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f14490a);
        }
        String[] strArr = this.f14491b;
        if (strArr != null && strArr.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f14491b;
                if (i5 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i5];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0415pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f14490a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f14491b;
                int length = strArr == null ? 0 : strArr.length;
                int i5 = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i5];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i5 - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f14491b = strArr2;
            }
        }
        return this;
    }

    public static C0415pm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0415pm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0415pm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0415pm) MessageNano.mergeFrom(new C0415pm(), bArr);
    }
}
