package com.logrocket.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends i {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f6703e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6704f;

    public g(byte[] bArr, int i5, int i10) {
        super(bArr);
        j.d(i5, i5 + i10, bArr.length);
        this.f6703e = i5;
        this.f6704f = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.logrocket.protobuf.i, com.logrocket.protobuf.j
    public final byte b(int i5) {
        j.c(i5, this.f6704f);
        return this.f6728d[this.f6703e + i5];
    }

    @Override // com.logrocket.protobuf.i, com.logrocket.protobuf.j
    public final void e(int i5, byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f6728d, this.f6703e + i5, bArr, i10, i11);
    }

    @Override // com.logrocket.protobuf.i, com.logrocket.protobuf.j
    public final byte g(int i5) {
        return this.f6728d[this.f6703e + i5];
    }

    @Override // com.logrocket.protobuf.i
    public final int s() {
        return this.f6703e;
    }

    @Override // com.logrocket.protobuf.i, com.logrocket.protobuf.j
    public final int size() {
        return this.f6704f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = d0.f6682b;
        } else {
            byte[] bArr2 = new byte[size];
            e(0, bArr2, 0, size);
            bArr = bArr2;
        }
        return new i(bArr);
    }
}
