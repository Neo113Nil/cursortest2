package ru.ozon.android.messenger.framework.composer.utils;

import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f86816a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f86817b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.screen.b f86818c;

    a(b bVar, r rVar, ru.ozon.android.messenger.framework.composer.screen.b bVar2) {
        this.f86816a = bVar;
        this.f86817b = rVar;
        this.f86818c = bVar2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(J ownerParam) {
        Intrinsics.checkNotNullParameter(ownerParam, "ownerParam");
        this.f86818c.getLifecycle().e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        b.c(this.f86816a, this.f86817b);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        b.b(this.f86816a, this.f86817b);
    }
}
