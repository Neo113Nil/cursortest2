package bet.prediction.response.vtenth;

import com.sports.insider.data.repository.room.billing.PricesTable;
import d9.e;
import io.sentry.config.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v3.b;
import x3.h;
import x3.i;
import x3.j;
import x3.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003:\u0001(B%\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013R\u0014\u0010'\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001b¨\u0006)"}, d2 = {"Lbet/prediction/response/vtenth/IdentifyApi;", "Lx3/h;", "Lio/sentry/config/a;", "", "Lbet/prediction/response/vtenth/User;", "user", "Lbet/prediction/response/vtenth/IdentifyApi$Prices;", "prices", "Lv3/b;", "httpException", "<init>", "(Lbet/prediction/response/vtenth/User;Lbet/prediction/response/vtenth/IdentifyApi$Prices;Lv3/b;)V", "map", "()Lx3/h;", "component1", "()Lbet/prediction/response/vtenth/User;", "component2", "()Lbet/prediction/response/vtenth/IdentifyApi$Prices;", "component3", "()Lv3/b;", "copy", "(Lbet/prediction/response/vtenth/User;Lbet/prediction/response/vtenth/IdentifyApi$Prices;Lv3/b;)Lbet/prediction/response/vtenth/IdentifyApi;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbet/prediction/response/vtenth/User;", "getUser", "Lbet/prediction/response/vtenth/IdentifyApi$Prices;", "getPrices", "Lv3/b;", "getHttpException", "getStatusCode", "statusCode", "Prices", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IdentifyApi extends a implements h {

    @Nullable
    private final b httpException;

    @o9.b("prices")
    @Nullable
    private final Prices prices;

    @o9.b("user")
    @Nullable
    private final User user;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\u00011BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010$R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010!\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010$R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010$R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010$R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010$R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010!\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010$¨\u00062"}, d2 = {"Lbet/prediction/response/vtenth/IdentifyApi$Prices;", "Lx3/j;", "Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;", "premiumSubs", "premiumItem", "diamond", "expressItem", "expressSubs", "liveWeek", "liveMonth", "<init>", "(Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;)V", "component1", "()Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;)Lbet/prediction/response/vtenth/IdentifyApi$Prices;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;", "getPremiumSubs", "setPremiumSubs", "(Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;)V", "getPremiumItem", "setPremiumItem", "getDiamond", "setDiamond", "getExpressItem", "setExpressItem", "getExpressSubs", "setExpressSubs", "getLiveWeek", "setLiveWeek", "getLiveMonth", "setLiveMonth", "Price", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prices implements j {

        @o9.b("diamond_subscription")
        @Nullable
        private Price diamond;

        @o9.b("express_single")
        @Nullable
        private Price expressItem;

        @o9.b("express_subscription")
        @Nullable
        private Price expressSubs;

        @o9.b("live_sub_month")
        @Nullable
        private Price liveMonth;

        @o9.b("live_sub_7days")
        @Nullable
        private Price liveWeek;

        @o9.b("premium_single")
        @Nullable
        private Price premiumItem;

        @o9.b("premium_subscription")
        @Nullable
        private Price premiumSubs;

        /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010$R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010!\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010$R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010$R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010$R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010$R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010!\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010$R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010!\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010$¨\u00063"}, d2 = {"Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;", "Lx3/i;", "", "type", PricesTable.currentPriceColumn, PricesTable.standardPriceColumn, PricesTable.currentPlanIdColumn, PricesTable.standardPlanIdColumn, PricesTable.currentOfferIdColumn, PricesTable.standardOfferIdColumn, "endtime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbet/prediction/response/vtenth/IdentifyApi$Prices$Price;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getCurrentPrice", "setCurrentPrice", "getStandardPrice", "setStandardPrice", "getCurrentPlanId", "setCurrentPlanId", "getStandardPlanId", "setStandardPlanId", "getCurrentOfferId", "setCurrentOfferId", "getStandardOfferId", "setStandardOfferId", "getEndtime", "setEndtime", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Price implements i {

            @o9.b("current_offer_id")
            @Nullable
            private String currentOfferId;

            @o9.b("current_plan_id")
            @Nullable
            private String currentPlanId;

            @o9.b("current_price")
            @Nullable
            private String currentPrice;

            @o9.b("end_time")
            @Nullable
            private String endtime;

            @o9.b("standard_offer_id")
            @Nullable
            private String standardOfferId;

            @o9.b("standard_plan_id")
            @Nullable
            private String standardPlanId;

            @o9.b("standard_price")
            @Nullable
            private String standardPrice;

            @o9.b("type")
            @Nullable
            private String type;

            public Price(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
                this.type = str;
                this.currentPrice = str2;
                this.standardPrice = str3;
                this.currentPlanId = str4;
                this.standardPlanId = str5;
                this.currentOfferId = str6;
                this.standardOfferId = str7;
                this.endtime = str8;
            }

            public static /* synthetic */ Price copy$default(Price price, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i5, Object obj) {
                if ((i5 & 1) != 0) {
                    str = price.type;
                }
                if ((i5 & 2) != 0) {
                    str2 = price.currentPrice;
                }
                if ((i5 & 4) != 0) {
                    str3 = price.standardPrice;
                }
                if ((i5 & 8) != 0) {
                    str4 = price.currentPlanId;
                }
                if ((i5 & 16) != 0) {
                    str5 = price.standardPlanId;
                }
                if ((i5 & 32) != 0) {
                    str6 = price.currentOfferId;
                }
                if ((i5 & 64) != 0) {
                    str7 = price.standardOfferId;
                }
                if ((i5 & 128) != 0) {
                    str8 = price.endtime;
                }
                String str9 = str7;
                String str10 = str8;
                String str11 = str5;
                String str12 = str6;
                return price.copy(str, str2, str3, str4, str11, str12, str9, str10);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getCurrentPrice() {
                return this.currentPrice;
            }

            @Nullable
            /* renamed from: component3, reason: from getter */
            public final String getStandardPrice() {
                return this.standardPrice;
            }

            @Nullable
            /* renamed from: component4, reason: from getter */
            public final String getCurrentPlanId() {
                return this.currentPlanId;
            }

            @Nullable
            /* renamed from: component5, reason: from getter */
            public final String getStandardPlanId() {
                return this.standardPlanId;
            }

            @Nullable
            /* renamed from: component6, reason: from getter */
            public final String getCurrentOfferId() {
                return this.currentOfferId;
            }

            @Nullable
            /* renamed from: component7, reason: from getter */
            public final String getStandardOfferId() {
                return this.standardOfferId;
            }

            @Nullable
            /* renamed from: component8, reason: from getter */
            public final String getEndtime() {
                return this.endtime;
            }

            @NotNull
            public final Price copy(@Nullable String type, @Nullable String currentPrice, @Nullable String standardPrice, @Nullable String currentPlanId, @Nullable String standardPlanId, @Nullable String currentOfferId, @Nullable String standardOfferId, @Nullable String endtime) {
                return new Price(type, currentPrice, standardPrice, currentPlanId, standardPlanId, currentOfferId, standardOfferId, endtime);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Price)) {
                    return false;
                }
                Price price = (Price) other;
                return Intrinsics.areEqual(this.type, price.type) && Intrinsics.areEqual(this.currentPrice, price.currentPrice) && Intrinsics.areEqual(this.standardPrice, price.standardPrice) && Intrinsics.areEqual(this.currentPlanId, price.currentPlanId) && Intrinsics.areEqual(this.standardPlanId, price.standardPlanId) && Intrinsics.areEqual(this.currentOfferId, price.currentOfferId) && Intrinsics.areEqual(this.standardOfferId, price.standardOfferId) && Intrinsics.areEqual(this.endtime, price.endtime);
            }

            @Override // x3.i
            @Nullable
            public String getCurrentOfferId() {
                return this.currentOfferId;
            }

            @Override // x3.i
            @Nullable
            public String getCurrentPlanId() {
                return this.currentPlanId;
            }

            @Override // x3.i
            @Nullable
            public String getCurrentPrice() {
                return this.currentPrice;
            }

            @Override // x3.i
            @Nullable
            public String getEndtime() {
                return this.endtime;
            }

            @Override // x3.i
            @Nullable
            public String getStandardOfferId() {
                return this.standardOfferId;
            }

            @Override // x3.i
            @Nullable
            public String getStandardPlanId() {
                return this.standardPlanId;
            }

            @Override // x3.i
            @Nullable
            public String getStandardPrice() {
                return this.standardPrice;
            }

            @Override // x3.i
            @Nullable
            public String getType() {
                return this.type;
            }

            public int hashCode() {
                String str = this.type;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.currentPrice;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.standardPrice;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.currentPlanId;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.standardPlanId;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.currentOfferId;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.standardOfferId;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.endtime;
                return hashCode7 + (str8 != null ? str8.hashCode() : 0);
            }

            public void setCurrentOfferId(@Nullable String str) {
                this.currentOfferId = str;
            }

            public void setCurrentPlanId(@Nullable String str) {
                this.currentPlanId = str;
            }

            public void setCurrentPrice(@Nullable String str) {
                this.currentPrice = str;
            }

            public void setEndtime(@Nullable String str) {
                this.endtime = str;
            }

            public void setStandardOfferId(@Nullable String str) {
                this.standardOfferId = str;
            }

            public void setStandardPlanId(@Nullable String str) {
                this.standardPlanId = str;
            }

            public void setStandardPrice(@Nullable String str) {
                this.standardPrice = str;
            }

            public void setType(@Nullable String str) {
                this.type = str;
            }

            @NotNull
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Price(type=");
                sb2.append(this.type);
                sb2.append(", currentPrice=");
                sb2.append(this.currentPrice);
                sb2.append(", standardPrice=");
                sb2.append(this.standardPrice);
                sb2.append(", currentPlanId=");
                sb2.append(this.currentPlanId);
                sb2.append(", standardPlanId=");
                sb2.append(this.standardPlanId);
                sb2.append(", currentOfferId=");
                sb2.append(this.currentOfferId);
                sb2.append(", standardOfferId=");
                sb2.append(this.standardOfferId);
                sb2.append(", endtime=");
                return e.k(sb2, this.endtime, ')');
            }
        }

        public Prices(@Nullable Price price, @Nullable Price price2, @Nullable Price price3, @Nullable Price price4, @Nullable Price price5, @Nullable Price price6, @Nullable Price price7) {
            this.premiumSubs = price;
            this.premiumItem = price2;
            this.diamond = price3;
            this.expressItem = price4;
            this.expressSubs = price5;
            this.liveWeek = price6;
            this.liveMonth = price7;
        }

        public static /* synthetic */ Prices copy$default(Prices prices, Price price, Price price2, Price price3, Price price4, Price price5, Price price6, Price price7, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                price = prices.premiumSubs;
            }
            if ((i5 & 2) != 0) {
                price2 = prices.premiumItem;
            }
            if ((i5 & 4) != 0) {
                price3 = prices.diamond;
            }
            if ((i5 & 8) != 0) {
                price4 = prices.expressItem;
            }
            if ((i5 & 16) != 0) {
                price5 = prices.expressSubs;
            }
            if ((i5 & 32) != 0) {
                price6 = prices.liveWeek;
            }
            if ((i5 & 64) != 0) {
                price7 = prices.liveMonth;
            }
            Price price8 = price6;
            Price price9 = price7;
            Price price10 = price5;
            Price price11 = price3;
            return prices.copy(price, price2, price11, price4, price10, price8, price9);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Price getPremiumSubs() {
            return this.premiumSubs;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Price getPremiumItem() {
            return this.premiumItem;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Price getDiamond() {
            return this.diamond;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Price getExpressItem() {
            return this.expressItem;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Price getExpressSubs() {
            return this.expressSubs;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Price getLiveWeek() {
            return this.liveWeek;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Price getLiveMonth() {
            return this.liveMonth;
        }

        @NotNull
        public final Prices copy(@Nullable Price premiumSubs, @Nullable Price premiumItem, @Nullable Price diamond, @Nullable Price expressItem, @Nullable Price expressSubs, @Nullable Price liveWeek, @Nullable Price liveMonth) {
            return new Prices(premiumSubs, premiumItem, diamond, expressItem, expressSubs, liveWeek, liveMonth);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Prices)) {
                return false;
            }
            Prices prices = (Prices) other;
            return Intrinsics.areEqual(this.premiumSubs, prices.premiumSubs) && Intrinsics.areEqual(this.premiumItem, prices.premiumItem) && Intrinsics.areEqual(this.diamond, prices.diamond) && Intrinsics.areEqual(this.expressItem, prices.expressItem) && Intrinsics.areEqual(this.expressSubs, prices.expressSubs) && Intrinsics.areEqual(this.liveWeek, prices.liveWeek) && Intrinsics.areEqual(this.liveMonth, prices.liveMonth);
        }

        public int hashCode() {
            Price price = this.premiumSubs;
            int hashCode = (price == null ? 0 : price.hashCode()) * 31;
            Price price2 = this.premiumItem;
            int hashCode2 = (hashCode + (price2 == null ? 0 : price2.hashCode())) * 31;
            Price price3 = this.diamond;
            int hashCode3 = (hashCode2 + (price3 == null ? 0 : price3.hashCode())) * 31;
            Price price4 = this.expressItem;
            int hashCode4 = (hashCode3 + (price4 == null ? 0 : price4.hashCode())) * 31;
            Price price5 = this.expressSubs;
            int hashCode5 = (hashCode4 + (price5 == null ? 0 : price5.hashCode())) * 31;
            Price price6 = this.liveWeek;
            int hashCode6 = (hashCode5 + (price6 == null ? 0 : price6.hashCode())) * 31;
            Price price7 = this.liveMonth;
            return hashCode6 + (price7 != null ? price7.hashCode() : 0);
        }

        public void setDiamond(@Nullable Price price) {
            this.diamond = price;
        }

        public void setExpressItem(@Nullable Price price) {
            this.expressItem = price;
        }

        public void setExpressSubs(@Nullable Price price) {
            this.expressSubs = price;
        }

        public void setLiveMonth(@Nullable Price price) {
            this.liveMonth = price;
        }

        public void setLiveWeek(@Nullable Price price) {
            this.liveWeek = price;
        }

        public void setPremiumItem(@Nullable Price price) {
            this.premiumItem = price;
        }

        public void setPremiumSubs(@Nullable Price price) {
            this.premiumSubs = price;
        }

        @NotNull
        public String toString() {
            return "Prices(premiumSubs=" + this.premiumSubs + ", premiumItem=" + this.premiumItem + ", diamond=" + this.diamond + ", expressItem=" + this.expressItem + ", expressSubs=" + this.expressSubs + ", liveWeek=" + this.liveWeek + ", liveMonth=" + this.liveMonth + ')';
        }

        @Override // x3.j
        @Nullable
        public Price getDiamond() {
            return this.diamond;
        }

        @Override // x3.j
        @Nullable
        public Price getExpressItem() {
            return this.expressItem;
        }

        @Override // x3.j
        @Nullable
        public Price getExpressSubs() {
            return this.expressSubs;
        }

        @Override // x3.j
        @Nullable
        public Price getLiveMonth() {
            return this.liveMonth;
        }

        @Override // x3.j
        @Nullable
        public Price getLiveWeek() {
            return this.liveWeek;
        }

        @Override // x3.j
        @Nullable
        public Price getPremiumItem() {
            return this.premiumItem;
        }

        @Override // x3.j
        @Nullable
        public Price getPremiumSubs() {
            return this.premiumSubs;
        }
    }

    public IdentifyApi(@Nullable User user, @Nullable Prices prices, @Nullable b bVar) {
        this.user = user;
        this.prices = prices;
        this.httpException = bVar;
    }

    public static /* synthetic */ IdentifyApi copy$default(IdentifyApi identifyApi, User user, Prices prices, b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            user = identifyApi.user;
        }
        if ((i5 & 2) != 0) {
            prices = identifyApi.prices;
        }
        if ((i5 & 4) != 0) {
            bVar = identifyApi.httpException;
        }
        return identifyApi.copy(user, prices, bVar);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Prices getPrices() {
        return this.prices;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final IdentifyApi copy(@Nullable User user, @Nullable Prices prices, @Nullable b httpException) {
        return new IdentifyApi(user, prices, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentifyApi)) {
            return false;
        }
        IdentifyApi identifyApi = (IdentifyApi) other;
        return Intrinsics.areEqual(this.user, identifyApi.user) && Intrinsics.areEqual(this.prices, identifyApi.prices) && Intrinsics.areEqual(this.httpException, identifyApi.httpException);
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
        User user = this.user;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        Prices prices = this.prices;
        int hashCode2 = (hashCode + (prices == null ? 0 : prices.hashCode())) * 31;
        b bVar = this.httpException;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IdentifyApi(user=" + this.user + ", prices=" + this.prices + ", httpException=" + this.httpException + ')';
    }

    @Override // x3.h
    @Nullable
    public Prices getPrices() {
        return this.prices;
    }

    @Override // x3.h
    @Nullable
    public User getUser() {
        return this.user;
    }

    @NotNull
    public h map() {
        return new h(this) { // from class: bet.prediction.response.vtenth.IdentifyApi$map$1
            private final b httpException;
            private final j prices;
            private final int statusCode;
            private final l user;

            {
                this.user = this.getUser();
                this.prices = this.getPrices();
                this.statusCode = this.getStatusCode();
                this.httpException = this.getHttpException();
            }

            @Override // v3.e
            public b getHttpException() {
                return this.httpException;
            }

            @Override // x3.h
            public j getPrices() {
                return this.prices;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }

            @Override // x3.h
            public l getUser() {
                return this.user;
            }
        };
    }
}
