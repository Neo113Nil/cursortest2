package ru.ozon.app.android.storefront.widgets.appOnboarding.deeplinkhandler;

import C.J;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9010b;
import qZ.C9011c;
import rZ.C9237b;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.uni.R$color;
import sZ.c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/deeplinkhandler/AppOnboardingDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppOnboardingDeeplinkHandler implements a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Uri deeplink;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/deeplinkhandler/AppOnboardingDeeplinkHandler$Companion;", "", "<init>", "()V", "DEEPLINK_SCREEN_TYPE", "", "deeplink", "Landroid/net/Uri;", "getDeeplink", "()Landroid/net/Uri;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Uri getDeeplink() {
            return AppOnboardingDeeplinkHandler.deeplink;
        }

        private Companion() {
        }
    }

    static {
        Uri build = new Uri.Builder().scheme("ozon").authority("appOnboarding").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        deeplink = build;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "appOnboarding");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        FlowTag flowTag = FlowTag.START_ONBOARDING;
        ComposerFragmentDestination composerFragmentDestination = new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, true, e0.h(AppOnboardingConfigurator.class), null, null, BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(R$color.layer_floor_0_select)), false, null, null, null, false, false, null, null, 16738236, null), a11, null, false, false, null, false, false, null, 508, null);
        String name = flowTag.name();
        C9011c.Companion companion = C9011c.INSTANCE;
        C9010b c9010b = new C9010b(flowTag, 14);
        companion.getClass();
        return new C9237b(null, flowTag, new c(name, C9011c.Companion.a(c9010b), null, false, false, null, false, false, false, 508, null), composerFragmentDestination, 1, null);
    }
}
