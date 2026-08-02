package com.blaze.blazesdk.app_configurations.models.ads;

import defpackage.fc6;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f implements g {
    public final List a;

    public f(@NotNull List<Integer> list) {
        list.getClass();
        this.a = list;
    }

    public static f copy$default(f fVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fVar.a;
        }
        fVar.getClass();
        list.getClass();
        return new f(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.c(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fc6.p(new StringBuilder("FixedPagesIndex(pageIndexes="), this.a, ')');
    }
}
