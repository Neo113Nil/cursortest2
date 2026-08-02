package org.jsoup.parser;

/* loaded from: classes10.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    private String f79438a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f79439b;

    final void a(char c11) {
        StringBuilder sb2 = this.f79439b;
        if (sb2 != null) {
            sb2.append(c11);
            return;
        }
        if (this.f79438a == null) {
            this.f79438a = String.valueOf(c11);
            return;
        }
        StringBuilder b11 = Of.k.b();
        this.f79439b = b11;
        b11.append(this.f79438a);
        this.f79438a = null;
        this.f79439b.append(c11);
    }

    final void b(String str) {
        StringBuilder sb2 = this.f79439b;
        if (sb2 != null) {
            sb2.append(str);
            return;
        }
        if (this.f79438a == null) {
            this.f79438a = str;
            return;
        }
        StringBuilder b11 = Of.k.b();
        this.f79439b = b11;
        b11.append(this.f79438a);
        this.f79438a = null;
        this.f79439b.append(str);
    }

    final void c(int i11) {
        StringBuilder sb2 = this.f79439b;
        if (sb2 != null) {
            sb2.appendCodePoint(i11);
            return;
        }
        if (this.f79438a == null) {
            this.f79438a = String.valueOf(Character.toChars(i11));
            return;
        }
        StringBuilder b11 = Of.k.b();
        this.f79439b = b11;
        b11.append(this.f79438a);
        this.f79438a = null;
        this.f79439b.appendCodePoint(i11);
    }

    final boolean d() {
        return (this.f79439b == null && this.f79438a == null) ? false : true;
    }

    final void e() {
        StringBuilder sb2 = this.f79439b;
        if (sb2 != null) {
            Of.k.m(sb2);
            this.f79439b = null;
        }
        this.f79438a = null;
    }

    final void f(String str) {
        e();
        this.f79438a = str;
    }

    final String g() {
        StringBuilder sb2 = this.f79439b;
        if (sb2 == null) {
            String str = this.f79438a;
            return str != null ? str : "";
        }
        this.f79438a = sb2.toString();
        Of.k.l(this.f79439b);
        this.f79439b = null;
        return this.f79438a;
    }

    public final String toString() {
        StringBuilder sb2 = this.f79439b;
        if (sb2 != null) {
            return sb2.toString();
        }
        String str = this.f79438a;
        return str != null ? str : "";
    }
}
