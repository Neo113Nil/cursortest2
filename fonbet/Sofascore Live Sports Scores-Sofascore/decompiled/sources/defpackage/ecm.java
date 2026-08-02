package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ecm extends sq3 {
    public ilm r;
    public vnm s;
    public String t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ilm w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecm(ilm ilmVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = ilmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.Y(this);
    }
}
