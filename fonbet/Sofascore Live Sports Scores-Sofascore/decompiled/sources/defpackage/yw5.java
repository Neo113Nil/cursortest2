package defpackage;

import com.sofascore.model.mvvm.model.Event;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yw5 extends sq3 {
    public Event r;
    public /* synthetic */ Object s;
    public final /* synthetic */ zw5 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw5(zw5 zw5Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = zw5Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.u(null, this);
    }
}
