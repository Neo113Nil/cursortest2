package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w2f extends sq3 {
    public Context r;
    public /* synthetic */ Object s;
    public final /* synthetic */ a3f t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2f(a3f a3fVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = a3fVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.f(0, 0, 0, null, this);
    }
}
