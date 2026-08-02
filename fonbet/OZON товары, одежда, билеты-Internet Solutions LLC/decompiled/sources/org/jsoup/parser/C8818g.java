package org.jsoup.parser;

import C.o0;
import Of.C3707a;
import java.io.StringReader;
import java.util.ArrayList;
import org.jsoup.parser.C;
import org.jsoup.parser.EnumC8819h;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

/* renamed from: org.jsoup.parser.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8818g extends J {

    /* renamed from: m, reason: collision with root package name */
    private EnumC8819h f79507m;

    /* renamed from: n, reason: collision with root package name */
    private EnumC8819h f79508n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f79509o;

    /* renamed from: p, reason: collision with root package name */
    private Pf.h f79510p;

    /* renamed from: q, reason: collision with root package name */
    private Pf.l f79511q;

    /* renamed from: r, reason: collision with root package name */
    ArrayList<Pf.h> f79512r;

    /* renamed from: s, reason: collision with root package name */
    private ArrayList<EnumC8819h> f79513s;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList f79514t;

    /* renamed from: u, reason: collision with root package name */
    private C.f f79515u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f79516v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f79517w;

    /* renamed from: x, reason: collision with root package name */
    private final String[] f79518x = {null};

    /* renamed from: y, reason: collision with root package name */
    static final String[] f79505y = {"applet", "caption", "html", "marquee", "object", "table", "td", "template", "th"};

    /* renamed from: z, reason: collision with root package name */
    static final String[] f79506z = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};

    /* renamed from: A, reason: collision with root package name */
    static final String[] f79493A = {"desc", "foreignObject", SelectionItemFormDTO.TITLE_FIELD_NAME};

    /* renamed from: B, reason: collision with root package name */
    static final String[] f79494B = {"ol", "ul"};

    /* renamed from: C, reason: collision with root package name */
    static final String[] f79495C = {"button"};

    /* renamed from: D, reason: collision with root package name */
    static final String[] f79496D = {"html", "table"};

    /* renamed from: E, reason: collision with root package name */
    static final String[] f79497E = {"optgroup", "option"};

    /* renamed from: F, reason: collision with root package name */
    static final String[] f79498F = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};

    /* renamed from: G, reason: collision with root package name */
    static final String[] f79499G = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* renamed from: H, reason: collision with root package name */
    static final String[] f79500H = {FormPageDTO.Field.FIELD_TYPE_ADDRESS, "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", RichContentDTO.ALIGN_CENTER, "col", "colgroup", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", CommentV3DTO.FOOTER_FIELD_NAME, DynamicElementDTO.FORM, "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", CommentV3DTO.HEADER_FIELD_NAME, "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "search", "section", "select", "source", "style", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", SelectionItemFormDTO.TITLE_FIELD_NAME, "tr", "track", "ul", "wbr", "xmp"};

    /* renamed from: I, reason: collision with root package name */
    static String[] f79501I = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};

    /* renamed from: J, reason: collision with root package name */
    static final String[] f79502J = {"mi", "mn", "mo", "ms", "mtext"};

    /* renamed from: K, reason: collision with root package name */
    static final String[] f79503K = {"desc", "foreignObject", SelectionItemFormDTO.TITLE_FIELD_NAME};

    /* renamed from: L, reason: collision with root package name */
    static final String[] f79504L = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    private boolean I(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f79468e.size();
        int i11 = size - 1;
        int i12 = i11 > 100 ? size - 101 : 0;
        while (i11 >= i12) {
            Pf.h hVar = this.f79468e.get(i11);
            String x11 = hVar.x();
            String str = hVar.V().f79568a;
            if (!str.equals("http://www.w3.org/1999/xhtml")) {
                if (strArr2 == f79505y) {
                    if (str.equals("http://www.w3.org/1998/Math/MathML")) {
                        if (Of.k.d(x11, f79506z)) {
                            break;
                        }
                    }
                    if (str.equals("http://www.w3.org/2000/svg") && Of.k.d(x11, f79493A)) {
                        break;
                    }
                } else {
                    continue;
                }
                i11--;
            } else if (!Of.k.d(x11, strArr)) {
                if (Of.k.d(x11, strArr2)) {
                    break;
                }
                if (strArr3 != null && Of.k.d(x11, strArr3)) {
                    break;
                }
                i11--;
            } else {
                return true;
            }
        }
        return false;
    }

    static boolean S(Pf.h hVar) {
        String x11;
        String str = hVar.V().f79568a;
        x11 = hVar.x();
        str.getClass();
        switch (str) {
            case "http://www.w3.org/1999/xhtml":
                return Of.k.d(x11, f79500H);
            case "http://www.w3.org/2000/svg":
                return Of.k.d(x11, f79503K);
            case "http://www.w3.org/1998/Math/MathML":
                return Of.k.d(x11, f79501I);
            default:
                return false;
        }
    }

    private static boolean X(ArrayList<Pf.h> arrayList, Pf.h hVar) {
        int size = arrayList.size();
        int i11 = size - 1;
        int i12 = i11 >= 256 ? size - 257 : 0;
        while (i11 >= i12) {
            if (arrayList.get(i11) == hVar) {
                return true;
            }
            i11--;
        }
        return false;
    }

    private void n(String... strArr) {
        for (int size = this.f79468e.size() - 1; size >= 0; size--) {
            Pf.h hVar = this.f79468e.get(size);
            if ("http://www.w3.org/1999/xhtml".equals(hVar.V().f79568a) && (Of.k.c(hVar.x(), strArr) || hVar.t("html"))) {
                return;
            }
            d();
        }
    }

    private void t(Pf.h hVar) {
        Pf.h hVar2;
        if (this.f79511q != null && hVar.V().f79568a.equals("http://www.w3.org/1999/xhtml") && Of.k.d(hVar.x(), f79504L)) {
            this.f79511q.Y(hVar);
        }
        if (this.f79464a.b().a() && hVar.q("xmlns") && !hVar.c("xmlns").equals(hVar.V().f79568a)) {
            Object[] objArr = {hVar.c("xmlns"), hVar.X()};
            C8821j b11 = this.f79464a.b();
            if (b11.a()) {
                b11.add(new C8820i(this.f79465b, "Invalid xmlns attribute [%s] on tag [%s]", objArr));
            }
        }
        if (this.f79517w && Of.k.d(a().x(), EnumC8819h.z.f79557z)) {
            Pf.h A11 = A("table");
            boolean z11 = false;
            if (A11 == null) {
                hVar2 = this.f79468e.get(0);
            } else if (A11.U() != null) {
                hVar2 = A11.U();
                z11 = true;
            } else {
                hVar2 = j(A11);
            }
            if (z11) {
                Nf.b.d(A11);
                A11.O(hVar);
            } else {
                hVar2.M(hVar);
            }
        } else {
            a().M(hVar);
        }
        this.f79468e.add(hVar);
        i(hVar, true);
    }

    final Pf.h A(String str) {
        int size = this.f79468e.size();
        int i11 = size - 1;
        int i12 = i11 >= 256 ? size - 257 : 0;
        while (i11 >= i12) {
            Pf.h hVar = this.f79468e.get(i11);
            if (hVar.Q(str)) {
                return hVar;
            }
            i11--;
        }
        return null;
    }

    final Pf.h B() {
        return this.f79510p;
    }

    final ArrayList C() {
        return this.f79514t;
    }

    final boolean D(String str) {
        String[] strArr = f79495C;
        String[] strArr2 = f79505y;
        String[] strArr3 = this.f79518x;
        strArr3[0] = str;
        return I(strArr3, strArr2, strArr);
    }

    final boolean E(String str) {
        String[] strArr = f79494B;
        String[] strArr2 = f79505y;
        String[] strArr3 = this.f79518x;
        strArr3[0] = str;
        return I(strArr3, strArr2, strArr);
    }

    final boolean F(String str) {
        String[] strArr = f79505y;
        String[] strArr2 = this.f79518x;
        strArr2[0] = str;
        return I(strArr2, strArr, null);
    }

    final boolean G(String[] strArr) {
        return I(strArr, f79505y, null);
    }

    final boolean H(String str) {
        for (int size = this.f79468e.size() - 1; size >= 0; size--) {
            String x11 = this.f79468e.get(size).x();
            if (x11.equals(str)) {
                return true;
            }
            if (!Of.k.d(x11, f79497E)) {
                return false;
            }
        }
        throw new Nf.c("Should not be reachable");
    }

    final boolean J(String str) {
        String[] strArr = f79496D;
        String[] strArr2 = this.f79518x;
        strArr2[0] = str;
        return I(strArr2, strArr, null);
    }

    final void K(C.b bVar) {
        L(bVar, a());
    }

    final void L(C.b bVar, Pf.h hVar) {
        String g10 = bVar.f79417d.g();
        Pf.n cVar = bVar instanceof C.a ? new Pf.c(g10) : hVar.V().c(256) ? new Pf.e(g10) : new Pf.r(g10);
        hVar.M(cVar);
        i(cVar, true);
    }

    final void M(C.c cVar) {
        Pf.d dVar = new Pf.d(cVar.i());
        a().M(dVar);
        i(dVar, true);
    }

    final Pf.h N(C.g gVar) {
        Pf.h s11 = s(gVar, "http://www.w3.org/1999/xhtml", false);
        t(s11);
        if (gVar.f79426f) {
            m V11 = s11.V();
            V11.f79571d |= 32;
            if (V11.g() && (V11.e() || V11.h())) {
                this.f79466c.s(I.Data);
                H h11 = this.f79466c;
                C.f fVar = this.f79515u;
                fVar.f();
                fVar.o(s11.X());
                h11.j(fVar);
                return s11;
            }
            this.f79466c.o("Tag [%s] cannot be self-closing; not a void tag", V11.f79570c);
        }
        return s11;
    }

    final Pf.h O(C.g gVar) {
        Pf.h s11 = s(gVar, "http://www.w3.org/1999/xhtml", false);
        t(s11);
        d();
        return s11;
    }

    final void P(C.g gVar, String str) {
        Pf.h s11 = s(gVar, str, true);
        t(s11);
        if (gVar.f79426f) {
            s11.V().f79571d |= 32;
            d();
        }
    }

    final void Q(C.g gVar, boolean z11, boolean z12) {
        Pf.l lVar = (Pf.l) s(gVar, "http://www.w3.org/1999/xhtml", false);
        if (!z12) {
            this.f79511q = lVar;
        } else if (!W("template")) {
            this.f79511q = lVar;
        }
        t(lVar);
        if (z11) {
            return;
        }
        d();
    }

    final boolean R(Pf.h hVar) {
        return X(this.f79512r, hVar);
    }

    final void T() {
        this.f79508n = this.f79507m;
    }

    final void U(Pf.h hVar) {
        if (this.f79509o) {
            return;
        }
        String a11 = hVar.a("href");
        if (a11.length() != 0) {
            this.f79469f = a11;
            this.f79509o = true;
            this.f79467d.J(a11);
        }
    }

    final boolean V(Pf.h hVar) {
        return X(this.f79468e, hVar);
    }

    final boolean W(String str) {
        return A(str) != null;
    }

    final boolean Y(String[] strArr) {
        int size = this.f79468e.size();
        int i11 = size - 1;
        int i12 = i11 > 100 ? size - 101 : 0;
        while (i11 >= i12) {
            if (!Of.k.d(this.f79468e.get(i11).x(), strArr)) {
                return true;
            }
            i11--;
        }
        return false;
    }

    final EnumC8819h Z() {
        return this.f79508n;
    }

    final void a0(String str) {
        for (int size = this.f79468e.size() - 1; size >= 0 && !d().Q(str); size--) {
        }
    }

    final void b0() {
        if (this.f79513s.size() > 0) {
            this.f79513s.remove(r0.size() - 1);
        }
    }

    @Override // org.jsoup.parser.J
    protected final void c(StringReader stringReader, l lVar) {
        super.c(stringReader, lVar);
        this.f79507m = EnumC8819h.Initial;
        this.f79508n = null;
        this.f79509o = false;
        this.f79510p = null;
        this.f79511q = null;
        this.f79512r = new ArrayList<>();
        this.f79513s = new ArrayList<>();
        this.f79514t = new ArrayList();
        this.f79515u = new C.f(this);
        this.f79516v = true;
        this.f79517w = false;
    }

    final void c0(EnumC8819h enumC8819h) {
        this.f79513s.add(enumC8819h);
    }

    final void d0() {
        if (this.f79468e.size() > 256) {
            return;
        }
        boolean z11 = true;
        Pf.h hVar = this.f79512r.size() > 0 ? (Pf.h) o0.b(1, this.f79512r) : null;
        if (hVar == null || X(this.f79468e, hVar)) {
            return;
        }
        int size = this.f79512r.size();
        int i11 = size - 12;
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = size - 1;
        int i13 = i12;
        while (i13 != i11) {
            i13--;
            hVar = this.f79512r.get(i13);
            if (hVar == null || X(this.f79468e, hVar)) {
                z11 = false;
                break;
            }
        }
        while (true) {
            if (!z11) {
                i13++;
                hVar = this.f79512r.get(i13);
            }
            Nf.b.d(hVar);
            Pf.h hVar2 = new Pf.h(this.f79472i.d(hVar.w(), hVar.x(), "http://www.w3.org/1999/xhtml", this.f79471h.e()), null, hVar.e().clone());
            t(hVar2);
            this.f79512r.set(i13, hVar2);
            if (i13 == i12) {
                return;
            } else {
                z11 = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if ("malignmark".equals(r3.f79425e) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r8.f79414a == org.jsoup.parser.C.i.Character) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        if (r2.equals("application/xhtml+xml") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (r8.f79414a != org.jsoup.parser.C.i.Character) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        if (Of.k.c(r0.X(), org.jsoup.parser.C8818g.f79503K) != false) goto L44;
     */
    @Override // org.jsoup.parser.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean e(C c11) {
        boolean z11 = true;
        if (!this.f79468e.isEmpty()) {
            Pf.h a11 = a();
            String str = a11.V().f79568a;
            if (!"http://www.w3.org/1999/xhtml".equals(str)) {
                if ("http://www.w3.org/1998/Math/MathML".equals(a11.V().f79568a) && Of.k.d(a11.x(), f79502J)) {
                    if (c11.e()) {
                        C.g gVar = (C.g) c11;
                        if (!"mglyph".equals(gVar.f79425e)) {
                        }
                    }
                }
                if (!"http://www.w3.org/1998/Math/MathML".equals(str) || !a11.t("annotation-xml") || !c11.e() || !"svg".equals(((C.g) c11).f79425e)) {
                    if ("http://www.w3.org/1998/Math/MathML".equals(a11.V().f79568a) && a11.t("annotation-xml")) {
                        String b11 = C3707a.b(a11.c("encoding"));
                        if (!b11.equals("text/html")) {
                        }
                        if (!c11.e()) {
                        }
                    }
                    if ("http://www.w3.org/2000/svg".equals(a11.V().f79568a)) {
                    }
                    z11 = c11.c();
                }
            }
        }
        return (z11 ? this.f79507m : EnumC8819h.ForeignContent).f(c11, this);
    }

    final void e0(Pf.h hVar) {
        for (int size = this.f79512r.size() - 1; size >= 0; size--) {
            if (this.f79512r.get(size) == hVar) {
                this.f79512r.remove(size);
                return;
            }
        }
    }

    final void f0(Pf.h hVar) {
        for (int size = this.f79468e.size() - 1; size >= 0; size--) {
            if (this.f79468e.get(size) == hVar) {
                this.f79468e.remove(size);
                i(hVar, false);
                return;
            }
        }
    }

    final void g0() {
        if (!W("body")) {
            ArrayList<Pf.h> arrayList = this.f79468e;
            Pf.f fVar = this.f79467d;
            Pf.h S11 = fVar.S();
            while (true) {
                if (S11 == null) {
                    S11 = fVar.N("html");
                    break;
                } else if (S11.t("html")) {
                    break;
                } else {
                    S11 = S11.u();
                }
            }
            Pf.h S12 = S11.S();
            while (true) {
                if (S12 == null) {
                    S12 = S11.N("body");
                    break;
                } else if (S12.t("body") || S12.t("frameset")) {
                    break;
                } else {
                    S12 = S12.u();
                }
            }
            arrayList.add(S12);
        }
        this.f79507m = EnumC8819h.InBody;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean h0() {
        char c11;
        int size = this.f79468e.size();
        int i11 = size - 1;
        int i12 = i11 >= 256 ? size - 257 : 0;
        EnumC8819h enumC8819h = this.f79507m;
        if (this.f79468e.size() == 0) {
            this.f79507m = EnumC8819h.InBody;
        }
        boolean z11 = false;
        while (true) {
            if (i11 >= i12) {
                Pf.h hVar = this.f79468e.get(i11);
                if (i11 == i12) {
                    z11 = true;
                }
                String x11 = hVar != null ? hVar.x() : "";
                if ("http://www.w3.org/1999/xhtml".equals(hVar.V().f79568a)) {
                    x11.getClass();
                    switch (x11.hashCode()) {
                        case -1644953643:
                            if (x11.equals("frameset")) {
                                c11 = 0;
                                break;
                            }
                            break;
                        case -1321546630:
                            if (x11.equals("template")) {
                                c11 = 1;
                                break;
                            }
                            break;
                        case -906021636:
                            if (x11.equals("select")) {
                                c11 = 2;
                                break;
                            }
                            break;
                        case -636197633:
                            if (x11.equals("colgroup")) {
                                c11 = 3;
                                break;
                            }
                            break;
                        case 3696:
                            if (x11.equals("td")) {
                                c11 = 4;
                                break;
                            }
                            break;
                        case 3700:
                            if (x11.equals("th")) {
                                c11 = 5;
                                break;
                            }
                            break;
                        case 3710:
                            if (x11.equals("tr")) {
                                c11 = 6;
                                break;
                            }
                            break;
                        case 3029410:
                            if (x11.equals("body")) {
                                c11 = 7;
                                break;
                            }
                            break;
                        case 3198432:
                            if (x11.equals("head")) {
                                c11 = '\b';
                                break;
                            }
                            break;
                        case 3213227:
                            if (x11.equals("html")) {
                                c11 = '\t';
                                break;
                            }
                            break;
                        case 110115790:
                            if (x11.equals("table")) {
                                c11 = '\n';
                                break;
                            }
                            break;
                        case 110157846:
                            if (x11.equals("tbody")) {
                                c11 = 11;
                                break;
                            }
                            break;
                        case 110277346:
                            if (x11.equals("tfoot")) {
                                c11 = '\f';
                                break;
                            }
                            break;
                        case 110326868:
                            if (x11.equals("thead")) {
                                c11 = '\r';
                                break;
                            }
                            break;
                        case 552573414:
                            if (x11.equals("caption")) {
                                c11 = 14;
                                break;
                            }
                            break;
                    }
                    c11 = 65535;
                    switch (c11) {
                        case 0:
                            this.f79507m = EnumC8819h.InFrameset;
                            break;
                        case 1:
                            EnumC8819h enumC8819h2 = this.f79513s.size() > 0 ? (EnumC8819h) o0.b(1, this.f79513s) : null;
                            if (enumC8819h2 == null) {
                                throw new Nf.c("Bug: no template insertion mode on stack!");
                            }
                            this.f79507m = enumC8819h2;
                            break;
                        case 2:
                            this.f79507m = EnumC8819h.InSelect;
                            break;
                        case 3:
                            this.f79507m = EnumC8819h.InColumnGroup;
                            break;
                        case 4:
                        case 5:
                            if (!z11) {
                                this.f79507m = EnumC8819h.InCell;
                                break;
                            }
                            if (!z11) {
                                break;
                            } else {
                                this.f79507m = EnumC8819h.InBody;
                                break;
                            }
                        case 6:
                            this.f79507m = EnumC8819h.InRow;
                            break;
                        case 7:
                            this.f79507m = EnumC8819h.InBody;
                            break;
                        case '\b':
                            if (!z11) {
                                this.f79507m = EnumC8819h.InHead;
                                break;
                            }
                            if (!z11) {
                            }
                            break;
                        case '\t':
                            this.f79507m = this.f79510p == null ? EnumC8819h.BeforeHead : EnumC8819h.AfterHead;
                            break;
                        case '\n':
                            this.f79507m = EnumC8819h.InTable;
                            break;
                        case 11:
                        case '\f':
                        case '\r':
                            this.f79507m = EnumC8819h.InTableBody;
                            break;
                        case 14:
                            this.f79507m = EnumC8819h.InCaption;
                            break;
                        default:
                            if (!z11) {
                            }
                            break;
                    }
                }
                i11--;
            }
        }
        return this.f79507m != enumC8819h;
    }

    final void i0() {
        this.f79514t.clear();
    }

    final Pf.h j(Pf.h hVar) {
        for (int size = this.f79468e.size() - 1; size >= 0; size--) {
            if (this.f79468e.get(size) == hVar) {
                return this.f79468e.get(size - 1);
            }
        }
        return null;
    }

    final void j0() {
        this.f79511q = null;
    }

    final void k(C.b bVar) {
        this.f79514t.add(new C.b(bVar));
    }

    final void k0(boolean z11) {
        this.f79517w = z11;
    }

    final void l(Pf.h hVar) {
        int size = this.f79512r.size();
        int i11 = size - 13;
        int i12 = 0;
        if (i11 < 0) {
            i11 = 0;
        }
        for (int i13 = size - 1; i13 >= i11; i13--) {
            Pf.h hVar2 = this.f79512r.get(i13);
            if (hVar2 == null) {
                return;
            }
            if (hVar.x().equals(hVar2.x()) && hVar.e().equals(hVar2.e())) {
                i12++;
            }
            if (i12 == 3) {
                this.f79512r.remove(i13);
                return;
            }
        }
    }

    final void l0(Pf.h hVar) {
        this.f79510p = hVar;
    }

    final void m() {
        while (!this.f79512r.isEmpty()) {
            int size = this.f79512r.size();
            if ((size > 0 ? this.f79512r.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    final EnumC8819h m0() {
        return this.f79507m;
    }

    final int n0() {
        return this.f79513s.size();
    }

    final void o() {
        n("tbody", "tfoot", "thead", "template");
    }

    final void o0(EnumC8819h enumC8819h) {
        this.f79507m = enumC8819h;
    }

    final void p() {
        n("table", "template");
    }

    final void q() {
        n("tr", "template");
    }

    final void r() {
        x("p");
        if (!"p".equals(a().x())) {
            u(this.f79507m);
        }
        a0("p");
    }

    final Pf.h s(C.g gVar, String str, boolean z11) {
        Pf.b bVar = gVar.f79427g;
        if (!z11) {
            this.f79471h.b(bVar);
        }
        if (bVar != null && !bVar.isEmpty() && bVar.i(this.f79471h) > 0) {
            Object[] objArr = {gVar.f79425e};
            C8821j b11 = this.f79464a.b();
            if (b11.a()) {
                b11.add(new C8820i(this.f79465b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        m d11 = this.f79472i.d(gVar.f79424d.g(), gVar.f79425e, str, (z11 ? k.f79561d : this.f79471h).e());
        return d11.f79570c.equals(DynamicElementDTO.FORM) ? new Pf.l(d11, bVar) : new Pf.h(d11, null, bVar);
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.f79470g + ", state=" + this.f79507m + ", currentElement=" + a() + '}';
    }

    final void u(EnumC8819h enumC8819h) {
        if (this.f79464a.b().a()) {
            this.f79464a.b().add(new C8820i(this.f79465b, "Unexpected %s token [%s] when in state [%s]", this.f79470g.getClass().getSimpleName(), this.f79470g, enumC8819h));
        }
    }

    final void v(boolean z11) {
        this.f79516v = z11;
    }

    final boolean w() {
        return this.f79516v;
    }

    final void x(String str) {
        while (Of.k.d(a().x(), f79498F)) {
            if (str != null && b(str)) {
                return;
            } else {
                d();
            }
        }
    }

    final void y(boolean z11) {
        String[] strArr = z11 ? f79499G : f79498F;
        while ("http://www.w3.org/1999/xhtml".equals(a().V().f79568a) && Of.k.d(a().x(), strArr)) {
            d();
        }
    }

    final Pf.l z() {
        return this.f79511q;
    }
}
