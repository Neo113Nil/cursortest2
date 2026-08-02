package io.sentry.clientreport;

import io.sentry.util.w;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f51988a;

    /* renamed from: b, reason: collision with root package name */
    public final String f51989b;

    public d(String str, String str2) {
        this.f51988a = str;
        this.f51989b = str2;
    }

    public String a() {
        return this.f51989b;
    }

    public String b() {
        return this.f51988a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return w.a(b(), dVar.b()) && w.a(a(), dVar.a());
    }

    public int hashCode() {
        return w.b(b(), a());
    }
}
