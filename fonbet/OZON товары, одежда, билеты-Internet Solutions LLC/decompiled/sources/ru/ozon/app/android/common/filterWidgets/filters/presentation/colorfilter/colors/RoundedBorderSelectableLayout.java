package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\rR*\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0002@BX\u0083\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/RoundedBorderSelectableLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "", "drawBorder", "(Landroid/graphics/Canvas;)V", "canvas", "onDraw", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isChecked", "Z", "()Z", "setChecked", "(Z)V", "unselectedItemBorderColor", "I", "selectedItemBorderColor", "", "borderWidth", "F", "borderColor", "setBorderColor", "(I)V", "Landroid/graphics/PorterDuffColorFilter;", "borderColorFilter", "Landroid/graphics/PorterDuffColorFilter;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RoundedBorderSelectableLayout extends FrameLayout {
    private int borderColor;

    @NotNull
    private PorterDuffColorFilter borderColorFilter;
    private float borderWidth;
    private boolean isChecked;

    @NotNull
    private final Paint paint;
    private final int selectedItemBorderColor;
    private final int unselectedItemBorderColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float unselectedItemBorderWidth = UiExtKt.toPxF(1);
    private static final float selectedItemBorderWidth = UiExtKt.toPxF(2);
    private static final float cornerRadius = UiExtKt.toPxF(14);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/RoundedBorderSelectableLayout$Companion;", "", "<init>", "()V", "", "PAD_BORDER_DIVIDER", "I", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedBorderSelectableLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawBorder(Canvas canvas) {
        float f7 = cornerRadius;
        Paint paint = this.paint;
        paint.setStrokeWidth(this.borderWidth);
        paint.setColorFilter(this.borderColorFilter);
        float f11 = this.borderWidth / 2;
        canvas.drawRoundRect(f11, f11, getMeasuredWidth() - f11, getMeasuredHeight() - f11, f7, f7, this.paint);
    }

    private final void setBorderColor(int i11) {
        this.borderColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        this.borderColor = i11;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawBorder(canvas);
        super.onDraw(canvas);
    }

    public final void setChecked(boolean z11) {
        if (this.isChecked != z11) {
            this.isChecked = z11;
            this.borderWidth = z11 ? selectedItemBorderWidth : unselectedItemBorderWidth;
            setBorderColor(z11 ? this.selectedItemBorderColor : this.unselectedItemBorderColor);
            invalidate();
        }
    }

    public /* synthetic */ RoundedBorderSelectableLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedBorderSelectableLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.graphicNeutral);
        this.unselectedItemBorderColor = themeColor;
        this.selectedItemBorderColor = ThemeExtKt.themeColor(context, R$attr.graphicActionPrimary);
        this.borderWidth = unselectedItemBorderWidth;
        this.borderColor = themeColor;
        this.borderColorFilter = new PorterDuffColorFilter(this.borderColor, PorterDuff.Mode.SRC_IN);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.paint = paint;
        setWillNotDraw(false);
        setClipToOutline(true);
    }
}
