package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/MediaPreviewDiffer;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "<init>", "()V", "oldItem", "newItem", "", "areContentsTheSame", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;)Z", "areItemsTheSame", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaPreviewDiffer extends i.d<ReviewGalleryPreviewV2VO.ItemVO> {

    @NotNull
    public static final MediaPreviewDiffer INSTANCE = new MediaPreviewDiffer();

    private MediaPreviewDiffer() {
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull ReviewGalleryPreviewV2VO.ItemVO oldItem, @NotNull ReviewGalleryPreviewV2VO.ItemVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull ReviewGalleryPreviewV2VO.ItemVO oldItem, @NotNull ReviewGalleryPreviewV2VO.ItemVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.getImage().getImage(), newItem.getImage().getImage());
    }
}
