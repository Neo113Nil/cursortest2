package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333mf extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0333mf[] f14262d;

    /* renamed from: a, reason: collision with root package name */
    public String f14263a;

    /* renamed from: b, reason: collision with root package name */
    public String f14264b;

    /* renamed from: c, reason: collision with root package name */
    public int f14265c;

    public C0333mf() {
        a();
    }

    public static C0333mf[] b() {
        if (f14262d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14262d == null) {
                        f14262d = new C0333mf[0];
                    }
                } finally {
                }
            }
        }
        return f14262d;
    }

    public final C0333mf a() {
        this.f14263a = "";
        this.f14264b = "";
        this.f14265c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f14263a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f14263a);
        }
        if (!this.f14264b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f14264b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f14265c) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f14263a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f14263a);
        }
        if (!this.f14264b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f14264b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f14265c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0333mf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f14263a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f14264b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f14265c = readInt32;
                }
            }
        }
        return this;
    }

    public static C0333mf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0333mf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0333mf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0333mf) MessageNano.mergeFrom(new C0333mf(), bArr);
    }
}
