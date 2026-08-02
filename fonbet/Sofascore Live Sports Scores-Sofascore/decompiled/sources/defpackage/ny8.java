package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ny8 {
    public final Map a;
    public final Map b;

    public ny8(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny8)) {
            return false;
        }
        ny8 ny8Var = (ny8) obj;
        return Intrinsics.c(this.a, ny8Var.a) && Intrinsics.c(this.b, ny8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(receiverToProviderName=");
        sb.append(this.a);
        sb.append(", providerNameToReceivers=");
        return dmi.s(sb, this.b, ')');
    }
}
