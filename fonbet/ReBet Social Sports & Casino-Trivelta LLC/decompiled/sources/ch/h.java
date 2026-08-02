package ch;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class h {
    public static final Map a(Function1 supplier, Function1 close, int i10) {
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        Intrinsics.checkNotNullParameter(close, "close");
        Map synchronizedMap = Collections.synchronizedMap(new s(supplier, close, i10));
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        return synchronizedMap;
    }
}
