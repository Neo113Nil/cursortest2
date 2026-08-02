package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yyd extends sq3 {
    public obm r;
    public n4m s;
    public orm t;
    public orm u;
    public /* synthetic */ Object v;
    public final /* synthetic */ obm w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyd(obm obmVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = obmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return obm.B(this.w, null, this);
    }
}
