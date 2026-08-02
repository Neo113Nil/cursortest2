package ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation;

import WZ.t;
import WZ.x;
import d00.C6020f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.data.B2BUpcomingTripsConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.data.B2BUpcomingTripsDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.card.B2BUpcomingTripsCardItemVI;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.header.B2BUpcomingTripsHeaderVI;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "B2BUpcomingTripsWidgetFactory", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;", "", "stateId", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/header/B2BUpcomingTripsHeaderVI;", "toHeaderVI", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/header/B2BUpcomingTripsHeaderVI;", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/card/B2BUpcomingTripsCardItemVI;", "toCardsListVI", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;Ljava/lang/String;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class B2BUpcomingTripsWidgetKt {
    @NotNull
    public static final i B2BUpcomingTripsWidgetFactory(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.a("travel", "b2bUpcomingTrips", B2BUpcomingTripsConfig.INSTANCE.getSupportedVersions(), new B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1(jsonDeserializer));
    }

    @NotNull
    public static final List<B2BUpcomingTripsCardItemVI> toCardsListVI(@NotNull B2BUpcomingTripsDTO b2BUpcomingTripsDTO, @NotNull String stateId) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(b2BUpcomingTripsDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        List<B2BUpcomingTripsDTO.UpcomingTrip> trips = b2BUpcomingTripsDTO.getTrips();
        ArrayList arrayList = new ArrayList(C7714v.z(trips, 10));
        int i11 = 0;
        for (Object obj : trips) {
            int i12 = i11 + 1;
            t tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            B2BUpcomingTripsDTO.UpcomingTrip upcomingTrip = (B2BUpcomingTripsDTO.UpcomingTrip) obj;
            long hashCode = (stateId + "_" + i11 + "_card_item").hashCode();
            boolean z11 = i11 == C7714v.P(b2BUpcomingTripsDTO.getTrips());
            CommonControlSettings common = upcomingTrip.getCommon();
            if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
                tVar = x.b(trackingInfo, Long.valueOf(hashCode), null);
            }
            arrayList.add(new B2BUpcomingTripsCardItemVI(hashCode, upcomingTrip, z11, tVar));
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final B2BUpcomingTripsHeaderVI toHeaderVI(@NotNull B2BUpcomingTripsDTO b2BUpcomingTripsDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(b2BUpcomingTripsDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = (stateId + "_header").hashCode();
        B2BUpcomingTripsHeaderVI.Header header = new B2BUpcomingTripsHeaderVI.Header(b2BUpcomingTripsDTO.getTitle(), b2BUpcomingTripsDTO.getBadge());
        Map<String, TokenizedTrackingInfo> trackingInfo = b2BUpcomingTripsDTO.getTrackingInfo();
        return new B2BUpcomingTripsHeaderVI(hashCode, header, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
    }
}
