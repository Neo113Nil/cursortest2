package ru.ozon.app.android.analytics.eventstorage;

import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.analytics.eventstorage.ViewEventStorageImpl$scheduleExpiredCacheTracesCleaning$1", f = "ViewEventStorage.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class ViewEventStorageImpl$scheduleExpiredCacheTracesCleaning$1 extends j implements Function2<M, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ViewEventStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewEventStorageImpl$scheduleExpiredCacheTracesCleaning$1(ViewEventStorageImpl viewEventStorageImpl, d<? super ViewEventStorageImpl$scheduleExpiredCacheTracesCleaning$1> dVar) {
        super(2, dVar);
        this.this$0 = viewEventStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ViewEventStorageImpl$scheduleExpiredCacheTracesCleaning$1 viewEventStorageImpl$scheduleExpiredCacheTracesCleaning$1 = new ViewEventStorageImpl$scheduleExpiredCacheTracesCleaning$1(this.this$0, dVar);
        viewEventStorageImpl$scheduleExpiredCacheTracesCleaning$1.L$0 = obj;
        return viewEventStorageImpl$scheduleExpiredCacheTracesCleaning$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<String> arrayList;
        M m11;
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m12 = (M) this.L$0;
            arrayList = new ArrayList();
            m11 = m12;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (List) this.L$1;
            m11 = (M) this.L$0;
            s.b(obj);
        }
        while (N.f(m11)) {
            concurrentHashMap = this.this$0.traces;
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (((ExpirableMetrics) entry.getValue()).getCreationTime() < System.currentTimeMillis() - 600000) {
                    arrayList.add(entry.getKey());
                }
            }
            ViewEventStorageImpl viewEventStorageImpl = this.this$0;
            for (String str : arrayList) {
                concurrentHashMap2 = viewEventStorageImpl.traces;
                concurrentHashMap2.remove(str);
            }
            arrayList.clear();
            this.L$0 = m11;
            this.L$1 = arrayList;
            this.label = 1;
            if (Y.b(600000L, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ViewEventStorageImpl$scheduleExpiredCacheTracesCleaning$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
