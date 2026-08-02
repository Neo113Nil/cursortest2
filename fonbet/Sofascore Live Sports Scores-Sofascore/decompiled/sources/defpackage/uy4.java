package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uy4 implements oz4 {
    public final String a;
    public final String b;

    public uy4(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy4)) {
            return false;
        }
        uy4 uy4Var = (uy4) obj;
        return Intrinsics.c(this.a, uy4Var.a) && this.b.equals(uy4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("CopyToClipboard(copyText=", this.a, ", toastLabel=", this.b, ")");
    }
}
