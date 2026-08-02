package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200h9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0200h9[] f13888e;

    /* renamed from: a, reason: collision with root package name */
    public int f13889a;

    /* renamed from: b, reason: collision with root package name */
    public int f13890b;

    /* renamed from: c, reason: collision with root package name */
    public String f13891c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13892d;

    public C0200h9() {
        a();
    }

    public static C0200h9[] b() {
        if (f13888e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13888e == null) {
                        f13888e = new C0200h9[0];
                    }
                } finally {
                }
            }
        }
        return f13888e;
    }

    public final C0200h9 a() {
        this.f13889a = 0;
        this.f13890b = 0;
        this.f13891c = "";
        this.f13892d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f13889a;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i5);
        }
        int i10 = this.f13890b;
        if (i10 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i10);
        }
        if (!this.f13891c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f13891c);
        }
        boolean z5 = this.f13892d;
        return z5 ? CodedOutputByteBufferNano.computeBoolSize(4, z5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f13889a;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i5);
        }
        int i10 = this.f13890b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i10);
        }
        if (!this.f13891c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f13891c);
        }
        boolean z5 = this.f13892d;
        if (z5) {
            codedOutputByteBufferNano.writeBool(4, z5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0200h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f13889a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 16) {
                this.f13890b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 26) {
                this.f13891c = codedInputByteBufferNano.readString();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13892d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0200h9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0200h9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0200h9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0200h9) MessageNano.mergeFrom(new C0200h9(), bArr);
    }
}
