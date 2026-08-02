package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e1e {
    public final c1e a;
    public final d1e b;
    public final Gender c;
    public final String d;

    public e1e(c1e c1eVar, d1e d1eVar, Gender gender, String str) {
        this.a = c1eVar;
        this.b = d1eVar;
        this.c = gender;
        this.d = str;
    }

    public final int a() {
        List j = b.j(this.a, this.b, this.c, this.d);
        int i = 0;
        if (j != null && j.isEmpty()) {
            return 0;
        }
        Iterator it = j.iterator();
        while (it.hasNext()) {
            if (it.next() != null && (i = i + 1) < 0) {
                b.p();
                throw null;
            }
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1e)) {
            return false;
        }
        e1e e1eVar = (e1e) obj;
        return Intrinsics.c(this.a, e1eVar.a) && Intrinsics.c(this.b, e1eVar.b) && this.c == e1eVar.c && Intrinsics.c(this.d, e1eVar.d);
    }

    public final int hashCode() {
        c1e c1eVar = this.a;
        int hashCode = (c1eVar == null ? 0 : c1eVar.hashCode()) * 31;
        d1e d1eVar = this.b;
        int hashCode2 = (hashCode + (d1eVar == null ? 0 : d1eVar.hashCode())) * 31;
        Gender gender = this.c;
        int hashCode3 = (hashCode2 + (gender == null ? 0 : gender.hashCode())) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "POTSHighestRatedPlayersFilters(country=" + this.a + ", team=" + this.b + ", gender=" + this.c + ", position=" + this.d + ")";
    }
}
