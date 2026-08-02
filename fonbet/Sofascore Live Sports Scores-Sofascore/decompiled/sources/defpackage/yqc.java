package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yqc {
    public final String a;
    public final brc b;
    public final arc c;
    public final arc d;
    public final arc e;
    public final arc f;
    public final loc g;
    public final boolean h;

    public yqc(String str, brc brcVar, arc arcVar, arc arcVar2, arc arcVar3, arc arcVar4, loc locVar, boolean z, int i) {
        arcVar3 = (i & 32) != 0 ? null : arcVar3;
        arcVar4 = (i & 64) != 0 ? null : arcVar4;
        z = (i & 512) != 0 ? false : z;
        this.a = str;
        this.b = brcVar;
        this.c = arcVar;
        this.d = arcVar2;
        this.e = arcVar3;
        this.f = arcVar4;
        this.g = locVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqc)) {
            return false;
        }
        yqc yqcVar = (yqc) obj;
        return this.a.equals(yqcVar.a) && this.b == yqcVar.b && this.c.equals(yqcVar.c) && this.d.equals(yqcVar.d) && Intrinsics.c(this.e, yqcVar.e) && Intrinsics.c(this.f, yqcVar.f) && this.g == yqcVar.g && this.h == yqcVar.h;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 31)) * 31;
        arc arcVar = this.e;
        int hashCode2 = (hashCode + (arcVar == null ? 0 : arcVar.hashCode())) * 31;
        arc arcVar2 = this.f;
        int hashCode3 = (hashCode2 + (arcVar2 == null ? 0 : arcVar2.hashCode())) * 31;
        loc locVar = this.g;
        return Boolean.hashCode(this.h) + ((hashCode3 + (locVar != null ? locVar.hashCode() : 0)) * 961);
    }

    public final String toString() {
        return "MmaStatDualDataWrapper(tag=" + this.a + ", secondaryTag=null, viewType=" + this.b + ", primaryHomeValues=" + this.c + ", primaryAwayValues=" + this.d + ", secondaryHomeValues=" + this.e + ", secondaryAwayValues=" + this.f + ", primaryHighlight=" + this.g + ", secondaryHighlight=null, isTime=" + this.h + ")";
    }
}
