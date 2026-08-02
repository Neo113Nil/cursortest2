package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f11419c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11420d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11421e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static volatile d[] f11422f;

    /* renamed from: a, reason: collision with root package name */
    public c[] f11423a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11424b;

    public d() {
        a();
    }

    public static d[] b() {
        if (f11422f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11422f == null) {
                        f11422f = new d[0];
                    }
                } finally {
                }
            }
        }
        return f11422f;
    }

    public final d a() {
        this.f11423a = c.b();
        this.f11424b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        c[] cVarArr = this.f11423a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                c[] cVarArr2 = this.f11423a;
                if (i5 >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i5];
                if (cVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, cVar) + computeSerializedSize;
                }
                i5++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f11424b) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        c[] cVarArr = this.f11423a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                c[] cVarArr2 = this.f11423a;
                if (i5 >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i5];
                if (cVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, cVar);
                }
                i5++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f11424b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                c[] cVarArr = this.f11423a;
                int length = cVarArr == null ? 0 : cVarArr.length;
                int i5 = repeatedFieldArrayLength + length;
                c[] cVarArr2 = new c[i5];
                if (length != 0) {
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                }
                while (length < i5 - 1) {
                    c cVar = new c();
                    cVarArr2[length] = cVar;
                    codedInputByteBufferNano.readMessage(cVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                c cVar2 = new c();
                cVarArr2[length] = cVar2;
                codedInputByteBufferNano.readMessage(cVar2);
                this.f11423a = cVarArr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11424b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static d b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new d().mergeFrom(codedInputByteBufferNano);
    }

    public static d a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (d) MessageNano.mergeFrom(new d(), bArr);
    }
}
