package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.items;

import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder;", "Ljk0/j;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "item", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;)V", "PhotoPreviewViewHolder", "VideoPreviewViewHolder", "CountPreviewViewHolder", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder$CountPreviewViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder$PhotoPreviewViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder$VideoPreviewViewHolder;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ItemPreviewViewHolder extends j {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder$CountPreviewViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder;", "countPreviewView", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/CountPreviewItemView;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/CountPreviewItemView;)V", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CountPreviewViewHolder extends ItemPreviewViewHolder {
        public static final int $stable = TextAtomV2View.$stable | Image.$stable;

        @NotNull
        private final CountPreviewItemView countPreviewView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountPreviewViewHolder(@NotNull CountPreviewItemView countPreviewView) {
            super(countPreviewView, null);
            Intrinsics.checkNotNullParameter(countPreviewView, "countPreviewView");
            this.countPreviewView = countPreviewView;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.items.ItemPreviewViewHolder
        public void bind(@NotNull ReviewGalleryPreviewV2VO.ItemVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.countPreviewView.bind(item);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder$PhotoPreviewViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "<init>", "(Lru/ozon/uni/android/atom/image/Image;)V", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PhotoPreviewViewHolder extends ItemPreviewViewHolder {
        public static final int $stable = Image.$stable;

        @NotNull
        private final Image imageView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhotoPreviewViewHolder(@NotNull Image imageView) {
            super(imageView, null);
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            this.imageView = imageView;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.items.ItemPreviewViewHolder
        public void bind(@NotNull ReviewGalleryPreviewV2VO.ItemVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ImageHolderKt.bind$default(this.imageView, item.getImage(), null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder$VideoPreviewViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder;", "videoPreviewView", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/VideoPreviewItemView;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/VideoPreviewItemView;)V", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VideoPreviewViewHolder extends ItemPreviewViewHolder {
        public static final int $stable = IconButtonV3View.$stable | Image.$stable;

        @NotNull
        private final VideoPreviewItemView videoPreviewView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoPreviewViewHolder(@NotNull VideoPreviewItemView videoPreviewView) {
            super(videoPreviewView, null);
            Intrinsics.checkNotNullParameter(videoPreviewView, "videoPreviewView");
            this.videoPreviewView = videoPreviewView;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.items.ItemPreviewViewHolder
        public void bind(@NotNull ReviewGalleryPreviewV2VO.ItemVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.videoPreviewView.bind(item);
        }
    }

    public /* synthetic */ ItemPreviewViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    public abstract void bind(@NotNull ReviewGalleryPreviewV2VO.ItemVO item);

    private ItemPreviewViewHolder(View view) {
        super(view);
    }
}
