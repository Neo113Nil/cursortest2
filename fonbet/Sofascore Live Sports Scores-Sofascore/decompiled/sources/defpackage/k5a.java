package defpackage;

import com.sofascore.results.service.InstallReferrerWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k5a extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ InstallReferrerWorker s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5a(InstallReferrerWorker installReferrerWorker, sq3 sq3Var) {
        super(sq3Var);
        this.s = installReferrerWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.doWork(this);
    }
}
