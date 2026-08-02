package defpackage;

import com.sofascore.model.database.VoteType;
import com.sofascore.results.service.VoteWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hyk extends sq3 {
    public int r;
    public String s;
    public String t;
    public VoteType u;
    public /* synthetic */ Object v;
    public final /* synthetic */ VoteWorker w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyk(VoteWorker voteWorker, sq3 sq3Var) {
        super(sq3Var);
        this.w = voteWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.d(0, null, null, null, this);
    }
}
