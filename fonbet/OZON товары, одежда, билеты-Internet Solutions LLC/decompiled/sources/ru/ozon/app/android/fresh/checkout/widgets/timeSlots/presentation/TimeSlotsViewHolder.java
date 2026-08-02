package ru.ozon.app.android.fresh.checkout.widgets.timeSlots.presentation;

import E.b0;
import W10.c;
import WZ.l;
import WZ.t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.domain.TimeSlotsVO;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.presentation.recyclerView.TimeSlotDecorator;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.presentation.recyclerView.TimeSlotsAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 %2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001%B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/presentation/TimeSlotsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/presentation/recyclerView/TimeSlotsAdapter;", "timeSlotAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/presentation/recyclerView/TimeSlotsAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO$TimeSlot;", "currentSelectedItem", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO$TimeSlot;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimeSlotsViewHolder extends k<TimeSlotsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private TimeSlotsVO.TimeSlot currentSelectedItem;

    @NotNull
    private final TimeSlotsAdapter timeSlotAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final RecyclerView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int topTimeSlotsPadding = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/presentation/TimeSlotsViewHolder$Companion;", "", "<init>", "()V", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeSlotsViewHolder(@NotNull RecyclerView view, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.actionHandler = buildHandler;
        TimeSlotsAdapter timeSlotsAdapter = new TimeSlotsAdapter(buildHandler);
        this.timeSlotAdapter = timeSlotsAdapter;
        view.setAdapter(timeSlotsAdapter);
        view.addItemDecoration(new TimeSlotDecorator());
        view.setBackgroundColor(getContext().getColor(UniColors.LAYER_FLOOR_1.getResId()));
        view.setPadding(0, topTimeSlotsPadding, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(TimeSlotsVO timeSlotsVO, TimeSlotsViewHolder timeSlotsViewHolder) {
        Object obj;
        Iterator<T> it = timeSlotsVO.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((TimeSlotsVO.TimeSlot) obj).getWrapper().getState() == AspectDTO.AspectState.SELECTED) {
                    break;
                }
            }
        }
        TimeSlotsVO.TimeSlot timeSlot = (TimeSlotsVO.TimeSlot) obj;
        if (Intrinsics.d(timeSlot, timeSlotsViewHolder.currentSelectedItem)) {
            return;
        }
        timeSlotsViewHolder.currentSelectedItem = timeSlot;
        timeSlotsViewHolder.view.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TimeSlotsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.timeSlotAdapter.submitList(item.getItems(), new b0(4, item, this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TimeSlotsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TimeSlotsViewHolder) item, trackingData, viewedPond);
        t viewTokenizedEvent = item.getViewTokenizedEvent();
        if (viewTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewTokenizedEvent, null, 2, null);
        }
    }
}
