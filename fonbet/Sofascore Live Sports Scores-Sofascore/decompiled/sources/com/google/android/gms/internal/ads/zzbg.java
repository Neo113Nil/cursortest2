package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.bf3;
import defpackage.wt3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbg {
    public final int a;
    public final String b;
    public final int c;
    public final zzv[] d;
    public int e;

    static {
        String str = zzfm.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbg(String str, zzv... zzvVarArr) {
        int length = zzvVarArr.length;
        int i = 1;
        zzguk.a(length > 0);
        this.b = str;
        this.d = zzvVarArr;
        this.a = length;
        String str2 = zzvVarArr[0].o;
        this.c = TextUtils.isEmpty(str2) ? zzas.f(zzvVarArr[0].n) : zzas.f(str2);
        zzv zzvVar = zzvVarArr[0];
        String str3 = zzvVar.d;
        str3 = (str3 == null || str3.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str3;
        int i2 = zzvVar.f | 16384;
        while (true) {
            zzv[] zzvVarArr2 = this.d;
            if (i >= zzvVarArr2.length) {
                return;
            }
            zzv zzvVar2 = zzvVarArr2[i];
            String str4 = zzvVar2.d;
            if (!str3.equals((str4 == null || str4.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str4)) {
                a(i, "languages", zzvVarArr2[0].d, str4);
                return;
            } else {
                if (i2 != (zzvVar2.f | 16384)) {
                    a(i, "role flags", Integer.toBinaryString(zzvVarArr2[0].f), Integer.toBinaryString(this.d[i].f));
                    return;
                }
                i++;
            }
        }
    }

    public static void a(int i, String str, String str2, String str3) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i).length() + 1);
        bf3.v(sb, "Different ", str, " combined in one TrackGroup: '", str2);
        wt3.t(i, "' (track 0) and '", str3, "' (track ", sb);
        sb.append(")");
        zzeh.f("", new IllegalStateException(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbg.class == obj.getClass()) {
            zzbg zzbgVar = (zzbg) obj;
            if (this.b.equals(zzbgVar.b) && Arrays.equals(this.d, zzbgVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.d) + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        this.e = hashCode;
        return hashCode;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.d);
        String str = this.b;
        return wt3.m(str, ": ", new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(arrays).length()), arrays);
    }
}
