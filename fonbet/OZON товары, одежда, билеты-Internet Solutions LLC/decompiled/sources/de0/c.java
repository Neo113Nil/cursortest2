package de0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final c f61616c = new c(true, true);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final c f61617d = new c(false, false);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f61618a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61619b;

    public c(boolean z11, boolean z12) {
        this.f61618a = z11;
        this.f61619b = z12;
    }

    public final boolean c(@NotNull c oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return oldState.f61618a && !this.f61618a;
    }

    public final boolean d(@NotNull c oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return !oldState.f61618a && this.f61618a;
    }

    public final boolean e(@NotNull c oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return oldState.f61619b && !this.f61619b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f61618a == cVar.f61618a && this.f61619b == cVar.f61619b;
    }

    public final boolean f(@NotNull c oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return !oldState.f61619b && this.f61619b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61619b) + (Boolean.hashCode(this.f61618a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClusterizerState(isCalculationActive=");
        sb2.append(this.f61618a);
        sb2.append(", isPlacemarksVisible=");
        return Pk0.a.a(")", sb2, this.f61619b);
    }
}
