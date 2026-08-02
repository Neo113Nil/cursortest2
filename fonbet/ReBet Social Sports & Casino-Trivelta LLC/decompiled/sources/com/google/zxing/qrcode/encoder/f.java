package com.google.zxing.qrcode.encoder;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Qb.b f38454a;

    /* renamed from: b, reason: collision with root package name */
    public Qb.a f38455b;

    /* renamed from: c, reason: collision with root package name */
    public Qb.c f38456c;

    /* renamed from: d, reason: collision with root package name */
    public int f38457d = -1;

    /* renamed from: e, reason: collision with root package name */
    public b f38458e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f38458e;
    }

    public void c(Qb.a aVar) {
        this.f38455b = aVar;
    }

    public void d(int i10) {
        this.f38457d = i10;
    }

    public void e(b bVar) {
        this.f38458e = bVar;
    }

    public void f(Qb.b bVar) {
        this.f38454a = bVar;
    }

    public void g(Qb.c cVar) {
        this.f38456c = cVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f38454a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f38455b);
        sb2.append("\n version: ");
        sb2.append(this.f38456c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f38457d);
        if (this.f38458e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f38458e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
