package ru.ozon.android.messenger.utils.camera;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ComponentCallbacksC5392m f91855a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.appcompat.app.f f91856b;

    public static final class a implements DefaultLifecycleObserver {
        a() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(J owner) {
            AbstractC5434v lifecycle;
            Intrinsics.checkNotNullParameter(owner, "owner");
            k kVar = k.this;
            kVar.f91856b.dismiss();
            r activity = kVar.f91855a.getActivity();
            if (activity != null && (lifecycle = activity.getLifecycle()) != null) {
                lifecycle.e(this);
            }
            super.onDestroy(owner);
        }
    }

    public k(ComponentCallbacksC5392m componentCallbacksC5392m, androidx.appcompat.app.f fVar) {
        AbstractC5434v lifecycle;
        this.f91855a = componentCallbacksC5392m;
        this.f91856b = fVar;
        r activity = componentCallbacksC5392m.getActivity();
        if (activity == null || (lifecycle = activity.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new a());
    }

    public final void c() {
        this.f91856b.show();
    }
}
