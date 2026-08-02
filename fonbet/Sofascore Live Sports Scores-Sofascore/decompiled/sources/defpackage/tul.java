package defpackage;

import com.blaze.blazesdk.app_configurations.models.ads.c;
import com.blaze.blazesdk.app_configurations.models.platform.PlatformConfigurationsDto;
import com.blaze.blazesdk.app_configurations.models.recommendations.RecommendationsConfigurations;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tul {
    public final uul a;
    public final PlatformConfigurationsDto b;
    public final c c;
    public final q5m d;
    public final RecommendationsConfigurations e;
    public final List f;
    public e8m g;
    public final dql h;

    public tul(@NotNull uul uulVar, @Nullable PlatformConfigurationsDto platformConfigurationsDto, @NotNull c cVar, @Nullable q5m q5mVar, @NotNull RecommendationsConfigurations recommendationsConfigurations, @Nullable List<mql> list, @Nullable e8m e8mVar, @Nullable dql dqlVar) {
        uulVar.getClass();
        cVar.getClass();
        recommendationsConfigurations.getClass();
        this.a = uulVar;
        this.b = platformConfigurationsDto;
        this.c = cVar;
        this.d = q5mVar;
        this.e = recommendationsConfigurations;
        this.f = list;
        this.g = e8mVar;
        this.h = dqlVar;
    }

    public static tul copy$default(tul tulVar, uul uulVar, PlatformConfigurationsDto platformConfigurationsDto, c cVar, q5m q5mVar, RecommendationsConfigurations recommendationsConfigurations, List list, e8m e8mVar, dql dqlVar, int i, Object obj) {
        if ((i & 1) != 0) {
            uulVar = tulVar.a;
        }
        if ((i & 2) != 0) {
            platformConfigurationsDto = tulVar.b;
        }
        if ((i & 4) != 0) {
            cVar = tulVar.c;
        }
        if ((i & 8) != 0) {
            q5mVar = tulVar.d;
        }
        if ((i & 16) != 0) {
            recommendationsConfigurations = tulVar.e;
        }
        if ((i & 32) != 0) {
            list = tulVar.f;
        }
        if ((i & 64) != 0) {
            e8mVar = tulVar.g;
        }
        if ((i & 128) != 0) {
            dqlVar = tulVar.h;
        }
        dql dqlVar2 = dqlVar;
        tulVar.getClass();
        uulVar.getClass();
        cVar.getClass();
        recommendationsConfigurations.getClass();
        List list2 = list;
        e8m e8mVar2 = e8mVar;
        RecommendationsConfigurations recommendationsConfigurations2 = recommendationsConfigurations;
        c cVar2 = cVar;
        return new tul(uulVar, platformConfigurationsDto, cVar2, q5mVar, recommendationsConfigurations2, list2, e8mVar2, dqlVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tul)) {
            return false;
        }
        tul tulVar = (tul) obj;
        return Intrinsics.c(this.a, tulVar.a) && Intrinsics.c(this.b, tulVar.b) && Intrinsics.c(this.c, tulVar.c) && Intrinsics.c(this.d, tulVar.d) && Intrinsics.c(this.e, tulVar.e) && Intrinsics.c(this.f, tulVar.f) && Intrinsics.c(this.g, tulVar.g) && Intrinsics.c(this.h, tulVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PlatformConfigurationsDto platformConfigurationsDto = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (platformConfigurationsDto == null ? 0 : platformConfigurationsDto.hashCode())) * 31)) * 31;
        q5m q5mVar = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (q5mVar == null ? 0 : q5mVar.hashCode())) * 31)) * 31;
        List list = this.f;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        e8m e8mVar = this.g;
        int hashCode5 = (hashCode4 + (e8mVar == null ? 0 : e8mVar.hashCode())) * 31;
        dql dqlVar = this.h;
        return hashCode5 + (dqlVar != null ? dqlVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "AppConfigurations(configurations=" + this.a + ", platformConfigurations=" + this.b + ", adsConfigurations=" + this.c + ", universalLinksConfiguration=" + this.d + ", recommendationsConfigurations=" + this.e + ", experiments=" + this.f + ", loggerConfigurations=" + this.g + ", analyticsLoadBalancerConfiguration=" + this.h + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ tul(uul uulVar, PlatformConfigurationsDto platformConfigurationsDto, c cVar, q5m q5mVar, RecommendationsConfigurations recommendationsConfigurations, List list, e8m e8mVar, dql dqlVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uulVar, platformConfigurationsDto, cVar, q5mVar, recommendationsConfigurations, list, e8mVar, dqlVar);
        if ((i & 2) != 0) {
            platformConfigurationsDto = new PlatformConfigurationsDto(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
