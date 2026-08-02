package ru.ozon.app.android.travel.calendar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.travel.calendar.R$id;
import ru.ozon.app.android.travel.calendar.view.adapter.CalendarAdapter;
import ru.ozon.app.android.travel.calendar.view.adapter.CalendarItemDecoration;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarRowItemVO;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0014J\u000e\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0014J\u000e\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0007J%\u0010)\u001a\u00020\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u000eH\u0002R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "onDateClickListener", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "", "getOnDateClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnDateClickListener", "(Lkotlin/jvm/functions/Function1;)V", "boundedData", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "calendarAdapter", "Lru/ozon/app/android/travel/calendar/view/adapter/CalendarAdapter;", "weekRowLayout", "Lru/ozon/app/android/travel/calendar/view/WeekRowLayout;", "daysRv", "Lru/ozon/app/android/travel/calendar/view/FakeScrollRecyclerView;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "dp12", "dp16", "dp130", "onSizeChanged", "width", "height", "oldw", "oldh", "bind", "item", "setBottomOffset", "offset", "showCalendarItems", "items", "", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;", "scrollPosition", "(Ljava/util/List;Ljava/lang/Integer;)V", "placeViews", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarView extends ConstraintLayout {
    private CalendarVO boundedData;

    @NotNull
    private final CalendarAdapter calendarAdapter;

    @NotNull
    private final FakeScrollRecyclerView daysRv;
    private final int dp12;
    private final int dp130;
    private final int dp16;

    @NotNull
    private final LinearLayoutManager layoutManager;
    private Function1<? super LocalDate, Unit> onDateClickListener;

    @NotNull
    private final WeekRowLayout weekRowLayout;

    public /* synthetic */ CalendarView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void placeViews() {
        addView(this.daysRv);
        addView(this.weekRowLayout);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, this.weekRowLayout.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.weekRowLayout.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.weekRowLayout.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.daysRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.daysRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.daysRv.getId(), this.weekRowLayout.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.daysRv.getId(), 0, 0, 4, null);
        dVar.f(this);
    }

    private final void showCalendarItems(List<? extends CalendarRowItemVO> items, Integer scrollPosition) {
        this.calendarAdapter.update(items, new CalendarView$showCalendarItems$1(scrollPosition, this));
    }

    public final void bind(@NotNull CalendarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item;
        showCalendarItems(item.getCalendarItems(), item.getScrollPosition());
    }

    public final Function1<LocalDate, Unit> getOnDateClickListener() {
        return this.onDateClickListener;
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        int height2 = this.weekRowLayout.getHeight() / 2;
        ViewExtKt.updatePadding$default(this.daysRv, 0, height2, 0, 0, 13, null);
        ViewGroup.LayoutParams layoutParams = this.daysRv.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        if (((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) layoutParams)).topMargin != height2) {
            d dVar = new d();
            dVar.p(this);
            ConstraintSetExtKt.topToTop(dVar, this.daysRv.getId(), this.weekRowLayout.getId(), height2);
            dVar.f(this);
        }
    }

    public final void setBottomOffset(int offset) {
        ViewExtKt.updatePadding$default(this.daysRv, 0, 0, 0, offset, 7, null);
    }

    public final void setOnDateClickListener(Function1<? super LocalDate, Unit> function1) {
        this.onDateClickListener = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        CalendarAdapter calendarAdapter = new CalendarAdapter(new CalendarView$calendarAdapter$1(this), new CalendarView$calendarAdapter$2(this));
        this.calendarAdapter = calendarAdapter;
        int px = ResourceExtKt.toPx(12, context);
        this.dp12 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        int px3 = ResourceExtKt.toPx(130, context);
        this.dp130 = px3;
        float pxF = ResourceExtKt.toPxF(CornerRadius.RADIUS_600.getPx(), context);
        WeekRowLayout weekRowLayout = new WeekRowLayout(context, null, 0, 0, 14, null);
        weekRowLayout.setId(R$id.calendarViewWeekRowLayout);
        weekRowLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        weekRowLayout.setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), pxF));
        weekRowLayout.setPadding(px2, px, px2, px);
        this.weekRowLayout = weekRowLayout;
        FakeScrollRecyclerView fakeScrollRecyclerView = new FakeScrollRecyclerView(context, null, 0, 6, null);
        fakeScrollRecyclerView.setId(R$id.calendarViewDaysRv);
        fakeScrollRecyclerView.setLayoutParams(new ConstraintLayout.b(0, 0));
        fakeScrollRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.layoutManager = linearLayoutManager;
        fakeScrollRecyclerView.setLayoutManager(linearLayoutManager);
        fakeScrollRecyclerView.setAdapter(calendarAdapter);
        fakeScrollRecyclerView.addItemDecoration(new CalendarItemDecoration(context, pxF));
        fakeScrollRecyclerView.setClipToPadding(false);
        fakeScrollRecyclerView.setNestedScrollingEnabled(false);
        fakeScrollRecyclerView.setItemAnimator(null);
        RecyclerViewExtensionsKt.addParentTouchesInterceptor(fakeScrollRecyclerView, true);
        ViewExtKt.updatePadding$default(fakeScrollRecyclerView, 0, 0, 0, px3, 7, null);
        this.daysRv = fakeScrollRecyclerView;
        placeViews();
    }
}
