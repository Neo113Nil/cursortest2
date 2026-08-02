package defpackage;

import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.VotesResponse;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d4f extends sq3 {
    public Event r;
    public VoteType s;
    public VotesResponse t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ e4f w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4f(e4f e4fVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = e4fVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.l(null, false, null, null, this);
    }
}
