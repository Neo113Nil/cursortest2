package com.braze.managers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f573a;

    public a(Class javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        this.f573a = javaClass;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f573a, ((a) obj).f573a);
    }

    public final int hashCode() {
        return this.f573a.hashCode();
    }

    public final String toString() {
        return "ActivitySessionWrapper(javaClass=" + this.f573a + ")";
    }
}
