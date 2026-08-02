package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520u3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0520u3[] f14695c;

    /* renamed from: a, reason: collision with root package name */
    public C0570w3 f14696a;

    /* renamed from: b, reason: collision with root package name */
    public int f14697b;

    public C0520u3() {
        a();
    }

    public static C0520u3[] b() {
        if (f14695c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14695c == null) {
                        f14695c = new C0520u3[0];
                    }
                } finally {
                }
            }
        }
        return f14695c;
    }

    public final C0520u3 a() {
        this.f14696a = null;
        this.f14697b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0570w3 c0570w3 = this.f14696a;
        if (c0570w3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0570w3);
        }
        int i5 = this.f14697b;
        return i5 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0570w3 c0570w3 = this.f14696a;
        if (c0570w3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0570w3);
        }
        int i5 = this.f14697b;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0520u3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f14696a == null) {
                    this.f14696a = new C0570w3();
                }
                codedInputByteBufferNano.readMessage(this.f14696a);
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f14697b = readInt32;
                }
            }
        }
        return this;
    }

    public static C0520u3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0520u3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0520u3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0520u3) MessageNano.mergeFrom(new C0520u3(), bArr);
    }
}
