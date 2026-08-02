package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class edi extends sq3 {
    public b98 r;
    public hdi s;
    public yda t;
    public Object u;
    public Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ fdi x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edi(fdi fdiVar, rq3 rq3Var) {
        super(rq3Var);
        this.x = fdiVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        this.x.collect(null, this);
        return lu3.a;
    }
}
