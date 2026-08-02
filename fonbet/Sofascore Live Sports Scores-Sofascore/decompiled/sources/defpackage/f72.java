package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f72 implements g72 {
    public final String a;

    public /* synthetic */ f72(String str) {
        this.a = str;
    }

    @Override // defpackage.g72
    public final void a(Bundle bundle, String str) {
        bundle.putCharSequence(str, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f72) {
            return Intrinsics.c(this.a, ((f72) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return lnb.o("StringVal(value=", this.a, ")");
    }
}
