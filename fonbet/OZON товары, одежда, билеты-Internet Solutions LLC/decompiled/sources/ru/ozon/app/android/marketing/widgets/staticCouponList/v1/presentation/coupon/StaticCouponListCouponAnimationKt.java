package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon;

import B90.W;
import E.a0;
import E.b0;
import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.dynamicanimation.animation.b;
import androidx.dynamicanimation.animation.f;
import androidx.dynamicanimation.animation.g;
import fM.RunnableC6479a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListStubView;", "Lkotlin/Function0;", "", "onTear", "animateTear", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListStubView;Lkotlin/jvm/functions/Function0;)V", "marketing_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListCouponAnimationKt {
    public static final void animateTear(@NotNull StaticCouponListStubView staticCouponListStubView, @NotNull Function0<Unit> onTear) {
        Intrinsics.checkNotNullParameter(staticCouponListStubView, "<this>");
        Intrinsics.checkNotNullParameter(onTear, "onTear");
        staticCouponListStubView.setPivotX(0.0f);
        staticCouponListStubView.setPivotY(0.0f);
        staticCouponListStubView.animate().rotation(6.0f).setDuration(500L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new b0(3, staticCouponListStubView, onTear)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateTear$lambda$7(StaticCouponListStubView staticCouponListStubView, Function0 function0) {
        ViewPropertyAnimator animate = staticCouponListStubView.animate();
        Context context = staticCouponListStubView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        animate.translationX(ResourceExtKt.toPxF(1, context)).rotation(-6.0f).setDuration(150L).setInterpolator(new AccelerateDecelerateInterpolator()).withStartAction(new RunnableC6479a(function0, 1)).withEndAction(new W(staticCouponListStubView, 4)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateTear$lambda$7$lambda$6(StaticCouponListStubView staticCouponListStubView) {
        f fVar = new f(staticCouponListStubView, b.f42643m);
        g gVar = new g();
        gVar.d(0.0f);
        gVar.c(0.3f);
        gVar.e(1500.0f);
        fVar.o(gVar);
        fVar.i();
        fVar.h();
        f fVar2 = new f(staticCouponListStubView, b.f42647q);
        g gVar2 = new g();
        gVar2.d(0.0f);
        gVar2.c(0.3f);
        gVar2.e(200.0f);
        fVar2.o(gVar2);
        fVar2.i();
        fVar2.h();
        staticCouponListStubView.post(new a0(2, fVar, fVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateTear$lambda$7$lambda$6$lambda$5(f fVar, f fVar2) {
        fVar.l();
        fVar2.l();
    }
}
