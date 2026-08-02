package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ru3 extends sq3 {
    public Callable r;
    public /* synthetic */ Object s;
    public final /* synthetic */ dti t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru3(dti dtiVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = dtiVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.m(null, false, null, this);
    }
}
