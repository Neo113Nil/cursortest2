package defpackage;

import com.sofascore.model.mvvm.model.TeamDetailsHeadFlags;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class r4j extends kef {
    public static final r4j b = new r4j(TeamDetailsHeadFlags.class, TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "getStatistics()Z", 0);

    @Override // defpackage.kef, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Boolean.valueOf(((TeamDetailsHeadFlags) obj).getStatistics());
    }
}
