package ru.ozon.app.android.travel.molecules.extensions;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ru/ozon/app/android/travel/molecules/extensions/ViewExtensionsKt$centerInToolbar$lambda$1$$inlined$whenDestroyed$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/J;", "owner", "", "onDestroy", "(Landroidx/lifecycle/J;)V", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewExtensionsKt$centerInToolbar$lambda$1$$inlined$whenDestroyed$1 implements DefaultLifecycleObserver {
    final /* synthetic */ Toolbar $composerToolbar$inlined;
    final /* synthetic */ View.OnLayoutChangeListener $listener$inlined;
    final /* synthetic */ AbstractC5434v $this_whenDestroyed;

    public ViewExtensionsKt$centerInToolbar$lambda$1$$inlined$whenDestroyed$1(AbstractC5434v abstractC5434v, Toolbar toolbar, View.OnLayoutChangeListener onLayoutChangeListener) {
        this.$this_whenDestroyed = abstractC5434v;
        this.$composerToolbar$inlined = toolbar;
        this.$listener$inlined = onLayoutChangeListener;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.$composerToolbar$inlined.removeOnLayoutChangeListener(this.$listener$inlined);
        this.$this_whenDestroyed.e(this);
    }
}
