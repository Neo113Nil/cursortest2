package s9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class g extends f {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f23307d;

    public g(byte[] bArr) {
        this.f23324a = 0;
        bArr.getClass();
        this.f23307d = bArr;
    }

    @Override // s9.h
    public byte a(int i5) {
        return this.f23307d[i5];
    }

    @Override // s9.h
    public byte d(int i5) {
        return this.f23307d[i5];
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h) || size() != ((h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof g)) {
            return obj.equals(this);
        }
        g gVar = (g) obj;
        int i5 = this.f23324a;
        int i10 = gVar.f23324a;
        if (i5 != 0 && i10 != 0 && i5 != i10) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder r5 = androidx.appcompat.widget.c1.r(size, "Ran off end of other: 0, ", ", ");
            r5.append(gVar.size());
            throw new IllegalArgumentException(r5.toString());
        }
        byte[] bArr = gVar.f23307d;
        int e7 = e() + size;
        int e9 = e();
        int e10 = gVar.e();
        while (e9 < e7) {
            if (this.f23307d[e9] != bArr[e10]) {
                return false;
            }
            e9++;
            e10++;
        }
        return true;
    }

    @Override // s9.h
    public int size() {
        return this.f23307d.length;
    }
}
