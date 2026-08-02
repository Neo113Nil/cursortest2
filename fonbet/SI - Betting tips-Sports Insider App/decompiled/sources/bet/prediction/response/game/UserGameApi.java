package bet.prediction.response.game;

import bet.prediction.response.game.InfoGameApi;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import d9.e;
import io.sentry.config.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o9.b;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w3.i;
import w3.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003:\u0002ABBI\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J^\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b'\u0010(R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010,R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0018R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u00102R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u00106R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010\u001e\"\u0004\b9\u0010:R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010 R\u0016\u0010>\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0018R\u0014\u0010@\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%¨\u0006C"}, d2 = {"Lbet/prediction/response/game/UserGameApi;", "Lw3/j;", "Lio/sentry/config/a;", "", "", "place", "", "nickNameUser", "", "score", "", "currentUser", "", "Lbet/prediction/response/game/UserGameApi$UserForecast;", PredictionTable.forecastsColumn, "Lv3/b;", "httpException", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Lv3/b;)V", "map", "()Lw3/j;", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/util/List;", "component6", "()Lv3/b;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Lv3/b;)Lbet/prediction/response/game/UserGameApi;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getPlace", "setPlace", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getNickNameUser", "Ljava/lang/Long;", "getScore", "setScore", "(Ljava/lang/Long;)V", "Ljava/lang/Boolean;", "getCurrentUser", "setCurrentUser", "(Ljava/lang/Boolean;)V", "Ljava/util/List;", "getForecasts", "setForecasts", "(Ljava/util/List;)V", "Lv3/b;", "getHttpException", "getNickName", "nickName", "getStatusCode", "statusCode", "UserForecast", "GameForecastType", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserGameApi extends a implements j {

    @b("currentUser")
    @Nullable
    private Boolean currentUser;

    @b(PredictionTable.forecastsColumn)
    @Nullable
    private List<UserForecast> forecasts;

    @Nullable
    private final v3.b httpException;

    @b("nickname")
    @Nullable
    private final String nickNameUser;

    @b("place")
    @Nullable
    private Integer place;

    @b("score")
    @Nullable
    private Long score;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lbet/prediction/response/game/UserGameApi$GameForecastType;", "Lw3/i;", "", "id", "", "name", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lbet/prediction/response/game/UserGameApi$GameForecastType;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GameForecastType implements i {

        @b("id")
        private int id;

        @b("name")
        @NotNull
        private String name;

        public GameForecastType(int i5, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = i5;
            this.name = name;
        }

        public static /* synthetic */ GameForecastType copy$default(GameForecastType gameForecastType, int i5, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i5 = gameForecastType.id;
            }
            if ((i10 & 2) != 0) {
                str = gameForecastType.name;
            }
            return gameForecastType.copy(i5, str);
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
        public final GameForecastType copy(int id2, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new GameForecastType(id2, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GameForecastType)) {
                return false;
            }
            GameForecastType gameForecastType = (GameForecastType) other;
            return this.id == gameForecastType.id && Intrinsics.areEqual(this.name, gameForecastType.name);
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

        public void setId(int i5) {
            this.id = i5;
        }

        public void setName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.name = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("GameForecastType(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            return e.k(sb2, this.name, ')');
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0010R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010'\u001a\u0004\b\b\u0010\u0013\"\u0004\b(\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0015¨\u0006,"}, d2 = {"Lbet/prediction/response/game/UserGameApi$UserForecast;", "", "Lbet/prediction/response/game/InfoGameApi$Match;", "match", "", PredictionTable.scoreHomeColumn, PredictionTable.scoreGuestColumn, "", "isPassed", "Lbet/prediction/response/game/UserGameApi$GameForecastType;", "gameForecastType", "<init>", "(Lbet/prediction/response/game/InfoGameApi$Match;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lbet/prediction/response/game/UserGameApi$GameForecastType;)V", "component1", "()Lbet/prediction/response/game/InfoGameApi$Match;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Lbet/prediction/response/game/UserGameApi$GameForecastType;", "copy", "(Lbet/prediction/response/game/InfoGameApi$Match;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lbet/prediction/response/game/UserGameApi$GameForecastType;)Lbet/prediction/response/game/UserGameApi$UserForecast;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lbet/prediction/response/game/InfoGameApi$Match;", "getMatch", "setMatch", "(Lbet/prediction/response/game/InfoGameApi$Match;)V", "Ljava/lang/Integer;", "getScoreHome", "getScoreGuest", "Ljava/lang/Boolean;", "setPassed", "(Ljava/lang/Boolean;)V", "Lbet/prediction/response/game/UserGameApi$GameForecastType;", "getGameForecastType", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserForecast {

        @b("gameForecastType")
        @Nullable
        private final GameForecastType gameForecastType;

        @b("isPassed")
        @Nullable
        private Boolean isPassed;

        @b("match")
        @Nullable
        private InfoGameApi.Match match;

        @b("score2")
        @Nullable
        private final Integer scoreGuest;

        @b("score1")
        @Nullable
        private final Integer scoreHome;

        public UserForecast(@Nullable InfoGameApi.Match match, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable GameForecastType gameForecastType) {
            this.match = match;
            this.scoreHome = num;
            this.scoreGuest = num2;
            this.isPassed = bool;
            this.gameForecastType = gameForecastType;
        }

        public static /* synthetic */ UserForecast copy$default(UserForecast userForecast, InfoGameApi.Match match, Integer num, Integer num2, Boolean bool, GameForecastType gameForecastType, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                match = userForecast.match;
            }
            if ((i5 & 2) != 0) {
                num = userForecast.scoreHome;
            }
            if ((i5 & 4) != 0) {
                num2 = userForecast.scoreGuest;
            }
            if ((i5 & 8) != 0) {
                bool = userForecast.isPassed;
            }
            if ((i5 & 16) != 0) {
                gameForecastType = userForecast.gameForecastType;
            }
            GameForecastType gameForecastType2 = gameForecastType;
            Integer num3 = num2;
            return userForecast.copy(match, num, num3, bool, gameForecastType2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final InfoGameApi.Match getMatch() {
            return this.match;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getScoreHome() {
            return this.scoreHome;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Integer getScoreGuest() {
            return this.scoreGuest;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Boolean getIsPassed() {
            return this.isPassed;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final GameForecastType getGameForecastType() {
            return this.gameForecastType;
        }

        @NotNull
        public final UserForecast copy(@Nullable InfoGameApi.Match match, @Nullable Integer scoreHome, @Nullable Integer scoreGuest, @Nullable Boolean isPassed, @Nullable GameForecastType gameForecastType) {
            return new UserForecast(match, scoreHome, scoreGuest, isPassed, gameForecastType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserForecast)) {
                return false;
            }
            UserForecast userForecast = (UserForecast) other;
            return Intrinsics.areEqual(this.match, userForecast.match) && Intrinsics.areEqual(this.scoreHome, userForecast.scoreHome) && Intrinsics.areEqual(this.scoreGuest, userForecast.scoreGuest) && Intrinsics.areEqual(this.isPassed, userForecast.isPassed) && Intrinsics.areEqual(this.gameForecastType, userForecast.gameForecastType);
        }

        @Nullable
        public Integer getScoreGuest() {
            return this.scoreGuest;
        }

        @Nullable
        public Integer getScoreHome() {
            return this.scoreHome;
        }

        public int hashCode() {
            InfoGameApi.Match match = this.match;
            int hashCode = (match == null ? 0 : match.hashCode()) * 31;
            Integer num = this.scoreHome;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.scoreGuest;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.isPassed;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            GameForecastType gameForecastType = this.gameForecastType;
            return hashCode4 + (gameForecastType != null ? gameForecastType.hashCode() : 0);
        }

        @Nullable
        public Boolean isPassed() {
            return this.isPassed;
        }

        public void setMatch(@Nullable InfoGameApi.Match match) {
            this.match = match;
        }

        public void setPassed(@Nullable Boolean bool) {
            this.isPassed = bool;
        }

        @NotNull
        public String toString() {
            return "UserForecast(match=" + this.match + ", scoreHome=" + this.scoreHome + ", scoreGuest=" + this.scoreGuest + ", isPassed=" + this.isPassed + ", gameForecastType=" + this.gameForecastType + ')';
        }

        @Nullable
        /* renamed from: getGameForecastType, reason: merged with bridge method [inline-methods] */
        public GameForecastType m84getGameForecastType() {
            return this.gameForecastType;
        }

        @Nullable
        /* renamed from: getMatch, reason: merged with bridge method [inline-methods] */
        public InfoGameApi.Match m85getMatch() {
            return this.match;
        }
    }

    public UserGameApi(@Nullable Integer num, @Nullable String str, @Nullable Long l6, @Nullable Boolean bool, @Nullable List<UserForecast> list, @Nullable v3.b bVar) {
        this.place = num;
        this.nickNameUser = str;
        this.score = l6;
        this.currentUser = bool;
        this.forecasts = list;
        this.httpException = bVar;
    }

    public static /* synthetic */ UserGameApi copy$default(UserGameApi userGameApi, Integer num, String str, Long l6, Boolean bool, List list, v3.b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            num = userGameApi.place;
        }
        if ((i5 & 2) != 0) {
            str = userGameApi.nickNameUser;
        }
        if ((i5 & 4) != 0) {
            l6 = userGameApi.score;
        }
        if ((i5 & 8) != 0) {
            bool = userGameApi.currentUser;
        }
        if ((i5 & 16) != 0) {
            list = userGameApi.forecasts;
        }
        if ((i5 & 32) != 0) {
            bVar = userGameApi.httpException;
        }
        List list2 = list;
        v3.b bVar2 = bVar;
        return userGameApi.copy(num, str, l6, bool, list2, bVar2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getPlace() {
        return this.place;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getNickNameUser() {
        return this.nickNameUser;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Long getScore() {
        return this.score;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getCurrentUser() {
        return this.currentUser;
    }

    @Nullable
    public final List<UserForecast> component5() {
        return this.forecasts;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final v3.b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final UserGameApi copy(@Nullable Integer place, @Nullable String nickNameUser, @Nullable Long score, @Nullable Boolean currentUser, @Nullable List<UserForecast> forecasts, @Nullable v3.b httpException) {
        return new UserGameApi(place, nickNameUser, score, currentUser, forecasts, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserGameApi)) {
            return false;
        }
        UserGameApi userGameApi = (UserGameApi) other;
        return Intrinsics.areEqual(this.place, userGameApi.place) && Intrinsics.areEqual(this.nickNameUser, userGameApi.nickNameUser) && Intrinsics.areEqual(this.score, userGameApi.score) && Intrinsics.areEqual(this.currentUser, userGameApi.currentUser) && Intrinsics.areEqual(this.forecasts, userGameApi.forecasts) && Intrinsics.areEqual(this.httpException, userGameApi.httpException);
    }

    @Nullable
    public Boolean getCurrentUser() {
        return this.currentUser;
    }

    @Nullable
    public List<UserForecast> getForecasts() {
        return this.forecasts;
    }

    @Override // v3.e
    @Nullable
    public v3.b getHttpException() {
        return this.httpException;
    }

    @Nullable
    public String getNickName() {
        return this.nickNameUser;
    }

    @Nullable
    public final String getNickNameUser() {
        return this.nickNameUser;
    }

    @Nullable
    public Integer getPlace() {
        return this.place;
    }

    @Nullable
    public Long getScore() {
        return this.score;
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
        Integer num = this.place;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.nickNameUser;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l6 = this.score;
        int hashCode3 = (hashCode2 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Boolean bool = this.currentUser;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<UserForecast> list = this.forecasts;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        v3.b bVar = this.httpException;
        return hashCode5 + (bVar != null ? bVar.hashCode() : 0);
    }

    public void setCurrentUser(@Nullable Boolean bool) {
        this.currentUser = bool;
    }

    public void setForecasts(@Nullable List<UserForecast> list) {
        this.forecasts = list;
    }

    public void setPlace(@Nullable Integer num) {
        this.place = num;
    }

    public void setScore(@Nullable Long l6) {
        this.score = l6;
    }

    @NotNull
    public String toString() {
        return "UserGameApi(place=" + this.place + ", nickNameUser=" + this.nickNameUser + ", score=" + this.score + ", currentUser=" + this.currentUser + ", forecasts=" + this.forecasts + ", httpException=" + this.httpException + ')';
    }

    @NotNull
    public j map() {
        return new j(this) { // from class: bet.prediction.response.game.UserGameApi$map$1
            private final Boolean currentUser;
            private final List<Object> forecasts;
            private final v3.b httpException;
            private final String nickName;
            private final Integer place;
            private final Long score;
            private final int statusCode;

            {
                this.nickName = this.getNickNameUser();
                this.score = this.getScore();
                this.currentUser = this.getCurrentUser();
                this.forecasts = this.getForecasts();
                this.statusCode = this.getStatusCode();
                this.httpException = this.getHttpException();
                this.place = this.getPlace();
            }

            public Boolean getCurrentUser() {
                return this.currentUser;
            }

            public List<Object> getForecasts() {
                return this.forecasts;
            }

            @Override // v3.e
            public v3.b getHttpException() {
                return this.httpException;
            }

            public String getNickName() {
                return this.nickName;
            }

            public Integer getPlace() {
                return this.place;
            }

            public Long getScore() {
                return this.score;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }
        };
    }
}
