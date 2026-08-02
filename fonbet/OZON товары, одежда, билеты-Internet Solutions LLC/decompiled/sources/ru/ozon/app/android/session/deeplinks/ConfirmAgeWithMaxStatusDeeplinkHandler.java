package ru.ozon.app.android.session.deeplinks;

import C.J;
import GZ.j;
import IZ.c;
import Kk.C3532b;
import android.content.Context;
import android.net.Uri;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/session/deeplinks/ConfirmAgeWithMaxStatusDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConfirmAgeWithMaxStatusDeeplinkHandler extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmAgeWithMaxStatusDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (Intrinsics.d(b11.getAuthority(), "modal")) {
            return C3532b.g(b11, "getPathSegments(...)", "confirmAgeWithMaxStatus") || C3532b.g(b11, "getPathSegments(...)", "confirmAgeWithMax");
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        int m673constructorimpl = BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1);
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(Kk.c.c(route, "toString(...)"), (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, true, null, null, null, BackgroundColorAttr.m672boximpl(m673constructorimpl), false, new ComposerScreenConfig.AppearanceConfig(new l.a.b(0L, null, 3)), null, null, false, false, null, null, 16611324, null), a11, 9001, false, false, null, false, false, null, 504, null);
    }
}
