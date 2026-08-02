package t4;

import Ij.C3261b;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l3.C7855a;
import l3.C7858d;
import l3.C7860f;
import l3.C7862h;
import m3.C8050C;
import m3.N;
import m3.s;
import org.maplibre.android.log.Logger;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f99137a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f99138b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f99139c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f99140d;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: c, reason: collision with root package name */
        private static final e f99141c = new e();

        /* renamed from: a, reason: collision with root package name */
        private final b f99142a;

        /* renamed from: b, reason: collision with root package name */
        private final int f99143b;

        a(b bVar, int i11) {
            this.f99142a = bVar;
            this.f99143b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f99144a;

        /* renamed from: b, reason: collision with root package name */
        public final int f99145b;

        /* renamed from: c, reason: collision with root package name */
        public final String f99146c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f99147d;

        private b(String str, int i11, String str2, Set<String> set) {
            this.f99145b = i11;
            this.f99144a = str;
            this.f99146c = str2;
            this.f99147d = set;
        }

        public static b a(int i11, String str) {
            String str2;
            String trim = str.trim();
            G10.a.c(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            int i12 = N.f74289a;
            String[] split = trim.split("\\.", -1);
            String str3 = split[0];
            HashSet hashSet = new HashSet();
            for (int i13 = 1; i13 < split.length; i13++) {
                hashSet.add(split[i13]);
            }
            return new b(str3, i11, str2, hashSet);
        }

        public static b b() {
            return new b("", 0, "", Collections.EMPTY_SET);
        }
    }

    private static final class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        public final int f99148a;

        /* renamed from: b, reason: collision with root package name */
        public final C9750c f99149b;

        public c(int i11, C9750c c9750c) {
            this.f99148a = i11;
            this.f99149b = c9750c;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.f99148a, cVar.f99148a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f99152c;

        /* renamed from: a, reason: collision with root package name */
        public long f99150a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f99151b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f99153d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f99154e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f99155f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f99156g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f99157h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f99158i = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: j, reason: collision with root package name */
        public float f99159j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f99160k = LinearLayoutManager.INVALID_OFFSET;

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0072, code lost:
        
            if (r7 == 0) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0072  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C7855a.C1210a a() {
            Layout.Alignment alignment;
            float f7;
            CharSequence charSequence;
            float f11 = this.f99157h;
            float f12 = -3.4028235E38f;
            if (f11 == -3.4028235E38f) {
                int i11 = this.f99153d;
                f11 = i11 != 4 ? i11 != 5 ? 0.5f : 1.0f : 0.0f;
            }
            int i12 = this.f99158i;
            if (i12 == Integer.MIN_VALUE) {
                int i13 = this.f99153d;
                if (i13 != 1) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 != 5) {
                                i12 = 1;
                            }
                        }
                    }
                    i12 = 2;
                }
                i12 = 0;
            }
            C7855a.C1210a c1210a = new C7855a.C1210a();
            int i14 = this.f99153d;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 != 5) {
                                C3261b.f(i14, "Unknown textAlignment: ", "WebvttCueParser");
                                alignment = null;
                            }
                        }
                    }
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                c1210a.p(alignment);
                f7 = this.f99154e;
                int i15 = this.f99155f;
                if (f7 != -3.4028235E38f || i15 != 0 || (f7 >= 0.0f && f7 <= 1.0f)) {
                    if (f7 == -3.4028235E38f) {
                        f12 = f7;
                    }
                    c1210a.h(f12, i15);
                    c1210a.i(this.f99156g);
                    c1210a.k(f11);
                    c1210a.l(i12);
                    float f13 = this.f99159j;
                    if (i12 == 0) {
                        f11 = 1.0f - f11;
                    } else if (i12 == 1) {
                        f11 = f11 <= 0.5f ? f11 * 2.0f : (1.0f - f11) * 2.0f;
                    } else if (i12 != 2) {
                        throw new IllegalStateException(String.valueOf(i12));
                    }
                    c1210a.n(Math.min(f13, f11));
                    c1210a.r(this.f99160k);
                    charSequence = this.f99152c;
                    if (charSequence != null) {
                        c1210a.o(charSequence);
                    }
                    return c1210a;
                }
                f12 = 1.0f;
                c1210a.h(f12, i15);
                c1210a.i(this.f99156g);
                c1210a.k(f11);
                c1210a.l(i12);
                float f132 = this.f99159j;
                if (i12 == 0) {
                }
                c1210a.n(Math.min(f132, f11));
                c1210a.r(this.f99160k);
                charSequence = this.f99152c;
                if (charSequence != null) {
                }
                return c1210a;
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
            c1210a.p(alignment);
            f7 = this.f99154e;
            int i152 = this.f99155f;
            if (f7 != -3.4028235E38f) {
            }
            if (f7 == -3.4028235E38f) {
            }
            c1210a.h(f12, i152);
            c1210a.i(this.f99156g);
            c1210a.k(f11);
            c1210a.l(i12);
            float f1322 = this.f99159j;
            if (i12 == 0) {
            }
            c1210a.n(Math.min(f1322, f11));
            c1210a.r(this.f99160k);
            charSequence = this.f99152c;
            if (charSequence != null) {
            }
            return c1210a;
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
        f99139c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f99140d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void a(String str, b bVar, List<a> list, SpannableStringBuilder spannableStringBuilder, List<C9750c> list2) {
        char c11;
        int i11;
        int i12 = bVar.f99145b;
        int length = spannableStringBuilder.length();
        String str2 = bVar.f99144a;
        str2.getClass();
        int i13 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case Logger.NONE /* 99 */:
                if (str2.equals("c")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i12, length, 33);
                break;
            case 2:
                for (String str3 : bVar.f99147d) {
                    Map<String, Integer> map = f99139c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i12, length, 33);
                    } else {
                        Map<String, Integer> map2 = f99140d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i12, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new C7862h(bVar.f99146c), i12, length, 33);
                break;
            case 7:
                int c12 = c(list2, str, bVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, a.f99141c);
                int i14 = bVar.f99145b;
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList.size()) {
                    if ("rt".equals(((a) arrayList.get(i15)).f99142a.f99144a)) {
                        a aVar = (a) arrayList.get(i15);
                        int c13 = c(list2, str, aVar.f99142a);
                        if (c13 == i13) {
                            c13 = c12 != i13 ? c12 : 1;
                        }
                        int i17 = aVar.f99142a.f99145b - i16;
                        int i18 = aVar.f99143b - i16;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i17, i18);
                        spannableStringBuilder.delete(i17, i18);
                        spannableStringBuilder.setSpan(new C7860f(subSequence.toString(), c13), i14, i17, 33);
                        i16 = subSequence.length() + i16;
                        i14 = i17;
                    }
                    i15++;
                    i13 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b11 = b(list2, str, bVar);
        for (int i19 = 0; i19 < b11.size(); i19 += i11) {
            C9750c c9750c = ((c) b11.get(i19)).f99149b;
            if (c9750c.i() != -1) {
                Gf.d.a(spannableStringBuilder, new StyleSpan(c9750c.i()), i12, length);
            }
            if (c9750c.l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i12, length, 33);
            }
            if (c9750c.m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
            }
            if (c9750c.k()) {
                Gf.d.a(spannableStringBuilder, new ForegroundColorSpan(c9750c.c()), i12, length);
            }
            if (c9750c.j()) {
                Gf.d.a(spannableStringBuilder, new BackgroundColorSpan(c9750c.a()), i12, length);
            }
            if (c9750c.d() != null) {
                Gf.d.a(spannableStringBuilder, new TypefaceSpan(c9750c.d()), i12, length);
            }
            int f7 = c9750c.f();
            if (f7 != 1) {
                if (f7 == 2) {
                    Gf.d.a(spannableStringBuilder, new RelativeSizeSpan(c9750c.e()), i12, length);
                } else if (f7 == 3) {
                    Gf.d.a(spannableStringBuilder, new RelativeSizeSpan(c9750c.e() / 100.0f), i12, length);
                }
                i11 = 1;
            } else {
                i11 = 1;
                Gf.d.a(spannableStringBuilder, new AbsoluteSizeSpan((int) c9750c.e(), true), i12, length);
            }
            if (c9750c.b()) {
                spannableStringBuilder.setSpan(new C7858d(), i12, length, 33);
            }
        }
    }

    private static ArrayList b(List list, String str, b bVar) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C9750c c9750c = (C9750c) list.get(i11);
            int h11 = c9750c.h(str, bVar.f99144a, bVar.f99147d, bVar.f99146c);
            if (h11 > 0) {
                arrayList.add(new c(h11, c9750c));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int c(List<C9750c> list, String str, b bVar) {
        ArrayList b11 = b(list, str, bVar);
        for (int i11 = 0; i11 < b11.size(); i11++) {
            C9750c c9750c = ((c) b11.get(i11)).f99149b;
            if (c9750c.g() != -1) {
                return c9750c.g();
            }
        }
        return -1;
    }

    private static t4.d d(String str, Matcher matcher, C8050C c8050c, ArrayList arrayList) {
        d dVar = new d();
        try {
            String group = matcher.group(1);
            group.getClass();
            dVar.f99150a = h.d(group);
            String group2 = matcher.group(2);
            group2.getClass();
            dVar.f99151b = h.d(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            g(group3, dVar);
            StringBuilder sb2 = new StringBuilder();
            c8050c.getClass();
            String r11 = c8050c.r(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(r11)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(r11.trim());
                r11 = c8050c.r(StandardCharsets.UTF_8);
            }
            dVar.f99152c = h(str, sb2.toString(), arrayList);
            return new t4.d(dVar.a().a(), dVar.f99150a, dVar.f99151b);
        } catch (IllegalArgumentException unused) {
            s.f("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static t4.d e(C8050C c8050c, ArrayList arrayList) {
        c8050c.getClass();
        Charset charset = StandardCharsets.UTF_8;
        String r11 = c8050c.r(charset);
        if (r11 != null) {
            Pattern pattern = f99137a;
            Matcher matcher = pattern.matcher(r11);
            if (matcher.matches()) {
                return d(null, matcher, c8050c, arrayList);
            }
            String r12 = c8050c.r(charset);
            if (r12 != null) {
                Matcher matcher2 = pattern.matcher(r12);
                if (matcher2.matches()) {
                    return d(r11.trim(), matcher2, c8050c, arrayList);
                }
            }
        }
        return null;
    }

    static C7855a.C1210a f(String str) {
        d dVar = new d();
        g(str, dVar);
        return dVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void g(String str, d dVar) {
        int i11;
        char c11;
        int i12;
        int i13;
        Matcher matcher = f99138b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    i(group2, dVar);
                } else if ("align".equals(group)) {
                    switch (group2) {
                        case "center":
                        case "middle":
                            i11 = 2;
                            break;
                        case "end":
                            i11 = 3;
                            break;
                        case "left":
                            i11 = 4;
                            break;
                        case "right":
                            i11 = 5;
                            break;
                        case "start":
                            i11 = 1;
                            break;
                        default:
                            s.f("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i11 = 2;
                            break;
                    }
                    dVar.f99153d = i11;
                } else if ("position".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1842484672:
                                if (substring.equals("line-left")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1364013995:
                                if (substring.equals(RichContentDTO.ALIGN_CENTER)) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1276788989:
                                if (substring.equals("line-right")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                            case 5:
                                i12 = 0;
                                break;
                            case 1:
                            case 3:
                                i12 = 1;
                                break;
                            case 2:
                            case 4:
                                i12 = 2;
                                break;
                            default:
                                s.f("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i12 = Integer.MIN_VALUE;
                                break;
                        }
                        dVar.f99158i = i12;
                        group2 = group2.substring(0, indexOf);
                    }
                    dVar.f99157h = h.c(group2);
                } else if ("size".equals(group)) {
                    dVar.f99159j = h.c(group2);
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i13 = 2;
                    } else if (group2.equals("rl")) {
                        i13 = 1;
                    } else {
                        s.f("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i13 = Integer.MIN_VALUE;
                    }
                    dVar.f99160k = i13;
                } else {
                    s.f("WebvttCueParser", "Unknown cue setting " + group + ProductContainerDTO.RATIO_DELIMITER + group2);
                }
            } catch (NumberFormatException unused) {
                s.f("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00fa. Please report as an issue. */
    static SpannedString h(String str, String str2, List<C9750c> list) {
        int i11;
        int i12;
        int i13;
        int i14 = 2;
        int i15 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        while (i16 < str2.length()) {
            char charAt = str2.charAt(i16);
            if (charAt == '&') {
                i16 += i15;
                int indexOf = str2.indexOf(59, i16);
                i11 = i15;
                int indexOf2 = str2.indexOf(32, i16);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i16, indexOf);
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case 3309:
                            if (substring.equals("gt")) {
                                i12 = 0;
                                break;
                            }
                            i12 = -1;
                            break;
                        case 3464:
                            if (substring.equals("lt")) {
                                i12 = i11;
                                break;
                            }
                            i12 = -1;
                            break;
                        case 96708:
                            if (substring.equals("amp")) {
                                i12 = 2;
                                break;
                            }
                            i12 = -1;
                            break;
                        case 3374865:
                            if (substring.equals("nbsp")) {
                                i12 = 3;
                                break;
                            }
                            i12 = -1;
                            break;
                        default:
                            i12 = -1;
                            break;
                    }
                    switch (i12) {
                        case 0:
                            spannableStringBuilder.append('>');
                            break;
                        case 1:
                            spannableStringBuilder.append('<');
                            break;
                        case 2:
                            spannableStringBuilder.append('&');
                            break;
                        case 3:
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            s.f("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i16 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i16 += i15;
                i11 = i15;
            } else {
                int i17 = i16 + 1;
                if (i17 < str2.length()) {
                    int i18 = str2.charAt(i17) == '/' ? i15 : 0;
                    int indexOf3 = str2.indexOf(62, i17);
                    i17 = indexOf3 == -1 ? str2.length() : indexOf3 + i15;
                    int i19 = i17 - 2;
                    int i21 = str2.charAt(i19) == '/' ? i15 : 0;
                    int i22 = i16 + (i18 != 0 ? i14 : i15);
                    if (i21 == 0) {
                        i19 = i17 - 1;
                    }
                    String substring2 = str2.substring(i22, i19);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        G10.a.c(trim.isEmpty() ^ i15);
                        int i23 = N.f74289a;
                        String str3 = trim.split("[ \\.]", i14)[0];
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case 98:
                                if (str3.equals("b")) {
                                    i13 = 0;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case Logger.NONE /* 99 */:
                                if (str3.equals("c")) {
                                    i13 = i15;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 105:
                                if (str3.equals("i")) {
                                    i13 = i14;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 117:
                                if (str3.equals("u")) {
                                    i13 = 3;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 118:
                                if (str3.equals("v")) {
                                    i13 = 4;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 3650:
                                if (str3.equals("rt")) {
                                    i13 = 5;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 3314158:
                                if (str3.equals("lang")) {
                                    i13 = 6;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 3511770:
                                if (str3.equals("ruby")) {
                                    i13 = 7;
                                    break;
                                }
                                i13 = -1;
                                break;
                            default:
                                i13 = -1;
                                break;
                        }
                        switch (i13) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (i18 == 0) {
                                    if (i21 == 0) {
                                        arrayDeque.push(b.a(spannableStringBuilder.length(), substring2));
                                        break;
                                    }
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        b bVar = (b) arrayDeque.pop();
                                        a(str, bVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new a(bVar, spannableStringBuilder.length()));
                                        }
                                        if (bVar.f99144a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                    i16 = i17;
                }
                i11 = i15;
                i16 = i17;
            }
            i15 = i11;
            i14 = 2;
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (b) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        a(str, b.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static void i(String str, d dVar) {
        String substring;
        int i11 = 2;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring) {
                case "center":
                case "middle":
                    i11 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i11 = 0;
                    break;
                default:
                    s.f("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i11 = LinearLayoutManager.INVALID_OFFSET;
                    break;
            }
            dVar.f99156g = i11;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            dVar.f99154e = h.c(str);
            dVar.f99155f = 0;
        } else {
            dVar.f99154e = Integer.parseInt(str);
            dVar.f99155f = 1;
        }
    }
}
