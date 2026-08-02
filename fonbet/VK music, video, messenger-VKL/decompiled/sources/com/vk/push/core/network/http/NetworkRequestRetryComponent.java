package com.vk.push.core.network.http;

import com.vk.push.common.Logger;
import com.vk.push.core.backoff.BackOff;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.retry.RequestRetryComponent;
import java.io.IOException;
import xsna.zcl;

/* compiled from: NetworkRequestRetryComponent.kt */
/* loaded from: classes5.dex */
public final class NetworkRequestRetryComponent extends RequestRetryComponent {
    public final Logger d;

    public /* synthetic */ NetworkRequestRetryComponent(Logger logger, BackOff backOff, int i, zcl zclVar) {
        this(logger, (i & 2) != 0 ? RequestRetryComponent.Companion.createDefaultBackOffForRequest() : backOff);
    }

    @Override // com.vk.push.core.retry.RequestRetryComponent
    public Logger getLogger() {
        return this.d;
    }

    @Override // com.vk.push.core.retry.RequestRetryComponent
    public boolean isRetryableError(Throwable th) {
        int httpStatusCode;
        int code;
        if (th instanceof IOException) {
            return true;
        }
        if (th instanceof VkpnsRequestWithErrorBodyException) {
            VkpnsRequestWithErrorBodyException vkpnsRequestWithErrorBodyException = (VkpnsRequestWithErrorBodyException) th;
            return vkpnsRequestWithErrorBodyException.getCode() == 429 || (500 <= (code = vkpnsRequestWithErrorBodyException.getCode()) && code < 600);
        }
        if (!(th instanceof VkpnsRequestException)) {
            return false;
        }
        VkpnsRequestException vkpnsRequestException = (VkpnsRequestException) th;
        return vkpnsRequestException.getHttpStatusCode() == 429 || (500 <= (httpStatusCode = vkpnsRequestException.getHttpStatusCode()) && httpStatusCode < 600);
    }

    public NetworkRequestRetryComponent(Logger logger, BackOff backOff) {
        super(backOff);
        this.d = logger.createLogger("NetworkRequestRetryComponent");
    }
}
