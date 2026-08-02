package i2;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import d1.C3985a;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.InterfaceC4148o;
import e1.J;
import e1.Z;
import e2.C4163e;
import e2.s;
import i2.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f48022g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48023a;

    /* renamed from: b, reason: collision with root package name */
    public final C4519a f48024b;

    /* renamed from: d, reason: collision with root package name */
    public Map f48026d;

    /* renamed from: e, reason: collision with root package name */
    public float f48027e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f48028f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    public final J f48025c = new J();

    public b(List list) {
        if (list == null || list.isEmpty()) {
            this.f48023a = false;
            this.f48024b = null;
            return;
        }
        this.f48023a = true;
        String H10 = Z.H((byte[]) list.get(0));
        AbstractC4134a.a(H10.startsWith("Format:"));
        this.f48024b = (C4519a) AbstractC4134a.e(C4519a.a(H10));
        j(new J((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int d(long j10, List list, List list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    public static float e(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static C3985a f(String str, int i10, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        C3985a.b t10 = new C3985a.b().o(spannableString).t(i10);
        if (cVar != null) {
            if (cVar.f48031c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f48031c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f48038j == 3 && cVar.f48032d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f48032d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f48033e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                t10.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f48034f;
            if (z10 && cVar.f48035g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f48035g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f48036h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f48037i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i11 = bVar.f48054a;
        if (i11 == -1) {
            i11 = cVar != null ? cVar.f48030b : -1;
        }
        t10.p(p(i11)).l(o(i11)).i(n(i11));
        PointF pointF = bVar.f48055b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            t10.k(e(t10.d()));
            t10.h(e(t10.c()), 0);
        } else {
            t10.k(pointF.x / f10);
            t10.h(bVar.f48055b.y / f11, 0);
        }
        return t10.a();
    }

    public static Map l(J j10, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String y10 = j10.y(charset);
            if (y10 == null || (j10.a() != 0 && j10.l(charset) == 91)) {
                break;
            }
            if (y10.startsWith("Format:")) {
                aVar = c.a.a(y10);
            } else if (y10.startsWith("Style:")) {
                if (aVar == null) {
                    AbstractC4156x.i("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + y10);
                } else {
                    c b10 = c.b(y10, aVar);
                    if (b10 != null) {
                        linkedHashMap.put(b10.f48029a, b10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long m(String str) {
        Matcher matcher = f48022g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) Z.i(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) Z.i(matcher.group(2))) * 60000000) + (Long.parseLong((String) Z.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) Z.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    public static int n(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                AbstractC4156x.i("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static int o(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                AbstractC4156x.i("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static Layout.Alignment p(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                AbstractC4156x.i("SsaParser", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // e2.s
    public void a(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC4148o interfaceC4148o) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f48025c.Z(bArr, i10 + i11);
        this.f48025c.b0(i10);
        Charset g10 = g(this.f48025c);
        if (!this.f48023a) {
            j(this.f48025c, g10);
        }
        i(this.f48025c, arrayList, arrayList2, g10);
        ArrayList arrayList3 = (bVar.f45619a == -9223372036854775807L || !bVar.f45620b) ? null : new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            List list = (List) arrayList.get(i12);
            if (!list.isEmpty() || i12 == 0) {
                if (i12 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long longValue = ((Long) arrayList2.get(i12)).longValue();
                long longValue2 = ((Long) arrayList2.get(i12 + 1)).longValue();
                C4163e c4163e = new C4163e(list, longValue, longValue2 - longValue);
                long j10 = bVar.f45619a;
                if (j10 == -9223372036854775807L || longValue2 >= j10) {
                    interfaceC4148o.accept(c4163e);
                } else if (arrayList3 != null) {
                    arrayList3.add(c4163e);
                }
            }
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                interfaceC4148o.accept((C4163e) it.next());
            }
        }
    }

    @Override // e2.s
    public int c() {
        return 1;
    }

    public final Charset g(J j10) {
        Charset W10 = j10.W();
        return W10 != null ? W10 : StandardCharsets.UTF_8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(String str, C4519a c4519a, List list, List list2) {
        int parseInt;
        long m10;
        int i10;
        AbstractC4134a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", c4519a.f48021f);
        if (split.length != c4519a.f48021f) {
            AbstractC4156x.i("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        int i11 = c4519a.f48016a;
        if (i11 != -1) {
            try {
                parseInt = Integer.parseInt(split[i11].trim());
            } catch (RuntimeException unused) {
                AbstractC4156x.i("SsaParser", "Fail to parse layer: " + split[c4519a.f48016a]);
            }
            int i12 = parseInt;
            m10 = m(split[c4519a.f48017b]);
            if (m10 != -9223372036854775807L) {
                AbstractC4156x.i("SsaParser", "Skipping invalid timing: " + str);
                return;
            }
            long m11 = m(split[c4519a.f48018c]);
            if (m11 == -9223372036854775807L || m11 <= m10) {
                AbstractC4156x.i("SsaParser", "Skipping invalid timing: " + str);
                return;
            }
            Map map = this.f48026d;
            c cVar = (map == null || (i10 = c4519a.f48019d) == -1) ? null : (c) map.get(split[i10].trim());
            String str2 = split[c4519a.f48020e];
            C3985a f10 = f(c.b.d(str2).replace("\\N", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replace("\\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replace("\\h", " "), i12, cVar, c.b.b(str2), this.f48027e, this.f48028f);
            int d10 = d(m11, list2, list);
            for (int d11 = d(m10, list2, list); d11 < d10; d11++) {
                ((List) list.get(d11)).add(f10);
            }
            return;
        }
        parseInt = 0;
        int i122 = parseInt;
        m10 = m(split[c4519a.f48017b]);
        if (m10 != -9223372036854775807L) {
        }
    }

    public final void i(J j10, List list, List list2, Charset charset) {
        C4519a c4519a = this.f48023a ? this.f48024b : null;
        while (true) {
            String y10 = j10.y(charset);
            if (y10 == null) {
                return;
            }
            if (y10.startsWith("Format:")) {
                c4519a = C4519a.a(y10);
            } else if (y10.startsWith("Dialogue:")) {
                if (c4519a == null) {
                    AbstractC4156x.i("SsaParser", "Skipping dialogue line before complete format: " + y10);
                } else {
                    h(y10, c4519a, list, list2);
                }
            }
        }
    }

    public final void j(J j10, Charset charset) {
        while (true) {
            String y10 = j10.y(charset);
            if (y10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(y10)) {
                k(j10, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(y10)) {
                this.f48026d = l(j10, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(y10)) {
                AbstractC4156x.g("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(y10)) {
                return;
            }
        }
    }

    public final void k(J j10, Charset charset) {
        while (true) {
            String y10 = j10.y(charset);
            if (y10 == null) {
                return;
            }
            if (j10.a() != 0 && j10.l(charset) == 91) {
                return;
            }
            String[] split = y10.split(":");
            if (split.length == 2) {
                String e10 = Ra.c.e(split[0].trim());
                e10.getClass();
                if (e10.equals("playresx")) {
                    this.f48027e = Float.parseFloat(split[1].trim());
                } else if (e10.equals("playresy")) {
                    try {
                        this.f48028f = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }
}
