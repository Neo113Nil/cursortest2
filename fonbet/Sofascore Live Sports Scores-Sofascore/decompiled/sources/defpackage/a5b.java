package defpackage;

import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.league.service.LeagueWorker;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a5b extends sq3 {
    public int A;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public UniqueTournament w;
    public Set x;
    public /* synthetic */ Object y;
    public final /* synthetic */ LeagueWorker z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5b(LeagueWorker leagueWorker, sq3 sq3Var) {
        super(sq3Var);
        this.z = leagueWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(0, false, this);
    }
}
