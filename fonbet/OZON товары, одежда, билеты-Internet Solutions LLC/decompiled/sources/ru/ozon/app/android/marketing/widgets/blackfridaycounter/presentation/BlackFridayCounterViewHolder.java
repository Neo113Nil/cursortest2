package ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation;

import Cw.ViewOnClickListenerC2787a;
import W10.c;
import WZ.t;
import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.app.android.marketing.R$plurals;
import ru.ozon.app.android.marketing.common.timer.TimerWidgetTicker;
import ru.ozon.app.android.marketing.databinding.WidgetBlackFridayCounterBinding;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation.BlackFridayCounterVO;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation.BlackFridayCounterViewHolder;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010%\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` 2\u000e\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0015028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "timerToolService", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$TimerVO;", DynamicElementDTO.TIMER, "", "bindTimer", "(Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$TimerVO;)V", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$FooterVO;", CommentV3DTO.FOOTER_FIELD_NAME, "bindFooter", "(Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$FooterVO;)V", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/TickVO;", "tick", "onTick", "(Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/TickVO;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/databinding/WidgetBlackFridayCounterBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetBlackFridayCounterBinding;", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "asyncRatioFrameLayout", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/common/timer/TimerWidgetTicker;", "", "timerTicker", "Lru/ozon/app/android/marketing/common/timer/TimerWidgetTicker;", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BlackFridayCounterViewHolder extends k<BlackFridayCounterVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AsyncFrameLayout asyncRatioFrameLayout;
    private WidgetBlackFridayCounterBinding binding;

    @NotNull
    private final View.OnClickListener onClickListener;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final TimerWidgetTicker<Long, TickVO> timerTicker;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation.BlackFridayCounterViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<AsyncFrameLayout, View, Unit> {
        AnonymousClass1() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(BlackFridayCounterViewHolder blackFridayCounterViewHolder, View view) {
            AtomAction action;
            BlackFridayCounterVO boundedData = blackFridayCounterViewHolder.getBoundedData();
            if (boundedData == null || (action = boundedData.getAction()) == null) {
                return;
            }
            blackFridayCounterViewHolder.actionHandler.invoke(action);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(AsyncFrameLayout asyncFrameLayout, View view) {
            invoke2(asyncFrameLayout, view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AsyncFrameLayout invokeWhenInflated, View it) {
            Intrinsics.checkNotNullParameter(invokeWhenInflated, "$this$invokeWhenInflated");
            Intrinsics.checkNotNullParameter(it, "it");
            WidgetBlackFridayCounterBinding widgetBlackFridayCounterBinding = BlackFridayCounterViewHolder.this.binding;
            if (widgetBlackFridayCounterBinding == null) {
                Intrinsics.n("binding");
                throw null;
            }
            BlackFridayCounterView blackFridayCounterView = widgetBlackFridayCounterBinding.root;
            final BlackFridayCounterViewHolder blackFridayCounterViewHolder = BlackFridayCounterViewHolder.this;
            blackFridayCounterView.getBackgroundImage().setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BlackFridayCounterViewHolder.AnonymousClass1.invoke$lambda$1$lambda$0(BlackFridayCounterViewHolder.this, view);
                }
            });
            blackFridayCounterView.getFooterTitle().setOnClickListener(blackFridayCounterViewHolder.onClickListener);
            blackFridayCounterView.getFooterDisclosure().setOnClickListener(blackFridayCounterViewHolder.onClickListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackFridayCounterViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull StartupArgsService timerToolService) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(timerToolService, "timerToolService");
        this.refs = refs;
        AsyncFrameLayout asyncFrameLayout = new AsyncFrameLayout(getContext(), null, 0, 6, null);
        asyncFrameLayout.inflateAsync(R$layout.widget_black_friday_counter);
        ((ViewGroup) containerView).addView(asyncFrameLayout);
        asyncFrameLayout.invokeWhenInflated(new BlackFridayCounterViewHolder$asyncRatioFrameLayout$1$1(this));
        this.asyncRatioFrameLayout = asyncFrameLayout;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.timerTicker = new TimerWidgetTicker<>(0L, this, BlackFridayCounterViewHolder$timerTicker$1.INSTANCE, new BlackFridayCounterViewHolder$timerTicker$2(this), timerToolService.getArgValue("STATIC_TIMERS"), 1, null);
        this.onClickListener = new ViewOnClickListenerC2787a(this, 16);
        asyncFrameLayout.invokeWhenInflated(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindFooter(BlackFridayCounterVO.FooterVO footer) {
        WidgetBlackFridayCounterBinding widgetBlackFridayCounterBinding = this.binding;
        if (widgetBlackFridayCounterBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        BlackFridayCounterView blackFridayCounterView = widgetBlackFridayCounterBinding.root;
        blackFridayCounterView.setPremiumIconVisible(footer.getIsPremium());
        blackFridayCounterView.setFooterItemsVisible(!footer.getIsHidden());
        if (blackFridayCounterView.getFooterItemsVisible()) {
            blackFridayCounterView.setDisclosureVisible(blackFridayCounterView.getFooterItemsVisible() && footer.getShowDisclosure());
            blackFridayCounterView.getFooterTitle().setText(footer.getTitle());
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = blackFridayCounterView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            blackFridayCounterView.setFooterColor(styleParser.parseColor(context, footer.getTintColor(), UniColors.TEXT_LIGHT_KEY.getResId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindTimer(BlackFridayCounterVO.TimerVO timer) {
        WidgetBlackFridayCounterBinding widgetBlackFridayCounterBinding = this.binding;
        if (widgetBlackFridayCounterBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        BlackFridayCounterView blackFridayCounterView = widgetBlackFridayCounterBinding.root;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = blackFridayCounterView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        blackFridayCounterView.setTimerTextColor(styleParser.parseColor(context, timer.getTintColor(), UniColors.TEXT_LIGHT_KEY.getResId()));
        Context context2 = blackFridayCounterView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        blackFridayCounterView.setTimerBackgroundColor(styleParser.parseColor(context2, timer.getBackgroundColor(), R.color.transparent));
        this.timerTicker.bind(Long.valueOf(timer.getTimestampEnd()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickListener$lambda$1(BlackFridayCounterViewHolder blackFridayCounterViewHolder, View view) {
        AtomAction action;
        BlackFridayCounterVO.FooterVO footer;
        BlackFridayCounterVO boundedData = blackFridayCounterViewHolder.getBoundedData();
        if (boundedData == null || (footer = boundedData.getFooter()) == null || (action = footer.getAction()) == null) {
            BlackFridayCounterVO boundedData2 = blackFridayCounterViewHolder.getBoundedData();
            action = boundedData2 != null ? boundedData2.getAction() : null;
        }
        if (action != null) {
            blackFridayCounterViewHolder.actionHandler.invoke(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(TickVO tick) {
        BlackFridayCounterVO.TimerVO timer;
        BlackFridayCounterVO boundedData = getBoundedData();
        if (boundedData == null || (timer = boundedData.getTimer()) == null) {
            return;
        }
        WidgetBlackFridayCounterBinding widgetBlackFridayCounterBinding = this.binding;
        if (widgetBlackFridayCounterBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        BlackFridayCounterView blackFridayCounterView = widgetBlackFridayCounterBinding.root;
        blackFridayCounterView.setTimerTickerVisible(!tick.getIsFinished() && tick.getDays() < 2);
        if (tick.getIsFinished()) {
            blackFridayCounterView.getTimerPart2().setText(timer.getTitleOnExpire());
            return;
        }
        if (tick.getDays() < 2) {
            AppCompatTextView timerPart1 = blackFridayCounterView.getTimerPart1();
            String format = String.format("%s\u2009:\u2009%s\u2009:\u2009%s", Arrays.copyOf(new Object[]{tick.getHours(), tick.getMinutes(), tick.getSeconds()}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            timerPart1.setText(format);
            blackFridayCounterView.getTimerPart2().setText(timer.getTitle());
            return;
        }
        String quantityString = StringProvider.getQuantityString(R$plurals.black_friday_status_plurals_days, tick.getDays(), Integer.valueOf(tick.getDays()));
        blackFridayCounterView.getTimerPart2().setText(quantityString + " " + timer.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BlackFridayCounterVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.asyncRatioFrameLayout.invokeWhenInflated(new BlackFridayCounterViewHolder$bind$1(this, item));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BlackFridayCounterVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
