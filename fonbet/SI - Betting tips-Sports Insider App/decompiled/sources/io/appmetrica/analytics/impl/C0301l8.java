package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301l8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0301l8[] f14187c;

    /* renamed from: a, reason: collision with root package name */
    public C0276k8[] f14188a;

    /* renamed from: b, reason: collision with root package name */
    public int f14189b;

    public C0301l8() {
        a();
    }

    public static C0301l8[] b() {
        if (f14187c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14187c == null) {
                        f14187c = new C0301l8[0];
                    }
                } finally {
                }
            }
        }
        return f14187c;
    }

    public final C0301l8 a() {
        this.f14188a = C0276k8.b();
        this.f14189b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0276k8[] c0276k8Arr = this.f14188a;
        if (c0276k8Arr != null && c0276k8Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0276k8[] c0276k8Arr2 = this.f14188a;
                if (i5 >= c0276k8Arr2.length) {
                    break;
                }
                C0276k8 c0276k8 = c0276k8Arr2[i5];
                if (c0276k8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0276k8) + computeSerializedSize;
                }
                i5++;
            }
        }
        int i10 = this.f14189b;
        return i10 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i10) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0276k8[] c0276k8Arr = this.f14188a;
        if (c0276k8Arr != null && c0276k8Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0276k8[] c0276k8Arr2 = this.f14188a;
                if (i5 >= c0276k8Arr2.length) {
                    break;
                }
                C0276k8 c0276k8 = c0276k8Arr2[i5];
                if (c0276k8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0276k8);
                }
                i5++;
            }
        }
        int i10 = this.f14189b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0301l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0276k8[] c0276k8Arr = this.f14188a;
                int length = c0276k8Arr == null ? 0 : c0276k8Arr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0276k8[] c0276k8Arr2 = new C0276k8[i5];
                if (length != 0) {
                    System.arraycopy(c0276k8Arr, 0, c0276k8Arr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0276k8 c0276k8 = new C0276k8();
                    c0276k8Arr2[length] = c0276k8;
                    codedInputByteBufferNano.readMessage(c0276k8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0276k8 c0276k82 = new C0276k8();
                c0276k8Arr2[length] = c0276k82;
                codedInputByteBufferNano.readMessage(c0276k82);
                this.f14188a = c0276k8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f14189b = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0301l8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0301l8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0301l8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0301l8) MessageNano.mergeFrom(new C0301l8(), bArr);
    }
}
