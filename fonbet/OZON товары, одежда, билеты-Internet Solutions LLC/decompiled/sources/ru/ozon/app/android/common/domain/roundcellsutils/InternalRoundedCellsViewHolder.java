package ru.ozon.app.android.common.domain.roundcellsutils;

import B3.D;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.domain.roundcellsutils.RoundedCellsVO;
import ru.ozon.app.android.common.domain.roundcellsutils.databinding.WidgetRoundedCellsBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0015J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0002J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0002J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u000fH\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/common/domain/roundcellsutils/InternalRoundedCellsViewHolder;", "", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "binding", "Lru/ozon/app/android/common/domain/roundcellsutils/databinding/WidgetRoundedCellsBinding;", "getBinding", "()Lru/ozon/app/android/common/domain/roundcellsutils/databinding/WidgetRoundedCellsBinding;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "cellBg", "Landroid/graphics/drawable/GradientDrawable;", "bind", "", "item", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setWidgetBackgroundColor", "widgetBackgroundColor", "", "setCellsBackgroundColor", "cellsBackgroundColor", "updateChildParameters", "layoutModel", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "child", "setSellBgRadius", "initCellBg", "round-cells-utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InternalRoundedCellsViewHolder {

    @NotNull
    private final WidgetRoundedCellsBinding binding;

    @NotNull
    private final GradientDrawable cellBg;
    private final Context context;

    public InternalRoundedCellsViewHolder(@NotNull View containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        WidgetRoundedCellsBinding bind = WidgetRoundedCellsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.context = containerView.getContext();
        this.cellBg = initCellBg();
    }

    private final GradientDrawable initCellBg() {
        return D.b(0);
    }

    private final void setCellsBackgroundColor(String cellsBackgroundColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.cellBg.setColor(styleParser.parseColor(context, cellsBackgroundColor, StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY));
    }

    private final void setSellBgRadius(RoundedCellsVO.LayoutModel layoutModel) {
        this.cellBg.setCornerRadii(new float[]{layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius()});
    }

    private final void setWidgetBackgroundColor(String widgetBackgroundColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.binding.saCell.setBackgroundColor(styleParser.parseColor(context, widgetBackgroundColor, StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY));
    }

    private final void updateChildParameters(RoundedCellsVO.LayoutModel layoutModel, View child) {
        child.setPadding(0, layoutModel.getPaddingTop(), 0, layoutModel.getPaddingBottom());
        child.setBackground(this.cellBg);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = layoutModel.getMarginLeft();
        marginLayoutParams.topMargin = layoutModel.getMarginTop();
        marginLayoutParams.rightMargin = layoutModel.getMarginRight();
        marginLayoutParams.bottomMargin = layoutModel.getMarginBottom();
        child.setLayoutParams(marginLayoutParams);
    }

    public final void bind(@NotNull RoundedCellsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        SingleAtom singleAtom = this.binding.saCell;
        SingleAtom.bind$default(singleAtom, item.getCell(), false, 2, null);
        setWidgetBackgroundColor(item.getWidgetBackgroundColor());
        setCellsBackgroundColor(item.getCellsBackgroundColor());
        Intrinsics.f(singleAtom);
        View view = (View) C7714v.L(ViewGroupExtKt.children(singleAtom));
        if (view != null) {
            updateChildParameters(item.getLayoutModel(), view);
            setSellBgRadius(item.getLayoutModel());
        } else {
            ViewExtKt.gone(singleAtom);
        }
        singleAtom.setOnAction(actionHandler);
    }

    @NotNull
    public final WidgetRoundedCellsBinding getBinding() {
        return this.binding;
    }
}
