package com.sofascore.results.view.follownotification;

import android.content.Context;
import android.util.AttributeSet;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventType;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.results.R;
import defpackage.a31;
import defpackage.bea;
import defpackage.f5p;
import defpackage.kb;
import defpackage.nv;
import defpackage.ph0;
import defpackage.qa6;
import defpackage.ru8;
import defpackage.su8;
import defpackage.tba;
import defpackage.v7a;
import defpackage.ve8;
import defpackage.vu;
import defpackage.w47;
import defpackage.wu;
import defpackage.x9h;
import defpackage.xu;
import defpackage.yaa;
import defpackage.z21;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0014@TX\u0094\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sofascore/results/view/follownotification/FollowActionButton;", "La31;", "Lkb;", U3.i.X, "d", "Lkb;", "getState", "()Lkb;", "setState", "(Lkb;)V", "state", "Lwu;", InneractiveMediationDefs.GENDER_FEMALE, "Lwu;", "getFollowSource", "()Lwu;", "setFollowSource", "(Lwu;)V", "followSource", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FollowActionButton extends a31 {
    public static final /* synthetic */ int g = 0;

    /* renamed from: d, reason: from kotlin metadata */
    public kb state;
    public final Set e;

    /* renamed from: f, reason: from kotlin metadata */
    public wu followSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowActionButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        context.getClass();
        this.state = kb.Inactive;
        this.e = ph0.a0(new EventType[]{EventType.MY_FIRST_TEAM, EventType.MY_SECOND_TEAM, EventType.MY_LEAGUES, EventType.MY_FIRST_SUB_TEAM_1, EventType.MY_FIRST_SUB_TEAM_2, EventType.MY_SECOND_SUB_TEAM_1, EventType.MY_SECOND_SUB_TEAM_2});
        this.followSource = wu.HEADER;
    }

    @Override // defpackage.a31
    public final void b() {
        Object followableItem = getFollowableItem();
        if (followableItem instanceof Event) {
            Event event = (Event) followableItem;
            HashSet<EventType> typeList = event.getTypeList();
            if (typeList == null || typeList.isEmpty()) {
                event.setTypeList(x9h.c(EventType.MY_GAMES));
                event.setMute(1);
                setState(kb.Active);
                Context context = getContext();
                context.getClass();
                su8.a(context, event);
                Context context2 = getContext();
                context2.getClass();
                su8.b(context2, event);
                Context context3 = getContext();
                context3.getClass();
                nv.y(context3, vu.ADD_FAVORITE, xu.EVENT, event.getId(), getFollowSource());
                return;
            }
            HashSet<EventType> typeList2 = event.getTypeList();
            if (typeList2 != null && !typeList2.isEmpty()) {
                Iterator<T> it = typeList2.iterator();
                while (it.hasNext()) {
                    if (this.e.contains((EventType) it.next())) {
                        getBellButtonPopup().c(this, event, false);
                        return;
                    }
                }
            }
            HashSet<EventType> typeList3 = event.getTypeList();
            if (typeList3 != null) {
                typeList3.remove(EventType.MY_GAMES);
            }
            setState(kb.Inactive);
            Context context4 = getContext();
            context4.getClass();
            int id = event.getId();
            qa6 qa6Var = su8.a;
            f5p.E(context4, new ru8(id, null));
            Context context5 = getContext();
            context5.getClass();
            nv.y(context5, vu.REMOVE_FAVORITE, xu.EVENT, event.getId(), getFollowSource());
            return;
        }
        if (followableItem instanceof Team) {
            if (ve8.a[getState().ordinal()] == 1) {
                setState(kb.Inactive);
                Context context6 = getContext();
                context6.getClass();
                Team team = (Team) followableItem;
                v7a.D(team.getId(), context6);
                Context context7 = getContext();
                context7.getClass();
                nv.y(context7, vu.REMOVE_FAVORITE, nv.E(team), team.getId(), getFollowSource());
                return;
            }
            setState(kb.Active);
            Context context8 = getContext();
            context8.getClass();
            Team team2 = (Team) followableItem;
            v7a.h(team2.getId(), context8);
            Context context9 = getContext();
            context9.getClass();
            a31.d(context9, new w47(25, this, team2));
            Context context10 = getContext();
            context10.getClass();
            nv.y(context10, vu.ADD_FAVORITE, nv.E(team2), team2.getId(), getFollowSource());
            return;
        }
        if (followableItem instanceof Player) {
            if (ve8.a[getState().ordinal()] == 1) {
                setState(kb.Inactive);
                Context context11 = getContext();
                context11.getClass();
                Player player = (Player) followableItem;
                bea.J(player.getId(), context11);
                Context context12 = getContext();
                context12.getClass();
                nv.y(context12, vu.REMOVE_FAVORITE, xu.PLAYER, player.getId(), getFollowSource());
                return;
            }
            setState(kb.Active);
            Context context13 = getContext();
            context13.getClass();
            Player player2 = (Player) followableItem;
            bea.m(player2.getId(), context13);
            Context context14 = getContext();
            context14.getClass();
            nv.y(context14, vu.ADD_FAVORITE, xu.PLAYER, player2.getId(), getFollowSource());
            Context context15 = getContext();
            context15.getClass();
            a31.d(context15, new w47(26, this, player2));
            return;
        }
        if (followableItem instanceof z21) {
            if (ve8.a[getState().ordinal()] == 1) {
                setState(kb.Inactive);
                Context context16 = getContext();
                context16.getClass();
                int i = ((z21) followableItem).a;
                yaa.O(i, context16);
                Context context17 = getContext();
                context17.getClass();
                nv.y(context17, vu.REMOVE_FAVORITE, xu.UNIQUE_TOURNAMENT, i, getFollowSource());
                getResources().getString(R.string.removed_favourites);
                return;
            }
            setState(kb.Active);
            Context context18 = getContext();
            context18.getClass();
            int i2 = ((z21) followableItem).a;
            yaa.k(i2, false, context18);
            Context context19 = getContext();
            context19.getClass();
            nv.y(context19, vu.ADD_FAVORITE, xu.UNIQUE_TOURNAMENT, i2, getFollowSource());
            getResources().getString(R.string.added_favourites);
        }
    }

    public final void f(FavoritesEventsData favoritesEventsData) {
        kb kbVar;
        Object followableItem = getFollowableItem();
        if (followableItem instanceof Event) {
            if (favoritesEventsData != null) {
                favoritesEventsData.populateEventType((Event) followableItem);
            }
            HashSet<EventType> typeList = ((Event) followableItem).getTypeList();
            if (typeList != null && !typeList.isEmpty()) {
                Iterator<T> it = typeList.iterator();
                while (it.hasNext()) {
                    if (((EventType) it.next()) != EventType.MUTED) {
                        kbVar = kb.Active;
                        break;
                    }
                }
            }
            kbVar = kb.Inactive;
        } else {
            kbVar = followableItem instanceof Team ? (favoritesEventsData == null || !FavoritesEventsData.isTeamFavorite$default(favoritesEventsData, Integer.valueOf(((Team) followableItem).getId()), false, 2, null)) ? kb.Inactive : kb.Active : followableItem instanceof z21 ? (favoritesEventsData == null || !favoritesEventsData.isLeagueFavorite(Integer.valueOf(((z21) followableItem).a))) ? kb.Inactive : kb.Active : kb.Inactive;
        }
        setState(kbVar);
    }

    public final void g(List list) {
        list.getClass();
        Object followableItem = getFollowableItem();
        setState(followableItem instanceof Player ? list.contains(Integer.valueOf(((Player) followableItem).getId())) ? kb.Active : kb.Inactive : kb.Inactive);
    }

    @Override // defpackage.a31
    @NotNull
    public wu getFollowSource() {
        return this.followSource;
    }

    public final void h(Object obj, FavoritesEventsData favoritesEventsData) {
        z21 z21Var;
        obj.getClass();
        if (!(obj instanceof Event)) {
            if (obj instanceof Team) {
                PlayerTeamInfo playerTeamInfo = ((Team) obj).getPlayerTeamInfo();
                if (playerTeamInfo != null ? Intrinsics.c(playerTeamInfo.getDeceased(), Boolean.TRUE) : false) {
                    setVisibility(8);
                    return;
                }
            } else {
                if (obj instanceof UniqueTournament) {
                    UniqueTournament uniqueTournament = (UniqueTournament) obj;
                    z21Var = new z21(uniqueTournament.getId(), tba.x(uniqueTournament), uniqueTournament.getCategory(), uniqueTournament.getUserCount());
                } else if (obj instanceof UniqueTournamentDetails) {
                    UniqueTournamentDetails uniqueTournamentDetails = (UniqueTournamentDetails) obj;
                    z21Var = new z21(uniqueTournamentDetails.getId(), tba.y(uniqueTournamentDetails), uniqueTournamentDetails.getCategory(), uniqueTournamentDetails.getUserCount());
                }
                obj = z21Var;
            }
        }
        setFollowableItem(obj);
        f(favoritesEventsData);
    }

    @Override // defpackage.a31
    public void setFollowSource(@NotNull wu wuVar) {
        wuVar.getClass();
        this.followSource = wuVar;
    }

    @Override // defpackage.a31
    public void setState(@NotNull kb kbVar) {
        kbVar.getClass();
        this.state = kbVar;
        e();
    }

    @Override // defpackage.a31
    @NotNull
    public kb getState() {
        return this.state;
    }
}
