package ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SingleReviewUserInfoView$special$$inlined$lazyView$1 extends AbstractC7737t implements Function0<AppCompatTextView> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ ViewGroup $parent;
    final /* synthetic */ SingleReviewUserInfoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewUserInfoView$special$$inlined$lazyView$1(ViewGroup viewGroup, Context context, SingleReviewUserInfoView singleReviewUserInfoView) {
        super(0);
        this.$parent = viewGroup;
        this.$context$inlined = context;
        this.this$0 = singleReviewUserInfoView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AppCompatTextView invoke() {
        ImageView avatarIv;
        ImageView avatarIv2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(this.$context$inlined);
        appCompatTextView.setId(R$id.nameTv);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setMaxLines(2);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        Dimens dimens = Dimens.INSTANCE;
        int dp_12 = dimens.getDP_12();
        int dp_16 = dimens.getDP_16();
        int i11 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
        int i12 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        bVar.setMarginStart(dp_12);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i11;
        bVar.setMarginEnd(dp_16);
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i12;
        avatarIv = this.this$0.getAvatarIv();
        bVar.f41636i = avatarIv.getId();
        avatarIv2 = this.this$0.getAvatarIv();
        bVar.f41655s = avatarIv2.getId();
        bVar.f41642l = 0;
        bVar.f41658v = 0;
        appCompatTextView.setLayoutParams(bVar);
        TextViewExtKt.applyStyle(appCompatTextView, this.$context$inlined, R$style.TextStyle_Body_L_Bold);
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(appCompatTextView);
        }
        return appCompatTextView;
    }
}
