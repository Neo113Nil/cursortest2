package defpackage;

import com.google.android.gms.internal.auth.zzdj;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nzn implements Serializable, zzdj {
    public final Object a;

    public nzn(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nzn)) {
            return false;
        }
        Object obj2 = ((nzn) obj).a;
        Object obj3 = this.a;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return lnb.o("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
