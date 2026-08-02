package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class aci implements a0h {
    public final /* synthetic */ a0h a;
    public final /* synthetic */ am0 b;

    public aci(am0 am0Var, a0h a0hVar) {
        this.b = am0Var;
        this.a = a0hVar;
    }

    @Override // defpackage.a0h
    public final long getDurationUs() {
        return this.a.getDurationUs();
    }

    @Override // defpackage.a0h
    public final yzg getSeekPoints(long j) {
        yzg seekPoints = this.a.getSeekPoints(j);
        e0h e0hVar = seekPoints.a;
        long j2 = e0hVar.a;
        long j3 = e0hVar.b;
        long j4 = this.b.b;
        e0h e0hVar2 = new e0h(j2, j3 + j4);
        e0h e0hVar3 = seekPoints.b;
        return new yzg(e0hVar2, new e0h(e0hVar3.a, e0hVar3.b + j4));
    }

    @Override // defpackage.a0h
    public final boolean isSeekable() {
        return this.a.isSeekable();
    }
}
