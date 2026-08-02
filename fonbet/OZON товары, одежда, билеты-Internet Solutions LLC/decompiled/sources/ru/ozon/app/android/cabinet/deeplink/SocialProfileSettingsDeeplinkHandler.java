package ru.ozon.app.android.cabinet.deeplink;

import C.J;
import GZ.j;
import IZ.c;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.Scopes;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.cabinet.profile.RefreshOnActualizeEmailConfigurator;
import ru.ozon.app.android.cabinet.profileAvatar.configurators.ProfileAvatarConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cabinet/deeplink/SocialProfileSettingsDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig;", "getToolbarConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "isFresh", "Z", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SocialProfileSettingsDeeplinkHandler extends c {
    private final boolean isFresh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialProfileSettingsDeeplinkHandler(@NotNull AppType appType, @NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        this.isFresh = appType == AppType.FRESH;
    }

    private final ComposerScreenConfig.ToolbarConfig getToolbarConfig() {
        return new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, !this.isFresh, null, null, null, null, 61, null), 0, 2, null);
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
        if (pathSegments.size() != 2) {
            return false;
        }
        List<String> pathSegments2 = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
        if (!Intrinsics.d(C7714v.K(pathSegments2), Scopes.PROFILE)) {
            return false;
        }
        List<String> pathSegments3 = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments3, "getPathSegments(...)");
        return Intrinsics.d(C7714v.X(pathSegments3), "settings");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        int i11 = R$id.menu_profile;
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        int m673constructorimpl = BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1);
        ComposerScreenConfig.ToolbarConfig toolbarConfig = getToolbarConfig();
        Class[] elements = {ProfileAvatarConfigurator.class, RefreshOnActualizeEmailConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerTabFragmentDestination(new ComposerScreenConfig(aVar, toolbarConfig, false, null, false, false, false, false, null, false, false, false, C7705l.j0(elements), null, null, BackgroundColorAttr.m672boximpl(m673constructorimpl), false, null, null, null, false, false, null, null, 16740348, null), a11, i11, null, false, false, null, 120, null);
    }
}
