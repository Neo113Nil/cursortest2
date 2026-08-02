package ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation;

import A00.a;
import Gw.ViewOnClickListenerC3131a;
import W10.c;
import WZ.t;
import android.view.View;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.common.timer.TimerWidgetTicker;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.data.BigPromoPDPDTO;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation.BigPromoPDPVO;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 32\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00013B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000e0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0011\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPView;", "mainView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$TimerBadgeVO;", DynamicElementDTO.TIMER, "", "bindTimer", "(Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$TimerBadgeVO;)V", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPTickVO;", "tick", "onTick", "(Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPTickVO;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "()V", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/common/timer/TimerWidgetTicker;", "", "timerTicker", "Lru/ozon/app/android/marketing/common/timer/TimerWidgetTicker;", "", "isSwipeRefresh", "Z", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BigPromoPDPViewHolder extends k<BigPromoPDPVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean isSwipeRefresh;

    @NotNull
    private final BigPromoPDPView mainView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final StartupArgsService startupArgsService;
    private TimerWidgetTicker<Long, BigPromoPDPTickVO> timerTicker;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "event", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation.BigPromoPDPViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<a, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(a aVar) {
            BigPromoPDPVO boundData;
            BigPromoPDPDTO.AnimatedCounterDTO counter;
            if (aVar instanceof a.u.c) {
                BigPromoPDPViewHolder.this.isSwipeRefresh = true;
                return;
            }
            if ((aVar instanceof a.C2370k) && BigPromoPDPViewHolder.this.isSwipeRefresh) {
                BigPromoPDPViewHolder.this.isSwipeRefresh = false;
                if (!BigPromoPDPViewHolder.this.mainView.isAttachedToWindow() || (boundData = BigPromoPDPViewHolder.this.getBoundData()) == null || (counter = boundData.getCounter()) == null) {
                    return;
                }
                BigPromoPDPViewHolder.this.mainView.restartAnimation(counter.getPercentage());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPViewHolder$Companion;", "", "<init>", "()V", "TIMER_FORMAT", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigPromoPDPViewHolder(@NotNull BigPromoPDPView mainView, @NotNull ComposerReferences refs, @NotNull StartupArgsService startupArgsService) {
        super(mainView);
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        this.mainView = mainView;
        this.refs = refs;
        this.startupArgsService = startupArgsService;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        mainView.setOnClickListener(new ViewOnClickListenerC3131a(this, 9));
        refs.getController().getEvents().observe(this, new BigPromoPDPViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(BigPromoPDPViewHolder bigPromoPDPViewHolder, View view) {
        AtomAction action;
        BigPromoPDPVO boundData = bigPromoPDPViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        bigPromoPDPViewHolder.actionHandler.invoke(action);
    }

    private final void bindTimer(BigPromoPDPVO.TimerBadgeVO timer) {
        TimerWidgetTicker<Long, BigPromoPDPTickVO> timerWidgetTicker = this.timerTicker;
        if (timerWidgetTicker != null) {
            timerWidgetTicker.unbind();
        }
        TimerWidgetTicker<Long, BigPromoPDPTickVO> timerWidgetTicker2 = new TimerWidgetTicker<>(0L, this, BigPromoPDPViewHolder$bindTimer$1.INSTANCE, new BigPromoPDPViewHolder$bindTimer$2(this), this.startupArgsService.getArgValue("STATIC_TIMERS"), 1, null);
        this.timerTicker = timerWidgetTicker2;
        timerWidgetTicker2.bind(Long.valueOf(timer.getTimestampEnd()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(BigPromoPDPTickVO tick) {
        BigPromoPDPTimerView timerBadge = this.mainView.getTimerBadge();
        if (tick.getIsFinished()) {
            TimerWidgetTicker<Long, BigPromoPDPTickVO> timerWidgetTicker = this.timerTicker;
            if (timerWidgetTicker != null) {
                timerWidgetTicker.unbind();
            }
            this.timerTicker = null;
            this.mainView.onTimerLeft(getBoundData());
            return;
        }
        if (tick.getDays() < 1) {
            TextAtomV2View tickerText = timerBadge.getTickerText();
            String format = String.format("%s\u2009:\u2009%s\u2009:\u2009%s", Arrays.copyOf(new Object[]{tick.getHours(), tick.getMinutes(), tick.getSeconds()}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            tickerText.setText(format);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        TimerWidgetTicker<Long, BigPromoPDPTickVO> timerWidgetTicker = this.timerTicker;
        if (timerWidgetTicker != null) {
            timerWidgetTicker.unbind();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BigPromoPDPVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.mainView.bindData(item, this.actionHandler);
        BigPromoPDPVO.TimerBadgeVO timerBadge = item.getTimerBadge();
        if (timerBadge == null || timerBadge.getSecondsLeft() == null) {
            return;
        }
        Long secondsLeft = timerBadge.getSecondsLeft();
        if (secondsLeft != null && secondsLeft.longValue() == 0) {
            return;
        }
        bindTimer(timerBadge);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BigPromoPDPVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
