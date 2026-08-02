package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dql {
    public final List a;

    public dql(@NotNull List<String> list) {
        list.getClass();
        this.a = list;
    }

    public static dql copy$default(dql dqlVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dqlVar.a;
        }
        dqlVar.getClass();
        list.getClass();
        return new dql(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dql) && Intrinsics.c(this.a, ((dql) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fc6.p(new StringBuilder("AnalyticsLoadBalancerConfiguration(hosts="), this.a, ')');
    }
}
