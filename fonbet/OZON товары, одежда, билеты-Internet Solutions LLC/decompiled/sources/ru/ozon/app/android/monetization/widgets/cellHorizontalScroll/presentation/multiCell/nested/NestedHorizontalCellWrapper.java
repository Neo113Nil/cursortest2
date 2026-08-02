package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.multiCell.nested;

import B3.D;
import Sc.InterfaceC4008j;
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
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/multiCell/nested/NestedHorizontalCellWrapper;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "", "useFullWidth", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroid/content/Context;ZLkotlin/jvm/functions/Function1;)V", "Landroid/graphics/drawable/GradientDrawable;", "createForeground", "()Landroid/graphics/drawable/GradientDrawable;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTO", "bind", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "foregroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "", "wrapperWidth$delegate", "LSc/j;", "getWrapperWidth", "()I", "wrapperWidth", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes12.dex */
public final class NestedHorizontalCellWrapper extends FrameLayout {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CellView cellView;

    @NotNull
    private final GradientDrawable foregroundDrawable;

    /* renamed from: wrapperWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j wrapperWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NestedHorizontalCellWrapper(@NotNull Context context, boolean z11, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.cellView = cellView;
        GradientDrawable createForeground = createForeground();
        this.foregroundDrawable = createForeground;
        this.wrapperWidth = LazyUtilsKt.unsafeLazy(NestedHorizontalCellWrapper$wrapperWidth$2.INSTANCE);
        setLayoutParams(new FrameLayout.LayoutParams(z11 ? -1 : getWrapperWidth(), -2));
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

    private final int getWrapperWidth() {
        return ((Number) this.wrapperWidth.getValue()).intValue();
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
