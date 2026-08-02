package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.PreviewItemListAdapter;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/di/ReviewGalleryPreviewV2Component$Companion$create$1$1$videoPreloader$2$1", "invoke", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/di/ReviewGalleryPreviewV2Component$Companion$create$1$1$videoPreloader$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewV2Component$Companion$create$1$1$videoPreloader$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ PlayerPreloader $playerPreloader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewV2Component$Companion$create$1$1$videoPreloader$2(PlayerPreloader playerPreloader) {
        super(0);
        this.$playerPreloader = playerPreloader;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di.ReviewGalleryPreviewV2Component$Companion$create$1$1$videoPreloader$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final PlayerPreloader playerPreloader = this.$playerPreloader;
        return new PreviewItemListAdapter.VideoPreloader() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di.ReviewGalleryPreviewV2Component$Companion$create$1$1$videoPreloader$2.1
            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.PreviewItemListAdapter.VideoPreloader
            public void loadVideo(PreloadVideoInfo info) {
                Intrinsics.checkNotNullParameter(info, "info");
                PlayerPreloader.DefaultImpls.preCreatePlayer$default(PlayerPreloader.this, info, null, 2, null);
            }
        };
    }
}
