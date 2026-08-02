package com.zoho.livechat.android.modules.common.data.remote.responses;

import com.google.gson.Gson;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.C5582a;
import og.AbstractC5895g;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* loaded from: classes4.dex */
public abstract class a {
    public static final SalesIQResponse.Error a(Response response, Gson gson) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(response, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        try {
            Integer valueOf = Integer.valueOf(response.code());
            ResponseBody errorBody = response.errorBody();
            SalesIQResponse.Error.ErrorResponse errorResponse = (SalesIQResponse.Error.ErrorResponse) AbstractC5895g.b(gson, (errorBody == null || (string2 = errorBody.string()) == null) ? null : StringsKt.trim((CharSequence) string2).toString(), SalesIQResponse.Error.ErrorResponse.class);
            ResponseBody errorBody2 = response.errorBody();
            return new SalesIQResponse.Error(valueOf, errorResponse, new Exception((errorBody2 == null || (string = errorBody2.string()) == null) ? null : StringsKt.trim((CharSequence) string).toString()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final C5582a b(SalesIQResponse.Error error) {
        Integer e10;
        SalesIQResponse.Error.ErrorResponse.Error error2;
        SalesIQResponse.Error.ErrorResponse.Error error3;
        Intrinsics.checkNotNullParameter(error, "<this>");
        C5582a.C0817a c0817a = C5582a.f56502b;
        SalesIQResponse.Error.ErrorResponse c10 = error.c();
        String message = (c10 == null || (error3 = c10.getError()) == null) ? null : error3.getMessage();
        SalesIQResponse.Error.ErrorResponse c11 = error.c();
        if (c11 == null || (error2 = c11.getError()) == null || (e10 = error2.getCode()) == null) {
            e10 = error.e();
        }
        return c0817a.b(new C5582a.b(message, e10, error.a()));
    }

    public static final C5582a c(SalesIQResponse salesIQResponse) {
        C5582a b10;
        Intrinsics.checkNotNullParameter(salesIQResponse, "<this>");
        if (salesIQResponse.getIsSuccess()) {
            return C5582a.f56502b.d(salesIQResponse.getData());
        }
        SalesIQResponse.Error error = salesIQResponse.getError();
        return (error == null || (b10 = b(error)) == null) ? C5582a.C0817a.c(C5582a.f56502b, new Exception(), false, 2, null) : b10;
    }
}
