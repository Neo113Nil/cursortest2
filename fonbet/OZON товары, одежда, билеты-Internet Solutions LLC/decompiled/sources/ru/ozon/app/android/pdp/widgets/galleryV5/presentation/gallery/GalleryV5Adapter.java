package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery;

import E.V;
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
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5ShapeableImageView;
import ru.ozon.app.android.pdp.utils.BoundedLinkedHashMap;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5Resources;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.GalleryV5ViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.GalleryV5ImageVH;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.GalleryV5WaveImageVH;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.GalleryV5WaveImageView;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.GalleryV5ZoomConfig;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.info.GalleryV5InfoVH;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.info.GalleryV5InfoView;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.ugc.GalleryV5UgcContainerView;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.ugc.GalleryV5UgcVH;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.video.GalleryV5VideoVH;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.video.GalleryV5VideoView;
import ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u00012\u00020\u0004B±\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\r\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%J%\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u0010.J%\u00101\u001a\u00020\u000f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u00102J3\u00101\u001a\u00020\u000f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010#\u001a\u00020\u001c2\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0016¢\u0006\u0004\b1\u00106J1\u0010;\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u00052\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u0002082\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\t¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u000f¢\u0006\u0004\b@\u0010AJ\u0017\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010GR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010HR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010IR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010JR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010KR&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010LR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010MR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010JR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010IR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010IR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010NR \u0010R\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020Q0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u00107\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5Adapter;", "Ljk0/i;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV5/utils/GalleryV5Utils;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "initialPreCreationConfig", "Landroidx/lifecycle/J;", "lifecycleOwner", "", "isTextureViewEnabled", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "galleryResources", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "onItemClick", "LWZ/l;", "tokenizedAnalytics", "onRenderFirstFrame", "", "isViewFullVisible", "onGalleryElementsVisible", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;Landroidx/lifecycle/J;ZLru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;Lkotlin/jvm/functions/Function2;LWZ/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;)V", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromRecyclerView", "holder", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5ViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5ViewHolder;ILjava/util/List;)V", "preCreationConfig", "", "list", "submitted", "submitList", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "isForcedAllPause", "updateVideoItems", "(Z)V", "resetVideoPositions", "()V", "Landroid/content/Context;", "context", "Landroid/widget/ImageView;", "createImageView", "(Landroid/content/Context;)Landroid/widget/ImageView;", "Z", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lkotlin/jvm/functions/Function2;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;", "", "", "videoPositionCache", "Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5VideoItemsVisibilityHandler;", "videoItemsVisibilityHandler", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5VideoItemsVisibilityHandler;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5Adapter extends i<GalleryV5VO.Item, GalleryV5ViewHolder<GalleryV5VO.Item>> implements GalleryV5Utils {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final GalleryV5Resources galleryResources;
    private final boolean isTextureViewEnabled;

    @NotNull
    private final Function1<Integer, Boolean> isViewFullVisible;

    @NotNull
    private final Function1<Boolean, Unit> onGalleryElementsVisible;

    @NotNull
    private final Function2<AtomAction, GallerySyncModel, Unit> onItemClick;

    @NotNull
    private final Function0<Unit> onRenderFirstFrame;

    @NotNull
    private GalleryV5PreCreationConfig preCreationConfig;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SoundController soundController;

    @NotNull
    private final l tokenizedAnalytics;
    private GalleryV5VideoItemsVisibilityHandler videoItemsVisibilityHandler;

    @NotNull
    private final Function0<GalleryVideoPlayer> videoPlayerProvider;

    @NotNull
    private final BoundedLinkedHashMap<String, Long> videoPositionCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV5Adapter(@NotNull GalleryV5PreCreationConfig initialPreCreationConfig, @NotNull J lifecycleOwner, boolean z11, @NotNull GalleryV5Resources galleryResources, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<GalleryVideoPlayer> videoPlayerProvider, @NotNull SoundController soundController, @NotNull Function2<? super AtomAction, ? super GallerySyncModel, Unit> onItemClick, @NotNull l tokenizedAnalytics, @NotNull Function0<Unit> onRenderFirstFrame, @NotNull Function1<? super Integer, Boolean> isViewFullVisible, @NotNull Function1<? super Boolean, Unit> onGalleryElementsVisible, @NotNull ComposerReferences refs) {
        super(new i.d<GalleryV5VO.Item>() { // from class: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.GalleryV5Adapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(GalleryV5VO.Item oldItem, GalleryV5VO.Item newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(GalleryV5VO.Item oldItem, GalleryV5VO.Item newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public Object getChangePayload(GalleryV5VO.Item oldItem, GalleryV5VO.Item newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if ((oldItem instanceof GalleryV5VO.Item.Video) && (newItem instanceof GalleryV5VO.Item.Video) && ((GalleryV5VO.Item.Video) oldItem).getVideo().getPlayerState().getCurrentPlayerTime() != ((GalleryV5VO.Item.Video) newItem).getVideo().getPlayerState().getCurrentPlayerTime()) {
                    return GalleryV5ViewHolder.ResetVideoPositionPayload.INSTANCE;
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
        Intrinsics.checkNotNullParameter(isViewFullVisible, "isViewFullVisible");
        Intrinsics.checkNotNullParameter(onGalleryElementsVisible, "onGalleryElementsVisible");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.isTextureViewEnabled = z11;
        this.galleryResources = galleryResources;
        this.actionHandler = actionHandler;
        this.videoPlayerProvider = videoPlayerProvider;
        this.soundController = soundController;
        this.onItemClick = onItemClick;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onRenderFirstFrame = onRenderFirstFrame;
        this.isViewFullVisible = isViewFullVisible;
        this.onGalleryElementsVisible = onGalleryElementsVisible;
        this.refs = refs;
        int i11 = 0;
        this.videoPositionCache = new BoundedLinkedHashMap<>(i11, i11, 3, 0 == true ? 1 : 0);
        this.preCreationConfig = initialPreCreationConfig;
        this.videoItemsVisibilityHandler = initialPreCreationConfig.getHasVideoContent() ? new GalleryV5VideoItemsVisibilityHandler() : null;
    }

    private final ImageView createImageView(Context context) {
        Integer poll;
        GalleryV5ShapeableImageView galleryV5ShapeableImageView = (GalleryV5ShapeableImageView) q.f64554a.i(N.b(GalleryV5ShapeableImageView.class), context);
        if (galleryV5ShapeableImageView == null) {
            galleryV5ShapeableImageView = new GalleryV5ShapeableImageView(context);
        }
        GalleryV5ShapeableImageView galleryV5ShapeableImageView2 = galleryV5ShapeableImageView;
        GalleryV5ShapeableImageView.Companion companion = GalleryV5ShapeableImageView.INSTANCE;
        Queue<Integer> containerWidthQueue = this.preCreationConfig.getContainerWidthQueue();
        return companion.configure(galleryV5ShapeableImageView2, (containerWidthQueue == null || (poll = containerWidthQueue.poll()) == null) ? this.preCreationConfig.getDefaultContainersWidth() : poll.intValue(), this.preCreationConfig.getHeight(), this.galleryResources.getBgRoundItems(), this.galleryResources.getParanja(), this.preCreationConfig.getHasDifferentContainers(), this.preCreationConfig.getIsSelect());
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils
    public int calculateHeight(Double d11, @NotNull Context context, double d12) {
        return GalleryV5Utils.DefaultImpls.calculateHeight(this, d11, context, d12);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getDefaultGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxVerticalStateRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinContainerRatio() {
        return GalleryV5Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public float getWavesAmount() {
        return GalleryV5Utils.DefaultImpls.getWavesAmount(this);
    }

    @Override // jk0.i, androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        GalleryV5VideoItemsVisibilityHandler galleryV5VideoItemsVisibilityHandler = this.videoItemsVisibilityHandler;
        if (galleryV5VideoItemsVisibilityHandler != null) {
            galleryV5VideoItemsVisibilityHandler.onAttach(recyclerView);
        }
    }

    @Override // jk0.i, androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        GalleryV5VideoItemsVisibilityHandler galleryV5VideoItemsVisibilityHandler = this.videoItemsVisibilityHandler;
        if (galleryV5VideoItemsVisibilityHandler != null) {
            galleryV5VideoItemsVisibilityHandler.onDetach(recyclerView);
        }
    }

    public final void resetVideoPositions() {
        this.videoPositionCache.clear();
        List<GalleryV5VO.Item> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        int i11 = 0;
        for (Object obj : currentList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (((GalleryV5VO.Item) obj) instanceof GalleryV5VO.Item.Video) {
                notifyItemChanged(i11, GalleryV5ViewHolder.ResetVideoPositionPayload.INSTANCE);
            }
            i11 = i12;
        }
    }

    public final void submitList(@NotNull GalleryV5PreCreationConfig preCreationConfig, @NotNull List<? extends GalleryV5VO.Item> list, @NotNull Function0<Unit> submitted) {
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(submitted, "submitted");
        this.preCreationConfig = preCreationConfig;
        submitList(list, new V(submitted, 1));
    }

    public final void updateVideoItems(boolean isForcedAllPause) {
        GalleryV5VideoItemsVisibilityHandler galleryV5VideoItemsVisibilityHandler = this.videoItemsVisibilityHandler;
        if (galleryV5VideoItemsVisibilityHandler != null) {
            galleryV5VideoItemsVisibilityHandler.updateItems(isForcedAllPause);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((GalleryV5ViewHolder<GalleryV5VO.Item>) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public GalleryV5ViewHolder<GalleryV5VO.Item> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Integer poll;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == GalleryV5VO.ItemViewType.IMAGE.ordinal()) {
            Function2<AtomAction, GallerySyncModel, Unit> function2 = this.onItemClick;
            l lVar = this.tokenizedAnalytics;
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new GalleryV5ImageVH(createImageView(context), function2, lVar, this.preCreationConfig.getIsZoomable() ? new GalleryV5ZoomConfig(this.isViewFullVisible, this.onGalleryElementsVisible, this.preCreationConfig.getIsSelect()) : null, this.refs);
        }
        if (viewType == GalleryV5VO.ItemViewType.WAVE_IMAGE.ordinal()) {
            Function2<AtomAction, GallerySyncModel, Unit> function22 = this.onItemClick;
            l lVar2 = this.tokenizedAnalytics;
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Queue<Integer> containerWidthQueue = this.preCreationConfig.getContainerWidthQueue();
            int defaultContainersWidth = (containerWidthQueue == null || (poll = containerWidthQueue.poll()) == null) ? this.preCreationConfig.getDefaultContainersWidth() : poll.intValue();
            int height = this.preCreationConfig.getHeight();
            GalleryV5Resources galleryV5Resources = this.galleryResources;
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return new GalleryV5WaveImageVH(new GalleryV5WaveImageView(context2, defaultContainersWidth, height, galleryV5Resources.getOrCreateBgWaveItems(context3, this.preCreationConfig.getIsSelect()), this.galleryResources.getParanja(), this.galleryResources.getBgItemsCornerRadius(), this.preCreationConfig.getHasDifferentContainers()), function22, lVar2, this.preCreationConfig.getIsZoomable() ? new GalleryV5ZoomConfig(this.isViewFullVisible, this.onGalleryElementsVisible, this.preCreationConfig.getIsSelect()) : null, this.refs);
        }
        if (viewType == GalleryV5VO.ItemViewType.VIDEO.ordinal()) {
            BoundedLinkedHashMap<String, Long> boundedLinkedHashMap = this.videoPositionCache;
            Function2<AtomAction, GallerySyncModel, Unit> function23 = this.onItemClick;
            l lVar3 = this.tokenizedAnalytics;
            GalleryV5VideoItemsVisibilityHandler galleryV5VideoItemsVisibilityHandler = this.videoItemsVisibilityHandler;
            if (galleryV5VideoItemsVisibilityHandler == null) {
                galleryV5VideoItemsVisibilityHandler = new GalleryV5VideoItemsVisibilityHandler();
                this.videoItemsVisibilityHandler = galleryV5VideoItemsVisibilityHandler;
                RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                if (recyclerView != null) {
                    galleryV5VideoItemsVisibilityHandler.onAttach(recyclerView);
                }
            }
            GalleryV5VideoItemsVisibilityHandler galleryV5VideoItemsVisibilityHandler2 = galleryV5VideoItemsVisibilityHandler;
            Function0<GalleryVideoPlayer> function0 = this.videoPlayerProvider;
            SoundController soundController = this.soundController;
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            Integer videoContainerWidth = this.preCreationConfig.getVideoContainerWidth();
            return new GalleryV5VideoVH(new GalleryV5VideoView(context4, videoContainerWidth != null ? videoContainerWidth.intValue() : this.preCreationConfig.getDefaultContainersWidth(), this.preCreationConfig.getHeight(), this.galleryResources.getBgRoundItems(), false, this.isTextureViewEnabled, this.galleryResources.getParanja(), this.preCreationConfig.getHasDifferentContainers()), boundedLinkedHashMap, soundController, function0, galleryV5VideoItemsVisibilityHandler2, function23, lVar3, this.onRenderFirstFrame);
        }
        if (viewType != GalleryV5VO.ItemViewType.WAVE_VIDEO.ordinal()) {
            if (viewType == GalleryV5VO.ItemViewType.INFO.ordinal()) {
                l lVar4 = this.tokenizedAnalytics;
                Function1<AtomAction, Unit> function1 = this.actionHandler;
                Context context5 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                Integer infoContainerWidth = this.preCreationConfig.getInfoContainerWidth();
                return new GalleryV5InfoVH(new GalleryV5InfoView(context5, infoContainerWidth != null ? infoContainerWidth.intValue() : this.preCreationConfig.getDefaultContainersWidth(), this.preCreationConfig.getHeight(), this.preCreationConfig.getIsBigStateInfo()), function1, lVar4);
            }
            if (viewType != GalleryV5VO.ItemViewType.UGC.ordinal()) {
                Context context6 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                Integer infoContainerWidth2 = this.preCreationConfig.getInfoContainerWidth();
                return new GalleryV5InfoVH(new GalleryV5InfoView(context6, infoContainerWidth2 != null ? infoContainerWidth2.intValue() : this.preCreationConfig.getDefaultContainersWidth(), this.preCreationConfig.getHeight(), this.preCreationConfig.getIsBigStateInfo()), this.actionHandler, this.tokenizedAnalytics);
            }
            l lVar5 = this.tokenizedAnalytics;
            Function1<AtomAction, Unit> function12 = this.actionHandler;
            Context context7 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            Integer ugcContainerWidth = this.preCreationConfig.getUgcContainerWidth();
            return new GalleryV5UgcVH(new GalleryV5UgcContainerView(context7, ugcContainerWidth != null ? ugcContainerWidth.intValue() : this.preCreationConfig.getDefaultContainersWidth(), this.preCreationConfig.getHeight(), false, 8, null), function12, lVar5);
        }
        BoundedLinkedHashMap<String, Long> boundedLinkedHashMap2 = this.videoPositionCache;
        Context context8 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        Integer videoContainerWidth2 = this.preCreationConfig.getVideoContainerWidth();
        int intValue = videoContainerWidth2 != null ? videoContainerWidth2.intValue() : this.preCreationConfig.getDefaultContainersWidth();
        int height2 = this.preCreationConfig.getHeight();
        GalleryV5Resources galleryV5Resources2 = this.galleryResources;
        Context context9 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        GalleryV5VideoView galleryV5VideoView = new GalleryV5VideoView(context8, intValue, height2, galleryV5Resources2.getOrCreateBgWaveItems(context9, this.preCreationConfig.getIsSelect()), true, this.isTextureViewEnabled, this.galleryResources.getParanja(), this.preCreationConfig.getHasDifferentContainers());
        SoundController soundController2 = this.soundController;
        Function0<GalleryVideoPlayer> function02 = this.videoPlayerProvider;
        GalleryV5VideoItemsVisibilityHandler galleryV5VideoItemsVisibilityHandler3 = this.videoItemsVisibilityHandler;
        if (galleryV5VideoItemsVisibilityHandler3 == null) {
            galleryV5VideoItemsVisibilityHandler3 = new GalleryV5VideoItemsVisibilityHandler();
            this.videoItemsVisibilityHandler = galleryV5VideoItemsVisibilityHandler3;
            RecyclerView recyclerView2 = parent instanceof RecyclerView ? (RecyclerView) parent : null;
            if (recyclerView2 != null) {
                galleryV5VideoItemsVisibilityHandler3.onAttach(recyclerView2);
            }
        }
        return new GalleryV5VideoVH(galleryV5VideoView, boundedLinkedHashMap2, soundController2, function02, galleryV5VideoItemsVisibilityHandler3, this.onItemClick, this.tokenizedAnalytics, this.onRenderFirstFrame);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull GalleryV5ViewHolder<GalleryV5VO.Item> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        GalleryV5VO.Item item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    public void onBindViewHolder(@NotNull GalleryV5ViewHolder<GalleryV5VO.Item> holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position);
            return;
        }
        for (Object obj : payloads) {
            if (obj instanceof GalleryV5ViewHolder.ResetVideoPositionPayload) {
                GalleryV5VO.Item item = getItem(position);
                Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
                holder.bind(item, (GalleryV5ViewHolder.ResetVideoPositionPayload) obj);
            }
        }
    }
}
