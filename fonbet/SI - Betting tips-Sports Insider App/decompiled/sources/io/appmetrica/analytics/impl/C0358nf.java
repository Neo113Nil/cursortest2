package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358nf extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f14354c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14355d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14356e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14357f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0358nf[] f14358g;

    /* renamed from: a, reason: collision with root package name */
    public C0308lf f14359a;

    /* renamed from: b, reason: collision with root package name */
    public C0333mf[] f14360b;

    public C0358nf() {
        a();
    }

    public static C0358nf[] b() {
        if (f14358g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14358g == null) {
                        f14358g = new C0358nf[0];
                    }
                } finally {
                }
            }
        }
        return f14358g;
    }

    public final C0358nf a() {
        this.f14359a = null;
        this.f14360b = C0333mf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0308lf c0308lf = this.f14359a;
        if (c0308lf != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0308lf);
        }
        C0333mf[] c0333mfArr = this.f14360b;
        if (c0333mfArr != null && c0333mfArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0333mf[] c0333mfArr2 = this.f14360b;
                if (i5 >= c0333mfArr2.length) {
                    break;
                }
                C0333mf c0333mf = c0333mfArr2[i5];
                if (c0333mf != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0333mf) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0308lf c0308lf = this.f14359a;
        if (c0308lf != null) {
            codedOutputByteBufferNano.writeMessage(1, c0308lf);
        }
        C0333mf[] c0333mfArr = this.f14360b;
        if (c0333mfArr != null && c0333mfArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0333mf[] c0333mfArr2 = this.f14360b;
                if (i5 >= c0333mfArr2.length) {
                    break;
                }
                C0333mf c0333mf = c0333mfArr2[i5];
                if (c0333mf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0333mf);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0358nf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f14359a == null) {
                    this.f14359a = new C0308lf();
                }
                codedInputByteBufferNano.readMessage(this.f14359a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0333mf[] c0333mfArr = this.f14360b;
                int length = c0333mfArr == null ? 0 : c0333mfArr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0333mf[] c0333mfArr2 = new C0333mf[i5];
                if (length != 0) {
                    System.arraycopy(c0333mfArr, 0, c0333mfArr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0333mf c0333mf = new C0333mf();
                    c0333mfArr2[length] = c0333mf;
                    codedInputByteBufferNano.readMessage(c0333mf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0333mf c0333mf2 = new C0333mf();
                c0333mfArr2[length] = c0333mf2;
                codedInputByteBufferNano.readMessage(c0333mf2);
                this.f14360b = c0333mfArr2;
            }
        }
        return this;
    }

    public static C0358nf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0358nf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0358nf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0358nf) MessageNano.mergeFrom(new C0358nf(), bArr);
    }
}
