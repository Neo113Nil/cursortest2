package ru.ozon.app.android.search.deeplink;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/deeplink/RemoveRVItemAnimationConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroidx/lifecycle/J;", "owner", "", "onResume", "(Landroidx/lifecycle/J;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoveRVItemAnimationConfigurator extends ComposerScreenConfig.PageConfigurator {
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        View view;
        RecyclerView composerRecyclerViewOrNull;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) == null) {
            return;
        }
        composerRecyclerViewOrNull.setItemAnimator(null);
    }
}
