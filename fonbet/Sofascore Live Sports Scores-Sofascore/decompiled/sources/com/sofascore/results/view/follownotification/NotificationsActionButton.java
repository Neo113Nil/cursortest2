package com.sofascore.results.view.follownotification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.AppCompatActivity;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.favorites.FavoritesStagesData;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventType;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageType;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.results.R;
import com.sofascore.results.dialog.FollowSubStagesDialog;
import com.sofascore.results.dialog.FollowSubStagesViewModel;
import com.sofascore.results.player.PlayerWorker;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import defpackage.a31;
import defpackage.cga;
import defpackage.f5p;
import defpackage.fz8;
import defpackage.hpo;
import defpackage.jb;
import defpackage.joa;
import defpackage.k13;
import defpackage.kq7;
import defpackage.l5i;
import defpackage.l97;
import defpackage.lsb;
import defpackage.ltd;
import defpackage.md4;
import defpackage.mha;
import defpackage.nf6;
import defpackage.nv;
import defpackage.qa6;
import defpackage.qhd;
import defpackage.rhd;
import defpackage.rq3;
import defpackage.su8;
import defpackage.t6a;
import defpackage.tba;
import defpackage.u0a;
import defpackage.v7a;
import defpackage.vu;
import defpackage.vxd;
import defpackage.wu;
import defpackage.x62;
import defpackage.x9h;
import defpackage.xu;
import defpackage.xxb;
import defpackage.yaa;
import defpackage.z21;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0014@TX\u0094\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/sofascore/results/view/follownotification/NotificationsActionButton;", "La31;", "Ljb;", U3.i.X, "d", "Ljb;", "getState", "()Ljb;", "setState", "(Ljb;)V", "state", "Lwu;", InneractiveMediationDefs.GENDER_FEMALE, "Lwu;", "getFollowSource", "()Lwu;", "setFollowSource", "(Lwu;)V", "followSource", "qhd", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationsActionButton extends a31 {
    public static final /* synthetic */ int g = 0;

    /* renamed from: d, reason: from kotlin metadata */
    public jb state;
    public boolean e;

    /* renamed from: f, reason: from kotlin metadata */
    public wu followSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsActionButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        context.getClass();
        this.state = jb.Inactive;
        this.followSource = wu.HEADER;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a31
    public final void b() {
        Object followableItem = getFollowableItem();
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        if (followableItem instanceof Event) {
            Event event = (Event) followableItem;
            HashSet<EventType> typeListNotifications = event.getTypeListNotifications();
            if (typeListNotifications != null) {
                EventType eventType = EventType.MUTED;
                if (typeListNotifications.contains(eventType)) {
                    HashSet<EventType> typeListNotifications2 = event.getTypeListNotifications();
                    if (typeListNotifications2 != null) {
                        typeListNotifications2.remove(eventType);
                    }
                    HashSet<EventType> typeListNotifications3 = event.getTypeListNotifications();
                    if (typeListNotifications3 != null) {
                        typeListNotifications3.add(EventType.NOTIFICATION_EDITED_ENABLED);
                    }
                    setState(jb.Active);
                    Context context = getContext();
                    context.getClass();
                    int id = event.getId();
                    qa6 qa6Var = su8.a;
                    f5p.E(context, new kq7(id, (rq3) (null == true ? 1 : 0), i));
                    Context context2 = getContext();
                    context2.getClass();
                    nv.y(context2, vu.ADD_NOTIFICATION, xu.EVENT, event.getId(), getFollowSource());
                    Context context3 = getContext();
                    context3.getClass();
                    a31.d(context3, new Function1(this) { // from class: phd
                        public final /* synthetic */ NotificationsActionButton b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i4 = i2;
                            NotificationsActionButton notificationsActionButton = this.b;
                            ((Boolean) obj).getClass();
                            int i5 = NotificationsActionButton.g;
                            switch (i4) {
                                case 0:
                                    Context context4 = notificationsActionButton.getContext();
                                    context4.getClass();
                                    if (f6a.F(context4)) {
                                        Context context5 = notificationsActionButton.getContext();
                                        context5.getClass();
                                        zic.q(context5);
                                    }
                                    break;
                                case 1:
                                    Context context6 = notificationsActionButton.getContext();
                                    context6.getClass();
                                    if (f6a.F(context6)) {
                                        Context context7 = notificationsActionButton.getContext();
                                        context7.getClass();
                                        zic.q(context7);
                                    }
                                    break;
                                default:
                                    Context context8 = notificationsActionButton.getContext();
                                    context8.getClass();
                                    if (f6a.G(context8)) {
                                        Context context9 = notificationsActionButton.getContext();
                                        context9.getClass();
                                        zic.W(context9);
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                    return;
                }
            }
            HashSet<EventType> typeListNotifications4 = event.getTypeListNotifications();
            if (typeListNotifications4 != null && !typeListNotifications4.isEmpty()) {
                HashSet<EventType> typeListNotifications5 = event.getTypeListNotifications();
                if (typeListNotifications5 != null) {
                    typeListNotifications5.add(EventType.MUTED);
                }
                setState(jb.Inactive);
                Context context4 = getContext();
                context4.getClass();
                su8.b(context4, event);
                Context context5 = getContext();
                context5.getClass();
                nv.y(context5, vu.REMOVE_NOTIFICATION, xu.EVENT, event.getId(), getFollowSource());
                return;
            }
            event.setTypeListNotifications(x9h.c(EventType.MY_GAMES));
            HashSet<EventType> typeListNotifications6 = event.getTypeListNotifications();
            if (typeListNotifications6 != null) {
                typeListNotifications6.add(EventType.NOTIFICATION_EDITED_ENABLED);
            }
            event.setMute(0);
            setState(jb.Active);
            Context context6 = getContext();
            context6.getClass();
            su8.a(context6, event);
            Context context7 = getContext();
            context7.getClass();
            nv.y(context7, vu.ADD_NOTIFICATION, xu.EVENT, event.getId(), getFollowSource());
            Context context8 = getContext();
            context8.getClass();
            a31.d(context8, new Function1(this) { // from class: phd
                public final /* synthetic */ NotificationsActionButton b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i4 = i3;
                    NotificationsActionButton notificationsActionButton = this.b;
                    ((Boolean) obj).getClass();
                    int i5 = NotificationsActionButton.g;
                    switch (i4) {
                        case 0:
                            Context context42 = notificationsActionButton.getContext();
                            context42.getClass();
                            if (f6a.F(context42)) {
                                Context context52 = notificationsActionButton.getContext();
                                context52.getClass();
                                zic.q(context52);
                            }
                            break;
                        case 1:
                            Context context62 = notificationsActionButton.getContext();
                            context62.getClass();
                            if (f6a.F(context62)) {
                                Context context72 = notificationsActionButton.getContext();
                                context72.getClass();
                                zic.q(context72);
                            }
                            break;
                        default:
                            Context context82 = notificationsActionButton.getContext();
                            context82.getClass();
                            if (f6a.G(context82)) {
                                Context context9 = notificationsActionButton.getContext();
                                context9.getClass();
                                zic.W(context9);
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            return;
        }
        if (followableItem instanceof Team) {
            if (rhd.a[getState().ordinal()] != 1) {
                setState(jb.Active);
                Context context9 = getContext();
                context9.getClass();
                Team team = (Team) followableItem;
                v7a.h(team.getId(), context9);
                Context context10 = getContext();
                context10.getClass();
                nv.y(context10, vu.ADD_NOTIFICATION, nv.E(team), team.getId(), getFollowSource());
                Context context11 = getContext();
                context11.getClass();
                a31.d(context11, new lsb(22, this, team));
                return;
            }
            setState(jb.Inactive);
            if (this.e) {
                Context context12 = getContext();
                context12.getClass();
                v7a.D(((Team) followableItem).getId(), context12);
            } else {
                Context context13 = getContext();
                context13.getClass();
                v7a.m(((Team) followableItem).getId(), context13);
            }
            Context context14 = getContext();
            context14.getClass();
            Team team2 = (Team) followableItem;
            nv.y(context14, vu.REMOVE_NOTIFICATION, nv.E(team2), team2.getId(), getFollowSource());
            return;
        }
        if (followableItem instanceof Player) {
            if (rhd.a[getState().ordinal()] == 1) {
                setState(jb.Inactive);
                Context context15 = getContext();
                context15.getClass();
                Player player = (Player) followableItem;
                Pair[] pairArr = {new Pair("ACTION", "DISABLE_NOTIFICATIONS"), new Pair("PLAYER_ID", Integer.valueOf(player.getId()))};
                hpo hpoVar = new hpo(18);
                while (i2 < 2) {
                    Pair pair = pairArr[i2];
                    hpoVar.B(pair.b, (String) pair.a);
                    i2++;
                }
                md4 l = hpoVar.l();
                vxd.h(context15).b("PlayerWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(PlayerWorker.class, l).a());
                Context context16 = getContext();
                context16.getClass();
                nv.y(context16, vu.REMOVE_NOTIFICATION, xu.PLAYER, player.getId(), getFollowSource());
                return;
            }
            setState(jb.Active);
            Context context17 = getContext();
            context17.getClass();
            Player player2 = (Player) followableItem;
            Pair[] pairArr2 = {new Pair("ACTION", "ENABLE_NOTIFICATIONS"), new Pair("PLAYER_ID", Integer.valueOf(player2.getId()))};
            hpo hpoVar2 = new hpo(18);
            while (i2 < 2) {
                Pair pair2 = pairArr2[i2];
                hpoVar2.B(pair2.b, (String) pair2.a);
                i2++;
            }
            md4 l2 = hpoVar2.l();
            vxd.h(context17).b("PlayerWorker-".concat(mha.o(l2)), nf6.a, (ltd) vxd.g(PlayerWorker.class, l2).a());
            Context context18 = getContext();
            context18.getClass();
            a31.d(context18, new lsb(23, this, player2));
            Context context19 = getContext();
            context19.getClass();
            nv.y(context19, vu.ADD_NOTIFICATION, xu.PLAYER, player2.getId(), getFollowSource());
            return;
        }
        if (followableItem instanceof z21) {
            if (rhd.a[getState().ordinal()] == 1) {
                setState(jb.Inactive);
                Context context20 = getContext();
                context20.getClass();
                int i4 = ((z21) followableItem).a;
                yaa.q(i4, context20);
                Context context21 = getContext();
                context21.getClass();
                nv.y(context21, vu.REMOVE_NOTIFICATION, xu.UNIQUE_TOURNAMENT, i4, getFollowSource());
                return;
            }
            setState(jb.Active);
            Context context22 = getContext();
            context22.getClass();
            z21 z21Var = (z21) followableItem;
            int i5 = z21Var.a;
            yaa.r(i5, context22);
            Context context23 = getContext();
            context23.getClass();
            a31.d(context23, new lsb(24, this, z21Var));
            Context context24 = getContext();
            context24.getClass();
            nv.y(context24, vu.ADD_NOTIFICATION, xu.UNIQUE_TOURNAMENT, i5, getFollowSource());
            return;
        }
        if (followableItem instanceof Stage) {
            Stage stage = (Stage) followableItem;
            HashSet<StageType> typeList = stage.getTypeList();
            if (typeList.isEmpty()) {
                typeList.add(StageType.MY_STAGE);
                setState(jb.Active);
                Context context25 = getContext();
                context25.getClass();
                t6a.m(context25, stage);
                Context context26 = getContext();
                context26.getClass();
                a31.d(context26, new lsb(25, this, stage));
                return;
            }
            StageType stageType = StageType.MUTED;
            if (!typeList.contains(stageType)) {
                if (typeList.contains(StageType.MY_UNIQUE_STAGE)) {
                    getBellButtonPopup().g(this, stage, new l97(17, this, stage, typeList));
                    return;
                } else {
                    getBellButtonPopup().f(this, stage, new xxb(this, 15));
                    return;
                }
            }
            Context context27 = getContext();
            context27.getClass();
            nv.y(context27, vu.UNMUTE_NOTIFICATION, xu.STAGE, stage.getId(), getFollowSource());
            typeList.remove(stageType);
            setState(jb.Active);
            Context context28 = getContext();
            context28.getClass();
            u0a.N(stage.getId(), context28);
            return;
        }
        if (!(followableItem instanceof qhd)) {
            if (followableItem instanceof UniqueStage) {
                if (rhd.a[getState().ordinal()] == 1) {
                    setState(jb.Inactive);
                    Context context29 = getContext();
                    context29.getClass();
                    UniqueStage uniqueStage = (UniqueStage) followableItem;
                    t6a.J(uniqueStage.getId(), context29);
                    Context context30 = getContext();
                    context30.getClass();
                    nv.y(context30, vu.REMOVE_NOTIFICATION, xu.UNIQUE_STAGE, uniqueStage.getId(), getFollowSource());
                    return;
                }
                setState(jb.Active);
                Context context31 = getContext();
                context31.getClass();
                UniqueStage uniqueStage2 = (UniqueStage) followableItem;
                t6a.n(uniqueStage2.getId(), context31);
                Context context32 = getContext();
                context32.getClass();
                a31.d(context32, new lsb(26, this, uniqueStage2));
                Context context33 = getContext();
                context33.getClass();
                nv.y(context33, vu.ADD_NOTIFICATION, xu.UNIQUE_STAGE, uniqueStage2.getId(), getFollowSource());
                return;
            }
            return;
        }
        qhd qhdVar = (qhd) followableItem;
        List list = qhdVar.b;
        Stage stage2 = qhdVar.a;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((Stage) it.next()).getTypeList().isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (CollectionsKt.R(l5i.a(), ((Stage) obj).getType())) {
                            arrayList.add(obj);
                        }
                    }
                    Context context34 = getContext();
                    context34.getClass();
                    stage2.getClass();
                    Context baseContext = context34 instanceof ContextThemeWrapper ? ((ContextThemeWrapper) context34).getBaseContext() : context34;
                    AppCompatActivity appCompatActivity = baseContext instanceof AppCompatActivity ? (AppCompatActivity) baseContext : null;
                    if (appCompatActivity == null) {
                        return;
                    }
                    FollowSubStagesDialog followSubStagesDialog = new FollowSubStagesDialog();
                    x62 D = fz8.D(stage2.getId(), "STAGE_ID");
                    x62 G = fz8.G("UNIQUE_STAGE_ID", stage2.getUniqueStageId());
                    x62 H = fz8.H("STAGE_NAME", cga.A(stage2, context34, false));
                    joa joaVar = l5i.a;
                    x62 D2 = fz8.D(l5i.i(stage2) ? R.string.motorsport_follow_stages : l5i.f(stage2) ? R.string.cycling_follow_stages : R.string.motorsport_follow_sessions, "DIALOG_INFO");
                    ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Stage stage3 = (Stage) it2.next();
                        arrayList2.add(new FollowSubStagesViewModel.SubStageInfo(stage3.getId(), cga.A(stage3, context34, false), stage3.getTypeList()));
                    }
                    followSubStagesDialog.setArguments(fz8.C(D, G, H, D2, fz8.I("SUB_STAGES", arrayList2)));
                    followSubStagesDialog.p(appCompatActivity.k(), "FollowSubStagesDialog");
                    return;
                }
            }
        }
        setState(jb.Active);
        Context context35 = getContext();
        context35.getClass();
        t6a.m(context35, stage2);
        Context context36 = getContext();
        context36.getClass();
        nv.y(context36, vu.ADD_NOTIFICATION, xu.STAGE, stage2.getId(), getFollowSource());
        Context context37 = getContext();
        context37.getClass();
        a31.d(context37, new Function1(this) { // from class: phd
            public final /* synthetic */ NotificationsActionButton b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i42 = i;
                NotificationsActionButton notificationsActionButton = this.b;
                ((Boolean) obj2).getClass();
                int i52 = NotificationsActionButton.g;
                switch (i42) {
                    case 0:
                        Context context42 = notificationsActionButton.getContext();
                        context42.getClass();
                        if (f6a.F(context42)) {
                            Context context52 = notificationsActionButton.getContext();
                            context52.getClass();
                            zic.q(context52);
                        }
                        break;
                    case 1:
                        Context context62 = notificationsActionButton.getContext();
                        context62.getClass();
                        if (f6a.F(context62)) {
                            Context context72 = notificationsActionButton.getContext();
                            context72.getClass();
                            zic.q(context72);
                        }
                        break;
                    default:
                        Context context82 = notificationsActionButton.getContext();
                        context82.getClass();
                        if (f6a.G(context82)) {
                            Context context92 = notificationsActionButton.getContext();
                            context92.getClass();
                            zic.W(context92);
                        }
                        break;
                }
                return Unit.a;
            }
        });
    }

    public final void f(FavoritesEventsData favoritesEventsData) {
        jb jbVar;
        Object followableItem = getFollowableItem();
        if (followableItem instanceof Event) {
            if (favoritesEventsData != null) {
                favoritesEventsData.populateEventType((Event) followableItem);
            }
            Event event = (Event) followableItem;
            HashSet<EventType> typeListNotifications = event.getTypeListNotifications();
            if (typeListNotifications == null || typeListNotifications.isEmpty()) {
                jbVar = jb.Inactive;
            } else {
                HashSet<EventType> typeListNotifications2 = event.getTypeListNotifications();
                jbVar = (typeListNotifications2 == null || !typeListNotifications2.contains(EventType.MUTED)) ? jb.Active : jb.Inactive;
            }
        } else {
            jbVar = followableItem instanceof Team ? (favoritesEventsData == null || !favoritesEventsData.isTeamFavorite(Integer.valueOf(((Team) followableItem).getId()), true)) ? jb.Inactive : jb.Active : followableItem instanceof z21 ? (favoritesEventsData == null || !favoritesEventsData.hasLeagueFavoriteNotification(Integer.valueOf(((z21) followableItem).a))) ? jb.Inactive : jb.Active : jb.Inactive;
        }
        setState(jbVar);
    }

    public final void g(List list) {
        list.getClass();
        Object followableItem = getFollowableItem();
        setState(followableItem instanceof Player ? list.contains(Integer.valueOf(((Player) followableItem).getId())) ? jb.Active : jb.Inactive : jb.Inactive);
    }

    @Override // defpackage.a31
    @NotNull
    public wu getFollowSource() {
        return this.followSource;
    }

    public final void h(FavoritesStagesData favoritesStagesData) {
        jb jbVar;
        Object followableItem = getFollowableItem();
        if (followableItem instanceof Stage) {
            if (favoritesStagesData != null) {
                favoritesStagesData.populateEventType((Stage) followableItem);
            }
            Stage stage = (Stage) followableItem;
            jbVar = stage.getTypeList().isEmpty() ? jb.Inactive : stage.getTypeList().contains(StageType.MUTED) ? jb.Muted : jb.Active;
        } else if (followableItem instanceof qhd) {
            if (favoritesStagesData != null) {
                favoritesStagesData.populateEventType(((qhd) followableItem).a);
            }
            if (favoritesStagesData != null) {
                favoritesStagesData.areStagesFavorite(((qhd) followableItem).b);
            }
            List list = ((qhd) followableItem).b;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((Stage) it.next()).getTypeList().contains(StageType.MUTED)) {
                        if (list == null || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (!((Stage) it2.next()).getTypeList().isEmpty()) {
                                    jbVar = jb.Active;
                                    break;
                                }
                            }
                        }
                        jbVar = jb.Inactive;
                    }
                }
            }
            jbVar = jb.Muted;
        } else {
            jbVar = followableItem instanceof UniqueStage ? (favoritesStagesData == null || !favoritesStagesData.isUniqueStageFavorite(((UniqueStage) followableItem).getId())) ? jb.Inactive : jb.Active : jb.Inactive;
        }
        setState(jbVar);
    }

    public final void i(Object obj, FavoritesEventsData favoritesEventsData, boolean z) {
        z21 z21Var;
        this.e = z;
        if (!(obj instanceof Event)) {
            if (obj instanceof Team) {
                PlayerTeamInfo playerTeamInfo = ((Team) obj).getPlayerTeamInfo();
                if (playerTeamInfo != null ? Intrinsics.c(playerTeamInfo.getDeceased(), Boolean.TRUE) : false) {
                    setVisibility(8);
                    setClickable(true);
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
    public void setState(@NotNull jb jbVar) {
        jbVar.getClass();
        this.state = jbVar;
        e();
    }

    @Override // defpackage.a31
    @NotNull
    public jb getState() {
        return this.state;
    }
}
