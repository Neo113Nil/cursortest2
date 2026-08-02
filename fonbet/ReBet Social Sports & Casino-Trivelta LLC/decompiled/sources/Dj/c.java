package Dj;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2817a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2818b;

    public c(String digitalLine, p pVar) {
        Intrinsics.checkNotNullParameter(digitalLine, "digitalLine");
        this.f2817a = digitalLine;
        this.f2818b = pVar;
    }

    public final String a() {
        return this.f2817a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f2817a, cVar.f2817a) && this.f2818b == cVar.f2818b;
    }

    public int hashCode() {
        int hashCode = this.f2817a.hashCode() * 31;
        p pVar = this.f2818b;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public String toString() {
        return "CallData(digitalLine=" + this.f2817a + ", recordingConsentAnswer=" + this.f2818b + ')';
    }
}
