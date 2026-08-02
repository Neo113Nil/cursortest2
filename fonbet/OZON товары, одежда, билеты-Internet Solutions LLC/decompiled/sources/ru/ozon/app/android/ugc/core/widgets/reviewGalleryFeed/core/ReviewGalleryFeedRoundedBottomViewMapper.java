package ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.core;

import HQ.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.data.ReviewGalleryFeedDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.di.ReviewGalleryFeedComponent;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.presentation.BottomRounderView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.presentation.ReviewGalleryFeedRoundedBottomVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.presentation.ReviewGalleryFeedRoundedBottomViewHolder;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00162\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/core/ReviewGalleryFeedRoundedBottomViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/di/ReviewGalleryFeedComponent;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/data/ReviewGalleryFeedDTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/presentation/ReviewGalleryFeedRoundedBottomVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/data/ReviewGalleryFeedDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/presentation/ReviewGalleryFeedRoundedBottomViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/presentation/ReviewGalleryFeedRoundedBottomViewHolder;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewGalleryFeedRoundedBottomViewMapper extends OverlayWidgetScreenViewItemMapper2<ReviewGalleryFeedComponent, ReviewGalleryFeedDTO, ReviewGalleryFeedRoundedBottomVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BottomRounderView bottomRounderView = new BottomRounderView(context);
        Dimens dimens = Dimens.INSTANCE;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dimens.getDP_40());
        layoutParams.leftMargin = dimens.getDP_8();
        layoutParams.rightMargin = dimens.getDP_8();
        bottomRounderView.setLayoutParams(layoutParams);
        bottomRounderView.setTag(StringProvider.getString(R$string.common_tag_not_affect_offset));
        return bottomRounderView;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof ReviewGalleryFeedDTO) && component().getAppType() != AppType.SELECT;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReviewGalleryFeedComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReviewGalleryFeedComponent.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public ReviewGalleryFeedRoundedBottomViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ReviewGalleryFeedRoundedBottomViewHolder(container, new a(2));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ReviewGalleryFeedRoundedBottomVO> map(@NotNull ReviewGalleryFeedDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(new ReviewGalleryFeedRoundedBottomVO(info.d().hashCode()));
    }
}
