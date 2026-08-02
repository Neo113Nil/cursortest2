package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u58 extends sq3 {
    public Map r;
    public Iterator s;
    public r8h t;
    public Map u;
    public Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ v58 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u58(v58 v58Var, sq3 sq3Var) {
        super(sq3Var);
        this.x = v58Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.b(this);
    }
}
