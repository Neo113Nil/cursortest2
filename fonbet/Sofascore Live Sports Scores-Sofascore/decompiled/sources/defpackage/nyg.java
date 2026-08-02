package defpackage;

import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nyg extends sq3 {
    public int r;
    public int s;
    public ComparisonSeasonInfo t;
    public /* synthetic */ Object u;
    public final /* synthetic */ pyg v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyg(pyg pygVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = pygVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.x(0, 0, null, this);
    }
}
