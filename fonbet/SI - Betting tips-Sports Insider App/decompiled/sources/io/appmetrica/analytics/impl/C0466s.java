package io.appmetrica.analytics.impl;

import com.appsflyer.attribution.RequestError;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466s extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f14588l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f14589m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f14590n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f14591o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f14592p = 4;
    public static final int q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f14593r = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f14594s = 7;

    /* renamed from: t, reason: collision with root package name */
    public static volatile C0466s[] f14595t;

    /* renamed from: u, reason: collision with root package name */
    public static byte[] f14596u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile boolean f14597v;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14598a;

    /* renamed from: b, reason: collision with root package name */
    public r f14599b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f14600c;

    /* renamed from: d, reason: collision with root package name */
    public int f14601d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f14602e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f14603f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f14604g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f14605h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f14606i;
    public byte[] j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f14607k;

    public C0466s() {
        if (!f14597v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f14597v) {
                        f14596u = InternalNano.bytesDefaultValue("manual");
                        f14597v = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0466s[] b() {
        if (f14595t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14595t == null) {
                        f14595t = new C0466s[0];
                    }
                } finally {
                }
            }
        }
        return f14595t;
    }

    public final C0466s a() {
        this.f14598a = (byte[]) f14596u.clone();
        this.f14599b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f14600c = bArr;
        this.f14601d = 0;
        this.f14602e = bArr;
        this.f14603f = bArr;
        this.f14604g = bArr;
        this.f14605h = bArr;
        this.f14606i = bArr;
        this.j = bArr;
        this.f14607k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f14598a, f14596u)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f14598a);
        }
        r rVar = this.f14599b;
        if (rVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f14600c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f14600c);
        }
        int i5 = this.f14601d;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i5);
        }
        if (!Arrays.equals(this.f14602e, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f14602e);
        }
        if (!Arrays.equals(this.f14603f, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f14603f);
        }
        if (!Arrays.equals(this.f14604g, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f14604g);
        }
        if (!Arrays.equals(this.f14605h, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f14605h);
        }
        if (!Arrays.equals(this.f14606i, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f14606i);
        }
        if (!Arrays.equals(this.j, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.j);
        }
        return !Arrays.equals(this.f14607k, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(11, this.f14607k) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f14598a, f14596u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f14598a);
        }
        r rVar = this.f14599b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f14600c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f14600c);
        }
        int i5 = this.f14601d;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i5);
        }
        if (!Arrays.equals(this.f14602e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f14602e);
        }
        if (!Arrays.equals(this.f14603f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f14603f);
        }
        if (!Arrays.equals(this.f14604g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f14604g);
        }
        if (!Arrays.equals(this.f14605h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f14605h);
        }
        if (!Arrays.equals(this.f14606i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f14606i);
        }
        if (!Arrays.equals(this.j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.j);
        }
        if (!Arrays.equals(this.f14607k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f14607k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0466s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0466s().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0466s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f14598a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f14599b == null) {
                        this.f14599b = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f14599b);
                    break;
                case C0122e9.G /* 26 */:
                    this.f14600c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f14601d = readInt32;
                            break;
                    }
                case C0122e9.M /* 42 */:
                    this.f14602e = codedInputByteBufferNano.readBytes();
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    this.f14603f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f14604g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f14605h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f14606i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f14607k = codedInputByteBufferNano.readBytes();
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

    public static C0466s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0466s) MessageNano.mergeFrom(new C0466s(), bArr);
    }
}
