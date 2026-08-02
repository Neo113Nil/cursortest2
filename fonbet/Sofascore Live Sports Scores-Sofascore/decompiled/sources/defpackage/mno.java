package defpackage;

import com.google.android.gms.internal.ads.zzich;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mno {
    public final Class a;
    public final zzich b;

    public /* synthetic */ mno(Class cls, zzich zzichVar) {
        this.a = cls;
        this.b = zzichVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mno)) {
            return false;
        }
        mno mnoVar = (mno) obj;
        return mnoVar.a.equals(this.a) && mnoVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String valueOf = String.valueOf(this.b);
        return wt3.m(simpleName, ", object identifier: ", new StringBuilder(simpleName.length() + 21 + valueOf.length()), valueOf);
    }
}
