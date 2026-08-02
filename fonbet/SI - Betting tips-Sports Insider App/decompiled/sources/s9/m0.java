package s9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f23356a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23357b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f23358c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23359d;

    public m0(a aVar, String str, Object[] objArr) {
        this.f23356a = aVar;
        this.f23357b = str;
        this.f23358c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f23359d = charAt;
            return;
        }
        int i5 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f23359d = i5 | (charAt2 << i10);
                return;
            } else {
                i5 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    public final int a() {
        int i5 = this.f23359d;
        if ((i5 & 1) != 0) {
            return 1;
        }
        return (i5 & 4) == 4 ? 3 : 2;
    }
}
