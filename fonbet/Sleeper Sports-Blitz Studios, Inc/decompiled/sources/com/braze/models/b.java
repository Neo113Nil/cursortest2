package com.braze.models;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f619a;
    public final boolean b;

    public b(LinkedHashSet eventsList) {
        Intrinsics.checkNotNullParameter(eventsList, "eventsList");
        this.f619a = eventsList;
        this.b = eventsList.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f619a, ((b) obj).f619a);
    }

    public final int hashCode() {
        return this.f619a.hashCode();
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return this.b;
    }

    public final String toString() {
        return "BrazeEventContainer(eventsList=" + this.f619a + ")";
    }
}
