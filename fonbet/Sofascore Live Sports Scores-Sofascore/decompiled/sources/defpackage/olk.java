package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class olk {
    public String a;
    public tkk b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olk)) {
            return false;
        }
        olk olkVar = (olk) obj;
        return this.a.equals(olkVar.a) && Intrinsics.c(this.b, olkVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tkk tkkVar = this.b;
        return hashCode + (tkkVar == null ? 0 : tkkVar.a.hashCode());
    }

    public final String toString() {
        return "VastDocument(version=" + this.a + ", ad=" + this.b + ')';
    }
}
