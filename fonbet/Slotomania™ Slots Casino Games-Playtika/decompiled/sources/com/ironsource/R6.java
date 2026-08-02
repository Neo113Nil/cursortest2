package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class R6 {
    private final T9 a;

    public R6(T9 globalDataWriter) {
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.a = globalDataWriter;
    }

    public final void a(JSONObject metaDataJson) {
        Intrinsics.checkNotNullParameter(metaDataJson, "metaDataJson");
        if (metaDataJson.has(com.ironsource.mediationsdk.metadata.a.i)) {
            try {
                Object remove = metaDataJson.remove(com.ironsource.mediationsdk.metadata.a.i);
                Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) remove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                this.a.e((String) obj);
            } catch (ClassCastException e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error("got the following error " + e.getMessage());
            }
        }
    }
}
