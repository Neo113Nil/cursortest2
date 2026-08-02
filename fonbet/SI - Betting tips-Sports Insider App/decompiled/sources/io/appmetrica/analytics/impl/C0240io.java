package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240io extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0240io[] f13984b;

    /* renamed from: a, reason: collision with root package name */
    public C0163fo[] f13985a;

    public C0240io() {
        a();
    }

    public static C0240io[] b() {
        if (f13984b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13984b == null) {
                        f13984b = new C0240io[0];
                    }
                } finally {
                }
            }
        }
        return f13984b;
    }

    public final C0240io a() {
        this.f13985a = C0163fo.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0163fo[] c0163foArr = this.f13985a;
        if (c0163foArr != null && c0163foArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0163fo[] c0163foArr2 = this.f13985a;
                if (i5 >= c0163foArr2.length) {
                    break;
                }
                C0163fo c0163fo = c0163foArr2[i5];
                if (c0163fo != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0163fo) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0163fo[] c0163foArr = this.f13985a;
        if (c0163foArr != null && c0163foArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0163fo[] c0163foArr2 = this.f13985a;
                if (i5 >= c0163foArr2.length) {
                    break;
                }
                C0163fo c0163fo = c0163foArr2[i5];
                if (c0163fo != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0163fo);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0240io mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C0163fo[] c0163foArr = this.f13985a;
                int length = c0163foArr == null ? 0 : c0163foArr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0163fo[] c0163foArr2 = new C0163fo[i5];
                if (length != 0) {
                    System.arraycopy(c0163foArr, 0, c0163foArr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0163fo c0163fo = new C0163fo();
                    c0163foArr2[length] = c0163fo;
                    codedInputByteBufferNano.readMessage(c0163fo);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0163fo c0163fo2 = new C0163fo();
                c0163foArr2[length] = c0163fo2;
                codedInputByteBufferNano.readMessage(c0163fo2);
                this.f13985a = c0163foArr2;
            }
        }
        return this;
    }

    public static C0240io b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0240io().mergeFrom(codedInputByteBufferNano);
    }

    public static C0240io a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0240io) MessageNano.mergeFrom(new C0240io(), bArr);
    }
}
