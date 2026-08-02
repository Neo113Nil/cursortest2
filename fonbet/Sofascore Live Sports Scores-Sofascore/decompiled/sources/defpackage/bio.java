package defpackage;

import com.google.android.gms.internal.ads.zzgub;
import com.google.android.gms.internal.ads.zzgzg;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bio extends zzgzg implements Serializable {
    public final zzgub a = ahn.h;
    public final zzgzg b;

    public bio(zzgzg zzgzgVar) {
        this.b = zzgzgVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzgub zzgubVar = this.a;
        return this.b.compare(zzgubVar.apply(obj), zzgubVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bio) {
            bio bioVar = (bio) obj;
            if (this.a.equals(bioVar.a) && this.b.equals(bioVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        String obj = this.b.toString();
        int length = obj.length();
        String obj2 = this.a.toString();
        return fc6.o(new StringBuilder(length + 12 + obj2.length() + 1), obj, ".onResultOf(", obj2, ")");
    }
}
