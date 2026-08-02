package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.feature.general.main.R$string;
import ru.ozon.app.android.travel.feature.general.main.databinding.ViewCalendarBinding;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDaysRoundControlView;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.adapter.CalendarAdapter;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarFullVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.CalendarItemVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.TripMode;
import ru.ozon.app.android.travel.molecules.dto.tripKind.TripKind;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u00020\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010#\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b*\u0010\u001aR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R0\u00100\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000b\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R0\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R0\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00101\u001a\u0004\b:\u00103\"\u0004\b;\u00105R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR4\u0010K\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010<2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010<8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010B¨\u0006L"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/CalendarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "setUpCalendarRecyclerView", "()V", "setUpDateControls", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "tripKind", "showTitle", "(Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;)V", "", "hasSelectedDate", "showEmptyDatePrompt", "(Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;Z)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO;", "item", "showDateControls", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;", "spanInfo", "", "coloredSpan", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$SpanDateInfoVO;)Ljava/lang/CharSequence;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarItemVO;", "items", "scrollPosition", "showCalendarItems", "(Ljava/util/List;Ljava/lang/Integer;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;", "readyButtonVO", "showBottomView", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/CalendarFullVO$ReadyButtonVO;)V", "show", "Lru/ozon/app/android/travel/feature/general/main/databinding/ViewCalendarBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/ViewCalendarBinding;", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "onDateClickListener", "Lkotlin/jvm/functions/Function1;", "getOnDateClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnDateClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onDateControlClickListener", "getOnDateControlClickListener", "setOnDateControlClickListener", "onTripTypeSwitchListener", "getOnTripTypeSwitchListener", "setOnTripTypeSwitchListener", "Lkotlin/Function0;", "onDaysRoundControlClickListener", "Lkotlin/jvm/functions/Function0;", "getOnDaysRoundControlClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnDaysRoundControlClickListener", "(Lkotlin/jvm/functions/Function0;)V", "dateSpanColor", "I", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/adapter/CalendarAdapter;", "calendarAdapter", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/adapter/CalendarAdapter;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getOnReadyClickListener", "setOnReadyClickListener", "onReadyClickListener", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarView extends ConstraintLayout {

    @NotNull
    private final ViewCalendarBinding binding;

    @NotNull
    private final CalendarAdapter calendarAdapter;
    private final int dateSpanColor;
    private Function1<? super LocalDate, Unit> onDateClickListener;
    private Function1<? super Boolean, Unit> onDateControlClickListener;
    private Function0<Unit> onDaysRoundControlClickListener;
    private Function1<? super Boolean, Unit> onTripTypeSwitchListener;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TripKind.values().length];
            try {
                iArr[TripKind.RAILWAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TripKind.TOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TripKind.HOTEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final CharSequence coloredSpan(CalendarFullVO.SpanDateInfoVO spanInfo) {
        if (spanInfo == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(spanInfo.getDate());
        spannableString.setSpan(new ForegroundColorSpan(this.dateSpanColor), spanInfo.getStartIndex(), spanInfo.getEndIndex(), 33);
        return spannableString;
    }

    private final void setUpCalendarRecyclerView() {
        RecyclerView recyclerView = this.binding.calendarDaysRv;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.calendarAdapter);
        RecyclerViewExtensionsKt.addParentTouchesInterceptor(recyclerView, true);
    }

    private final void setUpDateControls() {
        this.binding.calendarStartDateControl.setListener(new CalendarDateControlView.Listener() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarView$setUpDateControls$1
            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView.Listener
            public void onAddReturnDateClicked() {
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView.Listener
            public void onAddStartDateClicked() {
                Function1<Boolean, Unit> onDateControlClickListener = CalendarView.this.getOnDateControlClickListener();
                if (onDateControlClickListener != null) {
                    onDateControlClickListener.invoke(Boolean.TRUE);
                }
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView.Listener
            public void onRemoveReturnDateClicked() {
            }
        });
        this.binding.calendarReturnDateControl.setListener(new CalendarDateControlView.Listener() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarView$setUpDateControls$2
            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView.Listener
            public void onAddReturnDateClicked() {
                Function1<Boolean, Unit> onTripTypeSwitchListener = CalendarView.this.getOnTripTypeSwitchListener();
                if (onTripTypeSwitchListener != null) {
                    onTripTypeSwitchListener.invoke(Boolean.TRUE);
                }
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView.Listener
            public void onAddStartDateClicked() {
                Function1<Boolean, Unit> onDateControlClickListener = CalendarView.this.getOnDateControlClickListener();
                if (onDateControlClickListener != null) {
                    onDateControlClickListener.invoke(Boolean.FALSE);
                }
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView.Listener
            public void onRemoveReturnDateClicked() {
                Function1<Boolean, Unit> onTripTypeSwitchListener = CalendarView.this.getOnTripTypeSwitchListener();
                if (onTripTypeSwitchListener != null) {
                    onTripTypeSwitchListener.invoke(Boolean.FALSE);
                }
            }
        });
        this.binding.calendarTourStartDateControl.setListener(new CalendarDateControlView.Listener() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarView$setUpDateControls$3
            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView.Listener
            public void onAddReturnDateClicked() {
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView.Listener
            public void onAddStartDateClicked() {
                Function1<Boolean, Unit> onDateControlClickListener = CalendarView.this.getOnDateControlClickListener();
                if (onDateControlClickListener != null) {
                    onDateControlClickListener.invoke(Boolean.TRUE);
                }
            }

            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView.Listener
            public void onRemoveReturnDateClicked() {
            }
        });
        this.binding.calendarTourDaysRoundControl.setListener(new CalendarDaysRoundControlView.Listener() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarView$setUpDateControls$4
            @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDaysRoundControlView.Listener
            public void onDaysRoundControlClicked() {
                Function0<Unit> onDaysRoundControlClickListener = CalendarView.this.getOnDaysRoundControlClickListener();
                if (onDaysRoundControlClickListener != null) {
                    onDaysRoundControlClickListener.invoke();
                }
            }
        });
    }

    private final void showBottomView(CalendarFullVO.ReadyButtonVO readyButtonVO) {
        this.binding.calendarBottomView.show(readyButtonVO);
    }

    private final void showCalendarItems(List<? extends CalendarItemVO> items, Integer scrollPosition) {
        this.calendarAdapter.update(items, new CalendarView$showCalendarItems$1(scrollPosition, this));
    }

    private final void showDateControls(CalendarFullVO item) {
        Group calendarDateControlGroup = this.binding.calendarDateControlGroup;
        Intrinsics.checkNotNullExpressionValue(calendarDateControlGroup, "calendarDateControlGroup");
        calendarDateControlGroup.setVisibility(item.getAreDateControlsVisible() ? 0 : 8);
        if (item.getAreDateControlsVisible()) {
            CharSequence coloredSpan = coloredSpan(item.getSelectedDepartureDateSpanInfo());
            CalendarDateControlView calendarDateControlView = this.binding.calendarStartDateControl;
            if (coloredSpan == null) {
                calendarDateControlView.showEmptyDate();
            } else {
                calendarDateControlView.showDate(coloredSpan);
            }
            CalendarDateControlView calendarDateControlView2 = this.binding.calendarReturnDateControl;
            calendarDateControlView2.setEnabled(item.getIsReturnDateControlEnabled());
            if (item.getTripMode() == TripMode.THERE) {
                calendarDateControlView2.showAddButton();
            } else {
                CharSequence coloredSpan2 = coloredSpan(item.getSelectedReturnDateSpanInfo());
                if (coloredSpan2 == null) {
                    calendarDateControlView2.showEmptyDate();
                } else {
                    calendarDateControlView2.showDate(coloredSpan2);
                }
            }
        }
        Group calendarTourDateControlGroup = this.binding.calendarTourDateControlGroup;
        Intrinsics.checkNotNullExpressionValue(calendarTourDateControlGroup, "calendarTourDateControlGroup");
        calendarTourDateControlGroup.setVisibility(item.getAreTourDateControlsVisible() ? 0 : 8);
        if (item.getAreTourDateControlsVisible()) {
            CharSequence coloredSpan3 = coloredSpan(item.getSelectedDepartureDateSpanInfo());
            CalendarDateControlView calendarDateControlView3 = this.binding.calendarTourStartDateControl;
            if (coloredSpan3 == null) {
                calendarDateControlView3.showEmptyDate();
            } else {
                calendarDateControlView3.showDate(coloredSpan3);
            }
            this.binding.calendarTourDaysRoundControl.showDaysRound(item.getDaysRoundReadableText(), item.getIsDaysRoundChecked());
        }
    }

    private final void showEmptyDatePrompt(TripKind tripKind, boolean hasSelectedDate) {
        AppCompatTextView appCompatTextView = this.binding.calendarEmptyDateTv;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(!hasSelectedDate ? 0 : 8);
        appCompatTextView.setText(StringProvider.getString(tripKind == TripKind.TOUR ? R$string.calendar_tour_select_date : R$string.calendar_select_date));
    }

    private final void showTitle(TripKind tripKind) {
        AppCompatTextView appCompatTextView = this.binding.calendarTitleTv;
        int i11 = WhenMappings.$EnumSwitchMapping$0[tripKind.ordinal()];
        appCompatTextView.setText(i11 != 1 ? i11 != 2 ? i11 != 3 ? StringProvider.getString(R$string.calendar_flight_dates) : StringProvider.getString(R$string.calendar_hotel_date_title) : StringProvider.getString(R$string.calendar_tour_date_title_android) : StringProvider.getString(R$string.calendar_railway_dates_android));
    }

    public final Function1<LocalDate, Unit> getOnDateClickListener() {
        return this.onDateClickListener;
    }

    public final Function1<Boolean, Unit> getOnDateControlClickListener() {
        return this.onDateControlClickListener;
    }

    public final Function0<Unit> getOnDaysRoundControlClickListener() {
        return this.onDaysRoundControlClickListener;
    }

    public final Function1<Boolean, Unit> getOnTripTypeSwitchListener() {
        return this.onTripTypeSwitchListener;
    }

    public final void setOnDateClickListener(Function1<? super LocalDate, Unit> function1) {
        this.onDateClickListener = function1;
    }

    public final void setOnDateControlClickListener(Function1<? super Boolean, Unit> function1) {
        this.onDateControlClickListener = function1;
    }

    public final void setOnDaysRoundControlClickListener(Function0<Unit> function0) {
        this.onDaysRoundControlClickListener = function0;
    }

    public final void setOnReadyClickListener(Function0<Unit> function0) {
        this.binding.calendarBottomView.setOnReadyClickListener(function0);
    }

    public final void setOnTripTypeSwitchListener(Function1<? super Boolean, Unit> function1) {
        this.onTripTypeSwitchListener = function1;
    }

    public final void show(@NotNull CalendarFullVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        showTitle(item.getTripKind());
        showEmptyDatePrompt(item.getTripKind(), item.getHasSelectedDate());
        showDateControls(item);
        showCalendarItems(item.getCalendarItems(), item.getScrollPosition());
        showBottomView(item.getReadyButton());
    }

    public /* synthetic */ CalendarView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewCalendarBinding inflate = ViewCalendarBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.dateSpanColor = ThemeExtKt.themeColor(context, R$attr.textSecondary);
        this.calendarAdapter = new CalendarAdapter(new CalendarView$calendarAdapter$1(this));
        setUpCalendarRecyclerView();
        setUpDateControls();
    }
}
