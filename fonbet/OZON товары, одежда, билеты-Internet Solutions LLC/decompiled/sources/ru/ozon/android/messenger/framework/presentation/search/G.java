package ru.ozon.android.messenger.framework.presentation.search;

import android.os.Bundle;
import androidx.lifecycle.AbstractC5405a;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class G extends AbstractC5405a {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f91585d;

    public interface a {
        @NotNull
        C9527g a(@NotNull C5418g0 c5418g0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(@NotNull M4.e owner, Bundle bundle, @NotNull a assistedFactory) {
        super(owner, bundle);
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(assistedFactory, "assistedFactory");
        this.f91585d = assistedFactory;
    }

    @Override // androidx.lifecycle.AbstractC5405a
    @NotNull
    protected final <T extends w0> T b(@NotNull String key, @NotNull Class<T> modelClass, @NotNull C5418g0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        if (Intrinsics.d(modelClass, C9527g.class)) {
            return this.f91585d.a(handle);
        }
        throw new IllegalArgumentException("Invalid ViewModel class");
    }
}
