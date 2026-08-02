package org.joda.time.format;

/* loaded from: classes6.dex */
final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    private final c f79287a;

    private e(c cVar) {
        this.f79287a = cVar;
    }

    static j d(c cVar) {
        if (cVar instanceof k) {
            return (j) cVar;
        }
        if (cVar == null) {
            return null;
        }
        return new e(cVar);
    }

    @Override // org.joda.time.format.j
    public final int a() {
        return this.f79287a.a();
    }

    @Override // org.joda.time.format.j
    public final int b(d dVar, String str, int i11) {
        return this.f79287a.c(dVar, str.toString(), i11);
    }

    final c c() {
        return this.f79287a;
    }
}
