package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzaoj implements zzane {
    private final zzes zza = new zzes();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzaoj(List list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = C.SANS_SERIF_NAME;
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzfk.zzk(bArr, 43, bArr.length + (-43))) ? C.SERIF_NAME : str;
        int i = bArr[25] * Ascii.DC4;
        this.zzg = i;
        boolean z = (bArr[0] & 32) != 0;
        this.zzb = z;
        if (z) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 == 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                }
                z = false;
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        String zzK;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzes zzesVar = this.zza;
        zzesVar.zzb(bArr, i + i2);
        zzesVar.zzh(i);
        int i12 = 1;
        int i13 = 0;
        int i14 = 2;
        zzgsw.zza(zzesVar.zzd() >= 2);
        int zzt = zzesVar.zzt();
        if (zzt == 0) {
            zzK = "";
        } else {
            int zzg = zzesVar.zzg();
            Charset zzR = zzesVar.zzR();
            int zzg2 = zzesVar.zzg() - zzg;
            if (zzR == null) {
                zzR = StandardCharsets.UTF_8;
            }
            zzK = zzesVar.zzK(zzt - zzg2, zzR);
        }
        if (zzK.isEmpty()) {
            zzdsVar.zza(new zzamw(zzgvz.zzi(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzK);
        int i15 = this.zzc;
        zzb(spannableStringBuilder, i15, 0, 0, spannableStringBuilder.length(), 16711680);
        int i16 = i15;
        int i17 = this.zzd;
        zzc(spannableStringBuilder, i17, -1, 0, spannableStringBuilder.length(), 16711680);
        int i18 = i17;
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.zzf;
        while (zzesVar.zzd() >= 8) {
            int zzg3 = zzesVar.zzg();
            int zzB = zzesVar.zzB();
            int zzB2 = zzesVar.zzB();
            if (zzB2 == 1937013100) {
                zzgsw.zza(zzesVar.zzd() >= i14 ? i12 : i13);
                int zzt2 = zzesVar.zzt();
                int i19 = i13;
                while (i19 < zzt2) {
                    zzgsw.zza(zzesVar.zzd() >= 12 ? i12 : i13);
                    int zzt3 = zzesVar.zzt();
                    int zzt4 = zzesVar.zzt();
                    zzesVar.zzk(i14);
                    int i20 = zzt2;
                    int zzs = zzesVar.zzs();
                    zzesVar.zzk(i12);
                    int zzB3 = zzesVar.zzB();
                    int i21 = i14;
                    if (zzt4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        i6 = i16;
                        i7 = i18;
                        StringBuilder sb = new StringBuilder(String.valueOf(zzt4).length() + 44 + String.valueOf(length2).length() + 2);
                        sb.append("Truncating styl end (");
                        sb.append(zzt4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        zzef.zzc("Tx3gParser", sb.toString());
                        zzt4 = spannableStringBuilder.length();
                    } else {
                        i6 = i16;
                        i7 = i18;
                    }
                    if (zzt3 >= zzt4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzt3).length() + 36 + String.valueOf(zzt4).length() + 2);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(zzt3);
                        sb2.append(") >= end (");
                        sb2.append(zzt4);
                        sb2.append(").");
                        zzef.zzc("Tx3gParser", sb2.toString());
                        i10 = i6;
                        i9 = i19;
                        i8 = i20;
                        i11 = i7;
                    } else {
                        i8 = i20;
                        i9 = i19;
                        int i22 = i6;
                        zzb(spannableStringBuilder, zzs, i22, zzt3, zzt4, 0);
                        i10 = i22;
                        i11 = i7;
                        zzc(spannableStringBuilder, zzB3, i11, zzt3, zzt4, 0);
                    }
                    i14 = i21;
                    zzt2 = i8;
                    i16 = i10;
                    i18 = i11;
                    i12 = 1;
                    i19 = i9 + 1;
                    i13 = 0;
                }
                i3 = i16;
                i4 = i18;
                i5 = i14;
            } else {
                i3 = i16;
                int i23 = i14;
                i4 = i18;
                if (zzB2 == 1952608120 && this.zzb) {
                    i5 = i23;
                    zzgsw.zza(zzesVar.zzd() >= i5);
                    float zzt5 = zzesVar.zzt();
                    int i24 = this.zzg;
                    String str2 = zzfk.zza;
                    f = Math.max(0.0f, Math.min(zzt5 / i24, 0.95f));
                } else {
                    i5 = i23;
                }
            }
            zzesVar.zzh(zzg3 + zzB);
            i16 = i3;
            i14 = i5;
            i18 = i4;
            i12 = 1;
            i13 = 0;
        }
        zzcw zzcwVar = new zzcw();
        zzcwVar.zza(spannableStringBuilder);
        zzcwVar.zzf(f, 0);
        zzcwVar.zzg(0);
        zzdsVar.zza(new zzamw(zzgvz.zzj(zzcwVar.zzr()), C.TIME_UNSET, C.TIME_UNSET));
    }
}
