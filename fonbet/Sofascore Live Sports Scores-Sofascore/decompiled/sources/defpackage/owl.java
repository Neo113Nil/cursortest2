package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class owl extends sq3 {
    public Object r;
    public Object s;
    public List t;
    public /* synthetic */ Object u;
    public final /* synthetic */ cam v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owl(cam camVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = camVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
