package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view;

import Cz.ViewOnClickListenerC2788a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.databinding.ViewCalendarBottomBinding;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarFullVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarBottomView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "setUpReadyButton", "()V", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;", "readyButtonVO", "show", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;)V", "Lru/ozon/app/android/travel/feature/general/main/databinding/ViewCalendarBottomBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/ViewCalendarBottomBinding;", "Lkotlin/Function0;", "onReadyClickListener", "Lkotlin/jvm/functions/Function0;", "getOnReadyClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnReadyClickListener", "(Lkotlin/jvm/functions/Function0;)V", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarBottomView extends FrameLayout {

    @NotNull
    private final ViewCalendarBottomBinding binding;
    private Function0<Unit> onReadyClickListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarBottomView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setUpReadyButton() {
        this.binding.calendarSelectDateButton.setOnClickListener(new ViewOnClickListenerC2788a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpReadyButton$lambda$0(CalendarBottomView calendarBottomView, View view) {
        Function0<Unit> function0 = calendarBottomView.onReadyClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setOnReadyClickListener(Function0<Unit> function0) {
        this.onReadyClickListener = function0;
    }

    public final void show(@NotNull CalendarFullVO.ReadyButtonVO readyButtonVO) {
        Intrinsics.checkNotNullParameter(readyButtonVO, "readyButtonVO");
        setVisibility(readyButtonVO.getIsVisible() ? 0 : 8);
        this.binding.calendarSelectDateButton.setText(readyButtonVO.getText());
    }

    public /* synthetic */ CalendarBottomView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarBottomView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewCalendarBottomBinding inflate = ViewCalendarBottomBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setElevation(ResourceExtKt.toPxF(8, context));
        int px = ResourceExtKt.toPx(16, context);
        setPadding(px, px, px, px);
        setUpReadyButton();
    }
}
