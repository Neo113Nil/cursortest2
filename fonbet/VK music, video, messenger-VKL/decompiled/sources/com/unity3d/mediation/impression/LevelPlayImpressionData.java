package com.unity3d.mediation.impression;

import java.text.DecimalFormat;
import org.json.JSONObject;
import xsna.i5s;
import xsna.n6j;
import xsna.xe9;
import xsna.zcl;

/* loaded from: classes14.dex */
public final class LevelPlayImpressionData {
    public static final a Companion = new a(null);
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";
    private final JSONObject a;
    private final DecimalFormat b = new DecimalFormat("#.#####");

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayImpressionData(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final String getAb() {
        String optString = this.a.optString("ab", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final String getAdFormat() {
        String optString = this.a.optString("adFormat", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final String getAdNetwork() {
        String optString = this.a.optString("adNetwork", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final JSONObject getAllData() {
        return this.a;
    }

    public final String getAuctionId() {
        String optString = this.a.optString("auctionId", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final String getCountry() {
        String optString = this.a.optString("country", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final String getCreativeId() {
        String optString = this.a.optString("creativeId", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final String getEncryptedCPM() {
        String optString = this.a.optString("encryptedCPM", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final String getInstanceId() {
        String optString = this.a.optString("instanceId", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final String getInstanceName() {
        String optString = this.a.optString("instanceName", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final String getMediationAdUnitId() {
        String optString = this.a.optString("mediationAdUnitId", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final String getMediationAdUnitName() {
        String optString = this.a.optString("mediationAdUnitName", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final String getPlacement() {
        String optString = this.a.optString("placement", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final String getPrecision() {
        String optString = this.a.optString("precision", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

    public final Double getRevenue() {
        double optDouble = this.a.optDouble("revenue");
        Double valueOf = Double.valueOf(optDouble);
        if (Double.isNaN(optDouble)) {
            return null;
        }
        return valueOf;
    }

    public final String getSegmentName() {
        String optString = this.a.optString("segmentName", "");
        if (optString.length() > 0) {
            return optString;
        }
        return null;
    }

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
        StringBuilder a2 = xe9.a("auctionId: '", auctionId, "', mediationAdUnitName: '", mediationAdUnitName, "', mediationAdUnitId: '");
        n6j.b(a2, mediationAdUnitId, "', adFormat: '", adFormat, "', country: '");
        n6j.b(a2, country, "', ab: '", ab, "', segmentName: '");
        n6j.b(a2, segmentName, "', placement: '", placement, "', adNetwork: '");
        n6j.b(a2, adNetwork, "', instanceName: '", instanceName, "', instanceId: '");
        n6j.b(a2, instanceId, "', revenue: ", format, ", precision: '");
        n6j.b(a2, precision, "', encryptedCPM: '", encryptedCPM, "', creativeId: '");
        return i5s.a(a2, creativeId, "'");
    }
}
