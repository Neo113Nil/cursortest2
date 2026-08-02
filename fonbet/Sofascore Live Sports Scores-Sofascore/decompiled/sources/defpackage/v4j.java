package defpackage;

import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.team.TeamWorker;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v4j extends sq3 {
    public int r;
    public int s;
    public int t;
    public Team u;
    public Set v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ TeamWorker y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4j(TeamWorker teamWorker, sq3 sq3Var) {
        super(sq3Var);
        this.y = teamWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.c(0, this);
    }
}
