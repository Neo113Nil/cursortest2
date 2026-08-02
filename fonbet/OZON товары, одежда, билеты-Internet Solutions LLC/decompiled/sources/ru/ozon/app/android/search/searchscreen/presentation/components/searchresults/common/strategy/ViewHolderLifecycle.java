package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/strategy/ViewHolderLifecycle;", "", "onAttach", "", "onOffscreenPositionChanged", "offscreenOffsetPercent", "", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onDetach", "onRecycle", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ViewHolderLifecycle {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onRecycle(@NotNull ViewHolderLifecycle viewHolderLifecycle) {
        }

        public static void onViewInVisibleBounds(@NotNull ViewHolderLifecycle viewHolderLifecycle) {
        }

        public static void onViewOutOfVisibleBounds(@NotNull ViewHolderLifecycle viewHolderLifecycle) {
        }
    }

    void onAttach();

    void onDetach();

    void onOffscreenPositionChanged(float offscreenOffsetPercent);

    void onRecycle();

    void onViewInVisibleBounds();

    void onViewOutOfVisibleBounds();
}
