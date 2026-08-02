package com.blaze.blazesdk.data_source;

import com.blaze.blazesdk.app_configurations.models.recommendations.RecommendationsConfigurations;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.BlazeRecommendationsType;
import defpackage.a70;
import defpackage.f1m;
import defpackage.hg6;
import defpackage.jdm;
import defpackage.ogm;
import defpackage.tul;
import defpackage.zzl;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a {
    public static final void a(BlazeDataSourceType blazeDataSourceType, ogm ogmVar, boolean z) {
        RecommendationsConfigurations recommendationsConfigurations;
        RecommendationsConfigurations recommendationsConfigurations2;
        blazeDataSourceType.getClass();
        ogmVar.getClass();
        if (blazeDataSourceType instanceof BlazeDataSourceType.Ids) {
            BlazeDataSourceType.Ids ids = (BlazeDataSourceType.Ids) blazeDataSourceType;
            if (!ids.getIds().isEmpty()) {
                List<String> ids2 = ids.getIds();
                if (ids2 == null || !ids2.isEmpty()) {
                    Iterator<T> it = ids2.iterator();
                    while (it.hasNext()) {
                        if (!StringsKt.R((String) it.next())) {
                        }
                    }
                    return;
                }
                return;
            }
            hg6.e(ids.getIds(), "|ids| must not contain blank id. ids=");
            return;
        }
        if (blazeDataSourceType instanceof BlazeDataSourceType.Labels) {
            BlazeDataSourceType.Labels labels = (BlazeDataSourceType.Labels) blazeDataSourceType;
            if (StringsKt.R(labels.getBlazeWidgetLabel().getStringLabelExpression())) {
                hg6.e(labels.getBlazeWidgetLabel(), "|labelExpression| must not be Blank. label=");
                return;
            }
            Integer maxItems = labels.getMaxItems();
            if (maxItems == null || maxItems.intValue() > 0) {
                return;
            }
            a70.p("|maxItems| must be greater than 0.");
            return;
        }
        if (blazeDataSourceType instanceof BlazeDataSourceType.Search) {
            BlazeDataSourceType.Search search = (BlazeDataSourceType.Search) blazeDataSourceType;
            if (StringsKt.R(search.getSearchText())) {
                a70.p("|searchText| must not be blank.");
                return;
            }
            Integer maxItems2 = search.getMaxItems();
            if (maxItems2 == null || maxItems2.intValue() > 0) {
                return;
            }
            a70.p("|maxItems| must be greater than 0.");
            return;
        }
        if (!(blazeDataSourceType instanceof BlazeDataSourceType.Recommendations)) {
            if (blazeDataSourceType instanceof BlazeDataSourceType.RemoteConfig) {
                BlazeDataSourceType fallbackDataSourceType = ((BlazeDataSourceType.RemoteConfig) blazeDataSourceType).getFallbackDataSourceType();
                if (fallbackDataSourceType != null) {
                    a(fallbackDataSourceType, ogmVar, z);
                    return;
                }
                return;
            }
            if (!(blazeDataSourceType instanceof BlazeDataSourceType.a)) {
                zzl.b();
                return;
            }
            BlazeDirectMediaSource blazeDirectMediaSource = ((BlazeDataSourceType.a) blazeDataSourceType).a;
            if (StringsKt.R(blazeDirectMediaSource.getId())) {
                a70.p("|id| must not be blank");
                return;
            } else {
                if (StringsKt.R(blazeDirectMediaSource.getVideoUrl())) {
                    a70.p("|videoUrl| must not be blank");
                    return;
                }
                return;
            }
        }
        if (ogmVar == ogm.WIDGET && z) {
            BlazeRecommendationsType type = ((BlazeDataSourceType.Recommendations) blazeDataSourceType).getType();
            if (type instanceof BlazeRecommendationsType.ForYou) {
                tul tulVar = jdm.d;
                if ((tulVar == null || (recommendationsConfigurations2 = tulVar.e) == null) ? false : recommendationsConfigurations2.getEnableForYouContentPreparation()) {
                    return;
                }
                a70.p("The 'For You' feature is currently not supported on widgets.");
                return;
            }
            if (!(type instanceof BlazeRecommendationsType.Trending)) {
                zzl.b();
                return;
            }
            tul tulVar2 = jdm.d;
            if ((tulVar2 == null || (recommendationsConfigurations = tulVar2.e) == null) ? true : recommendationsConfigurations.getEnableTrendingContentPreparation()) {
                return;
            }
            a70.p("The 'Trending' feature is currently not supported on widgets.");
        }
    }

    public static final boolean b(BlazeDataSourceType blazeDataSourceType) {
        RecommendationsConfigurations recommendationsConfigurations;
        RecommendationsConfigurations recommendationsConfigurations2;
        blazeDataSourceType.getClass();
        if (!(blazeDataSourceType instanceof BlazeDataSourceType.Recommendations)) {
            if ((blazeDataSourceType instanceof BlazeDataSourceType.Ids) || (blazeDataSourceType instanceof BlazeDataSourceType.Labels) || (blazeDataSourceType instanceof BlazeDataSourceType.Search)) {
                return true;
            }
            if (blazeDataSourceType instanceof BlazeDataSourceType.RemoteConfig) {
                throw f1m.a;
            }
            if (blazeDataSourceType instanceof BlazeDataSourceType.a) {
                return true;
            }
            zzl.b();
            return false;
        }
        BlazeRecommendationsType type = ((BlazeDataSourceType.Recommendations) blazeDataSourceType).getType();
        if (type instanceof BlazeRecommendationsType.ForYou) {
            tul tulVar = jdm.d;
            if (tulVar == null || (recommendationsConfigurations2 = tulVar.e) == null) {
                return false;
            }
            return recommendationsConfigurations2.getEnableForYouContentPreparation();
        }
        if (!(type instanceof BlazeRecommendationsType.Trending)) {
            zzl.b();
            return false;
        }
        tul tulVar2 = jdm.d;
        if (tulVar2 == null || (recommendationsConfigurations = tulVar2.e) == null) {
            return true;
        }
        return recommendationsConfigurations.getEnableTrendingContentPreparation();
    }

    public static /* synthetic */ void validate$default(BlazeDataSourceType blazeDataSourceType, ogm ogmVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        a(blazeDataSourceType, ogmVar, z);
    }
}
