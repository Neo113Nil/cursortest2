package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.data.TotalStickyV3DTO;
import ru.ozon.app.android.checkoutgeo.checkout.views.totalButton.TotalButtonView;
import ru.ozon.app.android.uikit.view.shimmer.UtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0001;B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010!\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;", "item", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;", "containerSettings", "", "isSelectApp", "", "configureLayout", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;Z)V", "applyBackground", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;)V", "settings", "Landroid/graphics/drawable/GradientDrawable;", "createContainerBackground", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;)Landroid/graphics/drawable/GradientDrawable;", "configureWidgetContainerMargin", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;)V", "hasContainerBackgroundSettings", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;)Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "shimmeringIsActive", "bind", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;Lkotlin/jvm/functions/Function1;ZZ)V", "isActive", "setShimmering", "(Z)V", "", "viewRoundedCornerRadii$delegate", "LSc/j;", "getViewRoundedCornerRadii", "()[F", "viewRoundedCornerRadii", "defaultBackgroundDrawable$delegate", "getDefaultBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "defaultBackgroundDrawable", "Landroid/graphics/drawable/LayerDrawable;", "roundedBackgroundDrawable$delegate", "getRoundedBackgroundDrawable", "()Landroid/graphics/drawable/LayerDrawable;", "roundedBackgroundDrawable", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonView;", "totalButtonView", "Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonView;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalStickyV3View extends LinearLayout {

    @NotNull
    private final CellView cellView;

    /* renamed from: defaultBackgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultBackgroundDrawable;

    /* renamed from: roundedBackgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j roundedBackgroundDrawable;

    @NotNull
    private final TotalButtonView totalButtonView;

    /* renamed from: viewRoundedCornerRadii$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewRoundedCornerRadii;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_1 = ResourceExtKt.toPx(1);
    private static final int DP_4 = ResourceExtKt.toPx(4);
    private static final int DP_6 = ResourceExtKt.toPx(6);
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final float CORNER_RADIUS = ResourceExtKt.toPxF(24);
    private static final int LAYER_INSET = ResourceExtKt.toPx(-2);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3View$Companion;", "", "<init>", "()V", "", "DP_1", "I", "getDP_1", "()I", "", "CORNER_RADIUS", "F", "getCORNER_RADIUS", "()F", "LAYER_INSET", "getLAYER_INSET", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCORNER_RADIUS() {
            return TotalStickyV3View.CORNER_RADIUS;
        }

        public final int getDP_1() {
            return TotalStickyV3View.DP_1;
        }

        public final int getLAYER_INSET() {
            return TotalStickyV3View.LAYER_INSET;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TotalStickyV3View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyBackground(TotalStickyV3VO item, TotalStickyV3DTO.ContainerSettings containerSettings) {
        if (hasContainerBackgroundSettings(containerSettings)) {
            setBackground(createContainerBackground(containerSettings));
        } else {
            setBackground(item.getShowRoundedHeader() ? getRoundedBackgroundDrawable() : getDefaultBackgroundDrawable());
        }
    }

    private final void configureLayout(TotalStickyV3VO item, TotalStickyV3DTO.ContainerSettings containerSettings, boolean isSelectApp) {
        Pair pair;
        int i11 = 0;
        if (isSelectApp) {
            int i12 = DP_6;
            setPadding(i12, i12, i12, i12);
            if (item.getAdditionalInfo() != null) {
                i11 = i12;
            }
        } else {
            if (item.getAdditionalInfo() == null) {
                int i13 = DP_4;
                pair = new Pair(Integer.valueOf(i13), Integer.valueOf(i13));
            } else {
                int i14 = DP_8;
                pair = new Pair(Integer.valueOf(i14), Integer.valueOf(i14));
            }
            int intValue = ((Number) pair.a()).intValue();
            int intValue2 = ((Number) pair.b()).intValue();
            int i15 = DP_8;
            setPadding(i15, i15, i15, i15);
            if (item.getShowRoundedHeader()) {
                setPadding(getPaddingLeft(), intValue, getPaddingRight(), getPaddingBottom());
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
            }
            i11 = intValue2;
        }
        TotalButtonView totalButtonView = this.totalButtonView;
        ViewGroup.LayoutParams layoutParams = totalButtonView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i11;
        totalButtonView.setLayoutParams(marginLayoutParams);
        applyBackground(item, containerSettings);
    }

    private final void configureWidgetContainerMargin(TotalStickyV3DTO.ContainerSettings settings) {
        int i11;
        int i12;
        int i13;
        int i14;
        CommonCellSettings.LayoutPadding bottom;
        CommonCellSettings.LayoutPadding top;
        CommonCellSettings.LayoutPadding right;
        CommonCellSettings.LayoutPadding left;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        TotalStickyV3DTO.Paddings paddings = settings.getPaddings();
        if (paddings == null || (left = paddings.getLeft()) == null) {
            i11 = marginLayoutParams.leftMargin;
        } else {
            int cellLayoutPadding = left.getCellLayoutPadding();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i11 = Integer.valueOf(ResourceExtKt.dim(context, cellLayoutPadding)).intValue();
        }
        marginLayoutParams.leftMargin = i11;
        TotalStickyV3DTO.Paddings paddings2 = settings.getPaddings();
        if (paddings2 == null || (right = paddings2.getRight()) == null) {
            i12 = marginLayoutParams.rightMargin;
        } else {
            int cellLayoutPadding2 = right.getCellLayoutPadding();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i12 = Integer.valueOf(ResourceExtKt.dim(context2, cellLayoutPadding2)).intValue();
        }
        marginLayoutParams.rightMargin = i12;
        TotalStickyV3DTO.Paddings paddings3 = settings.getPaddings();
        if (paddings3 == null || (top = paddings3.getTop()) == null) {
            i13 = marginLayoutParams.topMargin;
        } else {
            int cellLayoutPadding3 = top.getCellLayoutPadding();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            i13 = Integer.valueOf(ResourceExtKt.dim(context3, cellLayoutPadding3)).intValue();
        }
        marginLayoutParams.topMargin = i13;
        TotalStickyV3DTO.Paddings paddings4 = settings.getPaddings();
        if (paddings4 == null || (bottom = paddings4.getBottom()) == null) {
            i14 = marginLayoutParams.bottomMargin;
        } else {
            int cellLayoutPadding4 = bottom.getCellLayoutPadding();
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            i14 = Integer.valueOf(ResourceExtKt.dim(context4, cellLayoutPadding4)).intValue();
        }
        marginLayoutParams.bottomMargin = i14;
        setLayoutParams(marginLayoutParams);
    }

    private final GradientDrawable createContainerBackground(TotalStickyV3DTO.ContainerSettings settings) {
        TotalStickyV3DTO.ContainerCornerRadius cornerRadius;
        float f7;
        GradientDrawable gradientDrawable = new GradientDrawable();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, settings != null ? settings.getBackgroundColor() : null, R$color.layer_floor_1));
        if (settings != null && (cornerRadius = settings.getCornerRadius()) != null) {
            CornerRadius top = cornerRadius.getTop();
            float f11 = 0.0f;
            if (top != null) {
                int px = top.getPx();
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                f7 = ResourceExtKt.toPxF(px, context2);
            } else {
                f7 = 0.0f;
            }
            CornerRadius bottom = cornerRadius.getBottom();
            if (bottom != null) {
                int px2 = bottom.getPx();
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                f11 = ResourceExtKt.toPxF(px2, context3);
            }
            gradientDrawable.setCornerRadii(new float[]{f7, f7, f7, f7, f11, f11, f11, f11});
        }
        return gradientDrawable;
    }

    private final GradientDrawable getDefaultBackgroundDrawable() {
        return (GradientDrawable) this.defaultBackgroundDrawable.getValue();
    }

    private final LayerDrawable getRoundedBackgroundDrawable() {
        return (LayerDrawable) this.roundedBackgroundDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float[] getViewRoundedCornerRadii() {
        return (float[]) this.viewRoundedCornerRadii.getValue();
    }

    private final boolean hasContainerBackgroundSettings(TotalStickyV3DTO.ContainerSettings containerSettings) {
        if (containerSettings != null) {
            return (containerSettings.getCornerRadius() == null && containerSettings.getBackgroundColor() == null) ? false : true;
        }
        return false;
    }

    public final void bind(@NotNull TotalStickyV3VO item, Function1<? super AtomAction, Unit> onAction, boolean isSelectApp, boolean shimmeringIsActive) {
        Intrinsics.checkNotNullParameter(item, "item");
        CellHolderKt.bindOrGone(this.cellView, item.getAdditionalInfo(), onAction);
        this.totalButtonView.bindOrGone(item.getTotalButton(), onAction, isSelectApp, shimmeringIsActive);
        configureLayout(item, item.getWidgetContainerSettings(), isSelectApp);
        TotalStickyV3DTO.ContainerSettings widgetContainerSettings = item.getWidgetContainerSettings();
        if (widgetContainerSettings != null) {
            configureWidgetContainerMargin(widgetContainerSettings);
        }
    }

    public final void setShimmering(boolean isActive) {
        UtilsKt.setShimmering(this.totalButtonView.getShimmerView(), isActive);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TotalStickyV3View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewRoundedCornerRadii = k.b(TotalStickyV3View$viewRoundedCornerRadii$2.INSTANCE);
        this.defaultBackgroundDrawable = k.b(new TotalStickyV3View$defaultBackgroundDrawable$2(context));
        this.roundedBackgroundDrawable = k.b(new TotalStickyV3View$roundedBackgroundDrawable$2(this, context));
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        CellView cellView = new CellView(context, attributeSet2, i12, 0, null, 30, null);
        cellView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(cellView);
        this.cellView = cellView;
        TotalButtonView totalButtonView = new TotalButtonView(context, attributeSet2, i12, 6, 0 == true ? 1 : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = DP_8;
        totalButtonView.setLayoutParams(marginLayoutParams);
        addView(totalButtonView);
        this.totalButtonView = totalButtonView;
        setOrientation(1);
        setGravity(16);
    }
}
