package ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo;

import Bi.b;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SingleReviewUserInfoView$special$$inlined$lazyView$2 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ ViewGroup $parent;
    final /* synthetic */ SingleReviewUserInfoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewUserInfoView$special$$inlined$lazyView$2(ViewGroup viewGroup, Context context, SingleReviewUserInfoView singleReviewUserInfoView) {
        super(0);
        this.$parent = viewGroup;
        this.$context$inlined = context;
        this.this$0 = singleReviewUserInfoView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        ImageView avatarIv;
        TextView nameTv;
        TextView nameTv2;
        TextView nameTv3;
        TextView nameTv4;
        TextAtomV2View textAtomV2View = new TextAtomV2View(this.$context$inlined, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.externalReviewTav, 0, -2);
        int dp_2 = Dimens.INSTANCE.getDP_2();
        int marginStart = d11.getMarginStart();
        int marginEnd = d11.getMarginEnd();
        int i11 = ((ViewGroup.MarginLayoutParams) d11).bottomMargin;
        d11.setMarginStart(marginStart);
        ((ViewGroup.MarginLayoutParams) d11).topMargin = dp_2;
        d11.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) d11).bottomMargin = i11;
        avatarIv = this.this$0.getAvatarIv();
        d11.f41642l = avatarIv.getId();
        nameTv = this.this$0.getNameTv();
        d11.f41638j = nameTv.getId();
        nameTv2 = this.this$0.getNameTv();
        d11.f41656t = nameTv2.getId();
        nameTv3 = this.this$0.getNameTv();
        d11.f41658v = nameTv3.getId();
        textAtomV2View.setLayoutParams(d11);
        nameTv4 = this.this$0.getNameTv();
        ViewGroup.LayoutParams layoutParams = nameTv4.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41640k = R$id.externalReviewTav;
        nameTv4.setLayoutParams(bVar);
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(textAtomV2View);
        }
        return textAtomV2View;
    }
}
