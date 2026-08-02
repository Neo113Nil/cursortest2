package ru.ozon.app.android.pdp.widgets.tabs.compose;

import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.PdpTabsSelectionState;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposableKt$PdpTabsContent$1$1", f = "PdpTabsComposable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PdpTabsComposableKt$PdpTabsContent$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ PdpTabsVO $item;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdpTabsComposableKt$PdpTabsContent$1$1(PdpTabsVO pdpTabsVO, d<? super PdpTabsComposableKt$PdpTabsContent$1$1> dVar) {
        super(2, dVar);
        this.$item = pdpTabsVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PdpTabsComposableKt$PdpTabsContent$1$1(this.$item, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Iterator<T> it = this.$item.getTabs().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((PdpTabsVO.Tab) obj2).getIsSelected()) {
                break;
            }
        }
        PdpTabsVO.Tab tab = (PdpTabsVO.Tab) obj2;
        if (tab != null) {
            PdpTabsVO pdpTabsVO = this.$item;
            PdpTabsSelectionState pdpTabsSelectionState = PdpTabsSelectionState.INSTANCE;
            String groupId = tab.getGroupId();
            List<PdpTabsVO.Tab> tabs = pdpTabsVO.getTabs();
            ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
            Iterator<T> it2 = tabs.iterator();
            while (it2.hasNext()) {
                arrayList.add(((PdpTabsVO.Tab) it2.next()).getGroupId());
            }
            pdpTabsSelectionState.onTabSelected(groupId, arrayList);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PdpTabsComposableKt$PdpTabsContent$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
