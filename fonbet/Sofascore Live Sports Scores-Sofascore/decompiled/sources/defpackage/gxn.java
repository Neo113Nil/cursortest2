package defpackage;

import com.google.android.gms.internal.fido.zzcs;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gxn extends zzcs implements Serializable {
    public final zzcs a;

    public gxn(zzcs zzcsVar) {
        this.a = zzcsVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs d() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gxn) {
            return this.a.equals(((gxn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
