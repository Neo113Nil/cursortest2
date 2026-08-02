package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t0 implements b1 {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Boolean d;
    public Orientation e;
    public Integer f;
    public Integer g;
    public Skip h;
    public TapAction i;
    public UnitDisplayType j;
    public List k;

    public t0() {
        Boolean bool = Boolean.TRUE;
        this.a = bool;
        this.b = 5000;
        this.c = 0;
        this.d = bool;
        this.f = 0;
        this.g = Integer.valueOf(com.ironsource.mediationsdk.metadata.a.o);
        this.h = Skip.fromValue(0);
        this.k = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "autoPlay", this.a);
        c1.a(jSONObject, "maxBitrate", this.b);
        c1.a(jSONObject, "minBitrate", this.c);
        c1.a(jSONObject, "muted", this.d);
        c1.a(jSONObject, U3.i.n, this.e);
        c1.a(jSONObject, "padding", this.f);
        c1.a(jSONObject, "pivotBitrate", this.g);
        c1.a(jSONObject, "skip", this.h);
        c1.a(jSONObject, "tapAction", this.i);
        c1.a(jSONObject, "unitDisplayType", this.j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        c1.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }
}
