package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class T6 {
    private final U9 a;

    public T6(U9 u9) {
        this.a = u9;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject.has(com.ironsource.mediationsdk.metadata.a.i)) {
            try {
                ArrayList arrayList = (ArrayList) jSONObject.remove(com.ironsource.mediationsdk.metadata.a.i);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.a.e((String) arrayList.get(0));
            } catch (ClassCastException e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error("got the following error " + e.getMessage());
            }
        }
    }
}
