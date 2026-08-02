package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bm2;
import defpackage.mio;
import defpackage.mz1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzape implements zzanz {
    public final zzeu a = new zzeu();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public zzape(List list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = C.SANS_SERIF_NAME;
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int length = bArr.length - 43;
        String str2 = zzfm.a;
        this.e = true == "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? C.SERIF_NAME : str;
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i, 0.95f));
        } else {
            this.f = 0.85f;
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 == 0) {
                if (i8 != 0) {
                    mz1.u(2, spannableStringBuilder, i3, i4, i6);
                }
                z = false;
            } else if (i8 != 0) {
                mz1.u(3, spannableStringBuilder, i3, i4, i6);
            } else {
                mz1.u(1, spannableStringBuilder, i3, i4, i6);
                z = false;
            }
            if ((i & 4) != 0) {
                mz1.w(spannableStringBuilder, i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                mz1.u(0, spannableStringBuilder, i3, i4, i6);
            }
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzanz
    public final void a(int i, int i2, bm2 bm2Var, byte[] bArr) {
        String k;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        zzeu zzeuVar = this.a;
        zzeuVar.z(i + i2, bArr);
        zzeuVar.D(i);
        int i11 = 1;
        int i12 = 0;
        int i13 = 2;
        zzguk.a(zzeuVar.B() >= 2);
        int J = zzeuVar.J();
        if (J == 0) {
            k = "";
        } else {
            int i14 = zzeuVar.b;
            Charset q = zzeuVar.q();
            int i15 = zzeuVar.b - i14;
            if (q == null) {
                q = StandardCharsets.UTF_8;
            }
            k = zzeuVar.k(J - i15, q);
        }
        if (k.isEmpty()) {
            mio mioVar = zzgxm.b;
            bm2Var.mo13zza(new zzanr(s.e, C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k);
        int length = spannableStringBuilder.length();
        int i16 = this.c;
        b(spannableStringBuilder, i16, 0, 0, length, 16711680);
        int i17 = i16;
        int length2 = spannableStringBuilder.length();
        int i18 = this.d;
        c(spannableStringBuilder, i18, -1, 0, length2, 16711680);
        int i19 = i18;
        int length3 = spannableStringBuilder.length();
        String str = this.e;
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float f = this.f;
        while (zzeuVar.B() >= 8) {
            int i20 = zzeuVar.b;
            int b = zzeuVar.b();
            int b2 = zzeuVar.b();
            if (b2 == 1937013100) {
                zzguk.a(zzeuVar.B() >= i13 ? i11 : i12);
                int J2 = zzeuVar.J();
                int i21 = i12;
                while (i21 < J2) {
                    zzguk.a(zzeuVar.B() >= 12 ? i11 : i12);
                    int J3 = zzeuVar.J();
                    int J4 = zzeuVar.J();
                    zzeuVar.E(i13);
                    int i22 = J2;
                    int I = zzeuVar.I();
                    zzeuVar.E(i11);
                    int b3 = zzeuVar.b();
                    if (J4 > spannableStringBuilder.length()) {
                        int length4 = spannableStringBuilder.length();
                        i6 = i17;
                        i7 = i19;
                        StringBuilder sb = new StringBuilder(mz1.d(String.valueOf(J4).length() + 44, 2, String.valueOf(length4)));
                        sb.append("Truncating styl end (");
                        sb.append(J4);
                        sb.append(") to cueText.length() (");
                        sb.append(length4);
                        sb.append(").");
                        zzeh.c(sb.toString());
                        J4 = spannableStringBuilder.length();
                    } else {
                        i6 = i17;
                        i7 = i19;
                    }
                    if (J3 >= J4) {
                        StringBuilder sb2 = new StringBuilder(mz1.d(String.valueOf(J3).length() + 36, 2, String.valueOf(J4)));
                        sb2.append("Ignoring styl with start (");
                        sb2.append(J3);
                        sb2.append(") >= end (");
                        sb2.append(J4);
                        sb2.append(").");
                        zzeh.c(sb2.toString());
                        i9 = i21;
                        i8 = i22;
                        i10 = i7;
                    } else {
                        i8 = i22;
                        i9 = i21;
                        b(spannableStringBuilder, I, i6, J3, J4, 0);
                        i10 = i7;
                        c(spannableStringBuilder, b3, i10, J3, J4, 0);
                    }
                    int i23 = i9 + 1;
                    J2 = i8;
                    i19 = i10;
                    i17 = i6;
                    i12 = 0;
                    i13 = 2;
                    i21 = i23;
                    i11 = 1;
                }
                i3 = i17;
                i4 = i19;
                i5 = i13;
            } else {
                i3 = i17;
                i4 = i19;
                if (b2 == 1952608120 && this.b) {
                    i5 = 2;
                    zzguk.a(zzeuVar.B() >= 2);
                    float J5 = zzeuVar.J();
                    String str2 = zzfm.a;
                    f = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(J5 / this.g, 0.95f));
                } else {
                    i5 = 2;
                }
            }
            zzeuVar.D(i20 + b);
            i13 = i5;
            i19 = i4;
            i17 = i3;
            i11 = 1;
            i12 = 0;
        }
        zzcx zzcxVar = new zzcx();
        zzcxVar.a(spannableStringBuilder);
        zzcxVar.e = f;
        zzcxVar.f = 0;
        zzcxVar.g = 0;
        bm2Var.mo13zza(new zzanr(zzgxm.t(zzcxVar.b()), C.TIME_UNSET, C.TIME_UNSET));
    }
}
