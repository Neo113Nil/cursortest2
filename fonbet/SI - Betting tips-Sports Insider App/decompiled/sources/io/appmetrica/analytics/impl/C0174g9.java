package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174g9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f13812d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13813e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13814f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13815g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f13816h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f13817i = 5;
    public static final int j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f13818k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f13819l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f13820m = 9;

    /* renamed from: n, reason: collision with root package name */
    public static final int f13821n = 10;

    /* renamed from: o, reason: collision with root package name */
    public static final int f13822o = 11;

    /* renamed from: p, reason: collision with root package name */
    public static final int f13823p = 12;
    public static volatile C0174g9[] q;

    /* renamed from: a, reason: collision with root package name */
    public long f13824a;

    /* renamed from: b, reason: collision with root package name */
    public C0148f9 f13825b;

    /* renamed from: c, reason: collision with root package name */
    public C0122e9[] f13826c;

    public C0174g9() {
        a();
    }

    public static C0174g9[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q == null) {
                        q = new C0174g9[0];
                    }
                } finally {
                }
            }
        }
        return q;
    }

    public final C0174g9 a() {
        this.f13824a = 0L;
        this.f13825b = null;
        this.f13826c = C0122e9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f13824a) + super.computeSerializedSize();
        C0148f9 c0148f9 = this.f13825b;
        if (c0148f9 != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c0148f9);
        }
        C0122e9[] c0122e9Arr = this.f13826c;
        if (c0122e9Arr != null && c0122e9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0122e9[] c0122e9Arr2 = this.f13826c;
                if (i5 >= c0122e9Arr2.length) {
                    break;
                }
                C0122e9 c0122e9 = c0122e9Arr2[i5];
                if (c0122e9 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c0122e9) + computeUInt64Size;
                }
                i5++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f13824a);
        C0148f9 c0148f9 = this.f13825b;
        if (c0148f9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0148f9);
        }
        C0122e9[] c0122e9Arr = this.f13826c;
        if (c0122e9Arr != null && c0122e9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0122e9[] c0122e9Arr2 = this.f13826c;
                if (i5 >= c0122e9Arr2.length) {
                    break;
                }
                C0122e9 c0122e9 = c0122e9Arr2[i5];
                if (c0122e9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0122e9);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0174g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f13824a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.f13825b == null) {
                    this.f13825b = new C0148f9();
                }
                codedInputByteBufferNano.readMessage(this.f13825b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0122e9[] c0122e9Arr = this.f13826c;
                int length = c0122e9Arr == null ? 0 : c0122e9Arr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0122e9[] c0122e9Arr2 = new C0122e9[i5];
                if (length != 0) {
                    System.arraycopy(c0122e9Arr, 0, c0122e9Arr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0122e9 c0122e9 = new C0122e9();
                    c0122e9Arr2[length] = c0122e9;
                    codedInputByteBufferNano.readMessage(c0122e9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0122e9 c0122e92 = new C0122e9();
                c0122e9Arr2[length] = c0122e92;
                codedInputByteBufferNano.readMessage(c0122e92);
                this.f13826c = c0122e9Arr2;
            }
        }
        return this;
    }

    public static C0174g9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0174g9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0174g9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0174g9) MessageNano.mergeFrom(new C0174g9(), bArr);
    }
}
