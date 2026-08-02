package com.blaze.blazesdk.user_management;

import androidx.annotation.Keep;
import com.blaze.blazesdk.networking.annotations.BlazeNetworkRequest;
import com.blaze.blazesdk.user_management.annotations.AuthRefreshCall;
import com.blaze.blazesdk.user_management.models.requests.UserManagementExternalIdRequest;
import com.blaze.blazesdk.user_management.models.requests.UserManagementRefreshTokenRequestNew;
import com.blaze.blazesdk.user_management.models.responses.UserManagementResponse;
import defpackage.c2g;
import defpackage.h3e;
import defpackage.i0e;
import defpackage.rq3;
import defpackage.yy1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/user_management/UserManagementApi;", "", "Lcom/blaze/blazesdk/user_management/models/requests/UserManagementExternalIdRequest;", "userManagementExternalIdRequest", "Lc2g;", "Lcom/blaze/blazesdk/user_management/models/responses/UserManagementResponse;", "initUserManagement", "(Lcom/blaze/blazesdk/user_management/models/requests/UserManagementExternalIdRequest;Lrq3;)Ljava/lang/Object;", "Lcom/blaze/blazesdk/user_management/models/requests/UserManagementRefreshTokenRequestNew;", "userManagementRefreshTokenRequestNew", "refreshToken", "(Lcom/blaze/blazesdk/user_management/models/requests/UserManagementRefreshTokenRequestNew;Lrq3;)Ljava/lang/Object;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface UserManagementApi {
    @Keep
    @Nullable
    @i0e("UserManagement")
    @BlazeNetworkRequest(includeApiKey = true, includeExperiments = true)
    @AuthRefreshCall
    Object initUserManagement(@yy1 @NotNull UserManagementExternalIdRequest userManagementExternalIdRequest, @NotNull rq3<? super c2g<UserManagementResponse>> rq3Var);

    @Keep
    @h3e("UserManagement")
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeExperiments = true)
    @AuthRefreshCall
    Object refreshToken(@yy1 @NotNull UserManagementRefreshTokenRequestNew userManagementRefreshTokenRequestNew, @NotNull rq3<? super c2g<UserManagementResponse>> rq3Var);
}
