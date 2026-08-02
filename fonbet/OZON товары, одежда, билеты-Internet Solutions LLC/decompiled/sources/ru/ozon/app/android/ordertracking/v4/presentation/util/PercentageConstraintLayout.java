package ru.ozon.app.android.ordertracking.v4.presentation.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR*\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R*\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R*\u0010&\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0012R\u0014\u0010-\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0012R\u0011\u0010/\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010\u0012¨\u00061"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/PercentageConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasure", "resolveWidth", "(I)I", "min", "max", "coerceInRange", "(III)I", "getBarcodeLength", "()I", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "getMinWidth", "maxScreenWidthBySizeFactor", "I", "maxLayoutWidth", "displayWidth", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isFullWidth", "Z", "()Z", "setFullWidth", "(Z)V", "isBarcodeVisible", "setBarcodeVisible", "rightButtonOffset", "getRightButtonOffset", "setRightButtonOffset", "(I)V", "getSeparatorBetweenItems", "separatorBetweenItems", "getBackupWidth", "backupWidth", "getLocalMaxWidth", "localMaxWidth", "Companion", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PercentageConstraintLayout extends ConstraintLayout {
    private final int displayWidth;
    private boolean isBarcodeVisible;
    private boolean isFullWidth;
    private final int maxLayoutWidth;
    private final int maxScreenWidthBySizeFactor;
    private int rightButtonOffset;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int BARCODE_WIDTH = ResourceExtKt.toPx(50);
    private static final int PADDING_SIZE = ResourceExtKt.toPx(16);
    private static final int SEPARATOR_BETWEEN_ITEMS = ResourceExtKt.toPx(8);
    private static final int SELECT_SEPARATOR_BETWEEN_ITEMS = ResourceExtKt.toPx(2);
    private static final int WIDTH_OF_LEFT_SIDE_BEFORE_TITLE = ResourceExtKt.toPx(98);
    private static final int MIN_WIDTH = ResourceExtKt.toPx(230);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/PercentageConstraintLayout$Companion;", "", "<init>", "()V", "MAX_SIZE_FACTOR", "", "BARCODE_WIDTH", "", "PADDING_SIZE", "SEPARATOR_BETWEEN_ITEMS", "SELECT_SEPARATOR_BETWEEN_ITEMS", "WIDTH_OF_LEFT_SIDE_BEFORE_TITLE", "getWIDTH_OF_LEFT_SIDE_BEFORE_TITLE$orderTracking_prodGoogleAllVendorsRelease", "()I", "MIN_WIDTH", "getMIN_WIDTH", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getMIN_WIDTH() {
            return PercentageConstraintLayout.MIN_WIDTH;
        }

        public final int getWIDTH_OF_LEFT_SIDE_BEFORE_TITLE$orderTracking_prodGoogleAllVendorsRelease() {
            return PercentageConstraintLayout.WIDTH_OF_LEFT_SIDE_BEFORE_TITLE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PercentageConstraintLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int coerceInRange(int i11, int i12, int i13) {
        return h.e(i11, Math.min(i12, i13), Math.max(i12, i13));
    }

    private final int getBackupWidth() {
        int i11 = this.displayWidth;
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        int paddingRight = i11 - (view != null ? view.getPaddingRight() : 0);
        Object parent2 = getParent();
        View view2 = parent2 instanceof View ? (View) parent2 : null;
        return (paddingRight - (view2 != null ? view2.getPaddingLeft() : 0)) - SEPARATOR_BETWEEN_ITEMS;
    }

    private final int getBarcodeLength() {
        if (this.isBarcodeVisible) {
            return BARCODE_WIDTH;
        }
        return 0;
    }

    private final int getSeparatorBetweenItems() {
        AppTokensProvider appTokensProvider = AppTokensProvider.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return appTokensProvider.isSelect(context) ? SELECT_SEPARATOR_BETWEEN_ITEMS : SEPARATOR_BETWEEN_ITEMS;
    }

    private final int resolveWidth(int widthMeasure) {
        if (widthMeasure <= 0) {
            widthMeasure = getBackupWidth();
        }
        int i11 = this.rightButtonOffset;
        if (i11 > 0) {
            i11 += getSeparatorBetweenItems();
        }
        int intValue = (this.isFullWidth ? Integer.valueOf((widthMeasure - getBarcodeLength()) - i11) : Float.valueOf(((this.displayWidth - getBarcodeLength()) - PADDING_SIZE) * 0.87f)).intValue();
        return this.isFullWidth ? intValue : coerceInRange(intValue, MIN_WIDTH, getLocalMaxWidth());
    }

    public final int getLocalMaxWidth() {
        int i11 = this.maxScreenWidthBySizeFactor;
        int i12 = this.maxLayoutWidth;
        if (i11 > i12) {
            i11 = i12;
        }
        return i11 - getBarcodeLength();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public int getMinWidth() {
        return MIN_WIDTH;
    }

    /* renamed from: isBarcodeVisible, reason: from getter */
    public final boolean getIsBarcodeVisible() {
        return this.isBarcodeVisible;
    }

    /* renamed from: isFullWidth, reason: from getter */
    public final boolean getIsFullWidth() {
        return this.isFullWidth;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(resolveWidth(View.MeasureSpec.getSize(widthMeasureSpec)), this.isFullWidth ? 1073741824 : LinearLayoutManager.INVALID_OFFSET), heightMeasureSpec);
    }

    public final void setBarcodeVisible(boolean z11) {
        this.isBarcodeVisible = z11;
        requestLayout();
    }

    public final void setFullWidth(boolean z11) {
        this.isFullWidth = z11;
        requestLayout();
    }

    public final void setRightButtonOffset(int i11) {
        this.rightButtonOffset = i11;
        requestLayout();
    }

    public /* synthetic */ PercentageConstraintLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PercentageConstraintLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxScreenWidthBySizeFactor = (int) (context.getResources().getDisplayMetrics().widthPixels * 0.87f);
        this.maxLayoutWidth = ResourceExtKt.toPx(320);
        this.displayWidth = context.getResources().getDisplayMetrics().widthPixels;
        setMinWidth(MIN_WIDTH);
        setLayoutParams(new ConstraintLayout.b(-1, -1));
    }
}
