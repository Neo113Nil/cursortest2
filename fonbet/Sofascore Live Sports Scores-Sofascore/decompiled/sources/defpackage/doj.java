package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class doj extends sq3 {
    public int r;
    public String s;
    public /* synthetic */ Object t;
    public final /* synthetic */ koj u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doj(koj kojVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = kojVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.w(0, 0, this, null);
    }
}
