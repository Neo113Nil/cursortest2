package ru.ozon.app.android.pdp.widgets.aspectsV2.presentation;

import X4.a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.b;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$VariantV2;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.tiles.AspectsCompactTilesVariantV2VO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\r*\u00020\u00102\u0006\u0010\b\u001a\u00020\u0001H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\r*\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u0001H\u0004¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectV2FlexInnerVH;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "LX4/a;", "view", "<init>", "(LX4/a;)V", "variant", "", "getCornerRadius", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)F", "item", "", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)V", "Landroid/view/View;", "setSelected", "(Landroid/view/View;Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)V", "setParandjaForAspects", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AspectV2FlexInnerVH<T extends AspectsCompactVO$Variant> extends RecyclerView.C {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectV2FlexInnerVH(@NotNull a view) {
        super(view.getConstraintLayout());
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final float getCornerRadius(AspectsCompactVO$Variant variant) {
        return variant instanceof AspectsCompactTilesVariantV2VO ? Dimens.INSTANCE.getDPF_12() : Dimens.INSTANCE.getDPF_8();
    }

    public abstract void bind(@NotNull T item);

    protected final void setParandjaForAspects(View view, @NotNull AspectsCompactVO$Variant variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        if ((view instanceof ViewGroup) || (view instanceof b)) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            boolean isDarkThemeActive = ThemeExtKt.isDarkThemeActive(context);
            int color = androidx.core.content.a.getColor(view.getContext(), (!variant.getIsAvailable() && isDarkThemeActive && (variant instanceof AspectsCompactVO$VariantV2)) ? R$color.bg_secondary : (variant.getIsAvailable() || !isDarkThemeActive) ? (variant.getIsAvailable() && isDarkThemeActive) ? R$color.layer_overlay_paranja : (variant.getIsAvailable() || isDarkThemeActive) ? R$color.transparent : R$color.layer_overlay_paranja : ru.ozon.app.android.pdp.ui.configurators.R$color.aspects_custom_parandja);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(color);
            gradientDrawable.setCornerRadius(getCornerRadius(variant));
            view.setForeground(gradientDrawable);
        }
    }

    protected final void setSelected(@NotNull View view, @NotNull AspectsCompactVO$Variant variant) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(variant, "variant");
        view.setSelected(variant.getIsSelected());
        view.setActivated(variant.getIsAvailable());
    }
}
