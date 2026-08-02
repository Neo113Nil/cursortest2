package ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.v3;

import kotlin.Metadata;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.Alignment;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/LayoutV3Strategy;", "", "updateLayout", "", "top", "", "bottom", "orientation", "updateContentAlignment", "alignment", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/Alignment;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LayoutV3Strategy {
    void updateContentAlignment(Alignment alignment);

    void updateLayout(int top, int bottom, int orientation);
}
