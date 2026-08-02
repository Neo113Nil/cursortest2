package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qd9 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public qd9(String str, String str2, String str3, int i, int i2, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qd9.class == obj.getClass()) {
            qd9 qd9Var = (qd9) obj;
            if (this.a == qd9Var.a && this.b == qd9Var.b && TextUtils.equals(this.c, qd9Var.c) && TextUtils.equals(this.d, qd9Var.d) && TextUtils.equals(this.e, qd9Var.e) && TextUtils.equals(this.f, qd9Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
