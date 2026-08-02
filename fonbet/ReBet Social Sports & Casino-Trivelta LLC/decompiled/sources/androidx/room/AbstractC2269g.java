package androidx.room;

import Ph.AbstractC1481v0;
import Ph.L;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.room.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2269g {
    public static final L a(w wVar) {
        Map<String, Object> backingFieldMap = wVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = AbstractC1481v0.b(wVar.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (L) obj;
    }

    public static final L b(w wVar) {
        Map<String, Object> backingFieldMap = wVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = AbstractC1481v0.b(wVar.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (L) obj;
    }
}
