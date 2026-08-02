package defpackage;

import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rxm extends sq3 {
    public pf5 r;
    public File s;
    public vnm t;
    public String u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ pf5 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxm(pf5 pf5Var, sq3 sq3Var) {
        super(sq3Var);
        this.x = pf5Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.a(0, null, this);
    }
}
