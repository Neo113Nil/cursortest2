package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189go extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0189go[] f13857c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f13858a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13859b;

    public C0189go() {
        a();
    }

    public static C0189go[] b() {
        if (f13857c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13857c == null) {
                        f13857c = new C0189go[0];
                    }
                } finally {
                }
            }
        }
        return f13857c;
    }

    public final C0189go a() {
        this.f13858a = false;
        this.f13859b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f13858a;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        boolean z7 = this.f13859b;
        return z7 ? CodedOutputByteBufferNano.computeBoolSize(2, z7) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z5 = this.f13858a;
        if (z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        boolean z7 = this.f13859b;
        if (z7) {
            codedOutputByteBufferNano.writeBool(2, z7);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0189go mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f13858a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13859b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0189go b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0189go().mergeFrom(codedInputByteBufferNano);
    }

    public static C0189go a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0189go) MessageNano.mergeFrom(new C0189go(), bArr);
    }
}
