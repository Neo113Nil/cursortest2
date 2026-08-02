package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class at7 extends sq3 {
    public List r;
    public AtomicReference s;
    public asf t;
    public /* synthetic */ Object u;
    public final /* synthetic */ bt7 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at7(bt7 bt7Var, sq3 sq3Var) {
        super(sq3Var);
        this.v = bt7Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.d(this);
    }
}
