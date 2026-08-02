package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import Sc.o;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.ArrayList;
import java.util.List;
import jk0.d;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.viewholders.ImageViewHolder;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.viewholders.MoreViewHolder;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.viewholders.VideoViewHolder;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u001b\u0010'\u001a\u00020\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\u0004\b'\u0010(R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020%0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesAdapter;", "Ljk0/d;", "Ljk0/j;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/VideoPlaybackManager;", "videoPlaybackManager", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/video/playerV2/videoController/VideoController;Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/VideoPlaybackManager;LWZ/l;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onBindViewHolder", "(Ljk0/j;I)V", "onViewRecycled", "(Ljk0/j;)V", "", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content;", "items", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/VideoPlaybackManager;", "LWZ/l;", "", "tiles", "Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewTilesAdapter extends d<j> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final List<ReviewTilesVO.Content> tiles;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final VideoController videoController;

    @NotNull
    private final VideoPlaybackManager videoPlaybackManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReviewTilesAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull PlayerPreloader playerPreloader, @NotNull VideoController videoController, @NotNull VideoPlaybackManager videoPlaybackManager, @NotNull l tokenizedAnalytics) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        Intrinsics.checkNotNullParameter(videoPlaybackManager, "videoPlaybackManager");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.actionHandler = actionHandler;
        this.playerPreloader = playerPreloader;
        this.videoController = videoController;
        this.videoPlaybackManager = videoPlaybackManager;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.tiles = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.tiles.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ReviewTilesVO.Content content = this.tiles.get(position);
        if (content instanceof ReviewTilesVO.Content.More) {
            return 3;
        }
        if (content instanceof ReviewTilesVO.Content.Media.Image) {
            return 1;
        }
        if (content instanceof ReviewTilesVO.Content.Media.Video) {
            return 2;
        }
        throw new o();
    }

    public final void submitList(@NotNull List<? extends ReviewTilesVO.Content> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.tiles.clear();
        this.tiles.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReviewTilesVO.Content content = this.tiles.get(position);
        if (holder instanceof MoreViewHolder) {
            ReviewTilesVO.Content.More more = content instanceof ReviewTilesVO.Content.More ? (ReviewTilesVO.Content.More) content : null;
            if (more != null) {
                ((MoreViewHolder) holder).bind(more, this.actionHandler);
                return;
            }
            return;
        }
        if (holder instanceof ImageViewHolder) {
            ReviewTilesVO.Content.Media.Image image = content instanceof ReviewTilesVO.Content.Media.Image ? (ReviewTilesVO.Content.Media.Image) content : null;
            if (image != null) {
                ((ImageViewHolder) holder).bind(image, this.actionHandler);
                return;
            }
            return;
        }
        if (holder instanceof VideoViewHolder) {
            ReviewTilesVO.Content.Media.Video video = content instanceof ReviewTilesVO.Content.Media.Video ? (ReviewTilesVO.Content.Media.Video) content : null;
            if (video != null) {
                ((VideoViewHolder) holder).bind(video, this.actionHandler);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new ImageViewHolder(new ReviewTilesView(context), this.tokenizedAnalytics);
        }
        if (viewType == 2) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new VideoViewHolder(new ReviewTilesView(context2), new ReviewTilesVideoDelegate(this.videoController), this.playerPreloader, this.videoPlaybackManager, this.tokenizedAnalytics);
        }
        if (viewType == 3) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return new MoreViewHolder(new MoreViewWrapper(context3));
        }
        throw new IllegalArgumentException("Unknown viewType=" + viewType + " in " + ReviewTilesAdapter.class);
    }

    @Override // jk0.d, androidx.recyclerview.widget.RecyclerView.g
    public void onViewRecycled(@NotNull j holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled((ReviewTilesAdapter) holder);
        if (holder instanceof VideoViewHolder) {
            this.videoPlaybackManager.onViewRecycled((VideoViewHolder) holder);
        }
    }
}
