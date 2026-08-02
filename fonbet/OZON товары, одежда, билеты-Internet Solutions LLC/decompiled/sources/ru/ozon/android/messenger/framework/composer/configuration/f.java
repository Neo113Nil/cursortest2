package ru.ozon.android.messenger.framework.composer.configuration;

import androidx.lifecycle.DefaultLifecycleObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class f implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private e f86629a;

    public final void a(@NotNull e references) {
        Intrinsics.checkNotNullParameter(references, "references");
        references.c();
        this.f86629a = references;
        c();
    }

    public final e b() {
        return this.f86629a;
    }

    protected void c() {
    }
}
