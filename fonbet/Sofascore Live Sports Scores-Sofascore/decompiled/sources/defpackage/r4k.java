package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r4k extends qhh {
    public final nkk m = new nkk(4, false);
    public final boolean n;
    public final int o;
    public final int p;
    public final String q;
    public final float r;
    public final int s;

    public r4k(List list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.o = 0;
            this.p = -1;
            this.q = C.SANS_SERIF_NAME;
            this.n = false;
            this.r = 0.85f;
            this.s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.o = bArr[24];
        this.p = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.q = "Serif".equals(new String(bArr, 43, bArr.length - 43, xp2.c)) ? C.SERIF_NAME : str;
        int i = bArr[25] * 20;
        this.s = i;
        boolean z = (bArr[0] & 32) != 0;
        this.n = z;
        if (z) {
            this.r = lik.g(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
        } else {
            this.r = 0.85f;
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    mz1.u(3, spannableStringBuilder, i3, i4, i6);
                } else {
                    mz1.u(1, spannableStringBuilder, i3, i4, i6);
                }
            } else if (z2) {
                mz1.u(2, spannableStringBuilder, i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                mz1.w(spannableStringBuilder, i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            mz1.u(0, spannableStringBuilder, i3, i4, i6);
        }
    }

    @Override // defpackage.qhh
    public final kli b(byte[] bArr, int i, boolean z) {
        String q;
        int i2;
        int i3;
        nkk nkkVar = this.m;
        nkkVar.C(bArr, i);
        if (nkkVar.c() < 2) {
            throw new oli("Unexpected subtitle format.");
        }
        int x = nkkVar.x();
        if (x == 0) {
            q = "";
        } else {
            if (nkkVar.c() >= 2) {
                byte[] bArr2 = nkkVar.a;
                int i4 = nkkVar.b;
                char c = (char) ((bArr2[i4 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr2[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
                if (c == 65279 || c == 65534) {
                    q = nkkVar.q(x, xp2.d);
                }
            }
            q = nkkVar.q(x, xp2.c);
        }
        if (q.isEmpty()) {
            return s4k.b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(q);
        f(spannableStringBuilder, this.o, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.p, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.q;
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.r;
        for (int i5 = 8; nkkVar.c() >= i5; i5 = 8) {
            int i6 = nkkVar.b;
            int f2 = nkkVar.f();
            int f3 = nkkVar.f();
            if (f3 == 1937013100) {
                if (nkkVar.c() < 2) {
                    throw new oli("Unexpected subtitle format.");
                }
                int x2 = nkkVar.x();
                int i7 = 0;
                while (i7 < x2) {
                    if (nkkVar.c() < 12) {
                        throw new oli("Unexpected subtitle format.");
                    }
                    int x3 = nkkVar.x();
                    int x4 = nkkVar.x();
                    nkkVar.F(2);
                    int i8 = x2;
                    int s = nkkVar.s();
                    nkkVar.F(1);
                    int f4 = nkkVar.f();
                    if (x4 > spannableStringBuilder.length()) {
                        spannableStringBuilder.length();
                        m6k.f0();
                        x4 = spannableStringBuilder.length();
                    }
                    if (x3 >= x4) {
                        m6k.f0();
                        i2 = i7;
                        i3 = i8;
                    } else {
                        i2 = i7;
                        i3 = i8;
                        f(spannableStringBuilder, s, this.o, x3, x4, 0);
                        e(spannableStringBuilder, f4, this.p, x3, x4, 0);
                    }
                    i7 = i2 + 1;
                    x2 = i3;
                }
            } else if (f3 == 1952608120 && this.n) {
                if (nkkVar.c() < 2) {
                    throw new oli("Unexpected subtitle format.");
                }
                f = lik.g(nkkVar.x() / this.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
            }
            nkkVar.E(i6 + f2);
        }
        return new s4k(new l74(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }
}
