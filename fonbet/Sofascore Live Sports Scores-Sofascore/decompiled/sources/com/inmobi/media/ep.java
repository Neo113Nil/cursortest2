package com.inmobi.media;

import defpackage.km5;
import defpackage.lm5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class ep extends H2 {
    public final Map a;
    public final List b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ep(Map map, ArrayList arrayList, int i) {
        this(map, (i & 2) != 0 ? km5.a : arrayList);
        if ((i & 1) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        return Intrinsics.c(this.a, epVar.a) && Intrinsics.c(this.b, epVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithExtras(macros=" + this.a + ", trackers=" + this.b + ")";
    }

    public ep(Map map, List list) {
        map.getClass();
        list.getClass();
        this.a = map;
        this.b = list;
    }
}
