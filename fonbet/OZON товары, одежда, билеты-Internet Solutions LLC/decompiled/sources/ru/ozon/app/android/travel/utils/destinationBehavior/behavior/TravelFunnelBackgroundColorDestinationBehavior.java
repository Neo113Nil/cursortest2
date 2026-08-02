package ru.ozon.app.android.travel.utils.destinationBehavior.behavior;

import GZ.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/TravelFunnelBackgroundColorDestinationBehavior;", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/BackgroundColorDestinationBehavior;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "getBackgroundColor", "(LGZ/j;)I", "Companion", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelFunnelBackgroundColorDestinationBehavior implements BackgroundColorDestinationBehavior {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/TravelFunnelBackgroundColorDestinationBehavior$Companion;", "", "<init>", "()V", "QUERY_PARAM_BACKGROUND_NAME", "", "QUERY_PARAM_BACKGROUND_VALUE_SECONDARY", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.app.android.travel.utils.destinationBehavior.behavior.BackgroundColorDestinationBehavior
    public int getBackgroundColor(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return Intrinsics.d(route.b().getQueryParameter("background"), "ozBgSecondary") ? R$attr.layerFloor1 : R$attr.layerFloor0;
    }
}
