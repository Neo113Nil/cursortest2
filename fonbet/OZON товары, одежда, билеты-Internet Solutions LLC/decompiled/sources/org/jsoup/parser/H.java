package org.jsoup.parser;

import Pf.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.wallet.WalletConstants;
import java.util.Arrays;
import org.jsoup.parser.C;

/* loaded from: classes10.dex */
final class H {

    /* renamed from: u, reason: collision with root package name */
    private static final char[] f79442u;

    /* renamed from: v, reason: collision with root package name */
    static final int[] f79443v = {8364, 129, 8218, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a, reason: collision with root package name */
    private final C8817f f79444a;

    /* renamed from: b, reason: collision with root package name */
    private final C8821j f79445b;

    /* renamed from: h, reason: collision with root package name */
    final C.g f79451h;

    /* renamed from: i, reason: collision with root package name */
    final C.f f79452i;

    /* renamed from: j, reason: collision with root package name */
    C.h f79453j;

    /* renamed from: n, reason: collision with root package name */
    final C.j f79457n;

    /* renamed from: o, reason: collision with root package name */
    private String f79458o;

    /* renamed from: p, reason: collision with root package name */
    private String f79459p;

    /* renamed from: q, reason: collision with root package name */
    private int f79460q;

    /* renamed from: c, reason: collision with root package name */
    private I f79446c = I.Data;

    /* renamed from: d, reason: collision with root package name */
    private C f79447d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f79448e = false;

    /* renamed from: f, reason: collision with root package name */
    final D f79449f = new D();

    /* renamed from: k, reason: collision with root package name */
    final C.b f79454k = new C.b();

    /* renamed from: l, reason: collision with root package name */
    final C.d f79455l = new C.d();

    /* renamed from: m, reason: collision with root package name */
    final C.c f79456m = new C.c();

    /* renamed from: r, reason: collision with root package name */
    private int f79461r = 0;

    /* renamed from: s, reason: collision with root package name */
    private final int[] f79462s = new int[1];

    /* renamed from: t, reason: collision with root package name */
    private final int[] f79463t = new int[2];

    /* renamed from: g, reason: collision with root package name */
    final f.a.EnumC0445a f79450g = f.a.EnumC0445a.html;

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f79442u = cArr;
        Arrays.sort(cArr);
    }

    H(C8818g c8818g) {
        C.g gVar = new C.g(c8818g);
        this.f79451h = gVar;
        this.f79453j = gVar;
        this.f79452i = new C.f(c8818g);
        C.j jVar = new C.j(C.i.XmlDecl, c8818g);
        jVar.f79437q = true;
        this.f79457n = jVar;
        this.f79444a = c8818g.f79465b;
        this.f79445b = c8818g.f79464a.b();
    }

    private void d(String str, Object... objArr) {
        C8821j c8821j = this.f79445b;
        if (c8821j.a()) {
            c8821j.add(new C8820i(this.f79444a, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    final void a(I i11) {
        s(i11);
        this.f79444a.c();
    }

    final String b() {
        return this.f79458o;
    }

    final String c() {
        if (this.f79459p == null) {
            this.f79459p = "</" + this.f79458o;
        }
        return this.f79459p;
    }

    final int[] e(Character ch2, boolean z11) {
        int i11;
        C8817f c8817f = this.f79444a;
        if (!c8817f.O() && ((ch2 == null || ch2.charValue() != c8817f.L()) && !c8817f.l0(f79442u))) {
            c8817f.W();
            boolean X9 = c8817f.X("#");
            int[] iArr = this.f79462s;
            if (X9) {
                boolean Z11 = c8817f.Z("X");
                String q11 = Z11 ? c8817f.q() : c8817f.p();
                if (q11.isEmpty()) {
                    d("numeric reference with no numerals", new Object[0]);
                    c8817f.K0();
                    return null;
                }
                c8817f.V0();
                if (!c8817f.X(";")) {
                    d("missing semicolon on [&#%s]", q11);
                }
                try {
                    i11 = Integer.valueOf(q11, Z11 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i11 = -1;
                }
                if (i11 == -1 || i11 > 1114111) {
                    d("character [%s] outside of valid range", Integer.valueOf(i11));
                    iArr[0] = 65533;
                } else {
                    if (i11 >= 128 && i11 < 160) {
                        d("character [%s] is not a valid unicode code point", Integer.valueOf(i11));
                        i11 = f79443v[i11 - UserVerificationMethods.USER_VERIFY_PATTERN];
                    }
                    iArr[0] = i11;
                }
                return iArr;
            }
            String s11 = c8817f.s();
            boolean b02 = c8817f.b0(';');
            if (!Pf.j.h(s11) && (!Pf.j.i(s11) || !b02)) {
                c8817f.K0();
                if (b02) {
                    d("invalid named reference [%s]", s11);
                }
                if (!z11) {
                    s11 = Pf.j.g(s11);
                    if (!s11.isEmpty()) {
                        c8817f.X(s11);
                    }
                }
            }
            if (z11 && (c8817f.o0() || c8817f.r0() || c8817f.d0('=', '-', '_'))) {
                c8817f.K0();
                return null;
            }
            c8817f.V0();
            if (!c8817f.X(";")) {
                d("missing semicolon on [&%s]", s11);
            }
            int[] iArr2 = this.f79463t;
            int e11 = Pf.j.e(s11, iArr2);
            if (e11 == 1) {
                iArr[0] = iArr2[0];
                return iArr;
            }
            if (e11 == 2) {
                return iArr2;
            }
            throw new Nf.c("Unexpected characters returned for ".concat(s11));
        }
        return null;
    }

    final C.h f(boolean z11) {
        C.h hVar;
        if (z11) {
            hVar = this.f79451h;
            hVar.f();
        } else {
            hVar = this.f79452i;
            hVar.f();
        }
        this.f79453j = hVar;
        return hVar;
    }

    final void g() {
        this.f79449f.e();
    }

    final void h(char c11) {
        C.b bVar = this.f79454k;
        bVar.f79417d.a(c11);
        bVar.f79415b = this.f79461r;
        bVar.f79416c = this.f79444a.D0();
    }

    final void i(String str) {
        C.b bVar = this.f79454k;
        bVar.f79417d.b(str);
        bVar.f79415b = this.f79461r;
        bVar.f79416c = this.f79444a.D0();
    }

    final void j(C c11) {
        if (this.f79448e) {
            throw new Nf.c("Must be false");
        }
        this.f79447d = c11;
        this.f79448e = true;
        c11.f79415b = this.f79460q;
        C8817f c8817f = this.f79444a;
        c11.f79416c = c8817f.D0();
        this.f79461r = c8817f.D0();
        C.i iVar = C.i.StartTag;
        C.i iVar2 = c11.f79414a;
        if (iVar2 == iVar) {
            this.f79458o = ((C.g) c11).f79424d.g();
            this.f79459p = null;
        } else if (iVar2 == C.i.EndTag) {
            C.f fVar = (C.f) c11;
            if (fVar.f79427g != null) {
                o("Attributes incorrectly present on end tag [/%s]", fVar.q());
            }
        }
    }

    final void k() {
        j(this.f79456m);
    }

    final void l() {
        j(this.f79455l);
    }

    final void m() {
        this.f79453j.n();
        j(this.f79453j);
    }

    final void n(I i11) {
        C8821j c8821j = this.f79445b;
        if (c8821j.a()) {
            c8821j.add(new C8820i(this.f79444a, "Unexpectedly reached end of file (EOF) in input state [%s]", i11));
        }
    }

    final void o(String str, Object... objArr) {
        C8821j c8821j = this.f79445b;
        if (c8821j.a()) {
            c8821j.add(new C8820i(this.f79444a, str, objArr));
        }
    }

    final void p(I i11) {
        C8821j c8821j = this.f79445b;
        if (c8821j.a()) {
            C8817f c8817f = this.f79444a;
            c8821j.add(new C8820i(c8817f, "Unexpected character '%s' in input state [%s]", Character.valueOf(c8817f.L()), i11));
        }
    }

    final boolean q() {
        return this.f79458o != null && this.f79453j.f79424d.g().equalsIgnoreCase(this.f79458o);
    }

    final C r() {
        while (!this.f79448e) {
            this.f79446c.f(this, this.f79444a);
        }
        C.b bVar = this.f79454k;
        if (bVar.f79417d.d()) {
            return bVar;
        }
        this.f79448e = false;
        return this.f79447d;
    }

    final void s(I i11) {
        if (i11 == I.TagOpen) {
            this.f79460q = this.f79444a.D0();
        }
        this.f79446c = i11;
    }
}
