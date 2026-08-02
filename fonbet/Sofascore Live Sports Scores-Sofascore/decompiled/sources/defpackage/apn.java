package defpackage;

import com.google.android.gms.internal.fido.zzbk;
import com.google.android.gms.internal.fido.zzbp;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class apn implements Serializable, zzbp {
    public final Object a;

    public apn(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apn) {
            return zzbk.a(this.a, ((apn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return lnb.o("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
