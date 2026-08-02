package ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartQuantQuantView$iconButtonLazy$1 extends AbstractC7737t implements Function0<SmallIconButtonView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CartQuantQuantView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartQuantQuantView$iconButtonLazy$1(Context context, CartQuantQuantView cartQuantQuantView) {
        super(0);
        this.$context = context;
        this.this$0 = cartQuantQuantView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r7 != (r4 != null ? r4.bottomMargin : 0)) goto L33;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SmallIconButtonView invoke() {
        SmallIconButtonView smallIconButtonView = new SmallIconButtonView(this.$context, null, 0, 6, null);
        Dimens dimens = Dimens.INSTANCE;
        smallIconButtonView.setLayoutParams(new LinearLayout.LayoutParams(dimens.getDP_52(), dimens.getDP_52()));
        ViewGroup.LayoutParams layoutParams = smallIconButtonView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(dimens.getDP_8());
            marginLayoutParams.topMargin = dimens.getDP_8();
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = smallIconButtonView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = smallIconButtonView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = smallIconButtonView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            smallIconButtonView.setLayoutParams(marginLayoutParams);
        }
        this.this$0.addView(smallIconButtonView);
        return smallIconButtonView;
    }
}
