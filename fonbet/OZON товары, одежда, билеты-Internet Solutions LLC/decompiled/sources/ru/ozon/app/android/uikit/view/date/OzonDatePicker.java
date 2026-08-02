package ru.ozon.app.android.uikit.view.date;

import Lm0.a;
import Sc.InterfaceC3999a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;

@InterfaceC3999a
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0003R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/uikit/view/date/OzonDatePicker;", "Landroid/widget/DatePicker;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "divider", "Landroid/graphics/drawable/ColorDrawable;", "changeSelectionDividerColor", "", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OzonDatePicker extends DatePicker {

    @NotNull
    private final ColorDrawable divider;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OzonDatePicker(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @SuppressLint({"PrivateApi"})
    private final void changeSelectionDividerColor() {
        try {
            Class<?> cls = Class.forName("android.widget.NumberPicker");
            Class<?> cls2 = Class.forName("com.android.internal.R$id");
            Field field = cls2.getField("day");
            Field field2 = cls2.getField("month");
            Field field3 = cls2.getField("year");
            NumberPicker numberPicker = (NumberPicker) findViewById(field.getInt(null));
            NumberPicker numberPicker2 = (NumberPicker) findViewById(field2.getInt(null));
            NumberPicker numberPicker3 = (NumberPicker) findViewById(field3.getInt(null));
            Field declaredField = cls.getDeclaredField("mSelectionDivider");
            declaredField.setAccessible(true);
            declaredField.set(numberPicker2, this.divider);
            declaredField.set(numberPicker, this.divider);
            declaredField.set(numberPicker3, this.divider);
        } catch (Exception e11) {
            a.f17149a.w(e11);
        }
    }

    public /* synthetic */ OzonDatePicker(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonDatePicker(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.divider = new ColorDrawable(androidx.core.content.a.getColor(context, R$color.oz_semantic_accent_primary));
        changeSelectionDividerColor();
    }
}
