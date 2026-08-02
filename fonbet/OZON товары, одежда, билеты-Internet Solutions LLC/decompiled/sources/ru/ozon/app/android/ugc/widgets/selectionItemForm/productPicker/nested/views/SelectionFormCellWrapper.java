package ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.nested.views;

import B3.D;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\rH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/views/SelectionFormCellWrapper;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "cellView", "Lru/ozon/uni/android/cell/CellView;", "foregroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "wrapperWidth", "", "bind", "cellDTO", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "createForeground", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SelectionFormCellWrapper extends FrameLayout {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CellView cellView;

    @NotNull
    private final GradientDrawable foregroundDrawable;
    private final int wrapperWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionFormCellWrapper(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.cellView = cellView;
        GradientDrawable createForeground = createForeground();
        this.foregroundDrawable = createForeground;
        int px = ResourceExtKt.toPx(288);
        this.wrapperWidth = px;
        setLayoutParams(new FrameLayout.LayoutParams(px, -2));
        setForeground(createForeground);
        addView(cellView);
    }

    private final GradientDrawable createForeground() {
        GradientDrawable b11 = D.b(0);
        int dp_1 = Dimens.INSTANCE.getDP_1();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b11.setStroke(dp_1, ThemeExtKt.themeColor(context, R$attr.layerSurface));
        b11.setColor(0);
        return b11;
    }

    public final void bind(@NotNull CellDTO cellDTO) {
        CornerRadius cornerRadius;
        Intrinsics.checkNotNullParameter(cellDTO, "cellDTO");
        CellHolderKt.bind(this.cellView, cellDTO, this.actionHandler);
        GradientDrawable gradientDrawable = this.foregroundDrawable;
        CellDTO.Settings settings = cellDTO.getSettings();
        gradientDrawable.setCornerRadius(ResourceExtKt.toPxF((settings == null || (cornerRadius = settings.getCornerRadius()) == null) ? 0 : cornerRadius.getPx()));
    }
}
