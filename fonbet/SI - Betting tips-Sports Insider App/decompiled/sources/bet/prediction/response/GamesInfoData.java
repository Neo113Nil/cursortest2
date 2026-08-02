package bet.prediction.response;

import a4.c;
import a4.d;
import a4.e;
import a4.f;
import bet.prediction.response.GamesInfoData;
import io.sentry.config.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o9.b;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003:\u0003,-.B5\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b'\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0016R\u0014\u0010+\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001e¨\u0006/"}, d2 = {"Lbet/prediction/response/GamesInfoData;", "La4/f;", "Lio/sentry/config/a;", "", "", "Lbet/prediction/response/GamesInfoData$Game;", "gamesData", "Lbet/prediction/response/GamesInfoData$LastGames;", "homeTeamData", "guestTeamData", "Lv3/b;", "httpException", "<init>", "(Ljava/util/List;Lbet/prediction/response/GamesInfoData$LastGames;Lbet/prediction/response/GamesInfoData$LastGames;Lv3/b;)V", "map", "()La4/f;", "component1", "()Ljava/util/List;", "component2", "()Lbet/prediction/response/GamesInfoData$LastGames;", "component3", "component4", "()Lv3/b;", "copy", "(Ljava/util/List;Lbet/prediction/response/GamesInfoData$LastGames;Lbet/prediction/response/GamesInfoData$LastGames;Lv3/b;)Lbet/prediction/response/GamesInfoData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getGamesData", "Lbet/prediction/response/GamesInfoData$LastGames;", "getHomeTeamData", "getGuestTeamData", "Lv3/b;", "getHttpException", "getStatusCode", "statusCode", "LastGames", "Game", "Team", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GamesInfoData extends a implements f {

    @b("f2f")
    @Nullable
    private final List<Game> gamesData;

    @b("team2")
    @Nullable
    private final LastGames guestTeamData;

    @b("team1")
    @Nullable
    private final LastGames homeTeamData;

    @Nullable
    private final v3.b httpException;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b(\u0010\u0013¨\u0006*"}, d2 = {"Lbet/prediction/response/GamesInfoData$Game;", "La4/c;", "Ljava/io/Serializable;", "", "id", "Lbet/prediction/response/GamesInfoData$Team;", "guestTeam", "homeTeam", "", "time", "leagueName", "<init>", "(ILbet/prediction/response/GamesInfoData$Team;Lbet/prediction/response/GamesInfoData$Team;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Lbet/prediction/response/GamesInfoData$Team;", "component3", "component4", "()Ljava/lang/String;", "component5", "copy", "(ILbet/prediction/response/GamesInfoData$Team;Lbet/prediction/response/GamesInfoData$Team;Ljava/lang/String;Ljava/lang/String;)Lbet/prediction/response/GamesInfoData$Game;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lbet/prediction/response/GamesInfoData$Team;", "getGuestTeam", "setGuestTeam", "(Lbet/prediction/response/GamesInfoData$Team;)V", "getHomeTeam", "setHomeTeam", "Ljava/lang/String;", "getTime", "getLeagueName", "Companion", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Game implements c, Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @b("team2")
        @NotNull
        private Team guestTeam;

        @b("team1")
        @NotNull
        private Team homeTeam;

        @b("id")
        private final int id;

        @b("league_name")
        @Nullable
        private final String leagueName;

        @b("start_time")
        @NotNull
        private final String time;

        /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbet/prediction/response/GamesInfoData$Game$Companion;", "", "<init>", "()V", "Lbet/prediction/response/GamesInfoData$Game;", "La4/c;", "mapper", "(Lbet/prediction/response/GamesInfoData$Game;)La4/c;", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final c mapper(@Nullable final Game game) {
                if (game == null) {
                    return null;
                }
                return new c(game) { // from class: bet.prediction.response.GamesInfoData$Game$Companion$mapper$1
                    private final e guestTeam;
                    private final e homeTeam;
                    private final String leagueName;
                    private final String time;

                    {
                        GamesInfoData.Team.Companion companion = GamesInfoData.Team.INSTANCE;
                        e mapper = companion.mapper(game.getGuestTeam());
                        Intrinsics.checkNotNull(mapper);
                        this.guestTeam = mapper;
                        e mapper2 = companion.mapper(game.getHomeTeam());
                        Intrinsics.checkNotNull(mapper2);
                        this.homeTeam = mapper2;
                        this.time = game.getTime();
                        this.leagueName = game.getLeagueName();
                    }

                    @Override // a4.c
                    public e getGuestTeam() {
                        return this.guestTeam;
                    }

                    @Override // a4.c
                    public e getHomeTeam() {
                        return this.homeTeam;
                    }

                    @Override // a4.c
                    public String getLeagueName() {
                        return this.leagueName;
                    }

                    @Override // a4.c
                    public String getTime() {
                        return this.time;
                    }
                };
            }

            private Companion() {
            }
        }

        public Game(int i5, @NotNull Team guestTeam, @NotNull Team homeTeam, @NotNull String time, @Nullable String str) {
            Intrinsics.checkNotNullParameter(guestTeam, "guestTeam");
            Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
            Intrinsics.checkNotNullParameter(time, "time");
            this.id = i5;
            this.guestTeam = guestTeam;
            this.homeTeam = homeTeam;
            this.time = time;
            this.leagueName = str;
        }

        public static /* synthetic */ Game copy$default(Game game, int i5, Team team, Team team2, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i5 = game.id;
            }
            if ((i10 & 2) != 0) {
                team = game.guestTeam;
            }
            if ((i10 & 4) != 0) {
                team2 = game.homeTeam;
            }
            if ((i10 & 8) != 0) {
                str = game.time;
            }
            if ((i10 & 16) != 0) {
                str2 = game.leagueName;
            }
            String str3 = str2;
            Team team3 = team2;
            return game.copy(i5, team, team3, str, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Team getGuestTeam() {
            return this.guestTeam;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Team getHomeTeam() {
            return this.homeTeam;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getTime() {
            return this.time;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getLeagueName() {
            return this.leagueName;
        }

        @NotNull
        public final Game copy(int id2, @NotNull Team guestTeam, @NotNull Team homeTeam, @NotNull String time, @Nullable String leagueName) {
            Intrinsics.checkNotNullParameter(guestTeam, "guestTeam");
            Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
            Intrinsics.checkNotNullParameter(time, "time");
            return new Game(id2, guestTeam, homeTeam, time, leagueName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Game)) {
                return false;
            }
            Game game = (Game) other;
            return this.id == game.id && Intrinsics.areEqual(this.guestTeam, game.guestTeam) && Intrinsics.areEqual(this.homeTeam, game.homeTeam) && Intrinsics.areEqual(this.time, game.time) && Intrinsics.areEqual(this.leagueName, game.leagueName);
        }

        public final int getId() {
            return this.id;
        }

        @Override // a4.c
        @Nullable
        public String getLeagueName() {
            return this.leagueName;
        }

        @Override // a4.c
        @NotNull
        public String getTime() {
            return this.time;
        }

        public int hashCode() {
            int j = k.j((this.homeTeam.hashCode() + ((this.guestTeam.hashCode() + (this.id * 31)) * 31)) * 31, 31, this.time);
            String str = this.leagueName;
            return j + (str == null ? 0 : str.hashCode());
        }

        public void setGuestTeam(@NotNull Team team) {
            Intrinsics.checkNotNullParameter(team, "<set-?>");
            this.guestTeam = team;
        }

        public void setHomeTeam(@NotNull Team team) {
            Intrinsics.checkNotNullParameter(team, "<set-?>");
            this.homeTeam = team;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Game(id=");
            sb2.append(this.id);
            sb2.append(", guestTeam=");
            sb2.append(this.guestTeam);
            sb2.append(", homeTeam=");
            sb2.append(this.homeTeam);
            sb2.append(", time=");
            sb2.append(this.time);
            sb2.append(", leagueName=");
            return d9.e.k(sb2, this.leagueName, ')');
        }

        @Override // a4.c
        @NotNull
        public Team getGuestTeam() {
            return this.guestTeam;
        }

        @Override // a4.c
        @NotNull
        public Team getHomeTeam() {
            return this.homeTeam;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ@\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b!\u0010\rR\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\"\u0010\r¨\u0006$"}, d2 = {"Lbet/prediction/response/GamesInfoData$LastGames;", "La4/d;", "Ljava/io/Serializable;", "", "draws", "", "Lbet/prediction/response/GamesInfoData$Game;", "games", "loses", "wins", "<init>", "(ILjava/util/List;II)V", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "component4", "copy", "(ILjava/util/List;II)Lbet/prediction/response/GamesInfoData$LastGames;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getDraws", "Ljava/util/List;", "getGames", "getLoses", "getWins", "Companion", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LastGames implements d, Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @b("draws")
        private final int draws;

        @b("games")
        @Nullable
        private final List<Game> games;

        @b("loses")
        private final int loses;

        @b("wins")
        private final int wins;

        /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbet/prediction/response/GamesInfoData$LastGames$Companion;", "", "<init>", "()V", "Lbet/prediction/response/GamesInfoData$LastGames;", "La4/d;", "mapper", "(Lbet/prediction/response/GamesInfoData$LastGames;)La4/d;", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final d mapper(@Nullable final LastGames lastGames) {
                if (lastGames == null) {
                    return null;
                }
                return new d(lastGames) { // from class: bet.prediction.response.GamesInfoData$LastGames$Companion$mapper$1
                    private final int draws;
                    private final List<c> games;
                    private final int loses;
                    private final int wins;

                    {
                        ArrayList arrayList;
                        this.draws = lastGames.getDraws();
                        List<GamesInfoData.Game> games = lastGames.getGames();
                        if (games != null) {
                            arrayList = new ArrayList();
                            Iterator<T> it = games.iterator();
                            while (it.hasNext()) {
                                c mapper = GamesInfoData.Game.INSTANCE.mapper((GamesInfoData.Game) it.next());
                                if (mapper != null) {
                                    arrayList.add(mapper);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        this.games = arrayList;
                        this.loses = lastGames.getLoses();
                        this.wins = lastGames.getWins();
                    }

                    @Override // a4.d
                    public int getDraws() {
                        return this.draws;
                    }

                    @Override // a4.d
                    public List<c> getGames() {
                        return this.games;
                    }

                    @Override // a4.d
                    public int getLoses() {
                        return this.loses;
                    }

                    @Override // a4.d
                    public int getWins() {
                        return this.wins;
                    }
                };
            }

            private Companion() {
            }
        }

        public LastGames(int i5, @Nullable List<Game> list, int i10, int i11) {
            this.draws = i5;
            this.games = list;
            this.loses = i10;
            this.wins = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LastGames copy$default(LastGames lastGames, int i5, List list, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i5 = lastGames.draws;
            }
            if ((i12 & 2) != 0) {
                list = lastGames.games;
            }
            if ((i12 & 4) != 0) {
                i10 = lastGames.loses;
            }
            if ((i12 & 8) != 0) {
                i11 = lastGames.wins;
            }
            return lastGames.copy(i5, list, i10, i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDraws() {
            return this.draws;
        }

        @Nullable
        public final List<Game> component2() {
            return this.games;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLoses() {
            return this.loses;
        }

        /* renamed from: component4, reason: from getter */
        public final int getWins() {
            return this.wins;
        }

        @NotNull
        public final LastGames copy(int draws, @Nullable List<Game> games, int loses, int wins) {
            return new LastGames(draws, games, loses, wins);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LastGames)) {
                return false;
            }
            LastGames lastGames = (LastGames) other;
            return this.draws == lastGames.draws && Intrinsics.areEqual(this.games, lastGames.games) && this.loses == lastGames.loses && this.wins == lastGames.wins;
        }

        @Override // a4.d
        public int getDraws() {
            return this.draws;
        }

        @Override // a4.d
        @Nullable
        public List<Game> getGames() {
            return this.games;
        }

        @Override // a4.d
        public int getLoses() {
            return this.loses;
        }

        @Override // a4.d
        public int getWins() {
            return this.wins;
        }

        public int hashCode() {
            int i5 = this.draws * 31;
            List<Game> list = this.games;
            return ((((i5 + (list == null ? 0 : list.hashCode())) * 31) + this.loses) * 31) + this.wins;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LastGames(draws=");
            sb2.append(this.draws);
            sb2.append(", games=");
            sb2.append(this.games);
            sb2.append(", loses=");
            sb2.append(this.loses);
            sb2.append(", wins=");
            return d9.e.i(sb2, this.wins, ')');
        }
    }

    public GamesInfoData(@Nullable List<Game> list, @Nullable LastGames lastGames, @Nullable LastGames lastGames2, @Nullable v3.b bVar) {
        this.gamesData = list;
        this.homeTeamData = lastGames;
        this.guestTeamData = lastGames2;
        this.httpException = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GamesInfoData copy$default(GamesInfoData gamesInfoData, List list, LastGames lastGames, LastGames lastGames2, v3.b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = gamesInfoData.gamesData;
        }
        if ((i5 & 2) != 0) {
            lastGames = gamesInfoData.homeTeamData;
        }
        if ((i5 & 4) != 0) {
            lastGames2 = gamesInfoData.guestTeamData;
        }
        if ((i5 & 8) != 0) {
            bVar = gamesInfoData.httpException;
        }
        return gamesInfoData.copy(list, lastGames, lastGames2, bVar);
    }

    @Nullable
    public final List<Game> component1() {
        return this.gamesData;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final LastGames getHomeTeamData() {
        return this.homeTeamData;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final LastGames getGuestTeamData() {
        return this.guestTeamData;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final v3.b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final GamesInfoData copy(@Nullable List<Game> gamesData, @Nullable LastGames homeTeamData, @Nullable LastGames guestTeamData, @Nullable v3.b httpException) {
        return new GamesInfoData(gamesData, homeTeamData, guestTeamData, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GamesInfoData)) {
            return false;
        }
        GamesInfoData gamesInfoData = (GamesInfoData) other;
        return Intrinsics.areEqual(this.gamesData, gamesInfoData.gamesData) && Intrinsics.areEqual(this.homeTeamData, gamesInfoData.homeTeamData) && Intrinsics.areEqual(this.guestTeamData, gamesInfoData.guestTeamData) && Intrinsics.areEqual(this.httpException, gamesInfoData.httpException);
    }

    @Override // a4.f
    @Nullable
    public List<Game> getGamesData() {
        return this.gamesData;
    }

    @Override // v3.e
    @Nullable
    public v3.b getHttpException() {
        return this.httpException;
    }

    @Override // v3.e
    public int getStatusCode() {
        s0 response;
        v3.b httpException = getHttpException();
        if (httpException == null || (response = httpException.getResponse()) == null) {
            return 200;
        }
        return response.f21334a.f10276d;
    }

    public int hashCode() {
        List<Game> list = this.gamesData;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        LastGames lastGames = this.homeTeamData;
        int hashCode2 = (hashCode + (lastGames == null ? 0 : lastGames.hashCode())) * 31;
        LastGames lastGames2 = this.guestTeamData;
        int hashCode3 = (hashCode2 + (lastGames2 == null ? 0 : lastGames2.hashCode())) * 31;
        v3.b bVar = this.httpException;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GamesInfoData(gamesData=" + this.gamesData + ", homeTeamData=" + this.homeTeamData + ", guestTeamData=" + this.guestTeamData + ", httpException=" + this.httpException + ')';
    }

    @Override // a4.f
    @Nullable
    public LastGames getGuestTeamData() {
        return this.guestTeamData;
    }

    @Override // a4.f
    @Nullable
    public LastGames getHomeTeamData() {
        return this.homeTeamData;
    }

    @NotNull
    /* renamed from: map, reason: merged with bridge method [inline-methods] */
    public f m69map() {
        return new f(this) { // from class: bet.prediction.response.GamesInfoData$map$1
            private final List<c> gamesData;
            private final d guestTeamData;
            private final d homeTeamData;
            private final v3.b httpException;
            private final int statusCode;

            {
                ArrayList arrayList;
                List<GamesInfoData.Game> gamesData = this.getGamesData();
                if (gamesData != null) {
                    arrayList = new ArrayList();
                    Iterator<T> it = gamesData.iterator();
                    while (it.hasNext()) {
                        c mapper = GamesInfoData.Game.INSTANCE.mapper((GamesInfoData.Game) it.next());
                        if (mapper != null) {
                            arrayList.add(mapper);
                        }
                    }
                } else {
                    arrayList = null;
                }
                this.gamesData = arrayList;
                GamesInfoData.LastGames.Companion companion = GamesInfoData.LastGames.INSTANCE;
                this.homeTeamData = companion.mapper(this.getHomeTeamData());
                this.guestTeamData = companion.mapper(this.getGuestTeamData());
                this.statusCode = this.getStatusCode();
                this.httpException = this.getHttpException();
            }

            @Override // a4.f
            public List<c> getGamesData() {
                return this.gamesData;
            }

            @Override // a4.f
            public d getGuestTeamData() {
                return this.guestTeamData;
            }

            @Override // a4.f
            public d getHomeTeamData() {
                return this.homeTeamData;
            }

            @Override // v3.e
            public v3.b getHttpException() {
                return this.httpException;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }
        };
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B9\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJJ\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001d\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lbet/prediction/response/GamesInfoData$Team;", "La4/e;", "Ljava/io/Serializable;", "", "flag", "", "score", "scoreExtra", "id", "name", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()I", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;)Lbet/prediction/response/GamesInfoData$Team;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFlag", "Ljava/lang/Integer;", "getScore", "getScoreExtra", "I", "getId", "getName", "setName", "(Ljava/lang/String;)V", "Companion", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Team implements e, Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @b("logo")
        @Nullable
        private final String flag;

        @b("id")
        private final int id;

        @b("name")
        @Nullable
        private String name;

        @b("score")
        @Nullable
        private final Integer score;

        @b("additional_score")
        @Nullable
        private final Integer scoreExtra;

        /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbet/prediction/response/GamesInfoData$Team$Companion;", "", "<init>", "()V", "Lbet/prediction/response/GamesInfoData$Team;", "La4/e;", "mapper", "(Lbet/prediction/response/GamesInfoData$Team;)La4/e;", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final e mapper(@Nullable final Team team) {
                if (team == null) {
                    return null;
                }
                return new e(team) { // from class: bet.prediction.response.GamesInfoData$Team$Companion$mapper$1
                    private final String flag;
                    private final int id;
                    private final String name;
                    private final Integer score;
                    private final Integer scoreExtra;

                    {
                        this.scoreExtra = team.getScoreExtra();
                        this.score = team.getScore();
                        this.flag = team.getFlag();
                        this.id = team.getId();
                        this.name = team.getName();
                    }

                    @Override // a4.e
                    public String getFlag() {
                        return this.flag;
                    }

                    @Override // a4.e
                    public int getId() {
                        return this.id;
                    }

                    @Override // a4.e
                    public String getName() {
                        return this.name;
                    }

                    @Override // a4.e
                    public Integer getScore() {
                        return this.score;
                    }

                    @Override // a4.e
                    public Integer getScoreExtra() {
                        return this.scoreExtra;
                    }
                };
            }

            private Companion() {
            }
        }

        public Team(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, int i5, @Nullable String str2) {
            this.flag = str;
            this.score = num;
            this.scoreExtra = num2;
            this.id = i5;
            this.name = str2;
        }

        public static /* synthetic */ Team copy$default(Team team, String str, Integer num, Integer num2, int i5, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = team.flag;
            }
            if ((i10 & 2) != 0) {
                num = team.score;
            }
            if ((i10 & 4) != 0) {
                num2 = team.scoreExtra;
            }
            if ((i10 & 8) != 0) {
                i5 = team.id;
            }
            if ((i10 & 16) != 0) {
                str2 = team.name;
            }
            String str3 = str2;
            Integer num3 = num2;
            return team.copy(str, num, num3, i5, str3);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getFlag() {
            return this.flag;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getScore() {
            return this.score;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Integer getScoreExtra() {
            return this.scoreExtra;
        }

        /* renamed from: component4, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Team copy(@Nullable String flag, @Nullable Integer score, @Nullable Integer scoreExtra, int id2, @Nullable String name) {
            return new Team(flag, score, scoreExtra, id2, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Team)) {
                return false;
            }
            Team team = (Team) other;
            return Intrinsics.areEqual(this.flag, team.flag) && Intrinsics.areEqual(this.score, team.score) && Intrinsics.areEqual(this.scoreExtra, team.scoreExtra) && this.id == team.id && Intrinsics.areEqual(this.name, team.name);
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
        @Nullable
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
            String str = this.flag;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.score;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.scoreExtra;
            int hashCode3 = (((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.id) * 31;
            String str2 = this.name;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public void setName(@Nullable String str) {
            this.name = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Team(flag=");
            sb2.append(this.flag);
            sb2.append(", score=");
            sb2.append(this.score);
            sb2.append(", scoreExtra=");
            sb2.append(this.scoreExtra);
            sb2.append(", id=");
            sb2.append(this.id);
            sb2.append(", name=");
            return d9.e.k(sb2, this.name, ')');
        }

        public /* synthetic */ Team(String str, Integer num, Integer num2, int i5, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, num, num2, i5, (i10 & 16) != 0 ? "" : str2);
        }
    }
}
