package defpackage;

import com.google.android.gms.internal.ads.zzgul;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cho implements Serializable, zzgul {
    public final List a;

    public final boolean equals(Object obj) {
        if (obj instanceof cho) {
            return this.a.equals(((cho) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgul
    public final boolean zza(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((zzgul) list.get(i)).zza(obj)) {
                return false;
            }
            i++;
        }
    }
}
