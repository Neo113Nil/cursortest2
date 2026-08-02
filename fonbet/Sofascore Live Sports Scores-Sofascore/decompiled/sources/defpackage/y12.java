package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y12 extends x12 {
    public final r9k e;
    public final r9k f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final double j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y12(r9k r9kVar, r9k r9kVar2, boolean z, boolean z2, String str, double d) {
        super(r9kVar, r9kVar2, z, z2);
        r9kVar.getClass();
        r9kVar2.getClass();
        this.e = r9kVar;
        this.f = r9kVar2;
        this.g = z;
        this.h = z2;
        this.i = str;
        this.j = d;
    }

    @Override // defpackage.x12
    public final r9k a() {
        return this.f;
    }

    @Override // defpackage.x12
    public final r9k b() {
        return this.e;
    }

    @Override // defpackage.x12
    public final boolean c() {
        return this.g;
    }

    @Override // defpackage.x12
    public final boolean d() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxScoreColumnWithValue(shortName=");
        sb.append(this.e);
        sb.append(", fullName=");
        sb.append(this.f);
        sb.append(", skipInShortView=");
        vxd.t(", isWide=", ", stringValue=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", compareValue=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
