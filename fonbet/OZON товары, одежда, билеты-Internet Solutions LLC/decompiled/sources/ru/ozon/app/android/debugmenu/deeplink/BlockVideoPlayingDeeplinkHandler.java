package ru.ozon.app.android.debugmenu.deeplink;

import GZ.j;
import IZ.c;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.C8882c;
import pZ.f;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/debugmenu/deeplink/BlockVideoPlayingDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "videoPreferences", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "<init>", "(Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlockVideoPlayingDeeplinkHandler extends c {

    @NotNull
    private final PlayerPreferences videoPreferences;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockVideoPlayingDeeplinkHandler(@NotNull PlayerPreferences videoPreferences, @NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor) {
        super(atMostQaUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        this.videoPreferences = videoPreferences;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return Intrinsics.d(b11.getScheme(), "ozontech") && Intrinsics.d(b11.getAuthority(), "blockPlaying") && (queryParameter = b11.getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE)) != null && !h.K(queryParameter);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return new C8882c(new BlockVideoPlayingDeeplinkHandler$getDestination$1(route, this, null));
    }
}
