package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.sc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2653sc implements InterfaceC2621qf<JSONObject>, InterfaceC2585of<C2618qc> {
    private final Map<String, C2481j1> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC2380d7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC2603pf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (Map.Entry<String, C2481j1> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONArray a = entry.getValue().a(mode);
            if (a.length() > 0) {
                jsonObjectInit.put(key, a);
            }
        }
        return jsonObjectInit;
    }

    @Override // com.ironsource.InterfaceC2585of
    public void a(C2618qc record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String c = record.c();
        Map<String, C2481j1> map = this.a;
        C2481j1 c2481j1 = map.get(c);
        if (c2481j1 == null) {
            c2481j1 = new C2481j1();
            map.put(c, c2481j1);
        }
        c2481j1.a(record.a(new C2635rc()));
    }
}
