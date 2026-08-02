package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.presentation.title;

import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/presentation/title/TravelCellListV2TitleWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/presentation/title/TravelCellListV2TitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/presentation/title/TravelCellListV2TitleVO;Ll20/d;)V", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTextView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "descriptionView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCellListV2TitleWidgetViewHolder extends k<TravelCellListV2TitleVO> {
    public static final int $stable = TextAtomView.$stable;
    private final TextAtomView descriptionView;
    private final TextAtomView titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCellListV2TitleWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        LinearLayout linearLayout = containerView instanceof LinearLayout ? (LinearLayout) containerView : null;
        View view = linearLayout != null ? ViewGroupExtKt.get(linearLayout, 0) : null;
        this.titleTextView = view instanceof TextAtomView ? (TextAtomView) view : null;
        KeyEvent.Callback callback = linearLayout != null ? ViewGroupExtKt.get(linearLayout, 1) : null;
        this.descriptionView = callback instanceof TextAtomView ? (TextAtomView) callback : null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelCellListV2TitleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView textAtomView = this.titleTextView;
        if (textAtomView != null) {
            TextAtomHolderKt.bindOrGone$default(textAtomView, item.getTitle(), null, 2, null);
        }
        TextAtomView textAtomView2 = this.descriptionView;
        if (textAtomView2 != null) {
            TextAtomHolderKt.bindOrGone$default(textAtomView2, item.getDescription(), null, 2, null);
        }
    }
}
