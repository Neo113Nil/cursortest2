package bet.prediction.response.game;

import bet.prediction.response.game.InfoGameApi;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import io.sentry.config.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import r4.k;
import v3.b;
import w3.c;
import w3.d;
import w3.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003:\u0005./012B)\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010#R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010'R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001b¨\u00063"}, d2 = {"Lbet/prediction/response/game/InfoGameApi;", "Lw3/e;", "Lio/sentry/config/a;", "", "Lbet/prediction/response/game/InfoGameApi$Match;", "match", "Lbet/prediction/response/game/InfoGameApi$Offer;", "offer", "Lv3/b;", "httpException", "<init>", "(Lbet/prediction/response/game/InfoGameApi$Match;Lbet/prediction/response/game/InfoGameApi$Offer;Lv3/b;)V", "map", "()Lw3/e;", "component1", "()Lbet/prediction/response/game/InfoGameApi$Match;", "component2", "()Lbet/prediction/response/game/InfoGameApi$Offer;", "component3", "()Lv3/b;", "copy", "(Lbet/prediction/response/game/InfoGameApi$Match;Lbet/prediction/response/game/InfoGameApi$Offer;Lv3/b;)Lbet/prediction/response/game/InfoGameApi;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbet/prediction/response/game/InfoGameApi$Match;", "getMatch", "setMatch", "(Lbet/prediction/response/game/InfoGameApi$Match;)V", "Lbet/prediction/response/game/InfoGameApi$Offer;", "getOffer", "setOffer", "(Lbet/prediction/response/game/InfoGameApi$Offer;)V", "Lv3/b;", "getHttpException", "setHttpException", "(Lv3/b;)V", "getStatusCode", "statusCode", "Match", "Offer", "SportType", "League", "Team", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InfoGameApi extends a implements e {

    @Nullable
    private b httpException;

    @o9.b("match")
    @Nullable
    private Match match;

    @o9.b("offer")
    @Nullable
    private Offer offer;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lbet/prediction/response/game/InfoGameApi$League;", "Lw3/a;", "", "id", "", "name", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lbet/prediction/response/game/InfoGameApi$League;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class League implements w3.a {

        @o9.b("id")
        private final int id;

        @o9.b("name")
        @NotNull
        private final String name;

        public League(int i5, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = i5;
            this.name = name;
        }

        public static /* synthetic */ League copy$default(League league, int i5, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i5 = league.id;
            }
            if ((i10 & 2) != 0) {
                str = league.name;
            }
            return league.copy(i5, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final League copy(int id2, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new League(id2, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof League)) {
                return false;
            }
            League league = (League) other;
            return this.id == league.id && Intrinsics.areEqual(this.name, league.name);
        }

        public int getId() {
            return this.id;
        }

        @NotNull
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.id * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("League(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            return d9.e.k(sb2, this.name, ')');
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012Jp\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010+R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010/R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u00103R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u00107R$\u0010\n\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u00104\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u00107R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\u001b\"\u0004\b<\u0010=R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b>\u0010\u0014R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010(\u001a\u0004\b?\u0010\u0012\"\u0004\b@\u0010+¨\u0006A"}, d2 = {"Lbet/prediction/response/game/InfoGameApi$Match;", "Lw3/b;", "", "id", "", PredictionTable.startTimeColumn, "Lbet/prediction/response/game/InfoGameApi$SportType;", "sportType", "Lbet/prediction/response/game/InfoGameApi$Team;", "homeTeam", "guestTeam", "Lbet/prediction/response/game/InfoGameApi$League;", PredictionTable.leagueColumn, PredictionTable.statusColumn, "statusGame", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lbet/prediction/response/game/InfoGameApi$SportType;Lbet/prediction/response/game/InfoGameApi$Team;Lbet/prediction/response/game/InfoGameApi$Team;Lbet/prediction/response/game/InfoGameApi$League;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "()Lbet/prediction/response/game/InfoGameApi$SportType;", "component4", "()Lbet/prediction/response/game/InfoGameApi$Team;", "component5", "component6", "()Lbet/prediction/response/game/InfoGameApi$League;", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lbet/prediction/response/game/InfoGameApi$SportType;Lbet/prediction/response/game/InfoGameApi$Team;Lbet/prediction/response/game/InfoGameApi$Team;Lbet/prediction/response/game/InfoGameApi$League;Ljava/lang/String;Ljava/lang/Integer;)Lbet/prediction/response/game/InfoGameApi$Match;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getStartTime", "setStartTime", "(Ljava/lang/String;)V", "Lbet/prediction/response/game/InfoGameApi$SportType;", "getSportType", "setSportType", "(Lbet/prediction/response/game/InfoGameApi$SportType;)V", "Lbet/prediction/response/game/InfoGameApi$Team;", "getHomeTeam", "setHomeTeam", "(Lbet/prediction/response/game/InfoGameApi$Team;)V", "getGuestTeam", "setGuestTeam", "Lbet/prediction/response/game/InfoGameApi$League;", "getLeague", "setLeague", "(Lbet/prediction/response/game/InfoGameApi$League;)V", "getStatus", "getStatusGame", "setStatusGame", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Match implements w3.b {

        @o9.b("team2")
        @Nullable
        private Team guestTeam;

        @o9.b("team1")
        @Nullable
        private Team homeTeam;

        @o9.b("id")
        @Nullable
        private Integer id;

        @o9.b(PredictionTable.leagueColumn)
        @Nullable
        private League league;

        @o9.b("sport_type")
        @Nullable
        private SportType sportType;

        @o9.b("start_time")
        @Nullable
        private String startTime;

        @o9.b(PredictionTable.statusColumn)
        @Nullable
        private final String status;

        @Nullable
        private Integer statusGame;

        public Match(@Nullable Integer num, @Nullable String str, @Nullable SportType sportType, @Nullable Team team, @Nullable Team team2, @Nullable League league, @Nullable String str2, @Nullable Integer num2) {
            this.id = num;
            this.startTime = str;
            this.sportType = sportType;
            this.homeTeam = team;
            this.guestTeam = team2;
            this.league = league;
            this.status = str2;
            this.statusGame = num2;
        }

        public static /* synthetic */ Match copy$default(Match match, Integer num, String str, SportType sportType, Team team, Team team2, League league, String str2, Integer num2, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                num = match.id;
            }
            if ((i5 & 2) != 0) {
                str = match.startTime;
            }
            if ((i5 & 4) != 0) {
                sportType = match.sportType;
            }
            if ((i5 & 8) != 0) {
                team = match.homeTeam;
            }
            if ((i5 & 16) != 0) {
                team2 = match.guestTeam;
            }
            if ((i5 & 32) != 0) {
                league = match.league;
            }
            if ((i5 & 64) != 0) {
                str2 = match.status;
            }
            if ((i5 & 128) != 0) {
                num2 = match.statusGame;
            }
            String str3 = str2;
            Integer num3 = num2;
            Team team3 = team2;
            League league2 = league;
            return match.copy(num, str, sportType, team, team3, league2, str3, num3);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getStartTime() {
            return this.startTime;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final SportType getSportType() {
            return this.sportType;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Team getHomeTeam() {
            return this.homeTeam;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Team getGuestTeam() {
            return this.guestTeam;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final League getLeague() {
            return this.league;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final Integer getStatusGame() {
            return this.statusGame;
        }

        @NotNull
        public final Match copy(@Nullable Integer id2, @Nullable String startTime, @Nullable SportType sportType, @Nullable Team homeTeam, @Nullable Team guestTeam, @Nullable League league, @Nullable String status, @Nullable Integer statusGame) {
            return new Match(id2, startTime, sportType, homeTeam, guestTeam, league, status, statusGame);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Match)) {
                return false;
            }
            Match match = (Match) other;
            return Intrinsics.areEqual(this.id, match.id) && Intrinsics.areEqual(this.startTime, match.startTime) && Intrinsics.areEqual(this.sportType, match.sportType) && Intrinsics.areEqual(this.homeTeam, match.homeTeam) && Intrinsics.areEqual(this.guestTeam, match.guestTeam) && Intrinsics.areEqual(this.league, match.league) && Intrinsics.areEqual(this.status, match.status) && Intrinsics.areEqual(this.statusGame, match.statusGame);
        }

        @Nullable
        public Integer getId() {
            return this.id;
        }

        @Nullable
        public String getStartTime() {
            return this.startTime;
        }

        @Nullable
        public final String getStatus() {
            return this.status;
        }

        @Nullable
        public Integer getStatusGame() {
            return this.statusGame;
        }

        public int hashCode() {
            Integer num = this.id;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.startTime;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            SportType sportType = this.sportType;
            int hashCode3 = (hashCode2 + (sportType == null ? 0 : sportType.hashCode())) * 31;
            Team team = this.homeTeam;
            int hashCode4 = (hashCode3 + (team == null ? 0 : team.hashCode())) * 31;
            Team team2 = this.guestTeam;
            int hashCode5 = (hashCode4 + (team2 == null ? 0 : team2.hashCode())) * 31;
            League league = this.league;
            int hashCode6 = (hashCode5 + (league == null ? 0 : league.hashCode())) * 31;
            String str2 = this.status;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.statusGame;
            return hashCode7 + (num2 != null ? num2.hashCode() : 0);
        }

        public void setGuestTeam(@Nullable Team team) {
            this.guestTeam = team;
        }

        public void setHomeTeam(@Nullable Team team) {
            this.homeTeam = team;
        }

        public void setId(@Nullable Integer num) {
            this.id = num;
        }

        public void setLeague(@Nullable League league) {
            this.league = league;
        }

        public void setSportType(@Nullable SportType sportType) {
            this.sportType = sportType;
        }

        public void setStartTime(@Nullable String str) {
            this.startTime = str;
        }

        public void setStatusGame(@Nullable Integer num) {
            this.statusGame = num;
        }

        @NotNull
        public String toString() {
            return "Match(id=" + this.id + ", startTime=" + this.startTime + ", sportType=" + this.sportType + ", homeTeam=" + this.homeTeam + ", guestTeam=" + this.guestTeam + ", league=" + this.league + ", status=" + this.status + ", statusGame=" + this.statusGame + ')';
        }

        @Nullable
        public Team getGuestTeam() {
            return this.guestTeam;
        }

        @Nullable
        public Team getHomeTeam() {
            return this.homeTeam;
        }

        @Nullable
        /* renamed from: getLeague, reason: merged with bridge method [inline-methods] */
        public League m78getLeague() {
            return this.league;
        }

        @Nullable
        /* renamed from: getSportType, reason: merged with bridge method [inline-methods] */
        public SportType m79getSportType() {
            return this.sportType;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Match(Integer num, String str, SportType sportType, Team team, Team team2, League league, String str2, Integer num2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, sportType, team, team2, league, str2, r9);
            Integer num3;
            if ((i5 & 128) != 0) {
                num3 = str2 != null ? StringsKt.toIntOrNull(str2) : null;
            } else {
                num3 = num2;
            }
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lbet/prediction/response/game/InfoGameApi$Offer;", "Lw3/c;", "", "typeOffer", "", "dataOffer", "<init>", "(ILjava/lang/Object;)V", "component1", "()I", "component2", "()Ljava/lang/Object;", "copy", "(ILjava/lang/Object;)Lbet/prediction/response/game/InfoGameApi$Offer;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTypeOffer", "Ljava/lang/Object;", "getDataOffer", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Offer implements c {

        @o9.b("data")
        @Nullable
        private final Object dataOffer;

        @o9.b("type")
        private final int typeOffer;

        public Offer(int i5, @Nullable Object obj) {
            this.typeOffer = i5;
            this.dataOffer = obj;
        }

        public static /* synthetic */ Offer copy$default(Offer offer, int i5, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                i5 = offer.typeOffer;
            }
            if ((i10 & 2) != 0) {
                obj = offer.dataOffer;
            }
            return offer.copy(i5, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTypeOffer() {
            return this.typeOffer;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Object getDataOffer() {
            return this.dataOffer;
        }

        @NotNull
        public final Offer copy(int typeOffer, @Nullable Object dataOffer) {
            return new Offer(typeOffer, dataOffer);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Offer)) {
                return false;
            }
            Offer offer = (Offer) other;
            return this.typeOffer == offer.typeOffer && Intrinsics.areEqual(this.dataOffer, offer.dataOffer);
        }

        @Nullable
        public Object getDataOffer() {
            return this.dataOffer;
        }

        public int getTypeOffer() {
            return this.typeOffer;
        }

        public int hashCode() {
            int i5 = this.typeOffer * 31;
            Object obj = this.dataOffer;
            return i5 + (obj == null ? 0 : obj.hashCode());
        }

        @NotNull
        public String toString() {
            return "Offer(typeOffer=" + this.typeOffer + ", dataOffer=" + this.dataOffer + ')';
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lbet/prediction/response/game/InfoGameApi$SportType;", "Lw3/d;", "", "id", "", "name", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lbet/prediction/response/game/InfoGameApi$SportType;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SportType implements d {

        @o9.b("id")
        private final int id;

        @o9.b("name")
        @NotNull
        private final String name;

        public SportType(int i5, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = i5;
            this.name = name;
        }

        public static /* synthetic */ SportType copy$default(SportType sportType, int i5, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i5 = sportType.id;
            }
            if ((i10 & 2) != 0) {
                str = sportType.name;
            }
            return sportType.copy(i5, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final SportType copy(int id2, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new SportType(id2, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SportType)) {
                return false;
            }
            SportType sportType = (SportType) other;
            return this.id == sportType.id && Intrinsics.areEqual(this.name, sportType.name);
        }

        public int getId() {
            return this.id;
        }

        @NotNull
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.id * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SportType(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            return d9.e.k(sb2, this.name, ')');
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JH\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Lbet/prediction/response/game/InfoGameApi$Team;", "La4/e;", "", "score", "scoreExtra", "id", "", "name", "flag", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()I", "component4", "()Ljava/lang/String;", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)Lbet/prediction/response/game/InfoGameApi$Team;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getScore", "getScoreExtra", "I", "getId", "Ljava/lang/String;", "getName", "getFlag", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Team implements a4.e {

        @o9.b("href")
        @Nullable
        private final String flag;

        @o9.b("id")
        private final int id;

        @o9.b("name")
        @NotNull
        private final String name;

        @o9.b("score")
        @Nullable
        private final Integer score;

        @o9.b("additional_score")
        @Nullable
        private final Integer scoreExtra;

        public Team(@Nullable Integer num, @Nullable Integer num2, int i5, @NotNull String name, @Nullable String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.score = num;
            this.scoreExtra = num2;
            this.id = i5;
            this.name = name;
            this.flag = str;
        }

        public static /* synthetic */ Team copy$default(Team team, Integer num, Integer num2, int i5, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = team.score;
            }
            if ((i10 & 2) != 0) {
                num2 = team.scoreExtra;
            }
            if ((i10 & 4) != 0) {
                i5 = team.id;
            }
            if ((i10 & 8) != 0) {
                str = team.name;
            }
            if ((i10 & 16) != 0) {
                str2 = team.flag;
            }
            String str3 = str2;
            int i11 = i5;
            return team.copy(num, num2, i11, str, str3);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Integer getScore() {
            return this.score;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getScoreExtra() {
            return this.scoreExtra;
        }

        /* renamed from: component3, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getFlag() {
            return this.flag;
        }

        @NotNull
        public final Team copy(@Nullable Integer score, @Nullable Integer scoreExtra, int id2, @NotNull String name, @Nullable String flag) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Team(score, scoreExtra, id2, name, flag);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Team)) {
                return false;
            }
            Team team = (Team) other;
            return Intrinsics.areEqual(this.score, team.score) && Intrinsics.areEqual(this.scoreExtra, team.scoreExtra) && this.id == team.id && Intrinsics.areEqual(this.name, team.name) && Intrinsics.areEqual(this.flag, team.flag);
        }

        @Override // a4.e
        @Nullable
        public String getFlag() {
            return this.flag;
        }

        @Override // a4.e
        public int getId() {
            return this.id;
        }

        @Override // a4.e
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // a4.e
        @Nullable
        public Integer getScore() {
            return this.score;
        }

        @Override // a4.e
        @Nullable
        public Integer getScoreExtra() {
            return this.scoreExtra;
        }

        public int hashCode() {
            Integer num = this.score;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.scoreExtra;
            int j = k.j((((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.id) * 31, 31, this.name);
            String str = this.flag;
            return j + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Team(score=");
            sb2.append(this.score);
            sb2.append(", scoreExtra=");
            sb2.append(this.scoreExtra);
            sb2.append(", id=");
            sb2.append(this.id);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", flag=");
            return d9.e.k(sb2, this.flag, ')');
        }
    }

    public InfoGameApi(@Nullable Match match, @Nullable Offer offer, @Nullable b bVar) {
        this.match = match;
        this.offer = offer;
        this.httpException = bVar;
    }

    public static /* synthetic */ InfoGameApi copy$default(InfoGameApi infoGameApi, Match match, Offer offer, b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            match = infoGameApi.match;
        }
        if ((i5 & 2) != 0) {
            offer = infoGameApi.offer;
        }
        if ((i5 & 4) != 0) {
            bVar = infoGameApi.httpException;
        }
        return infoGameApi.copy(match, offer, bVar);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Match getMatch() {
        return this.match;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Offer getOffer() {
        return this.offer;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final InfoGameApi copy(@Nullable Match match, @Nullable Offer offer, @Nullable b httpException) {
        return new InfoGameApi(match, offer, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoGameApi)) {
            return false;
        }
        InfoGameApi infoGameApi = (InfoGameApi) other;
        return Intrinsics.areEqual(this.match, infoGameApi.match) && Intrinsics.areEqual(this.offer, infoGameApi.offer) && Intrinsics.areEqual(this.httpException, infoGameApi.httpException);
    }

    @Override // v3.e
    @Nullable
    public b getHttpException() {
        return this.httpException;
    }

    @Override // v3.e
    public int getStatusCode() {
        s0 response;
        b httpException = getHttpException();
        if (httpException == null || (response = httpException.getResponse()) == null) {
            return 200;
        }
        return response.f21334a.f10276d;
    }

    public int hashCode() {
        Match match = this.match;
        int hashCode = (match == null ? 0 : match.hashCode()) * 31;
        Offer offer = this.offer;
        int hashCode2 = (hashCode + (offer == null ? 0 : offer.hashCode())) * 31;
        b bVar = this.httpException;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public void setHttpException(@Nullable b bVar) {
        this.httpException = bVar;
    }

    public void setMatch(@Nullable Match match) {
        this.match = match;
    }

    public void setOffer(@Nullable Offer offer) {
        this.offer = offer;
    }

    @NotNull
    public String toString() {
        return "InfoGameApi(match=" + this.match + ", offer=" + this.offer + ", httpException=" + this.httpException + ')';
    }

    @Nullable
    /* renamed from: getMatch, reason: merged with bridge method [inline-methods] */
    public Match m73getMatch() {
        return this.match;
    }

    @Nullable
    /* renamed from: getOffer, reason: merged with bridge method [inline-methods] */
    public Offer m74getOffer() {
        return this.offer;
    }

    @NotNull
    public e map() {
        return new e(this) { // from class: bet.prediction.response.game.InfoGameApi$map$1
            private final b httpException;
            private final w3.b match;
            private final c offer;
            private final int statusCode;

            {
                InfoGameApi.Offer m74getOffer;
                Object dataOffer;
                InfoGameApi.Offer offer;
                this.match = this.m73getMatch();
                InfoGameApi.Offer m74getOffer2 = this.m74getOffer();
                InfoGameApi.Offer offer2 = null;
                Integer valueOf = m74getOffer2 != null ? Integer.valueOf(m74getOffer2.getTypeOffer()) : null;
                if (valueOf != null && valueOf.intValue() == 1) {
                    InfoGameApi.Offer m74getOffer3 = this.m74getOffer();
                    Object dataOffer2 = m74getOffer3 != null ? m74getOffer3.getDataOffer() : null;
                    String str = dataOffer2 instanceof String ? (String) dataOffer2 : null;
                    if (str != null) {
                        offer2 = new InfoGameApi.Offer(valueOf.intValue(), str);
                    }
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    InfoGameApi.Offer m74getOffer4 = this.m74getOffer();
                    Object dataOffer3 = m74getOffer4 != null ? m74getOffer4.getDataOffer() : null;
                    Integer num = dataOffer3 instanceof Integer ? (Integer) dataOffer3 : null;
                    if (num != null) {
                        offer = new InfoGameApi.Offer(valueOf.intValue(), Integer.valueOf(num.intValue()));
                        offer2 = offer;
                    }
                } else if (valueOf != null && valueOf.intValue() == 3 && (m74getOffer = this.m74getOffer()) != null && (dataOffer = m74getOffer.getDataOffer()) != null) {
                    offer = new InfoGameApi.Offer(valueOf.intValue(), new JSONObject(dataOffer.toString()));
                    offer2 = offer;
                }
                this.offer = offer2;
                this.statusCode = this.getStatusCode();
                this.httpException = this.getHttpException();
            }

            @Override // v3.e
            public b getHttpException() {
                return this.httpException;
            }

            public w3.b getMatch() {
                return this.match;
            }

            public c getOffer() {
                return this.offer;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }
        };
    }

    public /* synthetic */ InfoGameApi(Match match, Offer offer, b bVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : match, (i5 & 2) != 0 ? null : offer, bVar);
    }
}
