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
/* renamed from: io.appmetrica.analytics.impl.h8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199h8 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0199h8[] f13882f;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f13883a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f13884b;

    /* renamed from: c, reason: collision with root package name */
    public C0301l8 f13885c;

    /* renamed from: d, reason: collision with root package name */
    public C0225i8[] f13886d;

    /* renamed from: e, reason: collision with root package name */
    public int f13887e;

    public C0199h8() {
        a();
    }

    public static C0199h8[] b() {
        if (f13882f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13882f == null) {
                        f13882f = new C0199h8[0];
                    }
                } finally {
                }
            }
        }
        return f13882f;
    }

    public final C0199h8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f13883a = bArr;
        this.f13884b = bArr;
        this.f13885c = null;
        this.f13886d = C0225i8.b();
        this.f13887e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f13883a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f13883a);
        }
        if (!Arrays.equals(this.f13884b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f13884b);
        }
        C0301l8 c0301l8 = this.f13885c;
        if (c0301l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0301l8);
        }
        C0225i8[] c0225i8Arr = this.f13886d;
        if (c0225i8Arr != null && c0225i8Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0225i8[] c0225i8Arr2 = this.f13886d;
                if (i5 >= c0225i8Arr2.length) {
                    break;
                }
                C0225i8 c0225i8 = c0225i8Arr2[i5];
                if (c0225i8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c0225i8) + computeSerializedSize;
                }
                i5++;
            }
        }
        int i10 = this.f13887e;
        return i10 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(5, i10) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f13883a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f13883a);
        }
        if (!Arrays.equals(this.f13884b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f13884b);
        }
        C0301l8 c0301l8 = this.f13885c;
        if (c0301l8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0301l8);
        }
        C0225i8[] c0225i8Arr = this.f13886d;
        if (c0225i8Arr != null && c0225i8Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0225i8[] c0225i8Arr2 = this.f13886d;
                if (i5 >= c0225i8Arr2.length) {
                    break;
                }
                C0225i8 c0225i8 = c0225i8Arr2[i5];
                if (c0225i8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c0225i8);
                }
                i5++;
            }
        }
        int i10 = this.f13887e;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0199h8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0199h8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0199h8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13883a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f13884b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f13885c == null) {
                    this.f13885c = new C0301l8();
                }
                codedInputByteBufferNano.readMessage(this.f13885c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C0225i8[] c0225i8Arr = this.f13886d;
                int length = c0225i8Arr == null ? 0 : c0225i8Arr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0225i8[] c0225i8Arr2 = new C0225i8[i5];
                if (length != 0) {
                    System.arraycopy(c0225i8Arr, 0, c0225i8Arr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0225i8 c0225i8 = new C0225i8();
                    c0225i8Arr2[length] = c0225i8;
                    codedInputByteBufferNano.readMessage(c0225i8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0225i8 c0225i82 = new C0225i8();
                c0225i8Arr2[length] = c0225i82;
                codedInputByteBufferNano.readMessage(c0225i82);
                this.f13886d = c0225i8Arr2;
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13887e = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0199h8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0199h8) MessageNano.mergeFrom(new C0199h8(), bArr);
    }
}
