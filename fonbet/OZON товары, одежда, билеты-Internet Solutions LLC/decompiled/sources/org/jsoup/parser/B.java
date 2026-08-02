package org.jsoup.parser;

import Of.C3707a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

/* loaded from: classes10.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    static final B f79411c;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f79412a;

    /* renamed from: b, reason: collision with root package name */
    private final B f79413b;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", SelectionItemFormDTO.TITLE_FIELD_NAME, "frame", "noframes", "section", "nav", "aside", "hgroup", CommentV3DTO.HEADER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, "p", "h1", "h2", "h3", "h4", "h5", "h6", "br", "button", "ul", "ol", "pre", "div", "blockquote", "hr", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "figure", "figcaption", DynamicElementDTO.FORM, "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", RichContentDTO.ALIGN_CENTER, "template", "dir", "applet", "marquee", "listing", "#root"};
        String[] strArr2 = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr", "rb"};
        String[] strArr3 = {SelectionItemFormDTO.TITLE_FIELD_NAME, "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "li", "th", "td", "script", "style", "ins", "del", "s", "button"};
        String[] strArr4 = {"pre", "plaintext", SelectionItemFormDTO.TITLE_FIELD_NAME, "textarea", "script"};
        String[] strArr5 = {SelectionItemFormDTO.TITLE_FIELD_NAME, "textarea"};
        String[] strArr6 = Of.c.f20353a;
        B b11 = new B();
        b11.c("http://www.w3.org/1999/xhtml", strArr, new s());
        b11.c("http://www.w3.org/1999/xhtml", strArr2, new w());
        b11.c("http://www.w3.org/1999/xhtml", strArr3, new x());
        b11.c("http://www.w3.org/1999/xhtml", new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"}, new y());
        b11.c("http://www.w3.org/1999/xhtml", strArr4, new z());
        b11.c("http://www.w3.org/1999/xhtml", strArr5, new A());
        b11.c("http://www.w3.org/1999/xhtml", new String[]{"iframe", "noembed", "noframes", "script", "style", "xmp"}, new o());
        b11.c("http://www.w3.org/1999/xhtml", strArr6, new p());
        b11.c("http://www.w3.org/1998/Math/MathML", new String[]{"math"}, new q());
        b11.c("http://www.w3.org/1998/Math/MathML", new String[]{"mi", "mo", "msup", "mn", "mtext"}, new r());
        b11.c("http://www.w3.org/2000/svg", new String[]{"svg", "femerge", "femergenode"}, new t());
        b11.c("http://www.w3.org/2000/svg", new String[]{"text"}, new u());
        b11.c("http://www.w3.org/2000/svg", new String[]{"script"}, new v());
        f79411c = b11;
    }

    public B() {
        this.f79412a = new HashMap();
        this.f79413b = null;
    }

    private void a(m mVar) {
        ((Map) this.f79412a.computeIfAbsent(mVar.f79568a, new n())).put(mVar.f79569b, mVar);
    }

    private void c(String str, String[] strArr, Consumer consumer) {
        for (String str2 : strArr) {
            m b11 = b(str2, str);
            if (b11 == null) {
                b11 = new m(str2, str2, str);
                b11.f79571d = 0;
                b11.l(1);
                a(b11);
            }
            consumer.accept(b11);
        }
    }

    public final m b(String str, String str2) {
        m b11;
        m mVar;
        Nf.b.d(str);
        Nf.b.d(str2);
        Map map = (Map) this.f79412a.get(str2);
        if (map != null && (mVar = (m) map.get(str)) != null) {
            return mVar;
        }
        B b12 = this.f79413b;
        if (b12 == null || (b11 = b12.b(str, str2)) == null) {
            return null;
        }
        m clone = b11.clone();
        a(clone);
        return clone;
    }

    final m d(String str, String str2, String str3, boolean z11) {
        Nf.b.d(str);
        Nf.b.d(str3);
        String trim = str.trim();
        Nf.b.b(trim);
        m b11 = b(trim, str3);
        if (b11 != null) {
            return b11;
        }
        if (!z11) {
            trim = str2;
        }
        m b12 = b(str2, str3);
        if (b12 == null) {
            m mVar = new m(trim, str2, str3);
            a(mVar);
            return mVar;
        }
        if (!z11 || trim.equals(str2)) {
            return b12;
        }
        m clone = b12.clone();
        clone.f79569b = trim;
        a(clone);
        return clone;
    }

    public final m e(String str, String str2, k kVar) {
        return d(str, C3707a.b(str), str2, kVar.e());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return Objects.equals(this.f79412a, ((B) obj).f79412a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f79412a);
    }

    public B(B b11) {
        this.f79412a = new HashMap();
        this.f79413b = b11;
    }
}
