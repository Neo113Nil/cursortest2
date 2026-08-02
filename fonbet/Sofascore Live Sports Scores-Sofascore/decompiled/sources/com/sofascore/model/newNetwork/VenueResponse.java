package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.mvvm.model.Venue$$serializer;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import defpackage.joa;
import defpackage.khk;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBY\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\n\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J>\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010!R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010#¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/VenueResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/mvvm/model/Venue;", "venue", "Lcom/sofascore/model/newNetwork/VenueStatistics;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "", "Lcom/sofascore/model/newNetwork/VenueSportStatistics;", "sportStatistics", "<init>", "(Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/newNetwork/VenueStatistics;Ljava/util/Map;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/newNetwork/VenueStatistics;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/VenueResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Venue;", "component2", "()Lcom/sofascore/model/newNetwork/VenueStatistics;", "component3", "()Ljava/util/Map;", "copy", "(Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/newNetwork/VenueStatistics;Ljava/util/Map;)Lcom/sofascore/model/newNetwork/VenueResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Venue;", "getVenue", "Lcom/sofascore/model/newNetwork/VenueStatistics;", "getStatistics", "Ljava/util/Map;", "getSportStatistics", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VenueResponse extends NetworkResponse {

    @Nullable
    private final Map<String, VenueSportStatistics> sportStatistics;

    @Nullable
    private final VenueStatistics statistics;

    @NotNull
    private final Venue venue;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, ypa.a(ysa.b, new khk(21))};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VenueResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, Venue venue, VenueStatistics venueStatistics, Map map, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (12 != (i & 12)) {
            oea.z(i, 12, VenueResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.venue = venue;
        this.statistics = venueStatistics;
        if ((i & 16) == 0) {
            this.sportStatistics = null;
        } else {
            this.sportStatistics = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new q79(uhi.a, VenueSportStatistics$$serializer.INSTANCE, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VenueResponse copy$default(VenueResponse venueResponse, Venue venue, VenueStatistics venueStatistics, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            venue = venueResponse.venue;
        }
        if ((i & 2) != 0) {
            venueStatistics = venueResponse.statistics;
        }
        if ((i & 4) != 0) {
            map = venueResponse.sportStatistics;
        }
        return venueResponse.copy(venue, venueStatistics, map);
    }

    public static final /* synthetic */ void write$Self$model_release(VenueResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, Venue$$serializer.INSTANCE, self.venue);
        output.h(serialDesc, 3, VenueStatistics$$serializer.INSTANCE, self.statistics);
        if (!output.o(serialDesc) && self.sportStatistics == null) {
            return;
        }
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.sportStatistics);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Venue getVenue() {
        return this.venue;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final VenueStatistics getStatistics() {
        return this.statistics;
    }

    @Nullable
    public final Map<String, VenueSportStatistics> component3() {
        return this.sportStatistics;
    }

    @NotNull
    public final VenueResponse copy(@NotNull Venue venue, @Nullable VenueStatistics statistics, @Nullable Map<String, VenueSportStatistics> sportStatistics) {
        venue.getClass();
        return new VenueResponse(venue, statistics, sportStatistics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VenueResponse)) {
            return false;
        }
        VenueResponse venueResponse = (VenueResponse) other;
        return Intrinsics.c(this.venue, venueResponse.venue) && Intrinsics.c(this.statistics, venueResponse.statistics) && Intrinsics.c(this.sportStatistics, venueResponse.sportStatistics);
    }

    @Nullable
    public final Map<String, VenueSportStatistics> getSportStatistics() {
        return this.sportStatistics;
    }

    @Nullable
    public final VenueStatistics getStatistics() {
        return this.statistics;
    }

    @NotNull
    public final Venue getVenue() {
        return this.venue;
    }

    public int hashCode() {
        int hashCode = this.venue.hashCode() * 31;
        VenueStatistics venueStatistics = this.statistics;
        int hashCode2 = (hashCode + (venueStatistics == null ? 0 : venueStatistics.hashCode())) * 31;
        Map<String, VenueSportStatistics> map = this.sportStatistics;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VenueResponse(venue=" + this.venue + ", statistics=" + this.statistics + ", sportStatistics=" + this.sportStatistics + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/VenueResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/VenueResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VenueResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VenueResponse(@NotNull Venue venue, @Nullable VenueStatistics venueStatistics, @Nullable Map<String, VenueSportStatistics> map) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        venue.getClass();
        this.venue = venue;
        this.statistics = venueStatistics;
        this.sportStatistics = map;
    }

    public /* synthetic */ VenueResponse(Venue venue, VenueStatistics venueStatistics, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(venue, venueStatistics, (i & 4) != 0 ? null : map);
    }
}
