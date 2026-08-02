package com.plaid.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class I6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f39299a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39300b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f39301c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final J6 f39302d;

    public I6() {
        throw null;
    }

    @NotNull
    public final String a() {
        return this.f39299a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I6)) {
            return false;
        }
        I6 i62 = (I6) obj;
        return Intrinsics.areEqual(this.f39299a, i62.f39299a) && this.f39300b == i62.f39300b && Intrinsics.areEqual(this.f39301c, i62.f39301c) && this.f39302d == i62.f39302d;
    }

    public final int hashCode() {
        return this.f39302d.hashCode() + ((this.f39301c.hashCode() + ((Long.hashCode(this.f39300b) + (this.f39299a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "RemoteLogEvent(eventName=" + this.f39299a + ", timestamp=" + this.f39300b + ", metadata=" + this.f39301c + ", logLevel=" + this.f39302d + ")";
    }

    public I6(String eventName, Map metadata, J6 logLevel) {
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.f39299a = eventName;
        this.f39300b = currentTimeMillis;
        this.f39301c = metadata;
        this.f39302d = logLevel;
    }
}
