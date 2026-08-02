package ru.ozon.app.android.fresh.checkout.ui.molecules.checkoutCellList.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.PaintDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.databinding.ViewCheckoutCellListBinding;
import ru.ozon.app.android.fresh.checkout.ui.molecules.checkoutCellList.data.FreshCellListDTO;
import ru.ozon.app.android.fresh.checkout.ui.molecules.checkoutCellList.utils.ViewExtKt;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/presentation/FreshCellListView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO;", "data", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "defaultHorizontalPadding", "defaultVerticalPadding", "bind", "(Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO;Lkotlin/jvm/functions/Function1;II)V", "", "shadowDY$delegate", "LSc/j;", "getShadowDY", "()F", "shadowDY", "shadowRadius$delegate", "getShadowRadius", "shadowRadius", "Lru/ozon/app/android/fresh/checkout/databinding/ViewCheckoutCellListBinding;", "binding", "Lru/ozon/app/android/fresh/checkout/databinding/ViewCheckoutCellListBinding;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshCellListView extends FrameLayout {

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final ViewCheckoutCellListBinding binding;

    /* renamed from: shadowDY$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j shadowDY;

    /* renamed from: shadowRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j shadowRadius;

    public /* synthetic */ FreshCellListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static /* synthetic */ void bind$default(FreshCellListView freshCellListView, FreshCellListDTO freshCellListDTO, Function1 function1, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        freshCellListView.bind(freshCellListDTO, function1, i11, i12);
    }

    private final float getShadowDY() {
        return ((Number) this.shadowDY.getValue()).floatValue();
    }

    private final float getShadowRadius() {
        return ((Number) this.shadowRadius.getValue()).floatValue();
    }

    public final void bind(@NotNull FreshCellListDTO data, @NotNull Function1<? super AtomAction, Unit> onAction, int defaultHorizontalPadding, int defaultVerticalPadding) {
        View view;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        FrameLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.setupPaddings(constraintLayout, data.getPaddings(), defaultHorizontalPadding, defaultVerticalPadding);
        if (data.getCells().size() == 1) {
            VerticalAtomsLayout cellsVAL = this.binding.cellsVAL;
            Intrinsics.checkNotNullExpressionValue(cellsVAL, "cellsVAL");
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(cellsVAL);
            FrameLayout singleCellFL = this.binding.singleCellFL;
            Intrinsics.checkNotNullExpressionValue(singleCellFL, "singleCellFL");
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(singleCellFL);
            CellView cellView = this.binding.cellView;
            Intrinsics.checkNotNullExpressionValue(cellView, "cellView");
            CellHolderKt.bind(cellView, (CellDTO) C7714v.K(data.getCells()), onAction);
            view = this.binding.singleCellFL;
            Intrinsics.f(view);
        } else {
            FrameLayout singleCellFL2 = this.binding.singleCellFL;
            Intrinsics.checkNotNullExpressionValue(singleCellFL2, "singleCellFL");
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(singleCellFL2);
            VerticalAtomsLayout cellsVAL2 = this.binding.cellsVAL;
            Intrinsics.checkNotNullExpressionValue(cellsVAL2, "cellsVAL");
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(cellsVAL2);
            this.atomsAdapter.setOnAction(onAction);
            AtomsAdapter atomsAdapter = this.atomsAdapter;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, data.getCells());
            view = this.binding.cellsVAL;
            Intrinsics.f(view);
        }
        String backgroundColor = data.getBackgroundColor();
        if (backgroundColor != null) {
            CornerRadius islandCornerRadius = data.getIslandCornerRadius();
            float pxF = islandCornerRadius != null ? UiExtKt.toPxF(islandCornerRadius.getPx()) : 0.0f;
            PaintDrawable paintDrawable = new PaintDrawable();
            Paint paint = paintDrawable.getPaint();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            paint.setColor(styleParser.parseColor(context2, backgroundColor, UniColors.WHITE_TRANSPARENT_0.getResId()));
            List<FreshCellListDTO.Corners> corners = data.getCorners();
            if (corners == null || corners.isEmpty()) {
                paintDrawable.setCornerRadius(pxF);
            } else {
                FreshCellListView$bind$1$1$calculateRadius$1 freshCellListView$bind$1$1$calculateRadius$1 = new FreshCellListView$bind$1$1$calculateRadius$1(data, pxF);
                float floatValue = freshCellListView$bind$1$1$calculateRadius$1.invoke((FreshCellListView$bind$1$1$calculateRadius$1) FreshCellListDTO.Corners.TOP_LEFT).floatValue();
                float floatValue2 = freshCellListView$bind$1$1$calculateRadius$1.invoke((FreshCellListView$bind$1$1$calculateRadius$1) FreshCellListDTO.Corners.TOP_RIGHT).floatValue();
                float floatValue3 = freshCellListView$bind$1$1$calculateRadius$1.invoke((FreshCellListView$bind$1$1$calculateRadius$1) FreshCellListDTO.Corners.BOTTOM_LEFT).floatValue();
                float floatValue4 = freshCellListView$bind$1$1$calculateRadius$1.invoke((FreshCellListView$bind$1$1$calculateRadius$1) FreshCellListDTO.Corners.BOTTOM_RIGHT).floatValue();
                paintDrawable.setCornerRadii(new float[]{floatValue, floatValue, floatValue2, floatValue2, floatValue4, floatValue4, floatValue3, floatValue3});
            }
            if (Intrinsics.d(data.getShowShadow(), Boolean.TRUE)) {
                paintDrawable.getPaint().setShadowLayer(getShadowRadius(), 0.0f, getShadowDY(), -7829368);
            }
            view.setBackground(paintDrawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshCellListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.shadowDY = k.b(FreshCellListView$shadowDY$2.INSTANCE);
        this.shadowRadius = k.b(FreshCellListView$shadowRadius$2.INSTANCE);
        ViewCheckoutCellListBinding inflate = ViewCheckoutCellListBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        VerticalAtomsLayout verticalAtomsLayout = inflate.cellsVAL;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setDecorator(new FreshCellListDecorator(context));
    }
}
