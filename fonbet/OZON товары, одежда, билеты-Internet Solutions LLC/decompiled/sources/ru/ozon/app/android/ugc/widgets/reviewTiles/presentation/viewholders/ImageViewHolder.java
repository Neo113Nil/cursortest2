package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.viewholders;

import AE.a;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.ReviewTilesView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/viewholders/ImageViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesView;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesView;LWZ/l;)V", "", "onViewInOverlapBounds", "()V", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media$Image;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media$Image;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesView;", "getView", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesView;", "LWZ/l;", "currentItem", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media$Image;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageViewHolder extends j {
    private ReviewTilesVO.Content.Media.Image currentItem;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ReviewTilesView view;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewHolder(@NotNull ReviewTilesView view, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(ReviewTilesVO.Content.Media.Image image, Function1 function1, View view) {
        AtomAction action = image.getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    public final void bind(@NotNull ReviewTilesVO.Content.Media.Image item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.currentItem = item;
        ReviewTilesView reviewTilesView = this.view;
        ViewGroup.LayoutParams layoutParams = reviewTilesView.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = layoutParams.width;
        layoutParams.width = item.getSize().e().intValue();
        int intValue = item.getSize().f().intValue();
        layoutParams.height = intValue;
        if (i11 != intValue || i12 != layoutParams.width) {
            reviewTilesView.setLayoutParams(layoutParams);
        }
        reviewTilesView.bind(item);
        reviewTilesView.setOnClickListener(new a(1, item, actionHandler));
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        t tokenizedEvent;
        super.onViewInOverlapBounds();
        ReviewTilesVO.Content.Media.Image image = this.currentItem;
        if (image == null || (tokenizedEvent = image.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
