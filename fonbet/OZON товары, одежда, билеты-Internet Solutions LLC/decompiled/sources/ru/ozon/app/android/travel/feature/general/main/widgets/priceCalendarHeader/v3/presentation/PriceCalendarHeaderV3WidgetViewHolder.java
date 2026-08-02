package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.presentation;

import Sc.InterfaceC4008j;
import T00.m;
import W10.c;
import W10.e;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.databinding.ItemPriceCalendarHeaderV3FieldBinding;
import ru.ozon.app.android.travel.feature.general.main.databinding.WidgetPriceCalendarHeaderV3Binding;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.presentation.PriceCalendarHeaderV3VO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001>B-\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014j\u0002`\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001dJ'\u0010\"\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010\u001cJ\u001d\u0010'\u001a\u00020\u00162\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0011\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3WidgetViewHolder;", "Ld20/d;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO$Content;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3WidgetViewModel;", "widgetViewModel", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "calendarViewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3WidgetViewModel;Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;Ld20/e;)V", "Lru/ozon/app/android/travel/feature/general/main/databinding/ItemPriceCalendarHeaderV3FieldBinding;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO$Field;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/general/main/databinding/ItemPriceCalendarHeaderV3FieldBinding;Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO$Field;Lkotlin/jvm/functions/Function1;)V", "onWidgetCreated", "()V", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onWidgetDestroyed", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "", "provideTraceWidgetName", "()Ljava/lang/String;", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3WidgetViewModel;", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/main/databinding/WidgetPriceCalendarHeaderV3Binding;", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/WidgetPriceCalendarHeaderV3Binding;", "Landroid/graphics/drawable/GradientDrawable;", "widgetBackground$delegate", "LSc/j;", "getWidgetBackground", "()Landroid/graphics/drawable/GradientDrawable;", "widgetBackground", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceCalendarHeaderV3WidgetViewHolder extends AbstractC6067d<PriceCalendarHeaderV3VO> implements AsyncWidgetCallbacks<PriceCalendarHeaderV3VO.Content>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private WidgetPriceCalendarHeaderV3Binding binding;

    @NotNull
    private final CalendarViewModel calendarViewModel;

    @NotNull
    private final i container;

    /* renamed from: widgetBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widgetBackground;

    @NotNull
    private final PriceCalendarHeaderV3WidgetViewModel widgetViewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3WidgetViewHolder$Companion;", "", "<init>", "()V", "ACTION_ID_RESET_DATES", "", "ACTION_ID_RESET_RETURN_DATE", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceCalendarHeaderV3WidgetViewHolder(@NotNull i container, @NotNull PriceCalendarHeaderV3WidgetViewModel widgetViewModel, @NotNull CalendarViewModel calendarViewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        Intrinsics.checkNotNullParameter(calendarViewModel, "calendarViewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.widgetViewModel = widgetViewModel;
        this.calendarViewModel = calendarViewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).onClick(new PriceCalendarHeaderV3WidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.widgetBackground = LazyUtilsKt.unsafeLazy(PriceCalendarHeaderV3WidgetViewHolder$widgetBackground$2.INSTANCE);
    }

    private final GradientDrawable getWidgetBackground() {
        return (GradientDrawable) this.widgetBackground.getValue();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<PriceCalendarHeaderV3VO.Content> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.container.X().e(trackingPayloads);
        }
        this.container.M().update(new PriceCalendarHeaderV3Update(fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ViewGroup rootView = ContextExtKt.getRootView(this.container.Q().c());
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this, 62, null).show();
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        WidgetPriceCalendarHeaderV3Binding bind = WidgetPriceCalendarHeaderV3Binding.bind(getView());
        this.binding = bind;
        if (bind != null) {
            bind.priceCalendarHeaderStartDateField.priceCalendarHeaderFieldTitleTav.setTextIsSelectable(false);
            bind.priceCalendarHeaderReturnDateField.priceCalendarHeaderFieldTitleTav.setTextIsSelectable(false);
            bind.getConstraintLayout().setBackground(getWidgetBackground());
        }
        this.widgetViewModel.observeEvents(this, this, this);
        this.calendarViewModel.selectionLiveData().observe(this, new PriceCalendarHeaderV3WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new PriceCalendarHeaderV3WidgetViewHolder$onWidgetCreated$2(this)));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.widgetViewModel.onCleared();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
    public String provideTraceWidgetName() {
        b i11;
        d b11;
        m c11;
        l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PriceCalendarHeaderV3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PriceCalendarHeaderV3VO.Content content = item.getContent();
        WidgetPriceCalendarHeaderV3Binding widgetPriceCalendarHeaderV3Binding = this.binding;
        if (widgetPriceCalendarHeaderV3Binding != null) {
            ItemPriceCalendarHeaderV3FieldBinding priceCalendarHeaderStartDateField = widgetPriceCalendarHeaderV3Binding.priceCalendarHeaderStartDateField;
            Intrinsics.checkNotNullExpressionValue(priceCalendarHeaderStartDateField, "priceCalendarHeaderStartDateField");
            bind(priceCalendarHeaderStartDateField, content.getStartDateField(), this.actionHandler);
            ItemPriceCalendarHeaderV3FieldBinding priceCalendarHeaderReturnDateField = widgetPriceCalendarHeaderV3Binding.priceCalendarHeaderReturnDateField;
            Intrinsics.checkNotNullExpressionValue(priceCalendarHeaderReturnDateField, "priceCalendarHeaderReturnDateField");
            bind(priceCalendarHeaderReturnDateField, content.getReturnDateField(), this.actionHandler);
            GradientDrawable widgetBackground = getWidgetBackground();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = widgetPriceCalendarHeaderV3Binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            widgetBackground.setColor(styleParser.parseColorInt(context, content.getBackgroundColor(), 0));
            widgetBackground.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, content.getBottomRadius(), content.getBottomRadius(), content.getBottomRadius(), content.getBottomRadius()});
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull PriceCalendarHeaderV3VO item, @NotNull c trackingData, @NotNull f viewedPond) {
        t b11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getContent().getTrackingInfo();
        if (trackingInfo == null || (b11 = e.b(trackingInfo, Long.valueOf(item.getId()))) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), b11, null, 2, null);
    }

    private final void bind(ItemPriceCalendarHeaderV3FieldBinding itemPriceCalendarHeaderV3FieldBinding, PriceCalendarHeaderV3VO.Field field, Function1<? super AtomAction, Unit> function1) {
        AspectView constraintLayout = itemPriceCalendarHeaderV3FieldBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        AspectHolderKt.bind(constraintLayout, field.getAspect(), function1);
        TextAtomV2View priceCalendarHeaderFieldTitleTav = itemPriceCalendarHeaderV3FieldBinding.priceCalendarHeaderFieldTitleTav;
        Intrinsics.checkNotNullExpressionValue(priceCalendarHeaderFieldTitleTav, "priceCalendarHeaderFieldTitleTav");
        TextHolderKt.bind$default(priceCalendarHeaderFieldTitleTav, field.getTitle(), null, 2, null);
        IconButtonV3View priceCalendarHeaderFieldButtonIbv = itemPriceCalendarHeaderV3FieldBinding.priceCalendarHeaderFieldButtonIbv;
        Intrinsics.checkNotNullExpressionValue(priceCalendarHeaderFieldButtonIbv, "priceCalendarHeaderFieldButtonIbv");
        IconButtonV3HolderKt.bindOrGone(priceCalendarHeaderFieldButtonIbv, field.getResetIcon(), function1);
    }
}
