package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Q6 {

    @NotNull
    private final T9 a;

    public Q6(@NotNull T9 t9) {
        t9.getClass();
        this.a = t9;
    }

    public final void a(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.has(com.ironsource.mediationsdk.metadata.a.j)) {
            try {
                Object remove = jSONObject.remove(com.ironsource.mediationsdk.metadata.a.j);
                remove.getClass();
                ArrayList arrayList = (ArrayList) remove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                obj.getClass();
                this.a.e((String) obj);
            } catch (ClassCastException e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error("got the following error " + e.getMessage());
            }
        }
    }
}
