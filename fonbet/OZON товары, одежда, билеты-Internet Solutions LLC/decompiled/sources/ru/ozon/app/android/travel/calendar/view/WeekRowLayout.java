package ru.ozon.app.android.travel.calendar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.H;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.calendar.R$array;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/WeekRowLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "padding", "workWeekDayTextColor", "weekendDayTextColor", "newTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "index", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WeekRowLayout extends LinearLayout {
    private final int padding;
    private final int weekendDayTextColor;
    private final int workWeekDayTextColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.calendar.view.WeekRowLayout$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function2<Integer, String, AppCompatTextView> {
        AnonymousClass1(Object obj) {
            super(2, obj, WeekRowLayout.class, "newTextView", "newTextView(ILjava/lang/String;)Landroidx/appcompat/widget/AppCompatTextView;", 0);
        }

        public final AppCompatTextView invoke(int i11, String p12) {
            Intrinsics.checkNotNullParameter(p12, "p1");
            return ((WeekRowLayout) this.receiver).newTextView(i11, p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ AppCompatTextView invoke(Integer num, String str) {
            return invoke(num.intValue(), str);
        }
    }

    public /* synthetic */ WeekRowLayout(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView newTextView(int index, String title) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        appCompatTextView.setLayoutParams(layoutParams);
        int i11 = this.padding;
        appCompatTextView.setPadding(i11, i11, i11, i11);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextAppearance(UniTextStyles.BODY_300_X_SMALL.getResId());
        appCompatTextView.setAllCaps(true);
        appCompatTextView.setText(title);
        appCompatTextView.setTextColor(index + 1 > 5 ? this.weekendDayTextColor : this.workWeekDayTextColor);
        return appCompatTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekRowLayout(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.padding = ResourceExtKt.toPx(4, context);
        this.workWeekDayTextColor = ThemeExtKt.themeColor(context, R$attr.textTertiary);
        this.weekendDayTextColor = ThemeExtKt.themeColor(context, R$attr.textDiscountUnavialable);
        setOrientation(0);
        String[] stringArray = context.getResources().getStringArray(R$array.calendar_day_short_names);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        Sequence g10 = C7705l.g(stringArray);
        AnonymousClass1 transform = new AnonymousClass1(this);
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator it = new H(g10, transform).iterator();
        while (true) {
            H.a aVar = (H.a) it;
            if (!aVar.hasNext()) {
                return;
            } else {
                addView((View) aVar.next());
            }
        }
    }
}
