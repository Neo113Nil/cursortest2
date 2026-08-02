package com.sofascore.network.api;

import com.sofascore.model.newNetwork.UserInitResponse;
import com.sofascore.model.profile.SyncNetworkResponse;
import com.sofascore.model.profile.UserInfoRequest;
import com.sofascore.model.profile.UserNotificationsRequest;
import defpackage.c2g;
import defpackage.i0e;
import defpackage.rq3;
import defpackage.yy1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\r\u001a\u00020\f2$\b\u0001\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH§@¢\u0006\u0004\b\u0011\u0010\bJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH§@¢\u0006\u0004\b\u0012\u0010\bJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0006J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H§@¢\u0006\u0004\b\u001b\u0010\u001aJ0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\b\u0001\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001cj\b\u0012\u0004\u0012\u00020\u0018`\u001dH§@¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\b\u0001\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001cj\b\u0012\u0004\u0012\u00020\u0018`\u001dH§@¢\u0006\u0004\b \u0010\u001fJ0\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\b\u0001\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001cj\b\u0012\u0004\u0012\u00020\u0018`\u001dH§@¢\u0006\u0004\b!\u0010\u001fJ0\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\b\u0001\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001cj\b\u0012\u0004\u0012\u00020\u0018`\u001dH§@¢\u0006\u0004\b\"\u0010\u001fJ0\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\b\u0001\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001cj\b\u0012\u0004\u0012\u00020\u0018`\u001dH§@¢\u0006\u0004\b#\u0010\u001fJ0\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\b\u0001\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001cj\b\u0012\u0004\u0012\u00020\u0018`\u001dH§@¢\u0006\u0004\b$\u0010\u001fJ&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H§@¢\u0006\u0004\b%\u0010\u001aJ*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\b\u0001\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017H§@¢\u0006\u0004\b&\u0010\u001aJ*\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\b\u0001\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017H§@¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\fH§@¢\u0006\u0004\b(\u0010\bJ&\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H§@¢\u0006\u0004\b)\u0010\u001aJ&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H§@¢\u0006\u0004\b*\u0010\u001a¨\u0006+À\u0006\u0003"}, d2 = {"Lcom/sofascore/network/api/RegistrationCoroutinesAPI;", "", "Lcom/sofascore/model/profile/UserInfoRequest;", "body", "Lcom/sofascore/model/newNetwork/UserInitResponse;", "tokenInit", "(Lcom/sofascore/model/profile/UserInfoRequest;Lrq3;)Ljava/lang/Object;", "tokenRefresh", "(Lrq3;)Ljava/lang/Object;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Lcom/sofascore/model/profile/SyncNetworkResponse;", "userLogin", "(Ljava/util/HashMap;Lrq3;)Ljava/lang/Object;", "Lc2g;", "", "userLogout", "deleteAccount", "userInfo", "Lcom/sofascore/model/profile/UserNotificationsRequest;", "userNotifications", "(Lcom/sofascore/model/profile/UserNotificationsRequest;Lrq3;)Ljava/lang/Object;", "", "", "userEvents", "(Ljava/util/Set;Lrq3;)Ljava/lang/Object;", "userMutedEvents", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "userTeamNotifications", "(Ljava/util/HashSet;Lrq3;)Ljava/lang/Object;", "userTeamFavorites", "userLeagueNotifications", "userLeagueFavorites", "userPlayerNotifications", "userPlayerFavorites", "userStages", "userPinnedLeagues", "userFantasyCompetitions", "sync", "userUniqueStages", "userMutedStages", "network_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface RegistrationCoroutinesAPI {
    @i0e("/api/v1/user/delete-account")
    @Nullable
    Object deleteAccount(@NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/sync")
    @Nullable
    Object sync(@NotNull rq3<? super SyncNetworkResponse> rq3Var);

    @i0e("api/v1/token/init")
    @Nullable
    Object tokenInit(@yy1 @NotNull UserInfoRequest userInfoRequest, @NotNull rq3<? super UserInitResponse> rq3Var);

    @i0e("api/v1/token/refresh")
    @Nullable
    Object tokenRefresh(@NotNull rq3<? super UserInitResponse> rq3Var);

    @i0e("api/v1/user/events")
    @Nullable
    Object userEvents(@yy1 @NotNull Set<Integer> set, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/fantasy-competitions")
    @Nullable
    Object userFantasyCompetitions(@yy1 @Nullable Set<Integer> set, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/info")
    @Nullable
    Object userInfo(@yy1 @NotNull UserInfoRequest userInfoRequest, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/favorite-leagues")
    @Nullable
    Object userLeagueFavorites(@yy1 @NotNull HashSet<Integer> hashSet, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/leagues")
    @Nullable
    Object userLeagueNotifications(@yy1 @NotNull HashSet<Integer> hashSet, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/login")
    @Nullable
    Object userLogin(@yy1 @NotNull HashMap<String, String> hashMap, @NotNull rq3<? super SyncNetworkResponse> rq3Var);

    @i0e("api/v1/user/logout")
    @Nullable
    Object userLogout(@NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/muted-events")
    @Nullable
    Object userMutedEvents(@yy1 @NotNull Set<Integer> set, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/muted-stages")
    @Nullable
    Object userMutedStages(@yy1 @NotNull Set<Integer> set, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/notifications")
    @Nullable
    Object userNotifications(@yy1 @NotNull UserNotificationsRequest userNotificationsRequest, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/pinned-leagues")
    @Nullable
    Object userPinnedLeagues(@yy1 @Nullable Set<Integer> set, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/favorite-players")
    @Nullable
    Object userPlayerFavorites(@yy1 @NotNull HashSet<Integer> hashSet, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/players")
    @Nullable
    Object userPlayerNotifications(@yy1 @NotNull HashSet<Integer> hashSet, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/stages")
    @Nullable
    Object userStages(@yy1 @NotNull Set<Integer> set, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/favorite-teams")
    @Nullable
    Object userTeamFavorites(@yy1 @NotNull HashSet<Integer> hashSet, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/teams")
    @Nullable
    Object userTeamNotifications(@yy1 @NotNull HashSet<Integer> hashSet, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/unique-stages")
    @Nullable
    Object userUniqueStages(@yy1 @NotNull Set<Integer> set, @NotNull rq3<? super c2g<Unit>> rq3Var);
}
