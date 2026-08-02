package defpackage;

import com.sofascore.model.database.DbSavedSearches;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fwg extends sq3 {
    public gwg r;
    public DbSavedSearches s;
    public /* synthetic */ Object t;
    public final /* synthetic */ gwg u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwg(gwg gwgVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = gwgVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return gwg.a(this.u, null, null, null, this);
    }
}
