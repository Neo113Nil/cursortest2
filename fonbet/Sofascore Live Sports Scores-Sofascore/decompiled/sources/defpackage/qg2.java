package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qg2 implements Iterable, eia {
    public final /* synthetic */ fg2 a;
    public final /* synthetic */ fg2 b;
    public final /* synthetic */ int c;

    public qg2(fg2 fg2Var, fg2 fg2Var2, int i) {
        this.a = fg2Var;
        this.b = fg2Var2;
        this.c = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        return new og2(this.a, this.b, 5, 7, valueOf, rg2.b);
    }
}
