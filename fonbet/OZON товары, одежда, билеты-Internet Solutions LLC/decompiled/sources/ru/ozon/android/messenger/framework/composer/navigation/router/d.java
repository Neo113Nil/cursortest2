package ru.ozon.android.messenger.framework.composer.navigation.router;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.navigation.h;

/* loaded from: classes10.dex */
public final class d implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f86734a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC5392m f86735b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f86736c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.e f86737d;

    public d(AbstractC5434v abstractC5434v, ComponentCallbacksC5392m componentCallbacksC5392m, h hVar, ru.ozon.android.messenger.framework.composer.navigation.e eVar) {
        this.f86734a = abstractC5434v;
        this.f86735b = componentCallbacksC5392m;
        this.f86736c = hVar;
        this.f86737d = eVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f86734a.e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f86735b;
        if (componentCallbacksC5392m.isAdded()) {
            G childFragmentManager = componentCallbacksC5392m.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            this.f86736c.a(this.f86737d, childFragmentManager);
        }
        this.f86734a.e(this);
    }
}
