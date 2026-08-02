package bet.prediction.response.game;

import bet.prediction.response.game.InfoGameApi;
import io.sentry.config.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import v3.b;
import w3.c;
import w3.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003:\u0001/B/\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010$R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010(R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001c¨\u00060"}, d2 = {"Lbet/prediction/response/game/RatingGameApi;", "Lw3/f;", "Lio/sentry/config/a;", "", "", "Lbet/prediction/response/game/RatingGameApi$Rating;", "rating", "Lbet/prediction/response/game/InfoGameApi$Offer;", "offer", "Lv3/b;", "httpException", "<init>", "(Ljava/util/List;Lbet/prediction/response/game/InfoGameApi$Offer;Lv3/b;)V", "map", "()Lw3/f;", "component1", "()Ljava/util/List;", "component2", "()Lbet/prediction/response/game/InfoGameApi$Offer;", "component3", "()Lv3/b;", "copy", "(Ljava/util/List;Lbet/prediction/response/game/InfoGameApi$Offer;Lv3/b;)Lbet/prediction/response/game/RatingGameApi;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRating", "setRating", "(Ljava/util/List;)V", "Lbet/prediction/response/game/InfoGameApi$Offer;", "getOffer", "setOffer", "(Lbet/prediction/response/game/InfoGameApi$Offer;)V", "Lv3/b;", "getHttpException", "setHttpException", "(Lv3/b;)V", "getStatusCode", "statusCode", "Rating", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RatingGameApi extends a implements f {

    @Nullable
    private b httpException;

    @o9.b("offer")
    @Nullable
    private InfoGameApi.Offer offer;

    @o9.b("rating")
    @Nullable
    private List<Rating> rating;

    public RatingGameApi(@Nullable List<Rating> list, @Nullable InfoGameApi.Offer offer, @Nullable b bVar) {
        this.rating = list;
        this.offer = offer;
        this.httpException = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatingGameApi copy$default(RatingGameApi ratingGameApi, List list, InfoGameApi.Offer offer, b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = ratingGameApi.rating;
        }
        if ((i5 & 2) != 0) {
            offer = ratingGameApi.offer;
        }
        if ((i5 & 4) != 0) {
            bVar = ratingGameApi.httpException;
        }
        return ratingGameApi.copy(list, offer, bVar);
    }

    @Nullable
    public final List<Rating> component1() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final InfoGameApi.Offer getOffer() {
        return this.offer;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final RatingGameApi copy(@Nullable List<Rating> rating, @Nullable InfoGameApi.Offer offer, @Nullable b httpException) {
        return new RatingGameApi(rating, offer, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingGameApi)) {
            return false;
        }
        RatingGameApi ratingGameApi = (RatingGameApi) other;
        return Intrinsics.areEqual(this.rating, ratingGameApi.rating) && Intrinsics.areEqual(this.offer, ratingGameApi.offer) && Intrinsics.areEqual(this.httpException, ratingGameApi.httpException);
    }

    @Override // v3.e
    @Nullable
    public b getHttpException() {
        return this.httpException;
    }

    @Nullable
    public List<Rating> getRating() {
        return this.rating;
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
        List<Rating> list = this.rating;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        InfoGameApi.Offer offer = this.offer;
        int hashCode2 = (hashCode + (offer == null ? 0 : offer.hashCode())) * 31;
        b bVar = this.httpException;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public void setHttpException(@Nullable b bVar) {
        this.httpException = bVar;
    }

    public void setOffer(@Nullable InfoGameApi.Offer offer) {
        this.offer = offer;
    }

    public void setRating(@Nullable List<Rating> list) {
        this.rating = list;
    }

    @NotNull
    public String toString() {
        return "RatingGameApi(rating=" + this.rating + ", offer=" + this.offer + ", httpException=" + this.httpException + ')';
    }

    @Nullable
    /* renamed from: getOffer, reason: merged with bridge method [inline-methods] */
    public InfoGameApi.Offer m80getOffer() {
        return this.offer;
    }

    @NotNull
    public f map() {
        return new f(this) { // from class: bet.prediction.response.game.RatingGameApi$map$1
            private final b httpException;
            private final c offer;
            private final List<Object> rating;
            private final int statusCode;

            {
                InfoGameApi.Offer m80getOffer;
                Object dataOffer;
                InfoGameApi.Offer offer;
                this.rating = this.getRating();
                InfoGameApi.Offer m80getOffer2 = this.m80getOffer();
                InfoGameApi.Offer offer2 = null;
                Integer valueOf = m80getOffer2 != null ? Integer.valueOf(m80getOffer2.getTypeOffer()) : null;
                if (valueOf != null && valueOf.intValue() == 1) {
                    InfoGameApi.Offer m80getOffer3 = this.m80getOffer();
                    Object dataOffer2 = m80getOffer3 != null ? m80getOffer3.getDataOffer() : null;
                    String str = dataOffer2 instanceof String ? (String) dataOffer2 : null;
                    if (str != null) {
                        offer2 = new InfoGameApi.Offer(valueOf.intValue(), str);
                    }
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    InfoGameApi.Offer m80getOffer4 = this.m80getOffer();
                    Object dataOffer3 = m80getOffer4 != null ? m80getOffer4.getDataOffer() : null;
                    Integer num = dataOffer3 instanceof Integer ? (Integer) dataOffer3 : null;
                    if (num != null) {
                        offer = new InfoGameApi.Offer(valueOf.intValue(), Integer.valueOf(num.intValue()));
                        offer2 = offer;
                    }
                } else if (valueOf != null && valueOf.intValue() == 3 && (m80getOffer = this.m80getOffer()) != null && (dataOffer = m80getOffer.getDataOffer()) != null) {
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

            public c getOffer() {
                return this.offer;
            }

            public List<Object> getRating() {
                return this.rating;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }
        };
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013¨\u0006$"}, d2 = {"Lbet/prediction/response/game/RatingGameApi$Rating;", "", "", "place", "", "nickName", "", "score", "", "currentUser", "<init>", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/lang/Boolean;", "copy", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)Lbet/prediction/response/game/RatingGameApi$Rating;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPlace", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getNickName", "Ljava/lang/Long;", "getScore", "Ljava/lang/Boolean;", "getCurrentUser", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rating {

        @o9.b("currentUser")
        @Nullable
        private final Boolean currentUser;

        @o9.b("nickname")
        @Nullable
        private final String nickName;

        @o9.b("place")
        private final int place;

        @o9.b("score")
        @Nullable
        private final Long score;

        public Rating(int i5, @Nullable String str, @Nullable Long l6, @Nullable Boolean bool) {
            this.place = i5;
            this.nickName = str;
            this.score = l6;
            this.currentUser = bool;
        }

        public static /* synthetic */ Rating copy$default(Rating rating, int i5, String str, Long l6, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i5 = rating.place;
            }
            if ((i10 & 2) != 0) {
                str = rating.nickName;
            }
            if ((i10 & 4) != 0) {
                l6 = rating.score;
            }
            if ((i10 & 8) != 0) {
                bool = rating.currentUser;
            }
            return rating.copy(i5, str, l6, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPlace() {
            return this.place;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getNickName() {
            return this.nickName;
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

        @NotNull
        public final Rating copy(int place, @Nullable String nickName, @Nullable Long score, @Nullable Boolean currentUser) {
            return new Rating(place, nickName, score, currentUser);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rating)) {
                return false;
            }
            Rating rating = (Rating) other;
            return this.place == rating.place && Intrinsics.areEqual(this.nickName, rating.nickName) && Intrinsics.areEqual(this.score, rating.score) && Intrinsics.areEqual(this.currentUser, rating.currentUser);
        }

        @Nullable
        public Boolean getCurrentUser() {
            return this.currentUser;
        }

        @Nullable
        public String getNickName() {
            return this.nickName;
        }

        @NotNull
        public Integer getPlace() {
            return Integer.valueOf(this.place);
        }

        @Nullable
        public Long getScore() {
            return this.score;
        }

        public int hashCode() {
            int i5 = this.place * 31;
            String str = this.nickName;
            int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
            Long l6 = this.score;
            int hashCode2 = (hashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
            Boolean bool = this.currentUser;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Rating(place=" + this.place + ", nickName=" + this.nickName + ", score=" + this.score + ", currentUser=" + this.currentUser + ')';
        }

        public /* synthetic */ Rating(int i5, String str, Long l6, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i5, str, l6, (i10 & 8) != 0 ? Boolean.FALSE : bool);
        }
    }

    public /* synthetic */ RatingGameApi(List list, InfoGameApi.Offer offer, b bVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : list, (i5 & 2) != 0 ? null : offer, bVar);
    }
}
