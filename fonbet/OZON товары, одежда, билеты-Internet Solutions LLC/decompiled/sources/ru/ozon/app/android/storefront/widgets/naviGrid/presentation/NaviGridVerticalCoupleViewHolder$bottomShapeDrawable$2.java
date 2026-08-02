package ru.ozon.app.android.storefront.widgets.naviGrid.presentation;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.R$drawable;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NaviGridVerticalCoupleViewHolder$bottomShapeDrawable$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ NaviGridVerticalCoupleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NaviGridVerticalCoupleViewHolder$bottomShapeDrawable$2(NaviGridVerticalCoupleViewHolder naviGridVerticalCoupleViewHolder) {
        super(0);
        this.this$0 = naviGridVerticalCoupleViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        Drawable d11 = g.d(this.this$0.getResources(), R$drawable.bg_rounded_navi_grid, this.this$0.getContext().getTheme());
        if (d11 instanceof GradientDrawable) {
            return (GradientDrawable) d11;
        }
        return null;
    }
}
