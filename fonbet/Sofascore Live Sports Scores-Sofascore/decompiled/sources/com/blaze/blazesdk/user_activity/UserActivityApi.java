package com.blaze.blazesdk.user_activity;

import androidx.annotation.Keep;
import com.blaze.blazesdk.networking.annotations.BlazeNetworkRequest;
import com.blaze.blazesdk.user_activity.models.requests.UserActivityRequest;
import com.blaze.blazesdk.user_activity.models.responses.UserActivity;
import com.blaze.blazesdk.user_management.annotations.AuthNeeded;
import defpackage.c2g;
import defpackage.i0e;
import defpackage.iu8;
import defpackage.qif;
import defpackage.rq3;
import defpackage.yy1;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/user_activity/UserActivityApi;", "", "Lcom/blaze/blazesdk/user_activity/models/requests/UserActivityRequest;", "userActivityRequest", "Lc2g;", "", "postUserActivity", "(Lcom/blaze/blazesdk/user_activity/models/requests/UserActivityRequest;Lrq3;)Ljava/lang/Object;", "", "userId", "Lcom/blaze/blazesdk/user_activity/models/responses/UserActivity;", "getUserActivity", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface UserActivityApi {
    @Keep
    @AuthNeeded
    @iu8("UserActivity")
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeExperiments = true)
    Object getUserActivity(@qif("userId") @NotNull String str, @NotNull rq3<? super c2g<UserActivity>> rq3Var);

    @Keep
    @AuthNeeded
    @Nullable
    @i0e("UserActivity")
    @BlazeNetworkRequest(includeApiKey = true, includeExperiments = true)
    Object postUserActivity(@yy1 @NotNull UserActivityRequest userActivityRequest, @NotNull rq3<? super c2g<Unit>> rq3Var);
}
