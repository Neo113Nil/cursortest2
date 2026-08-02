package ru.ozon.app.android.travel.feature.general.common.deeplink;

import C.J;
import GZ.j;
import IZ.c;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.feature.general.common.configurators.TravelPassengersPageStorageInitializerConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.timeoutRedirect.TravelTimeoutRedirectConfigurator;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/deeplink/PassengersMatcherDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "fullScreenDestinationBehavior", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PassengersMatcherDeeplinkHandler extends c {

    @NotNull
    private final FullScreenDestinationBehavior fullScreenDestinationBehavior;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersMatcherDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull FullScreenDestinationBehavior fullScreenDestinationBehavior) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(fullScreenDestinationBehavior, "fullScreenDestinationBehavior");
        this.fullScreenDestinationBehavior = fullScreenDestinationBehavior;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        String[] elements = {"flight", "railway", "tours"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        String[] elements2 = {"passengers", "tourists", "newPassengers", "passengerHandbook"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return Intrinsics.d(b11.getAuthority(), "travel") && pathSegments.size() == 2 && j02.contains(pathSegments.get(0)) && C7705l.j0(elements2).contains(pathSegments.get(1));
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        int m673constructorimpl = BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor0);
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        Class[] elements = {TravelTimeoutRedirectConfigurator.class, TravelPassengersPageStorageInitializerConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerFragmentDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, this.fullScreenDestinationBehavior.getIsFullScreen(route), C7705l.j0(elements), e0.h(LongPollingPageComposerInterceptor.class), null, BackgroundColorAttr.m672boximpl(m673constructorimpl), false, null, null, null, false, false, null, null, 16730110, null), a11, 9001, false, false, null, true, false, null, 440, null);
    }
}
