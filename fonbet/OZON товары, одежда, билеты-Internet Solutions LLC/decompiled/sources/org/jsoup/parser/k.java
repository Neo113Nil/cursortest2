package org.jsoup.parser;

import Of.C3707a;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final k f79560c = new k(false, false);

    /* renamed from: d, reason: collision with root package name */
    public static final k f79561d = new k(true, true);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f79562a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f79563b;

    public k(boolean z11, boolean z12) {
        this.f79562a = z11;
        this.f79563b = z12;
    }

    public final String a() {
        return !this.f79563b ? C3707a.a("pubSysKey") : "pubSysKey";
    }

    final void b(Pf.b bVar) {
        if (bVar == null || this.f79563b) {
            return;
        }
        bVar.t();
    }

    public final String c(String str) {
        String trim = str.trim();
        return !this.f79562a ? C3707a.a(trim) : trim;
    }

    public final boolean d() {
        return this.f79563b;
    }

    public final boolean e() {
        return this.f79562a;
    }

    k(k kVar) {
        this(kVar.f79562a, kVar.f79563b);
    }
}
