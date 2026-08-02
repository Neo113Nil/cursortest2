package ru.ozon.app.android.cabinet.deeplink;

import C.J;
import GZ.j;
import IZ.c;
import OZ.b;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.cabinet.biometry.BiometryStateConfigurator;
import ru.ozon.app.android.cabinet.profile.RefreshOnActualizeEmailConfigurator;
import ru.ozon.app.android.cabinet.profile.SessionListUpdatedConfigurator;
import ru.ozon.app.android.cabinet.profileAvatar.configurators.ProfileAvatarConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.configurators.statusbar.LightStatusBarConfigurator;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.ui.session.profile.ProfileInfoConfigurator;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cabinet/deeplink/ProfileSettingsDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileSettingsDeeplinkHandler extends c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cabinet/deeplink/ProfileSettingsDeeplinkHandler$Companion;", "", "<init>", "()V", "TOKEN_QUERY_PARAM", "", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSettingsDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
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
        return Intrinsics.d(C7714v.K(pathSegments2), "settings");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        int i11 = R$id.menu_profile;
        ComposerScreenConfig.ToolbarConfig toolbarConfig = new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, Integer.valueOf(R$color.layer_floor_1), null, 47, null), 0, 2, null);
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        int i12 = R$color.layer_floor_1;
        Set h11 = e0.h(BiometryStateConfigurator.class);
        Class[] elements = {ProfileAvatarConfigurator.class, ProfileInfoConfigurator.class, SessionListUpdatedConfigurator.class, RefreshOnActualizeEmailConfigurator.class, LightStatusBarConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ComposerTabFragmentDestination composerTabFragmentDestination = new ComposerTabFragmentDestination(new ComposerScreenConfig(aVar, toolbarConfig, false, null, false, false, false, false, null, false, false, false, C7705l.j0(elements), h11, Integer.valueOf(i12), null, false, null, null, null, false, false, null, null, 16748540, null), a11, i11, 9001, false, false, null, 112, null);
        return route.b().getQueryParameter("token") != null ? new b(R$id.menu_profile, composerTabFragmentDestination) : composerTabFragmentDestination;
    }
}
