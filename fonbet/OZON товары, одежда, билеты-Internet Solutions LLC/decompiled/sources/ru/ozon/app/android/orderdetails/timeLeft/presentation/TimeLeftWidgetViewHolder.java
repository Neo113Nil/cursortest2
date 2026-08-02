package ru.ozon.app.android.orderdetails.timeLeft.presentation;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.WidgetTimeLeftLayoutBinding;
import ru.ozon.app.android.orderdetails.timeLeft.presentation.buttons.SingleAtomsAdapter;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.timer.OneSecondTimer;
import ru.ozon.app.android.utils.timer.TimerManager;
import ru.ozon.app.android.utils.timer.TimerTick;
import ru.ozon.app.android.utils.timer.TimerUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u001cJ\u001f\u0010'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0012038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010B\u001a\u00060@j\u0002`A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimeLeftWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimeLeftVO;", "Lru/ozon/app/android/orderdetails/databinding/WidgetTimeLeftLayoutBinding;", "binding", "Ll10/b;", "composerController", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/WidgetTimeLeftLayoutBinding;Ll10/b;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "timeLeft", "", "setTimerText", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/text/Layout;", "", "checkNeedNewLine", "(Landroid/text/Layout;)Z", "calculateMaxTimerWidth", "(Ljava/lang/String;)V", "refresh", "()V", "", "onTimerTick", "(J)V", "onTimerComplete", "startTimer", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimeLeftVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/WidgetTimeLeftLayoutBinding;", "Ll10/b;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimerVO;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimerVO;", "Lru/ozon/app/android/utils/timer/TimerManager;", "timerManager", "Lru/ozon/app/android/utils/timer/TimerManager;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/orderdetails/timeLeft/presentation/buttons/SingleAtomsAdapter;", "singleAtomsAdapter", "Lru/ozon/app/android/orderdetails/timeLeft/presentation/buttons/SingleAtomsAdapter;", "Landroidx/appcompat/widget/AppCompatTextView;", "maxWidthTimerTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "", "maxTimerTextWidth", "I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "textBuilder", "Ljava/lang/StringBuilder;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TimeLeftWidgetViewHolder extends k<TimeLeftVO> {

    @NotNull
    private final WidgetTimeLeftLayoutBinding binding;

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final CreateAndPayViewModel createAndPayViewModel;
    private int maxTimerTextWidth;

    @NotNull
    private final AppCompatTextView maxWidthTimerTextView;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final SingleAtomsAdapter singleAtomsAdapter;

    @NotNull
    private final StartupArgsService startupArgsService;

    @NotNull
    private final StringBuilder textBuilder;
    private TimerVO timer;

    @NotNull
    private final TimerManager timerManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimeLeftWidgetViewHolder$Companion;", "", "<init>", "()V", "WIDE_CHAR", "", "DELIMITER_CHAR", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public TimeLeftWidgetViewHolder(@NotNull WidgetTimeLeftLayoutBinding binding, @NotNull InterfaceC7851b composerController, @NotNull ComposerReferences composerReferences, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull StartupArgsService startupArgsService) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.composerController = composerController;
        this.createAndPayViewModel = createAndPayViewModel;
        this.startupArgsService = startupArgsService;
        this.timerManager = new OneSecondTimer.Builder().scopeIn(K.a(this)).onTick(new TimeLeftWidgetViewHolder$timerManager$1(this)).onComplete(new TimeLeftWidgetViewHolder$timerManager$2(this)).build();
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).onClick(new TimeLeftWidgetViewHolder$onAction$1(this)).buildHandler();
        this.onAction = buildHandler;
        SingleAtomsAdapter singleAtomsAdapter = new SingleAtomsAdapter(buildHandler);
        this.singleAtomsAdapter = singleAtomsAdapter;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView, context, R$style.TextStyle_Body_M_Bold_White);
        this.maxWidthTimerTextView = appCompatTextView;
        this.textBuilder = new StringBuilder();
        RecyclerView recyclerView = binding.buttonsForTimeLeftRV;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager.setFlexWrap(1);
        flexboxLayoutManager.setJustifyContent(0);
        flexboxLayoutManager.setAlignItems(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter(singleAtomsAdapter);
        binding.timerRootCl.addView(appCompatTextView);
        ViewExtKt.invisible(appCompatTextView);
    }

    private final void calculateMaxTimerWidth(String timeLeft) {
        AppCompatTextView appCompatTextView = this.maxWidthTimerTextView;
        ArrayList arrayList = new ArrayList(timeLeft.length());
        for (int i11 = 0; i11 < timeLeft.length(); i11++) {
            char charAt = timeLeft.charAt(i11);
            if (charAt != ':') {
                charAt = '0';
            }
            arrayList.add(Character.valueOf(charAt));
        }
        appCompatTextView.setText(C7714v.V(arrayList, "", null, null, null, 62));
        this.maxWidthTimerTextView.measure(0, 0);
        this.maxTimerTextWidth = this.maxWidthTimerTextView.getMeasuredWidth();
    }

    private final boolean checkNeedNewLine(Layout layout) {
        return ((float) layout.getWidth()) - layout.getPrimaryHorizontal(layout.getText().length()) <= ((float) this.maxTimerTextWidth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimerComplete() {
        refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimerTick(long timeLeft) {
        String formatTime = TimerUtilsKt.formatTime(new TimerTick(timeLeft));
        TimerVO timerVO = this.timer;
        String title = timerVO != null ? timerVO.getTitle() : null;
        if (title == null) {
            title = "";
        }
        setTimerText(title, formatTime);
        if (this.startupArgsService.getArgValue("STATIC_TIMERS")) {
            this.timerManager.stopTimer();
        }
    }

    private final void refresh() {
        InterfaceC7851b.a.a(this.composerController, null, null, null, null, 15);
        this.timer = null;
        this.timerManager.stopTimer();
    }

    private final void setTimerText(String title, String timeLeft) {
        TextView textView = this.binding.textTv;
        textView.setText(title);
        calculateMaxTimerWidth(timeLeft);
        StringBuilder sb2 = this.textBuilder;
        h.s(sb2);
        sb2.append(textView.getText());
        Layout layout = textView.getLayout();
        Intrinsics.checkNotNullExpressionValue(layout, "getLayout(...)");
        sb2.append(checkNeedNewLine(layout) ? "\n" : " ");
        sb2.append(timeLeft);
        textView.setText(sb2.toString());
    }

    private final void startTimer() {
        DateTime endTime;
        TimerVO timerVO = this.timer;
        if (timerVO == null || (endTime = timerVO.getEndTime()) == null) {
            return;
        }
        this.timerManager.startTimer(endTime.getMillis());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        TimerVO timerVO = this.timer;
        if (timerVO != null && timerVO.getEndTime() != null) {
            startTimer();
            return;
        }
        TextView textView = this.binding.textTv;
        TimerVO timerVO2 = this.timer;
        textView.setText(timerVO2 != null ? timerVO2.getTitle() : null);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        this.timerManager.stopTimer();
        super.onViewOutOfVisibleBounds();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TimeLeftVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetTimeLeftLayoutBinding widgetTimeLeftLayoutBinding = this.binding;
        TimerVO timer = item.getTimer();
        this.timer = timer;
        ImageView iconIv = widgetTimeLeftLayoutBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ImageViewExtKt.load$default(iconIv, timer.getIcon(), null, null, null, null, false, null, 126, null);
        widgetTimeLeftLayoutBinding.iconIv.setColorFilter(timer.getIconColor(), PorterDuff.Mode.SRC_IN);
        widgetTimeLeftLayoutBinding.textTv.setTextColor(timer.getTextColor());
        Drawable background = widgetTimeLeftLayoutBinding.timerRootCl.getBackground();
        Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(timer.getBackgroundColor());
        List<AtomDTO> buttons = item.getButtons();
        if (buttons == null) {
            RecyclerView buttonsForTimeLeftRV = widgetTimeLeftLayoutBinding.buttonsForTimeLeftRV;
            Intrinsics.checkNotNullExpressionValue(buttonsForTimeLeftRV, "buttonsForTimeLeftRV");
            ViewExtKt.gone(buttonsForTimeLeftRV);
            Space spaceView = widgetTimeLeftLayoutBinding.spaceView;
            Intrinsics.checkNotNullExpressionValue(spaceView, "spaceView");
            ViewExtKt.show(spaceView);
            return;
        }
        RecyclerView buttonsForTimeLeftRV2 = widgetTimeLeftLayoutBinding.buttonsForTimeLeftRV;
        Intrinsics.checkNotNullExpressionValue(buttonsForTimeLeftRV2, "buttonsForTimeLeftRV");
        ViewExtKt.show(buttonsForTimeLeftRV2);
        Space spaceView2 = widgetTimeLeftLayoutBinding.spaceView;
        Intrinsics.checkNotNullExpressionValue(spaceView2, "spaceView");
        ViewExtKt.gone(spaceView2);
        this.singleAtomsAdapter.submitList(buttons);
    }
}
