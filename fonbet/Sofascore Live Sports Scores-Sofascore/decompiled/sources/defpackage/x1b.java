package defpackage;

import com.sofascore.model.mvvm.model.UniqueTournament;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x1b extends sq3 {
    public UniqueTournament r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ w3b u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1b(w3b w3bVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = w3bVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.R(null, null, 0, this);
    }
}
