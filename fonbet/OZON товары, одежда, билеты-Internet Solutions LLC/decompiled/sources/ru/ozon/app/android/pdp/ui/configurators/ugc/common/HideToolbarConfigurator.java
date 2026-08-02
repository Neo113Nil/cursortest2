package ru.ozon.app.android.pdp.ui.configurators.ugc.common;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/common/HideToolbarConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HideToolbarConfigurator extends ComposerScreenConfig.PageConfigurator {
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        View view;
        Toolbar n11;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (n11 = C10183a.n(view)) == null) {
            return;
        }
        n11.setNavigationIcon(new ColorDrawable(0));
        View childAt = n11.getChildAt(0);
        AppCompatImageButton appCompatImageButton = childAt instanceof AppCompatImageButton ? (AppCompatImageButton) childAt : null;
        if (appCompatImageButton != null) {
            ViewExtKt.gone(appCompatImageButton);
        }
    }
}
