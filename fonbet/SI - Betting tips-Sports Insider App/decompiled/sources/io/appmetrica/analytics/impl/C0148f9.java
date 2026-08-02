package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148f9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f13722d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13723e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13724f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0148f9[] f13725g;

    /* renamed from: a, reason: collision with root package name */
    public C0226i9 f13726a;

    /* renamed from: b, reason: collision with root package name */
    public String f13727b;

    /* renamed from: c, reason: collision with root package name */
    public int f13728c;

    public C0148f9() {
        a();
    }

    public static C0148f9[] b() {
        if (f13725g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13725g == null) {
                        f13725g = new C0148f9[0];
                    }
                } finally {
                }
            }
        }
        return f13725g;
    }

    public final C0148f9 a() {
        this.f13726a = null;
        this.f13727b = "";
        this.f13728c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0226i9 c0226i9 = this.f13726a;
        if (c0226i9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0226i9);
        }
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f13727b) + computeSerializedSize;
        int i5 = this.f13728c;
        return i5 != 0 ? CodedOutputByteBufferNano.computeInt32Size(5, i5) + computeStringSize : computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0226i9 c0226i9 = this.f13726a;
        if (c0226i9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0226i9);
        }
        codedOutputByteBufferNano.writeString(2, this.f13727b);
        int i5 = this.f13728c;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0148f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f13726a == null) {
                    this.f13726a = new C0226i9();
                }
                codedInputByteBufferNano.readMessage(this.f13726a);
            } else if (readTag == 18) {
                this.f13727b = codedInputByteBufferNano.readString();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f13728c = readInt32;
                }
            }
        }
        return this;
    }

    public static C0148f9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0148f9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0148f9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0148f9) MessageNano.mergeFrom(new C0148f9(), bArr);
    }
}
