package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class D0 extends E5 {
    private final C4484p0 a;
    private final C4341h0 b;
    private final String c;

    public /* synthetic */ D0(C4484p0 c4484p0, C4341h0 c4341h0, String str, int i, zcl zclVar) {
        this(c4484p0, c4341h0, (i & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        Map<String, Object> a = a(this.b);
        a.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        a.put("sessionDepth", Integer.valueOf(this.a.e()));
        String str = this.c;
        if (str != null) {
            a.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return a;
    }

    public D0(C4484p0 c4484p0, C4341h0 c4341h0, String str) {
        this.a = c4484p0;
        this.b = c4341h0;
        this.c = str;
    }
}
