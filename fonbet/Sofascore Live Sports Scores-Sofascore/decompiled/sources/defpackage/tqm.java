package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tqm extends sq3 {
    public gum r;
    public String s;
    public String t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ gum w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqm(gum gumVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = gumVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.e(null, null, false, this);
    }
}
