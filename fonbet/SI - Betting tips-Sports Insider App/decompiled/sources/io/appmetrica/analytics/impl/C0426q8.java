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
/* renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426q8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0426q8[] f14504e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14505a;

    /* renamed from: b, reason: collision with root package name */
    public C0147f8 f14506b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f14507c;

    /* renamed from: d, reason: collision with root package name */
    public C0301l8 f14508d;

    public C0426q8() {
        a();
    }

    public static C0426q8[] b() {
        if (f14504e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14504e == null) {
                        f14504e = new C0426q8[0];
                    }
                } finally {
                }
            }
        }
        return f14504e;
    }

    public final C0426q8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f14505a = bArr;
        this.f14506b = null;
        this.f14507c = bArr;
        this.f14508d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f14505a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f14505a);
        }
        C0147f8 c0147f8 = this.f14506b;
        if (c0147f8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0147f8);
        }
        if (!Arrays.equals(this.f14507c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f14507c);
        }
        C0301l8 c0301l8 = this.f14508d;
        return c0301l8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0301l8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f14505a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f14505a);
        }
        C0147f8 c0147f8 = this.f14506b;
        if (c0147f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0147f8);
        }
        if (!Arrays.equals(this.f14507c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f14507c);
        }
        C0301l8 c0301l8 = this.f14508d;
        if (c0301l8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0301l8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0426q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f14505a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f14506b == null) {
                    this.f14506b = new C0147f8();
                }
                codedInputByteBufferNano.readMessage(this.f14506b);
            } else if (readTag == 26) {
                this.f14507c = codedInputByteBufferNano.readBytes();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f14508d == null) {
                    this.f14508d = new C0301l8();
                }
                codedInputByteBufferNano.readMessage(this.f14508d);
            }
        }
        return this;
    }

    public static C0426q8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0426q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0426q8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0426q8) MessageNano.mergeFrom(new C0426q8(), bArr);
    }
}
