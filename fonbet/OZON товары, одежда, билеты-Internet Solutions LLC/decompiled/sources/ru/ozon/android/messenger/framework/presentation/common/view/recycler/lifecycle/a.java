package ru.ozon.android.messenger.framework.presentation.common.view.recycler.lifecycle;

import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class a extends RecyclerView.C implements J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L f91248a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.f91248a = new L(this);
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public final AbstractC5434v getLifecycle() {
        return this.f91248a;
    }
}
