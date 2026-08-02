package ru.ozon.mapsdk.common.geoproxy.model;

import We.B;
import We.E;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import pf0.AbstractC8919b;
import pf0.h;
import pf0.i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LWe/E;", "invoke", "()LWe/E;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class HostMapClientConfig$networkClient$2 extends AbstractC7737t implements Function0<E> {
    final /* synthetic */ HostMapClientConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HostMapClientConfig$networkClient$2(HostMapClientConfig hostMapClientConfig) {
        super(0);
        this.this$0 = hostMapClientConfig;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final E invoke() {
        h ozonNetworkPlugin;
        List list;
        List list2;
        ozonNetworkPlugin = this.this$0.getOzonNetworkPlugin();
        E y11 = ozonNetworkPlugin.y(new i() { // from class: ru.ozon.mapsdk.common.geoproxy.model.HostMapClientConfig$networkClient$2$client$1
            private final AbstractC8919b consumer = AbstractC8919b.a.f80501a;

            @Override // pf0.i
            public AbstractC8919b getConsumer() {
                return this.consumer;
            }
        });
        list = this.this$0.debugInterceptors;
        if (list == null) {
            return y11;
        }
        y11.getClass();
        E.a aVar = new E.a(y11);
        list2 = this.this$0.debugInterceptors;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            aVar.a((B) it.next());
        }
        return new E(aVar);
    }
}
