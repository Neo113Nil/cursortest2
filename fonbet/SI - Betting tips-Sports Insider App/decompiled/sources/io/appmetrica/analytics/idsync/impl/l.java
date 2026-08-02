package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile l[] f11887c;

    /* renamed from: a, reason: collision with root package name */
    public long f11888a;

    /* renamed from: b, reason: collision with root package name */
    public k[] f11889b;

    public l() {
        a();
    }

    public static l[] b() {
        if (f11887c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11887c == null) {
                        f11887c = new l[0];
                    }
                } finally {
                }
            }
        }
        return f11887c;
    }

    public final l a() {
        this.f11888a = 10000L;
        this.f11889b = k.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f11888a;
        if (j != 10000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j);
        }
        k[] kVarArr = this.f11889b;
        if (kVarArr != null && kVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                k[] kVarArr2 = this.f11889b;
                if (i5 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i5];
                if (kVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, kVar) + computeSerializedSize;
                }
                i5++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f11888a;
        if (j != 10000) {
            codedOutputByteBufferNano.writeUInt64(1, j);
        }
        k[] kVarArr = this.f11889b;
        if (kVarArr != null && kVarArr.length > 0) {
            int i5 = 0;
            while (true) {
                k[] kVarArr2 = this.f11889b;
                if (i5 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i5];
                if (kVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, kVar);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f11888a = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                k[] kVarArr = this.f11889b;
                int length = kVarArr == null ? 0 : kVarArr.length;
                int i5 = repeatedFieldArrayLength + length;
                k[] kVarArr2 = new k[i5];
                if (length != 0) {
                    System.arraycopy(kVarArr, 0, kVarArr2, 0, length);
                }
                while (length < i5 - 1) {
                    k kVar = new k();
                    kVarArr2[length] = kVar;
                    codedInputByteBufferNano.readMessage(kVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                k kVar2 = new k();
                kVarArr2[length] = kVar2;
                codedInputByteBufferNano.readMessage(kVar2);
                this.f11889b = kVarArr2;
            }
        }
        return this;
    }

    public static l b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new l().mergeFrom(codedInputByteBufferNano);
    }

    public static l a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (l) MessageNano.mergeFrom(new l(), bArr);
    }
}
