package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bci extends in8 {
    public final /* synthetic */ b0h b;
    public final /* synthetic */ am0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bci(am0 am0Var, b0h b0hVar, b0h b0hVar2) {
        super(b0hVar);
        this.c = am0Var;
        this.b = b0hVar2;
    }

    @Override // defpackage.in8, defpackage.b0h
    public final zzg getSeekPoints(long j) {
        zzg seekPoints = this.b.getSeekPoints(j);
        f0h f0hVar = seekPoints.a;
        long j2 = f0hVar.a;
        long j3 = f0hVar.b;
        long j4 = this.c.b;
        f0h f0hVar2 = new f0h(j2, j3 + j4);
        f0h f0hVar3 = seekPoints.b;
        return new zzg(f0hVar2, new f0h(f0hVar3.a, f0hVar3.b + j4));
    }
}
