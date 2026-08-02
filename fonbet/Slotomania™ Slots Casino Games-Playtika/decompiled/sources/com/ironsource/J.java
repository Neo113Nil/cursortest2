package com.ironsource;

import com.ironsource.C2623r0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J {
    private C2623r0.a a;

    public J(C2623r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.a = performance;
    }

    public final C2623r0.a a() {
        return this.a;
    }

    public final C2623r0.a b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.a == ((J) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AdInstancePerformance(performance=" + this.a + ")";
    }

    public final J a(C2623r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        return new J(performance);
    }

    public final void b(C2623r0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.a = aVar;
    }

    public static /* synthetic */ J a(J j, C2623r0.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = j.a;
        }
        return j.a(aVar);
    }
}
