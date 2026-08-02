package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j3c {
    public final String a;
    public final boolean b;
    public final boolean c;

    public j3c(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != j3c.class) {
            return false;
        }
        j3c j3cVar = (j3c) obj;
        return TextUtils.equals(this.a, j3cVar.a) && this.b == j3cVar.b && this.c == j3cVar.c;
    }

    public final int hashCode() {
        return ((dmi.c(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
