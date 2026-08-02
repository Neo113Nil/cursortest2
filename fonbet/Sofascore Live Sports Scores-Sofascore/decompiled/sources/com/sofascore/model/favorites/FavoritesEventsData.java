package com.sofascore.model.favorites;

import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.DbMyUniqueTournament;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventType;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.km5;
import defpackage.mz1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0002J\u001f\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0015\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010#J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0014\u0010)\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010,\u001a\u00020-HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006."}, d2 = {"Lcom/sofascore/model/favorites/FavoritesEventsData;", "", "myGames", "", "Lcom/sofascore/model/favorites/EventMuteInfo;", "myLeagueIds", "Lcom/sofascore/model/mvvm/model/DbMyUniqueTournament;", "myTeamIds", "Lcom/sofascore/model/mvvm/model/DbMyTeam;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMyGames", "()Ljava/util/List;", "getMyLeagueIds", "getMyTeamIds", "checkTeams", "", "typeList", "Ljava/util/HashSet;", "Lcom/sofascore/model/mvvm/model/EventType;", "Lkotlin/collections/HashSet;", "firstTeam", "Lcom/sofascore/model/mvvm/model/Team;", "secondTeam", "checkNotifications", "", "isTeamFavorite", "teamId", "", "(Ljava/lang/Integer;Z)Z", "populateEventType", "event", "Lcom/sofascore/model/mvvm/model/Event;", "isLeagueFavorite", "id", "(Ljava/lang/Integer;)Z", "hasLeagueFavoriteNotification", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FavoritesEventsData {

    @NotNull
    private final List<EventMuteInfo> myGames;

    @NotNull
    private final List<DbMyUniqueTournament> myLeagueIds;

    @NotNull
    private final List<DbMyTeam> myTeamIds;

    public FavoritesEventsData(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? km5.a : list, (i & 2) != 0 ? km5.a : list2, (i & 4) != 0 ? km5.a : list3);
    }

    private final void checkTeams(HashSet<EventType> typeList, Team firstTeam, Team secondTeam, boolean checkNotifications) {
        if (isTeamFavorite(Integer.valueOf(firstTeam.getId()), checkNotifications)) {
            typeList.add(EventType.MY_FIRST_TEAM);
        }
        if (firstTeam.hasSubTeams()) {
            SubTeam subTeam1 = firstTeam.getSubTeam1();
            if (isTeamFavorite(subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null, checkNotifications)) {
                typeList.add(EventType.MY_FIRST_SUB_TEAM_1);
            }
            SubTeam subTeam2 = firstTeam.getSubTeam2();
            if (isTeamFavorite(subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null, checkNotifications)) {
                typeList.add(EventType.MY_FIRST_SUB_TEAM_2);
            }
        }
        if (isTeamFavorite(Integer.valueOf(secondTeam.getId()), checkNotifications)) {
            typeList.add(EventType.MY_SECOND_TEAM);
        }
        if (secondTeam.hasSubTeams()) {
            SubTeam subTeam12 = secondTeam.getSubTeam1();
            if (isTeamFavorite(subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null, checkNotifications)) {
                typeList.add(EventType.MY_SECOND_SUB_TEAM_1);
            }
            SubTeam subTeam22 = secondTeam.getSubTeam2();
            if (isTeamFavorite(subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null, checkNotifications)) {
                typeList.add(EventType.MY_SECOND_SUB_TEAM_2);
            }
        }
    }

    public static /* synthetic */ void checkTeams$default(FavoritesEventsData favoritesEventsData, HashSet hashSet, Team team, Team team2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        favoritesEventsData.checkTeams(hashSet, team, team2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoritesEventsData copy$default(FavoritesEventsData favoritesEventsData, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = favoritesEventsData.myGames;
        }
        if ((i & 2) != 0) {
            list2 = favoritesEventsData.myLeagueIds;
        }
        if ((i & 4) != 0) {
            list3 = favoritesEventsData.myTeamIds;
        }
        return favoritesEventsData.copy(list, list2, list3);
    }

    public static /* synthetic */ boolean isTeamFavorite$default(FavoritesEventsData favoritesEventsData, Integer num, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return favoritesEventsData.isTeamFavorite(num, z);
    }

    @NotNull
    public final List<EventMuteInfo> component1() {
        return this.myGames;
    }

    @NotNull
    public final List<DbMyUniqueTournament> component2() {
        return this.myLeagueIds;
    }

    @NotNull
    public final List<DbMyTeam> component3() {
        return this.myTeamIds;
    }

    @NotNull
    public final FavoritesEventsData copy(@NotNull List<EventMuteInfo> myGames, @NotNull List<DbMyUniqueTournament> myLeagueIds, @NotNull List<DbMyTeam> myTeamIds) {
        myGames.getClass();
        myLeagueIds.getClass();
        myTeamIds.getClass();
        return new FavoritesEventsData(myGames, myLeagueIds, myTeamIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoritesEventsData)) {
            return false;
        }
        FavoritesEventsData favoritesEventsData = (FavoritesEventsData) other;
        return Intrinsics.c(this.myGames, favoritesEventsData.myGames) && Intrinsics.c(this.myLeagueIds, favoritesEventsData.myLeagueIds) && Intrinsics.c(this.myTeamIds, favoritesEventsData.myTeamIds);
    }

    @NotNull
    public final List<EventMuteInfo> getMyGames() {
        return this.myGames;
    }

    @NotNull
    public final List<DbMyUniqueTournament> getMyLeagueIds() {
        return this.myLeagueIds;
    }

    @NotNull
    public final List<DbMyTeam> getMyTeamIds() {
        return this.myTeamIds;
    }

    public final boolean hasLeagueFavoriteNotification(@Nullable Integer id) {
        List<DbMyUniqueTournament> list = this.myLeagueIds;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (DbMyUniqueTournament dbMyUniqueTournament : list) {
            int uniqueTournamentId = dbMyUniqueTournament.getUniqueTournamentId();
            if (id != null && uniqueTournamentId == id.intValue() && dbMyUniqueTournament.getNotificationsEnabled()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.myTeamIds.hashCode() + dmi.d(this.myGames.hashCode() * 31, 31, this.myLeagueIds);
    }

    public final boolean isLeagueFavorite(@Nullable Integer id) {
        List<DbMyUniqueTournament> list = this.myLeagueIds;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int uniqueTournamentId = ((DbMyUniqueTournament) it.next()).getUniqueTournamentId();
            if (id != null && uniqueTournamentId == id.intValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTeamFavorite(@Nullable Integer teamId, boolean checkNotifications) {
        List<DbMyTeam> list = this.myTeamIds;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (DbMyTeam dbMyTeam : list) {
            int teamId2 = dbMyTeam.getTeamId();
            if (teamId != null && teamId2 == teamId.intValue() && (!checkNotifications || dbMyTeam.getNotificationsEnabled())) {
                return true;
            }
        }
        return false;
    }

    public final boolean populateEventType(@Nullable Event event) {
        if (event == null) {
            return false;
        }
        HashSet<EventType> hashSet = new HashSet<>();
        Object obj = null;
        checkTeams$default(this, hashSet, Event.getHomeTeam$default(event, null, 1, null), Event.getAwayTeam$default(event, null, 1, null), false, 8, null);
        HashSet<EventType> hashSet2 = new HashSet<>();
        checkTeams(hashSet2, Event.getHomeTeam$default(event, null, 1, null), Event.getAwayTeam$default(event, null, 1, null), true);
        UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
        if (isLeagueFavorite(uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null)) {
            hashSet.add(EventType.MY_LEAGUES);
        }
        UniqueTournament uniqueTournament2 = event.getTournament().getUniqueTournament();
        if (hasLeagueFavoriteNotification(uniqueTournament2 != null ? Integer.valueOf(uniqueTournament2.getId()) : null)) {
            hashSet2.add(EventType.MY_LEAGUES);
        }
        Iterator<T> it = this.myGames.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((EventMuteInfo) next).getId() == event.getId()) {
                obj = next;
                break;
            }
        }
        EventMuteInfo eventMuteInfo = (EventMuteInfo) obj;
        if (eventMuteInfo != null) {
            if (eventMuteInfo.getMute() != -1 && hashSet.isEmpty()) {
                hashSet.add(EventType.MY_GAMES);
            }
            if (eventMuteInfo.getMute() == 1) {
                EventType eventType = EventType.MUTED;
                hashSet.add(eventType);
                hashSet2.add(eventType);
            }
        }
        event.setTypeList(hashSet);
        if (eventMuteInfo != null && eventMuteInfo.getMute() == 0) {
            hashSet2.add(EventType.NOTIFICATION_EDITED_ENABLED);
        }
        event.setTypeListNotifications(hashSet2);
        return !hashSet.isEmpty();
    }

    @NotNull
    public String toString() {
        List<EventMuteInfo> list = this.myGames;
        List<DbMyUniqueTournament> list2 = this.myLeagueIds;
        return mz1.p(fc6.s("FavoritesEventsData(myGames=", ", myLeagueIds=", ", myTeamIds=", list, list2), this.myTeamIds, ")");
    }

    public FavoritesEventsData(@NotNull List<EventMuteInfo> list, @NotNull List<DbMyUniqueTournament> list2, @NotNull List<DbMyTeam> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.myGames = list;
        this.myLeagueIds = list2;
        this.myTeamIds = list3;
    }

    public FavoritesEventsData() {
        this(null, null, null, 7, null);
    }
}
