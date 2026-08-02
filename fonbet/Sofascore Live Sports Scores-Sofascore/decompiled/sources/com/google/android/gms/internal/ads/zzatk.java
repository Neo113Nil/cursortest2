package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.U3;
import defpackage.bf3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzatk {
    public final String a;
    public final String b;

    public zzatk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzatk.class == obj.getClass()) {
            zzatk zzatkVar = (zzatk) obj;
            if (TextUtils.equals(this.a, zzatkVar.a) && TextUtils.equals(this.b, zzatkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        bf3.v(sb, "Header[name=", str, ",value=", str2);
        sb.append(U3.j.e);
        return sb.toString();
    }
}
