package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class U implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    public a f90613a;

    public interface a {
        @NotNull
        C9509v create();
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (!Intrinsics.d(modelClass, C9509v.class)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        a aVar = this.f90613a;
        if (aVar != null) {
            return aVar.create();
        }
        Intrinsics.n("assistedFactory");
        throw null;
    }
}
