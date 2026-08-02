package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import Kk.C3531a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/icon/IconView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewTilesView$playIcon$2 extends AbstractC7737t implements Function0<IconView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewTilesView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTilesView$playIcon$2(Context context, ReviewTilesView reviewTilesView) {
        super(0);
        this.$context = context;
        this.this$0 = reviewTilesView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IconView invoke() {
        IconView iconView = new IconView(this.$context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.reviewTilesPlayIcon, 0, -2);
        a11.f41636i = 0;
        a11.f41658v = 0;
        Dimens dimens = Dimens.INSTANCE;
        a11.setMargins(((ViewGroup.MarginLayoutParams) a11).leftMargin, dimens.getDP_8(), dimens.getDP_8(), ((ViewGroup.MarginLayoutParams) a11).bottomMargin);
        iconView.setLayoutParams(a11);
        iconView.setZ(1.0f);
        this.this$0.addView(iconView);
        return iconView;
    }
}
