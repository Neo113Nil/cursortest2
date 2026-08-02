package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d8m extends sq3 {
    public jdm r;
    public /* synthetic */ Object s;
    public final /* synthetic */ jdm t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8m(jdm jdmVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = jdmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.c(this);
    }
}
