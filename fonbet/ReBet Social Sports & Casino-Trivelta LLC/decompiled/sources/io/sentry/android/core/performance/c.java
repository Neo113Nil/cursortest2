package io.sentry.android.core.performance;

/* loaded from: classes3.dex */
public class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final n f51226a = new n();

    /* renamed from: b, reason: collision with root package name */
    public final n f51227b = new n();

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int compare = Long.compare(this.f51226a.j(), cVar.f51226a.j());
        return compare == 0 ? Long.compare(this.f51227b.j(), cVar.f51227b.j()) : compare;
    }

    public final n b() {
        return this.f51226a;
    }

    public final n c() {
        return this.f51227b;
    }
}
