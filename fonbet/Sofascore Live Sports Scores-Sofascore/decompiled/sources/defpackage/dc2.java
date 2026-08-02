package defpackage;

import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Internal;
import com.google.protobuf.l;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class dc2 extends l {
    public final byte[] a;

    public dc2(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // com.google.protobuf.l
    public final boolean a(l lVar, int i, int i2) {
        if (i2 > lVar.size()) {
            zzl.c(i2, size());
            return false;
        }
        int i3 = i + i2;
        if (i3 > lVar.size()) {
            yhk.h(lVar.size(), lnb.s(i, i2, "Ran off end of other: ", ", ", ", "));
            return false;
        }
        if (!(lVar instanceof dc2)) {
            return lVar.substring(i, i3).equals(substring(0, i2));
        }
        dc2 dc2Var = (dc2) lVar;
        byte[] bArr = dc2Var.a;
        int d = d() + i2;
        int d2 = d();
        int d3 = dc2Var.d() + i;
        while (d2 < d) {
            if (this.a[d2] != bArr[d3]) {
                return false;
            }
            d2++;
            d3++;
        }
        return true;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.a, d(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        return this.a[i];
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a, d(), size());
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    public int d() {
        return 0;
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ByteString) && size() == ((ByteString) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof dc2)) {
                return obj.equals(this);
            }
            dc2 dc2Var = (dc2) obj;
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = dc2Var.peekCachedHashCode();
            if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                return a(dc2Var, 0, size());
            }
        }
        return false;
    }

    @Override // com.google.protobuf.l, com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        return this.a[i];
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int d = d();
        return fik.a.f(this.a, d, size() + d);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.a, d(), size(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.a, d(), size());
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        return Internal.partialHash(i, this.a, d() + i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int d = d() + i2;
        return fik.a.j(i, this.a, d, i3 + d);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.a.length;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        int checkRange = ByteString.checkRange(i, i2, size());
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        return new wb2(this.a, d() + i, checkRange);
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(this.a, d(), size(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) {
        byteOutput.writeLazy(this.a, d(), size());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.a, d() + i, i2);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) {
        outputStream.write(toByteArray());
    }
}
