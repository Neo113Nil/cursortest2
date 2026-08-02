package org.joda.time.format;

/* loaded from: classes6.dex */
final class k implements c, j {

    /* renamed from: a, reason: collision with root package name */
    private final j f79350a;

    private k(j jVar) {
        this.f79350a = jVar;
    }

    static c d(j jVar) {
        if (jVar instanceof e) {
            return ((e) jVar).c();
        }
        if (jVar instanceof c) {
            return (c) jVar;
        }
        if (jVar == null) {
            return null;
        }
        return new k(jVar);
    }

    @Override // org.joda.time.format.c, org.joda.time.format.j
    public final int a() {
        return this.f79350a.a();
    }

    @Override // org.joda.time.format.j
    public final int b(d dVar, String str, int i11) {
        return this.f79350a.b(dVar, str, i11);
    }

    @Override // org.joda.time.format.c
    public final int c(d dVar, String str, int i11) {
        return this.f79350a.b(dVar, str, i11);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return this.f79350a.equals(((k) obj).f79350a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f79350a.hashCode();
    }
}
