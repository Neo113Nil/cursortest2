package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.carriageDetails;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.CarriageDetailsVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/carriageDetails/CarriageDetailsIconsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "<init>", "(Lru/ozon/uni/android/atom/icon/IconView;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/CarriageDetailsVO$CarriageDetailsIconVO;", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/CarriageDetailsVO$CarriageDetailsIconVO;)V", "Lru/ozon/uni/android/atom/icon/IconView;", "Landroid/graphics/drawable/GradientDrawable;", "bgGradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CarriageDetailsIconsViewHolder extends RecyclerView.C {

    @NotNull
    private final GradientDrawable bgGradientDrawable;

    @NotNull
    private final IconView iconView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarriageDetailsIconsViewHolder(@NotNull IconView iconView) {
        super(iconView);
        Intrinsics.checkNotNullParameter(iconView, "iconView");
        this.iconView = iconView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        Context context = iconView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColors(new int[]{0, ThemeExtKt.themeColor(context, R$attr.layerFloor1)});
        this.bgGradientDrawable = gradientDrawable;
    }

    public final void bind(@NotNull CarriageDetailsVO.CarriageDetailsIconVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bind$default(this.iconView, item.getIcon(), null, 2, null);
        this.iconView.setForeground(item.getNeedFade() ? this.bgGradientDrawable : null);
    }
}
