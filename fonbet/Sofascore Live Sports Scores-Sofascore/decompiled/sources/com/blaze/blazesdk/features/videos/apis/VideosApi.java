package com.blaze.blazesdk.features.videos.apis;

import androidx.annotation.Keep;
import com.blaze.blazesdk.features.videos.models.responses.VideosResponse;
import com.blaze.blazesdk.networking.annotations.BlazeNetworkRequest;
import com.blaze.blazesdk.user_management.annotations.AuthNeeded;
import defpackage.c2g;
import defpackage.h3e;
import defpackage.iu8;
import defpackage.qif;
import defpackage.rif;
import defpackage.rq3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\\\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0001\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJD\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\u0016\b\u0001\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fJP\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0016\b\u0001\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/features/videos/apis/VideosApi;", "", "", "maxItems", "labelsFilterExpression", "labelsPriority", "orderType", "", "additionalParams", "Lc2g;", "Lcom/blaze/blazesdk/features/videos/models/responses/VideosResponse;", "getVideosByLabel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "ids", "getVideosByIds", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "searchText", "labelExpression", "getVideosBySearch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "videoId", "", "liked", "", "updateVideoLike", "(Ljava/lang/String;ZLrq3;)Ljava/lang/Object;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface VideosApi {
    @Keep
    @iu8("Videos/ids")
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeClientPlatform = true, includeExperiments = true, includeGeo = true, includePreferredLanguage = true)
    Object getVideosByIds(@qif("OrderType") @Nullable String str, @qif("Ids") @NotNull String str2, @rif(encoded = true) @NotNull Map<String, String> map, @NotNull rq3<? super c2g<VideosResponse>> rq3Var);

    @Keep
    @iu8("Videos")
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeClientPlatform = true, includeExperiments = true, includeGeo = true, includePreferredLanguage = true)
    Object getVideosByLabel(@qif("MaxItems") @Nullable String str, @qif("labelsFilterExpression") @NotNull String str2, @qif("labelsPriority") @Nullable String str3, @qif("orderType") @Nullable String str4, @rif(encoded = true) @NotNull Map<String, String> map, @NotNull rq3<? super c2g<VideosResponse>> rq3Var);

    @Keep
    @iu8("Videos")
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeClientPlatform = true, includeExperiments = true, includeGeo = true, includePreferredLanguage = true)
    Object getVideosBySearch(@qif("text") @NotNull String str, @qif("MaxItems") @Nullable String str2, @qif("labelsFilterExpression") @Nullable String str3, @rif(encoded = true) @NotNull Map<String, String> map, @NotNull rq3<? super c2g<VideosResponse>> rq3Var);

    @Keep
    @h3e("Videos/like")
    @AuthNeeded
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeExperiments = true)
    Object updateVideoLike(@qif("videoId") @NotNull String str, @qif("setLiked") boolean z, @NotNull rq3<? super c2g<Unit>> rq3Var);
}
