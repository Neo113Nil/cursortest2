package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308lf extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0308lf[] f14197f;

    /* renamed from: a, reason: collision with root package name */
    public String f14198a;

    /* renamed from: b, reason: collision with root package name */
    public String f14199b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14200c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14201d;

    /* renamed from: e, reason: collision with root package name */
    public int f14202e;

    public C0308lf() {
        a();
    }

    public static C0308lf[] b() {
        if (f14197f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14197f == null) {
                        f14197f = new C0308lf[0];
                    }
                } finally {
                }
            }
        }
        return f14197f;
    }

    public final C0308lf a() {
        this.f14198a = "";
        this.f14199b = "";
        this.f14200c = false;
        this.f14201d = false;
        this.f14202e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f14198a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f14198a);
        }
        if (!this.f14199b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f14199b);
        }
        boolean z5 = this.f14200c;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z5);
        }
        boolean z7 = this.f14201d;
        if (z7) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z7);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f14202e) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f14198a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f14198a);
        }
        if (!this.f14199b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f14199b);
        }
        boolean z5 = this.f14200c;
        if (z5) {
            codedOutputByteBufferNano.writeBool(3, z5);
        }
        boolean z7 = this.f14201d;
        if (z7) {
            codedOutputByteBufferNano.writeBool(4, z7);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f14202e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0308lf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0308lf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0308lf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f14198a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f14199b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f14200c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f14201d = codedInputByteBufferNano.readBool();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f14202e = readInt32;
                }
            }
        }
        return this;
    }

    public static C0308lf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0308lf) MessageNano.mergeFrom(new C0308lf(), bArr);
    }
}
