package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e5i {
    public final x5i a;
    public final w5i b;
    public final wmd c;
    public final old d;
    public final fgf e;
    public final r9k f;

    public e5i(x5i x5iVar, w5i w5iVar, wmd wmdVar, old oldVar, fgf fgfVar, q9k q9kVar) {
        this.a = x5iVar;
        this.b = w5iVar;
        this.c = wmdVar;
        this.d = oldVar;
        this.e = fgfVar;
        this.f = q9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5i)) {
            return false;
        }
        e5i e5iVar = (e5i) obj;
        return this.a == e5iVar.a && this.b == e5iVar.b && this.c.equals(e5iVar.c) && this.d.equals(e5iVar.d) && this.e.equals(e5iVar.e) && Intrinsics.c(this.f, e5iVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        r9k r9kVar = this.f;
        return hashCode + (r9kVar == null ? 0 : r9kVar.hashCode());
    }

    public final String toString() {
        return "StageFeaturedOddsUIModel(viewType=" + this.a + ", customization=" + this.b + ", stage=" + this.c + ", countryProvider=" + this.d + ", odds=" + this.e + ", label=" + this.f + ")";
    }
}
