package c;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26490a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26491b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f26492c;

    public Q0(float f10, boolean z10, Float f11) {
        this.f26490a = f10;
        this.f26491b = z10;
        this.f26492c = f11;
    }

    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to("level", Float.valueOf(this.f26490a)), TuplesKt.to("is_charging", Boolean.valueOf(this.f26491b)), TuplesKt.to("temperature", this.f26492c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        return Float.compare(this.f26490a, q02.f26490a) == 0 && this.f26491b == q02.f26491b && Intrinsics.areEqual((Object) this.f26492c, (Object) q02.f26492c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Float.hashCode(this.f26490a) * 31;
        boolean z10 = this.f26491b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        Float f10 = this.f26492c;
        return i11 + (f10 == null ? 0 : f10.hashCode());
    }

    public final String toString() {
        return "Battery(level=" + this.f26490a + ", is_charging=" + this.f26491b + ", temperature=" + this.f26492c + ')';
    }
}
