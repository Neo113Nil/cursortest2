package defpackage;

import androidx.glance.session.SessionWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v8h extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ SessionWorker s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8h(SessionWorker sessionWorker, sq3 sq3Var) {
        super(sq3Var);
        this.s = sessionWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.doWork(this);
    }
}
