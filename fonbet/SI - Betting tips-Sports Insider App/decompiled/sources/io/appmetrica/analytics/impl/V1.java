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
public final class V1 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f12999c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13000d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13001e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13002f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13003g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f13004h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f13005i = 6;
    public static final int j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f13006k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f13007l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile V1[] f13008m;

    /* renamed from: a, reason: collision with root package name */
    public int f13009a;

    /* renamed from: b, reason: collision with root package name */
    public int f13010b;

    public V1() {
        a();
    }

    public static V1[] b() {
        if (f13008m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13008m == null) {
                        f13008m = new V1[0];
                    }
                } finally {
                }
            }
        }
        return f13008m;
    }

    public final V1 a() {
        this.f13009a = 0;
        this.f13010b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f13010b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f13009a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f13009a);
        codedOutputByteBufferNano.writeInt32(3, this.f13010b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 16) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f13009a = readInt32;
                            break;
                    }
                } else if (readTag != 24) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                        this.f13010b = readInt322;
                    }
                }
            }
        }
        return this;
    }

    public static V1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new V1().mergeFrom(codedInputByteBufferNano);
    }

    public static V1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (V1) MessageNano.mergeFrom(new V1(), bArr);
    }
}
