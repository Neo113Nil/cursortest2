package l2;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.AbstractC3445z;
import d1.C3985a;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.InterfaceC4148o;
import e1.J;
import e1.Z;
import e2.C4163e;
import e2.s;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.UByte;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5395a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final J f55572a = new J();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f55573b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55574c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55575d;

    /* renamed from: e, reason: collision with root package name */
    public final String f55576e;

    /* renamed from: f, reason: collision with root package name */
    public final float f55577f;

    /* renamed from: g, reason: collision with root package name */
    public final int f55578g;

    public C5395a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f55574c = 0;
            this.f55575d = -1;
            this.f55576e = "sans-serif";
            this.f55573b = false;
            this.f55577f = 0.85f;
            this.f55578g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f55574c = bArr[24];
        this.f55575d = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
        this.f55576e = "Serif".equals(Z.I(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f55578g = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f55573b = z10;
        if (z10) {
            this.f55577f = Z.n(((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f55577f = 0.85f;
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    public static String h(J j10) {
        AbstractC4134a.a(j10.a() >= 2);
        int U10 = j10.U();
        if (U10 == 0) {
            return "";
        }
        int g10 = j10.g();
        Charset W10 = j10.W();
        int g11 = U10 - (j10.g() - g10);
        if (W10 == null) {
            W10 = StandardCharsets.UTF_8;
        }
        return j10.K(g11, W10);
    }

    @Override // e2.s
    public void a(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC4148o interfaceC4148o) {
        this.f55572a.Z(bArr, i11 + i10);
        this.f55572a.b0(i10);
        String h10 = h(this.f55572a);
        if (h10.isEmpty()) {
            interfaceC4148o.accept(new C4163e(AbstractC3445z.t(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h10);
        f(spannableStringBuilder, this.f55574c, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.f55575d, -1, 0, spannableStringBuilder.length(), 16711680);
        g(spannableStringBuilder, this.f55576e, 0, spannableStringBuilder.length());
        float f10 = this.f55577f;
        while (this.f55572a.a() >= 8) {
            int g10 = this.f55572a.g();
            int v10 = this.f55572a.v();
            int v11 = this.f55572a.v();
            if (v11 == 1937013100) {
                AbstractC4134a.a(this.f55572a.a() >= 2);
                int U10 = this.f55572a.U();
                for (int i12 = 0; i12 < U10; i12++) {
                    d(this.f55572a, spannableStringBuilder);
                }
            } else if (v11 == 1952608120 && this.f55573b) {
                AbstractC4134a.a(this.f55572a.a() >= 2);
                f10 = Z.n(this.f55572a.U() / this.f55578g, 0.0f, 0.95f);
            }
            this.f55572a.b0(g10 + v10);
        }
        interfaceC4148o.accept(new C4163e(AbstractC3445z.u(new C3985a.b().o(spannableStringBuilder).h(f10, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // e2.s
    public int c() {
        return 2;
    }

    public final void d(J j10, SpannableStringBuilder spannableStringBuilder) {
        AbstractC4134a.a(j10.a() >= 12);
        int U10 = j10.U();
        int U11 = j10.U();
        j10.c0(2);
        int M10 = j10.M();
        j10.c0(1);
        int v10 = j10.v();
        if (U11 > spannableStringBuilder.length()) {
            AbstractC4156x.i("Tx3gParser", "Truncating styl end (" + U11 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            U11 = spannableStringBuilder.length();
        }
        int i10 = U11;
        if (U10 < i10) {
            f(spannableStringBuilder, M10, this.f55574c, U10, i10, 0);
            e(spannableStringBuilder, v10, this.f55575d, U10, i10, 0);
            return;
        }
        AbstractC4156x.i("Tx3gParser", "Ignoring styl with start (" + U10 + ") >= end (" + i10 + ").");
    }
}
