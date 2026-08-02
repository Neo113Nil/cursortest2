package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ga6 extends sq3 {
    public ArrayList r;
    public /* synthetic */ Object s;
    public final /* synthetic */ qa6 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga6(qa6 qa6Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = qa6Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.q(null, this);
    }
}
