package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.impl.C0122e9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends MessageNano {
    public static volatile k[] j;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11878a;

    /* renamed from: b, reason: collision with root package name */
    public j f11879b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f11880c;

    /* renamed from: d, reason: collision with root package name */
    public i[] f11881d;

    /* renamed from: e, reason: collision with root package name */
    public long f11882e;

    /* renamed from: f, reason: collision with root package name */
    public long f11883f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f11884g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11885h;

    /* renamed from: i, reason: collision with root package name */
    public String f11886i;

    public k() {
        a();
    }

    public static k[] b() {
        if (j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (j == null) {
                        j = new k[0];
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public final k a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f11878a = bArr;
        this.f11879b = null;
        this.f11880c = bArr;
        this.f11881d = i.b();
        this.f11882e = 86400000L;
        this.f11883f = 3600000L;
        this.f11884g = WireFormatNano.EMPTY_INT_ARRAY;
        this.f11885h = true;
        this.f11886i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int[] iArr;
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f11878a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f11878a);
        }
        j jVar = this.f11879b;
        if (jVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, jVar);
        }
        if (!Arrays.equals(this.f11880c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f11880c);
        }
        i[] iVarArr = this.f11881d;
        int i5 = 0;
        if (iVarArr != null && iVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                i[] iVarArr2 = this.f11881d;
                if (i10 >= iVarArr2.length) {
                    break;
                }
                i iVar = iVarArr2[i10];
                if (iVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, iVar) + computeSerializedSize;
                }
                i10++;
            }
        }
        long j6 = this.f11882e;
        if (j6 != 86400000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j6);
        }
        long j10 = this.f11883f;
        if (j10 != 3600000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(6, j10);
        }
        int[] iArr2 = this.f11884g;
        if (iArr2 != null && iArr2.length > 0) {
            int i11 = 0;
            while (true) {
                iArr = this.f11884g;
                if (i5 >= iArr.length) {
                    break;
                }
                i11 += CodedOutputByteBufferNano.computeUInt32SizeNoTag(iArr[i5]);
                i5++;
            }
            computeSerializedSize = computeSerializedSize + i11 + iArr.length;
        }
        boolean z5 = this.f11885h;
        if (!z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(8, z5);
        }
        return !this.f11886i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.f11886i) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f11878a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f11878a);
        }
        j jVar = this.f11879b;
        if (jVar != null) {
            codedOutputByteBufferNano.writeMessage(2, jVar);
        }
        if (!Arrays.equals(this.f11880c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f11880c);
        }
        i[] iVarArr = this.f11881d;
        int i5 = 0;
        if (iVarArr != null && iVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                i[] iVarArr2 = this.f11881d;
                if (i10 >= iVarArr2.length) {
                    break;
                }
                i iVar = iVarArr2[i10];
                if (iVar != null) {
                    codedOutputByteBufferNano.writeMessage(4, iVar);
                }
                i10++;
            }
        }
        long j6 = this.f11882e;
        if (j6 != 86400000) {
            codedOutputByteBufferNano.writeUInt64(5, j6);
        }
        long j10 = this.f11883f;
        if (j10 != 3600000) {
            codedOutputByteBufferNano.writeUInt64(6, j10);
        }
        int[] iArr = this.f11884g;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f11884g;
                if (i5 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeUInt32(7, iArr2[i5]);
                i5++;
            }
        }
        boolean z5 = this.f11885h;
        if (!z5) {
            codedOutputByteBufferNano.writeBool(8, z5);
        }
        if (!this.f11886i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f11886i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static k b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new k().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f11878a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f11879b == null) {
                        this.f11879b = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.f11879b);
                    break;
                case C0122e9.G /* 26 */:
                    this.f11880c = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    i[] iVarArr = this.f11881d;
                    int length = iVarArr == null ? 0 : iVarArr.length;
                    int i5 = repeatedFieldArrayLength + length;
                    i[] iVarArr2 = new i[i5];
                    if (length != 0) {
                        System.arraycopy(iVarArr, 0, iVarArr2, 0, length);
                    }
                    while (length < i5 - 1) {
                        i iVar = new i();
                        iVarArr2[length] = iVar;
                        codedInputByteBufferNano.readMessage(iVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    i iVar2 = new i();
                    iVarArr2[length] = iVar2;
                    codedInputByteBufferNano.readMessage(iVar2);
                    this.f11881d = iVarArr2;
                    break;
                case 40:
                    this.f11882e = codedInputByteBufferNano.readUInt64();
                    break;
                case 48:
                    this.f11883f = codedInputByteBufferNano.readUInt64();
                    break;
                case 56:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 56);
                    int[] iArr = this.f11884g;
                    int length2 = iArr == null ? 0 : iArr.length;
                    int i10 = repeatedFieldArrayLength2 + length2;
                    int[] iArr2 = new int[i10];
                    if (length2 != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length2);
                    }
                    while (length2 < i10 - 1) {
                        iArr2[length2] = codedInputByteBufferNano.readUInt32();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    iArr2[length2] = codedInputByteBufferNano.readUInt32();
                    this.f11884g = iArr2;
                    break;
                case 58:
                    int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    int position = codedInputByteBufferNano.getPosition();
                    int i11 = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        codedInputByteBufferNano.readUInt32();
                        i11++;
                    }
                    codedInputByteBufferNano.rewindToPosition(position);
                    int[] iArr3 = this.f11884g;
                    int length3 = iArr3 == null ? 0 : iArr3.length;
                    int i12 = i11 + length3;
                    int[] iArr4 = new int[i12];
                    if (length3 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length3);
                    }
                    while (length3 < i12) {
                        iArr4[length3] = codedInputByteBufferNano.readUInt32();
                        length3++;
                    }
                    this.f11884g = iArr4;
                    codedInputByteBufferNano.popLimit(pushLimit);
                    break;
                case 64:
                    this.f11885h = codedInputByteBufferNano.readBool();
                    break;
                case 74:
                    this.f11886i = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static k a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (k) MessageNano.mergeFrom(new k(), bArr);
    }
}
