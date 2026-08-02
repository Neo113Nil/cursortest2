package ru.ozon.android.messenger.framework.core;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.screen.i;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f87130a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ViewGroup f87131b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final J f87132c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final i f87133d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.messenger.a f87134e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f87135f;

    public d(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller, @NotNull ViewGroup rootView, @NotNull J viewLifecycleOwner, @NotNull i fragment, @NotNull ru.ozon.android.messenger.framework.presentation.messenger.a chatDataSavedStateHandle, @NotNull ru.ozon.android.messenger.framework.data.b blockStore) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(chatDataSavedStateHandle, "chatDataSavedStateHandle");
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        this.f87130a = controller;
        this.f87131b = rootView;
        this.f87132c = viewLifecycleOwner;
        this.f87133d = fragment;
        this.f87134e = chatDataSavedStateHandle;
        this.f87135f = blockStore;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.data.b a() {
        return this.f87135f;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.common.viewmodel.b b() {
        return this.f87134e;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.navigation.controller.a c() {
        return this.f87130a;
    }

    @NotNull
    public final ComponentCallbacksC5392m d() {
        return this.f87133d;
    }

    @NotNull
    public final ViewGroup e() {
        return this.f87131b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f87130a, dVar.f87130a) && Intrinsics.d(this.f87131b, dVar.f87131b) && Intrinsics.d(this.f87132c, dVar.f87132c) && this.f87133d.equals(dVar.f87133d) && this.f87134e.equals(dVar.f87134e) && Intrinsics.d(this.f87135f, dVar.f87135f);
    }

    @NotNull
    public final J f() {
        return this.f87132c;
    }

    public final int hashCode() {
        return this.f87135f.hashCode() + ((this.f87134e.hashCode() + ((this.f87133d.hashCode() + ((this.f87132c.hashCode() + ((this.f87131b.hashCode() + (this.f87130a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "References(controller=" + this.f87130a + ", rootView=" + this.f87131b + ", viewLifecycleOwner=" + this.f87132c + ", fragment=" + this.f87133d + ", chatDataSavedStateHandle=" + this.f87134e + ", blockStore=" + this.f87135f + ")";
    }
}
