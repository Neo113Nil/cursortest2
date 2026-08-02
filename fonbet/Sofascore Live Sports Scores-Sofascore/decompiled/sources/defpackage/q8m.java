package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q8m implements hbm {
    public final String a;

    public q8m(@NotNull String str) {
        str.getClass();
        this.a = str;
    }

    public static q8m copy$default(q8m q8mVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = q8mVar.a;
        }
        q8mVar.getClass();
        str.getClass();
        return new q8m(str);
    }

    @Override // defpackage.hbm
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8m) && Intrinsics.c(this.a, ((q8m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder("Single(value="), this.a, ')');
    }
}
