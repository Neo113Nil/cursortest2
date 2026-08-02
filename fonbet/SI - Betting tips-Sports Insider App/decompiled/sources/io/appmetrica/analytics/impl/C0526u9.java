package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.u9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526u9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0526u9[] f14721e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f14722a;

    /* renamed from: b, reason: collision with root package name */
    public int f14723b;

    /* renamed from: c, reason: collision with root package name */
    public int f14724c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f14725d;

    public C0526u9() {
        a();
    }

    public static C0526u9[] b() {
        if (f14721e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14721e == null) {
                        f14721e = new C0526u9[0];
                    }
                } finally {
                }
            }
        }
        return f14721e;
    }

    public final C0526u9 a() {
        this.f14722a = false;
        this.f14723b = 0;
        this.f14724c = 0;
        this.f14725d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f14724c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f14723b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f14722a) + super.computeSerializedSize();
        int[] iArr = this.f14725d;
        if (iArr == null || iArr.length <= 0) {
            return computeUInt32Size;
        }
        int i5 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f14725d;
            if (i5 >= iArr2.length) {
                return computeUInt32Size + i10 + iArr2.length;
            }
            i10 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i5]);
            i5++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f14722a);
        codedOutputByteBufferNano.writeUInt32(2, this.f14723b);
        codedOutputByteBufferNano.writeUInt32(3, this.f14724c);
        int[] iArr = this.f14725d;
        if (iArr != null && iArr.length > 0) {
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f14725d;
                if (i5 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i5]);
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0526u9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f14722a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f14723b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 24) {
                this.f14724c = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f14725d;
                int length = iArr == null ? 0 : iArr.length;
                int i5 = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i5];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i5 - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f14725d = iArr2;
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i10 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i10++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f14725d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i11 = i10 + length2;
                int[] iArr4 = new int[i11];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i11) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f14725d = iArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            }
        }
        return this;
    }

    public static C0526u9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0526u9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0526u9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0526u9) MessageNano.mergeFrom(new C0526u9(), bArr);
    }
}
