package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lca extends fwj {
    public final /* synthetic */ xs8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lca(Iterator it, xs8 xs8Var) {
        super(it, 0);
        this.c = xs8Var;
    }

    @Override // defpackage.fwj
    public final Object a(Object obj) {
        return this.c.apply(obj);
    }
}
