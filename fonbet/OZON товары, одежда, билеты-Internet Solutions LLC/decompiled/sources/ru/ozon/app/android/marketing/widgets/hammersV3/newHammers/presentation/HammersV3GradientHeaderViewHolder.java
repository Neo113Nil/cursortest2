package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation;

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
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.GradientTitleVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3BadgeTickVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3GradientHeaderVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3TimerBadgeVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersV3GradientHeaderView;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersV3HeaderBadge;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u0000 72\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u00017B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J3\u0010(\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010$\u001a\u00060\"j\u0002`#2\u000e\u0010'\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000f0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R$\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0016\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/HammersV3GradientHeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3GradientHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3GradientHeaderView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3GradientHeaderView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/GradientTitleVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "bindTitle", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/GradientTitleVO;)V", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3TimerBadgeVO;", DynamicElementDTO.TIMER, "bindBadge", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3TimerBadgeVO;)V", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BadgeTickVO;", "tick", "onTick", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BadgeTickVO;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3GradientHeaderVO;Ll20/d;)V", "onDetach", "()V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3GradientHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3GradientHeaderView;", "getContainerView", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3GradientHeaderView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/common/timer/TimerWidgetTicker;", "", "timerTicker", "Lru/ozon/app/android/marketing/common/timer/TimerWidgetTicker;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersV3GradientHeaderViewHolder extends k<HammersV3GradientHeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final HammersV3GradientHeaderView containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final StartupArgsService startupArgsService;
    private TimerWidgetTicker<Long, HammersV3BadgeTickVO> timerTicker;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.HammersV3GradientHeaderViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            AtomAction action;
            Intrinsics.checkNotNullParameter(it, "it");
            HammersV3GradientHeaderVO boundedData = HammersV3GradientHeaderViewHolder.this.getBoundedData();
            if (boundedData == null || (action = boundedData.getAction()) == null) {
                return;
            }
            HammersV3GradientHeaderViewHolder.this.actionHandler.invoke(action);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.HammersV3GradientHeaderViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            AtomAction action;
            Intrinsics.checkNotNullParameter(it, "it");
            HammersV3GradientHeaderVO boundedData = HammersV3GradientHeaderViewHolder.this.getBoundedData();
            if (boundedData == null || (action = boundedData.getAction()) == null) {
                return;
            }
            HammersV3GradientHeaderViewHolder.this.actionHandler.invoke(action);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/HammersV3GradientHeaderViewHolder$Companion;", "", "<init>", "()V", "TIMER_FORMAT", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HammersV3GradientHeaderViewHolder(@NotNull HammersV3GradientHeaderView containerView, @NotNull ComposerReferences refs, @NotNull StartupArgsService startupArgsService) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        this.containerView = containerView;
        this.refs = refs;
        this.startupArgsService = startupArgsService;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        ViewExtKt.setOnClickListenerThrottle$default(getContainerView(), 0L, new AnonymousClass1(), 1, null);
        ViewExtKt.setOnClickListenerThrottle$default(getContainerView().getTitleTv(), 0L, new AnonymousClass2(), 1, null);
    }

    private final void bindBadge(HammersV3TimerBadgeVO timer) {
        getContainerView().getTimerBadge().setVisibility((timer != null ? timer.getBadgeText() : null) != null ? 0 : 8);
        if ((timer != null ? timer.getBadgeText() : null) != null) {
            getContainerView().getTimerBadge().bind(timer);
            TimerWidgetTicker<Long, HammersV3BadgeTickVO> timerWidgetTicker = this.timerTicker;
            if (timerWidgetTicker != null) {
                timerWidgetTicker.unbind();
            }
            if (timer.getSecondsLeft() != null) {
                TimerWidgetTicker<Long, HammersV3BadgeTickVO> timerWidgetTicker2 = new TimerWidgetTicker<>(0L, this, HammersV3GradientHeaderViewHolder$bindBadge$1.INSTANCE, new HammersV3GradientHeaderViewHolder$bindBadge$2(this), this.startupArgsService.getArgValue("STATIC_TIMERS"), 1, null);
                this.timerTicker = timerWidgetTicker2;
                timerWidgetTicker2.bind(Long.valueOf(timer.getTimestampEnd()));
            }
        }
    }

    private final void bindTitle(GradientTitleVO title) {
        getContainerView().bindTitle$marketing_prodGoogleAllVendorsRelease(title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r1 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onTick(HammersV3BadgeTickVO tick) {
        String str;
        HammersV3TimerBadgeVO timerBadge;
        TextDTO badgeText;
        HammersV3HeaderBadge timerBadge2 = getContainerView().getTimerBadge();
        if (tick.getIsFinished()) {
            HammersV3GradientHeaderVO boundData = getBoundData();
            timerBadge2.onTimeExpired(boundData != null ? boundData.getTimerBadge() : null);
            TimerWidgetTicker<Long, HammersV3BadgeTickVO> timerWidgetTicker = this.timerTicker;
            if (timerWidgetTicker != null) {
                timerWidgetTicker.unbind();
                return;
            }
            return;
        }
        HammersV3GradientHeaderVO boundData2 = getBoundData();
        if (boundData2 != null && (timerBadge = boundData2.getTimerBadge()) != null && (badgeText = timerBadge.getBadgeText()) != null) {
            str = " " + ((Object) badgeText.getText());
        }
        str = "";
        String format = String.format("%s:%s:%s", Arrays.copyOf(new Object[]{tick.getHours(), tick.getMinutes(), tick.getSeconds()}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String concat = format.concat(str);
        HammersV3GradientHeaderVO boundData3 = getBoundData();
        timerBadge2.onTimeChanged(concat, boundData3 != null ? boundData3.getTimerBadge() : null);
    }

    @NotNull
    public HammersV3GradientHeaderView getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        TimerWidgetTicker<Long, HammersV3BadgeTickVO> timerWidgetTicker = this.timerTicker;
        if (timerWidgetTicker != null) {
            timerWidgetTicker.unbind();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HammersV3GradientHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        IconButtonV3HolderKt.bindOrGone(getContainerView().getInfoBtn(), item.getInfoButton(), this.actionHandler);
        TextHolderKt.bindOrGone$default(getContainerView().getInfoText(), item.getInfoText(), null, 2, null);
        TextHolderKt.bindOrGone$default(getContainerView().getSubtitleTv(), item.getSubtitle(), null, 2, null);
        bindTitle(item.getTitle());
        bindBadge(item.getTimerBadge());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HammersV3GradientHeaderVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HammersV3GradientHeaderViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
