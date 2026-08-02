package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ewb implements fwb {
    public final String a;
    public final w3f b;

    public ewb(String str, w3f w3fVar) {
        str.getClass();
        w3fVar.getClass();
        this.a = str;
        this.b = w3fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewb)) {
            return false;
        }
        ewb ewbVar = (ewb) obj;
        return Intrinsics.c(this.a, ewbVar.a) && Intrinsics.c(this.b, ewbVar.b);
    }

    @Override // defpackage.fwb
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchOfTheWeekPredictionItem(title=" + this.a + ", prediction=" + this.b + ")";
    }
}
