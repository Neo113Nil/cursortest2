package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class R5 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile R5[] f12803d;

    /* renamed from: a, reason: collision with root package name */
    public C0016a6 f12804a;

    /* renamed from: b, reason: collision with root package name */
    public C0016a6[] f12805b;

    /* renamed from: c, reason: collision with root package name */
    public String f12806c;

    public R5() {
        a();
    }

    public static R5[] b() {
        if (f12803d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12803d == null) {
                        f12803d = new R5[0];
                    }
                } finally {
                }
            }
        }
        return f12803d;
    }

    public final R5 a() {
        this.f12804a = null;
        this.f12805b = C0016a6.b();
        this.f12806c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0016a6 c0016a6 = this.f12804a;
        if (c0016a6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0016a6);
        }
        C0016a6[] c0016a6Arr = this.f12805b;
        if (c0016a6Arr != null && c0016a6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0016a6[] c0016a6Arr2 = this.f12805b;
                if (i5 >= c0016a6Arr2.length) {
                    break;
                }
                C0016a6 c0016a62 = c0016a6Arr2[i5];
                if (c0016a62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0016a62) + computeSerializedSize;
                }
                i5++;
            }
        }
        return !this.f12806c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.f12806c) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0016a6 c0016a6 = this.f12804a;
        if (c0016a6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0016a6);
        }
        C0016a6[] c0016a6Arr = this.f12805b;
        if (c0016a6Arr != null && c0016a6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0016a6[] c0016a6Arr2 = this.f12805b;
                if (i5 >= c0016a6Arr2.length) {
                    break;
                }
                C0016a6 c0016a62 = c0016a6Arr2[i5];
                if (c0016a62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0016a62);
                }
                i5++;
            }
        }
        if (!this.f12806c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f12806c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f12804a == null) {
                    this.f12804a = new C0016a6();
                }
                codedInputByteBufferNano.readMessage(this.f12804a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0016a6[] c0016a6Arr = this.f12805b;
                int length = c0016a6Arr == null ? 0 : c0016a6Arr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0016a6[] c0016a6Arr2 = new C0016a6[i5];
                if (length != 0) {
                    System.arraycopy(c0016a6Arr, 0, c0016a6Arr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0016a6 c0016a6 = new C0016a6();
                    c0016a6Arr2[length] = c0016a6;
                    codedInputByteBufferNano.readMessage(c0016a6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0016a6 c0016a62 = new C0016a6();
                c0016a6Arr2[length] = c0016a62;
                codedInputByteBufferNano.readMessage(c0016a62);
                this.f12805b = c0016a6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12806c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static R5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new R5().mergeFrom(codedInputByteBufferNano);
    }

    public static R5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (R5) MessageNano.mergeFrom(new R5(), bArr);
    }
}
