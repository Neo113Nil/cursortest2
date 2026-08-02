package ru.ozon.app.android.cart.installment.presentation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.UtilsKt;
import ru.ozon.app.android.cart.feature.R$drawable;
import ru.ozon.app.android.cart.installment.presentation.InstallmentVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cart/installment/presentation/InstallmentView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cell", "Lru/ozon/uni/android/cell/CellView;", "getCell", "()Lru/ozon/uni/android/cell/CellView;", "updateMargins", "", "margins", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$WidgetMarginsVO;", "configureWidgetContainerSettings", "settings", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$ContainerSettingsVO;", "createContainerBackground", "Landroid/graphics/drawable/GradientDrawable;", "hasContainerBackgroundSettings", "", "containerSettings", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentView extends FrameLayout {

    @NotNull
    private final CellView cell;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = CellView.$stable;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/installment/presentation/InstallmentView$Companion;", "", "<init>", "()V", "getInstallmentViewIdSet", "", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Integer> getInstallmentViewIdSet() {
            Integer[] elements = {Integer.valueOf(R$id.cell_center_title), Integer.valueOf(R$id.cell_right_badge)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InstallmentView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final GradientDrawable createContainerBackground(InstallmentVO.ContainerSettingsVO settings) {
        Float cornerRadius;
        GradientDrawable gradientDrawable = new GradientDrawable();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, settings != null ? settings.getBackgroundColor() : null, R$color.layer_floor_1));
        if (settings != null && (cornerRadius = settings.getCornerRadius()) != null) {
            float floatValue = cornerRadius.floatValue();
            gradientDrawable.setCornerRadii(new float[]{floatValue, floatValue, floatValue, floatValue, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        return gradientDrawable;
    }

    private final boolean hasContainerBackgroundSettings(InstallmentVO.ContainerSettingsVO containerSettings) {
        if (containerSettings != null) {
            return (containerSettings.getCornerRadius() == null && containerSettings.getBackgroundColor() == null) ? false : true;
        }
        return false;
    }

    public final void configureWidgetContainerSettings(InstallmentVO.ContainerSettingsVO settings) {
        Integer horizontalMargin;
        Integer horizontalMargin2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = (settings == null || (horizontalMargin2 = settings.getHorizontalMargin()) == null) ? marginLayoutParams.leftMargin : horizontalMargin2.intValue();
        marginLayoutParams.rightMargin = (settings == null || (horizontalMargin = settings.getHorizontalMargin()) == null) ? marginLayoutParams.rightMargin : horizontalMargin.intValue();
        setLayoutParams(marginLayoutParams);
        if (hasContainerBackgroundSettings(settings)) {
            setBackground(createContainerBackground(settings));
        } else {
            setBackgroundResource(R$drawable.bg_installment);
        }
    }

    @NotNull
    public final CellView getCell() {
        return this.cell;
    }

    public final void updateMargins(@NotNull InstallmentVO.WidgetMarginsVO margins) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        CellView cellView = this.cell;
        ViewGroup.LayoutParams layoutParams = cellView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(margins.getLeft(), margins.getTop(), margins.getRight(), margins.getBottom());
        cellView.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallmentView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        CellView cellView = new CellView(context, null, 0, 0, Companion.getInstallmentViewIdSet(), 14, null);
        cellView.setId(ru.ozon.app.android.cart.feature.R$id.installmentCell);
        cellView.setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
        this.cell = cellView;
        setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
        setId(ru.ozon.app.android.cart.feature.R$id.installmentRootFl);
        addView(cellView);
        setBackgroundResource(R$drawable.bg_installment);
        setClickable(true);
    }
}
