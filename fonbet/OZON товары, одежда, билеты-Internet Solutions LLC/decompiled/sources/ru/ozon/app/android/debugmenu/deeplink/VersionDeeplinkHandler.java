package ru.ozon.app.android.debugmenu.deeplink;

import GZ.j;
import IZ.c;
import Lh.a;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import pZ.f;
import ru.ozon.app.android.debugmenu.data.DebugToolAction;
import ru.ozon.app.android.debugmenu.servicemesh.DebugToolsActivity;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/debugmenu/deeplink/VersionDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;)V", "Landroid/net/Uri;", "deeplink", "Lru/ozon/app/android/debugmenu/data/DebugToolAction;", "getParameters", "(Landroid/net/Uri;)Lru/ozon/app/android/debugmenu/data/DebugToolAction;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VersionDeeplinkHandler extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionDeeplinkHandler(@NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor) {
        super(atMostQaUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
    }

    private final DebugToolAction getParameters(Uri deeplink) {
        String queryParameter = deeplink.getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (queryParameter == null) {
            return null;
        }
        return new DebugToolAction(DebugToolAction.ActionName.APPEND, queryParameter, "x-o3-app-version", null, 8, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(route, "route");
        return Intrinsics.d(route.b().getScheme(), "ozontech") && a.f(route, "debugAppVersion") && (queryParameter = route.b().getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE)) != null && !h.K(queryParameter);
    }

    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        DebugToolAction parameters = getParameters(route.b());
        if (parameters == null) {
            return null;
        }
        return new C8880a(DebugToolsActivity.INSTANCE.startActivity(context, parameters));
    }
}
