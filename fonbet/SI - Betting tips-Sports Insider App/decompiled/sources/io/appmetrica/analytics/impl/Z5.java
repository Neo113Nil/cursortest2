package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Z5 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile Z5[] f13259g;

    /* renamed from: a, reason: collision with root package name */
    public String f13260a;

    /* renamed from: b, reason: collision with root package name */
    public String f13261b;

    /* renamed from: c, reason: collision with root package name */
    public int f13262c;

    /* renamed from: d, reason: collision with root package name */
    public String f13263d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13264e;

    /* renamed from: f, reason: collision with root package name */
    public int f13265f;

    public Z5() {
        a();
    }

    public static Z5[] b() {
        if (f13259g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13259g == null) {
                        f13259g = new Z5[0];
                    }
                } finally {
                }
            }
        }
        return f13259g;
    }

    public final Z5 a() {
        this.f13260a = "";
        this.f13261b = "";
        this.f13262c = -1;
        this.f13263d = "";
        this.f13264e = false;
        this.f13265f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f13260a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f13260a);
        }
        if (!this.f13261b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f13261b);
        }
        int i5 = this.f13262c;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i5);
        }
        if (!this.f13263d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f13263d);
        }
        boolean z5 = this.f13264e;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z5);
        }
        int i10 = this.f13265f;
        return i10 != -1 ? CodedOutputByteBufferNano.computeSInt32Size(6, i10) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f13260a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f13260a);
        }
        if (!this.f13261b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f13261b);
        }
        int i5 = this.f13262c;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i5);
        }
        if (!this.f13263d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f13263d);
        }
        boolean z5 = this.f13264e;
        if (z5) {
            codedOutputByteBufferNano.writeBool(5, z5);
        }
        int i10 = this.f13265f;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Z5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Z5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13260a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f13261b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f13262c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f13263d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f13264e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13265f = codedInputByteBufferNano.readSInt32();
            }
        }
        return this;
    }

    public static Z5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Z5) MessageNano.mergeFrom(new Z5(), bArr);
    }
}
