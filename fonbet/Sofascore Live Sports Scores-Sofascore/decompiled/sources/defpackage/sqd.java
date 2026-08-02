package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sqd extends wtc implements o1c {
    public Function1 o;
    public long p;

    @Override // defpackage.wtc
    public final boolean Z0() {
        return true;
    }

    @Override // defpackage.o1c
    public final void c(long j) {
        if (c7a.a(this.p, j)) {
            return;
        }
        this.o.invoke(new c7a(j));
        this.p = j;
    }
}
