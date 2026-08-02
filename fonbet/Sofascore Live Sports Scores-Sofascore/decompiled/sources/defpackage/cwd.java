package defpackage;

import com.sofascore.results.service.OrderedSportsWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cwd extends sq3 {
    public String r;
    public /* synthetic */ Object s;
    public final /* synthetic */ OrderedSportsWorker t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwd(OrderedSportsWorker orderedSportsWorker, sq3 sq3Var) {
        super(sq3Var);
        this.t = orderedSportsWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.d(null, this);
    }
}
