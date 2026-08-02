package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d5d extends sq3 {
    public Context r;
    public f5d s;
    public /* synthetic */ Object t;
    public final /* synthetic */ f5d u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5d(f5d f5dVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = f5dVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
