package s9;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends g {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f23295e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23296f;

    public e(byte[] bArr, int i5, int i10) {
        super(bArr);
        h.b(i5, i5 + i10, bArr.length);
        this.f23295e = i5;
        this.f23296f = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // s9.g, s9.h
    public final byte a(int i5) {
        int i10 = this.f23296f;
        if (((i10 - (i5 + 1)) | i5) >= 0) {
            return this.f23307d[this.f23295e + i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.c1.i(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Index > length: ", ", ", i10));
    }

    @Override // s9.g, s9.h
    public final byte d(int i5) {
        return this.f23307d[this.f23295e + i5];
    }

    @Override // s9.g
    public final int e() {
        return this.f23295e;
    }

    @Override // s9.g, s9.h
    public final int size() {
        return this.f23296f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int i5 = this.f23296f;
        if (i5 == 0) {
            bArr = t.f23376b;
        } else {
            byte[] bArr2 = new byte[i5];
            System.arraycopy(this.f23307d, this.f23295e, bArr2, 0, i5);
            bArr = bArr2;
        }
        return new g(bArr);
    }
}
