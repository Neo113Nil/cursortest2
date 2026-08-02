package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class k1 {
    private final com.applovin.impl.sdk.l a;

    public k1(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
    }

    public void a(Uri uri) {
        com.applovin.impl.sdk.p.g("DeepLinkManager", "Processing incoming URL: " + uri);
        if (CollectionUtils.atLeastOneValueMatch(uri.getQueryParameterNames(), Arrays.asList("aleid", "alart"))) {
            String queryParameter = uri.getQueryParameter("alart");
            if (StringUtils.isValidString(queryParameter)) {
                this.a.y0().b(queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("aleid");
            if (StringUtils.isValidString(queryParameter2)) {
                this.a.y0().c(queryParameter2);
            }
        }
    }
}
