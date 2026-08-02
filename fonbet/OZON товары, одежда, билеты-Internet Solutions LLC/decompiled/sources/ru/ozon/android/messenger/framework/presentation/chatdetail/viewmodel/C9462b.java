package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9462b implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.di.l f90051a;

    public C9462b(@NotNull ru.ozon.android.messenger.framework.di.l chatScreenComponent) {
        Intrinsics.checkNotNullParameter(chatScreenComponent, "chatScreenComponent");
        this.f90051a = chatScreenComponent;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends androidx.lifecycle.w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (Intrinsics.d(modelClass, C9467e.class)) {
            return this.f90051a.a();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
