package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.adapter.content;

import Lc.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.oldwidgets.R$id;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.TravelScrollPriceCalendarV2VO;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\u001a\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/adapter/content/TravelScrollPriceCalendarV2ItemView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "context", "Landroid/content/Context;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "boundedItem", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State$Content$DateTabVO;", "unselectedBorderWidth", "", "selectedBorderWidth", "price", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", "date", "bind", "data", "bind$old_widgets_prodGoogleAllVendorsRelease", "setupConstraints", "setupBorder", "isSelected", "", "borderColor", "", "getCurrentBorderWidth", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarV2ItemView extends ConstraintLayoutWithBorder {
    private TravelScrollPriceCalendarV2VO.State.Content.DateTabVO boundedItem;

    @NotNull
    private final TextAtomV2View date;

    @NotNull
    private final IconView icon;

    @NotNull
    private final TextAtomV2View price;
    private final float selectedBorderWidth;
    private final float unselectedBorderWidth;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.adapter.content.TravelScrollPriceCalendarV2ItemView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$onAction = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            AtomAction clickAction;
            Intrinsics.checkNotNullParameter(it, "it");
            TravelScrollPriceCalendarV2VO.State.Content.DateTabVO dateTabVO = TravelScrollPriceCalendarV2ItemView.this.boundedItem;
            if (dateTabVO != null) {
                Function1<AtomAction, Unit> function1 = this.$onAction;
                if (dateTabVO.getIsSelected() || (clickAction = dateTabVO.getClickAction()) == null) {
                    return;
                }
                function1.invoke(clickAction);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelScrollPriceCalendarV2ItemView(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.unselectedBorderWidth = ResourceExtKt.toPxF(1, context);
        this.selectedBorderWidth = ResourceExtKt.toPxF(2, context);
        q qVar = q.f64554a;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        a.d(textAtomV2View, R$id.travel_scroll_price_calendar_v2_price, -2, -2, false);
        addView(g10);
        this.price = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.travel_scroll_price_calendar_v2_icon);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(iconView);
        this.icon = iconView;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g11;
        a.d(textAtomV2View2, R$id.travel_scroll_price_calendar_v2_date, -2, -2, false);
        addView(g11);
        this.date = textAtomV2View2;
        setupConstraints();
        setMinWidth(ResourceExtKt.toPx(92, context));
        ViewExtKt.setOnClickListenerThrottle$default(this, 0L, new AnonymousClass1(onAction), 1, null);
    }

    private final float getCurrentBorderWidth() {
        return getBorderPaint().getStrokeWidth();
    }

    private final void setupBorder(boolean isSelected, String borderColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBorderColor(styleParser.parseColor(context, borderColor));
        float f7 = isSelected ? this.selectedBorderWidth : this.unselectedBorderWidth;
        if (getCurrentBorderWidth() == f7) {
            return;
        }
        setBorderWidth(f7);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.price);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.price);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.price, this.icon);
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, this.price, this.date);
        dVar.g0(this.price.getId(), 2);
        dVar.d0(this.price.getId(), 2);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.icon);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, this.icon, this.price);
        ConstraintLayoutExtensionsKt.topToTop(dVar, this.icon, this.price);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, this.icon, this.price);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.date, this.price);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.date);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.date);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, this.date);
        dVar.f(this);
    }

    public final void bind$old_widgets_prodGoogleAllVendorsRelease(@NotNull TravelScrollPriceCalendarV2VO.State.Content.DateTabVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.boundedItem = data;
        TravelWidgetSettingsVO tabSettings = data.getTabSettings();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, tabSettings.getBackgroundColor());
        setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        setPadding(tabSettings.getPaddings().getLeftPadding(), tabSettings.getPaddings().getTopPadding(), tabSettings.getPaddings().getRightPadding(), tabSettings.getPaddings().getBottomPadding());
        setRadius(tabSettings.getCorners().getTopRadius());
        TextHolderKt.bind$default(this.date, data.getDate(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.price, data.getPrice(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.icon, data.getRightPriceIcon(), null, 2, null);
        setupBorder(data.getIsSelected(), data.getBorderColor());
    }
}
