package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.BadgeListVO;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/adapter/SkeletonsViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/adapter/ItemViewHolder;", "view", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "<init>", "(Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "dpf6", "", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$Item;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SkeletonsViewHolder extends ItemViewHolder {
    private final Context context;
    private final float dpf6;

    @NotNull
    private final RoundedShimmerView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonsViewHolder(@NotNull RoundedShimmerView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        Context context = view.getContext();
        this.context = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.dpf6 = ResourceExtKt.toPxF(6, context);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.adapter.ItemViewHolder
    public void bind(@NotNull BadgeListVO.Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof BadgeListVO.Skeleton) {
            RoundedShimmerView roundedShimmerView = this.view;
            ViewGroup.LayoutParams layoutParams = roundedShimmerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            BadgeListVO.Skeleton skeleton = (BadgeListVO.Skeleton) item;
            int width = skeleton.getWidth();
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            layoutParams.width = UiExtKt.toPx(width, context);
            int height = skeleton.getHeight();
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            layoutParams.height = UiExtKt.toPx(height, context2);
            roundedShimmerView.setLayoutParams(layoutParams);
            this.view.setCornerRadius(this.dpf6);
        }
    }
}
