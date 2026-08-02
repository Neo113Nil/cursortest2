package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j4o {
    public final String a;
    public final String b;
    public final Drawable c;

    public j4o(String str, String str2, Drawable drawable) {
        this.a = str;
        if (str2 == null) {
            yhk.s("Null imageUrl");
            throw null;
        }
        this.b = str2;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j4o) {
            j4o j4oVar = (j4o) obj;
            String str = j4oVar.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b.equals(j4oVar.b)) {
                    Drawable drawable = j4oVar.c;
                    Drawable drawable2 = this.c;
                    if (drawable2 != null ? drawable2.equals(drawable) : drawable == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        Drawable drawable = this.c;
        return (hashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String str = this.a;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        bf3.v(sb, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return wt3.m(", icon=", valueOf, sb, "}");
    }
}
