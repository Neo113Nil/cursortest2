package org.jsoup.parser;

import C.o0;
import Ij.C3261b;
import Of.C3707a;
import Pf.q;

/* loaded from: classes10.dex */
abstract class C {

    /* renamed from: a, reason: collision with root package name */
    final i f79414a;

    /* renamed from: b, reason: collision with root package name */
    int f79415b;

    /* renamed from: c, reason: collision with root package name */
    int f79416c = -1;

    static final class a extends b {
        @Override // org.jsoup.parser.C.b
        public final String toString() {
            return o0.c(new StringBuilder("<![CDATA["), this.f79417d.g(), "]]>");
        }
    }

    static final class c extends C {

        /* renamed from: d, reason: collision with root package name */
        private final D f79418d;

        c() {
            super(i.Comment);
            this.f79418d = new D();
        }

        @Override // org.jsoup.parser.C
        final void f() {
            super.f();
            this.f79418d.e();
        }

        final void g(char c11) {
            this.f79418d.a(c11);
        }

        final void h(String str) {
            this.f79418d.b(str);
        }

        final String i() {
            return this.f79418d.g();
        }

        public final String toString() {
            return o0.c(new StringBuilder("<!--"), this.f79418d.g(), "-->");
        }
    }

    static final class d extends C {

        /* renamed from: d, reason: collision with root package name */
        final D f79419d;

        /* renamed from: e, reason: collision with root package name */
        String f79420e;

        /* renamed from: f, reason: collision with root package name */
        final D f79421f;

        /* renamed from: g, reason: collision with root package name */
        final D f79422g;

        /* renamed from: h, reason: collision with root package name */
        boolean f79423h;

        d() {
            super(i.Doctype);
            this.f79419d = new D();
            this.f79420e = null;
            this.f79421f = new D();
            this.f79422g = new D();
            this.f79423h = false;
        }

        @Override // org.jsoup.parser.C
        final void f() {
            super.f();
            this.f79419d.e();
            this.f79420e = null;
            this.f79421f.e();
            this.f79422g.e();
            this.f79423h = false;
        }

        public final String toString() {
            return o0.c(new StringBuilder("<!doctype "), this.f79419d.g(), ">");
        }
    }

    static final class e extends C {
        e() {
            super(i.EOF);
        }

        public final String toString() {
            return "";
        }
    }

    static final class f extends h {
        f(J j11) {
            super(i.EndTag, j11);
        }

        public final String toString() {
            return o0.c(new StringBuilder("</"), t(), ">");
        }
    }

    static final class g extends h {
        g(C8818g c8818g) {
            super(i.StartTag, c8818g);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.C.h, org.jsoup.parser.C
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final h f() {
            super.f();
            this.f79427g = null;
            return this;
        }

        public final String toString() {
            String str = this.f79426f ? "/>" : ">";
            Pf.b bVar = this.f79427g;
            if (!(bVar != null) || bVar.size() <= 0) {
                return o0.c(new StringBuilder("<"), t(), str);
            }
            return "<" + t() + " " + this.f79427g.toString() + str;
        }
    }

    static abstract class h extends C {

        /* renamed from: d, reason: collision with root package name */
        protected D f79424d;

        /* renamed from: e, reason: collision with root package name */
        protected String f79425e;

        /* renamed from: f, reason: collision with root package name */
        boolean f79426f;

        /* renamed from: g, reason: collision with root package name */
        Pf.b f79427g;

        /* renamed from: h, reason: collision with root package name */
        private final D f79428h;

        /* renamed from: i, reason: collision with root package name */
        private final D f79429i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f79430j;

        /* renamed from: k, reason: collision with root package name */
        final J f79431k;

        /* renamed from: l, reason: collision with root package name */
        final boolean f79432l;

        /* renamed from: m, reason: collision with root package name */
        int f79433m;

        /* renamed from: n, reason: collision with root package name */
        int f79434n;

        /* renamed from: o, reason: collision with root package name */
        int f79435o;

        /* renamed from: p, reason: collision with root package name */
        int f79436p;

        h(i iVar, J j11) {
            super(iVar);
            this.f79424d = new D();
            this.f79426f = false;
            this.f79428h = new D();
            this.f79429i = new D();
            this.f79430j = false;
            this.f79431k = j11;
            this.f79432l = j11.f79475l;
        }

        private void m(int i11, int i12) {
            if (this.f79432l) {
                int i13 = this.f79435o;
                if (i13 > -1) {
                    i11 = i13;
                }
                this.f79435o = i11;
                this.f79436p = i12;
            }
        }

        final void g(int i11, char c11, int i12) {
            this.f79428h.a(c11);
            if (this.f79432l) {
                int i13 = this.f79433m;
                if (i13 > -1) {
                    i11 = i13;
                }
                this.f79433m = i11;
                this.f79434n = i12;
            }
        }

        final void h(int i11, int i12, String str) {
            this.f79428h.b(str.replace((char) 0, (char) 65533));
            if (this.f79432l) {
                int i13 = this.f79433m;
                if (i13 > -1) {
                    i11 = i13;
                }
                this.f79433m = i11;
                this.f79434n = i12;
            }
        }

        final void i(int i11, char c11, int i12) {
            this.f79429i.a(c11);
            m(i11, i12);
        }

        final void j(int i11, int i12, String str) {
            this.f79429i.b(str);
            m(i11, i12);
        }

        final void k(int i11, int i12, int[] iArr) {
            for (int i13 : iArr) {
                this.f79429i.c(i13);
            }
            m(i11, i12);
        }

        final void l(String str) {
            String replace = str.replace((char) 0, (char) 65533);
            D d11 = this.f79424d;
            d11.b(replace);
            this.f79425e = C3707a.b(d11.g());
        }

        final void n() {
            if (this.f79428h.d()) {
                p();
            }
        }

        final void o(String str) {
            D d11 = this.f79424d;
            d11.f(str);
            this.f79425e = C3707a.b(d11.g());
        }

        final void p() {
            if (this.f79427g == null) {
                this.f79427g = new Pf.b();
            }
            D d11 = this.f79428h;
            boolean d12 = d11.d();
            boolean z11 = this.f79432l;
            D d13 = this.f79429i;
            if (d12 && this.f79427g.size() < 512) {
                String trim = d11.g().trim();
                if (!trim.isEmpty()) {
                    this.f79427g.c(trim, d13.d() ? d13.g() : this.f79430j ? "" : null);
                    if (z11 && e()) {
                        J j11 = ((g) this).f79431k;
                        C8817f c8817f = j11.f79465b;
                        if (!j11.f79471h.d()) {
                            trim = C3707a.a(trim);
                        }
                        if (!this.f79427g.z(trim).a().a()) {
                            if (!d13.d()) {
                                int i11 = this.f79434n;
                                this.f79436p = i11;
                                this.f79435o = i11;
                            }
                            int i12 = this.f79433m;
                            q.b bVar = new q.b(i12, c8817f.R(i12), c8817f.k(this.f79433m));
                            int i13 = this.f79434n;
                            Pf.q qVar = new Pf.q(bVar, new q.b(i13, c8817f.R(i13), c8817f.k(this.f79434n)));
                            int i14 = this.f79435o;
                            q.b bVar2 = new q.b(i14, c8817f.R(i14), c8817f.k(this.f79435o));
                            int i15 = this.f79436p;
                            this.f79427g.A(trim, new q.a(qVar, new Pf.q(bVar2, new q.b(i15, c8817f.R(i15), c8817f.k(this.f79436p)))));
                        }
                    }
                }
            }
            d11.e();
            d13.e();
            this.f79430j = false;
            if (z11) {
                this.f79436p = -1;
                this.f79435o = -1;
                this.f79434n = -1;
                this.f79433m = -1;
            }
        }

        final String q() {
            String str = this.f79425e;
            if (str == null || str.isEmpty()) {
                throw new Nf.c("Must be false");
            }
            return this.f79425e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.C
        /* renamed from: r */
        public h f() {
            super.f();
            this.f79424d.e();
            this.f79425e = null;
            this.f79426f = false;
            this.f79427g = null;
            this.f79428h.e();
            this.f79429i.e();
            this.f79430j = false;
            if (this.f79432l) {
                this.f79436p = -1;
                this.f79435o = -1;
                this.f79434n = -1;
                this.f79433m = -1;
            }
            return this;
        }

        final void s() {
            this.f79430j = true;
        }

        final String t() {
            String g10 = this.f79424d.g();
            return g10.isEmpty() ? "[unset]" : g10;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class i {
        private static final /* synthetic */ i[] $VALUES;
        public static final i Character;
        public static final i Comment;
        public static final i Doctype;
        public static final i EOF;
        public static final i EndTag;
        public static final i StartTag;
        public static final i XmlDecl;

        static {
            i iVar = new i("Doctype", 0);
            Doctype = iVar;
            i iVar2 = new i("StartTag", 1);
            StartTag = iVar2;
            i iVar3 = new i("EndTag", 2);
            EndTag = iVar3;
            i iVar4 = new i("Comment", 3);
            Comment = iVar4;
            i iVar5 = new i("Character", 4);
            Character = iVar5;
            i iVar6 = new i("XmlDecl", 5);
            XmlDecl = iVar6;
            i iVar7 = new i("EOF", 6);
            EOF = iVar7;
            $VALUES = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
        }

        private i() {
            throw null;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) $VALUES.clone();
        }
    }

    static final class j extends h {

        /* renamed from: q, reason: collision with root package name */
        boolean f79437q;

        @Override // org.jsoup.parser.C.h
        /* renamed from: r */
        final /* bridge */ /* synthetic */ h f() {
            f();
            return this;
        }

        public final String toString() {
            boolean z11 = this.f79437q;
            String str = z11 ? "<!" : "<?";
            String str2 = z11 ? ">" : "?>";
            Pf.b bVar = this.f79427g;
            if (bVar == null || bVar.size() <= 0) {
                return o0.c(C3261b.e(str), t(), str2);
            }
            StringBuilder e11 = C3261b.e(str);
            e11.append(t());
            e11.append(" ");
            e11.append(this.f79427g.toString());
            e11.append(str2);
            return e11.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.C.h, org.jsoup.parser.C
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final void f() {
            super.f();
            this.f79437q = true;
        }
    }

    C(i iVar) {
        this.f79414a = iVar;
    }

    final boolean a() {
        return this.f79414a == i.Comment;
    }

    final boolean b() {
        return this.f79414a == i.Doctype;
    }

    final boolean c() {
        return this.f79414a == i.EOF;
    }

    final boolean d() {
        return this.f79414a == i.EndTag;
    }

    final boolean e() {
        return this.f79414a == i.StartTag;
    }

    void f() {
        this.f79415b = -1;
        this.f79416c = -1;
    }

    static class b extends C {

        /* renamed from: d, reason: collision with root package name */
        final D f79417d;

        b() {
            super(i.Character);
            this.f79417d = new D();
        }

        @Override // org.jsoup.parser.C
        final void f() {
            super.f();
            this.f79417d.e();
        }

        public String toString() {
            return this.f79417d.g();
        }

        b(b bVar) {
            super(i.Character);
            D d11 = new D();
            this.f79417d = d11;
            this.f79415b = bVar.f79415b;
            this.f79416c = bVar.f79416c;
            d11.f(bVar.f79417d.g());
        }
    }
}
