package ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.view.ContentHiderView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/presentation/ContentHiderWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/presentation/ContentHiderVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/view/ContentHiderView;", "view", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/view/ContentHiderView;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/presentation/ContentHiderVI;Ll20/d;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/view/ContentHiderView;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentHiderWidgetViewHolder extends k<ContentHiderVI> {

    @NotNull
    private final ContentHiderView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentHiderWidgetViewHolder(@NotNull ContentHiderView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ContentHiderVI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.setViewState(new ContentHiderView.ViewState(item.getTopOpticalPartHeight(), item.getBottomOpticalPartHeight(), StyleParser.INSTANCE.parseColor(getContext(), item.getOpticalPartColor(), UniColors.LAYER_FLOOR_1.getResId())));
    }
}
