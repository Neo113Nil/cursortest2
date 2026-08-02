package com.squareup.moshi;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object o22) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Comparable<kotlin.Any>");
        Intrinsics.checkNotNullExpressionValue(o22, "o2");
        return ((Comparable) obj).compareTo(o22);
    }
}
