package defpackage;

import com.sofascore.model.chat.DbChatMessage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vr2 extends sq3 {
    public DbChatMessage r;
    public /* synthetic */ Object s;
    public final /* synthetic */ cs2 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr2(cs2 cs2Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = cs2Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, this);
    }
}
