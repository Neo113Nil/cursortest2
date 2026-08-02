package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm;

import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncState;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;
import xe.E0;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "command", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$launchPerformCommands$1", f = "AccessoriesViewModelV2.kt", l = {129, 143}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AccessoriesViewModelV2$launchPerformCommands$1 extends j implements Function2<AccessoriesViewModelV2.Command, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AccessoriesViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessoriesViewModelV2$launchPerformCommands$1(AccessoriesViewModelV2 accessoriesViewModelV2, d<? super AccessoriesViewModelV2$launchPerformCommands$1> dVar) {
        super(2, dVar);
        this.this$0 = accessoriesViewModelV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AccessoriesViewModelV2$launchPerformCommands$1 accessoriesViewModelV2$launchPerformCommands$1 = new AccessoriesViewModelV2$launchPerformCommands$1(this.this$0, dVar);
        accessoriesViewModelV2$launchPerformCommands$1.L$0 = obj;
        return accessoriesViewModelV2$launchPerformCommands$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if (xe.C10721f.c(r1, r9) == r0) goto L53;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AccessoriesViewModelV2.Command command;
        Map map;
        AtomAction.ComposerAction action;
        AccessoriesViewModelV2 accessoriesViewModelV2;
        x0 x0Var;
        Map map2;
        Map map3;
        AccessoriesViewModelV2.Command command2;
        AtomAction.ComposerAction composerAction;
        AccessoriesViewModelV2 accessoriesViewModelV22;
        Map map4;
        Map map5;
        Set set;
        Set set2;
        x0 x0Var2;
        Object value;
        x0 x0Var3;
        Object value2;
        CoroutineDispatcherProvider coroutineDispatcherProvider;
        Map map6;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s.b(obj);
                this.this$0.activeJobs = U.c();
                set = this.this$0.viewWidgetIsTracked;
                set.clear();
                set2 = this.this$0.trackedViewItems;
                set2.clear();
                this.this$0.lastUpdateUiTime = 0L;
                x0Var2 = this.this$0._state;
                do {
                    value = x0Var2.getValue();
                } while (!x0Var2.b(value, U.c()));
                return Unit.f71690a;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            composerAction = (AtomAction.ComposerAction) this.L$2;
            accessoriesViewModelV22 = (AccessoriesViewModelV2) this.L$1;
            command2 = (AccessoriesViewModelV2.Command) this.L$0;
            s.b(obj);
            accessoriesViewModelV2 = accessoriesViewModelV22;
            command = command2;
            action = composerAction;
            x0Var3 = accessoriesViewModelV2._state;
            do {
                value2 = x0Var3.getValue();
            } while (!x0Var3.b(value2, U.n((Map) value2, new Pair(command, AccessoriesAsyncState.Loading.INSTANCE))));
            C6788a a11 = androidx.lifecycle.x0.a(accessoriesViewModelV2);
            coroutineDispatcherProvider = accessoriesViewModelV2.dispatcherProvider;
            B0 c11 = C10727i.c(a11, coroutineDispatcherProvider.getIO(), null, new AccessoriesViewModelV2$launchPerformCommands$1$5$2(accessoriesViewModelV2, action, command, null), 2);
            map6 = accessoriesViewModelV2.activeJobs;
            accessoriesViewModelV2.activeJobs = U.n(map6, new Pair(action, c11));
            return Unit.f71690a;
        }
        s.b(obj);
        command = (AccessoriesViewModelV2.Command) this.L$0;
        map = this.this$0.activeJobs;
        if (!map.isEmpty()) {
            AccessoriesViewModelV2 accessoriesViewModelV23 = this.this$0;
            map5 = accessoriesViewModelV23.activeJobs;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map5.entrySet()) {
                if (((B0) entry.getValue()).isActive()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            accessoriesViewModelV23.activeJobs = linkedHashMap;
        }
        if (!Intrinsics.d(command, AccessoriesViewModelV2.Command.ClearState.INSTANCE)) {
            if (!(command instanceof AccessoriesViewModelV2.Command.Request)) {
                throw new o();
            }
            action = ((AccessoriesViewModelV2.Command.Request) command).getAction();
            if (action != null) {
                accessoriesViewModelV2 = this.this$0;
                x0Var = accessoriesViewModelV2._state;
                AccessoriesAsyncState accessoriesAsyncState = (AccessoriesAsyncState) ((Map) x0Var.getValue()).get(command);
                if (!(accessoriesAsyncState instanceof AccessoriesAsyncState.Success) && !(accessoriesAsyncState instanceof AccessoriesAsyncState.Hided)) {
                    map2 = accessoriesViewModelV2.activeJobs;
                    B0 b02 = (B0) map2.get(action);
                    if (b02 == null || !b02.isActive()) {
                        map3 = accessoriesViewModelV2.activeJobs;
                        B0 b03 = (B0) map3.get(action);
                        if (b03 != null) {
                            this.L$0 = command;
                            this.L$1 = accessoriesViewModelV2;
                            this.L$2 = action;
                            this.label = 2;
                            if (E0.c(b03, this) != aVar) {
                                command2 = command;
                                composerAction = action;
                                accessoriesViewModelV22 = accessoriesViewModelV2;
                                accessoriesViewModelV2 = accessoriesViewModelV22;
                                command = command2;
                                action = composerAction;
                            }
                        }
                        x0Var3 = accessoriesViewModelV2._state;
                        do {
                            value2 = x0Var3.getValue();
                        } while (!x0Var3.b(value2, U.n((Map) value2, new Pair(command, AccessoriesAsyncState.Loading.INSTANCE))));
                        C6788a a112 = androidx.lifecycle.x0.a(accessoriesViewModelV2);
                        coroutineDispatcherProvider = accessoriesViewModelV2.dispatcherProvider;
                        B0 c112 = C10727i.c(a112, coroutineDispatcherProvider.getIO(), null, new AccessoriesViewModelV2$launchPerformCommands$1$5$2(accessoriesViewModelV2, action, command, null), 2);
                        map6 = accessoriesViewModelV2.activeJobs;
                        accessoriesViewModelV2.activeJobs = U.n(map6, new Pair(action, c112));
                    }
                }
            }
            return Unit.f71690a;
        }
        map4 = this.this$0.activeJobs;
        ArrayList arrayList = new ArrayList(map4.size());
        Iterator it = map4.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((B0) ((Map.Entry) it.next()).getValue());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((B0) it2.next()).j(null);
        }
        this.label = 1;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccessoriesViewModelV2.Command command, d<? super Unit> dVar) {
        return ((AccessoriesViewModelV2$launchPerformCommands$1) create(command, dVar)).invokeSuspend(Unit.f71690a);
    }
}
