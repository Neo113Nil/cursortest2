package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends h {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f1609e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1610f;

    public f(byte[] bArr, int i5, int i10) {
        super(bArr);
        i.b(i5, i5 + i10, bArr.length);
        this.f1609e = i5;
        this.f1610f = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.h, androidx.datastore.preferences.protobuf.i
    public final byte a(int i5) {
        int i10 = this.f1610f;
        if (((i10 - (i5 + 1)) | i5) >= 0) {
            return this.f1614d[this.f1609e + i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.c1.i(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Index > length: ", ", ", i10));
    }

    @Override // androidx.datastore.preferences.protobuf.h, androidx.datastore.preferences.protobuf.i
    public final void d(int i5, byte[] bArr) {
        System.arraycopy(this.f1614d, this.f1609e, bArr, 0, i5);
    }

    @Override // androidx.datastore.preferences.protobuf.h, androidx.datastore.preferences.protobuf.i
    public final byte e(int i5) {
        return this.f1614d[this.f1609e + i5];
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final int f() {
        return this.f1609e;
    }

    @Override // androidx.datastore.preferences.protobuf.h, androidx.datastore.preferences.protobuf.i
    public final int size() {
        return this.f1610f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = a0.f1573b;
        } else {
            byte[] bArr2 = new byte[size];
            d(size, bArr2);
            bArr = bArr2;
        }
        return new h(bArr);
    }
}
