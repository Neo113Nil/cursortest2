package ru.ozon.app.android.regulardraw.widgets.daily.presentation;

import Vg.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.regulardraw.databinding.WidgetDailyBinding;
import ru.ozon.app.android.regulardraw.utils.TimerTicker;
import ru.ozon.app.android.regulardraw.widgets.daily.data.DailyVO;
import ru.ozon.app.android.regulardraw.widgets.daily.ui.DailyBackground;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EB7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u0013*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u0013*\u00020\u001a2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020 H\u0002¢\u0006\u0004\b'\u0010(J#\u0010-\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00022\n\u0010,\u001a\u00060*j\u0002`+H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00100J)\u00105\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00130:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010@\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u0016\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/presentation/DailyViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO;", "Ll10/i;", "container", "Lru/ozon/app/android/regulardraw/databinding/WidgetDailyBinding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "defaultActionHandlers", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Ll10/i;Lru/ozon/app/android/regulardraw/databinding/WidgetDailyBinding;LWZ/l;LVg/c;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO$Timer;", DynamicElementDTO.TIMER, "", "bindTimer", "(Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO$Timer;)V", "Lru/ozon/app/android/regulardraw/widgets/daily/presentation/DailyTickVO;", "tick", "onTick", "(Lru/ozon/app/android/regulardraw/widgets/daily/presentation/DailyTickVO;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/helper/widget/Flow;", "flow", "removeViews", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/helper/widget/Flow;)V", "", "", "rewards", "flowHelper", "bindRewards", "(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/util/List;Landroidx/constraintlayout/helper/widget/Flow;)V", ImagesContract.URL, "Landroid/view/View;", "getDailyRewardView", "(Ljava/lang/String;)Landroid/view/View;", "item", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO;Ll20/d;)V", "onDetach", "()V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/regulardraw/databinding/WidgetDailyBinding;", "LWZ/l;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/regulardraw/utils/TimerTicker;", "", "timerTicker", "Lru/ozon/app/android/regulardraw/utils/TimerTicker;", "", "screenWidth", "I", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DailyViewHolder extends k<DailyVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDailyBinding binding;
    private final int screenWidth;

    @NotNull
    private final StartupArgsService startupArgsService;
    private TimerTicker<Long, DailyTickVO> timerTicker;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DAILY_REWARD_IMAGE_WIDTH = ResourceExtKt.toPx(76);
    private static final int DAILY_REWARD_IMAGE_HEIGHT = ResourceExtKt.toPx(114);
    private static final int TOP_BANNER_IMAGE_WIDTH = ResourceExtKt.toPx(305);
    private static final int TOP_BANNER_IMAGE_HEIGHT = ResourceExtKt.toPx(156);
    private static final int topMaxMargin = ResourceExtKt.toPx(24);
    private static final int topMinMargin = ResourceExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/presentation/DailyViewHolder$Companion;", "", "<init>", "()V", "", "TIMER_FORMAT", "Ljava/lang/String;", "", "MAX_SCREEN_WIDTH", "I", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DailyViewHolder(@NotNull i container, @NotNull WidgetDailyBinding binding, @NotNull l tokenizedAnalytics, @NotNull c defaultActionHandlers, @NotNull StartupArgsService startupArgsService) {
        super(r0);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(defaultActionHandlers, "defaultActionHandlers");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.startupArgsService = startupArgsService;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new DailyViewHolder$actionHandler$1(defaultActionHandlers)).buildHandler();
        int i11 = getContext().getResources().getDisplayMetrics().widthPixels;
        this.screenWidth = i11;
        Space topMargin = binding.topMargin;
        Intrinsics.checkNotNullExpressionValue(topMargin, "topMargin");
        ViewGroup.LayoutParams layoutParams = topMargin.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = i11 < 375 ? topMinMargin : topMaxMargin;
        topMargin.setLayoutParams(marginLayoutParams);
    }

    private final void bindRewards(ConstraintLayout constraintLayout, List<String> list, Flow flow) {
        ArrayList arrayList;
        int[] iArr;
        removeViews(constraintLayout, flow);
        if (list != null) {
            List<String> list2 = list;
            arrayList = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(getDailyRewardView((String) it.next()));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                constraintLayout.addView((View) it2.next());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((View) it3.next()).getId()));
            }
            iArr = C7714v.T0(arrayList2);
        } else {
            iArr = new int[0];
        }
        flow.setReferencedIds(iArr);
    }

    private final void bindTimer(DailyVO.Timer timer) {
        TimerTicker<Long, DailyTickVO> timerTicker = this.timerTicker;
        if (timerTicker != null) {
            timerTicker.unbind();
        }
        AppCompatTextView timerTitle = this.binding.timerTitle;
        Intrinsics.checkNotNullExpressionValue(timerTitle, "timerTitle");
        timerTitle.setVisibility(timer != null ? 0 : 8);
        AppCompatTextView timer2 = this.binding.timer;
        Intrinsics.checkNotNullExpressionValue(timer2, "timer");
        timer2.setVisibility(timer != null ? 0 : 8);
        if (timer == null) {
            return;
        }
        this.binding.timerTitle.setText(timer.getTitle());
        TimerTicker<Long, DailyTickVO> timerTicker2 = new TimerTicker<>(0L, this, DailyViewHolder$bindTimer$1.INSTANCE, new DailyViewHolder$bindTimer$2(this), this.startupArgsService.getArgValue("STATIC_TIMERS"), 1, null);
        this.timerTicker = timerTicker2;
        timerTicker2.bind(Long.valueOf(timer.getTimestampEnd()));
    }

    private final View getDailyRewardView(String url) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setId(View.generateViewId());
        int i11 = DAILY_REWARD_IMAGE_HEIGHT;
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(-2, i11));
        ImageViewExtKt.load$default(appCompatImageView, url, null, null, null, new ImageSize(DAILY_REWARD_IMAGE_WIDTH, i11), false, null, 110, null);
        return appCompatImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(DailyTickVO tick) {
        DailyVO.Timer timer;
        AtomAction onTimerEndAction;
        AppCompatTextView appCompatTextView = this.binding.timer;
        String format = String.format("%s\u2009:\u2009%s\u2009:\u2009%s", Arrays.copyOf(new Object[]{tick.getHours(), tick.getMinutes(), tick.getSeconds()}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        appCompatTextView.setText(format);
        if (tick.getIsFinished()) {
            TimerTicker<Long, DailyTickVO> timerTicker = this.timerTicker;
            if (timerTicker != null) {
                timerTicker.unbind();
            }
            this.timerTicker = null;
            DailyVO boundData = getBoundData();
            if (boundData == null || (timer = boundData.getTimer()) == null || (onTimerEndAction = timer.getOnTimerEndAction()) == null) {
                return;
            }
            this.actionHandler.invoke(onTimerEndAction);
        }
    }

    private final void removeViews(ConstraintLayout constraintLayout, Flow flow) {
        int[] referencedIds = flow.getReferencedIds();
        Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
        for (int i11 : referencedIds) {
            constraintLayout.removeView(constraintLayout.getViewById(i11));
        }
        flow.setReferencedIds(new int[0]);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        TimerTicker<Long, DailyTickVO> timerTicker = this.timerTicker;
        if (timerTicker != null) {
            timerTicker.unbind();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DailyVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AppCompatImageView topImage = this.binding.topImage;
        Intrinsics.checkNotNullExpressionValue(topImage, "topImage");
        ImageViewExtKt.load$default(topImage, item.getBannerImage(), null, null, null, new ImageSize(TOP_BANNER_IMAGE_WIDTH, TOP_BANNER_IMAGE_HEIGHT), false, null, 110, null);
        DailyBackground background = this.binding.background;
        Intrinsics.checkNotNullExpressionValue(background, "background");
        List<String> dailyList = item.getDailyList();
        Flow rewardFlow = this.binding.rewardFlow;
        Intrinsics.checkNotNullExpressionValue(rewardFlow, "rewardFlow");
        bindRewards(background, dailyList, rewardFlow);
        this.binding.title.setText(item.getTitle());
        bindTimer(item.getTimer());
        this.binding.bottomButton.bind(item.getButton(), new DailyViewHolder$bind$1(this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DailyVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
