package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class O extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile O[] f15318d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15319a;

    /* renamed from: b, reason: collision with root package name */
    public long f15320b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f15321c;

    public O() {
        a();
    }

    public static O[] b() {
        if (f15318d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f15318d == null) {
                        f15318d = new O[0];
                    }
                } finally {
                }
            }
        }
        return f15318d;
    }

    public final O a() {
        this.f15319a = true;
        this.f15320b = 5L;
        this.f15321c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f15319a;
        if (!z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        long j = this.f15320b;
        if (j != 5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j);
        }
        String[] strArr = this.f15321c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr2 = this.f15321c;
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
        boolean z5 = this.f15319a;
        if (!z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        long j = this.f15320b;
        if (j != 5) {
            codedOutputByteBufferNano.writeInt64(2, j);
        }
        String[] strArr = this.f15321c;
        if (strArr != null && strArr.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f15321c;
                if (i5 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i5];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f15319a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f15320b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f15321c;
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
                this.f15321c = strArr2;
            }
        }
        return this;
    }

    public static O b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O().mergeFrom(codedInputByteBufferNano);
    }

    public static O a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (O) MessageNano.mergeFrom(new O(), bArr);
    }
}
