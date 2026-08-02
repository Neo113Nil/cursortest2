package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464rm extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0464rm[] f14581g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f14582a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14583b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14584c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14585d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14586e;

    /* renamed from: f, reason: collision with root package name */
    public int f14587f;

    public C0464rm() {
        a();
    }

    public static C0464rm[] b() {
        if (f14581g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14581g == null) {
                        f14581g = new C0464rm[0];
                    }
                } finally {
                }
            }
        }
        return f14581g;
    }

    public final C0464rm a() {
        this.f14582a = false;
        this.f14583b = false;
        this.f14584c = false;
        this.f14585d = false;
        this.f14586e = false;
        this.f14587f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f14585d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f14584c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f14583b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f14582a) + super.computeSerializedSize();
        boolean z5 = this.f14586e;
        if (z5) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z5);
        }
        int i5 = this.f14587f;
        return i5 != -1 ? CodedOutputByteBufferNano.computeInt32Size(6, i5) + computeBoolSize : computeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f14582a);
        codedOutputByteBufferNano.writeBool(2, this.f14583b);
        codedOutputByteBufferNano.writeBool(3, this.f14584c);
        codedOutputByteBufferNano.writeBool(4, this.f14585d);
        boolean z5 = this.f14586e;
        if (z5) {
            codedOutputByteBufferNano.writeBool(5, z5);
        }
        int i5 = this.f14587f;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0464rm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0464rm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0464rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f14582a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f14583b = codedInputByteBufferNano.readBool();
            } else if (readTag == 24) {
                this.f14584c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f14585d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f14586e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f14587f = readInt32;
                }
            }
        }
        return this;
    }

    public static C0464rm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0464rm) MessageNano.mergeFrom(new C0464rm(), bArr);
    }
}
