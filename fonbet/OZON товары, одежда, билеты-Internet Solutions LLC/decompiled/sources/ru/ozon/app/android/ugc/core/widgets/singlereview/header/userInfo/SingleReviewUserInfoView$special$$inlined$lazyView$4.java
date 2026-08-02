package ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SingleReviewUserInfoView$special$$inlined$lazyView$4 extends AbstractC7737t implements Function0<AppCompatImageView> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ ViewGroup $parent;
    final /* synthetic */ SingleReviewUserInfoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewUserInfoView$special$$inlined$lazyView$4(ViewGroup viewGroup, Context context, SingleReviewUserInfoView singleReviewUserInfoView) {
        super(0);
        this.$parent = viewGroup;
        this.$context$inlined = context;
        this.this$0 = singleReviewUserInfoView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AppCompatImageView invoke() {
        ConstraintLayout.b avatarLayoutParams;
        AppCompatImageView appCompatImageView = new AppCompatImageView(this.$context$inlined);
        appCompatImageView.setId(R$id.avatarIv);
        appCompatImageView.setBackgroundResource(R$drawable.bg_gray_ripple_blue_circle);
        ViewExtKt.setBackgroundTint(appCompatImageView, ThemeExtKt.themeColor(this.$context$inlined, R$attr.bgActionSecondary));
        avatarLayoutParams = this.this$0.getAvatarLayoutParams();
        appCompatImageView.setLayoutParams(avatarLayoutParams);
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(appCompatImageView);
        }
        return appCompatImageView;
    }
}
