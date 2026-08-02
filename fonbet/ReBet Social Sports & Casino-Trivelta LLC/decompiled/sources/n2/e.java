package n2;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import d1.AbstractC3992h;
import d1.C3985a;
import d1.C3989e;
import d1.C3991g;
import d1.C3994j;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.J;
import e1.Z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import n2.e;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f56973a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f56974b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f56975c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f56976d;

    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final Comparator f56977c = new Comparator() { // from class: n2.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Integer.compare(((e.b) obj).f56978a.f56981b, ((e.b) obj2).f56978a.f56981b);
                return compare;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final c f56978a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56979b;

        public b(c cVar, int i10) {
            this.f56978a = cVar;
            this.f56979b = i10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f56980a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56981b;

        /* renamed from: c, reason: collision with root package name */
        public final String f56982c;

        /* renamed from: d, reason: collision with root package name */
        public final Set f56983d;

        public c(String str, int i10, String str2, Set set) {
            this.f56981b = i10;
            this.f56980a = str;
            this.f56982c = str2;
            this.f56983d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String trim = str.trim();
            AbstractC4134a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] A12 = Z.A1(trim, "\\.");
            String str3 = A12[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < A12.length; i11++) {
                hashSet.add(A12[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    public static final class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final int f56984a;

        /* renamed from: b, reason: collision with root package name */
        public final n2.c f56985b;

        public d(int i10, n2.c cVar) {
            this.f56984a = i10;
            this.f56985b = cVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f56984a, dVar.f56984a);
        }
    }

    /* renamed from: n2.e$e, reason: collision with other inner class name */
    public static final class C0830e {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f56988c;

        /* renamed from: a, reason: collision with root package name */
        public long f56986a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f56987b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f56989d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f56990e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f56991f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f56992g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f56993h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f56994i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f56995j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f56996k = Integer.MIN_VALUE;

        public static float b(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        public static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            AbstractC4156x.i("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        public static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public n2.d a() {
            return new n2.d(g().a(), this.f56986a, this.f56987b);
        }

        public C3985a.b g() {
            float f10 = this.f56993h;
            if (f10 == -3.4028235E38f) {
                f10 = e(this.f56989d);
            }
            int i10 = this.f56994i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = f(this.f56989d);
            }
            C3985a.b r10 = new C3985a.b().p(c(this.f56989d)).h(b(this.f56990e, this.f56991f), this.f56991f).i(this.f56992g).k(f10).l(i10).n(Math.min(this.f56995j, d(i10, f10))).r(this.f56996k);
            CharSequence charSequence = this.f56988c;
            if (charSequence != null) {
                r10.o(charSequence);
            }
            return r10;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f56975c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f56976d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i10, int i11) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f56975c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i10, i11, 33);
            } else {
                Map map2 = f56976d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i10, i11, 33);
                }
            }
        }
    }

    public static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append(Typography.greater);
                break;
            case "lt":
                spannableStringBuilder.append(Typography.less);
                break;
            case "amp":
                spannableStringBuilder.append(Typography.amp);
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                AbstractC4156x.i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int j10 = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f56977c);
        int i10 = cVar.f56981b;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if ("rt".equals(((b) arrayList.get(i12)).f56978a.f56980a)) {
                b bVar = (b) arrayList.get(i12);
                int h10 = h(j(list2, str, bVar.f56978a), j10, 1);
                int i13 = bVar.f56978a.f56981b - i11;
                int i14 = bVar.f56979b - i11;
                CharSequence subSequence = spannableStringBuilder.subSequence(i13, i14);
                spannableStringBuilder.delete(i13, i14);
                spannableStringBuilder.setSpan(new C3991g(subSequence.toString(), h10), i10, i13, 33);
                i11 += subSequence.length();
                i10 = i13;
            }
        }
    }

    public static void d(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10;
        int length;
        i10 = cVar.f56981b;
        length = spannableStringBuilder.length();
        String str2 = cVar.f56980a;
        str2.getClass();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f56983d, i10, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case "v":
                f(spannableStringBuilder, cVar.f56982c, i10, length);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List i11 = i(list2, str, cVar);
        for (int i12 = 0; i12 < i11.size(); i12++) {
            e(spannableStringBuilder, ((d) i11.get(i12)).f56985b, i10, length);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, n2.c cVar, int i10, int i11) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            AbstractC3992h.b(spannableStringBuilder, new StyleSpan(cVar.i()), i10, i11, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (cVar.k()) {
            AbstractC3992h.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i10, i11, 33);
        }
        if (cVar.j()) {
            AbstractC3992h.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i10, i11, 33);
        }
        if (cVar.d() != null) {
            AbstractC3992h.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i10, i11, 33);
        }
        int f10 = cVar.f();
        if (f10 == 1) {
            AbstractC3992h.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i10, i11, 33);
        } else if (f10 == 2) {
            AbstractC3992h.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i10, i11, 33);
        } else if (f10 == 3) {
            AbstractC3992h.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i10, i11, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new C3989e(), i10, i11, 33);
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        spannableStringBuilder.setSpan(new C3994j(str), i10, i11, 33);
    }

    public static int g(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    public static int h(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    public static List i(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            n2.c cVar2 = (n2.c) list.get(i10);
            int h10 = cVar2.h(str, cVar.f56980a, cVar.f56983d, cVar.f56982c);
            if (h10 > 0) {
                arrayList.add(new d(h10, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int j(List list, String str, c cVar) {
        List i10 = i(list, str, cVar);
        for (int i11 = 0; i11 < i10.size(); i11++) {
            n2.c cVar2 = ((d) i10.get(i11)).f56985b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    public static String k(String str) {
        String trim = str.trim();
        AbstractC4134a.a(!trim.isEmpty());
        return Z.B1(trim, "[ \\.]")[0];
    }

    public static boolean l(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static C3985a m(CharSequence charSequence) {
        C0830e c0830e = new C0830e();
        c0830e.f56988c = charSequence;
        return c0830e.g().a();
    }

    public static n2.d n(J j10, List list) {
        String x10 = j10.x();
        if (x10 == null) {
            return null;
        }
        Pattern pattern = f56973a;
        Matcher matcher = pattern.matcher(x10);
        if (matcher.matches()) {
            return o(null, matcher, j10, list);
        }
        String x11 = j10.x();
        if (x11 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(x11);
        if (matcher2.matches()) {
            return o(x10.trim(), matcher2, j10, list);
        }
        return null;
    }

    public static n2.d o(String str, Matcher matcher, J j10, List list) {
        C0830e c0830e = new C0830e();
        try {
            c0830e.f56986a = h.d((String) AbstractC4134a.e(matcher.group(1)));
            c0830e.f56987b = h.d((String) AbstractC4134a.e(matcher.group(2)));
            q((String) AbstractC4134a.e(matcher.group(3)), c0830e);
            StringBuilder sb2 = new StringBuilder();
            String x10 = j10.x();
            while (!TextUtils.isEmpty(x10)) {
                if (sb2.length() > 0) {
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                sb2.append(x10.trim());
                x10 = j10.x();
            }
            c0830e.f56988c = r(str, sb2.toString(), list);
            return c0830e.a();
        } catch (IllegalArgumentException unused) {
            AbstractC4156x.i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static C3985a.b p(String str) {
        C0830e c0830e = new C0830e();
        q(str, c0830e);
        return c0830e.g();
    }

    public static void q(String str, C0830e c0830e) {
        Matcher matcher = f56974b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC4134a.e(matcher.group(1));
            String str3 = (String) AbstractC4134a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    t(str3, c0830e);
                } else if ("align".equals(str2)) {
                    c0830e.f56989d = w(str3);
                } else if (ViewProps.POSITION.equals(str2)) {
                    v(str3, c0830e);
                } else if ("size".equals(str2)) {
                    c0830e.f56995j = h.c(str3);
                } else if ("vertical".equals(str2)) {
                    c0830e.f56996k = x(str3);
                } else {
                    AbstractC4156x.i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                AbstractC4156x.i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString r(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i10, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    boolean z10 = str2.charAt(i11) == '/';
                    i11 = g(str2, i11);
                    int i12 = i11 - 2;
                    boolean z11 = str2.charAt(i12) == '/';
                    int i13 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i12 = i11 - 1;
                    }
                    String substring = str2.substring(i13, i12);
                    if (!substring.trim().isEmpty()) {
                        String k10 = k(substring);
                        if (l(k10)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f56980a.equals(k10)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = i11;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int s(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                AbstractC4156x.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void t(String str, C0830e c0830e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0830e.f56992g = s(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c0830e.f56990e = h.c(str);
            c0830e.f56991f = 0;
        } else {
            c0830e.f56990e = Integer.parseInt(str);
            c0830e.f56991f = 1;
        }
    }

    public static int u(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                AbstractC4156x.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void v(String str, C0830e c0830e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0830e.f56994i = u(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        c0830e.f56993h = h.c(str);
    }

    public static int w(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                AbstractC4156x.i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    public static int x(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        AbstractC4156x.i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
