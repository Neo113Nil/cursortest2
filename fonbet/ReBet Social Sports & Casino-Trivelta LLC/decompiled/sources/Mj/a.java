package Mj;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7756a;

    /* renamed from: b, reason: collision with root package name */
    public final Dj.e f7757b;

    public a(boolean z10, Dj.e lineStatusResult) {
        Intrinsics.checkNotNullParameter(lineStatusResult, "lineStatusResult");
        this.f7756a = z10;
        this.f7757b = lineStatusResult;
    }

    public final Dj.e a() {
        return this.f7757b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7756a == aVar.f7756a && Intrinsics.areEqual(this.f7757b, aVar.f7757b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f7756a) * 31) + this.f7757b.hashCode();
    }

    public String toString() {
        return "SetupData(permissionsGranted=" + this.f7756a + ", lineStatusResult=" + this.f7757b + ')';
    }
}
