package defpackage;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mul {
    public final Map a;
    public final String b;
    public final Bundle c;

    public mul(Map map, String str, Bundle bundle) {
        map.getClass();
        this.a = map;
        this.b = str;
        this.c = bundle;
    }

    public static mul copy$default(mul mulVar, Map map, String str, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            map = mulVar.a;
        }
        if ((i & 2) != 0) {
            str = mulVar.b;
        }
        if ((i & 4) != 0) {
            bundle = mulVar.c;
        }
        mulVar.getClass();
        map.getClass();
        return new mul(map, str, bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mul)) {
            return false;
        }
        mul mulVar = (mul) obj;
        return Intrinsics.c(this.a, mulVar.a) && Intrinsics.c(this.b, mulVar.b) && Intrinsics.c(this.c, mulVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Bundle bundle = this.c;
        return hashCode2 + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        return "DelegateResults(customGAMTargetingProperties=" + this.a + ", publisherProvidedId=" + this.b + ", networkExtras=" + this.c + ')';
    }
}
