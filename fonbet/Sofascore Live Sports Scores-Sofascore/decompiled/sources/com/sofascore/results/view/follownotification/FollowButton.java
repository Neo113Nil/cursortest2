package com.sofascore.results.view.follownotification;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.same.report.h;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.favorites.FavoritesStagesData;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventType;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.results.R;
import defpackage.bea;
import defpackage.d31;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.f31;
import defpackage.f5p;
import defpackage.nv;
import defpackage.ph0;
import defpackage.qa6;
import defpackage.ru8;
import defpackage.su8;
import defpackage.v7a;
import defpackage.vu;
import defpackage.w47;
import defpackage.we8;
import defpackage.wu;
import defpackage.wyh;
import defpackage.x9h;
import defpackage.xu;
import defpackage.yaa;
import defpackage.ye8;
import defpackage.ze8;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028T@TX\u0094\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sofascore/results/view/follownotification/FollowButton;", "Lf31;", "Lye8;", "<set-?>", InneractiveMediationDefs.GENDER_FEMALE, "Le1d;", "getState", "()Lye8;", "setState", "(Lye8;)V", "state", "Lwu;", h.b, "Lwu;", "getFollowSource", "()Lwu;", "setFollowSource", "(Lwu;)V", "followSource", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FollowButton extends f31 {
    public static final /* synthetic */ int i = 0;

    /* renamed from: f, reason: from kotlin metadata */
    public final e1d state;
    public final Set g;

    /* renamed from: h, reason: from kotlin metadata */
    public wu followSource;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FollowButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        context.getClass();
        this.state = e.f(ye8.Inactive);
        this.g = ph0.a0(new EventType[]{EventType.MY_FIRST_TEAM, EventType.MY_SECOND_TEAM, EventType.MY_LEAGUES, EventType.MY_FIRST_SUB_TEAM_1, EventType.MY_FIRST_SUB_TEAM_2, EventType.MY_SECOND_SUB_TEAM_1, EventType.MY_SECOND_SUB_TEAM_2});
        this.followSource = wu.MAIN_FAVORITES;
    }

    public static /* synthetic */ void f(FollowButton followButton, Object obj, wu wuVar, int i2) {
        if ((i2 & 2) != 0) {
            wuVar = null;
        }
        followButton.e(obj, wuVar, null);
    }

    @Override // defpackage.f31
    public final void b() {
        Object followableItem = getFollowableItem();
        if (followableItem instanceof Event) {
            Event event = (Event) followableItem;
            HashSet<EventType> typeList = event.getTypeList();
            if (typeList == null || typeList.isEmpty()) {
                event.setTypeList(x9h.c(EventType.MY_GAMES));
                event.setMute(1);
                setState(ye8.Active);
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
                    if (this.g.contains((EventType) it.next())) {
                        getBellButtonPopup().c(this, event, false);
                        return;
                    }
                }
            }
            HashSet<EventType> typeList3 = event.getTypeList();
            if (typeList3 != null) {
                typeList3.remove(EventType.MY_GAMES);
            }
            setState(ye8.Inactive);
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
            ye8 state = getState();
            if ((state != null ? we8.a[state.ordinal()] : -1) == 1) {
                setState(ye8.Inactive);
                Context context6 = getContext();
                context6.getClass();
                Team team = (Team) followableItem;
                v7a.D(team.getId(), context6);
                Context context7 = getContext();
                context7.getClass();
                nv.y(context7, vu.REMOVE_FAVORITE, nv.E(team), team.getId(), getFollowSource());
                return;
            }
            setState(ye8.Active);
            Context context8 = getContext();
            context8.getClass();
            Team team2 = (Team) followableItem;
            v7a.h(team2.getId(), context8);
            Context context9 = getContext();
            context9.getClass();
            f31.c(context9, new w47(27, this, team2));
            Context context10 = getContext();
            context10.getClass();
            nv.y(context10, vu.ADD_FAVORITE, nv.E(team2), team2.getId(), getFollowSource());
            return;
        }
        if (followableItem instanceof Player) {
            ye8 state2 = getState();
            if ((state2 != null ? we8.a[state2.ordinal()] : -1) == 1) {
                setState(ye8.Inactive);
                Context context11 = getContext();
                context11.getClass();
                Player player = (Player) followableItem;
                bea.J(player.getId(), context11);
                Context context12 = getContext();
                context12.getClass();
                nv.y(context12, vu.REMOVE_FAVORITE, xu.PLAYER, player.getId(), getFollowSource());
                return;
            }
            setState(ye8.Active);
            Context context13 = getContext();
            context13.getClass();
            Player player2 = (Player) followableItem;
            bea.m(player2.getId(), context13);
            Context context14 = getContext();
            context14.getClass();
            nv.y(context14, vu.ADD_FAVORITE, xu.PLAYER, player2.getId(), getFollowSource());
            Context context15 = getContext();
            context15.getClass();
            f31.c(context15, new w47(28, this, player2));
            return;
        }
        if (followableItem instanceof d31) {
            ye8 state3 = getState();
            if ((state3 != null ? we8.a[state3.ordinal()] : -1) == 1) {
                setState(ye8.Inactive);
                Context context16 = getContext();
                context16.getClass();
                int i2 = ((d31) followableItem).a;
                yaa.O(i2, context16);
                Context context17 = getContext();
                context17.getClass();
                nv.y(context17, vu.REMOVE_FAVORITE, xu.UNIQUE_TOURNAMENT, i2, getFollowSource());
                getResources().getString(R.string.removed_favourites);
                return;
            }
            setState(ye8.Active);
            Context context18 = getContext();
            context18.getClass();
            int i3 = ((d31) followableItem).a;
            yaa.k(i3, false, context18);
            Context context19 = getContext();
            context19.getClass();
            nv.y(context19, vu.ADD_FAVORITE, xu.UNIQUE_TOURNAMENT, i3, getFollowSource());
            getResources().getString(R.string.added_favourites);
        }
    }

    @Override // defpackage.f31
    public final ze8 d(FavoritesEventsData favoritesEventsData, FavoritesStagesData favoritesStagesData, List list) {
        if (favoritesEventsData != null || favoritesStagesData != null || list != null) {
            Object followableItem = getFollowableItem();
            if (followableItem instanceof Team) {
                return (favoritesEventsData == null || !FavoritesEventsData.isTeamFavorite$default(favoritesEventsData, Integer.valueOf(((Team) followableItem).getId()), false, 2, null)) ? ye8.Inactive : ye8.Active;
            }
            if (followableItem instanceof Event) {
                if (favoritesEventsData != null) {
                    favoritesEventsData.populateEventType((Event) followableItem);
                }
                HashSet<EventType> typeList = ((Event) followableItem).getTypeList();
                if (typeList != null && !typeList.isEmpty()) {
                    Iterator<T> it = typeList.iterator();
                    while (it.hasNext()) {
                        if (((EventType) it.next()) != EventType.MUTED) {
                            return ye8.Active;
                        }
                    }
                }
                return ye8.Inactive;
            }
            if (followableItem instanceof Player) {
                return (list == null || !list.contains(Integer.valueOf(((Player) followableItem).getId()))) ? ye8.Inactive : ye8.Active;
            }
            if (followableItem instanceof d31) {
                return (favoritesEventsData == null || !favoritesEventsData.isLeagueFavorite(Integer.valueOf(((d31) followableItem).a))) ? ye8.Inactive : ye8.Active;
            }
        }
        return null;
    }

    public final void e(Object obj, wu wuVar, String str) {
        d31 d31Var;
        obj.getClass();
        if (!(obj instanceof Event)) {
            if (obj instanceof Team) {
                PlayerTeamInfo playerTeamInfo = ((Team) obj).getPlayerTeamInfo();
                if (playerTeamInfo != null ? Intrinsics.c(playerTeamInfo.getDeceased(), Boolean.TRUE) : false) {
                    setVisibility(8);
                    return;
                }
            } else if (obj instanceof Player) {
                Player player = (Player) obj;
                if (!player.getDeceased() && !player.getRetired() && !player.getDisabled()) {
                    Set set = wyh.a;
                    Set set2 = wyh.z;
                    String sportSlug = player.getSportSlug();
                    if (sportSlug != null) {
                        str = sportSlug;
                    }
                    if (CollectionsKt.R(set2, str)) {
                        r2 = true;
                    }
                }
                if (!r2) {
                    setVisibility(8);
                    return;
                }
            } else {
                if (obj instanceof UniqueTournament) {
                    d31Var = new d31(((UniqueTournament) obj).getId());
                } else if (obj instanceof UniqueTournamentDetails) {
                    d31Var = new d31(((UniqueTournamentDetails) obj).getId());
                }
                obj = d31Var;
            }
        }
        setFollowableItem(obj);
        if (wuVar != null) {
            setFollowSource(wuVar);
        }
    }

    @Override // defpackage.f31
    @NotNull
    public wu getFollowSource() {
        return this.followSource;
    }

    @Override // defpackage.f31
    @Nullable
    public ye8 getState() {
        return (ye8) ((eoh) this.state).getValue();
    }

    @Override // defpackage.f31
    public void setFollowSource(@NotNull wu wuVar) {
        wuVar.getClass();
        this.followSource = wuVar;
    }

    @Override // defpackage.f31
    public void setState(@Nullable ye8 ye8Var) {
        ((eoh) this.state).setValue(ye8Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FollowButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
