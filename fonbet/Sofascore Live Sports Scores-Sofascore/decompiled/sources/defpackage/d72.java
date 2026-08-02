package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d72 implements g72 {
    public final Parcelable a;

    @Override // defpackage.g72
    public final void a(Bundle bundle, String str) {
        bundle.putParcelable(str, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d72) {
            return Intrinsics.c(this.a, ((d72) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Parcelable parcelable = this.a;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    public final String toString() {
        return "ParcelableVal(value=" + this.a + ")";
    }
}
