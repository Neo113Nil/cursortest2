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
/* renamed from: io.appmetrica.analytics.impl.n8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351n8 extends MessageNano {

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0351n8[] f14311h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14312a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f14313b;

    /* renamed from: c, reason: collision with root package name */
    public C0147f8 f14314c;

    /* renamed from: d, reason: collision with root package name */
    public C0301l8 f14315d;

    /* renamed from: e, reason: collision with root package name */
    public C0326m8 f14316e;

    /* renamed from: f, reason: collision with root package name */
    public C0326m8 f14317f;

    /* renamed from: g, reason: collision with root package name */
    public C0376o8[] f14318g;

    public C0351n8() {
        a();
    }

    public static C0351n8[] b() {
        if (f14311h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14311h == null) {
                        f14311h = new C0351n8[0];
                    }
                } finally {
                }
            }
        }
        return f14311h;
    }

    public final C0351n8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f14312a = bArr;
        this.f14313b = bArr;
        this.f14314c = null;
        this.f14315d = null;
        this.f14316e = null;
        this.f14317f = null;
        this.f14318g = C0376o8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f14312a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f14312a);
        }
        if (!Arrays.equals(this.f14313b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f14313b);
        }
        C0147f8 c0147f8 = this.f14314c;
        if (c0147f8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0147f8);
        }
        C0301l8 c0301l8 = this.f14315d;
        if (c0301l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0301l8);
        }
        C0326m8 c0326m8 = this.f14316e;
        if (c0326m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0326m8);
        }
        C0326m8 c0326m82 = this.f14317f;
        if (c0326m82 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c0326m82);
        }
        C0376o8[] c0376o8Arr = this.f14318g;
        if (c0376o8Arr != null && c0376o8Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0376o8[] c0376o8Arr2 = this.f14318g;
                if (i5 >= c0376o8Arr2.length) {
                    break;
                }
                C0376o8 c0376o8 = c0376o8Arr2[i5];
                if (c0376o8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0376o8) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f14312a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f14312a);
        }
        if (!Arrays.equals(this.f14313b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f14313b);
        }
        C0147f8 c0147f8 = this.f14314c;
        if (c0147f8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0147f8);
        }
        C0301l8 c0301l8 = this.f14315d;
        if (c0301l8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0301l8);
        }
        C0326m8 c0326m8 = this.f14316e;
        if (c0326m8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0326m8);
        }
        C0326m8 c0326m82 = this.f14317f;
        if (c0326m82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0326m82);
        }
        C0376o8[] c0376o8Arr = this.f14318g;
        if (c0376o8Arr != null && c0376o8Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0376o8[] c0376o8Arr2 = this.f14318g;
                if (i5 >= c0376o8Arr2.length) {
                    break;
                }
                C0376o8 c0376o8 = c0376o8Arr2[i5];
                if (c0376o8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0376o8);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0351n8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0351n8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0351n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f14312a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f14313b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f14314c == null) {
                    this.f14314c = new C0147f8();
                }
                codedInputByteBufferNano.readMessage(this.f14314c);
            } else if (readTag == 34) {
                if (this.f14315d == null) {
                    this.f14315d = new C0301l8();
                }
                codedInputByteBufferNano.readMessage(this.f14315d);
            } else if (readTag == 42) {
                if (this.f14316e == null) {
                    this.f14316e = new C0326m8();
                }
                codedInputByteBufferNano.readMessage(this.f14316e);
            } else if (readTag == 50) {
                if (this.f14317f == null) {
                    this.f14317f = new C0326m8();
                }
                codedInputByteBufferNano.readMessage(this.f14317f);
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0376o8[] c0376o8Arr = this.f14318g;
                int length = c0376o8Arr == null ? 0 : c0376o8Arr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0376o8[] c0376o8Arr2 = new C0376o8[i5];
                if (length != 0) {
                    System.arraycopy(c0376o8Arr, 0, c0376o8Arr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0376o8 c0376o8 = new C0376o8();
                    c0376o8Arr2[length] = c0376o8;
                    codedInputByteBufferNano.readMessage(c0376o8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0376o8 c0376o82 = new C0376o8();
                c0376o8Arr2[length] = c0376o82;
                codedInputByteBufferNano.readMessage(c0376o82);
                this.f14318g = c0376o8Arr2;
            }
        }
        return this;
    }

    public static C0351n8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0351n8) MessageNano.mergeFrom(new C0351n8(), bArr);
    }
}
