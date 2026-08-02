package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonView;
import ru.ozon.app.android.ugc.core.R$id;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ReviewGalleryView$special$$inlined$lazyView$2 extends AbstractC7737t implements Function0<SocialIconButtonView> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ ViewGroup $parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewGalleryView$special$$inlined$lazyView$2(ViewGroup viewGroup, Context context) {
        super(0);
        this.$parent = viewGroup;
        this.$context$inlined = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SocialIconButtonView invoke() {
        SocialIconButtonView socialIconButtonView = new SocialIconButtonView(this.$context$inlined, null, 0, 6, null);
        socialIconButtonView.setId(R$id.closeBtn);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = dimens.getDP_12();
        bVar.setMarginEnd(dimens.getDP_12());
        socialIconButtonView.setLayoutParams(bVar);
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(socialIconButtonView);
        }
        return socialIconButtonView;
    }
}
