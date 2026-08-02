package com.vk.id.multibranding.internal;

import Ak.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/vk/id/multibranding/internal/MultibrandingAnalyticsContext;", "", "", "screen", "", "isPaused", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreen", "Z", "()Z", "multibranding-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MultibrandingAnalyticsContext {
    private final boolean isPaused;

    @NotNull
    private final String screen;

    public MultibrandingAnalyticsContext(@NotNull String screen, boolean z11) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screen = screen;
        this.isPaused = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultibrandingAnalyticsContext)) {
            return false;
        }
        MultibrandingAnalyticsContext multibrandingAnalyticsContext = (MultibrandingAnalyticsContext) other;
        return Intrinsics.d(this.screen, multibrandingAnalyticsContext.screen) && this.isPaused == multibrandingAnalyticsContext.isPaused;
    }

    @NotNull
    public final String getScreen() {
        return this.screen;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPaused) + (this.screen.hashCode() * 31);
    }

    /* renamed from: isPaused, reason: from getter */
    public final boolean getIsPaused() {
        return this.isPaused;
    }

    @NotNull
    public String toString() {
        return b.f("MultibrandingAnalyticsContext(screen=", this.screen, ", isPaused=", ")", this.isPaused);
    }
}
