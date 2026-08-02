package com.blaze.blazesdk.app_configurations.models.ads;

import defpackage.wv8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h implements i {
    public final List a;
    public final int b;

    public h(@NotNull List<Integer> list, int i) {
        list.getClass();
        this.a = list;
        this.b = i;
    }

    public static h copy$default(h hVar, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = hVar.a;
        }
        if ((i2 & 2) != 0) {
            i = hVar.b;
        }
        hVar.getClass();
        list.getClass();
        return new h(list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.c(this.a, hVar.a) && this.b == hVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FixedPercentages(percentages=");
        sb.append(this.a);
        sb.append(", interval=");
        return wv8.j(sb, this.b, ')');
    }
}
