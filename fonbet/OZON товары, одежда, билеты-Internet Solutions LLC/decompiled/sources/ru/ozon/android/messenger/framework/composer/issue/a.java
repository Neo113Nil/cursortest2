package ru.ozon.android.messenger.framework.composer.issue;

import A00.a;
import R00.c;
import We.z;
import i10.C6997c;
import i10.h;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.composer.ui.widget.l;
import z00.f;
import z00.g;
import z00.h;

/* loaded from: classes10.dex */
public final class a extends h<l> {
    @Override // z00.h
    @NotNull
    public final R00.b createIncident(@NotNull a.p event, @NotNull C6997c<l> state, @NotNull Throwable throwable) {
        z headers;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!(throwable instanceof HttpException)) {
            return g.c(throwable) ? new c(throwable) : super.createIncident(event, state, throwable);
        }
        HttpException httpException = (HttpException) throwable;
        Response<?> response = httpException.response();
        String c11 = (response == null || (headers = response.headers()) == null) ? null : headers.c("x-o3-trace-id");
        int code = httpException.code();
        String message = httpException.message();
        Intrinsics.checkNotNullExpressionValue(message, "message(...)");
        return new R00.a(c11, code, message);
    }

    @Override // z00.h
    @NotNull
    public final f createIssue(@NotNull a.p event, @NotNull C6997c<l> state, @NotNull Throwable throwable) {
        Response<?> response;
        z headers;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h.c d11 = state.l().d();
        if ((throwable instanceof SSLHandshakeException) || (throwable instanceof UnknownHostException) || (throwable instanceof ConnectException) || (throwable instanceof SocketTimeoutException) || (throwable instanceof SSLException)) {
            return g.a(throwable, d11, null);
        }
        if (!(throwable instanceof HttpException)) {
            return g.a(throwable, d11, null);
        }
        HttpException httpException = (HttpException) throwable;
        return new f.c((httpException == null || (response = httpException.response()) == null || (headers = response.headers()) == null) ? null : headers.c("x-o3-trace-id"), null, new f.c.a(d11 instanceof h.c.a ? ((h.c.a) d11).c() : null, 11), new f.c.C2320c(httpException != null ? Integer.valueOf(httpException.code()) : null, httpException != null ? httpException.message() : null), Long.valueOf(System.currentTimeMillis()), 14);
    }
}
