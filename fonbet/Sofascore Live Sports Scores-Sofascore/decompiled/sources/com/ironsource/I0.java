package com.ironsource;

import defpackage.vxd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class I0 {
    private final long a;

    public I0(long j) {
        this.a = j;
    }

    public static /* synthetic */ I0 a(I0 i0, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = i0.a;
        }
        return i0.a(j);
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I0) && this.a == ((I0) obj).a;
    }

    public int hashCode() {
        return Long.hashCode(this.a);
    }

    @NotNull
    public String toString() {
        return vxd.m("AdUnitInteractionData(impressionTimeout=", this.a, ")");
    }

    @NotNull
    public final I0 a(long j) {
        return new I0(j);
    }

    public final long a() {
        return this.a;
    }
}
