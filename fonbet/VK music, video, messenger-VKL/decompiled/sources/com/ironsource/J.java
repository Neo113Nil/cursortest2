package com.ironsource;

import com.ironsource.C4519r0;

/* loaded from: classes13.dex */
public final class J {
    private C4519r0.a a;

    public J(C4519r0.a aVar) {
        this.a = aVar;
    }

    public final C4519r0.a a() {
        return this.a;
    }

    public final C4519r0.a b() {
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

    public final J a(C4519r0.a aVar) {
        return new J(aVar);
    }

    public final void b(C4519r0.a aVar) {
        this.a = aVar;
    }

    public static /* synthetic */ J a(J j, C4519r0.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = j.a;
        }
        return j.a(aVar);
    }
}
