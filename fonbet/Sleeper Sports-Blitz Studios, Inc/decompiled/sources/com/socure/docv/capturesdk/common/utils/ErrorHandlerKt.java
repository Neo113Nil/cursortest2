package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.common.logger.LoggerKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ErrorHandler.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u001a\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"TAG", "", "getErrorCodeFromNewFormat", "", "jsonString", "getErrorSocureSdkResponseHttpInfo", "Lkotlin/Pair;", "errorResponseBody", "Lokhttp3/ResponseBody;", "isValidJson", "", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ErrorHandlerKt {
    private static final String TAG = "SDLT_ErrorHandler";

    public static final Pair<Integer, String> getErrorSocureSdkResponseHttpInfo(ResponseBody responseBody) {
        String string;
        String str = ConstantsKt.MESSAGE_NOT_AVAILABLE;
        if (responseBody != null) {
            try {
                string = responseBody.string();
            } catch (Throwable th) {
                String localizedMessage = th.getLocalizedMessage();
                if (localizedMessage != null) {
                    str = localizedMessage;
                }
                return new Pair<>(-1, str);
            }
        } else {
            string = null;
        }
        LoggerKt.logDetailed(TAG, "getErrorSocureSdkResponseHttpInfo " + string);
        int errorCodeFromNewFormat = getErrorCodeFromNewFormat(string);
        if (errorCodeFromNewFormat != -1) {
            return new Pair<>(Integer.valueOf(errorCodeFromNewFormat), ConstantsKt.MESSAGE_NOT_AVAILABLE);
        }
        if (!isValidJson(string)) {
            return string != null ? new Pair<>(-1, string) : new Pair<>(-1, ConstantsKt.MESSAGE_NOT_AVAILABLE);
        }
        if (string == null) {
            return new Pair<>(-1, ConstantsKt.MESSAGE_NOT_AVAILABLE);
        }
        JSONObject jSONObject = new JSONObject(string);
        if (!jSONObject.has("data")) {
            return new Pair<>(Integer.valueOf(jSONObject.optInt("code", -1)), jSONObject.optString("message", jSONObject.optString("msg", ConstantsKt.MESSAGE_NOT_AVAILABLE)));
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        return new Pair<>(Integer.valueOf(jSONObject2.optInt("code", -1)), jSONObject2.optString("message", jSONObject2.optString("msg", jSONObject.optString("msg", ConstantsKt.MESSAGE_NOT_AVAILABLE))));
    }

    public static final int getErrorCodeFromNewFormat(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
            JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("nextModule") : null;
            JSONObject optJSONObject3 = optJSONObject2 != null ? optJSONObject2.optJSONObject("moduleConfig") : null;
            JSONObject optJSONObject4 = optJSONObject3 != null ? optJSONObject3.optJSONObject("labels") : null;
            if (optJSONObject4 != null) {
                return optJSONObject4.optInt("errorCode", -1);
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public static final boolean isValidJson(String str) {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(new JSONObject(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m13473exceptionOrNullimpl(m13470constructorimpl) == null) {
            return true;
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            m13470constructorimpl2 = Result.m13470constructorimpl(new JSONArray(str));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
        }
        return Result.m13473exceptionOrNullimpl(m13470constructorimpl2) == null;
    }
}
