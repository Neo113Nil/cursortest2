package y1;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25562a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25563b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25564c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25565d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25566e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25567f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25568g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25569h;

    /* renamed from: i, reason: collision with root package name */
    public final int f25570i;

    public i0(boolean z5, boolean z7, int i5, boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        this.f25562a = z5;
        this.f25563b = z7;
        this.f25564c = i5;
        this.f25565d = z10;
        this.f25566e = z11;
        this.f25567f = i10;
        this.f25568g = i11;
        this.f25569h = i12;
        this.f25570i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f25562a == i0Var.f25562a && this.f25563b == i0Var.f25563b && this.f25564c == i0Var.f25564c && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && this.f25565d == i0Var.f25565d && this.f25566e == i0Var.f25566e && this.f25567f == i0Var.f25567f && this.f25568g == i0Var.f25568g && this.f25569h == i0Var.f25569h && this.f25570i == i0Var.f25570i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f25562a ? 1 : 0) * 31) + (this.f25563b ? 1 : 0)) * 31) + this.f25564c) * 923521) + (this.f25565d ? 1 : 0)) * 31) + (this.f25566e ? 1 : 0)) * 31) + this.f25567f) * 31) + this.f25568g) * 31) + this.f25569h) * 31) + this.f25570i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i0.class.getSimpleName());
        sb2.append("(");
        if (this.f25562a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f25563b) {
            sb2.append("restoreState ");
        }
        int i5 = this.f25570i;
        int i10 = this.f25569h;
        int i11 = this.f25568g;
        int i12 = this.f25567f;
        if (i12 != -1 || i11 != -1 || i10 != -1 || i5 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i12));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i5));
            sb2.append(")");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
