package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data;

import kotlin.Metadata;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.warmup.WarmupInfo;
import ru.ozon.app.android.warmup.WarmupInfoProvider;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryWarmupInfoProvider;", "Lru/ozon/app/android/warmup/WarmupInfoProvider;", "<init>", "()V", "widgetId", "", "getWidgetId", "()Ljava/lang/String;", "provide", "Lru/ozon/app/android/warmup/WarmupInfo;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewGalleryWarmupInfoProvider implements WarmupInfoProvider {

    @NotNull
    private final String widgetId = "reviewGallery";

    @Override // ru.ozon.app.android.warmup.WarmupInfoProvider
    @NotNull
    public String getWidgetId() {
        return this.widgetId;
    }

    @Override // ru.ozon.app.android.warmup.WarmupInfoProvider
    @NotNull
    public WarmupInfo provide() {
        return new WarmupInfo(C7714v.b0(ReviewGalleryV2DTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.SpacerDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemToggleButton.class));
    }
}
