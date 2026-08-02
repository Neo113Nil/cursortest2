package ru.ozon.app.android.cabinet.deeplink;

import C.J;
import GZ.j;
import IZ.c;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.cabinet.R$string;
import ru.ozon.app.android.cabinet.biometry.BiometryStateConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.payment.configurators.AddUserCardConfigurator;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cabinet/deeplink/UserCardsDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserCardsDeeplinkHandler extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCardsDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (!Intrinsics.d(b11.getAuthority(), "my")) {
            return false;
        }
        List<String> pathSegments = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        if (pathSegments.size() != 1) {
            return false;
        }
        List<String> pathSegments2 = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
        return Intrinsics.d(C7714v.K(pathSegments2), "cards");
    }

    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Uri clearQueryParameters;
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        int i11 = R$id.menu_profile;
        String c11 = Kk.c.c(route, "toString(...)");
        clearQueryParameters = UserCardsDeeplinkHandlerKt.clearQueryParameters(route.b());
        String uri = clearQueryParameters.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return new ComposerTabFragmentDestination(new ComposerScreenConfig(new h.c.a(c11, uri, (String) null, 12), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, StringProvider.getString(R$string.cards_toolbar_title_android), null, null, null, 59, null), 0, 2, null), false, null, false, false, false, false, null, false, false, false, e0.h(AddUserCardConfigurator.class), e0.h(BiometryStateConfigurator.class), null, null, false, null, null, null, false, false, null, null, 16764924, null), a11, i11, null, false, false, null, 120, null);
    }
}
