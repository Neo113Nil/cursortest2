package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ium extends sq3 {
    public long r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ lzm u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ium(lzm lzmVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = lzmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.u(0, 0L, false, this);
    }
}
