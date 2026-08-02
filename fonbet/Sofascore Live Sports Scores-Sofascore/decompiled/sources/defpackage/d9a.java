package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d9a extends sq3 {
    public WeakReference r;
    public /* synthetic */ Object s;
    public final /* synthetic */ g9a t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9a(g9a g9aVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = g9aVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.m(null, null, this);
    }
}
