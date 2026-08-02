package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/plaid/internal/Z6;", "", "", "apiKey", "xSentryToken", "Lcom/plaid/internal/core/crashreporting/internal/models/Crash;", "crash", "Lcom/plaid/internal/i4;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/plaid/internal/core/crashreporting/internal/models/Crash;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Z6 {
    @POST("store/")
    @Nullable
    Object a(@Header("X-Sentry-Auth") @NotNull String str, @Header("X-Sentry-Token") @NotNull String str2, @Body @NotNull Crash crash, @NotNull Continuation<? super AbstractC3654i4<? extends Object, ? extends Object>> continuation);
}
