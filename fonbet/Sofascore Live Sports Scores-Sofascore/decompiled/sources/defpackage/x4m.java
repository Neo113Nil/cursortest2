package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x4m extends sq3 {
    public jdm r;
    public List s;
    public /* synthetic */ Object t;
    public final /* synthetic */ jdm u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4m(jdm jdmVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = jdmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, this);
    }
}
