package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.I;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.calendar.R$array;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/WeekRowLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "padding", "newTextView", "Landroidx/appcompat/widget/AppCompatTextView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WeekRowLayout extends LinearLayout {
    private final int padding;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.WeekRowLayout$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<String, AppCompatTextView> {
        AnonymousClass1(Object obj) {
            super(1, obj, WeekRowLayout.class, "newTextView", "newTextView(Ljava/lang/String;)Landroidx/appcompat/widget/AppCompatTextView;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AppCompatTextView invoke(String p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return ((WeekRowLayout) this.receiver).newTextView(p02);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WeekRowLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView newTextView(String title) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        appCompatTextView.setLayoutParams(layoutParams);
        int i11 = this.padding;
        appCompatTextView.setPadding(i11, i11, i11, i11);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Caption_AC);
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textOriginalpriceAvailable));
        appCompatTextView.setText(title);
        return appCompatTextView;
    }

    public /* synthetic */ WeekRowLayout(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekRowLayout(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.padding = ResourceExtKt.toPx(4, context);
        setOrientation(0);
        String[] stringArray = context.getResources().getStringArray(R$array.calendar_day_short_names);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        Iterator it = l.v(C7705l.g(stringArray), new AnonymousClass1(this)).iterator();
        while (true) {
            I.a aVar = (I.a) it;
            if (!aVar.hasNext()) {
                return;
            } else {
                addView((View) aVar.next());
            }
        }
    }
}
