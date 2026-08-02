package defpackage;

import com.sofascore.model.database.DbEventAll;
import com.sofascore.model.database.DbEventScore;
import com.sofascore.model.mvvm.model.Team;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d76 extends sq3 {
    public int A;
    public v76 r;
    public DbEventAll s;
    public DbEventScore t;
    public Team u;
    public Team v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ v76 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d76(v76 v76Var, sq3 sq3Var) {
        super(sq3Var);
        this.z = v76Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return v76.j(this.z, null, this);
    }
}
