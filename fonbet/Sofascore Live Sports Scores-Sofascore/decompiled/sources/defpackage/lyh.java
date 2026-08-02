package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lyh {
    public static final /* synthetic */ int e = 0;
    public final kyh a;
    public final jyh b;
    public final fk5 c;
    public final i65 d;

    public lyh(kyh kyhVar, jyh jyhVar, fk5 fk5Var, i65 i65Var) {
        this.a = kyhVar;
        this.b = jyhVar;
        this.c = fk5Var;
        this.d = i65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyh)) {
            return false;
        }
        lyh lyhVar = (lyh) obj;
        return this.a.equals(lyhVar.a) && this.b.equals(lyhVar.b) && this.c.equals(lyhVar.c) && this.d.equals(lyhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return lyh.class.getSimpleName() + ":{splitType=" + this.a + ", layoutDir=" + this.b + ", animationParams=" + this.c + ", dividerAttributes=" + this.d + " }";
    }
}
