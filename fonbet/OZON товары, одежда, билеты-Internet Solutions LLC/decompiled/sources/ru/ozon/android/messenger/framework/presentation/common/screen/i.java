package ru.ozon.android.messenger.framework.presentation.common.screen;

import X4.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class i<Binding extends X4.a> extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7735q f91123a;

    /* renamed from: b, reason: collision with root package name */
    private Binding f91124b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull InterfaceC6511n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends Binding> inflate) {
        Intrinsics.checkNotNullParameter(inflate, "inflate");
        this.f91123a = (C7735q) inflate;
    }

    @NotNull
    protected final Binding getBinding() {
        Binding binding = this.f91124b;
        Intrinsics.f(binding);
        return binding;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fd.n, kotlin.jvm.internal.q] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Binding binding = (Binding) this.f91123a.invoke(inflater, viewGroup, Boolean.FALSE);
        this.f91124b = binding;
        Intrinsics.f(binding);
        return binding.getRoot();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.f91124b = null;
    }

    protected final void t(@NotNull Function1<? super Binding, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (getView() != null) {
            Binding binding = this.f91124b;
            Intrinsics.f(binding);
            block.invoke(binding);
        }
    }
}
