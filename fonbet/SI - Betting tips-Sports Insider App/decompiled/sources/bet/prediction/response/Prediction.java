package bet.prediction.response;

import com.sports.insider.data.repository.room.live.LiveTable;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import d9.e;
import io.appmetrica.analytics.impl.C0644z2;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o9.b;
import okio.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0080\b\u0018\u0000 t2\u00020\u0001:\u0003rstBã\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0016\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010]\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00101J\u0010\u0010^\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000b\u0010f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u000b\u0010h\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u0016\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010UJö\u0001\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\u00052\b\u0010n\u001a\u0004\u0018\u00010oHÖ\u0003J\t\u0010p\u001a\u00020\u0003HÖ\u0001J\t\u0010q\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b5\u00101\"\u0004\b6\u00103R \u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b9\u00101\"\u0004\b:\u00103R \u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010(\"\u0004\b<\u0010*R \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\bA\u0010#\"\u0004\bB\u0010%R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\bC\u0010#\"\u0004\bD\u0010%R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010I\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR \u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010(\"\u0004\bK\u0010*R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010I\u001a\u0004\bL\u0010F\"\u0004\bM\u0010HR \u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010(\"\u0004\bO\u0010*R&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR(\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010X\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006u"}, d2 = {"Lbet/prediction/response/Prediction;", "Ljava/io/Serializable;", "id", "", PredictionTable.publicationColumn, "", "lang", "", "existLang", "", LiveTable.createDateColumn, "", "changeDate", "leagueName", PredictionTable.startTimeColumn, C0644z2.f14985g, "analytics", "Lbet/prediction/response/Prediction$Analytics;", PredictionTable.resultsIsViewedColumn, "purchased", "type", "priceType", "purchaseType", PredictionTable.statusColumn, PredictionTable.forecastsColumn, "", "Lbet/prediction/response/Prediction$Forecast;", "kindsOfSport", "<init>", "(ILjava/lang/Boolean;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lbet/prediction/response/Prediction$Analytics;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;[Ljava/lang/Integer;)V", "getId", "()I", "setId", "(I)V", "getPublication", "()Ljava/lang/Boolean;", "setPublication", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "getExistLang", "()[Ljava/lang/String;", "setExistLang", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "getCreateDate", "()Ljava/lang/Long;", "setCreateDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getChangeDate", "setChangeDate", "getLeagueName", "setLeagueName", "getStartTime", "setStartTime", "getBackground", "setBackground", "getAnalytics", "()Lbet/prediction/response/Prediction$Analytics;", "setAnalytics", "(Lbet/prediction/response/Prediction$Analytics;)V", "getResultsIsViewed", "setResultsIsViewed", "getPurchased", "setPurchased", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPriceType", "setPriceType", "getPurchaseType", "setPurchaseType", "getStatus", "setStatus", "getForecasts", "()Ljava/util/List;", "setForecasts", "(Ljava/util/List;)V", "getKindsOfSport", "()[Ljava/lang/Integer;", "setKindsOfSport", "([Ljava/lang/Integer;)V", "[Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(ILjava/lang/Boolean;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lbet/prediction/response/Prediction$Analytics;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;[Ljava/lang/Integer;)Lbet/prediction/response/Prediction;", "equals", "other", "", "hashCode", "toString", "Analytics", "Forecast", "Companion", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Prediction implements Serializable {
    public static final int DEFAULT_TYPE = 1;
    public static final int EXPRESS_TYPE = 3;

    @NotNull
    public static final String IN_AWAITING = "unknown";

    @NotNull
    public static final String NOT_PASSED = "fail";

    @NotNull
    public static final String PASSED = "success";
    public static final int PREMIUM_TYPE = 2;

    @NotNull
    public static final String RETURN = "return";

    @b("analytics")
    @Nullable
    private Analytics analytics;

    @b(C0644z2.f14985g)
    @Nullable
    private String background;

    @b("changeDate")
    @Nullable
    private Long changeDate;

    @b(LiveTable.createDateColumn)
    @Nullable
    private Long createDate;

    @b("existLang")
    @Nullable
    private String[] existLang;

    @b(PredictionTable.forecastsColumn)
    @Nullable
    private List<Forecast> forecasts;

    @b("id")
    private int id;

    @b("kindsOfSport")
    @Nullable
    private Integer[] kindsOfSport;

    @b("lang")
    @Nullable
    private String lang;

    @b("leagueName")
    @Nullable
    private String leagueName;

    @b("priceType")
    @Nullable
    private String priceType;

    @b(PredictionTable.publicationColumn)
    @Nullable
    private Boolean publication;

    @b("purchaseType")
    @Nullable
    private Integer purchaseType;

    @b("purchased")
    @Nullable
    private Boolean purchased;

    @b(PredictionTable.resultsIsViewedColumn)
    @Nullable
    private Boolean resultsIsViewed;

    @b(PredictionTable.startTimeColumn)
    @Nullable
    private Long startTime;

    @b(PredictionTable.statusColumn)
    @Nullable
    private String status;

    @b("type")
    @Nullable
    private Integer type;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lbet/prediction/response/Prediction$Analytics;", "Ljava/io/Serializable;", "full", "", "short", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFull", "()Ljava/lang/String;", "getShort", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Analytics implements Serializable {

        @b("full")
        @Nullable
        private final String full;

        @b("short")
        @Nullable
        private final String short;

        public Analytics(@Nullable String str, @Nullable String str2) {
            this.full = str;
            this.short = str2;
        }

        public static /* synthetic */ Analytics copy$default(Analytics analytics, String str, String str2, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = analytics.full;
            }
            if ((i5 & 2) != 0) {
                str2 = analytics.short;
            }
            return analytics.copy(str, str2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getFull() {
            return this.full;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getShort() {
            return this.short;
        }

        @NotNull
        public final Analytics copy(@Nullable String full, @Nullable String r32) {
            return new Analytics(full, r32);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) other;
            return Intrinsics.areEqual(this.full, analytics.full) && Intrinsics.areEqual(this.short, analytics.short);
        }

        @Nullable
        public final String getFull() {
            return this.full;
        }

        @Nullable
        public final String getShort() {
            return this.short;
        }

        public int hashCode() {
            String str = this.full;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.short;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Analytics(full=");
            sb2.append(this.full);
            sb2.append(", short=");
            return e.k(sb2, this.short, ')');
        }
    }

    public Prediction(int i5, @Nullable Boolean bool, @Nullable String str, @Nullable String[] strArr, @Nullable Long l6, @Nullable Long l10, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable Analytics analytics, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num, @Nullable String str4, @Nullable Integer num2, @Nullable String str5, @Nullable List<Forecast> list, @Nullable Integer[] numArr) {
        this.id = i5;
        this.publication = bool;
        this.lang = str;
        this.existLang = strArr;
        this.createDate = l6;
        this.changeDate = l10;
        this.leagueName = str2;
        this.startTime = l11;
        this.background = str3;
        this.analytics = analytics;
        this.resultsIsViewed = bool2;
        this.purchased = bool3;
        this.type = num;
        this.priceType = str4;
        this.purchaseType = num2;
        this.status = str5;
        this.forecasts = list;
        this.kindsOfSport = numArr;
    }

    public static /* synthetic */ Prediction copy$default(Prediction prediction, int i5, Boolean bool, String str, String[] strArr, Long l6, Long l10, String str2, Long l11, String str3, Analytics analytics, Boolean bool2, Boolean bool3, Integer num, String str4, Integer num2, String str5, List list, Integer[] numArr, int i10, Object obj) {
        Integer[] numArr2;
        List list2;
        int i11 = (i10 & 1) != 0 ? prediction.id : i5;
        Boolean bool4 = (i10 & 2) != 0 ? prediction.publication : bool;
        String str6 = (i10 & 4) != 0 ? prediction.lang : str;
        String[] strArr2 = (i10 & 8) != 0 ? prediction.existLang : strArr;
        Long l12 = (i10 & 16) != 0 ? prediction.createDate : l6;
        Long l13 = (i10 & 32) != 0 ? prediction.changeDate : l10;
        String str7 = (i10 & 64) != 0 ? prediction.leagueName : str2;
        Long l14 = (i10 & 128) != 0 ? prediction.startTime : l11;
        String str8 = (i10 & 256) != 0 ? prediction.background : str3;
        Analytics analytics2 = (i10 & 512) != 0 ? prediction.analytics : analytics;
        Boolean bool5 = (i10 & Segment.SHARE_MINIMUM) != 0 ? prediction.resultsIsViewed : bool2;
        Boolean bool6 = (i10 & 2048) != 0 ? prediction.purchased : bool3;
        Integer num3 = (i10 & 4096) != 0 ? prediction.type : num;
        String str9 = (i10 & Segment.SIZE) != 0 ? prediction.priceType : str4;
        int i12 = i11;
        Integer num4 = (i10 & 16384) != 0 ? prediction.purchaseType : num2;
        String str10 = (i10 & 32768) != 0 ? prediction.status : str5;
        List list3 = (i10 & 65536) != 0 ? prediction.forecasts : list;
        if ((i10 & 131072) != 0) {
            list2 = list3;
            numArr2 = prediction.kindsOfSport;
        } else {
            numArr2 = numArr;
            list2 = list3;
        }
        return prediction.copy(i12, bool4, str6, strArr2, l12, l13, str7, l14, str8, analytics2, bool5, bool6, num3, str9, num4, str10, list2, numArr2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Boolean getResultsIsViewed() {
        return this.resultsIsViewed;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Boolean getPurchased() {
        return this.purchased;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getPriceType() {
        return this.priceType;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getPurchaseType() {
        return this.purchaseType;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<Forecast> component17() {
        return this.forecasts;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer[] getKindsOfSport() {
        return this.kindsOfSport;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getPublication() {
        return this.publication;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String[] getExistLang() {
        return this.existLang;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getCreateDate() {
        return this.createDate;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Long getChangeDate() {
        return this.changeDate;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getBackground() {
        return this.background;
    }

    @NotNull
    public final Prediction copy(int id2, @Nullable Boolean publication, @Nullable String lang, @Nullable String[] existLang, @Nullable Long createDate, @Nullable Long changeDate, @Nullable String leagueName, @Nullable Long startTime, @Nullable String background, @Nullable Analytics analytics, @Nullable Boolean resultsIsViewed, @Nullable Boolean purchased, @Nullable Integer type, @Nullable String priceType, @Nullable Integer purchaseType, @Nullable String status, @Nullable List<Forecast> forecasts, @Nullable Integer[] kindsOfSport) {
        return new Prediction(id2, publication, lang, existLang, createDate, changeDate, leagueName, startTime, background, analytics, resultsIsViewed, purchased, type, priceType, purchaseType, status, forecasts, kindsOfSport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Prediction)) {
            return false;
        }
        Prediction prediction = (Prediction) other;
        return this.id == prediction.id && Intrinsics.areEqual(this.publication, prediction.publication) && Intrinsics.areEqual(this.lang, prediction.lang) && Intrinsics.areEqual(this.existLang, prediction.existLang) && Intrinsics.areEqual(this.createDate, prediction.createDate) && Intrinsics.areEqual(this.changeDate, prediction.changeDate) && Intrinsics.areEqual(this.leagueName, prediction.leagueName) && Intrinsics.areEqual(this.startTime, prediction.startTime) && Intrinsics.areEqual(this.background, prediction.background) && Intrinsics.areEqual(this.analytics, prediction.analytics) && Intrinsics.areEqual(this.resultsIsViewed, prediction.resultsIsViewed) && Intrinsics.areEqual(this.purchased, prediction.purchased) && Intrinsics.areEqual(this.type, prediction.type) && Intrinsics.areEqual(this.priceType, prediction.priceType) && Intrinsics.areEqual(this.purchaseType, prediction.purchaseType) && Intrinsics.areEqual(this.status, prediction.status) && Intrinsics.areEqual(this.forecasts, prediction.forecasts) && Intrinsics.areEqual(this.kindsOfSport, prediction.kindsOfSport);
    }

    @Nullable
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @Nullable
    public final String getBackground() {
        return this.background;
    }

    @Nullable
    public final Long getChangeDate() {
        return this.changeDate;
    }

    @Nullable
    public final Long getCreateDate() {
        return this.createDate;
    }

    @Nullable
    public final String[] getExistLang() {
        return this.existLang;
    }

    @Nullable
    public final List<Forecast> getForecasts() {
        return this.forecasts;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer[] getKindsOfSport() {
        return this.kindsOfSport;
    }

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    public final String getLeagueName() {
        return this.leagueName;
    }

    @Nullable
    public final String getPriceType() {
        return this.priceType;
    }

    @Nullable
    public final Boolean getPublication() {
        return this.publication;
    }

    @Nullable
    public final Integer getPurchaseType() {
        return this.purchaseType;
    }

    @Nullable
    public final Boolean getPurchased() {
        return this.purchased;
    }

    @Nullable
    public final Boolean getResultsIsViewed() {
        return this.resultsIsViewed;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int i5 = this.id * 31;
        Boolean bool = this.publication;
        int hashCode = (i5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.lang;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String[] strArr = this.existLang;
        int hashCode3 = (hashCode2 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        Long l6 = this.createDate;
        int hashCode4 = (hashCode3 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l10 = this.changeDate;
        int hashCode5 = (hashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.leagueName;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.startTime;
        int hashCode7 = (hashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.background;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int hashCode9 = (hashCode8 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Boolean bool2 = this.resultsIsViewed;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.purchased;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.type;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.priceType;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.purchaseType;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.status;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<Forecast> list = this.forecasts;
        int hashCode16 = (hashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        Integer[] numArr = this.kindsOfSport;
        return hashCode16 + (numArr != null ? Arrays.hashCode(numArr) : 0);
    }

    public final void setAnalytics(@Nullable Analytics analytics) {
        this.analytics = analytics;
    }

    public final void setBackground(@Nullable String str) {
        this.background = str;
    }

    public final void setChangeDate(@Nullable Long l6) {
        this.changeDate = l6;
    }

    public final void setCreateDate(@Nullable Long l6) {
        this.createDate = l6;
    }

    public final void setExistLang(@Nullable String[] strArr) {
        this.existLang = strArr;
    }

    public final void setForecasts(@Nullable List<Forecast> list) {
        this.forecasts = list;
    }

    public final void setId(int i5) {
        this.id = i5;
    }

    public final void setKindsOfSport(@Nullable Integer[] numArr) {
        this.kindsOfSport = numArr;
    }

    public final void setLang(@Nullable String str) {
        this.lang = str;
    }

    public final void setLeagueName(@Nullable String str) {
        this.leagueName = str;
    }

    public final void setPriceType(@Nullable String str) {
        this.priceType = str;
    }

    public final void setPublication(@Nullable Boolean bool) {
        this.publication = bool;
    }

    public final void setPurchaseType(@Nullable Integer num) {
        this.purchaseType = num;
    }

    public final void setPurchased(@Nullable Boolean bool) {
        this.purchased = bool;
    }

    public final void setResultsIsViewed(@Nullable Boolean bool) {
        this.resultsIsViewed = bool;
    }

    public final void setStartTime(@Nullable Long l6) {
        this.startTime = l6;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Prediction(id=");
        sb2.append(this.id);
        sb2.append(", publication=");
        sb2.append(this.publication);
        sb2.append(", lang=");
        sb2.append(this.lang);
        sb2.append(", existLang=");
        sb2.append(Arrays.toString(this.existLang));
        sb2.append(", createDate=");
        sb2.append(this.createDate);
        sb2.append(", changeDate=");
        sb2.append(this.changeDate);
        sb2.append(", leagueName=");
        sb2.append(this.leagueName);
        sb2.append(", startTime=");
        sb2.append(this.startTime);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", resultsIsViewed=");
        sb2.append(this.resultsIsViewed);
        sb2.append(", purchased=");
        sb2.append(this.purchased);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", priceType=");
        sb2.append(this.priceType);
        sb2.append(", purchaseType=");
        sb2.append(this.purchaseType);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", forecasts=");
        sb2.append(this.forecasts);
        sb2.append(", kindsOfSport=");
        return e.k(sb2, Arrays.toString(this.kindsOfSport), ')');
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lbet/prediction/response/Prediction$Forecast;", "Ljava/io/Serializable;", PredictionTable.forecastColumn, "", "coefficient", "own", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getForecast", "()Ljava/lang/String;", "setForecast", "(Ljava/lang/String;)V", "getCoefficient", "getOwn", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Forecast implements Serializable {

        @b("coefficient")
        @NotNull
        private final String coefficient;

        @b("predict")
        @Nullable
        private String forecast;

        @b("own")
        private final boolean own;

        public Forecast(@Nullable String str, @NotNull String coefficient, boolean z5) {
            Intrinsics.checkNotNullParameter(coefficient, "coefficient");
            this.forecast = str;
            this.coefficient = coefficient;
            this.own = z5;
        }

        public static /* synthetic */ Forecast copy$default(Forecast forecast, String str, String str2, boolean z5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = forecast.forecast;
            }
            if ((i5 & 2) != 0) {
                str2 = forecast.coefficient;
            }
            if ((i5 & 4) != 0) {
                z5 = forecast.own;
            }
            return forecast.copy(str, str2, z5);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getForecast() {
            return this.forecast;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getCoefficient() {
            return this.coefficient;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getOwn() {
            return this.own;
        }

        @NotNull
        public final Forecast copy(@Nullable String forecast, @NotNull String coefficient, boolean own) {
            Intrinsics.checkNotNullParameter(coefficient, "coefficient");
            return new Forecast(forecast, coefficient, own);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Forecast)) {
                return false;
            }
            Forecast forecast = (Forecast) other;
            return Intrinsics.areEqual(this.forecast, forecast.forecast) && Intrinsics.areEqual(this.coefficient, forecast.coefficient) && this.own == forecast.own;
        }

        @NotNull
        public final String getCoefficient() {
            return this.coefficient;
        }

        @Nullable
        public final String getForecast() {
            return this.forecast;
        }

        public final boolean getOwn() {
            return this.own;
        }

        public int hashCode() {
            String str = this.forecast;
            return k.j((str == null ? 0 : str.hashCode()) * 31, 31, this.coefficient) + (this.own ? 1231 : 1237);
        }

        public final void setForecast(@Nullable String str) {
            this.forecast = str;
        }

        @NotNull
        public String toString() {
            return "Forecast(forecast=" + this.forecast + ", coefficient=" + this.coefficient + ", own=" + this.own + ')';
        }

        public /* synthetic */ Forecast(String str, String str2, boolean z5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? "" : str, str2, z5);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Prediction(int i5, Boolean bool, String str, String[] strArr, Long l6, Long l10, String str2, Long l11, String str3, Analytics analytics, Boolean bool2, Boolean bool3, Integer num, String str4, Integer num2, String str5, List list, Integer[] numArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i5, r5, r6, r7, r8, (i10 & 32) != 0 ? r8 : l10, (i10 & 64) != 0 ? "" : str2, (i10 & 128) != 0 ? 0L : l11, str3, analytics, (i10 & Segment.SHARE_MINIMUM) != 0 ? Boolean.FALSE : bool2, (i10 & 2048) != 0 ? Boolean.FALSE : bool3, (i10 & 4096) != 0 ? 1 : num, str4, num2, (32768 & i10) != 0 ? "unknown" : str5, list, (i10 & 131072) != 0 ? new Integer[0] : numArr);
        Boolean bool4 = (i10 & 2) != 0 ? Boolean.TRUE : bool;
        String str6 = (i10 & 4) != 0 ? "en" : str;
        String[] strArr2 = (i10 & 8) != 0 ? new String[]{"ru"} : strArr;
        Long l12 = (i10 & 16) != 0 ? 0L : l6;
    }
}
