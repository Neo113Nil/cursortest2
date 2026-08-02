package ru.ozon.uni.core.repository.implementation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniRadiusToken;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"tokenMap", "", "", "Lru/ozon/uni/core/models/UniRadiusToken;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniRadiusTokenRepositoryImplKt {

    @NotNull
    private static final Map<String, UniRadiusToken> tokenMap;

    static {
        UniRadiusTokenRepositoryImpl uniRadiusTokenRepositoryImpl = UniRadiusTokenRepositoryImpl.INSTANCE;
        tokenMap = U.j(new Pair("NONE", uniRadiusTokenRepositoryImpl.getNone()), new Pair("RADIUS_200", uniRadiusTokenRepositoryImpl.getRadius200()), new Pair("RADIUS_250", uniRadiusTokenRepositoryImpl.getRadius250()), new Pair("RADIUS_300", uniRadiusTokenRepositoryImpl.getRadius300()), new Pair("RADIUS_350", uniRadiusTokenRepositoryImpl.getRadius350()), new Pair("RADIUS_400", uniRadiusTokenRepositoryImpl.getRadius400()), new Pair("RADIUS_450", uniRadiusTokenRepositoryImpl.getRadius450()), new Pair("RADIUS_500", uniRadiusTokenRepositoryImpl.getRadius500()), new Pair("RADIUS_525", uniRadiusTokenRepositoryImpl.getRadius525()), new Pair("RADIUS_550", uniRadiusTokenRepositoryImpl.getRadius550()), new Pair("RADIUS_600", uniRadiusTokenRepositoryImpl.getRadius600()), new Pair("RADIUS_650", uniRadiusTokenRepositoryImpl.getRadius650()), new Pair("RADIUS_700", uniRadiusTokenRepositoryImpl.getRadius700()));
    }
}
