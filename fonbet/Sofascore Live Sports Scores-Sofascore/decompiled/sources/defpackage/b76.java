package defpackage;

import com.sofascore.model.database.DbEventAll;
import com.sofascore.model.database.DbEventScore;
import com.sofascore.model.mvvm.model.Team;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b76 extends sq3 {
    public final /* synthetic */ v76 A;
    public int B;
    public v76 r;
    public DbEventAll s;
    public DbEventScore t;
    public Team u;
    public Team v;
    public int w;
    public int x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b76(v76 v76Var, sq3 sq3Var) {
        super(sq3Var);
        this.A = v76Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return v76.h(this.A, null, this);
    }
}
