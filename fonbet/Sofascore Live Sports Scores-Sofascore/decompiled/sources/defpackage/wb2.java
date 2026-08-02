package defpackage;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wb2 extends dc2 {
    public final int b;
    public final int c;

    public wb2(byte[] bArr, int i, int i2) {
        super(bArr);
        ByteString.checkRange(i, i + i2, bArr.length);
        this.b = i;
        this.c = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.dc2, com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        ByteString.checkIndex(i, this.c);
        return this.a[this.b + i];
    }

    @Override // defpackage.dc2, com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.b + i, bArr, i2, i3);
    }

    @Override // defpackage.dc2
    public final int d() {
        return this.b;
    }

    @Override // defpackage.dc2, com.google.protobuf.l, com.google.protobuf.ByteString
    public final byte internalByteAt(int i) {
        return this.a[this.b + i];
    }

    @Override // defpackage.dc2, com.google.protobuf.ByteString
    public final int size() {
        return this.c;
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }
}
