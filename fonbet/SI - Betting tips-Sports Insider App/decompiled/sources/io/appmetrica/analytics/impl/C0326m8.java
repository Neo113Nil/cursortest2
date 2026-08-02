package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326m8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0326m8[] f14250c;

    /* renamed from: a, reason: collision with root package name */
    public C0070c8 f14251a;

    /* renamed from: b, reason: collision with root package name */
    public C0070c8[] f14252b;

    public C0326m8() {
        a();
    }

    public static C0326m8[] b() {
        if (f14250c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14250c == null) {
                        f14250c = new C0326m8[0];
                    }
                } finally {
                }
            }
        }
        return f14250c;
    }

    public final C0326m8 a() {
        this.f14251a = null;
        this.f14252b = C0070c8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0070c8 c0070c8 = this.f14251a;
        if (c0070c8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0070c8);
        }
        C0070c8[] c0070c8Arr = this.f14252b;
        if (c0070c8Arr != null && c0070c8Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0070c8[] c0070c8Arr2 = this.f14252b;
                if (i5 >= c0070c8Arr2.length) {
                    break;
                }
                C0070c8 c0070c82 = c0070c8Arr2[i5];
                if (c0070c82 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0070c82) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0070c8 c0070c8 = this.f14251a;
        if (c0070c8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0070c8);
        }
        C0070c8[] c0070c8Arr = this.f14252b;
        if (c0070c8Arr != null && c0070c8Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0070c8[] c0070c8Arr2 = this.f14252b;
                if (i5 >= c0070c8Arr2.length) {
                    break;
                }
                C0070c8 c0070c82 = c0070c8Arr2[i5];
                if (c0070c82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0070c82);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0326m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f14251a == null) {
                    this.f14251a = new C0070c8();
                }
                codedInputByteBufferNano.readMessage(this.f14251a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0070c8[] c0070c8Arr = this.f14252b;
                int length = c0070c8Arr == null ? 0 : c0070c8Arr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0070c8[] c0070c8Arr2 = new C0070c8[i5];
                if (length != 0) {
                    System.arraycopy(c0070c8Arr, 0, c0070c8Arr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0070c8 c0070c8 = new C0070c8();
                    c0070c8Arr2[length] = c0070c8;
                    codedInputByteBufferNano.readMessage(c0070c8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0070c8 c0070c82 = new C0070c8();
                c0070c8Arr2[length] = c0070c82;
                codedInputByteBufferNano.readMessage(c0070c82);
                this.f14252b = c0070c8Arr2;
            }
        }
        return this;
    }

    public static C0326m8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0326m8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0326m8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0326m8) MessageNano.mergeFrom(new C0326m8(), bArr);
    }
}
