package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.pager;

import Ej.b;
import Sc.o;
import WZ.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.J;
import gk0.q;
import jk0.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsGalleryFullVideoBinding;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullDiffUtilItemCallback;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI;
import ru.ozon.app.android.video.player.soundservice.SoundController;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B-\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/pager/HotelsGalleryFullV2PagerAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/pager/HotelsGalleryFullV2PagerItemViewHolder;", "Lkotlin/Function0;", "Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;", "videoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "LWZ/l;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;LWZ/l;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsGalleryFullVideoBinding;", "provideVideoView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsGalleryFullVideoBinding;", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/pager/HotelsGalleryFullV2PagerItemViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/pager/HotelsGalleryFullV2PagerItemViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "LWZ/l;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullV2PagerAdapter extends i<HotelsGalleryFullV2VI.GalleryItem, HotelsGalleryFullV2PagerItemViewHolder<?>> {

    @NotNull
    private final SoundController soundController;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final Function0<HotelsGalleryVideoPlayer> videoPlayerProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFullV2PagerAdapter(@NotNull Function0<HotelsGalleryVideoPlayer> videoPlayerProvider, @NotNull SoundController soundController, @NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner) {
        super(new HotelsGalleryFullDiffUtilItemCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(videoPlayerProvider, "videoPlayerProvider");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.videoPlayerProvider = videoPlayerProvider;
        this.soundController = soundController;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    private final ItemHotelsGalleryFullVideoBinding provideVideoView(ViewGroup parent) {
        ItemHotelsGalleryFullVideoBinding inflate = ItemHotelsGalleryFullVideoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        HotelsGalleryFullV2VI.GalleryItem item = getItem(position);
        if (item instanceof HotelsGalleryFullV2VI.Photo) {
            return 1;
        }
        if (item instanceof HotelsGalleryFullV2VI.Video) {
            return 2;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull HotelsGalleryFullV2PagerItemViewHolder<?> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HotelsGalleryFullV2VI.GalleryItem item = getItem(position);
        if (holder instanceof HotelsGalleryFullV2PagerPhotoViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.Photo");
            ((HotelsGalleryFullV2PagerPhotoViewHolder) holder).bind((HotelsGalleryFullV2VI.Photo) item);
        } else {
            if (!(holder instanceof HotelsGalleryFullV2PagerVideoViewHolder)) {
                throw new o();
            }
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI.Video");
            ((HotelsGalleryFullV2PagerVideoViewHolder) holder).bind((HotelsGalleryFullV2VI.Video) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public HotelsGalleryFullV2PagerItemViewHolder<?> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType != 1) {
            if (viewType == 2) {
                return new HotelsGalleryFullV2PagerVideoViewHolder(provideVideoView(parent), this.videoPlayerProvider, this.soundController, this.tokenizedAnalytics);
            }
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType="));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) q.f64554a.i(N.b(AppCompatImageView.class), parent.getContext());
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(parent.getContext());
        }
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new HotelsGalleryFullV2PagerPhotoViewHolder(appCompatImageView);
    }
}
