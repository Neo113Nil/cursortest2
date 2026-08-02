package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter;

import Ej.b;
import Sc.o;
import WZ.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsGalleryVideoItemBinding;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryViewModel;
import ru.ozon.app.android.video.player.soundservice.SoundController;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/BQ\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/adapter/HotelsGalleryItemAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/adapter/HotelsGalleryItemViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function0;", "Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;", "videoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryViewModel;", "galleryViewModel", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Photo;", "", "onPhotoItemClicked", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroidx/lifecycle/J;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryViewModel;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Landroid/view/ViewGroup;", "parent", "Landroidx/appcompat/widget/AppCompatImageView;", "providePhotoView", "(Landroid/view/ViewGroup;)Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsGalleryVideoItemBinding;", "provideVideoView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsGalleryVideoItemBinding;", "holder", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/adapter/HotelsGalleryItemViewHolder;I)V", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/adapter/HotelsGalleryItemViewHolder;", "getItemViewType", "(I)I", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryViewModel;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "HotelsGalleryDiffUtilItemCallback", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryItemAdapter extends i<HotelsGalleryVO.GalleryItem, HotelsGalleryItemViewHolder> {

    @NotNull
    private final HotelsGalleryViewModel galleryViewModel;

    @NotNull
    private final Function1<HotelsGalleryVO.Photo, Unit> onPhotoItemClicked;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SoundController soundController;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final Function0<HotelsGalleryVideoPlayer> videoPlayerProvider;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/adapter/HotelsGalleryItemAdapter$HotelsGalleryDiffUtilItemCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;)Z", "areContentsTheSame", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class HotelsGalleryDiffUtilItemCallback extends i.d<HotelsGalleryVO.GalleryItem> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull HotelsGalleryVO.GalleryItem oldItem, @NotNull HotelsGalleryVO.GalleryItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull HotelsGalleryVO.GalleryItem oldItem, @NotNull HotelsGalleryVO.GalleryItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotelsGalleryItemAdapter(@NotNull J lifecycleOwner, @NotNull ComposerReferences refs, @NotNull Function0<HotelsGalleryVideoPlayer> videoPlayerProvider, @NotNull SoundController soundController, @NotNull HotelsGalleryViewModel galleryViewModel, @NotNull Function1<? super HotelsGalleryVO.Photo, Unit> onPhotoItemClicked, @NotNull l tokenizedAnalytics) {
        super(new HotelsGalleryDiffUtilItemCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(videoPlayerProvider, "videoPlayerProvider");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(galleryViewModel, "galleryViewModel");
        Intrinsics.checkNotNullParameter(onPhotoItemClicked, "onPhotoItemClicked");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.videoPlayerProvider = videoPlayerProvider;
        this.soundController = soundController;
        this.galleryViewModel = galleryViewModel;
        this.onPhotoItemClicked = onPhotoItemClicked;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    private final AppCompatImageView providePhotoView(ViewGroup parent) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(parent.getContext());
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return appCompatImageView;
    }

    private final ItemHotelsGalleryVideoItemBinding provideVideoView(ViewGroup parent) {
        ItemHotelsGalleryVideoItemBinding inflate = ItemHotelsGalleryVideoItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        HotelsGalleryVO.GalleryItem galleryItem = getCurrentList().get(position);
        if (galleryItem instanceof HotelsGalleryVO.Photo) {
            return R$id.hotelsGalleryImageItem;
        }
        if (galleryItem instanceof HotelsGalleryVO.Video) {
            return R$layout.item_hotels_gallery_video_item;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull HotelsGalleryItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HotelsGalleryVO.GalleryItem galleryItem = getCurrentList().get(position);
        if (holder instanceof HotelsGalleryPhotoViewHolder) {
            Intrinsics.g(galleryItem, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO.Photo");
            ((HotelsGalleryPhotoViewHolder) holder).bind((HotelsGalleryVO.Photo) galleryItem);
        } else {
            if (!(holder instanceof HotelsGalleryVideoViewHolder)) {
                throw new o();
            }
            Intrinsics.g(galleryItem, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO.Video");
            ((HotelsGalleryVideoViewHolder) holder).bind((HotelsGalleryVO.Video) galleryItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public HotelsGalleryItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == R$id.hotelsGalleryImageItem) {
            return new HotelsGalleryPhotoViewHolder(providePhotoView(parent), this.tokenizedAnalytics, this.onPhotoItemClicked);
        }
        if (viewType == R$layout.item_hotels_gallery_video_item) {
            return new HotelsGalleryVideoViewHolder(this.refs, provideVideoView(parent), this.videoPlayerProvider, this.soundController, this.galleryViewModel, this.tokenizedAnalytics);
        }
        throw new IllegalArgumentException(b.a(viewType, "Unknown viewType: "));
    }
}
