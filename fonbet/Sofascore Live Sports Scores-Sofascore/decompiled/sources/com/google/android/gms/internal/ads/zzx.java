package com.google.android.gms.internal.ads;

import defpackage.bf3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzx {
    public final String a;
    public final String b;

    static {
        String str = zzfm.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzx(String str, String str2) {
        this.a = zzfm.q(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzx.class == obj.getClass()) {
            zzx zzxVar = (zzx) obj;
            if (Objects.equals(this.a, zzxVar.a) && Objects.equals(this.b, zzxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 10 + String.valueOf(str2).length() + 3);
        bf3.v(sb, "{ lang=", str, ", '", str2);
        sb.append("' }");
        return sb.toString();
    }
}
