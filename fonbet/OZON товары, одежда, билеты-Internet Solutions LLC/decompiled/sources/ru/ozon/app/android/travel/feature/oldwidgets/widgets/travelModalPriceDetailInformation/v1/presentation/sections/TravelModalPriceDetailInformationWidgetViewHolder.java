package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.presentation.sections;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.travel.feature.oldwidgets.databinding.ViewTravelModalPriceDetailInformationPositionBinding;
import ru.ozon.app.android.travel.feature.oldwidgets.databinding.ViewTravelModalPriceDetailInformationPositionItemBinding;
import ru.ozon.app.android.travel.feature.oldwidgets.databinding.WidgetTravelModalPriceDetailInformationBinding;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.presentation.sections.TravelModalPriceDetailInformationVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010%\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO;", "positionVO", "Landroid/view/ViewGroup;", "container", "", "inflateAndBindPositionView", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO;Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO$PositionItemVO;", "itemVO", "inflateAndBindPositionItemView", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO$PositionItemVO;Landroid/view/ViewGroup;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/oldwidgets/databinding/WidgetTravelModalPriceDetailInformationBinding;", "binding", "Lru/ozon/app/android/travel/feature/oldwidgets/databinding/WidgetTravelModalPriceDetailInformationBinding;", "", "positionTopMargin", "I", "positionItemTopMargin", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "layoutInflater", "Landroid/view/LayoutInflater;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelModalPriceDetailInformationWidgetViewHolder extends k<TravelModalPriceDetailInformationVO> {

    @NotNull
    private final WidgetTravelModalPriceDetailInformationBinding binding;

    @NotNull
    private final View containerView;
    private final LayoutInflater layoutInflater;
    private final int positionItemTopMargin;
    private final int positionTopMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelModalPriceDetailInformationWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetTravelModalPriceDetailInformationBinding bind = WidgetTravelModalPriceDetailInformationBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.positionTopMargin = ResourceExtKt.toPx(16, getContext());
        this.positionItemTopMargin = ResourceExtKt.toPx(12, getContext());
        this.layoutInflater = LayoutInflater.from(getContext());
        bind.getConstraintLayout().setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
    }

    private final void inflateAndBindPositionItemView(TravelModalPriceDetailInformationVO.PositionVO.PositionItemVO itemVO, ViewGroup container) {
        ViewTravelModalPriceDetailInformationPositionItemBinding inflate = ViewTravelModalPriceDetailInformationPositionItemBinding.inflate(this.layoutInflater, container, true);
        LinearLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = this.positionItemTopMargin;
        constraintLayout.setLayoutParams(marginLayoutParams);
        inflate.itemNameTV.setText(itemVO.getItemName());
        inflate.itemPriceTV.setText(itemVO.getItemPrice());
    }

    private final void inflateAndBindPositionView(TravelModalPriceDetailInformationVO.PositionVO positionVO, ViewGroup container) {
        boolean z11 = true;
        ViewTravelModalPriceDetailInformationPositionBinding inflate = ViewTravelModalPriceDetailInformationPositionBinding.inflate(this.layoutInflater, container, true);
        ConstraintLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = this.positionTopMargin;
        constraintLayout.setLayoutParams(marginLayoutParams);
        inflate.positionNameTV.setText(positionVO.getPositionName());
        TextView positionPriceTV = inflate.positionPriceTV;
        Intrinsics.checkNotNullExpressionValue(positionPriceTV, "positionPriceTV");
        TextViewExtKt.setTextOrGone(positionPriceTV, positionVO.getPositionPrice());
        inflate.itemsContainerLL.removeAllViews();
        LinearLayout itemsContainerLL = inflate.itemsContainerLL;
        Intrinsics.checkNotNullExpressionValue(itemsContainerLL, "itemsContainerLL");
        List<TravelModalPriceDetailInformationVO.PositionVO.PositionItemVO> positionItems = positionVO.getPositionItems();
        if (positionItems != null && !positionItems.isEmpty()) {
            z11 = false;
        }
        itemsContainerLL.setVisibility(z11 ? 8 : 0);
        List<TravelModalPriceDetailInformationVO.PositionVO.PositionItemVO> positionItems2 = positionVO.getPositionItems();
        if (positionItems2 != null) {
            for (TravelModalPriceDetailInformationVO.PositionVO.PositionItemVO positionItemVO : positionItems2) {
                LinearLayout itemsContainerLL2 = inflate.itemsContainerLL;
                Intrinsics.checkNotNullExpressionValue(itemsContainerLL2, "itemsContainerLL");
                inflateAndBindPositionItemView(positionItemVO, itemsContainerLL2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelModalPriceDetailInformationVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.sectionNameTV.setText(item.getSectionName());
        this.binding.sectionPriceTV.setText(item.getSectionPrice());
        TextView sectionSubtitleTV = this.binding.sectionSubtitleTV;
        Intrinsics.checkNotNullExpressionValue(sectionSubtitleTV, "sectionSubtitleTV");
        TextViewExtKt.setTextOrGone(sectionSubtitleTV, item.getSectionSubtitle());
        this.binding.positionsContainerLL.removeAllViews();
        LinearLayout positionsContainerLL = this.binding.positionsContainerLL;
        Intrinsics.checkNotNullExpressionValue(positionsContainerLL, "positionsContainerLL");
        List<TravelModalPriceDetailInformationVO.PositionVO> positions = item.getPositions();
        positionsContainerLL.setVisibility(positions == null || positions.isEmpty() ? 8 : 0);
        List<TravelModalPriceDetailInformationVO.PositionVO> positions2 = item.getPositions();
        if (positions2 != null) {
            for (TravelModalPriceDetailInformationVO.PositionVO positionVO : positions2) {
                LinearLayout positionsContainerLL2 = this.binding.positionsContainerLL;
                Intrinsics.checkNotNullExpressionValue(positionsContainerLL2, "positionsContainerLL");
                inflateAndBindPositionView(positionVO, positionsContainerLL2);
            }
        }
    }
}
