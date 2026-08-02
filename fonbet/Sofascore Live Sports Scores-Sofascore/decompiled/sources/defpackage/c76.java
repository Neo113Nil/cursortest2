package defpackage;

import com.sofascore.model.database.DbEvent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c76 extends sq3 {
    public v76 r;
    public DbEvent s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ v76 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c76(v76 v76Var, sq3 sq3Var) {
        super(sq3Var);
        this.w = v76Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return v76.i(this.w, 0, this);
    }
}
