package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.lo;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;

    @NonNull
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;

    @NonNull
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final BigDecimal f11296a;

        /* renamed from: b, reason: collision with root package name */
        private final Currency f11297b;

        /* renamed from: c, reason: collision with root package name */
        private AdType f11298c;

        /* renamed from: d, reason: collision with root package name */
        private String f11299d;

        /* renamed from: e, reason: collision with root package name */
        private String f11300e;

        /* renamed from: f, reason: collision with root package name */
        private String f11301f;

        /* renamed from: g, reason: collision with root package name */
        private String f11302g;

        /* renamed from: h, reason: collision with root package name */
        private String f11303h;

        /* renamed from: i, reason: collision with root package name */
        private String f11304i;
        private Map j;

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i5) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f11296a, this.f11297b, this.f11298c, this.f11299d, this.f11300e, this.f11301f, this.f11302g, this.f11303h, this.f11304i, this.j, 0);
        }

        public Builder withAdNetwork(String str) {
            this.f11299d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f11302g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f11303h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f11298c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f11300e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f11301f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(String str) {
            this.f11304i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f11296a = bigDecimal;
            this.f11297b = currency;
        }
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i5) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(@NonNull BigDecimal bigDecimal, @NonNull Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j, @NonNull Currency currency) {
        return new Builder(lo.a(j), currency, 0);
    }

    public static Builder newBuilder(double d10, @NonNull Currency currency) {
        return new Builder(new BigDecimal(lo.a(d10)), currency, 0);
    }
}
