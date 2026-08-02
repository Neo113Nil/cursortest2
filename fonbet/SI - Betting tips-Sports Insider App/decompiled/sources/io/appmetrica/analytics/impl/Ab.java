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
public final class Ab extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile Ab[] f11984f;

    /* renamed from: a, reason: collision with root package name */
    public String f11985a;

    /* renamed from: b, reason: collision with root package name */
    public String f11986b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11987c;

    /* renamed from: d, reason: collision with root package name */
    public String f11988d;

    /* renamed from: e, reason: collision with root package name */
    public String f11989e;

    public Ab() {
        a();
    }

    public static Ab[] b() {
        if (f11984f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11984f == null) {
                        f11984f = new Ab[0];
                    }
                } finally {
                }
            }
        }
        return f11984f;
    }

    public final Ab a() {
        this.f11985a = "";
        this.f11986b = "";
        this.f11987c = false;
        this.f11988d = "";
        this.f11989e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f11985a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f11985a);
        }
        if (!this.f11986b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f11986b);
        }
        boolean z5 = this.f11987c;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z5);
        }
        if (!this.f11988d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f11988d);
        }
        return !this.f11989e.equals("") ? CodedOutputByteBufferNano.computeStringSize(26, this.f11989e) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f11985a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f11985a);
        }
        if (!this.f11986b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f11986b);
        }
        boolean z5 = this.f11987c;
        if (z5) {
            codedOutputByteBufferNano.writeBool(22, z5);
        }
        if (!this.f11988d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f11988d);
        }
        if (!this.f11989e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f11989e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Ab b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ab().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ab mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f11985a = codedInputByteBufferNano.readString();
            } else if (readTag == 154) {
                this.f11986b = codedInputByteBufferNano.readString();
            } else if (readTag == 176) {
                this.f11987c = codedInputByteBufferNano.readBool();
            } else if (readTag == 202) {
                this.f11988d = codedInputByteBufferNano.readString();
            } else if (readTag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11989e = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Ab a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ab) MessageNano.mergeFrom(new Ab(), bArr);
    }
}
