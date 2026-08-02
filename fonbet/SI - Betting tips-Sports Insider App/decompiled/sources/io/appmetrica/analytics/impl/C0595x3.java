package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595x3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f14887c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14888d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14889e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14890f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0595x3[] f14891g;

    /* renamed from: a, reason: collision with root package name */
    public C0520u3 f14892a;

    /* renamed from: b, reason: collision with root package name */
    public C0520u3[] f14893b;

    public C0595x3() {
        a();
    }

    public static C0595x3[] b() {
        if (f14891g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14891g == null) {
                        f14891g = new C0595x3[0];
                    }
                } finally {
                }
            }
        }
        return f14891g;
    }

    public final C0595x3 a() {
        this.f14892a = null;
        this.f14893b = C0520u3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0520u3 c0520u3 = this.f14892a;
        if (c0520u3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0520u3);
        }
        C0520u3[] c0520u3Arr = this.f14893b;
        if (c0520u3Arr != null && c0520u3Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0520u3[] c0520u3Arr2 = this.f14893b;
                if (i5 >= c0520u3Arr2.length) {
                    break;
                }
                C0520u3 c0520u32 = c0520u3Arr2[i5];
                if (c0520u32 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0520u32) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0520u3 c0520u3 = this.f14892a;
        if (c0520u3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0520u3);
        }
        C0520u3[] c0520u3Arr = this.f14893b;
        if (c0520u3Arr != null && c0520u3Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0520u3[] c0520u3Arr2 = this.f14893b;
                if (i5 >= c0520u3Arr2.length) {
                    break;
                }
                C0520u3 c0520u32 = c0520u3Arr2[i5];
                if (c0520u32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0520u32);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0595x3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f14892a == null) {
                    this.f14892a = new C0520u3();
                }
                codedInputByteBufferNano.readMessage(this.f14892a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0520u3[] c0520u3Arr = this.f14893b;
                int length = c0520u3Arr == null ? 0 : c0520u3Arr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0520u3[] c0520u3Arr2 = new C0520u3[i5];
                if (length != 0) {
                    System.arraycopy(c0520u3Arr, 0, c0520u3Arr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0520u3 c0520u3 = new C0520u3();
                    c0520u3Arr2[length] = c0520u3;
                    codedInputByteBufferNano.readMessage(c0520u3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0520u3 c0520u32 = new C0520u3();
                c0520u3Arr2[length] = c0520u32;
                codedInputByteBufferNano.readMessage(c0520u32);
                this.f14893b = c0520u3Arr2;
            }
        }
        return this;
    }

    public static C0595x3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0595x3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0595x3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0595x3) MessageNano.mergeFrom(new C0595x3(), bArr);
    }
}
