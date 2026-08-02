package r4;

import Cm.e;
import P4.f;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.AbstractC5880y;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import k4.c;
import k4.o;
import l3.C7855a;
import m3.C8050C;
import m3.InterfaceC8068j;
import m3.N;
import m3.s;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9170a implements o {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f82888a = new C8050C();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f82889b;

    /* renamed from: c, reason: collision with root package name */
    private final int f82890c;

    /* renamed from: d, reason: collision with root package name */
    private final int f82891d;

    /* renamed from: e, reason: collision with root package name */
    private final String f82892e;

    /* renamed from: f, reason: collision with root package name */
    private final float f82893f;

    /* renamed from: g, reason: collision with root package name */
    private final int f82894g;

    public C9170a(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f82890c = 0;
            this.f82891d = -1;
            this.f82892e = "sans-serif";
            this.f82889b = false;
            this.f82893f = 0.85f;
            this.f82894g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f82890c = bArr[24];
        this.f82891d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        int i11 = N.f74289a;
        this.f82892e = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i12 = bArr[25] * 20;
        this.f82894g = i12;
        boolean z11 = (bArr[0] & 32) != 0;
        this.f82889b = z11;
        if (z11) {
            this.f82893f = N.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i12, 0.0f, 0.95f);
        } else {
            this.f82893f = 0.85f;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
        if (i11 != i12) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i11 >>> 8) | ((i11 & 255) << 24)), i13, i14, i15 | 33);
        }
    }

    private static void d(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
        if (i11 != i12) {
            int i16 = i15 | 33;
            boolean z11 = (i11 & 1) != 0;
            boolean z12 = (i11 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i13, i14, i16);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i13, i14, i16);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, i14, i16);
            }
            boolean z13 = (i11 & 4) != 0;
            if (z13) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, i14, i16);
            }
            if (z13 || z11 || z12) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i13, i14, i16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k4.o
    public final void a(byte[] bArr, int i11, int i12, o.b bVar, InterfaceC8068j<c> interfaceC8068j) {
        String C11;
        int i13;
        int i14;
        C8050C c8050c = this.f82888a;
        c8050c.P(i11 + i12, bArr);
        c8050c.R(i11);
        int i15 = 1;
        int i16 = 2;
        int i17 = 0;
        G10.a.c(c8050c.a() >= 2);
        int L11 = c8050c.L();
        if (L11 == 0) {
            C11 = "";
        } else {
            int f7 = c8050c.f();
            Charset N11 = c8050c.N();
            int f11 = L11 - (c8050c.f() - f7);
            if (N11 == null) {
                N11 = StandardCharsets.UTF_8;
            }
            C11 = c8050c.C(f11, N11);
        }
        if (C11.isEmpty()) {
            interfaceC8068j.accept(new c(AbstractC5880y.v(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C11);
        d(spannableStringBuilder, this.f82890c, 0, 0, spannableStringBuilder.length(), 16711680);
        c(spannableStringBuilder, this.f82891d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f82892e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f12 = this.f82893f;
        while (c8050c.a() >= 8) {
            int f13 = c8050c.f();
            int p11 = c8050c.p();
            int p12 = c8050c.p();
            if (p12 == 1937013100) {
                G10.a.c(c8050c.a() >= i16 ? i15 : i17);
                int L12 = c8050c.L();
                int i18 = i17;
                while (i18 < L12) {
                    G10.a.c(c8050c.a() >= 12 ? i15 : i17);
                    int L13 = c8050c.L();
                    int L14 = c8050c.L();
                    c8050c.S(i16);
                    int i19 = i18;
                    int E11 = c8050c.E();
                    c8050c.S(i15);
                    int p13 = c8050c.p();
                    if (L14 > spannableStringBuilder.length()) {
                        StringBuilder f14 = f.f(L14, "Truncating styl end (", ") to cueText.length() (");
                        f14.append(spannableStringBuilder.length());
                        f14.append(").");
                        s.f("Tx3gParser", f14.toString());
                        L14 = spannableStringBuilder.length();
                    }
                    if (L13 >= L14) {
                        s.f("Tx3gParser", e.c("Ignoring styl with start (", L13, ") >= end (", ").", L14));
                        i14 = i19;
                    } else {
                        i14 = i19;
                        int i21 = L14;
                        d(spannableStringBuilder, E11, this.f82890c, L13, i21, 0);
                        c(spannableStringBuilder, p13, this.f82891d, L13, i21, 0);
                    }
                    i18 = i14 + 1;
                    i15 = 1;
                    i16 = 2;
                    i17 = 0;
                }
                i13 = i16;
            } else if (p12 == 1952608120 && this.f82889b) {
                i13 = 2;
                G10.a.c(c8050c.a() >= 2);
                f12 = N.h(c8050c.L() / this.f82894g, 0.0f, 0.95f);
            } else {
                i13 = 2;
            }
            c8050c.R(f13 + p11);
            i16 = i13;
            i15 = 1;
            i17 = 0;
        }
        C7855a.C1210a c1210a = new C7855a.C1210a();
        c1210a.o(spannableStringBuilder);
        c1210a.h(f12, 0);
        c1210a.i(0);
        interfaceC8068j.accept(new c(AbstractC5880y.B(c1210a.a()), -9223372036854775807L, -9223372036854775807L));
    }
}
