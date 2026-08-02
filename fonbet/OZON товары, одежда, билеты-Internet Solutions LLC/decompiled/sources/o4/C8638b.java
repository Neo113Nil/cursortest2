package o4;

import Ij.C3261b;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.o;
import l3.C7855a;
import m3.C8050C;
import m3.InterfaceC8068j;
import m3.N;
import m3.s;
import o4.C8639c;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: o4.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8638b implements o {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f77637g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    private final boolean f77638a;

    /* renamed from: b, reason: collision with root package name */
    private final C8637a f77639b;

    /* renamed from: d, reason: collision with root package name */
    private LinkedHashMap f77641d;

    /* renamed from: e, reason: collision with root package name */
    private float f77642e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    private float f77643f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f77640c = new C8050C();

    public C8638b(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f77638a = false;
            this.f77639b = null;
            return;
        }
        this.f77638a = true;
        String r11 = N.r(list.get(0));
        G10.a.c(r11.startsWith("Format:"));
        C8637a a11 = C8637a.a(r11);
        a11.getClass();
        this.f77639b = a11;
        d(new C8050C(list.get(1)), StandardCharsets.UTF_8);
    }

    private static int c(long j11, ArrayList arrayList, ArrayList arrayList2) {
        int i11;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i11 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j11) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j11) {
                i11 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i11, Long.valueOf(j11));
        arrayList2.add(i11, i11 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i11 - 1)));
        return i11;
    }

    private void d(C8050C c8050c, Charset charset) {
        while (true) {
            String r11 = c8050c.r(charset);
            if (r11 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(r11)) {
                while (true) {
                    String r12 = c8050c.r(charset);
                    if (r12 != null && (c8050c.a() == 0 || c8050c.k(charset) != 91)) {
                        String[] split = r12.split(ProductContainerDTO.RATIO_DELIMITER);
                        if (split.length == 2) {
                            String b11 = O7.b.b(split[0].trim());
                            b11.getClass();
                            if (b11.equals("playresx")) {
                                this.f77642e = Float.parseFloat(split[1].trim());
                            } else if (b11.equals("playresy")) {
                                try {
                                    this.f77643f = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(r11)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C8639c.a aVar = null;
                while (true) {
                    String r13 = c8050c.r(charset);
                    if (r13 == null || (c8050c.a() != 0 && c8050c.k(charset) == 91)) {
                        break;
                    }
                    if (r13.startsWith("Format:")) {
                        aVar = C8639c.a.a(r13);
                    } else if (r13.startsWith("Style:")) {
                        if (aVar == null) {
                            s.f("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(r13));
                        } else {
                            C8639c b12 = C8639c.b(r13, aVar);
                            if (b12 != null) {
                                linkedHashMap.put(b12.f77644a, b12);
                            }
                        }
                    }
                }
                this.f77641d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(r11)) {
                s.e("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(r11)) {
                return;
            }
        }
    }

    private static long e(String str) {
        Matcher matcher = f77637g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i11 = N.f74289a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    @Override // k4.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(byte[] bArr, int i11, int i12, o.b bVar, InterfaceC8068j<k4.c> interfaceC8068j) {
        Charset charset;
        C8637a c8637a;
        C8050C c8050c;
        int parseInt;
        long e11;
        float f7;
        float f11;
        C8639c.b bVar2;
        Layout.Alignment alignment;
        int i13;
        int i14;
        int i15;
        float f12;
        int i16;
        int i17;
        Integer num;
        int i18;
        C8638b c8638b = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C8050C c8050c2 = c8638b.f77640c;
        c8050c2.P(i11 + i12, bArr);
        c8050c2.R(i11);
        Charset N11 = c8050c2.N();
        if (N11 == null) {
            N11 = StandardCharsets.UTF_8;
        }
        boolean z11 = c8638b.f77638a;
        if (!z11) {
            c8638b.d(c8050c2, N11);
        }
        C8637a c8637a2 = z11 ? c8638b.f77639b : null;
        while (true) {
            String r11 = c8050c2.r(N11);
            if (r11 == null) {
                long j11 = bVar.f70476a;
                ArrayList arrayList3 = (j11 == -9223372036854775807L || !bVar.f70477b) ? null : new ArrayList();
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    List list = (List) arrayList.get(i19);
                    if (!list.isEmpty() || i19 == 0) {
                        if (i19 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long longValue = ((Long) arrayList2.get(i19)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i19 + 1)).longValue();
                        k4.c cVar = new k4.c(list, longValue, longValue2 - longValue);
                        if (j11 == -9223372036854775807L || longValue2 >= j11) {
                            interfaceC8068j.accept(cVar);
                        } else if (arrayList3 != null) {
                            arrayList3.add(cVar);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC8068j.accept((k4.c) it.next());
                    }
                    return;
                }
                return;
            }
            if (r11.startsWith("Format:")) {
                c8637a2 = C8637a.a(r11);
            } else {
                if (r11.startsWith("Dialogue:")) {
                    if (c8637a2 == null) {
                        s.f("SsaParser", "Skipping dialogue line before complete format: ".concat(r11));
                    } else {
                        G10.a.c(r11.startsWith("Dialogue:"));
                        String substring = r11.substring(9);
                        int i21 = c8637a2.f77636f;
                        String[] split = substring.split(",", i21);
                        if (split.length != i21) {
                            s.f("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(r11));
                        } else {
                            int i22 = c8637a2.f77631a;
                            if (i22 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i22].trim());
                                } catch (RuntimeException unused) {
                                    s.f("SsaParser", "Fail to parse layer: " + split[i22]);
                                }
                                e11 = e(split[c8637a2.f77632b]);
                                if (e11 != -9223372036854775807L) {
                                    s.f("SsaParser", "Skipping invalid timing: ".concat(r11));
                                } else {
                                    c8050c = c8050c2;
                                    long e12 = e(split[c8637a2.f77633c]);
                                    if (e12 == -9223372036854775807L || e12 <= e11) {
                                        charset = N11;
                                        c8637a = c8637a2;
                                        s.f("SsaParser", "Skipping invalid timing: ".concat(r11));
                                    } else {
                                        LinkedHashMap linkedHashMap = c8638b.f77641d;
                                        C8639c c8639c = (linkedHashMap == null || (i18 = c8637a2.f77634d) == -1) ? null : (C8639c) linkedHashMap.get(split[i18].trim());
                                        String str = split[c8637a2.f77635e];
                                        C8639c.b a11 = C8639c.b.a(str);
                                        charset = N11;
                                        c8637a = c8637a2;
                                        String replace = C8639c.b.c(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f13 = c8638b.f77642e;
                                        float f14 = c8638b.f77643f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        C7855a.C1210a c1210a = new C7855a.C1210a();
                                        c1210a.o(spannableString);
                                        c1210a.t(parseInt);
                                        if (c8639c != null) {
                                            Integer num2 = c8639c.f77646c;
                                            f7 = f13;
                                            if (num2 != null) {
                                                f11 = f14;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                                bVar2 = a11;
                                            } else {
                                                f11 = f14;
                                                bVar2 = a11;
                                            }
                                            if (c8639c.f77653j == 3 && (num = c8639c.f77647d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f15 = c8639c.f77648e;
                                            if (f15 != -3.4028235E38f && f11 != -3.4028235E38f) {
                                                c1210a.q(f15 / f11, 1);
                                            }
                                            boolean z12 = c8639c.f77650g;
                                            boolean z13 = c8639c.f77649f;
                                            if (z13 && z12) {
                                                i16 = 33;
                                                i17 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i16 = 33;
                                                i17 = 0;
                                                if (z13) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z12) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (c8639c.f77651h) {
                                                spannableString.setSpan(new UnderlineSpan(), i17, spannableString.length(), i16);
                                            }
                                            if (c8639c.f77652i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i17, spannableString.length(), i16);
                                            }
                                        } else {
                                            f7 = f13;
                                            f11 = f14;
                                            bVar2 = a11;
                                        }
                                        int i23 = bVar2.f77669a;
                                        if (i23 == -1) {
                                            i23 = c8639c != null ? c8639c.f77645b : -1;
                                        }
                                        switch (i23) {
                                            case 0:
                                            default:
                                                C3261b.f(i23, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        c1210a.p(alignment);
                                        int i24 = LinearLayoutManager.INVALID_OFFSET;
                                        switch (i23) {
                                            case 0:
                                            default:
                                                C3261b.f(i23, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                i13 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i13 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i13 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i13 = 2;
                                                break;
                                        }
                                        c1210a.l(i13);
                                        switch (i23) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                C3261b.f(i23, "Unknown alignment: ", "SsaParser");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i24 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i24 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i24 = 0;
                                                break;
                                        }
                                        c1210a.i(i24);
                                        PointF pointF = bVar2.f77670b;
                                        if (pointF == null || f11 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                            int d11 = c1210a.d();
                                            if (d11 != 0) {
                                                i14 = 1;
                                                if (d11 != 1) {
                                                    i15 = 2;
                                                    f12 = d11 != 2 ? -3.4028235E38f : 0.95f;
                                                } else {
                                                    i15 = 2;
                                                    f12 = 0.5f;
                                                }
                                            } else {
                                                i14 = 1;
                                                i15 = 2;
                                                f12 = 0.05f;
                                            }
                                            c1210a.k(f12);
                                            int c11 = c1210a.c();
                                            c1210a.h(c11 != 0 ? c11 != i14 ? c11 != i15 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f, 0);
                                        } else {
                                            c1210a.k(pointF.x / f7);
                                            c1210a.h(pointF.y / f11, 0);
                                        }
                                        C7855a a12 = c1210a.a();
                                        int c12 = c(e12, arrayList2, arrayList);
                                        for (int c13 = c(e11, arrayList2, arrayList); c13 < c12; c13++) {
                                            ((List) arrayList.get(c13)).add(a12);
                                        }
                                    }
                                    c8638b = this;
                                    c8050c2 = c8050c;
                                    N11 = charset;
                                    c8637a2 = c8637a;
                                }
                            }
                            parseInt = 0;
                            e11 = e(split[c8637a2.f77632b]);
                            if (e11 != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = N11;
                c8637a = c8637a2;
                c8050c = c8050c2;
                c8638b = this;
                c8050c2 = c8050c;
                N11 = charset;
                c8637a2 = c8637a;
            }
        }
    }
}
