package ru.ozon.app.android.orderdetails.productsToPay.presentation.separator.viewHolder;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.separator.viewItem.SeparatorVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/separator/viewHolder/SeparatorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/separator/viewItem/SeparatorVO;", "Landroid/view/View;", "separatorView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/productsToPay/presentation/separator/viewItem/SeparatorVO;Ll20/d;)V", "Landroid/view/View;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SeparatorViewHolder extends k<SeparatorVO> {

    @NotNull
    private final View separatorView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorViewHolder(@NotNull View separatorView) {
        super(separatorView);
        Intrinsics.checkNotNullParameter(separatorView, "separatorView");
        this.separatorView = separatorView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SeparatorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CommonCellSettings.LayoutPadding paddingStart = item.getPaddingStart();
        if (paddingStart != null) {
            int cellLayoutPadding = paddingStart.getCellLayoutPadding();
            View view = this.separatorView;
            view.setPadding((int) getResources().getDimension(cellLayoutPadding), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }
}
