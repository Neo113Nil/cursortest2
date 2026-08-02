package com.plaid.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class I4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f39295a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f39296b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final byte[] f39297c;

    public I4(@NotNull String workflowId, @NotNull String renderingId, @NotNull byte[] model) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(renderingId, "renderingId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f39295a = workflowId;
        this.f39296b = renderingId;
        this.f39297c = model;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I4)) {
            return false;
        }
        I4 i42 = (I4) obj;
        return Intrinsics.areEqual(this.f39295a, i42.f39295a) && Intrinsics.areEqual(this.f39296b, i42.f39296b) && Intrinsics.areEqual(this.f39297c, i42.f39297c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f39297c) + C3783x.a(this.f39296b, this.f39295a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "PaneEntity(workflowId=" + this.f39295a + ", renderingId=" + this.f39296b + ", model=" + Arrays.toString(this.f39297c) + ")";
    }
}
