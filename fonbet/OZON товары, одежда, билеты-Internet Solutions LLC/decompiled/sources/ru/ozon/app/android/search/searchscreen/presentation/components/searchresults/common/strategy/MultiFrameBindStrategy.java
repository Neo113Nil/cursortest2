package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/strategy/MultiFrameBindStrategy;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/strategy/ViewHolderLifecycle;", "frameBinder", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "stateBinder", "itemView", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/strategy/ViewHolderLifecycle;Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "onAttach", "", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onOffscreenPositionChanged", "offscreenOffsetPercent", "", "onDetach", "onRecycle", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class MultiFrameBindStrategy implements ViewHolderLifecycle {

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final ViewHolderLifecycle stateBinder;

    public MultiFrameBindStrategy(@NotNull FrameBinder frameBinder, @NotNull ViewHolderLifecycle stateBinder, @NotNull View itemView, @NotNull ComposerReferences references) {
        View view;
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(stateBinder, "stateBinder");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.frameBinder = frameBinder;
        this.stateBinder = stateBinder;
        frameBinder.init(itemView);
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        frameBinder.applyRecycler((c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view));
    }

    @NotNull
    protected final FrameBinder getFrameBinder() {
        return this.frameBinder;
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle
    public void onAttach() {
        this.frameBinder.onAttach(new MultiFrameBindStrategy$onAttach$1(this.stateBinder));
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle
    public void onDetach() {
        this.frameBinder.onDetach();
        this.stateBinder.onDetach();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle
    public void onRecycle() {
        this.frameBinder.onRecycle();
        this.stateBinder.onRecycle();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle
    public void onViewInVisibleBounds() {
        this.stateBinder.onViewInVisibleBounds();
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle
    public void onViewOutOfVisibleBounds() {
        this.stateBinder.onViewOutOfVisibleBounds();
    }
}
