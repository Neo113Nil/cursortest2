package com.vk.id.network.groupsubscription;

import We.E;
import We.InterfaceC4865g;
import We.w;
import com.vk.id.network.util.CreateRequestKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;", "", "LWe/E;", "client", "<init>", "(LWe/E;)V", "", "accessToken", "LWe/w$a;", "bodyBuilder", "(Ljava/lang/String;)LWe/w$a;", "LWe/g;", "getShouldShowSubscription", "(Ljava/lang/String;)LWe/g;", "getProfileShortInfo", "groupId", "getGroup", "(Ljava/lang/String;Ljava/lang/String;)LWe/g;", "", "justFriends", "getMembers", "(Ljava/lang/String;Ljava/lang/String;Z)LWe/g;", "subscribeToGroup", "LWe/E;", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIDGroupSubscriptionApi {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final E client;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi$Companion;", "", "<init>", "()V", "HOST_VK_API", "", "HOST_VK_ID", "PATH_ACCOUNT_PROFILE_SHORT_INFO", "PATH_GROUPS_GET_BY_ID", "PATH_GROUPS_GET_MEMBERS", "PATH_GROUPS_JOIN", "PATH_SHOULD_SHOW_SUBSCRIPTION", "FIELD_ACCESS_TOKEN", "FIELD_GROUP_ID", "FIELD_SOURCE", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public InternalVKIDGroupSubscriptionApi(@NotNull E client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    private final w.a bodyBuilder(String accessToken) {
        w.a aVar = new w.a(0);
        aVar.a("v", "5.220");
        aVar.a("access_token", accessToken);
        return aVar;
    }

    @NotNull
    public final InterfaceC4865g getGroup(@NotNull String accessToken, @NotNull String groupId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        E e11 = this.client;
        w.a bodyBuilder = bodyBuilder(accessToken);
        bodyBuilder.a("group_ids", groupId);
        bodyBuilder.a("fields", "description,verified,is_member");
        return CreateRequestKt.createRequest$default(e11, "https://api.vk.ru", "method/groups.getById", bodyBuilder.c(), null, 8, null);
    }

    @NotNull
    public final InterfaceC4865g getMembers(@NotNull String accessToken, @NotNull String groupId, boolean justFriends) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        E e11 = this.client;
        w.a bodyBuilder = bodyBuilder(accessToken);
        bodyBuilder.a("group_id", groupId);
        bodyBuilder.a("sort", "id_asc");
        bodyBuilder.a("count", "3");
        bodyBuilder.a("fields", "photo_200");
        if (justFriends) {
            bodyBuilder.a("filter", "friends");
        }
        Unit unit = Unit.f71690a;
        return CreateRequestKt.createRequest$default(e11, "https://api.vk.ru", "method/groups.getMembers", bodyBuilder.c(), null, 8, null);
    }

    @NotNull
    public final InterfaceC4865g getProfileShortInfo(@NotNull String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return CreateRequestKt.createRequest$default(this.client, "https://api.vk.ru", "method/account.getProfileShortInfo", bodyBuilder(accessToken).c(), null, 8, null);
    }

    @NotNull
    public final InterfaceC4865g getShouldShowSubscription(@NotNull String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return CreateRequestKt.createRequest$default(this.client, "https://id.vk.ru", "vkid_sdk_is_show_subscription", bodyBuilder(accessToken).c(), null, 8, null);
    }

    @NotNull
    public final InterfaceC4865g subscribeToGroup(@NotNull String accessToken, @NotNull String groupId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        E e11 = this.client;
        w.a bodyBuilder = bodyBuilder(accessToken);
        bodyBuilder.a("group_id", groupId);
        bodyBuilder.a("source", "vkid_sdk");
        return CreateRequestKt.createRequest$default(e11, "https://api.vk.ru", "method/groups.join", bodyBuilder.c(), null, 8, null);
    }
}
