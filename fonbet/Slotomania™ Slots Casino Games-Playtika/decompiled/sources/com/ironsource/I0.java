package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class I0 implements InterfaceC2621qf<JSONObject>, InterfaceC2585of<G0> {
    private final Map<String, C2653sc> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC2380d7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC2603pf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (Map.Entry<String, C2653sc> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject a = entry.getValue().a(mode);
            if (a.length() > 0) {
                jsonObjectInit.put(StringsKt.substringAfterLast$default(key, "_", (String) null, 2, (Object) null), a);
            }
        }
        return jsonObjectInit;
    }

    @Override // com.ironsource.InterfaceC2585of
    public void a(G0 record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String d = record.d();
        Map<String, C2653sc> map = this.a;
        C2653sc c2653sc = map.get(d);
        if (c2653sc == null) {
            c2653sc = new C2653sc();
            map.put(d, c2653sc);
        }
        c2653sc.a(record.a(new H0()));
    }
}
