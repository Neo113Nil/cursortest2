package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525u8 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f14707g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14708h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f14709i = 2;
    public static final int j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14710k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14711l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f14712m = 6;

    /* renamed from: n, reason: collision with root package name */
    public static final int f14713n = 7;

    /* renamed from: o, reason: collision with root package name */
    public static volatile C0525u8[] f14714o;

    /* renamed from: a, reason: collision with root package name */
    public int f14715a;

    /* renamed from: b, reason: collision with root package name */
    public C0500t8 f14716b;

    /* renamed from: c, reason: collision with root package name */
    public C0450r8 f14717c;

    /* renamed from: d, reason: collision with root package name */
    public C0475s8 f14718d;

    /* renamed from: e, reason: collision with root package name */
    public C0096d8 f14719e;

    /* renamed from: f, reason: collision with root package name */
    public C0250j8 f14720f;

    public C0525u8() {
        a();
    }

    public static C0525u8[] b() {
        if (f14714o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14714o == null) {
                        f14714o = new C0525u8[0];
                    }
                } finally {
                }
            }
        }
        return f14714o;
    }

    public final C0525u8 a() {
        this.f14715a = 0;
        this.f14716b = null;
        this.f14717c = null;
        this.f14718d = null;
        this.f14719e = null;
        this.f14720f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f14715a;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i5);
        }
        C0500t8 c0500t8 = this.f14716b;
        if (c0500t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0500t8);
        }
        C0450r8 c0450r8 = this.f14717c;
        if (c0450r8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0450r8);
        }
        C0475s8 c0475s8 = this.f14718d;
        if (c0475s8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0475s8);
        }
        C0096d8 c0096d8 = this.f14719e;
        if (c0096d8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0096d8);
        }
        C0250j8 c0250j8 = this.f14720f;
        return c0250j8 != null ? CodedOutputByteBufferNano.computeMessageSize(6, c0250j8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f14715a;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i5);
        }
        C0500t8 c0500t8 = this.f14716b;
        if (c0500t8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0500t8);
        }
        C0450r8 c0450r8 = this.f14717c;
        if (c0450r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0450r8);
        }
        C0475s8 c0475s8 = this.f14718d;
        if (c0475s8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0475s8);
        }
        C0096d8 c0096d8 = this.f14719e;
        if (c0096d8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0096d8);
        }
        C0250j8 c0250j8 = this.f14720f;
        if (c0250j8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0250j8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0525u8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0525u8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0525u8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 8) {
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
                            this.f14715a = readInt32;
                            break;
                    }
                } else if (readTag == 18) {
                    if (this.f14716b == null) {
                        this.f14716b = new C0500t8();
                    }
                    codedInputByteBufferNano.readMessage(this.f14716b);
                } else if (readTag == 26) {
                    if (this.f14717c == null) {
                        this.f14717c = new C0450r8();
                    }
                    codedInputByteBufferNano.readMessage(this.f14717c);
                } else if (readTag == 34) {
                    if (this.f14718d == null) {
                        this.f14718d = new C0475s8();
                    }
                    codedInputByteBufferNano.readMessage(this.f14718d);
                } else if (readTag == 42) {
                    if (this.f14719e == null) {
                        this.f14719e = new C0096d8();
                    }
                    codedInputByteBufferNano.readMessage(this.f14719e);
                } else if (readTag != 50) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    if (this.f14720f == null) {
                        this.f14720f = new C0250j8();
                    }
                    codedInputByteBufferNano.readMessage(this.f14720f);
                }
            }
        }
        return this;
    }

    public static C0525u8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0525u8) MessageNano.mergeFrom(new C0525u8(), bArr);
    }
}
