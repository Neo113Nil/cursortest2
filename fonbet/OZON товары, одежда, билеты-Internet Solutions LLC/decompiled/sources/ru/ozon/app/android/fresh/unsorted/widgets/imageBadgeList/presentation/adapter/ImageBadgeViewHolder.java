package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation.adapter;

import WZ.t;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.domain.ImageBadgeListVO;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation.ImageBadgeView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R*\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/adapter/ImageBadgeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/ImageBadgeView;", "view", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "", "onClick", "Lkotlin/Function1;", "onView", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/ImageBadgeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;", "item", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/ImageBadgeView;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageBadgeViewHolder extends RecyclerView.C {

    @NotNull
    private final Function2<AtomAction, t, Unit> onClick;

    @NotNull
    private final Function1<t, Unit> onView;

    @NotNull
    private final ImageBadgeView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageBadgeViewHolder(@NotNull ImageBadgeView view, @NotNull Function2<? super AtomAction, ? super t, Unit> onClick, @NotNull Function1<? super t, Unit> onView) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onView, "onView");
        this.view = view;
        this.onClick = onClick;
        this.onView = onView;
    }

    public final void bind(@NotNull ImageBadgeListVO.ImageBadge item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bind(item, this.onClick);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            this.onView.invoke(tokenizedEvent);
        }
    }
}
