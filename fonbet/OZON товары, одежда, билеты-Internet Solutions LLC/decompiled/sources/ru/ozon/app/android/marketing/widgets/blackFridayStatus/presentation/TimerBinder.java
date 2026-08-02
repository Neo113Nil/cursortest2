package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.R$plurals;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.TickVO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.TimerVO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.TimerWithTitleVO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.view.TimerView;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B;\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0002\b\u00030\u0002j\u0006\u0012\u0002\b\u0003`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u000e\u0012\u0002\b\u00030\u0002j\u0006\u0012\u0002\b\u0003`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/TimerBinder;", "", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "Lkotlin/Function1;", "", "", "timerVisibilityListener", "<init>", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TickVO;", DynamicElementDTO.TIMER, "onTick", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TickVO;)V", "onTimerFinished", "()V", "updateTimer", "show", "showOrHideTimer", "(Z)V", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;", "timerWithTitle", "bind", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/TimerTicker;", "", "timerTicker", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/TimerTicker;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/view/TimerView;", "timerView", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/view/TimerView;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "timerTitleView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "item", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimerBinder {

    @NotNull
    private final k<?> holder;
    private TimerWithTitleVO item;

    @NotNull
    private final StartupArgsService startupArgsService;

    @NotNull
    private final TimerTicker<Long, TickVO> timerTicker;

    @NotNull
    private final TextAtomView timerTitleView;

    @NotNull
    private final TimerView timerView;
    private final Function1<Boolean, Unit> timerVisibilityListener;

    /* JADX WARN: Multi-variable type inference failed */
    public TimerBinder(@NotNull k<?> holder, @NotNull StartupArgsService startupArgsService, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        this.holder = holder;
        this.startupArgsService = startupArgsService;
        this.timerVisibilityListener = function1;
        this.timerTicker = new TimerTicker<>(0L, holder, TimerBinder$timerTicker$1.INSTANCE, new TimerBinder$timerTicker$2(this), startupArgsService.getArgValue("STATIC_TIMERS"), 1, null);
        View findViewById = holder.itemView.findViewById(R$id.timerV);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.timerView = (TimerView) findViewById;
        View findViewById2 = holder.itemView.findViewById(R$id.timerTitleTav);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.timerTitleView = (TextAtomView) findViewById2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(TickVO timer) {
        if (timer.getIsFinished()) {
            onTimerFinished();
        } else {
            updateTimer(timer);
        }
    }

    private final void onTimerFinished() {
        TimerWithTitleVO timerWithTitleVO = this.item;
        if (timerWithTitleVO == null) {
            return;
        }
        this.timerTicker.unbind();
        TimerView timerView = this.timerView;
        showOrHideTimer(!timerWithTitleVO.getHideTimerOnExpire());
        if (ViewExtKt.isVisible(timerView)) {
            timerView.setTime("00", "00", "00");
        }
        TextAtomHolderKt.bindOrGone$default(this.timerTitleView, timerWithTitleVO.getTitleOnExpire(), null, 2, null);
    }

    private final void showOrHideTimer(boolean show) {
        ViewExtKt.showOrGone(this.timerView, Boolean.valueOf(show));
        Function1<Boolean, Unit> function1 = this.timerVisibilityListener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(show));
        }
    }

    private final void updateTimer(TickVO timer) {
        if (timer.getDays() >= 2) {
            this.timerView.setTitle(StringProvider.getQuantityString(R$plurals.black_friday_status_plurals_days, timer.getDays(), Integer.valueOf(timer.getDays())));
        } else {
            this.timerView.setTime(timer.getHours(), timer.getMinutes(), timer.getSeconds());
        }
    }

    public final void bind(TimerWithTitleVO timerWithTitle) {
        this.item = timerWithTitle;
        TextAtomHolderKt.bindOrGone$default(this.timerTitleView, timerWithTitle != null ? timerWithTitle.getTitle() : null, null, 2, null);
        TimerVO timer = timerWithTitle != null ? timerWithTitle.getTimer() : null;
        if (timer == null) {
            showOrHideTimer(false);
            this.timerTicker.unbind();
            return;
        }
        showOrHideTimer(true);
        this.timerTicker.bind(Long.valueOf(timer.getTimestampEnd()));
        TimerView timerView = this.timerView;
        StyleParser styleParser = StyleParser.INSTANCE;
        timerView.setTextColor(styleParser.parseColor(this.holder.getContext(), timer.getTimerTextColor(), UniColors.TEXT_LIGHT_KEY.getResId()));
        this.timerView.setBackColor(styleParser.parseColor(this.holder.getContext(), timer.getTimerBackgroundColor(), UniColors.BG_MARKETING_PRIMARY.getResId()));
    }

    public /* synthetic */ TimerBinder(k kVar, StartupArgsService startupArgsService, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, startupArgsService, (i11 & 4) != 0 ? null : function1);
    }
}
