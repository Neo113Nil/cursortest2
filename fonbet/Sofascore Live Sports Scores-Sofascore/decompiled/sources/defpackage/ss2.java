package defpackage;

import com.sofascore.model.chat.Message;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ss2 extends sq3 {
    public Message[] r;
    public /* synthetic */ Object s;
    public final /* synthetic */ us2 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss2(us2 us2Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = us2Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.k(null, this);
    }
}
