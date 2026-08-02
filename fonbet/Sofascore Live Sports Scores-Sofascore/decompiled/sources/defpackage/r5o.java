package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r5o {
    public final String a;
    public final String b;
    public int c;
    public long d;
    public final Integer e;

    public r5o(String str, String str2, int i, long j, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = num;
    }

    public final String toString() {
        Integer num;
        int i = this.c;
        long j = this.d;
        String str = this.a;
        StringBuilder sb = new StringBuilder(wt3.h(String.valueOf(str).length(), 1, String.valueOf(i).length(), 1, String.valueOf(j).length()));
        w1l.q(i, str, ".", ".", sb);
        sb.append(j);
        String sb2 = sb.toString();
        String str2 = this.b;
        if (!TextUtils.isEmpty(str2)) {
            sb2 = wt3.m(sb2, ".", new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length()), str2);
        }
        if (!((Boolean) zzba.zzc().a(zzbjg.s2)).booleanValue() || (num = this.e) == null || TextUtils.isEmpty(str2)) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + num.toString().length());
        sb3.append(sb2);
        sb3.append(".");
        sb3.append(num);
        return sb3.toString();
    }
}
