package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s4h extends sq3 {
    public d4e r;
    public List s;
    public Object t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ t4h x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4h(t4h t4hVar, sq3 sq3Var) {
        super(sq3Var);
        this.x = t4hVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(null, this);
    }
}
