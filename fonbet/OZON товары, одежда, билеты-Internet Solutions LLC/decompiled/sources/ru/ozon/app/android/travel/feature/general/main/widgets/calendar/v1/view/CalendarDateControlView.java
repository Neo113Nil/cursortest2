package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.calendar.R$styleable;
import ru.ozon.app.android.travel.feature.general.main.R$string;
import ru.ozon.app.android.travel.feature.general.main.databinding.ViewCalendarDateControlBinding;
import ru.ozon.app.android.travel.ui.molecules.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001%B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDateControlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "setOnClickListeners", "()V", "setOnRemoveReturnDateClickListener", "setOnAddDateClickListener", "", "date", "showDate", "(Ljava/lang/CharSequence;)V", "showEmptyDate", "showAddButton", "Lru/ozon/app/android/travel/feature/general/main/databinding/ViewCalendarDateControlBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/ViewCalendarDateControlBinding;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDateControlView$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDateControlView$Listener;", "getListener", "()Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDateControlView$Listener;", "setListener", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDateControlView$Listener;)V", "spanColor", "I", "", "isForStartDate", "Z", "Listener", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarDateControlView extends ConstraintLayout {

    @NotNull
    private final ViewCalendarDateControlBinding binding;
    private boolean isForStartDate;
    private Listener listener;
    private int spanColor;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarDateControlView$Listener;", "", "onAddReturnDateClicked", "", "onRemoveReturnDateClicked", "onAddStartDateClicked", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void onAddReturnDateClicked();

        void onAddStartDateClicked();

        void onRemoveReturnDateClicked();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarDateControlView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setOnAddDateClickListener() {
        setOnClickListener(new Jm0.a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnAddDateClickListener$lambda$3(CalendarDateControlView calendarDateControlView, View view) {
        AppCompatTextView dateControlAddReturnDateTv = calendarDateControlView.binding.dateControlAddReturnDateTv;
        Intrinsics.checkNotNullExpressionValue(dateControlAddReturnDateTv, "dateControlAddReturnDateTv");
        if (dateControlAddReturnDateTv.getVisibility() == 0) {
            Listener listener = calendarDateControlView.listener;
            if (listener != null) {
                listener.onAddReturnDateClicked();
                return;
            }
            return;
        }
        Listener listener2 = calendarDateControlView.listener;
        if (listener2 != null) {
            listener2.onAddStartDateClicked();
        }
    }

    private final void setOnClickListeners() {
        setOnRemoveReturnDateClickListener();
        setOnAddDateClickListener();
    }

    private final void setOnRemoveReturnDateClickListener() {
        this.binding.dateControlRemoveBtn.setOnClickListener(new FX.a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnRemoveReturnDateClickListener$lambda$2(CalendarDateControlView calendarDateControlView, View view) {
        Listener listener = calendarDateControlView.listener;
        if (listener != null) {
            listener.onRemoveReturnDateClicked();
        }
    }

    public final void setListener(Listener listener) {
        this.listener = listener;
    }

    public final void showAddButton() {
        if (this.isForStartDate) {
            return;
        }
        AppCompatTextView dateControlDateTv = this.binding.dateControlDateTv;
        Intrinsics.checkNotNullExpressionValue(dateControlDateTv, "dateControlDateTv");
        dateControlDateTv.setVisibility(8);
        AppCompatImageView dateControlRemoveBtn = this.binding.dateControlRemoveBtn;
        Intrinsics.checkNotNullExpressionValue(dateControlRemoveBtn, "dateControlRemoveBtn");
        dateControlRemoveBtn.setVisibility(8);
        AppCompatTextView dateControlAddReturnDateTv = this.binding.dateControlAddReturnDateTv;
        Intrinsics.checkNotNullExpressionValue(dateControlAddReturnDateTv, "dateControlAddReturnDateTv");
        dateControlAddReturnDateTv.setVisibility(0);
    }

    public final void showDate(@NotNull CharSequence date) {
        Intrinsics.checkNotNullParameter(date, "date");
        AppCompatTextView appCompatTextView = this.binding.dateControlDateTv;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(0);
        appCompatTextView.setText(date);
        if (this.isForStartDate) {
            return;
        }
        AppCompatTextView dateControlAddReturnDateTv = this.binding.dateControlAddReturnDateTv;
        Intrinsics.checkNotNullExpressionValue(dateControlAddReturnDateTv, "dateControlAddReturnDateTv");
        dateControlAddReturnDateTv.setVisibility(8);
        AppCompatImageView dateControlRemoveBtn = this.binding.dateControlRemoveBtn;
        Intrinsics.checkNotNullExpressionValue(dateControlRemoveBtn, "dateControlRemoveBtn");
        dateControlRemoveBtn.setVisibility(0);
    }

    public final void showEmptyDate() {
        AppCompatTextView appCompatTextView = this.binding.dateControlDateTv;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(0);
        appCompatTextView.setText((CharSequence) null);
        if (this.isForStartDate) {
            return;
        }
        AppCompatTextView dateControlAddReturnDateTv = this.binding.dateControlAddReturnDateTv;
        Intrinsics.checkNotNullExpressionValue(dateControlAddReturnDateTv, "dateControlAddReturnDateTv");
        dateControlAddReturnDateTv.setVisibility(8);
        AppCompatImageView dateControlRemoveBtn = this.binding.dateControlRemoveBtn;
        Intrinsics.checkNotNullExpressionValue(dateControlRemoveBtn, "dateControlRemoveBtn");
        dateControlRemoveBtn.setVisibility(0);
    }

    public /* synthetic */ CalendarDateControlView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarDateControlView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewCalendarDateControlBinding inflate = ViewCalendarDateControlBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.spanColor = ThemeExtKt.themeColor(context, R$attr.textSecondary);
        this.isForStartDate = true;
        int px = ResourceExtKt.toPx(12, context);
        setPadding(px, px, px, px);
        setBackgroundResource(R$drawable.bg_travel_date_control);
        setOnClickListeners();
        String string = StringProvider.getString(R$string.calendar_to_android);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TravelCalendarDateControlView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                this.spanColor = obtainStyledAttributes.getColor(R$styleable.TravelCalendarDateControlView_dateControlSpanColor, this.spanColor);
                this.isForStartDate = obtainStyledAttributes.getBoolean(R$styleable.TravelCalendarDateControlView_isForStartDate, this.isForStartDate);
                String string2 = obtainStyledAttributes.getString(R$styleable.TravelCalendarDateControlView_dateTypeLabel);
                string = string2 != null ? string2 : string;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        inflate.dateControlDateTv.setHint(string);
    }
}
