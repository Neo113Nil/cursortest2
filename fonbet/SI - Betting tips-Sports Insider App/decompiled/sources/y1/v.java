package y1;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public String f25640a;

    /* renamed from: b, reason: collision with root package name */
    public String f25641b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v other = (v) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i5 = Intrinsics.areEqual(this.f25640a, other.f25640a) ? 2 : 0;
        return Intrinsics.areEqual(this.f25641b, other.f25641b) ? i5 + 1 : i5;
    }
}
