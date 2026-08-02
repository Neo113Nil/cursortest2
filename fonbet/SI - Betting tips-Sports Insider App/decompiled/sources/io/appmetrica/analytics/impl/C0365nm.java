package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365nm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0365nm[] f14372b;

    /* renamed from: a, reason: collision with root package name */
    public C0340mm[] f14373a;

    public C0365nm() {
        a();
    }

    public static C0365nm[] b() {
        if (f14372b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14372b == null) {
                        f14372b = new C0365nm[0];
                    }
                } finally {
                }
            }
        }
        return f14372b;
    }

    public final C0365nm a() {
        this.f14373a = C0340mm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0340mm[] c0340mmArr = this.f14373a;
        if (c0340mmArr != null && c0340mmArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0340mm[] c0340mmArr2 = this.f14373a;
                if (i5 >= c0340mmArr2.length) {
                    break;
                }
                C0340mm c0340mm = c0340mmArr2[i5];
                if (c0340mm != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0340mm) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0340mm[] c0340mmArr = this.f14373a;
        if (c0340mmArr != null && c0340mmArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0340mm[] c0340mmArr2 = this.f14373a;
                if (i5 >= c0340mmArr2.length) {
                    break;
                }
                C0340mm c0340mm = c0340mmArr2[i5];
                if (c0340mm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0340mm);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0365nm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C0340mm[] c0340mmArr = this.f14373a;
                int length = c0340mmArr == null ? 0 : c0340mmArr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0340mm[] c0340mmArr2 = new C0340mm[i5];
                if (length != 0) {
                    System.arraycopy(c0340mmArr, 0, c0340mmArr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0340mm c0340mm = new C0340mm();
                    c0340mmArr2[length] = c0340mm;
                    codedInputByteBufferNano.readMessage(c0340mm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0340mm c0340mm2 = new C0340mm();
                c0340mmArr2[length] = c0340mm2;
                codedInputByteBufferNano.readMessage(c0340mm2);
                this.f14373a = c0340mmArr2;
            }
        }
        return this;
    }

    public static C0365nm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0365nm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0365nm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0365nm) MessageNano.mergeFrom(new C0365nm(), bArr);
    }
}
