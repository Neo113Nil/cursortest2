package bet.prediction.response.vtenth;

import com.sports.insider.data.room.general.table.AccountTable;
import d9.e;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o9.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x3.k;
import x3.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\b\u0080\b\u0018\u00002\u00020\u0001:\u0001[B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\"JÌ\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0018J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u00107R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u00104\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u00107R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010\u001b\"\u0004\b<\u0010=R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010:\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010=R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010=R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010:\u001a\u0004\bB\u0010\u001b\"\u0004\bC\u0010=R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010:\u001a\u0004\bD\u0010\u001b\"\u0004\bE\u0010=R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\bF\u0010\u001b\"\u0004\bG\u0010=R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010\"\"\u0004\bJ\u0010KR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010H\u001a\u0004\bL\u0010\"\"\u0004\bM\u0010KR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010H\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010KR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010H\u001a\u0004\bP\u0010\"\"\u0004\bQ\u0010KR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010H\u001a\u0004\bR\u0010\"\"\u0004\bS\u0010KR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bT\u0010\"R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010U\u001a\u0004\bV\u0010)\"\u0004\bW\u0010XR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010H\u001a\u0004\bY\u0010\"\"\u0004\bZ\u0010K¨\u0006\\"}, d2 = {"Lbet/prediction/response/vtenth/User;", "Lx3/l;", "", "premium", "express", "", CommonUrlParts.LOCALE, AccountTable.tokenColumn, AccountTable.emailColumn, "name", AccountTable.surnameColumn, AccountTable.avatarColumn, "needGoogleAuth", "needHuaweiAuth", "forecastsOrder", "alternativePayment", "cpb", "badSubs", "Lbet/prediction/response/vtenth/User$Subscriptions;", "subscriptions", "modalDescEnable", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lbet/prediction/response/vtenth/User$Subscriptions;Ljava/lang/Integer;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Integer;", "component10", "component11", "component12", "component13", "component14", "component15", "()Lbet/prediction/response/vtenth/User$Subscriptions;", "component16", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lbet/prediction/response/vtenth/User$Subscriptions;Ljava/lang/Integer;)Lbet/prediction/response/vtenth/User;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPremium", "setPremium", "(I)V", "getExpress", "setExpress", "Ljava/lang/String;", "getLocale", "setLocale", "(Ljava/lang/String;)V", "getToken", "setToken", "getEmail", "setEmail", "getName", "setName", "getSurname", "setSurname", "getAvatar", "setAvatar", "Ljava/lang/Integer;", "getNeedGoogleAuth", "setNeedGoogleAuth", "(Ljava/lang/Integer;)V", "getNeedHuaweiAuth", "setNeedHuaweiAuth", "getForecastsOrder", "setForecastsOrder", "getAlternativePayment", "setAlternativePayment", "getCpb", "setCpb", "getBadSubs", "Lbet/prediction/response/vtenth/User$Subscriptions;", "getSubscriptions", "setSubscriptions", "(Lbet/prediction/response/vtenth/User$Subscriptions;)V", "getModalDescEnable", "setModalDescEnable", "Subscriptions", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class User implements l {

    @b("need_alternative_payment")
    @Nullable
    private Integer alternativePayment;

    @b(AccountTable.avatarColumn)
    @Nullable
    private String avatar;

    @b("bad_subs")
    @Nullable
    private final Integer badSubs;

    @b("cpb")
    @Nullable
    private Integer cpb;

    @b(AccountTable.emailColumn)
    @Nullable
    private String email;

    @b("express")
    private int express;

    @b("forecastsOrder")
    @Nullable
    private Integer forecastsOrder;

    @b(CommonUrlParts.LOCALE)
    @Nullable
    private String locale;

    @b("show_additional_info_forecast")
    @Nullable
    private Integer modalDescEnable;

    @b("name")
    @Nullable
    private String name;

    @b("need_google_auth")
    @Nullable
    private Integer needGoogleAuth;

    @b("need_huawei_auth")
    @Nullable
    private Integer needHuaweiAuth;

    @b("premium")
    private int premium;

    @b("subscriptions")
    @Nullable
    private Subscriptions subscriptions;

    @b(AccountTable.surnameColumn)
    @Nullable
    private String surname;

    @b(AccountTable.tokenColumn)
    @Nullable
    private String token;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\u001cR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\u001cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010\u001c¨\u0006#"}, d2 = {"Lbet/prediction/response/vtenth/User$Subscriptions;", "Lx3/k;", "", "vip", "live", "premium", "express", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbet/prediction/response/vtenth/User$Subscriptions;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVip", "setVip", "(Ljava/lang/String;)V", "getLive", "setLive", "getPremium", "setPremium", "getExpress", "setExpress", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Subscriptions implements k {

        @b("express")
        @Nullable
        private String express;

        @b("live")
        @Nullable
        private String live;

        @b("premium")
        @Nullable
        private String premium;

        @b("vip")
        @Nullable
        private String vip;

        public Subscriptions(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.vip = str;
            this.live = str2;
            this.premium = str3;
            this.express = str4;
        }

        public static /* synthetic */ Subscriptions copy$default(Subscriptions subscriptions, String str, String str2, String str3, String str4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = subscriptions.vip;
            }
            if ((i5 & 2) != 0) {
                str2 = subscriptions.live;
            }
            if ((i5 & 4) != 0) {
                str3 = subscriptions.premium;
            }
            if ((i5 & 8) != 0) {
                str4 = subscriptions.express;
            }
            return subscriptions.copy(str, str2, str3, str4);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getVip() {
            return this.vip;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getLive() {
            return this.live;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getPremium() {
            return this.premium;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getExpress() {
            return this.express;
        }

        @NotNull
        public final Subscriptions copy(@Nullable String vip, @Nullable String live, @Nullable String premium, @Nullable String express) {
            return new Subscriptions(vip, live, premium, express);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subscriptions)) {
                return false;
            }
            Subscriptions subscriptions = (Subscriptions) other;
            return Intrinsics.areEqual(this.vip, subscriptions.vip) && Intrinsics.areEqual(this.live, subscriptions.live) && Intrinsics.areEqual(this.premium, subscriptions.premium) && Intrinsics.areEqual(this.express, subscriptions.express);
        }

        @Override // x3.k
        @Nullable
        public String getExpress() {
            return this.express;
        }

        @Override // x3.k
        @Nullable
        public String getLive() {
            return this.live;
        }

        @Override // x3.k
        @Nullable
        public String getPremium() {
            return this.premium;
        }

        @Override // x3.k
        @Nullable
        public String getVip() {
            return this.vip;
        }

        public int hashCode() {
            String str = this.vip;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.live;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.premium;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.express;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public void setExpress(@Nullable String str) {
            this.express = str;
        }

        public void setLive(@Nullable String str) {
            this.live = str;
        }

        public void setPremium(@Nullable String str) {
            this.premium = str;
        }

        public void setVip(@Nullable String str) {
            this.vip = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Subscriptions(vip=");
            sb2.append(this.vip);
            sb2.append(", live=");
            sb2.append(this.live);
            sb2.append(", premium=");
            sb2.append(this.premium);
            sb2.append(", express=");
            return e.k(sb2, this.express, ')');
        }
    }

    public User(int i5, int i10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Subscriptions subscriptions, @Nullable Integer num7) {
        this.premium = i5;
        this.express = i10;
        this.locale = str;
        this.token = str2;
        this.email = str3;
        this.name = str4;
        this.surname = str5;
        this.avatar = str6;
        this.needGoogleAuth = num;
        this.needHuaweiAuth = num2;
        this.forecastsOrder = num3;
        this.alternativePayment = num4;
        this.cpb = num5;
        this.badSubs = num6;
        this.subscriptions = subscriptions;
        this.modalDescEnable = num7;
    }

    /* renamed from: component1, reason: from getter */
    public final int getPremium() {
        return this.premium;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getNeedHuaweiAuth() {
        return this.needHuaweiAuth;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getForecastsOrder() {
        return this.forecastsOrder;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getAlternativePayment() {
        return this.alternativePayment;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getCpb() {
        return this.cpb;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getBadSubs() {
        return this.badSubs;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Subscriptions getSubscriptions() {
        return this.subscriptions;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getModalDescEnable() {
        return this.modalDescEnable;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExpress() {
        return this.express;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getNeedGoogleAuth() {
        return this.needGoogleAuth;
    }

    @NotNull
    public final User copy(int premium, int express, @Nullable String locale, @Nullable String token, @Nullable String email, @Nullable String name, @Nullable String surname, @Nullable String avatar, @Nullable Integer needGoogleAuth, @Nullable Integer needHuaweiAuth, @Nullable Integer forecastsOrder, @Nullable Integer alternativePayment, @Nullable Integer cpb, @Nullable Integer badSubs, @Nullable Subscriptions subscriptions, @Nullable Integer modalDescEnable) {
        return new User(premium, express, locale, token, email, name, surname, avatar, needGoogleAuth, needHuaweiAuth, forecastsOrder, alternativePayment, cpb, badSubs, subscriptions, modalDescEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return this.premium == user.premium && this.express == user.express && Intrinsics.areEqual(this.locale, user.locale) && Intrinsics.areEqual(this.token, user.token) && Intrinsics.areEqual(this.email, user.email) && Intrinsics.areEqual(this.name, user.name) && Intrinsics.areEqual(this.surname, user.surname) && Intrinsics.areEqual(this.avatar, user.avatar) && Intrinsics.areEqual(this.needGoogleAuth, user.needGoogleAuth) && Intrinsics.areEqual(this.needHuaweiAuth, user.needHuaweiAuth) && Intrinsics.areEqual(this.forecastsOrder, user.forecastsOrder) && Intrinsics.areEqual(this.alternativePayment, user.alternativePayment) && Intrinsics.areEqual(this.cpb, user.cpb) && Intrinsics.areEqual(this.badSubs, user.badSubs) && Intrinsics.areEqual(this.subscriptions, user.subscriptions) && Intrinsics.areEqual(this.modalDescEnable, user.modalDescEnable);
    }

    @Override // x3.l
    @Nullable
    public Integer getAlternativePayment() {
        return this.alternativePayment;
    }

    @Override // x3.l
    @Nullable
    public String getAvatar() {
        return this.avatar;
    }

    @Override // x3.l
    @Nullable
    public Integer getBadSubs() {
        return this.badSubs;
    }

    @Override // x3.l
    @Nullable
    public Integer getCpb() {
        return this.cpb;
    }

    @Override // x3.l
    @Nullable
    public String getEmail() {
        return this.email;
    }

    @Override // x3.l
    public int getExpress() {
        return this.express;
    }

    @Override // x3.l
    @Nullable
    public Integer getForecastsOrder() {
        return this.forecastsOrder;
    }

    @Override // x3.l
    @Nullable
    public String getLocale() {
        return this.locale;
    }

    @Override // x3.l
    @Nullable
    public Integer getModalDescEnable() {
        return this.modalDescEnable;
    }

    @Override // x3.l
    @Nullable
    public String getName() {
        return this.name;
    }

    @Override // x3.l
    @Nullable
    public Integer getNeedGoogleAuth() {
        return this.needGoogleAuth;
    }

    @Override // x3.l
    @Nullable
    public Integer getNeedHuaweiAuth() {
        return this.needHuaweiAuth;
    }

    @Override // x3.l
    public int getPremium() {
        return this.premium;
    }

    @Override // x3.l
    @Nullable
    public String getSurname() {
        return this.surname;
    }

    @Override // x3.l
    @Nullable
    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        int i5 = ((this.premium * 31) + this.express) * 31;
        String str = this.locale;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.surname;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.avatar;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.needGoogleAuth;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.needHuaweiAuth;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.forecastsOrder;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.alternativePayment;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.cpb;
        int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.badSubs;
        int hashCode12 = (hashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Subscriptions subscriptions = this.subscriptions;
        int hashCode13 = (hashCode12 + (subscriptions == null ? 0 : subscriptions.hashCode())) * 31;
        Integer num7 = this.modalDescEnable;
        return hashCode13 + (num7 != null ? num7.hashCode() : 0);
    }

    public void setAlternativePayment(@Nullable Integer num) {
        this.alternativePayment = num;
    }

    public void setAvatar(@Nullable String str) {
        this.avatar = str;
    }

    public void setCpb(@Nullable Integer num) {
        this.cpb = num;
    }

    public void setEmail(@Nullable String str) {
        this.email = str;
    }

    public void setExpress(int i5) {
        this.express = i5;
    }

    public void setForecastsOrder(@Nullable Integer num) {
        this.forecastsOrder = num;
    }

    public void setLocale(@Nullable String str) {
        this.locale = str;
    }

    public void setModalDescEnable(@Nullable Integer num) {
        this.modalDescEnable = num;
    }

    public void setName(@Nullable String str) {
        this.name = str;
    }

    public void setNeedGoogleAuth(@Nullable Integer num) {
        this.needGoogleAuth = num;
    }

    public void setNeedHuaweiAuth(@Nullable Integer num) {
        this.needHuaweiAuth = num;
    }

    public void setPremium(int i5) {
        this.premium = i5;
    }

    public void setSubscriptions(@Nullable Subscriptions subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void setSurname(@Nullable String str) {
        this.surname = str;
    }

    public void setToken(@Nullable String str) {
        this.token = str;
    }

    @NotNull
    public String toString() {
        return "User(premium=" + this.premium + ", express=" + this.express + ", locale=" + this.locale + ", token=" + this.token + ", email=" + this.email + ", name=" + this.name + ", surname=" + this.surname + ", avatar=" + this.avatar + ", needGoogleAuth=" + this.needGoogleAuth + ", needHuaweiAuth=" + this.needHuaweiAuth + ", forecastsOrder=" + this.forecastsOrder + ", alternativePayment=" + this.alternativePayment + ", cpb=" + this.cpb + ", badSubs=" + this.badSubs + ", subscriptions=" + this.subscriptions + ", modalDescEnable=" + this.modalDescEnable + ')';
    }

    @Override // x3.l
    @Nullable
    public Subscriptions getSubscriptions() {
        return this.subscriptions;
    }
}
