package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment;

import D40.d;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ReviewFormCommentView$special$$inlined$lazyView$1 extends AbstractC7737t implements Function0<IconButtonV3View> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ ViewGroup $parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFormCommentView$special$$inlined$lazyView$1(ViewGroup viewGroup, Context context) {
        super(0);
        this.$parent = viewGroup;
        this.$context$inlined = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final IconButtonV3View invoke() {
        IconButtonV3View iconButtonV3View = new IconButtonV3View(this.$context$inlined, null, 0, 0, 14, null);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, R$id.inputActionIcon, -2, -2);
        c11.f41638j = R$id.inputEditText;
        int i11 = R$id.inputBgView;
        c11.f41642l = i11;
        c11.f41658v = i11;
        c11.f41599F = 0.5f;
        Dimens dimens = Dimens.INSTANCE;
        c11.setMarginEnd(dimens.getDP_8());
        ((ViewGroup.MarginLayoutParams) c11).topMargin = dimens.getDP_8();
        ((ViewGroup.MarginLayoutParams) c11).bottomMargin = dimens.getDP_8();
        iconButtonV3View.setLayoutParams(c11);
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(iconButtonV3View);
        }
        return iconButtonV3View;
    }
}
