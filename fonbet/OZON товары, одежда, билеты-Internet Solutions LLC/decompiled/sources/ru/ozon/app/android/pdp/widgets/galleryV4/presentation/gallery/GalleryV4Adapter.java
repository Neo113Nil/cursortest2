package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery;

import Ej.n;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import gk0.q;
import java.util.List;
import java.util.Queue;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4ShapeableImageView;
import ru.ozon.app.android.pdp.utils.BoundedLinkedHashMap;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4Resources;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4ViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.image.GalleryV4ImageVH;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.image.GalleryV4WaveImageVH;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.image.GalleryV4WaveImageView;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.info.GalleryV4InfoVH;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.info.GalleryV4InfoView;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcContainerView;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVH;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.video.GalleryV4VideoVH;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.video.GalleryV4VideoView;
import ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u00012\u00020\u0004B\u0081\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J%\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010*J%\u0010-\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b-\u0010.J3\u0010-\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0016¢\u0006\u0004\b-\u00102J1\u00107\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00052\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u0002042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\t¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u000f¢\u0006\u0004\b<\u0010=J\u0017\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bA\u0010BR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010DR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010ER\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010FR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010GR&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010HR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010IR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010FR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u001e0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020N0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010MR\u0016\u00103\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4Adapter;", "Ljk0/i;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV4/utils/GalleryV4Utils;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "initialPreCreationConfig", "Landroidx/lifecycle/J;", "lifecycleOwner", "", "isTextureViewEnabled", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4Resources;", "galleryResources", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "onItemClick", "LWZ/l;", "tokenizedAnalytics", "onRenderFirstFrame", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;Landroidx/lifecycle/J;ZLru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4Resources;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;Lkotlin/jvm/functions/Function2;LWZ/l;Lkotlin/jvm/functions/Function0;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromRecyclerView", "holder", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4ViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4ViewHolder;ILjava/util/List;)V", "preCreationConfig", "", "list", "submitted", "submitList", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "isForcedAllPause", "updateVideoItems", "(Z)V", "resetVideoPositions", "()V", "Landroid/content/Context;", "context", "Landroid/widget/ImageView;", "createImageView", "(Landroid/content/Context;)Landroid/widget/ImageView;", "Z", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4Resources;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lkotlin/jvm/functions/Function2;", "LWZ/l;", "Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;", "", "containerSizeCache", "Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;", "", "videoPositionCache", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryVideoItemsVisibilityHandler;", "videoItemsVisibilityHandler", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryVideoItemsVisibilityHandler;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4Adapter extends i<GalleryV4VO.Item, GalleryV4ViewHolder<GalleryV4VO.Item>> implements GalleryV4Utils {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BoundedLinkedHashMap<String, Integer> containerSizeCache;

    @NotNull
    private final GalleryV4Resources galleryResources;
    private final boolean isTextureViewEnabled;

    @NotNull
    private final Function2<AtomAction, GallerySyncModel, Unit> onItemClick;

    @NotNull
    private final Function0<Unit> onRenderFirstFrame;

    @NotNull
    private GalleryV4PreCreationConfig preCreationConfig;

    @NotNull
    private final SoundController soundController;

    @NotNull
    private final l tokenizedAnalytics;
    private GalleryVideoItemsVisibilityHandler videoItemsVisibilityHandler;

    @NotNull
    private final Function0<GalleryVideoPlayer> videoPlayerProvider;

    @NotNull
    private final BoundedLinkedHashMap<String, Long> videoPositionCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV4Adapter(@NotNull GalleryV4PreCreationConfig initialPreCreationConfig, @NotNull J lifecycleOwner, boolean z11, @NotNull GalleryV4Resources galleryResources, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<GalleryVideoPlayer> videoPlayerProvider, @NotNull SoundController soundController, @NotNull Function2<? super AtomAction, ? super GallerySyncModel, Unit> onItemClick, @NotNull l tokenizedAnalytics, @NotNull Function0<Unit> onRenderFirstFrame) {
        super(new i.d<GalleryV4VO.Item>() { // from class: ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4Adapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(GalleryV4VO.Item oldItem, GalleryV4VO.Item newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(GalleryV4VO.Item oldItem, GalleryV4VO.Item newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public Object getChangePayload(GalleryV4VO.Item oldItem, GalleryV4VO.Item newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if ((oldItem instanceof GalleryV4VO.Item.Video) && (newItem instanceof GalleryV4VO.Item.Video) && ((GalleryV4VO.Item.Video) oldItem).getVideo().getPlayerState().getCurrentPlayerTime() != ((GalleryV4VO.Item.Video) newItem).getVideo().getPlayerState().getCurrentPlayerTime()) {
                    return GalleryV4ViewHolder.ResetVideoPositionPayload.INSTANCE;
                }
                return null;
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(initialPreCreationConfig, "initialPreCreationConfig");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(galleryResources, "galleryResources");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(videoPlayerProvider, "videoPlayerProvider");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onRenderFirstFrame, "onRenderFirstFrame");
        this.isTextureViewEnabled = z11;
        this.galleryResources = galleryResources;
        this.actionHandler = actionHandler;
        this.videoPlayerProvider = videoPlayerProvider;
        this.soundController = soundController;
        this.onItemClick = onItemClick;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onRenderFirstFrame = onRenderFirstFrame;
        this.containerSizeCache = new BoundedLinkedHashMap<>(0, 0, 3, null);
        this.videoPositionCache = new BoundedLinkedHashMap<>(0, 0, 3, null);
        this.preCreationConfig = initialPreCreationConfig;
        this.videoItemsVisibilityHandler = initialPreCreationConfig.getHasVideoContent() ? new GalleryVideoItemsVisibilityHandler() : null;
    }

    private final ImageView createImageView(Context context) {
        Integer poll;
        GalleryV4ShapeableImageView galleryV4ShapeableImageView = (GalleryV4ShapeableImageView) q.f64554a.i(N.b(GalleryV4ShapeableImageView.class), context);
        if (galleryV4ShapeableImageView == null) {
            galleryV4ShapeableImageView = new GalleryV4ShapeableImageView(context);
        }
        GalleryV4ShapeableImageView galleryV4ShapeableImageView2 = galleryV4ShapeableImageView;
        GalleryV4ShapeableImageView.Companion companion = GalleryV4ShapeableImageView.INSTANCE;
        Queue<Integer> containerWidthQueue = this.preCreationConfig.getContainerWidthQueue();
        return companion.configure(galleryV4ShapeableImageView2, (containerWidthQueue == null || (poll = containerWidthQueue.poll()) == null) ? this.preCreationConfig.getDefaultContainersWidth() : poll.intValue(), this.preCreationConfig.getHeight(), this.galleryResources.getBgRoundItems(), this.galleryResources.getParanja(), this.preCreationConfig.getHasDifferentContainers());
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils
    public int calculateHeight(double d11, @NotNull Context context) {
        return GalleryV4Utils.DefaultImpls.calculateHeight(this, d11, context);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getDefaultGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public int getGalleryPadding() {
        return GalleryV4Utils.DefaultImpls.getGalleryPadding(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxVerticalStateRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinContainerRatio() {
        return GalleryV4Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public float getWavesAmount() {
        return GalleryV4Utils.DefaultImpls.getWavesAmount(this);
    }

    @Override // jk0.i, androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        GalleryVideoItemsVisibilityHandler galleryVideoItemsVisibilityHandler = this.videoItemsVisibilityHandler;
        if (galleryVideoItemsVisibilityHandler != null) {
            galleryVideoItemsVisibilityHandler.onAttach(recyclerView);
        }
    }

    @Override // jk0.i, androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        GalleryVideoItemsVisibilityHandler galleryVideoItemsVisibilityHandler = this.videoItemsVisibilityHandler;
        if (galleryVideoItemsVisibilityHandler != null) {
            galleryVideoItemsVisibilityHandler.onDetach(recyclerView);
        }
    }

    public final void resetVideoPositions() {
        this.videoPositionCache.clear();
        List<GalleryV4VO.Item> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        int i11 = 0;
        for (Object obj : currentList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (((GalleryV4VO.Item) obj) instanceof GalleryV4VO.Item.Video) {
                notifyItemChanged(i11, GalleryV4ViewHolder.ResetVideoPositionPayload.INSTANCE);
            }
            i11 = i12;
        }
    }

    public final void submitList(@NotNull GalleryV4PreCreationConfig preCreationConfig, @NotNull List<? extends GalleryV4VO.Item> list, @NotNull Function0<Unit> submitted) {
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(submitted, "submitted");
        this.preCreationConfig = preCreationConfig;
        submitList(list, new n(submitted, 2));
    }

    public final void updateVideoItems(boolean isForcedAllPause) {
        GalleryVideoItemsVisibilityHandler galleryVideoItemsVisibilityHandler = this.videoItemsVisibilityHandler;
        if (galleryVideoItemsVisibilityHandler != null) {
            galleryVideoItemsVisibilityHandler.updateItems(isForcedAllPause);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((GalleryV4ViewHolder<GalleryV4VO.Item>) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public GalleryV4ViewHolder<GalleryV4VO.Item> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        RecyclerView recyclerView;
        Integer poll;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == GalleryV4VO.ItemViewType.IMAGE.ordinal()) {
            BoundedLinkedHashMap<String, Integer> boundedLinkedHashMap = this.containerSizeCache;
            Function2<AtomAction, GallerySyncModel, Unit> function2 = this.onItemClick;
            l lVar = this.tokenizedAnalytics;
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new GalleryV4ImageVH(createImageView(context), boundedLinkedHashMap, null, function2, lVar, 4, null);
        }
        if (viewType == GalleryV4VO.ItemViewType.WAVE_IMAGE.ordinal()) {
            BoundedLinkedHashMap<String, Integer> boundedLinkedHashMap2 = this.containerSizeCache;
            Function2<AtomAction, GallerySyncModel, Unit> function22 = this.onItemClick;
            l lVar2 = this.tokenizedAnalytics;
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Queue<Integer> containerWidthQueue = this.preCreationConfig.getContainerWidthQueue();
            return new GalleryV4WaveImageVH(new GalleryV4WaveImageView(context2, (containerWidthQueue == null || (poll = containerWidthQueue.poll()) == null) ? this.preCreationConfig.getDefaultContainersWidth() : poll.intValue(), this.preCreationConfig.getHeight(), this.galleryResources.getBgRoundItems(), this.galleryResources.getFgRoundWaveItem(), this.galleryResources.getBgItemsCornerRadius(), this.preCreationConfig.getHasDifferentContainers()), boundedLinkedHashMap2, function22, lVar2);
        }
        if (viewType == GalleryV4VO.ItemViewType.VIDEO.ordinal()) {
            BoundedLinkedHashMap<String, Long> boundedLinkedHashMap3 = this.videoPositionCache;
            Function2<AtomAction, GallerySyncModel, Unit> function23 = this.onItemClick;
            l lVar3 = this.tokenizedAnalytics;
            GalleryVideoItemsVisibilityHandler galleryVideoItemsVisibilityHandler = this.videoItemsVisibilityHandler;
            if (galleryVideoItemsVisibilityHandler == null) {
                galleryVideoItemsVisibilityHandler = new GalleryVideoItemsVisibilityHandler();
                this.videoItemsVisibilityHandler = galleryVideoItemsVisibilityHandler;
                recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                if (recyclerView != null) {
                    galleryVideoItemsVisibilityHandler.onAttach(recyclerView);
                }
            }
            GalleryVideoItemsVisibilityHandler galleryVideoItemsVisibilityHandler2 = galleryVideoItemsVisibilityHandler;
            Function0<GalleryVideoPlayer> function0 = this.videoPlayerProvider;
            SoundController soundController = this.soundController;
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer videoContainerWidth = this.preCreationConfig.getVideoContainerWidth();
            return new GalleryV4VideoVH(new GalleryV4VideoView(context3, videoContainerWidth != null ? videoContainerWidth.intValue() : this.preCreationConfig.getDefaultContainersWidth(), this.preCreationConfig.getHeight(), this.galleryResources.getBgRoundItems(), false, this.isTextureViewEnabled, this.galleryResources.getParanja(), this.preCreationConfig.getHasDifferentContainers()), boundedLinkedHashMap3, soundController, function0, galleryVideoItemsVisibilityHandler2, function23, lVar3, this.onRenderFirstFrame);
        }
        if (viewType == GalleryV4VO.ItemViewType.WAVE_VIDEO.ordinal()) {
            BoundedLinkedHashMap<String, Long> boundedLinkedHashMap4 = this.videoPositionCache;
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            Integer videoContainerWidth2 = this.preCreationConfig.getVideoContainerWidth();
            GalleryV4VideoView galleryV4VideoView = new GalleryV4VideoView(context4, videoContainerWidth2 != null ? videoContainerWidth2.intValue() : this.preCreationConfig.getDefaultContainersWidth(), this.preCreationConfig.getHeight(), this.galleryResources.getBgRoundWaveItems(), true, this.isTextureViewEnabled, this.galleryResources.getParanja(), this.preCreationConfig.getHasDifferentContainers());
            SoundController soundController2 = this.soundController;
            Function0<GalleryVideoPlayer> function02 = this.videoPlayerProvider;
            GalleryVideoItemsVisibilityHandler galleryVideoItemsVisibilityHandler3 = this.videoItemsVisibilityHandler;
            if (galleryVideoItemsVisibilityHandler3 == null) {
                galleryVideoItemsVisibilityHandler3 = new GalleryVideoItemsVisibilityHandler();
                this.videoItemsVisibilityHandler = galleryVideoItemsVisibilityHandler3;
                recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                if (recyclerView != null) {
                    galleryVideoItemsVisibilityHandler3.onAttach(recyclerView);
                }
            }
            return new GalleryV4VideoVH(galleryV4VideoView, boundedLinkedHashMap4, soundController2, function02, galleryVideoItemsVisibilityHandler3, this.onItemClick, this.tokenizedAnalytics, this.onRenderFirstFrame);
        }
        if (viewType == GalleryV4VO.ItemViewType.INFO.ordinal()) {
            l lVar4 = this.tokenizedAnalytics;
            Function1<AtomAction, Unit> function1 = this.actionHandler;
            Context context5 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            Integer infoContainerWidth = this.preCreationConfig.getInfoContainerWidth();
            return new GalleryV4InfoVH(new GalleryV4InfoView(context5, infoContainerWidth != null ? infoContainerWidth.intValue() : this.preCreationConfig.getDefaultContainersWidth(), this.preCreationConfig.getHeight(), this.preCreationConfig.getIsBigStateInfo()), function1, lVar4);
        }
        if (viewType != GalleryV4VO.ItemViewType.UGC.ordinal()) {
            Context context6 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            Integer infoContainerWidth2 = this.preCreationConfig.getInfoContainerWidth();
            return new GalleryV4InfoVH(new GalleryV4InfoView(context6, infoContainerWidth2 != null ? infoContainerWidth2.intValue() : this.preCreationConfig.getDefaultContainersWidth(), this.preCreationConfig.getHeight(), this.preCreationConfig.getIsBigStateInfo()), this.actionHandler, this.tokenizedAnalytics);
        }
        l lVar5 = this.tokenizedAnalytics;
        Function1<AtomAction, Unit> function12 = this.actionHandler;
        Context context7 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        Integer ugcContainerWidth = this.preCreationConfig.getUgcContainerWidth();
        return new GalleryV4UgcVH(new GalleryV4UgcContainerView(context7, ugcContainerWidth != null ? ugcContainerWidth.intValue() : this.preCreationConfig.getDefaultContainersWidth(), this.preCreationConfig.getHeight(), false, 8, null), function12, lVar5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull GalleryV4ViewHolder<GalleryV4VO.Item> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        GalleryV4VO.Item item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    public void onBindViewHolder(@NotNull GalleryV4ViewHolder<GalleryV4VO.Item> holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position);
            return;
        }
        for (Object obj : payloads) {
            if (obj instanceof GalleryV4ViewHolder.ResetVideoPositionPayload) {
                GalleryV4VO.Item item = getItem(position);
                Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
                holder.bind(item, (GalleryV4ViewHolder.ResetVideoPositionPayload) obj);
            }
        }
    }
}
