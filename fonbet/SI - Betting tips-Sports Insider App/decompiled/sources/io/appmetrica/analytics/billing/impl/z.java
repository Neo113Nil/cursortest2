package io.appmetrica.analytics.billing.impl;

import com.appsflyer.attribution.RequestError;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0122e9;
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
public final class z extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f11476l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f11477m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f11478n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f11479o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f11480p = 2;
    public static volatile z[] q;

    /* renamed from: a, reason: collision with root package name */
    public int f11481a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f11482b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f11483c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f11484d;

    /* renamed from: e, reason: collision with root package name */
    public u f11485e;

    /* renamed from: f, reason: collision with root package name */
    public long f11486f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11487g;

    /* renamed from: h, reason: collision with root package name */
    public int f11488h;

    /* renamed from: i, reason: collision with root package name */
    public int f11489i;
    public y j;

    /* renamed from: k, reason: collision with root package name */
    public x f11490k;

    public z() {
        a();
    }

    public static z[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q == null) {
                        q = new z[0];
                    }
                } finally {
                }
            }
        }
        return q;
    }

    public final z a() {
        this.f11481a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f11482b = bArr;
        this.f11483c = bArr;
        this.f11484d = bArr;
        this.f11485e = null;
        this.f11486f = 0L;
        this.f11487g = false;
        this.f11488h = 0;
        this.f11489i = 1;
        this.j = null;
        this.f11490k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f11481a;
        if (i5 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i5);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f11482b) + computeSerializedSize;
        byte[] bArr = this.f11483c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f11483c);
        }
        if (!Arrays.equals(this.f11484d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f11484d);
        }
        u uVar = this.f11485e;
        if (uVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, uVar);
        }
        long j = this.f11486f;
        if (j != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j);
        }
        boolean z5 = this.f11487g;
        if (z5) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z5);
        }
        int i10 = this.f11488h;
        if (i10 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i10);
        }
        int i11 = this.f11489i;
        if (i11 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i11);
        }
        y yVar = this.j;
        if (yVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yVar);
        }
        x xVar = this.f11490k;
        return xVar != null ? CodedOutputByteBufferNano.computeMessageSize(12, xVar) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f11481a;
        if (i5 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i5);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f11482b);
        byte[] bArr = this.f11483c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f11483c);
        }
        if (!Arrays.equals(this.f11484d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f11484d);
        }
        u uVar = this.f11485e;
        if (uVar != null) {
            codedOutputByteBufferNano.writeMessage(6, uVar);
        }
        long j = this.f11486f;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(7, j);
        }
        boolean z5 = this.f11487g;
        if (z5) {
            codedOutputByteBufferNano.writeBool(8, z5);
        }
        int i10 = this.f11488h;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i10);
        }
        int i11 = this.f11489i;
        if (i11 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i11);
        }
        y yVar = this.j;
        if (yVar != null) {
            codedOutputByteBufferNano.writeMessage(11, yVar);
        }
        x xVar = this.f11490k;
        if (xVar != null) {
            codedOutputByteBufferNano.writeMessage(12, xVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static z b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new z().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f11481a = codedInputByteBufferNano.readUInt32();
                    break;
                case C0122e9.G /* 26 */:
                    this.f11482b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f11483c = codedInputByteBufferNano.readBytes();
                    break;
                case C0122e9.M /* 42 */:
                    this.f11484d = codedInputByteBufferNano.readBytes();
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    if (this.f11485e == null) {
                        this.f11485e = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f11485e);
                    break;
                case 56:
                    this.f11486f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f11487g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f11488h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f11489i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.j == null) {
                        this.j = new y();
                    }
                    codedInputByteBufferNano.readMessage(this.j);
                    break;
                case 98:
                    if (this.f11490k == null) {
                        this.f11490k = new x();
                    }
                    codedInputByteBufferNano.readMessage(this.f11490k);
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

    public static z a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (z) MessageNano.mergeFrom(new z(), bArr);
    }
}
