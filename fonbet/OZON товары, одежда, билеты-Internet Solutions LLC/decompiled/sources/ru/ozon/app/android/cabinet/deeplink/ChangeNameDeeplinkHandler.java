package ru.ozon.app.android.cabinet.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import Kk.C3532b;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cabinet/deeplink/ChangeNameDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "<init>", "(Lru/ozon/app/android/account/user/UserManager;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/account/user/UserManager;", "getUserManager", "()Lru/ozon/app/android/account/user/UserManager;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeNameDeeplinkHandler implements a {

    @NotNull
    private final UserManager userManager;

    public ChangeNameDeeplinkHandler(@NotNull UserManager userManager) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.userManager = userManager;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (!Intrinsics.d(b11.getAuthority(), "my") || !C3532b.g(b11, "getPathSegments(...)", "settings")) {
            return false;
        }
        List<String> pathSegments = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return Intrinsics.d(C7714v.Z(pathSegments), AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return new ComposerFlowDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777182, null), a11, 1970, null, false, 24, null);
    }
}
