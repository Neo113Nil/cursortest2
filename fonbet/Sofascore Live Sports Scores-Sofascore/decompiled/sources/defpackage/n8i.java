package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n8i {
    public final zmd a;
    public final fgf b;
    public final old c;
    public final wmd d;
    public final w5i e;
    public final vmd f;

    public n8i(zmd zmdVar, fgf fgfVar, old oldVar, wmd wmdVar, w5i w5iVar, vmd vmdVar) {
        this.a = zmdVar;
        this.b = fgfVar;
        this.c = oldVar;
        this.d = wmdVar;
        this.e = w5iVar;
        this.f = vmdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8i)) {
            return false;
        }
        n8i n8iVar = (n8i) obj;
        return this.a.equals(n8iVar.a) && this.b.equals(n8iVar.b) && this.c.equals(n8iVar.c) && this.d.equals(n8iVar.d) && this.e == n8iVar.e && this.f == n8iVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StageTeamOddsUIModel(team=" + this.a + ", odds=" + this.b + ", provider=" + this.c + ", stage=" + this.d + ", customization=" + this.e + ", analyticsLocation=" + this.f + ")";
    }
}
