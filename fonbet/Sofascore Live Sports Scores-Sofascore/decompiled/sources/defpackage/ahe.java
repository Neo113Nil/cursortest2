package defpackage;

import com.sofascore.results.service.PinnedLeagueWorker;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ahe extends sq3 {
    public List r;
    public asf s;
    public Object t;
    public Iterator u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ PinnedLeagueWorker x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahe(PinnedLeagueWorker pinnedLeagueWorker, sq3 sq3Var) {
        super(sq3Var);
        this.x = pinnedLeagueWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.g(this);
    }
}
