package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y62 implements g72 {
    public final boolean a;

    public /* synthetic */ y62(boolean z) {
        this.a = z;
    }

    @Override // defpackage.g72
    public final void a(Bundle bundle, String str) {
        bundle.putBoolean(str, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y62) {
            return this.a == ((y62) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return bf3.l("BooleanVal(value=", ")", this.a);
    }
}
