package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042b6 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0042b6[] f13395f;

    /* renamed from: a, reason: collision with root package name */
    public String f13396a;

    /* renamed from: b, reason: collision with root package name */
    public String f13397b;

    /* renamed from: c, reason: collision with root package name */
    public Z5[] f13398c;

    /* renamed from: d, reason: collision with root package name */
    public C0042b6 f13399d;

    /* renamed from: e, reason: collision with root package name */
    public C0042b6[] f13400e;

    public C0042b6() {
        a();
    }

    public static C0042b6[] b() {
        if (f13395f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13395f == null) {
                        f13395f = new C0042b6[0];
                    }
                } finally {
                }
            }
        }
        return f13395f;
    }

    public final C0042b6 a() {
        this.f13396a = "";
        this.f13397b = "";
        this.f13398c = Z5.b();
        this.f13399d = null;
        this.f13400e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f13396a) + super.computeSerializedSize();
        if (!this.f13397b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f13397b);
        }
        Z5[] z5Arr = this.f13398c;
        int i5 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i10 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f13398c;
                if (i10 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i10];
                if (z5 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, z5) + computeStringSize;
                }
                i10++;
            }
        }
        C0042b6 c0042b6 = this.f13399d;
        if (c0042b6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c0042b6);
        }
        C0042b6[] c0042b6Arr = this.f13400e;
        if (c0042b6Arr != null && c0042b6Arr.length > 0) {
            while (true) {
                C0042b6[] c0042b6Arr2 = this.f13400e;
                if (i5 >= c0042b6Arr2.length) {
                    break;
                }
                C0042b6 c0042b62 = c0042b6Arr2[i5];
                if (c0042b62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c0042b62) + computeStringSize;
                }
                i5++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f13396a);
        if (!this.f13397b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f13397b);
        }
        Z5[] z5Arr = this.f13398c;
        int i5 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i10 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f13398c;
                if (i10 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i10];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(3, z5);
                }
                i10++;
            }
        }
        C0042b6 c0042b6 = this.f13399d;
        if (c0042b6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0042b6);
        }
        C0042b6[] c0042b6Arr = this.f13400e;
        if (c0042b6Arr != null && c0042b6Arr.length > 0) {
            while (true) {
                C0042b6[] c0042b6Arr2 = this.f13400e;
                if (i5 >= c0042b6Arr2.length) {
                    break;
                }
                C0042b6 c0042b62 = c0042b6Arr2[i5];
                if (c0042b62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0042b62);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0042b6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0042b6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0042b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13396a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f13397b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                Z5[] z5Arr = this.f13398c;
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
                this.f13398c = z5Arr2;
            } else if (readTag == 34) {
                if (this.f13399d == null) {
                    this.f13399d = new C0042b6();
                }
                codedInputByteBufferNano.readMessage(this.f13399d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C0042b6[] c0042b6Arr = this.f13400e;
                int length2 = c0042b6Arr == null ? 0 : c0042b6Arr.length;
                int i10 = repeatedFieldArrayLength2 + length2;
                C0042b6[] c0042b6Arr2 = new C0042b6[i10];
                if (length2 != 0) {
                    System.arraycopy(c0042b6Arr, 0, c0042b6Arr2, 0, length2);
                }
                while (length2 < i10 - 1) {
                    C0042b6 c0042b6 = new C0042b6();
                    c0042b6Arr2[length2] = c0042b6;
                    codedInputByteBufferNano.readMessage(c0042b6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0042b6 c0042b62 = new C0042b6();
                c0042b6Arr2[length2] = c0042b62;
                codedInputByteBufferNano.readMessage(c0042b62);
                this.f13400e = c0042b6Arr2;
            }
        }
        return this;
    }

    public static C0042b6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0042b6) MessageNano.mergeFrom(new C0042b6(), bArr);
    }
}
