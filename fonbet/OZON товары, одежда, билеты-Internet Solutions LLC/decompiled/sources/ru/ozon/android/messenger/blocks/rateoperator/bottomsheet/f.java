package ru.ozon.android.messenger.blocks.rateoperator.bottomsheet;

import Sc.s;
import android.widget.FrameLayout;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.notification.g;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.RateOperatorBottomSheetFragment$observeNetworkState$1", f = "RateOperatorBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<NetworkInfo, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f86202d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f86203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(a aVar, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f86203e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        f fVar = new f(this.f86203e, dVar);
        fVar.f86202d = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NetworkInfo networkInfo, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(networkInfo, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        boolean z11 = ((NetworkInfo) this.f86202d) instanceof NetworkInfo.Available;
        a aVar2 = this.f86203e;
        if (z11) {
            a.z(aVar2).rateSendButton.setEnabled(true);
        } else {
            a.z(aVar2).rateSendButton.setEnabled(false);
            g.a aVar3 = aVar2.f86179h;
            if (aVar3 == null) {
                Intrinsics.n("noInternetNotificationPresenter");
                throw null;
            }
            FrameLayout constraintLayout = a.z(aVar2).getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(constraintLayout, null, 1, null);
            J viewLifecycleOwner = aVar2.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            aVar3.a(asNotificationLayoutManager$default, viewLifecycleOwner);
        }
        return Unit.f71690a;
    }
}
