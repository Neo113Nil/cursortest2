package ru.ozon.app.android.fresh.feature.b2b.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import Kk.C3532b;
import android.content.Context;
import android.net.Uri;
import c8.C5766e;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/deeplink/RoleInvitationCreatorDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/navigation/handlers/DeeplinkHandler;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "Lru/ozon/app/android/navigation/newrouter/destinations/Destination;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RoleInvitationCreatorDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return Intrinsics.d(b11.getAuthority(), "my") && C3532b.g(b11, "getPathSegments(...)", "legaldetails") && C5766e.c(b11, "getPathSegments(...)", 1, "role_invitations") && C5766e.c(b11, "getPathSegments(...)", 2, "creating");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, 32, false, false, null, null, 16252926, null), a11, null, false, false, null, false, false, null, 508, null);
    }
}
