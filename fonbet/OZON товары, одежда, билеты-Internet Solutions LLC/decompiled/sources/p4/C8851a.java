package p4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.AbstractC5880y;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.c;
import k4.o;
import l3.C7855a;
import m3.C8050C;
import m3.InterfaceC8068j;
import m3.s;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8851a implements o {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f80141d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f80142e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f80143a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f80144b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f80145c = new C8050C();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static C7855a c(Spanned spanned, String str) {
        char c11;
        char c12;
        float f7;
        C7855a.C1210a c1210a = new C7855a.C1210a();
        c1210a.o(spanned);
        if (str == null) {
            return c1210a.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1 || c11 == 2) {
            c1210a.l(0);
        } else if (c11 == 3 || c11 == 4 || c11 == 5) {
            c1210a.l(2);
        } else {
            c1210a.l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c12 = 0;
                    break;
                }
                c12 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c12 = 1;
                    break;
                }
                c12 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c12 = 2;
                    break;
                }
                c12 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c12 = 6;
                    break;
                }
                c12 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c12 = 7;
                    break;
                }
                c12 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c12 = '\b';
                    break;
                }
                c12 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c12 = 3;
                    break;
                }
                c12 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c12 = 4;
                    break;
                }
                c12 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c12 = 5;
                    break;
                }
                c12 = 65535;
                break;
            default:
                c12 = 65535;
                break;
        }
        if (c12 == 0 || c12 == 1 || c12 == 2) {
            c1210a.i(2);
        } else if (c12 == 3 || c12 == 4 || c12 == 5) {
            c1210a.i(0);
        } else {
            c1210a.i(1);
        }
        int d11 = c1210a.d();
        float f11 = 0.08f;
        if (d11 == 0) {
            f7 = 0.08f;
        } else if (d11 == 1) {
            f7 = 0.5f;
        } else {
            if (d11 != 2) {
                throw new IllegalArgumentException();
            }
            f7 = 0.92f;
        }
        c1210a.k(f7);
        int c13 = c1210a.c();
        if (c13 != 0) {
            if (c13 == 1) {
                f11 = 0.5f;
            } else {
                if (c13 != 2) {
                    throw new IllegalArgumentException();
                }
                f11 = 0.92f;
            }
        }
        c1210a.h(f11, 0);
        return c1210a.a();
    }

    private static long d(Matcher matcher, int i11) {
        String group = matcher.group(i11 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i11 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i11 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i11 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    @Override // k4.o
    public final void a(byte[] bArr, int i11, int i12, o.b bVar, InterfaceC8068j<c> interfaceC8068j) {
        String r11;
        String str;
        C8851a c8851a = this;
        C8050C c8050c = c8851a.f80145c;
        c8050c.P(i11 + i12, bArr);
        c8050c.R(i11);
        Charset N11 = c8050c.N();
        if (N11 == null) {
            N11 = StandardCharsets.UTF_8;
        }
        long j11 = bVar.f70476a;
        long j12 = -9223372036854775807L;
        ArrayList arrayList = (j11 == -9223372036854775807L || !bVar.f70477b) ? null : new ArrayList();
        while (true) {
            String r12 = c8050c.r(N11);
            if (r12 == null) {
                break;
            }
            if (!r12.isEmpty()) {
                try {
                    Integer.parseInt(r12);
                    r11 = c8050c.r(N11);
                } catch (NumberFormatException unused) {
                    s.f("SubripParser", "Skipping invalid index: ".concat(r12));
                }
                if (r11 == null) {
                    s.f("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f80141d.matcher(r11);
                if (matcher.matches()) {
                    long d11 = d(matcher, 1);
                    long d12 = d(matcher, 6);
                    StringBuilder sb2 = c8851a.f80143a;
                    sb2.setLength(0);
                    long j13 = j12;
                    ArrayList<String> arrayList2 = c8851a.f80144b;
                    arrayList2.clear();
                    String r13 = c8050c.r(N11);
                    while (!TextUtils.isEmpty(r13)) {
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String trim = r13.trim();
                        StringBuilder sb3 = new StringBuilder(trim);
                        Matcher matcher2 = f80142e.matcher(trim);
                        int i13 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i13;
                            int length = group.length();
                            sb3.replace(start, start + length, "");
                            i13 += length;
                            j11 = j11;
                        }
                        sb2.append(sb3.toString());
                        r13 = c8050c.r(N11);
                        j11 = j11;
                    }
                    long j14 = j11;
                    Spanned fromHtml = Html.fromHtml(sb2.toString());
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = arrayList2.get(i14);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (j14 == j13 || d12 >= j14) {
                        interfaceC8068j.accept(new c(AbstractC5880y.B(c(fromHtml, str)), d11, d12 - d11));
                    } else if (arrayList != null) {
                        arrayList.add(new c(AbstractC5880y.B(c(fromHtml, str)), d11, d12 - d11));
                    }
                    c8851a = this;
                    j12 = j13;
                    j11 = j14;
                } else {
                    s.f("SubripParser", "Skipping invalid timing: ".concat(r11));
                    c8851a = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC8068j.accept((c) it.next());
            }
        }
    }
}
