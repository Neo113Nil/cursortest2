package ru.ozon.app.android.travel.feature.avia.deeplink;

import Ak.b;
import GZ.j;
import IZ.c;
import android.content.Context;
import android.text.TextUtils;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0010\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ'\u0010\u0011\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u001b\u0010\u0015\u001a\u00020\f2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/deeplink/FlightSeatsSegmentsDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "fullScreenBehavior", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;)V", "", "authority", "", "segments", "", "isFlightScheme", "(Ljava/lang/String;Ljava/util/List;)Z", "isEmptyScheme", "isSchemePreOpen", "isSchemeLite", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlightSeatsSegmentsDeeplinkHandler extends c {

    @NotNull
    private final FullScreenDestinationBehavior fullScreenBehavior;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSegmentsDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull FullScreenDestinationBehavior fullScreenBehavior) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(fullScreenBehavior, "fullScreenBehavior");
        this.fullScreenBehavior = fullScreenBehavior;
    }

    private final boolean isEmptyScheme(String authority, List<String> segments) {
        return Intrinsics.d(authority, "travel") && segments.size() == 1 && Intrinsics.d(segments.get(0), "aviaSeatsFailedBookingEmptyState");
    }

    private final boolean isFlightScheme(String authority, List<String> segments) {
        return Intrinsics.d(authority, "travel") && segments.size() == 5 && Intrinsics.d(segments.get(0), "flight") && Intrinsics.d(segments.get(1), ResultDTO.CONTENT_TYPE_SERVICES) && Intrinsics.d(segments.get(2), "seats") && Intrinsics.d(segments.get(3), "segments") && TextUtils.isDigitsOnly(segments.get(4));
    }

    private final boolean isSchemeLite(String authority, List<String> segments) {
        return Intrinsics.d(authority, "travel") && segments.size() == 6 && Intrinsics.d(segments.get(0), "flight") && Intrinsics.d(segments.get(1), ResultDTO.CONTENT_TYPE_SERVICES) && Intrinsics.d(segments.get(2), "seats") && Intrinsics.d(segments.get(3), "segments") && TextUtils.isDigitsOnly(segments.get(4)) && Intrinsics.d(segments.get(5), "lite-seats");
    }

    private final boolean isSchemePreOpen(String authority, List<String> segments) {
        return Intrinsics.d(authority, "travel") && segments.size() == 4 && Intrinsics.d(segments.get(0), "flight") && Intrinsics.d(segments.get(1), "additionalServices") && Intrinsics.d(segments.get(2), "seatsPreOpening") && TextUtils.isDigitsOnly(segments.get(3));
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        List<String> pathSegments = route.b().getPathSegments();
        String authority = route.b().getAuthority();
        Intrinsics.f(pathSegments);
        return isFlightScheme(authority, pathSegments) || isEmptyScheme(route.b().getAuthority(), pathSegments) || isSchemePreOpen(route.b().getAuthority(), pathSegments) || isSchemeLite(route.b().getAuthority(), pathSegments);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String d11 = b.d(context, "context", route, "route");
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(d11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, this.fullScreenBehavior.getIsFullScreen(route), null, e0.h(LongPollingPageComposerInterceptor.class), null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor0)), false, null, null, null, false, false, null, null, 16734206, null), d11, 9001, false, false, null, false, false, null, 504, null);
    }
}
