package io.appmetrica.analytics.adrevenue.ironsource.v9.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends HashMap {
    public a(String str) {
        put(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-ironsource-v9");
        put(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str == null ? "null" : str);
        put(AdRevenueConstants.SOURCE_KEY, "ironsource");
    }
}
