package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation.adapter;

import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.domain.ImageBadgeListVO;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation.ImageBadgeView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B'\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/adapter/ImageBadgeListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/adapter/ImageBadgeViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/adapter/ImageBadgeViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/adapter/ImageBadgeViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "GenericDiffUtil", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageBadgeListAdapter extends t<ImageBadgeListVO.ImageBadge, ImageBadgeViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/adapter/ImageBadgeListAdapter$GenericDiffUtil;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;)Z", "areContentsTheSame", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class GenericDiffUtil extends i.d<ImageBadgeListVO.ImageBadge> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull ImageBadgeListVO.ImageBadge oldItem, @NotNull ImageBadgeListVO.ImageBadge newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull ImageBadgeListVO.ImageBadge oldItem, @NotNull ImageBadgeListVO.ImageBadge newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getText(), newItem.getText());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageBadgeListAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(new GenericDiffUtil());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ImageBadgeViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ImageBadgeListVO.ImageBadge item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ImageBadgeViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ImageBadgeViewHolder(new ImageBadgeView(context, null, 0, 6, null), new ImageBadgeListAdapter$onCreateViewHolder$1(this), new ImageBadgeListAdapter$onCreateViewHolder$2(this.tokenizedAnalytics));
    }
}
