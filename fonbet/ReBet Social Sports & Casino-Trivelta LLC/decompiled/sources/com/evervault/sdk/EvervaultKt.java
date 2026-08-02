package com.evervault.sdk;

import com.evervault.sdk.core.Http;
import com.facebook.hermes.intl.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"http", "Lcom/evervault/sdk/core/Http;", "Lcom/evervault/sdk/Config;", "getHttp", "(Lcom/evervault/sdk/Config;)Lcom/evervault/sdk/core/Http;", "evervault-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EvervaultKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Http getHttp(Config config) {
        return new Http(config.getHttpConfig(), config.getTeamId(), config.getAppId(), Constants.COLLATION_DEFAULT);
    }
}
