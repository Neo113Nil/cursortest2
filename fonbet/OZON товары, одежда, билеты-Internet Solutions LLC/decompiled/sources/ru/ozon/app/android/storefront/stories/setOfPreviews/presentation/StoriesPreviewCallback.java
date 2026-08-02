package ru.ozon.app.android.storefront.stories.setOfPreviews.presentation;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.PreviewItemVO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/StoriesPreviewCallback;", "", "click", "", "story", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/PreviewItemVO;", "selectedStoryIndex", "", "preview", "Landroid/view/View;", "bind", "position", "preloadImage", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface StoriesPreviewCallback {
    void bind(@NotNull PreviewItemVO story, int position);

    void click(@NotNull PreviewItemVO story, int selectedStoryIndex, @NotNull View preview);

    void preloadImage(@NotNull PreviewItemVO story, int position);
}
