package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xgm extends sq3 {
    public Map r;
    public Iterator s;
    public String t;
    public /* synthetic */ Object u;
    public final /* synthetic */ vnm v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgm(vnm vnmVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = vnmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.e(this);
    }
}
