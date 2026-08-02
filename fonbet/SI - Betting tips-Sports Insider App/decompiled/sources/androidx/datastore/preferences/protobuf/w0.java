package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1725a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1726b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f1727c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1728d;

    public w0(y yVar, String str, Object[] objArr) {
        this.f1725a = yVar;
        this.f1726b = str;
        this.f1727c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f1728d = charAt;
            return;
        }
        int i5 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f1728d = i5 | (charAt2 << i10);
                return;
            } else {
                i5 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    public final int a() {
        int i5 = this.f1728d;
        if ((i5 & 1) != 0) {
            return 1;
        }
        return (i5 & 4) == 4 ? 3 : 2;
    }
}
