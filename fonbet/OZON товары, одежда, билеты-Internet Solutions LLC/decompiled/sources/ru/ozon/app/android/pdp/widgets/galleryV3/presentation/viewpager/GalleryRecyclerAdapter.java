package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager;

import BK.c;
import Ej.b;
import Sc.o;
import Ve.C4636t5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.PdpWidgetProductGalleryV3VideoItemBinding;
import ru.ozon.app.android.pdp.databinding.PdpWidgetProductGalleryV3VideoPreviewItemBinding;
import ru.ozon.app.android.pdp.ui.configurators.databinding.PdpWidgetProductGalleryV2ImageItemBinding;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3VideoState;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.app.android.video.player.soundservice.SoundController;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R6\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010/R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryRecyclerAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryItemViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayerProvider", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "", "onItemClickListener", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;", "onVideoStateChanged", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;", "galleryViewModel", "onNextUpdateItems", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/video/player/soundservice/SoundController;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;Lkotlin/jvm/functions/Function0;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryItemViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryItemViewHolder;I)V", "getItemCount", "()I", "clearAdapter", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryRecyclerAdapter$ListenersClearble;", "listenersClearbleList", "", "isNotFirstUpdate", "Z", "ListenersClearble", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryRecyclerAdapter extends LifecycleAdapter<GalleryItemViewHolder> {

    @NotNull
    private final GalleryV3ViewModel galleryViewModel;
    private boolean isNotFirstUpdate;

    @NotNull
    private List<? extends GalleryV3VO.Item> items;

    @NotNull
    private final List<ListenersClearble> listenersClearbleList;

    @NotNull
    private final Function1<GalleryV3VO.Item, Unit> onItemClickListener;

    @NotNull
    private final Function0<Unit> onNextUpdateItems;

    @NotNull
    private final Function1<GalleryV3VideoState, Unit> onVideoStateChanged;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SoundController soundController;

    @NotNull
    private final Function0<GalleryVideoPlayer> videoPlayerProvider;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryRecyclerAdapter$ListenersClearble;", "", "clear", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ListenersClearble {
        void clear();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryRecyclerAdapter(@NotNull ComposerReferences refs, @NotNull J lifecycleOwner, @NotNull Function0<GalleryVideoPlayer> videoPlayerProvider, @NotNull Function1<? super GalleryV3VO.Item, Unit> onItemClickListener, @NotNull SoundController soundController, @NotNull Function1<? super GalleryV3VideoState, Unit> onVideoStateChanged, @NotNull GalleryV3ViewModel galleryViewModel, @NotNull Function0<Unit> onNextUpdateItems) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(videoPlayerProvider, "videoPlayerProvider");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(onVideoStateChanged, "onVideoStateChanged");
        Intrinsics.checkNotNullParameter(galleryViewModel, "galleryViewModel");
        Intrinsics.checkNotNullParameter(onNextUpdateItems, "onNextUpdateItems");
        this.refs = refs;
        this.videoPlayerProvider = videoPlayerProvider;
        this.onItemClickListener = onItemClickListener;
        this.soundController = soundController;
        this.onVideoStateChanged = onVideoStateChanged;
        this.galleryViewModel = galleryViewModel;
        this.onNextUpdateItems = onNextUpdateItems;
        this.items = K.f71697a;
        this.listenersClearbleList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(GalleryItemViewHolder galleryItemViewHolder, GalleryRecyclerAdapter galleryRecyclerAdapter, GalleryV3VO.Item item, View view) {
        if (galleryItemViewHolder instanceof VideoItemViewHolder) {
            galleryRecyclerAdapter.galleryViewModel.galleryVideoItemClicked(false);
        } else {
            galleryRecyclerAdapter.onItemClickListener.invoke(item);
        }
    }

    public final void clearAdapter() {
        Iterator<T> it = this.listenersClearbleList.iterator();
        while (it.hasNext()) {
            ((ListenersClearble) it.next()).clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        GalleryV3VO.Item item = this.items.get(position);
        if (item instanceof GalleryV3VO.Item.Photo) {
            return 1;
        }
        if (item instanceof GalleryV3VO.Item.OzonVideo) {
            return ((GalleryV3VO.Item.OzonVideo) item).getIsAutoPlay() ? 2 : 3;
        }
        throw new IllegalArgumentException("Illegal item type: ".concat(item.getClass().getSimpleName()));
    }

    @NotNull
    public final List<GalleryV3VO.Item> getItems() {
        return this.items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public GalleryItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == 1) {
            PdpWidgetProductGalleryV2ImageItemBinding inflate = PdpWidgetProductGalleryV2ImageItemBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new PhotoItemViewHolder(inflate);
        }
        if (viewType == 2) {
            PdpWidgetProductGalleryV3VideoItemBinding inflate2 = PdpWidgetProductGalleryV3VideoItemBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new VideoItemViewHolder(this.refs, inflate2, this.videoPlayerProvider, this.soundController, this.onVideoStateChanged, this.galleryViewModel);
        }
        if (viewType != 3) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType="));
        }
        PdpWidgetProductGalleryV3VideoPreviewItemBinding inflate3 = PdpWidgetProductGalleryV3VideoPreviewItemBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
        return new VideoPreviewItemViewHolder(inflate3, new GalleryRecyclerAdapter$onCreateViewHolder$1(this), this.onVideoStateChanged);
    }

    public final void setItems(@NotNull List<? extends GalleryV3VO.Item> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.items, value)) {
            return;
        }
        this.items = value;
        notifyDataSetChanged();
        if (this.isNotFirstUpdate) {
            this.onNextUpdateItems.invoke();
        }
        this.isNotFirstUpdate = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull GalleryItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        GalleryV3VO.Item item = this.items.get(position);
        if (holder instanceof PhotoItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO.Item.Photo");
            ((PhotoItemViewHolder) holder).bind((GalleryV3VO.Item.Photo) item, position);
        } else if (holder instanceof VideoItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO.Item.OzonVideo");
            ((VideoItemViewHolder) holder).bind((GalleryV3VO.Item.OzonVideo) item);
        } else {
            if (!(holder instanceof VideoPreviewItemViewHolder)) {
                throw new o();
            }
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO.Item.OzonVideo");
            ((VideoPreviewItemViewHolder) holder).bind((GalleryV3VO.Item.OzonVideo) item);
        }
        if (holder instanceof VideoItemViewHolder) {
            this.listenersClearbleList.add(((VideoItemViewHolder) holder).getClearble());
        }
        holder.itemView.setOnClickListener(new c(holder, this, item, 1));
    }
}
