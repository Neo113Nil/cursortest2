package com.blaze.blazesdk.features.stories.apis;

import androidx.annotation.Keep;
import com.blaze.blazesdk.features.stories.models.responses.StoriesResponse;
import com.blaze.blazesdk.networking.annotations.BlazeNetworkRequest;
import com.blaze.blazesdk.user_management.annotations.AuthNeeded;
import defpackage.c2g;
import defpackage.iu8;
import defpackage.qif;
import defpackage.rif;
import defpackage.rq3;
import defpackage.vae;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b`\u0018\u00002\u00020\u0001J\u0098\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0001\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rH§@¢\u0006\u0004\b\u0011\u0010\u0012JP\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0016\b\u0001\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rH§@¢\u0006\u0004\b\u0014\u0010\u0015JP\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0016\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0016\b\u0001\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rH§@¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u001a\u001a\u00020\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001f\u0010 J.\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\"\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/features/stories/apis/StoriesApi;", "", "", "maxItems", "labelsFilterExpression", "labelsPriority", "personalPlayers", "personalTeams", "personalLabelFilterExpression", "personalLabelPriority", "orderType", "", "showLiveFirst", "", "additionalParams", "Lc2g;", "Lcom/blaze/blazesdk/features/stories/models/responses/StoriesResponse;", "getStoriesByLabel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "ids", "getStoriesByIds", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "searchText", "labelExpression", "getStoriesBySearch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "storyId", "publishedOnly", "getStory", "(Ljava/lang/String;Ljava/lang/Boolean;Lrq3;)Ljava/lang/Object;", "anyLabelFilter", "getTrendingStories", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "promotedLabels", "getForYouStories", "(Ljava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StoriesApi {
    @Keep
    @AuthNeeded
    @iu8("Recommendations/ForYou")
    @Nullable
    @BlazeNetworkRequest(contentType = BlazeNetworkRequest.ContentTypeValues.STORY, includeApiKey = true, includeExperiments = true, includeGeo = true, includePreferredLanguage = true)
    Object getForYouStories(@qif("labels") @Nullable String str, @qif("promotedLabels") @Nullable String str2, @NotNull rq3<? super c2g<StoriesResponse>> rq3Var);

    @Keep
    @iu8("Stories/ids")
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeClientPlatform = true, includeExperiments = true, includeGeo = true, includePreferredLanguage = true)
    Object getStoriesByIds(@qif("OrderType") @Nullable String str, @qif("ShowLiveFirst") @Nullable Boolean bool, @qif("Ids") @NotNull String str2, @rif(encoded = true) @NotNull Map<String, String> map, @NotNull rq3<? super c2g<StoriesResponse>> rq3Var);

    @Keep
    @iu8("Stories")
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeClientPlatform = true, includeExperiments = true, includeGeo = true, includePreferredLanguage = true)
    Object getStoriesByLabel(@qif("MaxItems") @Nullable String str, @qif("labelsFilterExpression") @NotNull String str2, @qif("labelsPriority") @Nullable String str3, @qif("PersonalPlayers") @Nullable String str4, @qif("PersonalTeams") @Nullable String str5, @qif("PersonalLabelFilterExpression") @Nullable String str6, @qif("PersonalLabelPriority") @Nullable String str7, @qif("orderType") @Nullable String str8, @qif("ShowLiveFirst") @Nullable Boolean bool, @rif(encoded = true) @NotNull Map<String, String> map, @NotNull rq3<? super c2g<StoriesResponse>> rq3Var);

    @Keep
    @iu8("Stories")
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeClientPlatform = true, includeExperiments = true, includeGeo = true, includePreferredLanguage = true)
    Object getStoriesBySearch(@qif("text") @NotNull String str, @qif("MaxItems") @Nullable String str2, @qif("labelsFilterExpression") @Nullable String str3, @rif(encoded = true) @NotNull Map<String, String> map, @NotNull rq3<? super c2g<StoriesResponse>> rq3Var);

    @Keep
    @iu8("Stories/{id}")
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeClientPlatform = true, includeExperiments = true, includePreferredLanguage = true)
    Object getStory(@NotNull @vae("id") String str, @qif("publishedOnly") @Nullable Boolean bool, @NotNull rq3<? super c2g<StoriesResponse>> rq3Var);

    @Keep
    @iu8("Recommendations/Trending")
    @Nullable
    @BlazeNetworkRequest(contentType = BlazeNetworkRequest.ContentTypeValues.STORY, includeApiKey = true, includeExperiments = true, includeGeo = true, includePreferredLanguage = true)
    Object getTrendingStories(@qif("labels") @Nullable String str, @NotNull rq3<? super c2g<StoriesResponse>> rq3Var);
}
