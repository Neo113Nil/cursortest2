package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045b9 extends MessageNano {

    /* renamed from: n, reason: collision with root package name */
    public static volatile C0045b9[] f13403n;

    /* renamed from: a, reason: collision with root package name */
    public String f13404a;

    /* renamed from: b, reason: collision with root package name */
    public String f13405b;

    /* renamed from: c, reason: collision with root package name */
    public String f13406c;

    /* renamed from: d, reason: collision with root package name */
    public int f13407d;

    /* renamed from: e, reason: collision with root package name */
    public String f13408e;

    /* renamed from: f, reason: collision with root package name */
    public String f13409f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13410g;

    /* renamed from: h, reason: collision with root package name */
    public int f13411h;

    /* renamed from: i, reason: collision with root package name */
    public String f13412i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public int f13413k;

    /* renamed from: l, reason: collision with root package name */
    public C0019a9[] f13414l;

    /* renamed from: m, reason: collision with root package name */
    public String f13415m;

    public C0045b9() {
        a();
    }

    public static C0045b9[] b() {
        if (f13403n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13403n == null) {
                        f13403n = new C0045b9[0];
                    }
                } finally {
                }
            }
        }
        return f13403n;
    }

    public final C0045b9 a() {
        this.f13404a = "";
        this.f13405b = "";
        this.f13406c = "";
        this.f13407d = 0;
        this.f13408e = "";
        this.f13409f = "";
        this.f13410g = false;
        this.f13411h = 0;
        this.f13412i = "";
        this.j = "";
        this.f13413k = 0;
        this.f13414l = C0019a9.b();
        this.f13415m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f13404a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f13404a);
        }
        if (!this.f13405b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f13405b);
        }
        if (!this.f13406c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f13406c);
        }
        int i5 = this.f13407d;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i5);
        }
        if (!this.f13408e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f13408e);
        }
        if (!this.f13409f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f13409f);
        }
        boolean z5 = this.f13410g;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z5);
        }
        int i10 = this.f13411h;
        if (i10 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i10);
        }
        if (!this.f13412i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f13412i);
        }
        if (!this.j.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.j);
        }
        int i11 = this.f13413k;
        if (i11 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i11);
        }
        C0019a9[] c0019a9Arr = this.f13414l;
        if (c0019a9Arr != null && c0019a9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C0019a9[] c0019a9Arr2 = this.f13414l;
                if (i12 >= c0019a9Arr2.length) {
                    break;
                }
                C0019a9 c0019a9 = c0019a9Arr2[i12];
                if (c0019a9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c0019a9) + computeSerializedSize;
                }
                i12++;
            }
        }
        return !this.f13415m.equals("") ? CodedOutputByteBufferNano.computeStringSize(24, this.f13415m) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f13404a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f13404a);
        }
        if (!this.f13405b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f13405b);
        }
        if (!this.f13406c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f13406c);
        }
        int i5 = this.f13407d;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i5);
        }
        if (!this.f13408e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f13408e);
        }
        if (!this.f13409f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f13409f);
        }
        boolean z5 = this.f13410g;
        if (z5) {
            codedOutputByteBufferNano.writeBool(17, z5);
        }
        int i10 = this.f13411h;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i10);
        }
        if (!this.f13412i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f13412i);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.j);
        }
        int i11 = this.f13413k;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i11);
        }
        C0019a9[] c0019a9Arr = this.f13414l;
        if (c0019a9Arr != null && c0019a9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C0019a9[] c0019a9Arr2 = this.f13414l;
                if (i12 >= c0019a9Arr2.length) {
                    break;
                }
                C0019a9 c0019a9 = c0019a9Arr2[i12];
                if (c0019a9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c0019a9);
                }
                i12++;
            }
        }
        if (!this.f13415m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f13415m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0045b9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0045b9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0045b9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f13404a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f13405b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f13406c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.f13407d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f13408e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f13409f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f13410g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f13411h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f13412i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f13413k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C0019a9[] c0019a9Arr = this.f13414l;
                    int length = c0019a9Arr == null ? 0 : c0019a9Arr.length;
                    int i5 = repeatedFieldArrayLength + length;
                    C0019a9[] c0019a9Arr2 = new C0019a9[i5];
                    if (length != 0) {
                        System.arraycopy(c0019a9Arr, 0, c0019a9Arr2, 0, length);
                    }
                    while (length < i5 - 1) {
                        C0019a9 c0019a9 = new C0019a9();
                        c0019a9Arr2[length] = c0019a9;
                        codedInputByteBufferNano.readMessage(c0019a9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0019a9 c0019a92 = new C0019a9();
                    c0019a9Arr2[length] = c0019a92;
                    codedInputByteBufferNano.readMessage(c0019a92);
                    this.f13414l = c0019a9Arr2;
                    break;
                case 194:
                    this.f13415m = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static C0045b9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0045b9) MessageNano.mergeFrom(new C0045b9(), bArr);
    }
}
