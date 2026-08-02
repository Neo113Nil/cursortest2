package ru.ozon.app.android.travel.calendar.view.adapter;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarRowItemVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/adapter/TravelCalendarMonthTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO$CalendarMonthTitleVO;", "item", "", "bind", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarRowItemVO$CalendarMonthTitleVO;)V", "Landroidx/appcompat/widget/AppCompatTextView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/appcompat/widget/AppCompatTextView;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelCalendarMonthTitleViewHolder extends RecyclerView.C {
    private final AppCompatTextView title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCalendarMonthTitleViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View view2 = this.itemView;
        this.title = view2 instanceof AppCompatTextView ? (AppCompatTextView) view2 : null;
    }

    public final void bind(@NotNull CalendarRowItemVO.CalendarMonthTitleVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = this.title;
        if (appCompatTextView != null) {
            appCompatTextView.setText(item.getTitle());
        }
    }
}
