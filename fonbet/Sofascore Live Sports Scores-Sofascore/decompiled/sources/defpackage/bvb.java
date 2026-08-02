package defpackage;

import android.content.SharedPreferences;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.database.DbMediaReaction;
import com.sofascore.model.database.DbMmaOrganizationViewCount;
import com.sofascore.model.database.DbPendingNotification;
import com.sofascore.model.database.DbPlayerOfTheMatchVote;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.util.MarketValueUserVote;
import com.sofascore.model.util.MarketValueVoteType;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bvb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ bvb(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MarketValueVoteType marketValueVoteType;
        MediaReactionType mediaReactionType;
        int i = this.a;
        r11 = false;
        boolean z = false;
        int i2 = this.b;
        switch (i) {
            case 0:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("SELECT * FROM market_value_user_votes_table WHERE playerId = ?");
                try {
                    V0.q(1, i2);
                    int r = w1a.r(V0, "playerId");
                    int r2 = w1a.r(V0, "playerValue");
                    int r3 = w1a.r(V0, InAppPurchaseMetaData.KEY_CURRENCY);
                    int r4 = w1a.r(V0, "voteType");
                    if (V0.U0()) {
                        int i3 = (int) V0.getLong(r);
                        long j = V0.getLong(r2);
                        String F0 = V0.F0(r3);
                        String F02 = V0.F0(r4);
                        if (Intrinsics.c(F02, "UP")) {
                            marketValueVoteType = MarketValueVoteType.UP;
                        } else {
                            if (!Intrinsics.c(F02, "DOWN")) {
                                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + F02);
                            }
                            marketValueVoteType = MarketValueVoteType.DOWN;
                        }
                        r10 = new MarketValueUserVote(i3, j, F0, marketValueVoteType);
                    }
                    return r10;
                } finally {
                }
            case 1:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                nlg V02 = glgVar2.V0("SELECT * FROM media_reaction_table WHERE mediaPostId = ?");
                try {
                    V02.q(1, i2);
                    int r5 = w1a.r(V02, "mediaPostId");
                    int r6 = w1a.r(V02, "reaction");
                    int r7 = w1a.r(V02, "timestamp");
                    int r8 = w1a.r(V02, "shareCount");
                    if (V02.U0()) {
                        int i4 = (int) V02.getLong(r5);
                        if (!V02.isNull(r6)) {
                            String F03 = V02.F0(r6);
                            if (Intrinsics.c(F03, "THUMBS_UP")) {
                                mediaReactionType = MediaReactionType.THUMBS_UP;
                            } else {
                                if (!Intrinsics.c(F03, "REMOVE_THUMBS_UP")) {
                                    throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + F03);
                                }
                                mediaReactionType = MediaReactionType.REMOVE_THUMBS_UP;
                            }
                            r10 = mediaReactionType;
                        }
                        r10 = new DbMediaReaction(i4, r10, V02.getLong(r7), (int) V02.getLong(r8));
                    }
                    return r10;
                } finally {
                }
            case 2:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                nlg V03 = glgVar3.V0("UPDATE mma_organization_view_table SET ignored = 1 WHERE id=?");
                try {
                    V03.q(1, i2);
                    V03.U0();
                    V03.close();
                    return Unit.a;
                } finally {
                }
            case 3:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                nlg V04 = glgVar4.V0("SELECT * FROM mma_organization_view_table WHERE id=?");
                try {
                    V04.q(1, i2);
                    int r9 = w1a.r(V04, "id");
                    int r10 = w1a.r(V04, "viewCount");
                    int r11 = w1a.r(V04, "ignored");
                    if (V04.U0()) {
                        r10 = new DbMmaOrganizationViewCount((int) V04.getLong(r9), (int) V04.getLong(r10), ((int) V04.getLong(r11)) != 0);
                    }
                    return r10;
                } finally {
                }
            case 4:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                nlg V05 = glgVar5.V0("DELETE FROM nats_event_table WHERE id = ?");
                try {
                    V05.q(1, i2);
                    V05.U0();
                    V05.close();
                    return Unit.a;
                } finally {
                }
            case 5:
                if (((obj instanceof Event) && ((Event) obj).getId() == i2) || ((obj instanceof y21) && ((y21) obj).d().getId() == i2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                return Integer.valueOf(((Integer) obj).intValue() * i2);
            case 7:
                return Integer.valueOf((-i2) * ((Integer) obj).intValue());
            case 8:
                return Integer.valueOf((-i2) * ((Integer) obj).intValue());
            case 9:
                return Integer.valueOf(((Integer) obj).intValue() * i2);
            case 10:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                nlg V06 = glgVar6.V0("DELETE FROM pending_notifications WHERE notificationId = ?");
                try {
                    V06.q(1, i2);
                    V06.U0();
                    int y = u0a.y(glgVar6);
                    V06.close();
                    return Integer.valueOf(y);
                } finally {
                }
            case 11:
                glg glgVar7 = (glg) obj;
                glgVar7.getClass();
                nlg V07 = glgVar7.V0("SELECT * FROM pending_notifications WHERE notificationId = ?");
                try {
                    V07.q(1, i2);
                    int r12 = w1a.r(V07, "id");
                    int r13 = w1a.r(V07, "notificationId");
                    int r14 = w1a.r(V07, "title");
                    int r15 = w1a.r(V07, PglCryptUtils.KEY_MESSAGE);
                    int r16 = w1a.r(V07, "updatableNotificationId");
                    ArrayList arrayList = new ArrayList();
                    while (V07.U0()) {
                        arrayList.add(new DbPendingNotification((int) V07.getLong(r12), (int) V07.getLong(r13), V07.F0(r14), V07.F0(r15), V07.isNull(r16) ? null : V07.F0(r16)));
                    }
                    return arrayList;
                } finally {
                }
            case 12:
                glg glgVar8 = (glg) obj;
                glgVar8.getClass();
                nlg V08 = glgVar8.V0("SELECT COUNT(*) FROM players WHERE id = ?");
                try {
                    V08.q(1, i2);
                    int i5 = V08.U0() ? (int) V08.getLong(0) : 0;
                    V08.close();
                    return Integer.valueOf(i5);
                } finally {
                }
            case 13:
                glg glgVar9 = (glg) obj;
                glgVar9.getClass();
                nlg V09 = glgVar9.V0("DELETE FROM players WHERE id = ?");
                try {
                    V09.q(1, i2);
                    V09.U0();
                    int y2 = u0a.y(glgVar9);
                    V09.close();
                    return Integer.valueOf(y2);
                } finally {
                }
            case 14:
                glg glgVar10 = (glg) obj;
                glgVar10.getClass();
                nlg V010 = glgVar10.V0("UPDATE my_players SET notificationsEnabled = 0 WHERE playerId = ?");
                try {
                    V010.q(1, i2);
                    V010.U0();
                    int y3 = u0a.y(glgVar10);
                    V010.close();
                    return Integer.valueOf(y3);
                } finally {
                }
            case 15:
                glg glgVar11 = (glg) obj;
                glgVar11.getClass();
                nlg V011 = glgVar11.V0("DELETE FROM my_players WHERE playerId = ?");
                try {
                    V011.q(1, i2);
                    V011.U0();
                    int y4 = u0a.y(glgVar11);
                    V011.close();
                    return Integer.valueOf(y4);
                } finally {
                }
            case 16:
                glg glgVar12 = (glg) obj;
                glgVar12.getClass();
                nlg V012 = glgVar12.V0("SELECT * FROM player_of_the_match_vote_table WHERE eventId = ?");
                try {
                    V012.q(1, i2);
                    return V012.U0() ? new DbPlayerOfTheMatchVote((int) V012.getLong(w1a.r(V012, "eventId")), (int) V012.getLong(w1a.r(V012, "playerId")), V012.getLong(w1a.r(V012, "eventTimestamp"))) : null;
                } finally {
                }
            case 17:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                return Boolean.valueOf(sharedPreferences.getBoolean("PREF_SURVEY_" + i2, false));
            case 18:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
                sharedPreferences2.getClass();
                return Boolean.valueOf(sharedPreferences2.getBoolean("survey_" + i2, false));
            case 19:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putBoolean("survey_" + i2, true);
                return Unit.a;
            case 20:
                SharedPreferences.Editor editor2 = (SharedPreferences.Editor) obj;
                editor2.getClass();
                editor2.putBoolean("PREF_SURVEY_" + i2, true);
                return Unit.a;
            case 21:
                glg glgVar13 = (glg) obj;
                glgVar13.getClass();
                nlg V013 = glgVar13.V0("SELECT COUNT(*) FROM my_teams WHERE teamId = ?");
                try {
                    V013.q(1, i2);
                    int i6 = V013.U0() ? (int) V013.getLong(0) : 0;
                    V013.close();
                    return Integer.valueOf(i6);
                } finally {
                }
            case 22:
                glg glgVar14 = (glg) obj;
                glgVar14.getClass();
                nlg V014 = glgVar14.V0("SELECT * FROM my_teams WHERE teamId = ?");
                try {
                    V014.q(1, i2);
                    int r17 = w1a.r(V014, "teamId");
                    int r18 = w1a.r(V014, "notificationsEnabled");
                    if (V014.U0()) {
                        r10 = new DbMyTeam((int) V014.getLong(r17), ((int) V014.getLong(r18)) != 0);
                    }
                    return r10;
                } finally {
                }
            case 23:
                glg glgVar15 = (glg) obj;
                glgVar15.getClass();
                nlg V015 = glgVar15.V0("DELETE FROM my_teams WHERE teamId = ?");
                try {
                    V015.q(1, i2);
                    V015.U0();
                    int y5 = u0a.y(glgVar15);
                    V015.close();
                    return Integer.valueOf(y5);
                } finally {
                }
            case 24:
                glg glgVar16 = (glg) obj;
                glgVar16.getClass();
                nlg V016 = glgVar16.V0("DELETE FROM teams WHERE id = ? AND NOT EXISTS(SELECT * FROM events_table WHERE homeTeamId = ? OR awayTeamId = ?)");
                long j2 = i2;
                try {
                    V016.q(1, j2);
                    V016.q(2, j2);
                    V016.q(3, j2);
                    V016.U0();
                    int y6 = u0a.y(glgVar16);
                    V016.close();
                    return Integer.valueOf(y6);
                } finally {
                }
            case 25:
                glg glgVar17 = (glg) obj;
                glgVar17.getClass();
                nlg V017 = glgVar17.V0("DELETE FROM events_table WHERE NOT EXISTS ( SELECT * FROM leagues, tournament WHERE tournament.id = events_table.tournamentId AND leagues.id = tournament.unique_tournament_id) AND ( ? = events_table.homeTeamId OR ? = events_table.awayTeamId OR ? = events_table.homeSubTeam1Id OR ? = events_table.awaySubTeam1Id OR ? = events_table.homeSubTeam2Id OR ? = events_table.awaySubTeam2Id ) AND NOT EXISTS ( SELECT * FROM my_teams WHERE ? <> my_teams.teamId AND (my_teams.teamId = events_table.homeTeamId OR my_teams.teamId = events_table.awayTeamId OR my_teams.teamId = events_table.homeSubTeam1Id OR my_teams.teamId = events_table.awaySubTeam1Id OR my_teams.teamId = events_table.homeSubTeam2Id OR my_teams.teamId = events_table.awaySubTeam2Id))");
                long j3 = i2;
                try {
                    V017.q(1, j3);
                    V017.q(2, j3);
                    V017.q(3, j3);
                    V017.q(4, j3);
                    V017.q(5, j3);
                    V017.q(6, j3);
                    V017.q(7, j3);
                    V017.U0();
                    V017.close();
                    return Unit.a;
                } finally {
                }
            case 26:
                glg glgVar18 = (glg) obj;
                glgVar18.getClass();
                nlg V018 = glgVar18.V0("UPDATE my_teams SET notificationsEnabled = 0 WHERE teamId = ?");
                try {
                    V018.q(1, i2);
                    V018.U0();
                    int y7 = u0a.y(glgVar18);
                    V018.close();
                    return Integer.valueOf(y7);
                } finally {
                }
            case 27:
                return Integer.valueOf(((Integer) obj).intValue() * i2);
            case 28:
                return Integer.valueOf(i2 * (-((Integer) obj).intValue()));
            default:
                return Integer.valueOf(((Integer) obj).intValue() * i2);
        }
    }

    public /* synthetic */ bvb(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
    }
}
