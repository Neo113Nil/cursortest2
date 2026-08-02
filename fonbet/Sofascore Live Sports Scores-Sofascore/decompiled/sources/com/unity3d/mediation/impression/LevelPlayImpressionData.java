package com.unity3d.mediation.impression;

import defpackage.bf3;
import defpackage.mz1;
import java.text.DecimalFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlayImpressionData {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    @NotNull
    private final JSONObject a;

    @NotNull
    private final DecimalFormat b;

    public LevelPlayImpressionData(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
        this.b = new DecimalFormat("#.#####");
    }

    @Nullable
    public final String getAb() {
        String optString = this.a.optString("ab", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final String getAdFormat() {
        String optString = this.a.optString("adFormat", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final String getAdNetwork() {
        String optString = this.a.optString("adNetwork", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @NotNull
    public final JSONObject getAllData() {
        return this.a;
    }

    @Nullable
    public final String getAuctionId() {
        String optString = this.a.optString("auctionId", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final String getCountry() {
        String optString = this.a.optString("country", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final String getCreativeId() {
        String optString = this.a.optString("creativeId", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final String getEncryptedCPM() {
        String optString = this.a.optString("encryptedCPM", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final String getInstanceId() {
        String optString = this.a.optString("instanceId", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final String getInstanceName() {
        String optString = this.a.optString("instanceName", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final String getMediationAdUnitId() {
        String optString = this.a.optString("mediationAdUnitId", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final String getMediationAdUnitName() {
        String optString = this.a.optString("mediationAdUnitName", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final String getPlacement() {
        String optString = this.a.optString("placement", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final String getPrecision() {
        String optString = this.a.optString("precision", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @Nullable
    public final Double getRevenue() {
        double optDouble = this.a.optDouble("revenue");
        Double valueOf = Double.valueOf(optDouble);
        if (Double.isNaN(optDouble)) {
            return null;
        }
        return valueOf;
    }

    @Nullable
    public final String getSegmentName() {
        String optString = this.a.optString("segmentName", "");
        optString.getClass();
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    @NotNull
    public String toString() {
        LevelPlayImpressionData levelPlayImpressionData;
        String format;
        String auctionId = getAuctionId();
        String mediationAdUnitName = getMediationAdUnitName();
        String mediationAdUnitId = getMediationAdUnitId();
        String adFormat = getAdFormat();
        String country = getCountry();
        String ab = getAb();
        String segmentName = getSegmentName();
        String placement = getPlacement();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        if (getRevenue() == null) {
            format = null;
            levelPlayImpressionData = this;
        } else {
            levelPlayImpressionData = this;
            format = levelPlayImpressionData.b.format(levelPlayImpressionData.getRevenue());
        }
        String precision = levelPlayImpressionData.getPrecision();
        String encryptedCPM = levelPlayImpressionData.getEncryptedCPM();
        String creativeId = levelPlayImpressionData.getCreativeId();
        StringBuilder s = mz1.s("auctionId: '", auctionId, "', mediationAdUnitName: '", mediationAdUnitName, "', mediationAdUnitId: '");
        bf3.v(s, mediationAdUnitId, "', adFormat: '", adFormat, "', country: '");
        bf3.v(s, country, "', ab: '", ab, "', segmentName: '");
        bf3.v(s, segmentName, "', placement: '", placement, "', adNetwork: '");
        bf3.v(s, adNetwork, "', instanceName: '", instanceName, "', instanceId: '");
        bf3.v(s, instanceId, "', revenue: ", format, ", precision: '");
        bf3.v(s, precision, "', encryptedCPM: '", encryptedCPM, "', creativeId: '");
        return mz1.o(s, creativeId, "'");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
