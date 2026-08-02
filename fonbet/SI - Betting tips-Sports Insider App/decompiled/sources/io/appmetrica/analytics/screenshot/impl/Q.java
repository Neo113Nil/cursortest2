package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Q extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Q[] f15325d;

    /* renamed from: a, reason: collision with root package name */
    public N f15326a;

    /* renamed from: b, reason: collision with root package name */
    public P f15327b;

    /* renamed from: c, reason: collision with root package name */
    public O f15328c;

    public Q() {
        a();
    }

    public static Q[] b() {
        if (f15325d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f15325d == null) {
                        f15325d = new Q[0];
                    }
                } finally {
                }
            }
        }
        return f15325d;
    }

    public final Q a() {
        this.f15326a = null;
        this.f15327b = null;
        this.f15328c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        N n9 = this.f15326a;
        if (n9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, n9);
        }
        P p10 = this.f15327b;
        if (p10 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, p10);
        }
        O o3 = this.f15328c;
        return o3 != null ? CodedOutputByteBufferNano.computeMessageSize(3, o3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        N n9 = this.f15326a;
        if (n9 != null) {
            codedOutputByteBufferNano.writeMessage(1, n9);
        }
        P p10 = this.f15327b;
        if (p10 != null) {
            codedOutputByteBufferNano.writeMessage(2, p10);
        }
        O o3 = this.f15328c;
        if (o3 != null) {
            codedOutputByteBufferNano.writeMessage(3, o3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f15326a == null) {
                    this.f15326a = new N();
                }
                codedInputByteBufferNano.readMessage(this.f15326a);
            } else if (readTag == 18) {
                if (this.f15327b == null) {
                    this.f15327b = new P();
                }
                codedInputByteBufferNano.readMessage(this.f15327b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f15328c == null) {
                    this.f15328c = new O();
                }
                codedInputByteBufferNano.readMessage(this.f15328c);
            }
        }
        return this;
    }

    public static Q b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q().mergeFrom(codedInputByteBufferNano);
    }

    public static Q a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q) MessageNano.mergeFrom(new Q(), bArr);
    }
}
