package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$launchScrollStorageCleaner$1", f = "AccessoriesViewModelV2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AccessoriesViewModelV2$launchScrollStorageCleaner$1 extends j implements Function2<AccessoriesViewModelV2.Command, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AccessoriesViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessoriesViewModelV2$launchScrollStorageCleaner$1(AccessoriesViewModelV2 accessoriesViewModelV2, d<? super AccessoriesViewModelV2$launchScrollStorageCleaner$1> dVar) {
        super(2, dVar);
        this.this$0 = accessoriesViewModelV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AccessoriesViewModelV2$launchScrollStorageCleaner$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        HashMap hashMap;
        HashMap hashMap2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        x0Var = this.this$0._state;
        Set keySet = ((Map) x0Var.getValue()).keySet();
        ArrayList arrayList = new ArrayList();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            AtomAction.ComposerAction action = ((AccessoriesViewModelV2.Command.Request) it.next()).getAction();
            if (action != null) {
                arrayList.add(action);
            }
        }
        Set Y02 = C7714v.Y0(arrayList);
        hashMap = this.this$0.scrollStateStore;
        Set keySet2 = hashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet2, "<get-keys>(...)");
        Set d11 = e0.d(C7714v.Y0(keySet2), Y02);
        hashMap2 = this.this$0.scrollStateStore;
        Iterator it2 = d11.iterator();
        while (it2.hasNext()) {
            hashMap2.remove((AtomAction.ComposerAction) it2.next());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccessoriesViewModelV2.Command command, d<? super Unit> dVar) {
        return ((AccessoriesViewModelV2$launchScrollStorageCleaner$1) create(command, dVar)).invokeSuspend(Unit.f71690a);
    }
}
