package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b72 implements g72 {
    public final long a;

    @Override // defpackage.g72
    public final void a(Bundle bundle, String str) {
        bundle.putLong(str, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b72) {
            return this.a == ((b72) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vxd.m("LongVal(value=", this.a, ")");
    }
}
