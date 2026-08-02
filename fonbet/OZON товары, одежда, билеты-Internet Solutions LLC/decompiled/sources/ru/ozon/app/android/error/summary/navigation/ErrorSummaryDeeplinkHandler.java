package ru.ozon.app.android.error.summary.navigation;

import GZ.j;
import IZ.c;
import Kk.C3531a;
import Lh.a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryFragment;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/error/summary/navigation/ErrorSummaryDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ErrorSummaryDeeplinkHandler extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorSummaryDeeplinkHandler(@NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor) {
        super(atMostQaUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return Intrinsics.d(route.b().getScheme(), "ozontech") && a.f(route, "debug") && C3531a.c(route, "getPathSegments(...)", "errorsummary");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        final ErrorSummaryFragment newInstance$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        Object obj = route.e().get("ERROR_SUMMARY_PARAMS_KEY");
        ScreenState.ServerIssue serverIssue = obj instanceof ScreenState.ServerIssue ? (ScreenState.ServerIssue) obj : null;
        if (serverIssue == null || (newInstance$default = ErrorSummaryFragment.INSTANCE.newInstance(serverIssue)) == null) {
            newInstance$default = ErrorSummaryFragment.Companion.newInstance$default(ErrorSummaryFragment.INSTANCE, null, 1, null);
        }
        return new sZ.c<ErrorSummaryFragment>(newInstance$default) { // from class: ru.ozon.app.android.error.summary.navigation.ErrorSummaryDeeplinkHandler$getDestination$1
        };
    }
}
