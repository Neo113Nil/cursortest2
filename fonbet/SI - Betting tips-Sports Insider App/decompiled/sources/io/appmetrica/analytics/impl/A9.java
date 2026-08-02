package io.appmetrica.analytics.impl;

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
public final class A9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f11975c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11976d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11977e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11978f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11979g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11980h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11981i = 6;
    public static volatile A9[] j;

    /* renamed from: a, reason: collision with root package name */
    public int f11982a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f11983b;

    public A9() {
        a();
    }

    public static A9[] b() {
        if (j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (j == null) {
                        j = new A9[0];
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public final A9 a() {
        this.f11982a = 0;
        this.f11983b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f11982a;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i5);
        }
        return !Arrays.equals(this.f11983b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f11983b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f11982a;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i5);
        }
        if (!Arrays.equals(this.f11983b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f11983b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f11982a = readInt32;
                            break;
                    }
                } else if (readTag != 18) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    this.f11983b = codedInputByteBufferNano.readBytes();
                }
            }
        }
        return this;
    }

    public static A9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A9().mergeFrom(codedInputByteBufferNano);
    }

    public static A9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (A9) MessageNano.mergeFrom(new A9(), bArr);
    }
}
