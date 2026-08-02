package ru.ozon.app.android.travel.feature.general.common.deeplink;

import Ak.b;
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
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabRequiredFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.BackgroundColorDestinationBehavior;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/deeplink/TravelSnapshotTestDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "fullScreenDestinationBehavior", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/BackgroundColorDestinationBehavior;", "backgroundColorDestinationBehavior", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/BackgroundColorDestinationBehavior;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/BackgroundColorDestinationBehavior;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelSnapshotTestDeeplinkHandler extends c {

    @NotNull
    private final BackgroundColorDestinationBehavior backgroundColorDestinationBehavior;

    @NotNull
    private final FullScreenDestinationBehavior fullScreenDestinationBehavior;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelSnapshotTestDeeplinkHandler(@NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, @NotNull FullScreenDestinationBehavior fullScreenDestinationBehavior, @NotNull BackgroundColorDestinationBehavior backgroundColorDestinationBehavior) {
        super(atMostQaUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        Intrinsics.checkNotNullParameter(fullScreenDestinationBehavior, "fullScreenDestinationBehavior");
        Intrinsics.checkNotNullParameter(backgroundColorDestinationBehavior, "backgroundColorDestinationBehavior");
        this.fullScreenDestinationBehavior = fullScreenDestinationBehavior;
        this.backgroundColorDestinationBehavior = backgroundColorDestinationBehavior;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        return Intrinsics.d(b11.getAuthority(), "travel") && pathSegments.size() == 1 && Intrinsics.d(C7714v.K(pathSegments), "snapshotTest");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String d11 = b.d(context, "context", route, "route");
        return new ComposerTabRequiredFragmentDestination(new ComposerScreenConfig(new h.c.a(d11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, this.fullScreenDestinationBehavior.getIsFullScreen(route), null, e0.h(LongPollingPageComposerInterceptor.class), null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(this.backgroundColorDestinationBehavior.getBackgroundColor(route))), false, null, null, null, false, false, null, null, 16734206, null), d11, null, false, null, false, 60, null);
    }
}
