package defpackage;

import com.sofascore.model.mvvm.model.EventHeadFlags;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zc6 extends kef {
    public static final zc6 b = new zc6(EventHeadFlags.class, TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "getStatistics()Z", 0);

    @Override // defpackage.kef, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Boolean.valueOf(((EventHeadFlags) obj).getStatistics());
    }
}
