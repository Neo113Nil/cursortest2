package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class D0 extends E5 {
    private final C2588p0 a;
    private final C2445h0 b;
    private final String c;

    public /* synthetic */ D0(C2588p0 c2588p0, C2445h0 c2445h0, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2588p0, c2445h0, (i & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        Map<String, Object> a = a(this.b);
        a.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        a.put("sessionDepth", Integer.valueOf(this.a.f()));
        String str = this.c;
        if (str != null) {
            a.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return a;
    }

    public D0(C2588p0 adTools, C2445h0 adProperties, String str) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.a = adTools;
        this.b = adProperties;
        this.c = str;
    }
}
