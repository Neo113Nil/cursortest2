package com.braze.events.internal;

import com.braze.managers.d1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f535a;

    public t(d1 debugConfig) {
        Intrinsics.checkNotNullParameter(debugConfig, "debugConfig");
        this.f535a = debugConfig;
    }

    public final d1 a() {
        return this.f535a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.areEqual(this.f535a, ((t) obj).f535a);
    }

    public final int hashCode() {
        return this.f535a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerConfigUpdateEvent(debugConfig=" + this.f535a + ")";
    }
}
