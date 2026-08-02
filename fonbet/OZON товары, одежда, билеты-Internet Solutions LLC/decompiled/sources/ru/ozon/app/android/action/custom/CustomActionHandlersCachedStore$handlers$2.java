package ru.ozon.app.android.action.custom;

import Pc.a;
import Vg.f;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "LVg/f;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CustomActionHandlersCachedStore$handlers$2 extends AbstractC7737t implements Function0<Set<? extends f>> {
    final /* synthetic */ CustomActionHandlersCachedStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomActionHandlersCachedStore$handlers$2(CustomActionHandlersCachedStore customActionHandlersCachedStore) {
        super(0);
        this.this$0 = customActionHandlersCachedStore;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends f> invoke() {
        Set<Class> set;
        Map map;
        set = this.this$0.supportedHandlers;
        if (set == null) {
            return null;
        }
        CustomActionHandlersCachedStore customActionHandlersCachedStore = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (Class cls : set) {
            map = customActionHandlersCachedStore.handlersProviders;
            a aVar = (a) map.get(cls);
            f fVar = aVar != null ? (f) aVar.get() : null;
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return C7714v.Y0(arrayList);
    }
}
