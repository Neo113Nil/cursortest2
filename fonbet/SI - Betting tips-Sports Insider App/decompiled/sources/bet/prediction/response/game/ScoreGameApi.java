package bet.prediction.response.game;

import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import io.sentry.config.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v3.b;
import w3.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\"R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\"R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013R\u0014\u0010*\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001a¨\u0006+"}, d2 = {"Lbet/prediction/response/game/ScoreGameApi;", "Lw3/g;", "Lio/sentry/config/a;", "", "", "idMatch", PredictionTable.scoreHomeColumn, PredictionTable.scoreGuestColumn, "Lv3/b;", "httpException", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lv3/b;)V", "map", "()Lw3/g;", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "()Lv3/b;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lv3/b;)Lbet/prediction/response/game/ScoreGameApi;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getIdMatch", "setIdMatch", "(Ljava/lang/Integer;)V", "getScoreHome", "setScoreHome", "getScoreGuest", "setScoreGuest", "Lv3/b;", "getHttpException", "getStatusCode", "statusCode", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ScoreGameApi extends a implements g {

    @Nullable
    private final b httpException;

    @o9.b("match_id")
    @Nullable
    private Integer idMatch;

    @o9.b("score2")
    @Nullable
    private Integer scoreGuest;

    @o9.b("score1")
    @Nullable
    private Integer scoreHome;

    public ScoreGameApi(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable b bVar) {
        this.idMatch = num;
        this.scoreHome = num2;
        this.scoreGuest = num3;
        this.httpException = bVar;
    }

    public static /* synthetic */ ScoreGameApi copy$default(ScoreGameApi scoreGameApi, Integer num, Integer num2, Integer num3, b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            num = scoreGameApi.idMatch;
        }
        if ((i5 & 2) != 0) {
            num2 = scoreGameApi.scoreHome;
        }
        if ((i5 & 4) != 0) {
            num3 = scoreGameApi.scoreGuest;
        }
        if ((i5 & 8) != 0) {
            bVar = scoreGameApi.httpException;
        }
        return scoreGameApi.copy(num, num2, num3, bVar);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getIdMatch() {
        return this.idMatch;
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
    public final b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final ScoreGameApi copy(@Nullable Integer idMatch, @Nullable Integer scoreHome, @Nullable Integer scoreGuest, @Nullable b httpException) {
        return new ScoreGameApi(idMatch, scoreHome, scoreGuest, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScoreGameApi)) {
            return false;
        }
        ScoreGameApi scoreGameApi = (ScoreGameApi) other;
        return Intrinsics.areEqual(this.idMatch, scoreGameApi.idMatch) && Intrinsics.areEqual(this.scoreHome, scoreGameApi.scoreHome) && Intrinsics.areEqual(this.scoreGuest, scoreGameApi.scoreGuest) && Intrinsics.areEqual(this.httpException, scoreGameApi.httpException);
    }

    @Override // v3.e
    @Nullable
    public b getHttpException() {
        return this.httpException;
    }

    @Nullable
    public Integer getIdMatch() {
        return this.idMatch;
    }

    @Nullable
    public Integer getScoreGuest() {
        return this.scoreGuest;
    }

    @Nullable
    public Integer getScoreHome() {
        return this.scoreHome;
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
        Integer num = this.idMatch;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.scoreHome;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.scoreGuest;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        b bVar = this.httpException;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public void setIdMatch(@Nullable Integer num) {
        this.idMatch = num;
    }

    public void setScoreGuest(@Nullable Integer num) {
        this.scoreGuest = num;
    }

    public void setScoreHome(@Nullable Integer num) {
        this.scoreHome = num;
    }

    @NotNull
    public String toString() {
        return "ScoreGameApi(idMatch=" + this.idMatch + ", scoreHome=" + this.scoreHome + ", scoreGuest=" + this.scoreGuest + ", httpException=" + this.httpException + ')';
    }

    @NotNull
    public g map() {
        return new g(this) { // from class: bet.prediction.response.game.ScoreGameApi$map$1
            private final b httpException;
            private Integer idMatch;
            private Integer scoreGuest;
            private Integer scoreHome;
            private final int statusCode;

            {
                this.idMatch = this.getIdMatch();
                this.scoreHome = this.getScoreHome();
                this.scoreGuest = this.getScoreGuest();
                this.statusCode = this.getStatusCode();
                this.httpException = this.getHttpException();
            }

            @Override // v3.e
            public b getHttpException() {
                return this.httpException;
            }

            public Integer getIdMatch() {
                return this.idMatch;
            }

            public Integer getScoreGuest() {
                return this.scoreGuest;
            }

            public Integer getScoreHome() {
                return this.scoreHome;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }

            public void setIdMatch(Integer num) {
                this.idMatch = num;
            }

            public void setScoreGuest(Integer num) {
                this.scoreGuest = num;
            }

            public void setScoreHome(Integer num) {
                this.scoreHome = num;
            }
        };
    }
}
