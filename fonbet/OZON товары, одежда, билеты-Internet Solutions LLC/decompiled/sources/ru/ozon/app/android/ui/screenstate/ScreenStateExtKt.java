package ru.ozon.app.android.ui.screenstate;

import P00.b;
import Sc.InterfaceC3999a;
import We.z;
import android.content.Context;
import i10.h;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ob0.r;
import oc.C8691a;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.CurrentDateTime;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0006\u001a'\u0010\f\u001a\u00020\u000b*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "Landroid/content/Context;", "context", "", "toMessage", "(Ljava/lang/Throwable;Landroid/content/Context;)Ljava/lang/String;", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Li10/h$c;", "pageRef", "", "isTestUser", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "toScreenState", "(Ljava/lang/Throwable;Li10/h$c;Z)Lru/ozon/app/android/uikit/screenstate/ScreenState;", "Lretrofit2/HttpException;", "httpException", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "parseServerIssueTraceId", "(Lretrofit2/HttpException;Li10/h$c;Z)Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenStateExtKt {
    private static final ScreenState.ServerIssue parseServerIssueTraceId(HttpException httpException, h.c cVar, boolean z11) {
        Response<?> response;
        z headers;
        return new ScreenState.ServerIssue((httpException == null || (response = httpException.response()) == null || (headers = response.headers()) == null) ? null : headers.c("x-o3-trace-id"), false, z11, new ScreenState.ServerIssue.ComposerInfo(null, null, cVar instanceof h.c.a ? ((h.c.a) cVar).c() : null, null, 11, null), new ScreenState.ServerIssue.HttpInfo(httpException != null ? Integer.valueOf(httpException.code()) : null, httpException != null ? httpException.message() : null), CurrentDateTime.INSTANCE.get(), 2, null);
    }

    @InterfaceC3999a
    @NotNull
    public static final String toMessage(@NotNull Throwable th2, Context context) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return ((th2 instanceof UnknownHostException) || (th2 instanceof ConnectException) || (th2 instanceof SocketTimeoutException)) ? StringProvider.getString(R$string.error_composer_message_no_connection_full) : th2 instanceof r ? StringProvider.getString(R$string.error_composer_error_incapsula_user_description, ((r) th2).b()) : StringProvider.getString(R$string.error_common_message_service_error);
    }

    @NotNull
    public static final ScreenState toScreenState(@NotNull Throwable th2, h.c cVar, boolean z11) {
        ScreenState screenState$default;
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if (th2 instanceof SSLHandshakeException) {
            return new ScreenState.SecurityIssue();
        }
        if ((th2 instanceof UnknownHostException) || (th2 instanceof ConnectException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SSLException)) {
            return new ScreenState.NoConnection();
        }
        if (th2 instanceof r) {
            return new ScreenState.AntibotAlert(((r) th2).b());
        }
        if (th2 instanceof HttpException) {
            return parseServerIssueTraceId((HttpException) th2, cVar, z11);
        }
        ScreenState.ServerIssue.HttpInfo httpInfo = null;
        if (th2 instanceof C8691a) {
            List<Throwable> b11 = ((C8691a) th2).b();
            Intrinsics.checkNotNullExpressionValue(b11, "getExceptions(...)");
            Throwable th3 = (Throwable) C7714v.X(b11);
            return (th3 == null || (screenState$default = toScreenState$default(th3, null, false, 3, null)) == null) ? new ScreenState.NoScreen() : screenState$default;
        }
        ScreenState.ServerIssue.ComposerInfo composerInfo = new ScreenState.ServerIssue.ComposerInfo(null, null, cVar instanceof h.c.a ? ((h.c.a) cVar).c() : null, null, 11, null);
        String str = CurrentDateTime.INSTANCE.get();
        if (th2 instanceof b) {
            b bVar = (b) th2;
            httpInfo = new ScreenState.ServerIssue.HttpInfo(Integer.valueOf(bVar.a()), bVar.b());
        }
        return new ScreenState.ServerIssue(null, false, z11, composerInfo, httpInfo, str, 3, null);
    }

    public static /* synthetic */ ScreenState toScreenState$default(Throwable th2, h.c cVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return toScreenState(th2, cVar, z11);
    }

    @NotNull
    public static final String toMessage(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return toMessage(th2, null);
    }
}
