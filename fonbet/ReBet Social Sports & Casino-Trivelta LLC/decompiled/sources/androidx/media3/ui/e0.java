package androidx.media3.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.media3.ui.e0;
import com.facebook.react.uimanager.ViewProps;
import d1.C3989e;
import d1.C3991g;
import d1.C3993i;
import e1.AbstractC4134a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f22453a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f22454a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f22455b;

        public b(String str, Map map) {
            this.f22454a = str;
            this.f22455b = map;
        }
    }

    public static final class c {

        /* renamed from: e, reason: collision with root package name */
        public static final Comparator f22456e = new Comparator() { // from class: androidx.media3.ui.f0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e0.c.b((e0.c) obj, (e0.c) obj2);
            }
        };

        /* renamed from: f, reason: collision with root package name */
        public static final Comparator f22457f = new Comparator() { // from class: androidx.media3.ui.g0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e0.c.a((e0.c) obj, (e0.c) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f22458a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22459b;

        /* renamed from: c, reason: collision with root package name */
        public final String f22460c;

        /* renamed from: d, reason: collision with root package name */
        public final String f22461d;

        public static /* synthetic */ int a(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f22458a, cVar.f22458a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f22460c.compareTo(cVar.f22460c);
            return compareTo != 0 ? compareTo : cVar2.f22461d.compareTo(cVar.f22461d);
        }

        public static /* synthetic */ int b(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f22459b, cVar.f22459b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f22460c.compareTo(cVar2.f22460c);
            return compareTo != 0 ? compareTo : cVar.f22461d.compareTo(cVar2.f22461d);
        }

        public c(int i10, int i11, String str, String str2) {
            this.f22458a = i10;
            this.f22459b = i11;
            this.f22460c = str;
            this.f22461d = str2;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final List f22462a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final List f22463b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", com.google.common.collect.B.m());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), com.google.common.collect.B.m());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            hashMap.put(AbstractC2238g.a("bg_" + intValue), e1.Z.G("background-color:%s;", AbstractC2238g.b(intValue)));
        }
        SparseArray c10 = c(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < c10.size()) {
            int keyAt = c10.keyAt(i10);
            sb2.append(b(spanned.subSequence(i11, keyAt)));
            d dVar = (d) c10.get(keyAt);
            Collections.sort(dVar.f22463b, c.f22457f);
            Iterator it2 = dVar.f22463b.iterator();
            while (it2.hasNext()) {
                sb2.append(((c) it2.next()).f22461d);
            }
            Collections.sort(dVar.f22462a, c.f22456e);
            Iterator it3 = dVar.f22462a.iterator();
            while (it3.hasNext()) {
                sb2.append(((c) it3.next()).f22460c);
            }
            i10++;
            i11 = keyAt;
        }
        sb2.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), hashMap);
    }

    public static String b(CharSequence charSequence) {
        return f22453a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    public static SparseArray c(Spanned spanned, float f10) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e10 = e(obj, f10);
            String d10 = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e10 != null) {
                AbstractC4134a.e(d10);
                c cVar = new c(spanStart, spanEnd, e10, d10);
                f(sparseArray, spanStart).f22462a.add(cVar);
                f(sparseArray, spanEnd).f22463b.add(cVar);
            }
        }
        return sparseArray;
    }

    public static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof C3989e) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof C3993i)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof C3991g) {
                return "<rt>" + b(((C3991g) obj).f44906a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    public static String e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return e1.Z.G("<span style='color:%s;'>", AbstractC2238g.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return e1.Z.G("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof C3989e) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            return e1.Z.G("<span style='font-size:%.2fpx;'>", Float.valueOf(((AbsoluteSizeSpan) obj).getDip() ? r3.getSize() : r3.getSize() / f10));
        }
        if (obj instanceof RelativeSizeSpan) {
            return e1.Z.G("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return e1.Z.G("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof C3991g)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof C3993i)) {
                return null;
            }
            C3993i c3993i = (C3993i) obj;
            return e1.Z.G("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(c3993i.f44911a, c3993i.f44912b), g(c3993i.f44913c));
        }
        int i10 = ((C3991g) obj).f44907b;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    public static d f(SparseArray sparseArray, int i10) {
        d dVar = (d) sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    public static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    public static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append(ViewProps.NONE);
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }
}
