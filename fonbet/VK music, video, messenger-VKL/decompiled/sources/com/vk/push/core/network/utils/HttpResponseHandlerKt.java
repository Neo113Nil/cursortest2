package com.vk.push.core.network.utils;

import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import kotlin.Result;
import kotlin.a;
import xsna.izs;

/* compiled from: HttpResponseHandler.kt */
/* loaded from: classes5.dex */
public final class HttpResponseHandlerKt {
    public static final <T> Object handleVkpnsResponse(Object obj, izs<? super String, ? extends T> izsVar) {
        try {
            a.a(obj);
            HttpResponse httpResponse = (HttpResponse) obj;
            if (ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                ResponseError parseErrorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                return new Result.Failure(new VkpnsRequestWithErrorBodyException(parseErrorResponse.toString(), parseErrorResponse.getCode()));
            }
            if (httpResponse.isSuccessful()) {
                return izsVar.invoke(httpResponse.getBody());
            }
            String message = httpResponse.getMessage();
            if (message == null) {
                message = "";
            }
            return new Result.Failure(new VkpnsRequestException(message, httpResponse.getCode()));
        } catch (Exception e) {
            return new Result.Failure(e);
        }
    }
}
