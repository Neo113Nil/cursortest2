package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class onj implements pnj {
    public final vue a;

    public onj(vue vueVar) {
        vueVar.getClass();
        this.a = vueVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onj) && Intrinsics.c(this.a, ((onj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PositionFilter(value=" + this.a + ")";
    }
}
