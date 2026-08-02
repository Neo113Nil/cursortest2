package A2;

import androidx.room.w;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {
    public static final void a(HashMap map, boolean z10, Function1 fetchBlock) {
        int i10;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        HashMap hashMap = new HashMap(w.MAX_BIND_PARAMETER_CNT);
        loop0: while (true) {
            i10 = 0;
            for (Object key : map.keySet()) {
                if (z10) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap.put(key, map.get(key));
                } else {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap.put(key, null);
                }
                i10++;
                if (i10 == 999) {
                    fetchBlock.invoke(hashMap);
                    if (!z10) {
                        map.putAll(hashMap);
                    }
                    hashMap.clear();
                }
            }
            break loop0;
        }
        if (i10 > 0) {
            fetchBlock.invoke(hashMap);
            if (z10) {
                return;
            }
            map.putAll(hashMap);
        }
    }
}
