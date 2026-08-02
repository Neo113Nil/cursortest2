package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nj0 implements rj0 {
    public final d7e a;

    public nj0(d7e d7eVar) {
        this.a = d7eVar;
    }

    @Override // defpackage.rj0
    public final d7e a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj0) && Intrinsics.c(this.a, ((nj0) obj).a);
    }

    public final int hashCode() {
        d7e d7eVar = this.a;
        if (d7eVar == null) {
            return 0;
        }
        return d7eVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ")";
    }
}
