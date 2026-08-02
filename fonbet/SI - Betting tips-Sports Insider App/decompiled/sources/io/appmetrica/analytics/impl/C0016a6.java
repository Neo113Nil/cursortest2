package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016a6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0016a6[] f13341g;

    /* renamed from: a, reason: collision with root package name */
    public String f13342a;

    /* renamed from: b, reason: collision with root package name */
    public int f13343b;

    /* renamed from: c, reason: collision with root package name */
    public long f13344c;

    /* renamed from: d, reason: collision with root package name */
    public String f13345d;

    /* renamed from: e, reason: collision with root package name */
    public int f13346e;

    /* renamed from: f, reason: collision with root package name */
    public Z5[] f13347f;

    public C0016a6() {
        a();
    }

    public static C0016a6[] b() {
        if (f13341g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13341g == null) {
                        f13341g = new C0016a6[0];
                    }
                } finally {
                }
            }
        }
        return f13341g;
    }

    public final C0016a6 a() {
        this.f13342a = "";
        this.f13343b = 0;
        this.f13344c = 0L;
        this.f13345d = "";
        this.f13346e = 0;
        this.f13347f = Z5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f13344c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f13343b) + CodedOutputByteBufferNano.computeStringSize(1, this.f13342a) + super.computeSerializedSize();
        if (!this.f13345d.equals("")) {
            computeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f13345d);
        }
        int i5 = this.f13346e;
        if (i5 != 0) {
            computeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i5);
        }
        Z5[] z5Arr = this.f13347f;
        if (z5Arr != null && z5Arr.length > 0) {
            int i10 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f13347f;
                if (i10 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i10];
                if (z5 != null) {
                    computeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, z5) + computeSInt64Size;
                }
                i10++;
            }
        }
        return computeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f13342a);
        codedOutputByteBufferNano.writeSInt32(2, this.f13343b);
        codedOutputByteBufferNano.writeSInt64(3, this.f13344c);
        if (!this.f13345d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f13345d);
        }
        int i5 = this.f13346e;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i5);
        }
        Z5[] z5Arr = this.f13347f;
        if (z5Arr != null && z5Arr.length > 0) {
            int i10 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f13347f;
                if (i10 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i10];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(6, z5);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0016a6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0016a6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0016a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13342a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f13343b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f13344c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f13345d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f13346e = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                Z5[] z5Arr = this.f13347f;
                int length = z5Arr == null ? 0 : z5Arr.length;
                int i5 = repeatedFieldArrayLength + length;
                Z5[] z5Arr2 = new Z5[i5];
                if (length != 0) {
                    System.arraycopy(z5Arr, 0, z5Arr2, 0, length);
                }
                while (length < i5 - 1) {
                    Z5 z5 = new Z5();
                    z5Arr2[length] = z5;
                    codedInputByteBufferNano.readMessage(z5);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Z5 z52 = new Z5();
                z5Arr2[length] = z52;
                codedInputByteBufferNano.readMessage(z52);
                this.f13347f = z5Arr2;
            }
        }
        return this;
    }

    public static C0016a6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0016a6) MessageNano.mergeFrom(new C0016a6(), bArr);
    }
}
