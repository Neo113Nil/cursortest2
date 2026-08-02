package ru.ozon.app.android.common.activate_code;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.activate_code.presentation.ActivateCodeWidgetViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.coupon.ActivateCouponActionHandler;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;
import ru.ozon.app.android.marketing.coupon.domain.CouponInteractor;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/activate_code/presentation/ActivateCodeWidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ActivateCodeViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ActivateCodeWidgetViewHolder> {
    final /* synthetic */ CouponStorage $couponStorage;
    final /* synthetic */ ActivateCodeViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivateCodeViewMapper$holderProducer$1(ActivateCodeViewMapper activateCodeViewMapper, CouponStorage couponStorage) {
        super(2);
        this.this$0 = activateCodeViewMapper;
        this.$couponStorage = couponStorage;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ActivateCodeWidgetViewHolder invoke(View view, ComposerReferences references) {
        CouponInteractor couponInteractor;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        couponInteractor = this.this$0.interactor;
        return new ActivateCodeWidgetViewHolder(view, new ActivateCouponActionHandler(references, couponInteractor, this.$couponStorage), references);
    }
}
