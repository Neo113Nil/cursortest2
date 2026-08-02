package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.presentation;

import Vg.d;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.databinding.WidgetHotelsMapCardV1Binding;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/presentation/HotelsMapCardV1WidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/presentation/HotelsMapCardV1VO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;LVg/d;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/presentation/HotelsMapCardV1VO;)V", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "Lru/ozon/app/android/travel/feature/hotels/map/databinding/WidgetHotelsMapCardV1Binding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/map/databinding/WidgetHotelsMapCardV1Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapCardV1WidgetViewHolder extends AbstractC6064a<HotelsMapCardV1VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private WidgetHotelsMapCardV1Binding binding;

    @NotNull
    private final HotelMapInfoViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsMapCardV1WidgetViewHolder(@NotNull i container, @NotNull HotelMapInfoViewModel viewModel, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new HotelsMapCardV1WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.binding = WidgetHotelsMapCardV1Binding.bind(getView());
        this.viewModel.onBottomWidgetCreated();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HotelsMapCardV1VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetHotelsMapCardV1Binding widgetHotelsMapCardV1Binding = this.binding;
        if (widgetHotelsMapCardV1Binding != null) {
            AppCompatImageView hotelsMapCardIcon = widgetHotelsMapCardV1Binding.hotelsMapCardIcon;
            Intrinsics.checkNotNullExpressionValue(hotelsMapCardIcon, "hotelsMapCardIcon");
            Icon icon = item.getIcon();
            ImageViewExtKt.loadImageOrGone(hotelsMapCardIcon, icon != null ? icon.getImage() : null);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = widgetHotelsMapCardV1Binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Icon icon2 = item.getIcon();
            Integer valueOf = Integer.valueOf(styleParser.parseColor(context, icon2 != null ? icon2.getTintColor() : null, UniColors.TEXT_ACTION.getResId()));
            AppCompatImageView hotelsMapCardIcon2 = widgetHotelsMapCardV1Binding.hotelsMapCardIcon;
            Intrinsics.checkNotNullExpressionValue(hotelsMapCardIcon2, "hotelsMapCardIcon");
            ThemeExtKt.tint(hotelsMapCardIcon2, valueOf);
            TextAtomView hotelsMapCardName = widgetHotelsMapCardV1Binding.hotelsMapCardName;
            Intrinsics.checkNotNullExpressionValue(hotelsMapCardName, "hotelsMapCardName");
            TextAtomHolderKt.bind$default(hotelsMapCardName, item.getName(), null, 2, null);
            TextAtomView hotelsMapCardAddress = widgetHotelsMapCardV1Binding.hotelsMapCardAddress;
            Intrinsics.checkNotNullExpressionValue(hotelsMapCardAddress, "hotelsMapCardAddress");
            TextAtomHolderKt.bind$default(hotelsMapCardAddress, item.getAddress(), null, 2, null);
            TextAtomView hotelsMapCardPrice = widgetHotelsMapCardV1Binding.hotelsMapCardPrice;
            Intrinsics.checkNotNullExpressionValue(hotelsMapCardPrice, "hotelsMapCardPrice");
            TextAtomHolderKt.bindOrGone$default(hotelsMapCardPrice, item.getPrice(), null, 2, null);
            TextAtomView hotelsMapCardPriceDescription = widgetHotelsMapCardV1Binding.hotelsMapCardPriceDescription;
            Intrinsics.checkNotNullExpressionValue(hotelsMapCardPriceDescription, "hotelsMapCardPriceDescription");
            TextAtomHolderKt.bindOrGone$default(hotelsMapCardPriceDescription, item.getPriceDescription(), null, 2, null);
            LargeButtonView hotelsMapCardActionButton = widgetHotelsMapCardV1Binding.hotelsMapCardActionButton;
            Intrinsics.checkNotNullExpressionValue(hotelsMapCardActionButton, "hotelsMapCardActionButton");
            LargeButtonHolderKt.bind(hotelsMapCardActionButton, item.getActionButton(), this.actionHandler);
        }
        this.viewModel.onBottomWidgetBound(true);
    }
}
