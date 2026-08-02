package org.jsoup.parser;

import Pf.C3821a;
import Pf.f;
import Pf.q;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.parser.C;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: org.jsoup.parser.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
abstract class EnumC8819h {
    private static final /* synthetic */ EnumC8819h[] $VALUES;
    public static final EnumC8819h AfterAfterBody;
    public static final EnumC8819h AfterAfterFrameset;
    public static final EnumC8819h AfterBody;
    public static final EnumC8819h AfterFrameset;
    public static final EnumC8819h AfterHead;
    public static final EnumC8819h BeforeHead;
    public static final EnumC8819h BeforeHtml;
    public static final EnumC8819h ForeignContent;
    public static final EnumC8819h InBody;
    public static final EnumC8819h InCaption;
    public static final EnumC8819h InCell;
    public static final EnumC8819h InColumnGroup;
    public static final EnumC8819h InFrameset;
    public static final EnumC8819h InHead;
    public static final EnumC8819h InHeadNoscript;
    public static final EnumC8819h InRow;
    public static final EnumC8819h InSelect;
    public static final EnumC8819h InSelectInTable;
    public static final EnumC8819h InTable;
    public static final EnumC8819h InTableBody;
    public static final EnumC8819h InTableText;
    public static final EnumC8819h InTemplate;
    public static final EnumC8819h Initial;
    public static final EnumC8819h Text;
    private static final String nullString;

    /* renamed from: org.jsoup.parser.h$q */
    static /* synthetic */ class q {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79519a;

        static {
            int[] iArr = new int[C.i.values().length];
            f79519a = iArr;
            try {
                iArr[C.i.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79519a[C.i.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79519a[C.i.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f79519a[C.i.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f79519a[C.i.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f79519a[C.i.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: org.jsoup.parser.h$z */
    static final class z {

        /* renamed from: a, reason: collision with root package name */
        static final String[] f79532a = {"base", "basefont", "bgsound", "command", "link"};

        /* renamed from: b, reason: collision with root package name */
        static final String[] f79533b = {"noframes", "style"};

        /* renamed from: c, reason: collision with root package name */
        static final String[] f79534c = {"body", "br", "html"};

        /* renamed from: d, reason: collision with root package name */
        static final String[] f79535d = {"body", "br", "html"};

        /* renamed from: e, reason: collision with root package name */
        static final String[] f79536e = {"body", "br", "head", "html"};

        /* renamed from: f, reason: collision with root package name */
        static final String[] f79537f = {"basefont", "bgsound", "link", "meta", "noframes", "style"};

        /* renamed from: g, reason: collision with root package name */
        static final String[] f79538g = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", SelectionItemFormDTO.TITLE_FIELD_NAME};

        /* renamed from: h, reason: collision with root package name */
        static final String[] f79539h = {FormPageDTO.Field.FIELD_TYPE_ADDRESS, "article", "aside", "blockquote", RichContentDTO.ALIGN_CENTER, "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.HEADER_FIELD_NAME, "hgroup", "menu", "nav", "ol", "p", "section", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "ul"};

        /* renamed from: i, reason: collision with root package name */
        static final String[] f79540i = {"h1", "h2", "h3", "h4", "h5", "h6"};

        /* renamed from: j, reason: collision with root package name */
        static final String[] f79541j = {FormPageDTO.Field.FIELD_TYPE_ADDRESS, "div", "p"};

        /* renamed from: k, reason: collision with root package name */
        static final String[] f79542k = {"dd", "dt"};

        /* renamed from: l, reason: collision with root package name */
        static final String[] f79543l = {"applet", "marquee", "object"};

        /* renamed from: m, reason: collision with root package name */
        static final String[] f79544m = {"param", "source", "track"};

        /* renamed from: n, reason: collision with root package name */
        static final String[] f79545n = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: o, reason: collision with root package name */
        static final String[] f79546o = {FormPageDTO.Field.FIELD_TYPE_ADDRESS, "article", "aside", "blockquote", "button", RichContentDTO.ALIGN_CENTER, "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.HEADER_FIELD_NAME, "hgroup", "listing", "menu", "nav", "ol", "pre", "section", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "ul"};

        /* renamed from: p, reason: collision with root package name */
        static final String[] f79547p = {"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: q, reason: collision with root package name */
        static final String[] f79548q = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};

        /* renamed from: r, reason: collision with root package name */
        static final String[] f79549r = {"tbody", "tfoot", "thead"};

        /* renamed from: s, reason: collision with root package name */
        static final String[] f79550s = {"td", "th", "tr"};

        /* renamed from: t, reason: collision with root package name */
        static final String[] f79551t = {"script", "style", "template"};

        /* renamed from: u, reason: collision with root package name */
        static final String[] f79552u = {"td", "th"};

        /* renamed from: v, reason: collision with root package name */
        static final String[] f79553v = {"body", "caption", "col", "colgroup", "html"};

        /* renamed from: w, reason: collision with root package name */
        static final String[] f79554w = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: x, reason: collision with root package name */
        static final String[] f79555x = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: y, reason: collision with root package name */
        static final String[] f79556y = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: z, reason: collision with root package name */
        static final String[] f79557z = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: A, reason: collision with root package name */
        static final String[] f79520A = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};

        /* renamed from: B, reason: collision with root package name */
        static final String[] f79521B = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};

        /* renamed from: C, reason: collision with root package name */
        static final String[] f79522C = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: D, reason: collision with root package name */
        static final String[] f79523D = {"body", "caption", "col", "colgroup", "html", "td", "th"};

        /* renamed from: E, reason: collision with root package name */
        static final String[] f79524E = {"input", "keygen", "textarea"};

        /* renamed from: F, reason: collision with root package name */
        static final String[] f79525F = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: G, reason: collision with root package name */
        static final String[] f79526G = {"tbody", "tfoot", "thead"};

        /* renamed from: H, reason: collision with root package name */
        static final String[] f79527H = {"head", "noscript"};

        /* renamed from: I, reason: collision with root package name */
        static final String[] f79528I = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: J, reason: collision with root package name */
        static final String[] f79529J = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", SelectionItemFormDTO.TITLE_FIELD_NAME};

        /* renamed from: K, reason: collision with root package name */
        static final String[] f79530K = {"caption", "colgroup", "tbody", "tfoot", "thead"};

        /* renamed from: L, reason: collision with root package name */
        static final String[] f79531L = {"b", "big", "blockquote", "body", "br", RichContentDTO.ALIGN_CENTER, "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};
    }

    static {
        EnumC8819h enumC8819h = new EnumC8819h() { // from class: org.jsoup.parser.h.k
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (EnumC8819h.a(c11)) {
                    return true;
                }
                if (c11.a()) {
                    c8818g.M((C.c) c11);
                    return true;
                }
                if (!c11.b()) {
                    c8818g.f79467d.e0(f.b.quirks);
                    c8818g.o0(EnumC8819h.BeforeHtml);
                    return c8818g.e(c11);
                }
                C.d dVar = (C.d) c11;
                Pf.g gVar = new Pf.g(c8818g.f79471h.c(dVar.f79419d.g()), dVar.f79421f.g(), dVar.f79422g.g());
                String str = dVar.f79420e;
                if (str != null) {
                    gVar.L(str);
                }
                c8818g.f79467d.M(gVar);
                c8818g.i(gVar, true);
                if (dVar.f79423h || !gVar.c(AppMeasurementSdk.ConditionalUserProperty.NAME).equals("html") || gVar.c("publicId").equalsIgnoreCase("HTML")) {
                    c8818g.f79467d.e0(f.b.quirks);
                }
                c8818g.o0(EnumC8819h.BeforeHtml);
                return true;
            }
        };
        Initial = enumC8819h;
        EnumC8819h enumC8819h2 = new EnumC8819h() { // from class: org.jsoup.parser.h.r
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (c11.b()) {
                    c8818g.u(this);
                    return false;
                }
                if (c11.a()) {
                    c8818g.M((C.c) c11);
                    return true;
                }
                if (EnumC8819h.a(c11)) {
                    c8818g.K((C.b) c11);
                    return true;
                }
                if (c11.e()) {
                    C.g gVar = (C.g) c11;
                    if (gVar.q().equals("html")) {
                        c8818g.N(gVar);
                        c8818g.o0(EnumC8819h.BeforeHead);
                        return true;
                    }
                }
                if (c11.d() && Of.k.d(((C.f) c11).q(), z.f79536e)) {
                    c8818g.g("html");
                    c8818g.o0(EnumC8819h.BeforeHead);
                    return c8818g.e(c11);
                }
                if (c11.d()) {
                    c8818g.u(this);
                    return false;
                }
                c8818g.g("html");
                c8818g.o0(EnumC8819h.BeforeHead);
                return c8818g.e(c11);
            }
        };
        BeforeHtml = enumC8819h2;
        EnumC8819h enumC8819h3 = new EnumC8819h() { // from class: org.jsoup.parser.h.s
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (EnumC8819h.a(c11)) {
                    c8818g.K((C.b) c11);
                    return true;
                }
                if (c11.a()) {
                    c8818g.M((C.c) c11);
                    return true;
                }
                if (c11.b()) {
                    c8818g.u(this);
                    return false;
                }
                if (c11.e() && ((C.g) c11).q().equals("html")) {
                    return EnumC8819h.InBody.f(c11, c8818g);
                }
                if (c11.e()) {
                    C.g gVar = (C.g) c11;
                    if (gVar.q().equals("head")) {
                        c8818g.l0(c8818g.N(gVar));
                        c8818g.o0(EnumC8819h.InHead);
                        return true;
                    }
                }
                if (c11.d() && Of.k.d(((C.f) c11).q(), z.f79536e)) {
                    c8818g.g("head");
                    return c8818g.e(c11);
                }
                if (c11.d()) {
                    c8818g.u(this);
                    return false;
                }
                c8818g.g("head");
                return c8818g.e(c11);
            }
        };
        BeforeHead = enumC8819h3;
        EnumC8819h enumC8819h4 = new EnumC8819h() { // from class: org.jsoup.parser.h.t
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (EnumC8819h.a(c11)) {
                    c8818g.K((C.b) c11);
                    return true;
                }
                int i11 = q.f79519a[c11.f79414a.ordinal()];
                if (i11 == 1) {
                    c8818g.M((C.c) c11);
                    return true;
                }
                if (i11 == 2) {
                    c8818g.u(this);
                    return false;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        c8818g.f("head");
                        return c8818g.e(c11);
                    }
                    String q11 = ((C.f) c11).q();
                    if (q11.equals("head")) {
                        c8818g.d();
                        c8818g.o0(EnumC8819h.AfterHead);
                        return true;
                    }
                    if (Of.k.d(q11, z.f79534c)) {
                        c8818g.f("head");
                        return c8818g.e(c11);
                    }
                    if (!q11.equals("template")) {
                        c8818g.u(this);
                        return false;
                    }
                    if (!c8818g.W(q11)) {
                        c8818g.u(this);
                        return true;
                    }
                    c8818g.y(true);
                    if (!c8818g.b(q11)) {
                        c8818g.u(this);
                    }
                    c8818g.a0(q11);
                    c8818g.m();
                    c8818g.b0();
                    c8818g.h0();
                    return true;
                }
                C.g gVar = (C.g) c11;
                String q12 = gVar.q();
                if (q12.equals("html")) {
                    return EnumC8819h.InBody.f(c11, c8818g);
                }
                if (Of.k.d(q12, z.f79532a)) {
                    Pf.h O11 = c8818g.O(gVar);
                    if (q12.equals("base") && O11.q("href")) {
                        c8818g.U(O11);
                    }
                    return true;
                }
                if (q12.equals("meta")) {
                    c8818g.O(gVar);
                    return true;
                }
                if (q12.equals(SelectionItemFormDTO.TITLE_FIELD_NAME)) {
                    EnumC8819h.b(gVar, c8818g, c8818g.h(gVar).m());
                    return true;
                }
                if (Of.k.d(q12, z.f79533b)) {
                    EnumC8819h.b(gVar, c8818g, c8818g.h(gVar).m());
                    return true;
                }
                if (q12.equals("noscript")) {
                    c8818g.N(gVar);
                    c8818g.o0(EnumC8819h.InHeadNoscript);
                    return true;
                }
                if (q12.equals("script")) {
                    c8818g.f79466c.s(I.ScriptData);
                    c8818g.T();
                    c8818g.o0(EnumC8819h.Text);
                    c8818g.N(gVar);
                    return true;
                }
                if (q12.equals("head")) {
                    c8818g.u(this);
                    return false;
                }
                if (!q12.equals("template")) {
                    c8818g.f("head");
                    return c8818g.e(c11);
                }
                c8818g.N(gVar);
                c8818g.f79512r.add(null);
                c8818g.v(false);
                EnumC8819h enumC8819h5 = EnumC8819h.InTemplate;
                c8818g.o0(enumC8819h5);
                c8818g.c0(enumC8819h5);
                return true;
            }
        };
        InHead = enumC8819h4;
        EnumC8819h enumC8819h5 = new EnumC8819h() { // from class: org.jsoup.parser.h.u
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (c11.b()) {
                    c8818g.u(this);
                    return true;
                }
                if (c11.e() && ((C.g) c11).q().equals("html")) {
                    return EnumC8819h.InBody.f(c11, c8818g);
                }
                if (c11.d() && ((C.f) c11).q().equals("noscript")) {
                    c8818g.d();
                    c8818g.o0(EnumC8819h.InHead);
                    return true;
                }
                if (EnumC8819h.a(c11) || c11.a() || (c11.e() && Of.k.d(((C.g) c11).q(), z.f79537f))) {
                    return EnumC8819h.InHead.f(c11, c8818g);
                }
                if (c11.d() && ((C.f) c11).q().equals("br")) {
                    c8818g.u(this);
                    C.b bVar = new C.b();
                    bVar.f79417d.f(c11.toString());
                    c8818g.K(bVar);
                    return true;
                }
                if ((c11.e() && Of.k.d(((C.g) c11).q(), z.f79527H)) || c11.d()) {
                    c8818g.u(this);
                    return false;
                }
                c8818g.u(this);
                C.b bVar2 = new C.b();
                bVar2.f79417d.f(c11.toString());
                c8818g.K(bVar2);
                return true;
            }
        };
        InHeadNoscript = enumC8819h5;
        EnumC8819h enumC8819h6 = new EnumC8819h() { // from class: org.jsoup.parser.h.v
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (EnumC8819h.a(c11)) {
                    c8818g.K((C.b) c11);
                } else if (c11.a()) {
                    c8818g.M((C.c) c11);
                } else if (c11.b()) {
                    c8818g.u(this);
                } else if (c11.e()) {
                    C.g gVar = (C.g) c11;
                    String q11 = gVar.q();
                    if (q11.equals("html")) {
                        return EnumC8819h.InBody.f(c11, c8818g);
                    }
                    if (q11.equals("body")) {
                        c8818g.N(gVar);
                        c8818g.v(false);
                        c8818g.o0(EnumC8819h.InBody);
                    } else if (q11.equals("frameset")) {
                        c8818g.N(gVar);
                        c8818g.o0(EnumC8819h.InFrameset);
                    } else if (Of.k.d(q11, z.f79538g)) {
                        c8818g.u(this);
                        Pf.h B11 = c8818g.B();
                        c8818g.f79468e.add(B11);
                        c8818g.i(B11, true);
                        EnumC8819h.InHead.f(c11, c8818g);
                        c8818g.f0(B11);
                    } else {
                        if (q11.equals("head")) {
                            c8818g.u(this);
                            return false;
                        }
                        c8818g.g("body");
                        c8818g.v(true);
                        c8818g.e(c11);
                    }
                } else if (c11.d()) {
                    String q12 = ((C.f) c11).q();
                    if (Of.k.d(q12, z.f79535d)) {
                        c8818g.g("body");
                        c8818g.v(true);
                        c8818g.e(c11);
                    } else {
                        if (!q12.equals("template")) {
                            c8818g.u(this);
                            return false;
                        }
                        EnumC8819h.InHead.f(c11, c8818g);
                    }
                } else {
                    c8818g.g("body");
                    c8818g.v(true);
                    c8818g.e(c11);
                }
                return true;
            }
        };
        AfterHead = enumC8819h6;
        EnumC8819h enumC8819h7 = new EnumC8819h() { // from class: org.jsoup.parser.h.w
            private static final int MaxStackScan = 24;

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:146:0x0236 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:160:0x01ea A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x01ef  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0248  */
            @Override // org.jsoup.parser.EnumC8819h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            final boolean f(C c11, C8818g c8818g) {
                char c12;
                Pf.h hVar;
                String[] strArr;
                String str;
                char c13;
                char c14;
                Pf.h hVar2;
                Pf.h hVar3;
                int i11 = q.f79519a[c11.f79414a.ordinal()];
                int i12 = -1;
                String[] strArr2 = z.f79540i;
                String[] strArr3 = z.f79543l;
                String[] strArr4 = z.f79547p;
                switch (i11) {
                    case 1:
                        c8818g.M((C.c) c11);
                        return true;
                    case 2:
                        c8818g.u(this);
                        return false;
                    case 3:
                        C.g gVar = (C.g) c11;
                        String q11 = gVar.q();
                        q11.getClass();
                        String[] strArr5 = z.f79541j;
                        switch (q11.hashCode()) {
                            case -1644953643:
                                if (q11.equals("frameset")) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1377687758:
                                if (q11.equals("button")) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1191214428:
                                if (q11.equals("iframe")) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1134665583:
                                if (q11.equals("keygen")) {
                                    c12 = 3;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1010136971:
                                if (q11.equals("option")) {
                                    c12 = 4;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1003243718:
                                if (q11.equals("textarea")) {
                                    c12 = 5;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -906021636:
                                if (q11.equals("select")) {
                                    c12 = 6;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -891985998:
                                if (q11.equals("strike")) {
                                    c12 = 7;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -891980137:
                                if (q11.equals("strong")) {
                                    c12 = '\b';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -80773204:
                                if (q11.equals("optgroup")) {
                                    c12 = '\t';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 97:
                                if (q11.equals("a")) {
                                    c12 = '\n';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 98:
                                if (q11.equals("b")) {
                                    c12 = 11;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 105:
                                if (q11.equals("i")) {
                                    c12 = '\f';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 115:
                                if (q11.equals("s")) {
                                    c12 = '\r';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 117:
                                if (q11.equals("u")) {
                                    c12 = 14;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3152:
                                if (q11.equals("br")) {
                                    c12 = 15;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3200:
                                if (q11.equals("dd")) {
                                    c12 = 16;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3216:
                                if (q11.equals("dt")) {
                                    c12 = 17;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3240:
                                if (q11.equals("em")) {
                                    c12 = 18;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3273:
                                if (q11.equals("h1")) {
                                    c12 = 19;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3274:
                                if (q11.equals("h2")) {
                                    c12 = 20;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3275:
                                if (q11.equals("h3")) {
                                    c12 = 21;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3276:
                                if (q11.equals("h4")) {
                                    c12 = 22;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3277:
                                if (q11.equals("h5")) {
                                    c12 = 23;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3278:
                                if (q11.equals("h6")) {
                                    c12 = 24;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3338:
                                if (q11.equals("hr")) {
                                    c12 = 25;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3453:
                                if (q11.equals("li")) {
                                    c12 = 26;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3632:
                                if (q11.equals("rb")) {
                                    c12 = 27;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3646:
                                if (q11.equals("rp")) {
                                    c12 = 28;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3650:
                                if (q11.equals("rt")) {
                                    c12 = 29;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3712:
                                if (q11.equals("tt")) {
                                    c12 = 30;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 97536:
                                if (q11.equals("big")) {
                                    c12 = 31;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 104387:
                                if (q11.equals("img")) {
                                    c12 = ' ';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 111267:
                                if (q11.equals("pre")) {
                                    c12 = '!';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 113249:
                                if (q11.equals("rtc")) {
                                    c12 = '\"';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 114276:
                                if (q11.equals("svg")) {
                                    c12 = '#';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 117511:
                                if (q11.equals("wbr")) {
                                    c12 = '$';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 118811:
                                if (q11.equals("xmp")) {
                                    c12 = '%';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3002509:
                                if (q11.equals("area")) {
                                    c12 = '&';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3029410:
                                if (q11.equals("body")) {
                                    c12 = '\'';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3059181:
                                if (q11.equals("code")) {
                                    c12 = '(';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3148879:
                                if (q11.equals("font")) {
                                    c12 = ')';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3148996:
                                if (q11.equals(DynamicElementDTO.FORM)) {
                                    c12 = '*';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3213227:
                                if (q11.equals("html")) {
                                    c12 = '+';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3344136:
                                if (q11.equals("math")) {
                                    c12 = ',';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3386833:
                                if (q11.equals("nobr")) {
                                    c12 = '-';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3536714:
                                if (q11.equals("span")) {
                                    c12 = '.';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 96620249:
                                if (q11.equals("embed")) {
                                    c12 = '/';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 100313435:
                                if (q11.equals("image")) {
                                    c12 = '0';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 100358090:
                                if (q11.equals("input")) {
                                    c12 = '1';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 109548807:
                                if (q11.equals("small")) {
                                    c12 = '2';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 110115790:
                                if (q11.equals("table")) {
                                    c12 = '3';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 181975684:
                                if (q11.equals("listing")) {
                                    c12 = '4';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 1973234167:
                                if (q11.equals("plaintext")) {
                                    c12 = '5';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 2115613112:
                                if (q11.equals("noembed")) {
                                    c12 = '6';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            default:
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                            case 0:
                                c8818g.u(this);
                                ArrayList<Pf.h> arrayList = c8818g.f79468e;
                                if (arrayList.size() == 1) {
                                    return false;
                                }
                                if ((arrayList.size() > 2 && !arrayList.get(1).t("body")) || !c8818g.w()) {
                                    return false;
                                }
                                Pf.h hVar4 = arrayList.get(1);
                                if (hVar4.U() != null) {
                                    hVar4.F();
                                }
                                while (arrayList.size() > 1) {
                                    Ej.b.b(1, arrayList);
                                }
                                c8818g.N(gVar);
                                c8818g.o0(EnumC8819h.InFrameset);
                                return true;
                            case 1:
                                if (c8818g.D("button")) {
                                    c8818g.u(this);
                                    c8818g.f("button");
                                    c8818g.e(gVar);
                                    return true;
                                }
                                c8818g.d0();
                                c8818g.N(gVar);
                                c8818g.v(false);
                                return true;
                            case 2:
                                c8818g.v(false);
                                EnumC8819h.b(gVar, c8818g, c8818g.h(gVar).m());
                                return true;
                            case 3:
                            case 15:
                            case ' ':
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case '&':
                            case '/':
                                c8818g.d0();
                                c8818g.O(gVar);
                                c8818g.v(false);
                                return true;
                            case 4:
                            case '\t':
                                if (c8818g.b("option")) {
                                    c8818g.f("option");
                                }
                                c8818g.d0();
                                c8818g.N(gVar);
                                return true;
                            case 5:
                                c8818g.v(false);
                                EnumC8819h.b(gVar, c8818g, c8818g.h(gVar).m());
                                return true;
                            case 6:
                                c8818g.d0();
                                c8818g.N(gVar);
                                c8818g.v(false);
                                if (gVar.f79426f) {
                                    return true;
                                }
                                EnumC8819h m02 = c8818g.m0();
                                if (m02.equals(EnumC8819h.InTable) || m02.equals(EnumC8819h.InCaption) || m02.equals(EnumC8819h.InTableBody) || m02.equals(EnumC8819h.InRow) || m02.equals(EnumC8819h.InCell)) {
                                    c8818g.o0(EnumC8819h.InSelectInTable);
                                    return true;
                                }
                                c8818g.o0(EnumC8819h.InSelect);
                                return true;
                            case 7:
                            case '\b':
                            case 11:
                            case '\f':
                            case '\r':
                            case 14:
                            case 18:
                            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case '(':
                            case ')':
                            case '2':
                                c8818g.d0();
                                Pf.h N11 = c8818g.N(gVar);
                                c8818g.l(N11);
                                c8818g.f79512r.add(N11);
                                return true;
                            case '\n':
                                Pf.h hVar5 = null;
                                int size = c8818g.f79512r.size();
                                while (true) {
                                    size--;
                                    if (size >= 0 && (hVar = c8818g.f79512r.get(size)) != null) {
                                        if (hVar.t("a")) {
                                            hVar5 = hVar;
                                        }
                                    }
                                }
                                if (hVar5 != null) {
                                    c8818g.u(this);
                                    c8818g.f("a");
                                    Pf.h A11 = c8818g.A("a");
                                    if (A11 != null) {
                                        c8818g.e0(A11);
                                        c8818g.f0(A11);
                                    }
                                }
                                c8818g.d0();
                                Pf.h N12 = c8818g.N(gVar);
                                c8818g.l(N12);
                                c8818g.f79512r.add(N12);
                                return true;
                            case 16:
                            case 17:
                                c8818g.v(false);
                                ArrayList<Pf.h> arrayList2 = c8818g.f79468e;
                                int size2 = arrayList2.size();
                                int i13 = size2 - 1;
                                int i14 = i13 >= 24 ? size2 - 25 : 0;
                                while (true) {
                                    if (i13 >= i14) {
                                        Pf.h hVar6 = arrayList2.get(i13);
                                        if (Of.k.d(hVar6.x(), z.f79542k)) {
                                            c8818g.f(hVar6.x());
                                        } else if (!C8818g.S(hVar6) || Of.k.d(hVar6.x(), strArr5)) {
                                            i13--;
                                        }
                                    }
                                }
                                if (c8818g.D("p")) {
                                    c8818g.f("p");
                                }
                                c8818g.N(gVar);
                                return true;
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                                if (c8818g.D("p")) {
                                    c8818g.f("p");
                                }
                                if (Of.k.d(c8818g.a().x(), strArr2)) {
                                    c8818g.u(this);
                                    c8818g.d();
                                }
                                c8818g.N(gVar);
                                return true;
                            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                if (c8818g.D("p")) {
                                    c8818g.f("p");
                                }
                                c8818g.O(gVar);
                                c8818g.v(false);
                                return true;
                            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                c8818g.v(false);
                                ArrayList<Pf.h> arrayList3 = c8818g.f79468e;
                                int size3 = arrayList3.size() - 1;
                                while (true) {
                                    if (size3 > 0) {
                                        Pf.h hVar7 = arrayList3.get(size3);
                                        if (hVar7.t("li")) {
                                            c8818g.f("li");
                                        } else {
                                            if (C8818g.S(hVar7)) {
                                                strArr = strArr5;
                                                if (!Of.k.d(hVar7.x(), strArr)) {
                                                }
                                            } else {
                                                strArr = strArr5;
                                            }
                                            size3--;
                                            strArr5 = strArr;
                                        }
                                    }
                                }
                                if (c8818g.D("p")) {
                                    c8818g.f("p");
                                }
                                c8818g.N(gVar);
                                return true;
                            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            case '\"':
                                if (c8818g.F("ruby")) {
                                    c8818g.y(false);
                                    if (!c8818g.b("ruby")) {
                                        c8818g.u(this);
                                    }
                                }
                                c8818g.N(gVar);
                                return true;
                            case 28:
                            case 29:
                                if (c8818g.F("ruby")) {
                                    c8818g.x("rtc");
                                    if (!c8818g.b("rtc") && !c8818g.b("ruby")) {
                                        c8818g.u(this);
                                    }
                                }
                                c8818g.N(gVar);
                                return true;
                            case '!':
                            case '4':
                                if (c8818g.D("p")) {
                                    c8818g.f("p");
                                }
                                c8818g.N(gVar);
                                c8818g.f79465b.X("\n");
                                c8818g.v(false);
                                return true;
                            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                                c8818g.d0();
                                c8818g.P(gVar, "http://www.w3.org/2000/svg");
                                return true;
                            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                if (c8818g.D("p")) {
                                    c8818g.f("p");
                                }
                                c8818g.d0();
                                c8818g.v(false);
                                EnumC8819h.b(gVar, c8818g, c8818g.h(gVar).m());
                                return true;
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                c8818g.u(this);
                                ArrayList<Pf.h> arrayList4 = c8818g.f79468e;
                                if (arrayList4.size() == 1) {
                                    return false;
                                }
                                if ((arrayList4.size() > 2 && !arrayList4.get(1).t("body")) || c8818g.W("template")) {
                                    return false;
                                }
                                c8818g.v(false);
                                Pf.h A12 = c8818g.A("body");
                                if (A12 == null) {
                                    return true;
                                }
                                EnumC8819h.e(gVar, A12);
                                return true;
                            case '*':
                                if (c8818g.z() != null && !c8818g.W("template")) {
                                    c8818g.u(this);
                                    return false;
                                }
                                if (c8818g.D("p")) {
                                    c8818g.r();
                                }
                                c8818g.Q(gVar, true, true);
                                return true;
                            case '+':
                                c8818g.u(this);
                                if (c8818g.W("template")) {
                                    return false;
                                }
                                if (c8818g.f79468e.size() <= 0) {
                                    return true;
                                }
                                EnumC8819h.e(gVar, c8818g.f79468e.get(0));
                                return true;
                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                c8818g.d0();
                                c8818g.P(gVar, "http://www.w3.org/1998/Math/MathML");
                                return true;
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                c8818g.d0();
                                if (c8818g.F("nobr")) {
                                    c8818g.u(this);
                                    c8818g.f("nobr");
                                    c8818g.d0();
                                }
                                Pf.h N13 = c8818g.N(gVar);
                                c8818g.l(N13);
                                c8818g.f79512r.add(N13);
                                return true;
                            case '.':
                                c8818g.d0();
                                c8818g.N(gVar);
                                return true;
                            case '0':
                                if (c8818g.A("svg") == null) {
                                    gVar.o("img");
                                    return c8818g.e(gVar);
                                }
                                c8818g.N(gVar);
                                return true;
                            case '1':
                                c8818g.d0();
                                if (c8818g.O(gVar).c("type").equalsIgnoreCase(FormPageDTO.Field.FIELD_TYPE_HIDDEN)) {
                                    return true;
                                }
                                c8818g.v(false);
                                return true;
                            case '3':
                                if (c8818g.f79467d.d0() != f.b.quirks && c8818g.D("p")) {
                                    c8818g.f("p");
                                }
                                c8818g.N(gVar);
                                c8818g.v(false);
                                c8818g.o0(EnumC8819h.InTable);
                                return true;
                            case '5':
                                if (c8818g.D("p")) {
                                    c8818g.f("p");
                                }
                                c8818g.N(gVar);
                                c8818g.f79466c.s(I.PLAINTEXT);
                                return true;
                            case '6':
                                EnumC8819h.b(gVar, c8818g, c8818g.h(gVar).m());
                                return true;
                            default:
                                org.jsoup.parser.m h11 = c8818g.h(gVar);
                                I m11 = h11.m();
                                if (m11 != null) {
                                    EnumC8819h.b(gVar, c8818g, m11);
                                    return true;
                                }
                                if (!h11.g()) {
                                    c8818g.N(gVar);
                                    return true;
                                }
                                if (Of.k.d(q11, z.f79539h)) {
                                    if (c8818g.D("p")) {
                                        c8818g.f("p");
                                    }
                                    c8818g.N(gVar);
                                    return true;
                                }
                                if (Of.k.d(q11, z.f79538g)) {
                                    return EnumC8819h.InHead.f(c11, c8818g);
                                }
                                if (Of.k.d(q11, strArr3)) {
                                    c8818g.d0();
                                    c8818g.N(gVar);
                                    c8818g.f79512r.add(null);
                                    c8818g.v(false);
                                    return true;
                                }
                                if (Of.k.d(q11, z.f79544m)) {
                                    c8818g.O(gVar);
                                    return true;
                                }
                                if (Of.k.d(q11, z.f79545n)) {
                                    c8818g.u(this);
                                    return false;
                                }
                                c8818g.d0();
                                c8818g.N(gVar);
                                return true;
                        }
                    case 4:
                        C.f fVar = (C.f) c11;
                        String q12 = fVar.q();
                        q12.getClass();
                        switch (q12.hashCode()) {
                            case -1321546630:
                                str = "template";
                                if (q12.equals(str)) {
                                    c13 = 0;
                                    break;
                                } else {
                                    c13 = 65535;
                                    break;
                                }
                            case 112:
                                if (q12.equals("p")) {
                                    c13 = 1;
                                    str = "template";
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                            case 3152:
                                if (q12.equals("br")) {
                                    str = "template";
                                    c13 = 2;
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                                break;
                            case 3200:
                                if (q12.equals("dd")) {
                                    str = "template";
                                    c13 = 3;
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                                break;
                            case 3216:
                                if (q12.equals("dt")) {
                                    str = "template";
                                    c13 = 4;
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                                break;
                            case 3273:
                                if (q12.equals("h1")) {
                                    str = "template";
                                    c13 = 5;
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                                break;
                            case 3274:
                                if (q12.equals("h2")) {
                                    str = "template";
                                    c13 = 6;
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                                break;
                            case 3275:
                                if (q12.equals("h3")) {
                                    str = "template";
                                    c13 = 7;
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                                break;
                            case 3276:
                                if (q12.equals("h4")) {
                                    str = "template";
                                    c13 = '\b';
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                                break;
                            case 3277:
                                if (q12.equals("h5")) {
                                    c14 = '\t';
                                    c13 = c14;
                                    str = "template";
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                            case 3278:
                                if (q12.equals("h6")) {
                                    c14 = '\n';
                                    c13 = c14;
                                    str = "template";
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                            case 3453:
                                if (q12.equals("li")) {
                                    c14 = 11;
                                    c13 = c14;
                                    str = "template";
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                            case 3029410:
                                if (q12.equals("body")) {
                                    c14 = '\f';
                                    c13 = c14;
                                    str = "template";
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                            case 3148996:
                                if (q12.equals(DynamicElementDTO.FORM)) {
                                    c14 = '\r';
                                    c13 = c14;
                                    str = "template";
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                            case 3213227:
                                if (q12.equals("html")) {
                                    c14 = 14;
                                    c13 = c14;
                                    str = "template";
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                            case 3536714:
                                if (q12.equals("span")) {
                                    c14 = 15;
                                    c13 = c14;
                                    str = "template";
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                            case 1869063452:
                                if (q12.equals("sarcasm")) {
                                    c14 = 16;
                                    c13 = c14;
                                    str = "template";
                                    break;
                                }
                                c13 = 65535;
                                str = "template";
                            default:
                                c13 = 65535;
                                str = "template";
                                break;
                        }
                        switch (c13) {
                            case 0:
                                EnumC8819h.InHead.f(c11, c8818g);
                                return true;
                            case 1:
                                if (!c8818g.D(q12)) {
                                    c8818g.u(this);
                                    c8818g.g(q12);
                                    return c8818g.e(fVar);
                                }
                                c8818g.x(q12);
                                if (!c8818g.b(q12)) {
                                    c8818g.u(this);
                                }
                                c8818g.a0(q12);
                                return true;
                            case 2:
                                c8818g.u(this);
                                c8818g.g("br");
                                return false;
                            case 3:
                            case 4:
                                if (!c8818g.F(q12)) {
                                    c8818g.u(this);
                                    return false;
                                }
                                c8818g.x(q12);
                                if (!c8818g.b(q12)) {
                                    c8818g.u(this);
                                }
                                c8818g.a0(q12);
                                return true;
                            case 5:
                            case 6:
                            case 7:
                            case '\b':
                            case '\t':
                            case '\n':
                                if (!c8818g.G(strArr2)) {
                                    c8818g.u(this);
                                    return false;
                                }
                                c8818g.x(q12);
                                if (!c8818g.b(q12)) {
                                    c8818g.u(this);
                                }
                                for (int size4 = c8818g.f79468e.size() - 1; size4 >= 0; size4--) {
                                    Pf.h d11 = c8818g.d();
                                    if (Of.k.d(d11.x(), strArr2) && "http://www.w3.org/1999/xhtml".equals(d11.V().f79568a)) {
                                        return true;
                                    }
                                }
                                return true;
                            case 11:
                                if (!c8818g.E(q12)) {
                                    c8818g.u(this);
                                    return false;
                                }
                                c8818g.x(q12);
                                if (!c8818g.b(q12)) {
                                    c8818g.u(this);
                                }
                                c8818g.a0(q12);
                                return true;
                            case '\f':
                                if (!c8818g.F("body")) {
                                    c8818g.u(this);
                                    return false;
                                }
                                if (c8818g.Y(strArr4)) {
                                    c8818g.u(this);
                                }
                                c8818g.i(c8818g.A("body"), false);
                                c8818g.o0(EnumC8819h.AfterBody);
                                return true;
                            case '\r':
                                if (c8818g.W(str)) {
                                    if (!c8818g.F(q12)) {
                                        c8818g.u(this);
                                        return false;
                                    }
                                    c8818g.y(false);
                                    if (!c8818g.b(q12)) {
                                        c8818g.u(this);
                                    }
                                    c8818g.a0(q12);
                                    return true;
                                }
                                Pf.l z11 = c8818g.z();
                                c8818g.j0();
                                if (z11 == null || !c8818g.F(q12)) {
                                    c8818g.u(this);
                                    return false;
                                }
                                c8818g.y(false);
                                if (!c8818g.b(q12)) {
                                    c8818g.u(this);
                                }
                                c8818g.f0(z11);
                                return true;
                            case 14:
                                if (!c8818g.W("body")) {
                                    c8818g.u(this);
                                    return false;
                                }
                                if (c8818g.Y(strArr4)) {
                                    c8818g.u(this);
                                }
                                c8818g.o0(EnumC8819h.AfterBody);
                                return c8818g.e(c11);
                            case 15:
                            case 16:
                                return g(c11, c8818g);
                            default:
                                if (!Of.k.d(q12, z.f79548q)) {
                                    if (Of.k.d(q12, z.f79546o)) {
                                        if (!c8818g.F(q12)) {
                                            c8818g.u(this);
                                            return false;
                                        }
                                        c8818g.y(false);
                                        if (!c8818g.b(q12)) {
                                            c8818g.u(this);
                                        }
                                        c8818g.a0(q12);
                                        return true;
                                    }
                                    if (!Of.k.d(q12, strArr3)) {
                                        return g(c11, c8818g);
                                    }
                                    if (c8818g.F(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                                        return true;
                                    }
                                    if (!c8818g.F(q12)) {
                                        c8818g.u(this);
                                        return false;
                                    }
                                    c8818g.y(false);
                                    if (!c8818g.b(q12)) {
                                        c8818g.u(this);
                                    }
                                    c8818g.a0(q12);
                                    c8818g.m();
                                    return true;
                                }
                                Object obj = fVar.f79425e;
                                if (c8818g.a().x().equals(obj) && !c8818g.R(c8818g.a())) {
                                    c8818g.d();
                                    return true;
                                }
                                int i15 = 0;
                                int i16 = 8;
                                while (true) {
                                    if (i15 < i16) {
                                        int i17 = i15 + 1;
                                        for (int size5 = c8818g.f79512r.size() - 1; size5 >= 0; size5--) {
                                            hVar2 = c8818g.f79512r.get(size5);
                                            if (hVar2 == null) {
                                                hVar2 = null;
                                                if (hVar2 == null) {
                                                    return g(c11, c8818g);
                                                }
                                                if (!c8818g.V(hVar2)) {
                                                    c8818g.u(this);
                                                    c8818g.e0(hVar2);
                                                } else {
                                                    if (!c8818g.F(hVar2.x())) {
                                                        c8818g.u(this);
                                                        return false;
                                                    }
                                                    if (c8818g.a() != hVar2) {
                                                        c8818g.u(this);
                                                    }
                                                    ArrayList<Pf.h> arrayList5 = c8818g.f79468e;
                                                    int lastIndexOf = arrayList5.lastIndexOf(hVar2);
                                                    if (lastIndexOf != i12) {
                                                        do {
                                                            lastIndexOf++;
                                                            if (lastIndexOf < arrayList5.size()) {
                                                                hVar3 = arrayList5.get(lastIndexOf);
                                                            }
                                                        } while (!C8818g.S(hVar3));
                                                        if (hVar3 != null) {
                                                            while (c8818g.a() != hVar2) {
                                                                c8818g.d();
                                                            }
                                                            c8818g.d();
                                                            c8818g.e0(hVar2);
                                                        } else {
                                                            Pf.h j11 = c8818g.j(hVar2);
                                                            if (j11 == null) {
                                                                c8818g.u(this);
                                                            } else {
                                                                int i18 = 0;
                                                                while (true) {
                                                                    if (i18 >= c8818g.f79512r.size()) {
                                                                        i18 = -1;
                                                                    } else if (hVar2 != c8818g.f79512r.get(i18)) {
                                                                        i18++;
                                                                    }
                                                                }
                                                                Pf.h hVar8 = hVar3;
                                                                Pf.n nVar = hVar8;
                                                                int i19 = 0;
                                                                while (true) {
                                                                    i19++;
                                                                    hVar8 = !c8818g.V(hVar8) ? hVar8.U() : c8818g.j(hVar8);
                                                                    if (hVar8 == null) {
                                                                        c8818g.u(this);
                                                                    } else if (hVar8 != hVar2) {
                                                                        if (i19 > 3 && c8818g.R(hVar8)) {
                                                                            c8818g.e0(hVar8);
                                                                        } else if (c8818g.R(hVar8)) {
                                                                            int i21 = i18;
                                                                            Pf.h hVar9 = new Pf.h(c8818g.f79472i.d(hVar8.w(), hVar8.x(), "http://www.w3.org/1999/xhtml", org.jsoup.parser.k.f79561d.e()), c8818g.f79469f, null);
                                                                            ArrayList<Pf.h> arrayList6 = c8818g.f79512r;
                                                                            int lastIndexOf2 = arrayList6.lastIndexOf(hVar8);
                                                                            Nf.b.a(lastIndexOf2 != -1);
                                                                            arrayList6.set(lastIndexOf2, hVar9);
                                                                            ArrayList<Pf.h> arrayList7 = c8818g.f79468e;
                                                                            int lastIndexOf3 = arrayList7.lastIndexOf(hVar8);
                                                                            Nf.b.a(lastIndexOf3 != -1);
                                                                            arrayList7.set(lastIndexOf3, hVar9);
                                                                            if (nVar == hVar3) {
                                                                                int i22 = 0;
                                                                                while (true) {
                                                                                    if (i22 >= c8818g.f79512r.size()) {
                                                                                        i22 = -1;
                                                                                    } else if (hVar9 != c8818g.f79512r.get(i22)) {
                                                                                        i22++;
                                                                                    }
                                                                                }
                                                                                i18 = i22 + 1;
                                                                            } else {
                                                                                i18 = i21;
                                                                            }
                                                                            hVar9.M(nVar);
                                                                            hVar8 = hVar9;
                                                                            nVar = hVar8;
                                                                            i16 = 8;
                                                                        } else {
                                                                            c8818g.f0(hVar8);
                                                                        }
                                                                    }
                                                                }
                                                                j11.M(nVar);
                                                                Pf.h hVar10 = new Pf.h(hVar2.V(), c8818g.f79469f, null);
                                                                hVar10.e().e(hVar2.e());
                                                                Iterator<Pf.n> it = hVar3.i().iterator();
                                                                while (it.hasNext()) {
                                                                    hVar10.M(it.next());
                                                                }
                                                                hVar3.M(hVar10);
                                                                c8818g.e0(hVar2);
                                                                c8818g.l(hVar10);
                                                                try {
                                                                    c8818g.f79512r.add(i18, hVar10);
                                                                } catch (IndexOutOfBoundsException unused) {
                                                                    c8818g.f79512r.add(hVar10);
                                                                }
                                                                c8818g.f0(hVar2);
                                                                int lastIndexOf4 = c8818g.f79468e.lastIndexOf(hVar3);
                                                                Nf.b.a(lastIndexOf4 != -1);
                                                                c8818g.f79468e.add(lastIndexOf4 + 1, hVar10);
                                                                i15 = i17;
                                                                i12 = -1;
                                                            }
                                                        }
                                                    }
                                                    hVar3 = null;
                                                    if (hVar3 != null) {
                                                    }
                                                }
                                            } else if (hVar2.x().equals(obj)) {
                                                if (hVar2 == null) {
                                                }
                                            }
                                        }
                                        hVar2 = null;
                                        if (hVar2 == null) {
                                        }
                                    }
                                }
                                return true;
                        }
                    case 5:
                        C.b bVar = (C.b) c11;
                        if (bVar.f79417d.g().equals(EnumC8819h.nullString)) {
                            c8818g.u(this);
                            return false;
                        }
                        if (c8818g.w() && EnumC8819h.a(bVar)) {
                            c8818g.d0();
                            c8818g.K(bVar);
                            return true;
                        }
                        c8818g.d0();
                        c8818g.K(bVar);
                        c8818g.v(false);
                        return true;
                    case 6:
                        if (c8818g.n0() > 0) {
                            return EnumC8819h.InTemplate.f(c11, c8818g);
                        }
                        if (!c8818g.Y(strArr4)) {
                            return true;
                        }
                        c8818g.u(this);
                        return true;
                    default:
                        throw new IllegalStateException("Unexpected state: " + c11.f79414a);
                }
            }

            final boolean g(C c11, C8818g c8818g) {
                c11.getClass();
                String str = ((C.f) c11).f79425e;
                ArrayList<Pf.h> arrayList = c8818g.f79468e;
                if (c8818g.A(str) == null) {
                    c8818g.u(this);
                    return false;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Pf.h hVar = arrayList.get(size);
                    if (hVar.t(str)) {
                        c8818g.x(str);
                        if (!c8818g.b(str)) {
                            c8818g.u(this);
                        }
                        c8818g.a0(str);
                        return true;
                    }
                    if (C8818g.S(hVar)) {
                        c8818g.u(this);
                        return false;
                    }
                }
                return true;
            }
        };
        InBody = enumC8819h7;
        EnumC8819h enumC8819h8 = new EnumC8819h() { // from class: org.jsoup.parser.h.x
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (c11.f79414a == C.i.Character) {
                    c8818g.K((C.b) c11);
                    return true;
                }
                if (!c11.c()) {
                    if (!c11.d()) {
                        return true;
                    }
                    c8818g.d();
                    c8818g.o0(c8818g.Z());
                    return true;
                }
                c8818g.u(this);
                c8818g.d();
                c8818g.o0(c8818g.Z());
                if (c8818g.m0() == EnumC8819h.Text) {
                    c8818g.o0(EnumC8819h.InBody);
                }
                return c8818g.e(c11);
            }
        };
        Text = enumC8819h8;
        EnumC8819h enumC8819h9 = new EnumC8819h() { // from class: org.jsoup.parser.h.y
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (c11.f79414a == C.i.Character && Of.k.d(c8818g.a().x(), z.f79557z)) {
                    c8818g.i0();
                    c8818g.T();
                    c8818g.o0(EnumC8819h.InTableText);
                    return c8818g.e(c11);
                }
                if (c11.a()) {
                    c8818g.M((C.c) c11);
                    return true;
                }
                if (c11.b()) {
                    c8818g.u(this);
                    return false;
                }
                if (!c11.e()) {
                    if (!c11.d()) {
                        if (!c11.c()) {
                            g(c11, c8818g);
                            return true;
                        }
                        if (c8818g.b("html")) {
                            c8818g.u(this);
                        }
                        return true;
                    }
                    String q11 = ((C.f) c11).q();
                    if (q11.equals("table")) {
                        if (!c8818g.J(q11)) {
                            c8818g.u(this);
                            return false;
                        }
                        c8818g.a0("table");
                        c8818g.h0();
                        return true;
                    }
                    if (Of.k.d(q11, z.f79556y)) {
                        c8818g.u(this);
                        return false;
                    }
                    if (q11.equals("template")) {
                        EnumC8819h.InHead.f(c11, c8818g);
                        return true;
                    }
                    g(c11, c8818g);
                    return true;
                }
                C.g gVar = (C.g) c11;
                String q12 = gVar.q();
                if (q12.equals("caption")) {
                    c8818g.p();
                    c8818g.f79512r.add(null);
                    c8818g.N(gVar);
                    c8818g.o0(EnumC8819h.InCaption);
                    return true;
                }
                if (q12.equals("colgroup")) {
                    c8818g.p();
                    c8818g.N(gVar);
                    c8818g.o0(EnumC8819h.InColumnGroup);
                    return true;
                }
                if (q12.equals("col")) {
                    c8818g.p();
                    c8818g.g("colgroup");
                    return c8818g.e(c11);
                }
                if (Of.k.d(q12, z.f79549r)) {
                    c8818g.p();
                    c8818g.N(gVar);
                    c8818g.o0(EnumC8819h.InTableBody);
                    return true;
                }
                if (Of.k.d(q12, z.f79550s)) {
                    c8818g.p();
                    c8818g.g("tbody");
                    return c8818g.e(c11);
                }
                if (q12.equals("table")) {
                    c8818g.u(this);
                    if (c8818g.J(q12)) {
                        c8818g.a0(q12);
                        if (c8818g.h0()) {
                            return c8818g.e(c11);
                        }
                        c8818g.N(gVar);
                        return true;
                    }
                } else {
                    if (Of.k.d(q12, z.f79551t)) {
                        return EnumC8819h.InHead.f(c11, c8818g);
                    }
                    if (q12.equals("input")) {
                        Pf.b bVar = gVar.f79427g;
                        if (bVar == null || !bVar.k("type").equalsIgnoreCase(FormPageDTO.Field.FIELD_TYPE_HIDDEN)) {
                            g(c11, c8818g);
                            return true;
                        }
                        c8818g.O(gVar);
                        return true;
                    }
                    if (!q12.equals(DynamicElementDTO.FORM)) {
                        g(c11, c8818g);
                        return true;
                    }
                    c8818g.u(this);
                    if (c8818g.z() == null && !c8818g.W("template")) {
                        c8818g.Q(gVar, false, false);
                        return true;
                    }
                }
                return false;
            }

            final void g(C c11, C8818g c8818g) {
                c8818g.u(this);
                c8818g.k0(true);
                EnumC8819h.InBody.f(c11, c8818g);
                c8818g.k0(false);
            }
        };
        InTable = enumC8819h9;
        EnumC8819h enumC8819h10 = new EnumC8819h() { // from class: org.jsoup.parser.h.a
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (c11.f79414a == C.i.Character) {
                    C.b bVar = (C.b) c11;
                    if (bVar.f79417d.g().equals(EnumC8819h.nullString)) {
                        c8818g.u(this);
                        return false;
                    }
                    c8818g.k(bVar);
                    return true;
                }
                if (c8818g.C().size() > 0) {
                    C c12 = c8818g.f79470g;
                    Iterator it = c8818g.C().iterator();
                    while (it.hasNext()) {
                        C.b bVar2 = (C.b) it.next();
                        c8818g.f79470g = bVar2;
                        if (EnumC8819h.a(bVar2)) {
                            c8818g.K(bVar2);
                        } else {
                            c8818g.u(this);
                            if (Of.k.d(c8818g.a().x(), z.f79557z)) {
                                c8818g.k0(true);
                                EnumC8819h.InBody.f(bVar2, c8818g);
                                c8818g.k0(false);
                            } else {
                                EnumC8819h.InBody.f(bVar2, c8818g);
                            }
                        }
                    }
                    c8818g.f79470g = c12;
                    c8818g.i0();
                }
                c8818g.o0(c8818g.Z());
                return c8818g.e(c11);
            }
        };
        InTableText = enumC8819h10;
        EnumC8819h enumC8819h11 = new EnumC8819h() { // from class: org.jsoup.parser.h.b
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (c11.d() && ((C.f) c11).q().equals("caption")) {
                    if (!c8818g.J("caption")) {
                        c8818g.u(this);
                        return false;
                    }
                    c8818g.y(false);
                    if (!c8818g.b("caption")) {
                        c8818g.u(this);
                    }
                    c8818g.a0("caption");
                    c8818g.m();
                    c8818g.o0(EnumC8819h.InTable);
                    return true;
                }
                if ((!c11.e() || !Of.k.d(((C.g) c11).q(), z.f79555x)) && (!c11.d() || !((C.f) c11).q().equals("table"))) {
                    if (!c11.d() || !Of.k.d(((C.f) c11).q(), z.f79528I)) {
                        return EnumC8819h.InBody.f(c11, c8818g);
                    }
                    c8818g.u(this);
                    return false;
                }
                if (!c8818g.J("caption")) {
                    c8818g.u(this);
                    return false;
                }
                c8818g.y(false);
                if (!c8818g.b("caption")) {
                    c8818g.u(this);
                }
                c8818g.a0("caption");
                c8818g.m();
                EnumC8819h enumC8819h12 = EnumC8819h.InTable;
                c8818g.o0(enumC8819h12);
                enumC8819h12.f(c11, c8818g);
                return true;
            }
        };
        InCaption = enumC8819h11;
        EnumC8819h enumC8819h12 = new EnumC8819h() { // from class: org.jsoup.parser.h.c
            private boolean g(C c11, C8818g c8818g) {
                if (!c8818g.b("colgroup")) {
                    c8818g.u(this);
                    return false;
                }
                c8818g.d();
                c8818g.o0(EnumC8819h.InTable);
                c8818g.e(c11);
                return true;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x009d, code lost:
            
                if (r6.equals("template") == false) goto L38;
             */
            @Override // org.jsoup.parser.EnumC8819h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            final boolean f(C c11, C8818g c8818g) {
                boolean z11 = false;
                if (EnumC8819h.a(c11)) {
                    c8818g.K((C.b) c11);
                    return true;
                }
                int i11 = q.f79519a[c11.f79414a.ordinal()];
                if (i11 == 1) {
                    c8818g.M((C.c) c11);
                    return true;
                }
                if (i11 == 2) {
                    c8818g.u(this);
                    return true;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 6 && c8818g.b("html")) {
                            return true;
                        }
                        return g(c11, c8818g);
                    }
                    String q11 = ((C.f) c11).q();
                    q11.getClass();
                    if (q11.equals("template")) {
                        EnumC8819h.InHead.f(c11, c8818g);
                        return true;
                    }
                    if (!q11.equals("colgroup")) {
                        return g(c11, c8818g);
                    }
                    if (!c8818g.b(q11)) {
                        c8818g.u(this);
                        return false;
                    }
                    c8818g.d();
                    c8818g.o0(EnumC8819h.InTable);
                    return true;
                }
                C.g gVar = (C.g) c11;
                String q12 = gVar.q();
                q12.getClass();
                switch (q12.hashCode()) {
                    case -1321546630:
                        break;
                    case 98688:
                        if (q12.equals("col")) {
                            z11 = true;
                            break;
                        }
                        z11 = -1;
                        break;
                    case 3213227:
                        if (q12.equals("html")) {
                            z11 = 2;
                            break;
                        }
                        z11 = -1;
                        break;
                    default:
                        z11 = -1;
                        break;
                }
                switch (z11) {
                    case false:
                        EnumC8819h.InHead.f(c11, c8818g);
                        return true;
                    case true:
                        c8818g.O(gVar);
                        return true;
                    case true:
                        return EnumC8819h.InBody.f(c11, c8818g);
                    default:
                        return g(c11, c8818g);
                }
            }
        };
        InColumnGroup = enumC8819h12;
        EnumC8819h enumC8819h13 = new EnumC8819h() { // from class: org.jsoup.parser.h.d
            private boolean g(C c11, C8818g c8818g) {
                if (!c8818g.J("tbody") && !c8818g.J("thead") && !c8818g.F("tfoot")) {
                    c8818g.u(this);
                    return false;
                }
                c8818g.o();
                c8818g.f(c8818g.a().x());
                return c8818g.e(c11);
            }

            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                int i11 = q.f79519a[c11.f79414a.ordinal()];
                if (i11 == 3) {
                    C.g gVar = (C.g) c11;
                    String q11 = gVar.q();
                    if (q11.equals("tr")) {
                        c8818g.o();
                        c8818g.N(gVar);
                        c8818g.o0(EnumC8819h.InRow);
                        return true;
                    }
                    if (!Of.k.d(q11, z.f79552u)) {
                        return Of.k.d(q11, z.f79520A) ? g(c11, c8818g) : EnumC8819h.InTable.f(c11, c8818g);
                    }
                    c8818g.u(this);
                    c8818g.g("tr");
                    return c8818g.e(gVar);
                }
                if (i11 != 4) {
                    return EnumC8819h.InTable.f(c11, c8818g);
                }
                String q12 = ((C.f) c11).q();
                if (!Of.k.d(q12, z.f79526G)) {
                    if (q12.equals("table")) {
                        return g(c11, c8818g);
                    }
                    if (!Of.k.d(q12, z.f79521B)) {
                        return EnumC8819h.InTable.f(c11, c8818g);
                    }
                    c8818g.u(this);
                    return false;
                }
                if (!c8818g.J(q12)) {
                    c8818g.u(this);
                    return false;
                }
                c8818g.o();
                c8818g.d();
                c8818g.o0(EnumC8819h.InTable);
                return true;
            }
        };
        InTableBody = enumC8819h13;
        EnumC8819h enumC8819h14 = new EnumC8819h() { // from class: org.jsoup.parser.h.e
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (c11.e()) {
                    C.g gVar = (C.g) c11;
                    String q11 = gVar.q();
                    if (Of.k.d(q11, z.f79552u)) {
                        c8818g.q();
                        c8818g.N(gVar);
                        c8818g.o0(EnumC8819h.InCell);
                        c8818g.f79512r.add(null);
                        return true;
                    }
                    if (!Of.k.d(q11, z.f79522C)) {
                        return EnumC8819h.InTable.f(c11, c8818g);
                    }
                    if (!c8818g.J("tr")) {
                        c8818g.u(this);
                        return false;
                    }
                    c8818g.q();
                    c8818g.d();
                    c8818g.o0(EnumC8819h.InTableBody);
                    return c8818g.e(c11);
                }
                if (!c11.d()) {
                    return EnumC8819h.InTable.f(c11, c8818g);
                }
                String q12 = ((C.f) c11).q();
                if (q12.equals("tr")) {
                    if (!c8818g.J(q12)) {
                        c8818g.u(this);
                        return false;
                    }
                    c8818g.q();
                    c8818g.d();
                    c8818g.o0(EnumC8819h.InTableBody);
                    return true;
                }
                if (q12.equals("table")) {
                    if (!c8818g.J("tr")) {
                        c8818g.u(this);
                        return false;
                    }
                    c8818g.q();
                    c8818g.d();
                    c8818g.o0(EnumC8819h.InTableBody);
                    return c8818g.e(c11);
                }
                if (!Of.k.d(q12, z.f79549r)) {
                    if (!Of.k.d(q12, z.f79523D)) {
                        return EnumC8819h.InTable.f(c11, c8818g);
                    }
                    c8818g.u(this);
                    return false;
                }
                if (!c8818g.J(q12)) {
                    c8818g.u(this);
                    return false;
                }
                if (!c8818g.J("tr")) {
                    return false;
                }
                c8818g.q();
                c8818g.d();
                c8818g.o0(EnumC8819h.InTableBody);
                return c8818g.e(c11);
            }
        };
        InRow = enumC8819h14;
        EnumC8819h enumC8819h15 = new EnumC8819h() { // from class: org.jsoup.parser.h.f
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (!c11.d()) {
                    if (!c11.e() || !Of.k.d(((C.g) c11).q(), z.f79555x)) {
                        return EnumC8819h.InBody.f(c11, c8818g);
                    }
                    if (!c8818g.J("td") && !c8818g.J("th")) {
                        c8818g.u(this);
                        return false;
                    }
                    if (c8818g.J("td")) {
                        c8818g.f("td");
                    } else {
                        c8818g.f("th");
                    }
                    return c8818g.e(c11);
                }
                String q11 = ((C.f) c11).q();
                if (Of.k.d(q11, z.f79552u)) {
                    if (!c8818g.J(q11)) {
                        c8818g.u(this);
                        c8818g.o0(EnumC8819h.InRow);
                        return false;
                    }
                    c8818g.y(false);
                    if (!c8818g.b(q11)) {
                        c8818g.u(this);
                    }
                    c8818g.a0(q11);
                    c8818g.m();
                    c8818g.o0(EnumC8819h.InRow);
                    return true;
                }
                if (Of.k.d(q11, z.f79553v)) {
                    c8818g.u(this);
                    return false;
                }
                if (!Of.k.d(q11, z.f79554w)) {
                    return EnumC8819h.InBody.f(c11, c8818g);
                }
                if (!c8818g.J(q11)) {
                    c8818g.u(this);
                    return false;
                }
                if (c8818g.J("td")) {
                    c8818g.f("td");
                } else {
                    c8818g.f("th");
                }
                return c8818g.e(c11);
            }
        };
        InCell = enumC8819h15;
        EnumC8819h enumC8819h16 = new EnumC8819h() { // from class: org.jsoup.parser.h.g
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                String q11;
                switch (q.f79519a[c11.f79414a.ordinal()]) {
                    case 1:
                        c8818g.M((C.c) c11);
                        return true;
                    case 2:
                        c8818g.u(this);
                        return false;
                    case 3:
                        C.g gVar = (C.g) c11;
                        String q12 = gVar.q();
                        if (q12.equals("html")) {
                            return EnumC8819h.InBody.f(gVar, c8818g);
                        }
                        if (q12.equals("option")) {
                            if (c8818g.b("option")) {
                                c8818g.f("option");
                            }
                            c8818g.N(gVar);
                        } else {
                            if (!q12.equals("optgroup")) {
                                if (q12.equals("select")) {
                                    c8818g.u(this);
                                    return c8818g.f("select");
                                }
                                if (Of.k.d(q12, z.f79524E)) {
                                    c8818g.u(this);
                                    if (!c8818g.H("select")) {
                                        return false;
                                    }
                                    c8818g.f("select");
                                    return c8818g.e(gVar);
                                }
                                if (q12.equals("script") || q12.equals("template")) {
                                    return EnumC8819h.InHead.f(c11, c8818g);
                                }
                                c8818g.u(this);
                                return false;
                            }
                            if (c8818g.b("option")) {
                                c8818g.f("option");
                            }
                            if (c8818g.b("optgroup")) {
                                c8818g.f("optgroup");
                            }
                            c8818g.N(gVar);
                        }
                        return true;
                    case 4:
                        q11 = ((C.f) c11).q();
                        q11.getClass();
                        switch (q11) {
                            case "template":
                                return EnumC8819h.InHead.f(c11, c8818g);
                            case "option":
                                if (c8818g.b("option")) {
                                    c8818g.d();
                                } else {
                                    c8818g.u(this);
                                }
                                return true;
                            case "select":
                                if (!c8818g.H(q11)) {
                                    c8818g.u(this);
                                    return false;
                                }
                                c8818g.a0(q11);
                                c8818g.h0();
                                return true;
                            case "optgroup":
                                if (c8818g.b("option") && c8818g.j(c8818g.a()) != null && c8818g.j(c8818g.a()).t("optgroup")) {
                                    c8818g.f("option");
                                }
                                if (c8818g.b("optgroup")) {
                                    c8818g.d();
                                } else {
                                    c8818g.u(this);
                                }
                                return true;
                            default:
                                c8818g.u(this);
                                return false;
                        }
                    case 5:
                        C.b bVar = (C.b) c11;
                        if (bVar.f79417d.g().equals(EnumC8819h.nullString)) {
                            c8818g.u(this);
                            return false;
                        }
                        c8818g.K(bVar);
                        return true;
                    case 6:
                        if (!c8818g.b("html")) {
                            c8818g.u(this);
                        }
                        return true;
                    default:
                        c8818g.u(this);
                        return false;
                }
            }
        };
        InSelect = enumC8819h16;
        EnumC8819h enumC8819h17 = new EnumC8819h() { // from class: org.jsoup.parser.h.h
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                boolean e11 = c11.e();
                String[] strArr = z.f79525F;
                if (e11 && Of.k.d(((C.g) c11).q(), strArr)) {
                    c8818g.u(this);
                    c8818g.a0("select");
                    c8818g.h0();
                    return c8818g.e(c11);
                }
                if (c11.d()) {
                    C.f fVar = (C.f) c11;
                    if (Of.k.d(fVar.q(), strArr)) {
                        c8818g.u(this);
                        if (!c8818g.J(fVar.q())) {
                            return false;
                        }
                        c8818g.a0("select");
                        c8818g.h0();
                        return c8818g.e(c11);
                    }
                }
                return EnumC8819h.InSelect.f(c11, c8818g);
            }
        };
        InSelectInTable = enumC8819h17;
        EnumC8819h enumC8819h18 = new EnumC8819h() { // from class: org.jsoup.parser.h.i
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                switch (q.f79519a[c11.f79414a.ordinal()]) {
                    case 1:
                    case 2:
                    case 5:
                        EnumC8819h.InBody.f(c11, c8818g);
                        return true;
                    case 3:
                        String q11 = ((C.g) c11).q();
                        if (Of.k.d(q11, z.f79529J)) {
                            EnumC8819h.InHead.f(c11, c8818g);
                            return true;
                        }
                        if (Of.k.d(q11, z.f79530K)) {
                            c8818g.b0();
                            EnumC8819h enumC8819h19 = EnumC8819h.InTable;
                            c8818g.c0(enumC8819h19);
                            c8818g.o0(enumC8819h19);
                            return c8818g.e(c11);
                        }
                        if (q11.equals("col")) {
                            c8818g.b0();
                            EnumC8819h enumC8819h20 = EnumC8819h.InColumnGroup;
                            c8818g.c0(enumC8819h20);
                            c8818g.o0(enumC8819h20);
                            return c8818g.e(c11);
                        }
                        if (q11.equals("tr")) {
                            c8818g.b0();
                            EnumC8819h enumC8819h21 = EnumC8819h.InTableBody;
                            c8818g.c0(enumC8819h21);
                            c8818g.o0(enumC8819h21);
                            return c8818g.e(c11);
                        }
                        if (q11.equals("td") || q11.equals("th")) {
                            c8818g.b0();
                            EnumC8819h enumC8819h22 = EnumC8819h.InRow;
                            c8818g.c0(enumC8819h22);
                            c8818g.o0(enumC8819h22);
                            return c8818g.e(c11);
                        }
                        c8818g.b0();
                        EnumC8819h enumC8819h23 = EnumC8819h.InBody;
                        c8818g.c0(enumC8819h23);
                        c8818g.o0(enumC8819h23);
                        return c8818g.e(c11);
                    case 4:
                        if (((C.f) c11).q().equals("template")) {
                            EnumC8819h.InHead.f(c11, c8818g);
                            return true;
                        }
                        c8818g.u(this);
                        return false;
                    case 6:
                        if (c8818g.W("template")) {
                            c8818g.u(this);
                            c8818g.a0("template");
                            c8818g.m();
                            c8818g.b0();
                            c8818g.h0();
                            if (c8818g.m0() != EnumC8819h.InTemplate && c8818g.n0() < 12) {
                                return c8818g.e(c11);
                            }
                        }
                        return true;
                    default:
                        throw new IllegalStateException("Unexpected state: " + c11.f79414a);
                }
            }
        };
        InTemplate = enumC8819h18;
        EnumC8819h enumC8819h19 = new EnumC8819h() { // from class: org.jsoup.parser.h.j
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                Pf.h A11 = c8818g.A("html");
                if (EnumC8819h.a(c11)) {
                    if (A11 != null) {
                        c8818g.L((C.b) c11, A11);
                        return true;
                    }
                    EnumC8819h.InBody.f(c11, c8818g);
                    return true;
                }
                if (c11.a()) {
                    c8818g.M((C.c) c11);
                    return true;
                }
                if (c11.b()) {
                    c8818g.u(this);
                    return false;
                }
                if (c11.e() && ((C.g) c11).q().equals("html")) {
                    return EnumC8819h.InBody.f(c11, c8818g);
                }
                if (c11.d() && ((C.f) c11).q().equals("html")) {
                    if (A11 != null) {
                        c8818g.i(A11, false);
                    }
                    c8818g.o0(EnumC8819h.AfterAfterBody);
                    return true;
                }
                if (c11.c()) {
                    return true;
                }
                c8818g.u(this);
                c8818g.g0();
                return c8818g.e(c11);
            }
        };
        AfterBody = enumC8819h19;
        EnumC8819h enumC8819h20 = new EnumC8819h() { // from class: org.jsoup.parser.h.l
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                C.g gVar;
                if (EnumC8819h.a(c11)) {
                    c8818g.K((C.b) c11);
                    return true;
                }
                if (c11.a()) {
                    c8818g.M((C.c) c11);
                    return true;
                }
                if (c11.b()) {
                    c8818g.u(this);
                    return false;
                }
                if (!c11.e()) {
                    if (c11.d() && ((C.f) c11).q().equals("frameset")) {
                        if (c8818g.b("html")) {
                            c8818g.u(this);
                            return false;
                        }
                        c8818g.d();
                        if (!c8818g.b("frameset")) {
                            c8818g.o0(EnumC8819h.AfterFrameset);
                            return true;
                        }
                    } else {
                        if (!c11.c()) {
                            c8818g.u(this);
                            return false;
                        }
                        if (!c8818g.b("html")) {
                            c8818g.u(this);
                        }
                    }
                    return true;
                }
                gVar = (C.g) c11;
                String q11 = gVar.q();
                q11.getClass();
                switch (q11) {
                    case "frameset":
                        c8818g.N(gVar);
                        break;
                    case "html":
                        break;
                    case "frame":
                        c8818g.O(gVar);
                        break;
                    case "noframes":
                        break;
                    default:
                        c8818g.u(this);
                        break;
                }
                return true;
            }
        };
        InFrameset = enumC8819h20;
        EnumC8819h enumC8819h21 = new EnumC8819h() { // from class: org.jsoup.parser.h.m
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (EnumC8819h.a(c11)) {
                    c8818g.K((C.b) c11);
                    return true;
                }
                if (c11.a()) {
                    c8818g.M((C.c) c11);
                    return true;
                }
                if (c11.b()) {
                    c8818g.u(this);
                    return false;
                }
                if (c11.e() && ((C.g) c11).q().equals("html")) {
                    return EnumC8819h.InBody.f(c11, c8818g);
                }
                if (c11.d() && ((C.f) c11).q().equals("html")) {
                    c8818g.o0(EnumC8819h.AfterAfterFrameset);
                    return true;
                }
                if (c11.e() && ((C.g) c11).q().equals("noframes")) {
                    return EnumC8819h.InHead.f(c11, c8818g);
                }
                if (c11.c()) {
                    return true;
                }
                c8818g.u(this);
                return false;
            }
        };
        AfterFrameset = enumC8819h21;
        EnumC8819h enumC8819h22 = new EnumC8819h() { // from class: org.jsoup.parser.h.n
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (c11.a()) {
                    c8818g.M((C.c) c11);
                    return true;
                }
                if (c11.b() || (c11.e() && ((C.g) c11).q().equals("html"))) {
                    return EnumC8819h.InBody.f(c11, c8818g);
                }
                if (EnumC8819h.a(c11)) {
                    c8818g.L((C.b) c11, c8818g.f79467d);
                    return true;
                }
                if (c11.c()) {
                    return true;
                }
                c8818g.u(this);
                c8818g.g0();
                return c8818g.e(c11);
            }
        };
        AfterAfterBody = enumC8819h22;
        EnumC8819h enumC8819h23 = new EnumC8819h() { // from class: org.jsoup.parser.h.o
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                if (c11.a()) {
                    c8818g.M((C.c) c11);
                    return true;
                }
                if (c11.b() || EnumC8819h.a(c11) || (c11.e() && ((C.g) c11).q().equals("html"))) {
                    return EnumC8819h.InBody.f(c11, c8818g);
                }
                if (c11.c()) {
                    return true;
                }
                if (c11.e() && ((C.g) c11).q().equals("noframes")) {
                    return EnumC8819h.InHead.f(c11, c8818g);
                }
                c8818g.u(this);
                return false;
            }
        };
        AfterAfterFrameset = enumC8819h23;
        EnumC8819h enumC8819h24 = new EnumC8819h() { // from class: org.jsoup.parser.h.p
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // org.jsoup.parser.EnumC8819h
            final boolean f(C c11, C8818g c8818g) {
                Pf.b bVar;
                Pf.b bVar2;
                Pf.b bVar3;
                Pf.h a11;
                switch (q.f79519a[c11.f79414a.ordinal()]) {
                    case 1:
                        c8818g.M((C.c) c11);
                        return true;
                    case 2:
                        c8818g.u(this);
                        return true;
                    case 3:
                        C.g gVar = (C.g) c11;
                        if (Of.k.c(gVar.f79425e, z.f79531L)) {
                            return c8818g.m0().f(c11, c8818g);
                        }
                        if (gVar.f79425e.equals("font") && (((bVar = gVar.f79427g) != null && bVar.n("color")) || (((bVar2 = gVar.f79427g) != null && bVar2.n("face")) || ((bVar3 = gVar.f79427g) != null && bVar3.n("size"))))) {
                            return c8818g.m0().f(c11, c8818g);
                        }
                        String str = c8818g.a().V().f79568a;
                        c8818g.P(gVar, str);
                        I m11 = c8818g.f79472i.d(gVar.f79424d.g(), gVar.f79425e, str, c8818g.f79471h.e()).m();
                        if (m11 != null) {
                            if (gVar.f79425e.equals("script")) {
                                c8818g.f79466c.s(I.ScriptData);
                            } else {
                                c8818g.f79466c.s(m11);
                            }
                            c8818g.T();
                            c8818g.o0(EnumC8819h.Text);
                        }
                        return true;
                    case 4:
                        C.f fVar = (C.f) c11;
                        if (fVar.f79425e.equals("br") || fVar.f79425e.equals("p")) {
                            return c8818g.m0().f(c11, c8818g);
                        }
                        if (fVar.f79425e.equals("script") && c8818g.f79468e.size() != 0 && (a11 = c8818g.a()) != null && a11.x().equals("script") && a11.V().f79568a.equals("http://www.w3.org/2000/svg")) {
                            c8818g.d();
                            return true;
                        }
                        ArrayList<Pf.h> arrayList = c8818g.f79468e;
                        if (arrayList.isEmpty()) {
                            throw new IllegalStateException("Stack unexpectedly empty");
                        }
                        int size = arrayList.size() - 1;
                        Pf.h hVar = arrayList.get(size);
                        if (!hVar.t(fVar.f79425e)) {
                            c8818g.u(this);
                        }
                        do {
                            if (size != 0) {
                                if (hVar.t(fVar.f79425e)) {
                                    String x11 = hVar.x();
                                    for (int size2 = c8818g.f79468e.size() - 1; size2 >= 0 && !c8818g.d().t(x11); size2--) {
                                    }
                                } else {
                                    size--;
                                    hVar = arrayList.get(size);
                                }
                            }
                            return true;
                        } while (!hVar.V().f79568a.equals("http://www.w3.org/1999/xhtml"));
                        return c8818g.m0().f(c11, c8818g);
                    case 5:
                        C.b bVar4 = (C.b) c11;
                        if (bVar4.f79417d.g().equals(EnumC8819h.nullString)) {
                            c8818g.u(this);
                            return true;
                        }
                        if (EnumC8819h.a(bVar4)) {
                            c8818g.K(bVar4);
                            return true;
                        }
                        c8818g.K(bVar4);
                        c8818g.v(false);
                        return true;
                    case 6:
                        return true;
                    default:
                        throw new IllegalStateException("Unexpected state: " + c11.f79414a);
                }
            }
        };
        ForeignContent = enumC8819h24;
        $VALUES = new EnumC8819h[]{enumC8819h, enumC8819h2, enumC8819h3, enumC8819h4, enumC8819h5, enumC8819h6, enumC8819h7, enumC8819h8, enumC8819h9, enumC8819h10, enumC8819h11, enumC8819h12, enumC8819h13, enumC8819h14, enumC8819h15, enumC8819h16, enumC8819h17, enumC8819h18, enumC8819h19, enumC8819h20, enumC8819h21, enumC8819h22, enumC8819h23, enumC8819h24};
        nullString = String.valueOf((char) 0);
    }

    private EnumC8819h() {
        throw null;
    }

    static boolean a(C c11) {
        if (c11.f79414a == C.i.Character) {
            return Of.k.f(((C.b) c11).f79417d.g());
        }
        return false;
    }

    static void b(C.g gVar, C8818g c8818g, I i11) {
        if (i11 != null) {
            c8818g.f79466c.s(i11);
        }
        c8818g.T();
        c8818g.o0(Text);
        c8818g.N(gVar);
    }

    static void e(C.g gVar, Pf.h hVar) {
        Pf.b bVar = gVar.f79427g;
        if (bVar != null) {
            Iterator<C3821a> it = bVar.iterator();
            while (it.hasNext()) {
                C3821a next = it.next();
                Pf.b e11 = hVar.e();
                if (!e11.m(next.a())) {
                    q.a g10 = next.g();
                    e11.u(next);
                    if (gVar.f79432l) {
                        e11.A(next.a(), g10);
                    }
                }
            }
        }
    }

    public static EnumC8819h valueOf(String str) {
        return (EnumC8819h) Enum.valueOf(EnumC8819h.class, str);
    }

    public static EnumC8819h[] values() {
        return (EnumC8819h[]) $VALUES.clone();
    }

    abstract boolean f(C c11, C8818g c8818g);
}
