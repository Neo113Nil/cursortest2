package com.plaid.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f40662a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f40663b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final byte[] f40664c;

    public h8(@NotNull String workflowId, @NotNull String id2, @NotNull byte[] model) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f40662a = workflowId;
        this.f40663b = id2;
        this.f40664c = model;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(h8.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.plaid.internal.workflow.persistence.database.model.WorkflowAnalyticsEntity");
        h8 h8Var = (h8) obj;
        return Intrinsics.areEqual(this.f40662a, h8Var.f40662a) && Intrinsics.areEqual(this.f40663b, h8Var.f40663b) && Arrays.equals(this.f40664c, h8Var.f40664c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40664c) + C3783x.a(this.f40663b, this.f40662a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "WorkflowAnalyticsEntity(workflowId=" + this.f40662a + ", id=" + this.f40663b + ", model=" + Arrays.toString(this.f40664c) + ")";
    }
}
