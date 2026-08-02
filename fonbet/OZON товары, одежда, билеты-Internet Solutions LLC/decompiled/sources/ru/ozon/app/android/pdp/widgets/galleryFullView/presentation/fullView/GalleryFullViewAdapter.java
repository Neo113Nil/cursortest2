package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView;

import Ej.b;
import Sc.o;
import WZ.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.J;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.gallery.common.VolumeContentObserver;
import ru.ozon.app.android.pdp.databinding.ItemGalleryFullView360Binding;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GallerySyncViewModelImpl;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.GalleryFullViewVideoScreenBinding;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcContainerView;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegateProvider;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.app.android.video.player.soundservice.SoundService;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-R(\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/BaseGalleryFullViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "playerDelegateProvider", "Lru/ozon/app/android/gallery/common/VolumeContentObserver;", "volumeContentObserver", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "soundService", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "widgetViewModel", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;Lru/ozon/app/android/gallery/common/VolumeContentObserver;Lru/ozon/app/android/video/player/soundservice/SoundService;Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;Landroidx/lifecycle/J;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewImageView;", "createImageRootView", "(Landroid/content/Context;)Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewImageView;", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/BaseGalleryFullViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/BaseGalleryFullViewHolder;I)V", "getItemCount", "()I", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "Lru/ozon/app/android/gallery/common/VolumeContentObserver;", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO;", "list", "Ljava/util/List;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewAdapter extends LifecycleAdapter<BaseGalleryFullViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private List<? extends GalleryFullViewVO.GalleryItemVO> list;

    @NotNull
    private final VideoMoleculePlayerDelegateProvider playerDelegateProvider;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SoundService soundService;

    @NotNull
    private final VolumeContentObserver volumeContentObserver;

    @NotNull
    private final GallerySyncViewModelImpl widgetViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryFullViewAdapter(@NotNull ComposerReferences refs, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull VideoMoleculePlayerDelegateProvider playerDelegateProvider, @NotNull VolumeContentObserver volumeContentObserver, @NotNull SoundService soundService, @NotNull GallerySyncViewModelImpl widgetViewModel, @NotNull J lifecycleOwner) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(playerDelegateProvider, "playerDelegateProvider");
        Intrinsics.checkNotNullParameter(volumeContentObserver, "volumeContentObserver");
        Intrinsics.checkNotNullParameter(soundService, "soundService");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.refs = refs;
        this.actionHandler = actionHandler;
        this.playerDelegateProvider = playerDelegateProvider;
        this.volumeContentObserver = volumeContentObserver;
        this.soundService = soundService;
        this.widgetViewModel = widgetViewModel;
        this.list = K.f71697a;
    }

    private final GalleryFullViewImageView createImageRootView(Context context) {
        GalleryFullViewImageView galleryFullViewImageView = new GalleryFullViewImageView(context);
        galleryFullViewImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return galleryFullViewImageView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        GalleryFullViewVO.GalleryItemVO galleryItemVO = this.list.get(position);
        if (galleryItemVO instanceof GalleryFullViewVO.GalleryItemVO.Image) {
            return 1;
        }
        if (galleryItemVO instanceof GalleryFullViewVO.GalleryItemVO.Photo360) {
            return 2;
        }
        if (galleryItemVO instanceof GalleryFullViewVO.GalleryItemVO.Ugc) {
            return 4;
        }
        if (galleryItemVO instanceof GalleryFullViewVO.GalleryItemVO.Video) {
            return 3;
        }
        throw new o();
    }

    public final void setList(@NotNull List<? extends GalleryFullViewVO.GalleryItemVO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseGalleryFullViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        GalleryFullViewVO.GalleryItemVO galleryItemVO = this.list.get(position);
        if (holder instanceof ImageGalleryFullViewHolder) {
            Intrinsics.g(galleryItemVO, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO.GalleryItemVO.Image");
            ((ImageGalleryFullViewHolder) holder).bind((GalleryFullViewVO.GalleryItemVO.Image) galleryItemVO);
            return;
        }
        if (holder instanceof VideoGalleryFullViewHolder) {
            Intrinsics.g(galleryItemVO, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO.GalleryItemVO.Video");
            ((VideoGalleryFullViewHolder) holder).bind((GalleryFullViewVO.GalleryItemVO.Video) galleryItemVO);
        } else if (holder instanceof UgcGalleryFullViewViewHolder) {
            Intrinsics.g(galleryItemVO, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO.GalleryItemVO.Ugc");
            ((UgcGalleryFullViewViewHolder) holder).bind((GalleryFullViewVO.GalleryItemVO.Ugc) galleryItemVO);
        } else if (holder instanceof Photo360GalleryFullViewHolder) {
            Intrinsics.g(galleryItemVO, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO.GalleryItemVO.Photo360");
            ((Photo360GalleryFullViewHolder) holder).bind((GalleryFullViewVO.GalleryItemVO.Photo360) galleryItemVO);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseGalleryFullViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new ImageGalleryFullViewHolder(createImageRootView(context), this.widgetViewModel, this.refs.getTokenizedAnalytics(), this.refs, parent.getHeight());
        }
        if (viewType == 2) {
            ItemGalleryFullView360Binding inflate = ItemGalleryFullView360Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new Photo360GalleryFullViewHolder(inflate, this.actionHandler);
        }
        if (viewType == 3) {
            GalleryFullViewVideoScreenBinding.Companion companion = GalleryFullViewVideoScreenBinding.INSTANCE;
            LayoutInflater from = LayoutInflater.from(parent.getContext());
            Intrinsics.checkNotNullExpressionValue(from, "from(...)");
            return new VideoGalleryFullViewHolder(companion.inflate(from, parent), this.refs, this.playerDelegateProvider.get(), this.volumeContentObserver, this.soundService, this.widgetViewModel);
        }
        if (viewType != 4) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType="));
        }
        l tokenizedAnalytics = this.refs.getTokenizedAnalytics();
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new UgcGalleryFullViewViewHolder(new GalleryV4UgcContainerView(context2, 0, 0, false, 14, null), this.actionHandler, tokenizedAnalytics);
    }
}
