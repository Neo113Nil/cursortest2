package ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.presentation;

import W10.c;
import WZ.t;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.tours.databinding.WidgetToursBookInformerBinding;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/presentation/ToursBookInformerWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/presentation/ToursBookInformerVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/presentation/ToursBookInformerVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/presentation/ToursBookInformerVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetToursBookInformerBinding;", "binding", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetToursBookInformerBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursBookInformerWidgetViewHolder extends AbstractC6064a<ToursBookInformerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private WidgetToursBookInformerBinding binding;

    @NotNull
    private final i container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursBookInformerWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        ConstraintLayout constraintLayout;
        WidgetToursBookInformerBinding bind = WidgetToursBookInformerBinding.bind(getView());
        this.binding = bind;
        if (bind == null || (constraintLayout = bind.getConstraintLayout()) == null) {
            return;
        }
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(20, context);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context2 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context2, R$attr.layerFloor1);
        Context context3 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int themeColor2 = ThemeExtKt.themeColor(context3, R$attr.graphicNeutral);
        Context context4 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        constraintLayout.setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, themeColor, themeColor2, ResourceExtKt.toPx(1, context4), pxF, pxF, 0.0f, 0.0f, 96, null));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ToursBookInformerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetToursBookInformerBinding widgetToursBookInformerBinding = this.binding;
        if (widgetToursBookInformerBinding != null) {
            TextAtomView toursBookInformerTitleTav = widgetToursBookInformerBinding.toursBookInformerTitleTav;
            Intrinsics.checkNotNullExpressionValue(toursBookInformerTitleTav, "toursBookInformerTitleTav");
            TextAtomHolderKt.bind$default(toursBookInformerTitleTav, item.getTitle(), null, 2, null);
            AppCompatImageView appCompatImageView = widgetToursBookInformerBinding.toursBookInformerIcon;
            Intrinsics.f(appCompatImageView);
            Icon icon = item.getIcon();
            ImageViewExtKt.loadImageOrGone(appCompatImageView, icon != null ? icon.getImage() : null);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Icon icon2 = item.getIcon();
            ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, icon2 != null ? icon2.getTintColor() : null));
            SmallIconButtonView smallIconButtonView = widgetToursBookInformerBinding.tourBookInformerInfoButtonSibv;
            Intrinsics.f(smallIconButtonView);
            WrappedIconButtonHolderKt.bind(smallIconButtonView, item.getInfoButton(), this.actionHandler);
            smallIconButtonView.setPadding(0, 0, 0, 0);
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull ToursBookInformerVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
    }
}
