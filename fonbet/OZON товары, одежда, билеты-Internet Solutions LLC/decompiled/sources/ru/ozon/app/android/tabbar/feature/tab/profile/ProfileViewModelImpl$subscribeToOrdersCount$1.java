package ru.ozon.app.android.tabbar.feature.tab.profile;

import Ae.x0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "count", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.tabbar.feature.tab.profile.ProfileViewModelImpl$subscribeToOrdersCount$1", f = "ProfileTabViewModel.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ProfileViewModelImpl$subscribeToOrdersCount$1 extends j implements Function2<Integer, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfileViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileViewModelImpl$subscribeToOrdersCount$1(ProfileViewModelImpl profileViewModelImpl, d<? super ProfileViewModelImpl$subscribeToOrdersCount$1> dVar) {
        super(2, dVar);
        this.this$0 = profileViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ProfileViewModelImpl$subscribeToOrdersCount$1 profileViewModelImpl$subscribeToOrdersCount$1 = new ProfileViewModelImpl$subscribeToOrdersCount$1(this.this$0, dVar);
        profileViewModelImpl$subscribeToOrdersCount$1.L$0 = obj;
        return profileViewModelImpl$subscribeToOrdersCount$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, d<? super Unit> dVar) {
        return ((ProfileViewModelImpl$subscribeToOrdersCount$1) create(num, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Integer num = (Integer) this.L$0;
            x0Var = this.this$0.ordersCountState;
            Integer num2 = new Integer(num != null ? num.intValue() : 0);
            this.label = 1;
            if (x0Var.emit(num2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
