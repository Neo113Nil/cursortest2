package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f11890c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11891d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static volatile m[] f11892e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11893a;

    /* renamed from: b, reason: collision with root package name */
    public l f11894b;

    public m() {
        a();
    }

    public static m[] b() {
        if (f11892e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11892e == null) {
                        f11892e = new m[0];
                    }
                } finally {
                }
            }
        }
        return f11892e;
    }

    public final m a() {
        this.f11893a = false;
        this.f11894b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f11893a;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        l lVar = this.f11894b;
        return lVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, lVar) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z5 = this.f11893a;
        if (z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        l lVar = this.f11894b;
        if (lVar != null) {
            codedOutputByteBufferNano.writeMessage(2, lVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f11893a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f11894b == null) {
                    this.f11894b = new l();
                }
                codedInputByteBufferNano.readMessage(this.f11894b);
            }
        }
        return this;
    }

    public static m b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new m().mergeFrom(codedInputByteBufferNano);
    }

    public static m a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (m) MessageNano.mergeFrom(new m(), bArr);
    }
}
