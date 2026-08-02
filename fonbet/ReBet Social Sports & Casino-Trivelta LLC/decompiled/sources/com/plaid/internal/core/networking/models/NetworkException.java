package com.plaid.internal.core.networking.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/plaid/internal/core/networking/models/NetworkException;", "", "a", "networking_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkException extends Throwable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f39865c = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f39866a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f39867b;

    public static final class a {
        @NotNull
        public static NetworkException a(@NotNull Request request, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            String str = "Request failed - " + request.url().encodedPath();
            HttpUrl url = request.url();
            int code = response.code();
            ResponseBody body = response.body();
            return new NetworkException(str, StringsKt.trimIndent("\n        \n        \n        Url: " + url + "\n        Response code: " + code + "\n        Error message: " + (body != null ? new com.plaid.internal.core.networking.models.a(body) : null) + "\n        \n        Stacktrace:\n      "));
        }
    }

    public NetworkException(@NotNull String title, @NotNull String message) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f39866a = title;
        this.f39867b = message;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.f39867b;
    }
}
