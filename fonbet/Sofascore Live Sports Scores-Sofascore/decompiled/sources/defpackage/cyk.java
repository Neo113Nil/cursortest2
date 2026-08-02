package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cyk extends sq3 {
    public List r;
    public List s;
    public int t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ fyk w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyk(fyk fykVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = fykVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.d(null, null, 0, false, this);
    }
}
