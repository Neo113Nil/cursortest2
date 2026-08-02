package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views;

import WZ.l;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.J;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.R$layout;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModel;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u00013BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001c\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b\u001c\u0010!J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemViewHolder;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBar;", "progressBar", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "previewWithPreloadVideoClickAction", "<init>", "(Landroidx/lifecycle/J;Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBar;Lru/ozon/app/android/video/playerV2/videoController/VideoController;Lkotlin/jvm/functions/Function1;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemViewHolder;ILjava/util/List;)V", "getItemViewType", "(I)I", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onDetachedFromRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBar;", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModel;", "mediaCentricViewModel", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModel;", "getMediaCentricViewModel", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModel;", "setMediaCentricViewModel", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModel;)V", "Type", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricItemsAdapter extends i<MediaCentricVO.MediaItemVO, MediaCentricItemViewHolder<MediaCentricVO.MediaItemVO>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private MediaCentricViewModel mediaCentricViewModel;

    @NotNull
    private final Function1<PreloadVideoInfo, Unit> previewWithPreloadVideoClickAction;

    @NotNull
    private final MediaCentricProgressBar progressBar;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final VideoController videoController;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemsAdapter$Type;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "VIDEO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type IMAGE = new Type("IMAGE", 0);
        public static final Type VIDEO = new Type("VIDEO", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{IMAGE, VIDEO};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaCentricItemsAdapter(@NotNull J containerViewLifecycleOwner, @NotNull MediaCentricProgressBar progressBar, @NotNull VideoController videoController, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull Function1<? super PreloadVideoInfo, Unit> previewWithPreloadVideoClickAction) {
        super(MediaCentricItemsDiffer.INSTANCE, containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(previewWithPreloadVideoClickAction, "previewWithPreloadVideoClickAction");
        this.progressBar = progressBar;
        this.videoController = videoController;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.previewWithPreloadVideoClickAction = previewWithPreloadVideoClickAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return (getItem(position) instanceof MediaCentricVO.MediaItemVO.Image ? Type.IMAGE : Type.VIDEO).ordinal();
    }

    @Override // jk0.i, androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.mediaCentricViewModel = null;
    }

    public final void setMediaCentricViewModel(MediaCentricViewModel mediaCentricViewModel) {
        this.mediaCentricViewModel = mediaCentricViewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((MediaCentricItemViewHolder<MediaCentricVO.MediaItemVO>) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public MediaCentricItemViewHolder<MediaCentricVO.MediaItemVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == Type.IMAGE.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Image image = new Image(context, null, 0, 6, null);
            image.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
            return new MediaCentricImageViewHolder(image, this.actionHandler, this.tokenizedAnalytics);
        }
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.view_video_molecule_player, parent, false);
        Intrinsics.g(inflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
        PlayerView playerView = (PlayerView) inflate;
        playerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        playerView.C(4);
        playerView.setClickable(false);
        playerView.setFocusable(false);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Image image2 = new Image(context2, null, 0, 6, null);
        image2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        image2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image2.setZ(1.0f);
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        frameLayout.setBackgroundColor(androidx.core.content.a.getColor(frameLayout.getContext(), UniColors.LAYER_SURFACE.getResId()));
        frameLayout.addView(playerView);
        frameLayout.addView(image2);
        MediaCentricViewModel mediaCentricViewModel = this.mediaCentricViewModel;
        MediaCentricProgressBar mediaCentricProgressBar = this.progressBar;
        VideoController videoController = this.videoController;
        Function1<AtomAction, Unit> function1 = this.actionHandler;
        return new MediaCentricVideoViewHolder(mediaCentricViewModel, mediaCentricProgressBar, image2, playerView, videoController, this.previewWithPreloadVideoClickAction, this.tokenizedAnalytics, function1, frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull MediaCentricItemViewHolder<MediaCentricVO.MediaItemVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MediaCentricVO.MediaItemVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    public void onBindViewHolder(@NotNull MediaCentricItemViewHolder<MediaCentricVO.MediaItemVO> holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position);
            return;
        }
        MediaCentricVO.MediaItemVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, payloads);
    }
}
