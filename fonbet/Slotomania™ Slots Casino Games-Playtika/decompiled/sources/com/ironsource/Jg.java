package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes4.dex */
public final class Jg {
    private final List<B> a;

    /* JADX WARN: Multi-variable type inference failed */
    public Jg(List<? extends B> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        this.a = instances;
    }

    public final List<B> a() {
        return this.a;
    }

    public final List<B> b() {
        return this.a;
    }

    public final int c() {
        return this.a.size();
    }

    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (B b : this.a) {
            arrayList.add(a(b.h(), b.r()));
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Jg) && Intrinsics.areEqual(this.a, ((Jg) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "WaterfallInstances(instances=" + this.a + ")";
    }

    public final Jg a(List<? extends B> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        return new Jg(instances);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Jg a(Jg jg, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = jg.a;
        }
        return jg.a(list);
    }

    private final String a(C2608q2 c2608q2, int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), c2608q2.c()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }
}
