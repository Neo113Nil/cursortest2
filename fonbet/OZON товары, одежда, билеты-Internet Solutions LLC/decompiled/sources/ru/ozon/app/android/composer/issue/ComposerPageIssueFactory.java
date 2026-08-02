package ru.ozon.app.android.composer.issue;

import A00.a;
import R00.b;
import R00.c;
import We.z;
import gf.t;
import i10.C6997c;
import i10.h;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ob0.r;
import oc.C8691a;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.app.android.emptyscreen.AntibotDefaultPageIssue;
import ru.ozon.composer.ui.widget.l;
import z00.f;
import z00.g;
import z00.h;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b*\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/composer/issue/ComposerPageIssueFactory;", "Lz00/h;", "Lru/ozon/composer/ui/widget/l;", "<init>", "()V", "", "Li10/h$c;", "pageRef", "Lz00/f;", "toPageIssue", "(Ljava/lang/Throwable;Li10/h$c;)Lz00/f;", "Lretrofit2/HttpException;", "httpException", "Lz00/f$c;", "parsePageIssueTraceId", "(Lretrofit2/HttpException;Li10/h$c;)Lz00/f$c;", "", "isBXNoConnectionException", "(Ljava/lang/Throwable;)Z", "LA00/a$p;", "event", "Li10/c;", "state", "throwable", "createIssue", "(LA00/a$p;Li10/c;Ljava/lang/Throwable;)Lz00/f;", "LR00/b;", "createIncident", "(LA00/a$p;Li10/c;Ljava/lang/Throwable;)LR00/b;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerPageIssueFactory extends h<l> {
    private final boolean isBXNoConnectionException(Throwable th2) {
        return (th2 instanceof ProtocolException) || (th2 instanceof InterruptedIOException) || (th2 instanceof t);
    }

    private final f.c parsePageIssueTraceId(HttpException httpException, h.c pageRef) {
        Response<?> response;
        z headers;
        return new f.c((httpException == null || (response = httpException.response()) == null || (headers = response.headers()) == null) ? null : headers.c("x-o3-trace-id"), null, new f.c.a(pageRef instanceof h.c.a ? ((h.c.a) pageRef).c() : null, 11), new f.c.C2320c(httpException != null ? Integer.valueOf(httpException.code()) : null, httpException != null ? httpException.message() : null), Long.valueOf(System.currentTimeMillis()), 14);
    }

    private final f toPageIssue(Throwable th2, h.c cVar) {
        f a11;
        f pageIssue$default;
        if (isBXNoConnectionException(th2) || g.c(th2)) {
            return f.a.f106883a;
        }
        if (th2 instanceof r) {
            return new AntibotDefaultPageIssue(false, ((r) th2).b(), 1, null);
        }
        if (th2 instanceof HttpException) {
            return parsePageIssueTraceId((HttpException) th2, cVar);
        }
        if (!(th2 instanceof C8691a)) {
            a11 = g.a(th2, cVar, null);
            return a11;
        }
        List<Throwable> b11 = ((C8691a) th2).b();
        Intrinsics.checkNotNullExpressionValue(b11, "getExceptions(...)");
        Throwable th3 = (Throwable) C7714v.X(b11);
        return (th3 == null || (pageIssue$default = toPageIssue$default(this, th3, null, 1, null)) == null) ? f.b.f106885a : pageIssue$default;
    }

    static /* synthetic */ f toPageIssue$default(ComposerPageIssueFactory composerPageIssueFactory, Throwable th2, h.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = null;
        }
        return composerPageIssueFactory.toPageIssue(th2, cVar);
    }

    @Override // z00.h
    @NotNull
    public b createIncident(@NotNull a.p event, @NotNull C6997c<l> state, @NotNull Throwable throwable) {
        z headers;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!(throwable instanceof HttpException)) {
            return (isBXNoConnectionException(throwable) || g.c(throwable)) ? new c(throwable) : super.createIncident(event, state, throwable);
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
    public f createIssue(@NotNull a.p event, @NotNull C6997c<l> state, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return toPageIssue(throwable, state.l().d());
    }
}
