package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.team.TeamWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y4j extends sq3 {
    public int r;
    public int s;
    public Event t;
    public /* synthetic */ Object u;
    public final /* synthetic */ TeamWorker v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4j(TeamWorker teamWorker, sq3 sq3Var) {
        super(sq3Var);
        this.v = teamWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.e(0, 0, this);
    }
}
