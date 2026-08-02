package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gid extends sq3 {
    public Context r;
    public String s;
    public jgd t;
    public /* synthetic */ Object u;
    public final /* synthetic */ jid v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gid(jid jidVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = jidVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.f(null, this);
    }
}
