package ru.ozon.app.android.marketing.widgets.couponList.presentation;

import BO.b;
import Lm0.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ru/ozon/app/android/marketing/widgets/couponList/presentation/CouponBlockViewHolder$onAttach$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponBlockViewHolder$onAttach$1 implements DefaultLifecycleObserver {
    final /* synthetic */ CouponBlockViewHolder this$0;

    CouponBlockViewHolder$onAttach$1(CouponBlockViewHolder couponBlockViewHolder) {
        this.this$0 = couponBlockViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onStart$lambda$2$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(J owner) {
        BaseCouponVO.CouponVO couponVO;
        AdultDelegate adultDelegate;
        Intrinsics.checkNotNullParameter(owner, "owner");
        couponVO = this.this$0.item;
        if (couponVO != null) {
            if (!couponVO.getIsAdult()) {
                couponVO = null;
            }
            if (couponVO != null) {
                CouponBlockViewHolder couponBlockViewHolder = this.this$0;
                adultDelegate = couponBlockViewHolder.adultDelegate;
                p filter = adultDelegate.observeItem().filter(new b(new CouponBlockViewHolder$onAttach$1$onStart$2$1(couponBlockViewHolder), 13));
                Intrinsics.checkNotNullExpressionValue(filter, "filter(...)");
                RxExtKt.observe$default(filter, couponBlockViewHolder, new CouponBlockViewHolder$onAttach$1$onStart$2$2(couponBlockViewHolder), new CouponBlockViewHolder$onAttach$1$onStart$2$3(a.f17149a), null, 8, null);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(J owner) {
        AdultDelegate adultDelegate;
        Intrinsics.checkNotNullParameter(owner, "owner");
        adultDelegate = this.this$0.adultDelegate;
        adultDelegate.clear();
    }
}
