package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public final class Y2 extends C4461nd {
    private final C4484p0 b;
    private final ISBannerSize c;

    public Y2(C4484p0 c4484p0, ISBannerSize iSBannerSize, String str) {
        super(str);
        this.b = c4484p0;
        this.c = iSBannerSize;
    }

    @Override // com.ironsource.C4461nd, com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(super.a(c0));
        this.b.a(linkedHashMap, this.c);
        return linkedHashMap;
    }
}
