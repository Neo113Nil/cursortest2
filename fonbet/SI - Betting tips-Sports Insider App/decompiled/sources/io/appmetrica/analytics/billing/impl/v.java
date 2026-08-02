package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile v[] f11450e;

    /* renamed from: a, reason: collision with root package name */
    public long f11451a;

    /* renamed from: b, reason: collision with root package name */
    public w f11452b;

    /* renamed from: c, reason: collision with root package name */
    public int f11453c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f11454d;

    public v() {
        a();
    }

    public static v[] b() {
        if (f11450e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11450e == null) {
                        f11450e = new v[0];
                    }
                } finally {
                }
            }
        }
        return f11450e;
    }

    public final v a() {
        this.f11451a = 0L;
        this.f11452b = null;
        this.f11453c = 0;
        this.f11454d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f11451a;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        w wVar = this.f11452b;
        if (wVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        int i5 = this.f11453c;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i5);
        }
        return !Arrays.equals(this.f11454d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f11454d) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f11451a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        w wVar = this.f11452b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        int i5 = this.f11453c;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i5);
        }
        if (!Arrays.equals(this.f11454d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f11454d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f11451a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f11452b == null) {
                    this.f11452b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f11452b);
            } else if (readTag == 24) {
                this.f11453c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11454d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static v b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new v().mergeFrom(codedInputByteBufferNano);
    }

    public static v a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (v) MessageNano.mergeFrom(new v(), bArr);
    }
}
