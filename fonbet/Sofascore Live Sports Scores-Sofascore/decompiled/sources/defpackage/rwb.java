package defpackage;

import com.sofascore.local_persistance.Brand;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rwb {
    public final mwb a;
    public final Brand b;
    public final fwb c;
    public final qwb d;

    public rwb(mwb mwbVar, Brand brand, fwb fwbVar, qwb qwbVar) {
        brand.getClass();
        qwbVar.getClass();
        this.a = mwbVar;
        this.b = brand;
        this.c = fwbVar;
        this.d = qwbVar;
    }

    public static rwb a(rwb rwbVar, fwb fwbVar) {
        mwb mwbVar = rwbVar.a;
        Brand brand = rwbVar.b;
        qwb qwbVar = rwbVar.d;
        rwbVar.getClass();
        brand.getClass();
        qwbVar.getClass();
        return new rwb(mwbVar, brand, fwbVar, qwbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwb)) {
            return false;
        }
        rwb rwbVar = (rwb) obj;
        return this.a.equals(rwbVar.a) && Intrinsics.c(this.b, rwbVar.b) && this.c.equals(rwbVar.c) && Intrinsics.c(this.d, rwbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MatchOfTheWeekState(event=" + this.a + ", brand=" + this.b + ", body=" + this.c + ", rewardType=" + this.d + ")";
    }
}
