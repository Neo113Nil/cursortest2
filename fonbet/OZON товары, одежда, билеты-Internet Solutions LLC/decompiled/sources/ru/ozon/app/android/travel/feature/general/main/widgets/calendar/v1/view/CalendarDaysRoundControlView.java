package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.databinding.ViewCalendarDaysRoundControlBinding;
import ru.ozon.app.android.travel.ui.molecules.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001eB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDaysRoundControlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "setOnClickListener", "()V", "", "daysRound", "", "isChecked", "showDaysRound", "(Ljava/lang/String;Z)V", "Lru/ozon/app/android/travel/feature/general/main/databinding/ViewCalendarDaysRoundControlBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/ViewCalendarDaysRoundControlBinding;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDaysRoundControlView$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDaysRoundControlView$Listener;", "getListener", "()Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDaysRoundControlView$Listener;", "setListener", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDaysRoundControlView$Listener;)V", "Listener", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarDaysRoundControlView extends ConstraintLayout {

    @NotNull
    private final ViewCalendarDaysRoundControlBinding binding;
    private Listener listener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDaysRoundControlView$Listener;", "", "onDaysRoundControlClicked", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void onDaysRoundControlClicked();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarDaysRoundControlView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setOnClickListener() {
        setOnClickListener(new OD.a(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListener$lambda$0(CalendarDaysRoundControlView calendarDaysRoundControlView, View view) {
        Listener listener = calendarDaysRoundControlView.listener;
        if (listener != null) {
            listener.onDaysRoundControlClicked();
        }
    }

    public final void setListener(Listener listener) {
        this.listener = listener;
    }

    public final void showDaysRound(@NotNull String daysRound, boolean isChecked) {
        Intrinsics.checkNotNullParameter(daysRound, "daysRound");
        this.binding.daysRoundControlTv.setText(daysRound);
        this.binding.daysRoundControlCheckboxView.setSelected(isChecked);
    }

    public /* synthetic */ CalendarDaysRoundControlView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarDaysRoundControlView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewCalendarDaysRoundControlBinding inflate = ViewCalendarDaysRoundControlBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        int px = ResourceExtKt.toPx(12, context);
        setPadding(px, px, px, px);
        setBackgroundResource(R$drawable.bg_travel_date_control);
        setOnClickListener();
    }
}
