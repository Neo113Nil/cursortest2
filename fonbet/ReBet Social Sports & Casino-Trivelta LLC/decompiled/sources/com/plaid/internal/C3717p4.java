package com.plaid.internal;

import com.plaid.internal.C3556a6;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.p4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3717p4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40959a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40960b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40961c;

    /* renamed from: com.plaid.internal.p4$a */
    public static final class a {
        @NotNull
        public static C3717p4 a(@NotNull Common$PollingOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            if (Intrinsics.areEqual(options, Common$PollingOptions.getDefaultInstance())) {
                C3556a6.a.b(C3556a6.f39823a, "No polling options received");
                return new C3717p4(false, options.getIntervalMs() > 0 ? options.getIntervalMs() : 500L, options.getMaxDurationMs() > 0 ? options.getMaxDurationMs() : 5000L);
            }
            if (options.getIntervalMs() <= 0 || options.getMaxDurationMs() <= 0) {
                C3556a6.a.b(C3556a6.f39823a, "Invalid polling options received - duration: " + options.getMaxDurationMs() + " interval: " + options.getIntervalMs());
            }
            return new C3717p4(true, options.getIntervalMs() > 0 ? options.getIntervalMs() : 500L, options.getMaxDurationMs() > 0 ? options.getMaxDurationMs() : 5000L);
        }
    }

    public C3717p4(boolean z10, long j10, long j11) {
        this.f40959a = z10;
        this.f40960b = j10;
        this.f40961c = j11;
    }

    public final long a() {
        return this.f40960b;
    }

    public final long b() {
        return this.f40961c;
    }

    public final boolean c() {
        return this.f40959a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3717p4)) {
            return false;
        }
        C3717p4 c3717p4 = (C3717p4) obj;
        return this.f40959a == c3717p4.f40959a && this.f40960b == c3717p4.f40960b && this.f40961c == c3717p4.f40961c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40961c) + ((Long.hashCode(this.f40960b) + (Boolean.hashCode(this.f40959a) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "OAuthPollingOptions(shouldPoll=" + this.f40959a + ", interval=" + this.f40960b + ", maxDuration=" + this.f40961c + ")";
    }
}
