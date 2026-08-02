package ru.ozon.app.android.travel.calendar.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarRowItemVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/adapter/CalendarMonthTitleAdapterDelegate;", "Lru/ozon/app/android/travel/calendar/utils/TravelAdapterDelegate;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;", "<init>", "()V", "item", "", "isForViewType", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;)Z", "", "provideLayoutRes", "()I", "Landroid/view/ViewGroup;", "parent", "Landroidx/appcompat/widget/AppCompatTextView;", "provideView", "(Landroid/view/ViewGroup;)Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/view/View;", "view", "Lru/ozon/app/android/travel/calendar/view/adapter/TravelCalendarMonthTitleViewHolder;", "createViewHolder", "(Landroid/view/View;)Lru/ozon/app/android/travel/calendar/view/adapter/TravelCalendarMonthTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO;Landroidx/recyclerview/widget/RecyclerView$C;)V", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarMonthTitleAdapterDelegate implements TravelAdapterDelegate<CalendarRowItemVO> {
    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public void onAttach(@NotNull RecyclerView.C c11) {
        TravelAdapterDelegate.DefaultImpls.onAttach(this, c11);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup viewGroup) {
        return TravelAdapterDelegate.DefaultImpls.onCreateViewHolder(this, viewGroup);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public void onDetach(@NotNull RecyclerView.C c11) {
        TravelAdapterDelegate.DefaultImpls.onDetach(this, c11);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public int provideLayoutRes() {
        return 0;
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    @NotNull
    public TravelCalendarMonthTitleViewHolder createViewHolder(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new TravelCalendarMonthTitleViewHolder(view);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public boolean isForViewType(@NotNull CalendarRowItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof CalendarRowItemVO.CalendarMonthTitleVO;
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    public void onBindViewHolder(@NotNull CalendarRowItemVO item, @NotNull RecyclerView.C viewHolder) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        ((TravelCalendarMonthTitleViewHolder) viewHolder).bind((CalendarRowItemVO.CalendarMonthTitleVO) item);
    }

    @Override // ru.ozon.app.android.travel.calendar.utils.TravelAdapterDelegate
    @NotNull
    public AppCompatTextView provideView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AppCompatTextView appCompatTextView = new AppCompatTextView(parent.getContext());
        appCompatTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setTextAppearance(UniTextStyles.HEADLINE_500_MEDIUM.getResId());
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textPrimary));
        return appCompatTextView;
    }
}
