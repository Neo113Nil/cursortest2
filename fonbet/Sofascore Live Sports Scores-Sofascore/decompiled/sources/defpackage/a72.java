package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a72 implements g72 {
    public final int a;

    @Override // defpackage.g72
    public final void a(Bundle bundle, String str) {
        bundle.putInt(str, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a72) {
            return this.a == ((a72) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lnb.k(this.a, "IntVal(value=", ")");
    }
}
