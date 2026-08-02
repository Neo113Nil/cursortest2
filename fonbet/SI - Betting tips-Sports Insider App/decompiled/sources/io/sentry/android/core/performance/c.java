package io.sentry.android.core.performance;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final g f15795a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final g f15796b = new g();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int compare = Long.compare(this.f15795a.f15814c, cVar.f15795a.f15814c);
        return compare == 0 ? Long.compare(this.f15796b.f15814c, cVar.f15796b.f15814c) : compare;
    }
}
