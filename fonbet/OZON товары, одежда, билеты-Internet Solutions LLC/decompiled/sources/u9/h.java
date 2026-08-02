package u9;

import java.nio.charset.StandardCharsets;

/* loaded from: classes9.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f100405a;

    /* renamed from: b, reason: collision with root package name */
    private l f100406b;

    /* renamed from: c, reason: collision with root package name */
    private h9.f f100407c;

    /* renamed from: d, reason: collision with root package name */
    private h9.f f100408d;

    /* renamed from: e, reason: collision with root package name */
    private final StringBuilder f100409e;

    /* renamed from: f, reason: collision with root package name */
    int f100410f;

    /* renamed from: g, reason: collision with root package name */
    private int f100411g;

    /* renamed from: h, reason: collision with root package name */
    private k f100412h;

    /* renamed from: i, reason: collision with root package name */
    private int f100413i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i11 = 0; i11 < length; i11++) {
            char c11 = (char) (bytes[i11] & 255);
            if (c11 == '?' && str.charAt(i11) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c11);
        }
        this.f100405a = sb2.toString();
        this.f100406b = l.FORCE_NONE;
        this.f100409e = new StringBuilder(str.length());
        this.f100411g = -1;
    }

    public final int a() {
        return this.f100409e.length();
    }

    public final StringBuilder b() {
        return this.f100409e;
    }

    public final char c() {
        return this.f100405a.charAt(this.f100410f);
    }

    public final String d() {
        return this.f100405a;
    }

    public final int e() {
        return this.f100411g;
    }

    public final int f() {
        return (this.f100405a.length() - this.f100413i) - this.f100410f;
    }

    public final k g() {
        return this.f100412h;
    }

    public final boolean h() {
        return this.f100410f < this.f100405a.length() - this.f100413i;
    }

    public final void i() {
        this.f100411g = -1;
    }

    public final void j() {
        this.f100412h = null;
    }

    public final void k(h9.f fVar, h9.f fVar2) {
        this.f100407c = fVar;
        this.f100408d = fVar2;
    }

    public final void l() {
        this.f100413i = 2;
    }

    public final void m(l lVar) {
        this.f100406b = lVar;
    }

    public final void n(int i11) {
        this.f100411g = i11;
    }

    public final void o() {
        p(this.f100409e.length());
    }

    public final void p(int i11) {
        k kVar = this.f100412h;
        if (kVar == null || i11 > kVar.a()) {
            this.f100412h = k.l(i11, this.f100406b, this.f100407c, this.f100408d);
        }
    }

    public final void q(char c11) {
        this.f100409e.append(c11);
    }

    public final void r(String str) {
        this.f100409e.append(str);
    }
}
