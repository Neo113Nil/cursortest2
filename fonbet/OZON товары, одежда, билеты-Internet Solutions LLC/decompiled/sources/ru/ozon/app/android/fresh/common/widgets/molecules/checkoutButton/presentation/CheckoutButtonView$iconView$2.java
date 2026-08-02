package ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation;

import Kk.C3531a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.common.widgets.R$id;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation.CheckoutButtonView;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/icon/IconView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutButtonView$iconView$2 extends AbstractC7737t implements Function0<IconView> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutButtonView$iconView$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IconView invoke() {
        CheckoutButtonView.Companion companion;
        IconView iconView = new IconView(this.$context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.checkoutButtonIcon, -2, -2);
        companion = CheckoutButtonView.Companion;
        ((ViewGroup.MarginLayoutParams) a11).rightMargin = companion.getIconMargin();
        iconView.setLayoutParams(a11);
        iconView.setClickable(false);
        iconView.setFocusable(false);
        return iconView;
    }
}
