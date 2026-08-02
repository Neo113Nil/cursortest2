package qe0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qe0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9048c {

    /* renamed from: a, reason: collision with root package name */
    private final float f82041a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f82042b;

    public C9048c(float f7, Integer num) {
        this.f82041a = f7;
        this.f82042b = num;
    }

    public final float a() {
        return this.f82041a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9048c)) {
            return false;
        }
        C9048c c9048c = (C9048c) obj;
        return Float.compare(this.f82041a, c9048c.f82041a) == 0 && Intrinsics.d(this.f82042b, c9048c.f82042b);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f82041a) * 31;
        Integer num = this.f82042b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public final String toString() {
        return "CompassUpdateData(heading=" + this.f82041a + ", accuracy=" + this.f82042b + ")";
    }
}
