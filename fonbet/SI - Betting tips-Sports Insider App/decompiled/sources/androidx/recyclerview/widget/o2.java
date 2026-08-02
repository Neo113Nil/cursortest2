package androidx.recyclerview.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2497a;

    /* renamed from: b, reason: collision with root package name */
    public int f2498b;

    /* renamed from: c, reason: collision with root package name */
    public int f2499c;

    /* renamed from: d, reason: collision with root package name */
    public int f2500d;

    /* renamed from: e, reason: collision with root package name */
    public int f2501e;

    public final boolean a() {
        int i5 = this.f2497a;
        int i10 = 2;
        if ((i5 & 7) != 0) {
            int i11 = this.f2500d;
            int i12 = this.f2498b;
            if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 112) != 0) {
            int i13 = this.f2500d;
            int i14 = this.f2499c;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 1792) != 0) {
            int i15 = this.f2501e;
            int i16 = this.f2498b;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i5) == 0) {
                return false;
            }
        }
        if ((i5 & 28672) != 0) {
            int i17 = this.f2501e;
            int i18 = this.f2499c;
            if (i17 > i18) {
                i10 = 1;
            } else if (i17 != i18) {
                i10 = 4;
            }
            if ((i5 & (i10 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
