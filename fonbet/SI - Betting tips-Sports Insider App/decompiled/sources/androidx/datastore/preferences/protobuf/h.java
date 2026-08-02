package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class h extends g {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1614d;

    public h(byte[] bArr) {
        this.f1620a = 0;
        bArr.getClass();
        this.f1614d = bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public byte a(int i5) {
        return this.f1614d[i5];
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public void d(int i5, byte[] bArr) {
        System.arraycopy(this.f1614d, 0, bArr, 0, i5);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public byte e(int i5) {
        return this.f1614d[i5];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || size() != ((i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof h)) {
            return obj.equals(this);
        }
        h hVar = (h) obj;
        int i5 = this.f1620a;
        int i10 = hVar.f1620a;
        if (i5 != 0 && i10 != 0 && i5 != i10) {
            return false;
        }
        int size = size();
        if (size > hVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > hVar.size()) {
            StringBuilder r5 = androidx.appcompat.widget.c1.r(size, "Ran off end of other: 0, ", ", ");
            r5.append(hVar.size());
            throw new IllegalArgumentException(r5.toString());
        }
        byte[] bArr = hVar.f1614d;
        int f6 = f() + size;
        int f10 = f();
        int f11 = hVar.f();
        while (f10 < f6) {
            if (this.f1614d[f10] != bArr[f11]) {
                return false;
            }
            f10++;
            f11++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public int size() {
        return this.f1614d.length;
    }
}
