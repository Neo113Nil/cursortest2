package ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.delivery;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR*\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "bgColor", "I", "getBgColor", "()I", "setBgColor", "(I)V", "bgCornerRadius", "getBgCornerRadius", "setBgCornerRadius", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "getCellView", "()Lru/ozon/uni/android/cell/CellView;", "Landroidx/recyclerview/widget/RecyclerView;", "imagesRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getImagesRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryView extends LinearLayout {

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private int bgColor;
    private int bgCornerRadius;

    @NotNull
    private final CellView cellView;

    @NotNull
    private final RecyclerView imagesRecyclerView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int dp8 = ResourceExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryView$Companion;", "", "<init>", "()V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeliveryView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final CellView getCellView() {
        return this.cellView;
    }

    @NotNull
    public final RecyclerView getImagesRecyclerView() {
        return this.imagesRecyclerView;
    }

    public final void setBgColor(int i11) {
        if (i11 != this.bgColor) {
            this.bgColor = i11;
            this.backgroundDrawable.setColor(i11);
        }
    }

    public final void setBgCornerRadius(int i11) {
        if (i11 != this.bgCornerRadius) {
            this.bgCornerRadius = i11;
            this.backgroundDrawable.setCornerRadius(i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgColor = ThemeExtKt.themeColor(context, R$attr.bgSecondary);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.bgColor);
        gradientDrawable.setCornerRadius(this.bgCornerRadius);
        this.backgroundDrawable = gradientDrawable;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i13 = dp8;
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i13, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i13);
        cellView.setLayoutParams(layoutParams);
        addView(cellView);
        this.cellView = cellView;
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i14 = dp16;
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, i14);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setPadding(i14, recyclerView.getPaddingTop(), i14, recyclerView.getPaddingBottom());
        addView(recyclerView);
        this.imagesRecyclerView = recyclerView;
        setBackground(gradientDrawable);
        setOrientation(1);
    }
}
