package p2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f21472a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21473b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21474c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21475d;

    public f(int i5, String from, String to, int i10) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.f21472a = i5;
        this.f21473b = i10;
        this.f21474c = from;
        this.f21475d = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f other = (f) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i5 = this.f21472a - other.f21472a;
        return i5 == 0 ? this.f21473b - other.f21473b : i5;
    }
}
