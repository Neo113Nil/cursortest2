package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215ho extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0215ho[] f13907e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f13908a;

    /* renamed from: b, reason: collision with root package name */
    public double f13909b;

    /* renamed from: c, reason: collision with root package name */
    public double f13910c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13911d;

    public C0215ho() {
        a();
    }

    public static C0215ho[] b() {
        if (f13907e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13907e == null) {
                        f13907e = new C0215ho[0];
                    }
                } finally {
                }
            }
        }
        return f13907e;
    }

    public final C0215ho a() {
        this.f13908a = WireFormatNano.EMPTY_BYTES;
        this.f13909b = 0.0d;
        this.f13910c = 0.0d;
        this.f13911d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f13908a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f13908a);
        }
        if (Double.doubleToLongBits(this.f13909b) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f13909b);
        }
        if (Double.doubleToLongBits(this.f13910c) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f13910c);
        }
        boolean z5 = this.f13911d;
        return z5 ? CodedOutputByteBufferNano.computeBoolSize(4, z5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f13908a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f13908a);
        }
        if (Double.doubleToLongBits(this.f13909b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f13909b);
        }
        if (Double.doubleToLongBits(this.f13910c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f13910c);
        }
        boolean z5 = this.f13911d;
        if (z5) {
            codedOutputByteBufferNano.writeBool(4, z5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0215ho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13908a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.f13909b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.f13910c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13911d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0215ho b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0215ho().mergeFrom(codedInputByteBufferNano);
    }

    public static C0215ho a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0215ho) MessageNano.mergeFrom(new C0215ho(), bArr);
    }
}
