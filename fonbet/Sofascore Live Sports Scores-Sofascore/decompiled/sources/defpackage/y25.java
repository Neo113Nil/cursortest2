package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y25 implements zli {
    public static final String h = new String("FIXED_DIMENSION");
    public static final String i = new String("WRAP_DIMENSION");
    public static final String j = new String("SPREAD_DIMENSION");
    public static final String k = new String("PARENT_DIMENSION");
    public static final String l = new String("PERCENT_DIMENSION");
    public static final String m = new String("RATIO_DIMENSION");
    public Object g;
    public int b = 0;
    public int c = Integer.MAX_VALUE;
    public float e = 1.0f;
    public int f = 0;
    public String d = null;
    public boolean a = false;

    public y25(String str) {
        this.g = str;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 2) != 0;
            if (z) {
                if (z2) {
                    mz1.u(3, spannableStringBuilder, i4, i5, i7);
                } else {
                    mz1.u(1, spannableStringBuilder, i4, i5, i7);
                }
            } else if (z2) {
                mz1.u(2, spannableStringBuilder, i4, i5, i7);
            }
            boolean z3 = (i2 & 4) != 0;
            if (z3) {
                mz1.w(spannableStringBuilder, i4, i5, i7);
            }
            if (z3 || z || z2) {
                return;
            }
            mz1.u(0, spannableStringBuilder, i4, i5, i7);
        }
    }

    public static y25 d(int i2) {
        y25 y25Var = new y25(h);
        y25Var.g = null;
        y25Var.f = i2;
        return y25Var;
    }

    public static y25 e(String str) {
        y25 y25Var = new y25();
        y25Var.b = 0;
        y25Var.c = Integer.MAX_VALUE;
        y25Var.e = 1.0f;
        y25Var.f = 0;
        y25Var.d = null;
        y25Var.g = str;
        y25Var.a = true;
        return y25Var;
    }

    public void a(wm3 wm3Var, int i2) {
        String str = this.d;
        if (str != null) {
            wm3Var.K(str);
        }
        boolean z = this.a;
        String str2 = k;
        String str3 = l;
        String str4 = i;
        if (i2 == 0) {
            if (z) {
                wm3Var.O(3);
                String str5 = (String) this.g;
                wm3Var.P(str5 != str4 ? str5 == str3 ? 2 : 0 : 1, this.e, this.b, this.c);
                return;
            }
            int i3 = this.b;
            if (i3 > 0) {
                if (i3 < 0) {
                    wm3Var.c0 = 0;
                } else {
                    wm3Var.c0 = i3;
                }
            }
            int i4 = this.c;
            if (i4 < Integer.MAX_VALUE) {
                wm3Var.D[0] = i4;
            }
            String str6 = (String) this.g;
            if (str6 == str4) {
                wm3Var.O(2);
                return;
            }
            if (str6 == str2) {
                wm3Var.O(4);
                return;
            } else {
                if (str6 == null) {
                    wm3Var.O(1);
                    wm3Var.S(this.f);
                    return;
                }
                return;
            }
        }
        if (z) {
            wm3Var.Q(3);
            String str7 = (String) this.g;
            wm3Var.R(str7 != str4 ? str7 == str3 ? 2 : 0 : 1, this.e, this.b, this.c);
            return;
        }
        int i5 = this.b;
        if (i5 > 0) {
            if (i5 < 0) {
                wm3Var.d0 = 0;
            } else {
                wm3Var.d0 = i5;
            }
        }
        int i6 = this.c;
        if (i6 < Integer.MAX_VALUE) {
            wm3Var.D[1] = i6;
        }
        String str8 = (String) this.g;
        if (str8 == str4) {
            wm3Var.Q(2);
            return;
        }
        if (str8 == str2) {
            wm3Var.Q(4);
        } else if (str8 == null) {
            wm3Var.Q(1);
            wm3Var.N(this.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zli
    public void h(byte[] bArr, int i2, int i3, yli yliVar, wn3 wn3Var) {
        String y;
        int i4;
        j9e j9eVar = (j9e) this.g;
        j9eVar.L(bArr, i2 + i3);
        j9eVar.N(i2);
        int i5 = 1;
        int i6 = 0;
        z1a.s(j9eVar.a() >= 2);
        int H = j9eVar.H();
        if (H == 0) {
            y = "";
        } else {
            int i7 = j9eVar.b;
            Charset J = j9eVar.J();
            int i8 = H - (j9eVar.b - i7);
            if (J == null) {
                J = StandardCharsets.UTF_8;
            }
            y = j9eVar.y(i8, J);
        }
        if (y.isEmpty()) {
            av9 av9Var = hv9.b;
            wn3Var.accept(new q74(vvf.e, C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y);
        c(spannableStringBuilder, this.b, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.c, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.d;
        int length = spannableStringBuilder.length();
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.e;
        while (j9eVar.a() >= 8) {
            int i9 = j9eVar.b;
            int m2 = j9eVar.m();
            int m3 = j9eVar.m();
            if (m3 == 1937013100) {
                z1a.s(j9eVar.a() >= 2 ? i5 : i6);
                int H2 = j9eVar.H();
                int i10 = i6;
                while (i10 < H2) {
                    z1a.s(j9eVar.a() >= 12 ? i5 : i6);
                    int H3 = j9eVar.H();
                    int H4 = j9eVar.H();
                    j9eVar.O(2);
                    int i11 = i10;
                    int A = j9eVar.A();
                    j9eVar.O(i5);
                    int m4 = j9eVar.m();
                    if (H4 > spannableStringBuilder.length()) {
                        StringBuilder t = lnb.t(H4, "Truncating styl end (", ") to cueText.length() (");
                        t.append(spannableStringBuilder.length());
                        t.append(").");
                        tgj.d0(t.toString());
                        H4 = spannableStringBuilder.length();
                    }
                    if (H3 >= H4) {
                        tgj.d0("Ignoring styl with start (" + H3 + ") >= end (" + H4 + ").");
                        i4 = i11;
                    } else {
                        i4 = i11;
                        int i12 = H4;
                        c(spannableStringBuilder, A, this.b, H3, i12, 0);
                        b(spannableStringBuilder, m4, this.c, H3, i12, 0);
                    }
                    i10 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                }
            } else if (m3 == 1952608120 && this.a) {
                z1a.s(j9eVar.a() >= 2);
                f = nik.i(j9eVar.H() / this.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
            }
            j9eVar.N(i9 + m2);
            i5 = 1;
            i6 = 0;
        }
        wn3Var.accept(new q74(hv9.z(new m74(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0)), C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // defpackage.zli
    public int l() {
        return 2;
    }
}
