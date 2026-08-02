package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570w3 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0570w3[] f14817b;

    /* renamed from: a, reason: collision with root package name */
    public C0545v3[] f14818a;

    public C0570w3() {
        a();
    }

    public static C0570w3[] b() {
        if (f14817b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14817b == null) {
                        f14817b = new C0570w3[0];
                    }
                } finally {
                }
            }
        }
        return f14817b;
    }

    public final C0570w3 a() {
        this.f14818a = C0545v3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0545v3[] c0545v3Arr = this.f14818a;
        if (c0545v3Arr != null && c0545v3Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0545v3[] c0545v3Arr2 = this.f14818a;
                if (i5 >= c0545v3Arr2.length) {
                    break;
                }
                C0545v3 c0545v3 = c0545v3Arr2[i5];
                if (c0545v3 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0545v3) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0545v3[] c0545v3Arr = this.f14818a;
        if (c0545v3Arr != null && c0545v3Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0545v3[] c0545v3Arr2 = this.f14818a;
                if (i5 >= c0545v3Arr2.length) {
                    break;
                }
                C0545v3 c0545v3 = c0545v3Arr2[i5];
                if (c0545v3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0545v3);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0570w3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C0545v3[] c0545v3Arr = this.f14818a;
                int length = c0545v3Arr == null ? 0 : c0545v3Arr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0545v3[] c0545v3Arr2 = new C0545v3[i5];
                if (length != 0) {
                    System.arraycopy(c0545v3Arr, 0, c0545v3Arr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0545v3 c0545v3 = new C0545v3();
                    c0545v3Arr2[length] = c0545v3;
                    codedInputByteBufferNano.readMessage(c0545v3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0545v3 c0545v32 = new C0545v3();
                c0545v3Arr2[length] = c0545v32;
                codedInputByteBufferNano.readMessage(c0545v32);
                this.f14818a = c0545v3Arr2;
            }
        }
        return this;
    }

    public static C0570w3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0570w3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0570w3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0570w3) MessageNano.mergeFrom(new C0570w3(), bArr);
    }
}
