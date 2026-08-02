package defpackage;

import com.sofascore.results.team.TeamWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a5j extends sq3 {
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ TeamWorker x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5j(TeamWorker teamWorker, sq3 sq3Var) {
        super(sq3Var);
        this.x = teamWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.h(0, this);
    }
}
