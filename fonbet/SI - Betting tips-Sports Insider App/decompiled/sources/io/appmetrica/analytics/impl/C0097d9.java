package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097d9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0097d9[] f13583c;

    /* renamed from: a, reason: collision with root package name */
    public int f13584a;

    /* renamed from: b, reason: collision with root package name */
    public String f13585b;

    public C0097d9() {
        a();
    }

    public static C0097d9[] b() {
        if (f13583c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13583c == null) {
                        f13583c = new C0097d9[0];
                    }
                } finally {
                }
            }
        }
        return f13583c;
    }

    public final C0097d9 a() {
        this.f13584a = 2;
        this.f13585b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f13584a;
        if (i5 != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i5);
        }
        return !this.f13585b.equals("") ? CodedOutputByteBufferNano.computeStringSize(4, this.f13585b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f13584a;
        if (i5 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i5);
        }
        if (!this.f13585b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f13585b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0097d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 24) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            this.f13584a = readInt32;
                            break;
                    }
                } else if (readTag != 34) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    this.f13585b = codedInputByteBufferNano.readString();
                }
            }
        }
        return this;
    }

    public static C0097d9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0097d9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0097d9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0097d9) MessageNano.mergeFrom(new C0097d9(), bArr);
    }
}
