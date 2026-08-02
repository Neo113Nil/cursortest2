package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.ReviewBodyVO;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001c\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/MediaPreviewListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO$MediaVO;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/MediaPreviewListAdapter$MediaPreviewViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/MediaPreviewListAdapter$MediaPreviewViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/MediaPreviewListAdapter$MediaPreviewViewHolder;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onDetachedFromRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "list", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "submitList", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/video/preload/PlayerPreloader;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "MediaPreviewDiffer", "MediaPreviewViewHolder", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaPreviewListAdapter extends t<ReviewBodyVO.MediaVO, MediaPreviewViewHolder> {

    /* renamed from: MediaPreviewDiffer, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private Function1<? super AtomAction, Unit> actionHandler;
    private PlayerPreloader playerPreloader;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/MediaPreviewListAdapter$MediaPreviewDiffer;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO$MediaVO;", "<init>", "()V", "oldItem", "newItem", "", "areContentsTheSame", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO$MediaVO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO$MediaVO;)Z", "areItemsTheSame", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.MediaPreviewListAdapter$MediaPreviewDiffer, reason: from kotlin metadata */
    public static final class Companion extends i.d<ReviewBodyVO.MediaVO> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull ReviewBodyVO.MediaVO oldItem, @NotNull ReviewBodyVO.MediaVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (!Intrinsics.d(oldItem.getPreview(), newItem.getPreview()) || !Intrinsics.d(oldItem.getAction(), newItem.getAction())) {
                return false;
            }
            PreloadVideoInfo videoInfo = oldItem.getVideoInfo();
            String videoUrl = videoInfo != null ? videoInfo.getVideoUrl() : null;
            PreloadVideoInfo videoInfo2 = oldItem.getVideoInfo();
            return Intrinsics.d(videoUrl, videoInfo2 != null ? videoInfo2.getVideoUrl() : null);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull ReviewBodyVO.MediaVO oldItem, @NotNull ReviewBodyVO.MediaVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.hashCode() == newItem.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/MediaPreviewListAdapter$MediaPreviewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewMediaPreviewView;", "previewView", "<init>", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewMediaPreviewView;)V", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewMediaPreviewView;", "getPreviewView", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewMediaPreviewView;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaPreviewViewHolder extends RecyclerView.C {

        @NotNull
        private final ReviewMediaPreviewView previewView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaPreviewViewHolder(@NotNull ReviewMediaPreviewView previewView) {
            super(previewView);
            Intrinsics.checkNotNullParameter(previewView, "previewView");
            this.previewView = previewView;
        }

        @NotNull
        public final ReviewMediaPreviewView getPreviewView() {
            return this.previewView;
        }
    }

    public MediaPreviewListAdapter() {
        super(INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.actionHandler = null;
        this.playerPreloader = null;
    }

    public final void submitList(List<ReviewBodyVO.MediaVO> list, @NotNull Function1<? super AtomAction, Unit> actionHandler, PlayerPreloader playerPreloader) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.playerPreloader = playerPreloader;
        super.submitList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull MediaPreviewViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReviewMediaPreviewView previewView = holder.getPreviewView();
        ReviewBodyVO.MediaVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        previewView.bind(item, this.actionHandler, this.playerPreloader);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public MediaPreviewViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ReviewMediaPreviewView reviewMediaPreviewView = new ReviewMediaPreviewView(context);
        reviewMediaPreviewView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new MediaPreviewViewHolder(reviewMediaPreviewView);
    }
}
