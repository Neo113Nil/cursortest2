package Xg;

import hh.C4508a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C4508a f13839a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13840b;

    public d(C4508a expectedType, Object response) {
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f13839a = expectedType;
        this.f13840b = response;
    }

    public final C4508a a() {
        return this.f13839a;
    }

    public final Object b() {
        return this.f13840b;
    }

    public final Object c() {
        return this.f13840b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f13839a, dVar.f13839a) && Intrinsics.areEqual(this.f13840b, dVar.f13840b);
    }

    public int hashCode() {
        return (this.f13839a.hashCode() * 31) + this.f13840b.hashCode();
    }

    public String toString() {
        return "HttpResponseContainer(expectedType=" + this.f13839a + ", response=" + this.f13840b + ')';
    }
}
