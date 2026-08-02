package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm;

import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncState;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2;
import xe.Y;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command$Request;", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;", "uiState"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$state$1", f = "AccessoriesViewModelV2.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AccessoriesViewModelV2$state$1 extends j implements Function2<Map<AccessoriesViewModelV2.Command.Request, ? extends AccessoriesAsyncState>, d<? super Map<AccessoriesViewModelV2.Command.Request, ? extends AccessoriesAsyncState>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccessoriesViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessoriesViewModelV2$state$1(AccessoriesViewModelV2 accessoriesViewModelV2, d<? super AccessoriesViewModelV2$state$1> dVar) {
        super(2, dVar);
        this.this$0 = accessoriesViewModelV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AccessoriesViewModelV2$state$1 accessoriesViewModelV2$state$1 = new AccessoriesViewModelV2$state$1(this.this$0, dVar);
        accessoriesViewModelV2$state$1.L$0 = obj;
        return accessoriesViewModelV2$state$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        long j11;
        Map map2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            map = (Map) this.L$0;
            if (!map.isEmpty()) {
                long currentTimeMillis = System.currentTimeMillis();
                j11 = this.this$0.lastUpdateUiTime;
                long j12 = currentTimeMillis - j11;
                if (j12 < 1000) {
                    this.L$0 = map;
                    this.label = 1;
                    if (Y.b(1000 - j12, this) == aVar) {
                        return aVar;
                    }
                    map2 = map;
                }
                this.this$0.lastUpdateUiTime = System.currentTimeMillis();
            }
            return map;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        map2 = (Map) this.L$0;
        s.b(obj);
        map = map2;
        this.this$0.lastUpdateUiTime = System.currentTimeMillis();
        return map;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Map<AccessoriesViewModelV2.Command.Request, ? extends AccessoriesAsyncState> map, d<? super Map<AccessoriesViewModelV2.Command.Request, ? extends AccessoriesAsyncState>> dVar) {
        return ((AccessoriesViewModelV2$state$1) create(map, dVar)).invokeSuspend(Unit.f71690a);
    }
}
