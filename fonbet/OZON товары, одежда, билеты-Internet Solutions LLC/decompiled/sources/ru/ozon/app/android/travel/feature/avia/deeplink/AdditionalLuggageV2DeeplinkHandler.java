package ru.ozon.app.android.travel.feature.avia.deeplink;

import Ak.b;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
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
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/deeplink/AdditionalLuggageV2DeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "fullScreenDestinationBehavior", "<init>", "(Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;)V", "", "", "segments", "", "isLuggageLink", "(Ljava/util/List;)Z", "isServicesLink", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdditionalLuggageV2DeeplinkHandler implements a {

    @NotNull
    private final FullScreenDestinationBehavior fullScreenDestinationBehavior;

    public AdditionalLuggageV2DeeplinkHandler(@NotNull FullScreenDestinationBehavior fullScreenDestinationBehavior) {
        Intrinsics.checkNotNullParameter(fullScreenDestinationBehavior, "fullScreenDestinationBehavior");
        this.fullScreenDestinationBehavior = fullScreenDestinationBehavior;
    }

    private final boolean isLuggageLink(List<String> segments) {
        return segments.size() == 1 && (Intrinsics.d(segments.get(0), "additionalLuggageV2") || Intrinsics.d(segments.get(0), "seedSelectBaggage"));
    }

    private final boolean isServicesLink(List<String> segments) {
        return segments.size() == 3 && Intrinsics.d(segments.get(0), "flight") && Intrinsics.d(segments.get(1), "additionalServices") && Intrinsics.d(segments.get(2), "luggage");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (!Intrinsics.d(b11.getAuthority(), "travel")) {
            return false;
        }
        List<String> pathSegments = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        if (isLuggageLink(pathSegments)) {
            return true;
        }
        List<String> pathSegments2 = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
        return isServicesLink(pathSegments2);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String d11 = b.d(context, "context", route, "route");
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(d11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, this.fullScreenDestinationBehavior.getIsFullScreen(route), null, e0.h(LongPollingPageComposerInterceptor.class), null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor0)), false, null, null, null, false, false, null, null, 16734206, null), d11, null, false, false, null, false, false, null, 508, null);
    }
}
