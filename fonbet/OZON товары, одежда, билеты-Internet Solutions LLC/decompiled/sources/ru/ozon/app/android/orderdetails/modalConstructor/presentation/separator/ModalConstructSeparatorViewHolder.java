package ru.ozon.app.android.orderdetails.modalConstructor.presentation.separator;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.models.ModalConstructorVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/orderdetails/modalConstructor/presentation/separator/ModalConstructSeparatorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$SeparatorVO;", "Landroid/view/View;", "separatorView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$SeparatorVO;Ll20/d;)V", "Landroid/content/res/Resources;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layoutPadding", "", "getPadding", "(Landroid/content/res/Resources;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "Landroid/view/View;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalConstructSeparatorViewHolder extends k<ModalConstructorVO.SeparatorVO> {

    @NotNull
    private final View separatorView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalConstructSeparatorViewHolder(@NotNull View separatorView) {
        super(separatorView);
        Intrinsics.checkNotNullParameter(separatorView, "separatorView");
        this.separatorView = separatorView;
    }

    public final int getPadding(@NotNull Resources resources, CommonCellSettings.LayoutPadding layoutPadding) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return (int) resources.getDimension(layoutPadding != null ? layoutPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ModalConstructorVO.SeparatorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        View view = this.separatorView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = getPadding(getResources(), item.getHeight());
        view.setLayoutParams(layoutParams);
    }
}
