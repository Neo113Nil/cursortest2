package com.plaid.internal;

import com.plaid.internal.C3556a6;
import com.plaid.internal.core.networking.models.NetworkException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import zendesk.core.Constants;

@SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addInterceptor$2\n+ 2 PlaidRetrofitFactory.kt\ncom/plaid/internal/core/networking/PlaidRetrofitFactory\n*L\n1#1,1079:1\n61#2,14:1080\n*E\n"})
/* loaded from: classes3.dex */
public final class F5 implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E5 f39249a;

    public F5(E5 e52) {
        this.f39249a = e52;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        String str = this.f39249a.f39231a;
        if (str != null) {
            newBuilder.addHeader(Constants.USER_AGENT_HEADER_KEY, str);
        }
        Request build = newBuilder.build();
        Response proceed = chain.proceed(build);
        if (!proceed.isSuccessful() && !StringsKt.contains$default((CharSequence) build.url().encodedPath(), (CharSequence) "sentry", false, 2, (Object) null)) {
            int i10 = NetworkException.f39865c;
            NetworkException a10 = NetworkException.a.a(build, proceed);
            C3556a6.a.a(C3556a6.f39823a, a10, a10.f39866a);
        }
        return proceed;
    }
}
