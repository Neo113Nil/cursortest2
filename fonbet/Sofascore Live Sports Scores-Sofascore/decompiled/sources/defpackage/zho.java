package defpackage;

import com.google.android.gms.internal.ads.zzgyu;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zho implements zzgyu {
    public transient Set a;
    public transient Collection b;
    public transient Map c;

    public abstract Map d();

    public boolean e(Object obj) {
        Iterator it = zzu().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgyu) {
            return zzu().equals(((zzgyu) obj).zzu());
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public Map zzu() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map d = d();
        this.c = d;
        return d;
    }
}
