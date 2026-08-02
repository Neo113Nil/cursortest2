package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AdData;
import defpackage.bf3;
import defpackage.e9k;
import defpackage.fn0;
import defpackage.mz1;
import defpackage.wt3;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_AdData extends AdData {

    @Nullable
    private final String adId;

    @Nullable
    private final AdPodInfoData adPodInfo;

    @Nullable
    private final String adSystem;

    @Nullable
    private final List<String> adWrapperCreativeIds;

    @Nullable
    private final List<String> adWrapperIds;

    @Nullable
    private final List<String> adWrapperSystems;

    @Nullable
    private final String advertiserName;

    @Nullable
    private final String clickThroughUrl;

    @Nullable
    private final List<CompanionAdData> companions;

    @Nullable
    private final String contentType;

    @Nullable
    private final String creativeAdId;

    @Nullable
    private final String creativeId;

    @Nullable
    private final String dealId;

    @Nullable
    private final String description;

    @Nullable
    private final Boolean disableUi;

    @Nullable
    private final Double duration;

    @Nullable
    private final Integer height;

    @Nullable
    private final Boolean linear;

    @Nullable
    private final Double skipTimeOffset;

    @Nullable
    private final Boolean skippable;

    @Nullable
    private final String surveyUrl;

    @Nullable
    private final String title;

    @Nullable
    private final String traffickingParameters;

    @Nullable
    private final Set<e9k> uiElements;

    @Nullable
    private final List<UniversalAdIdData> universalAdIds;

    @Nullable
    private final Integer vastMediaBitrate;

    @Nullable
    private final Integer vastMediaHeight;

    @Nullable
    private final Integer vastMediaWidth;

    @Nullable
    private final Integer width;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends AdData.Builder {
        private String adId;
        private AdPodInfoData adPodInfo;
        private String adSystem;
        private List<String> adWrapperCreativeIds;
        private List<String> adWrapperIds;
        private List<String> adWrapperSystems;
        private String advertiserName;
        private String clickThroughUrl;
        private List<CompanionAdData> companions;
        private String contentType;
        private String creativeAdId;
        private String creativeId;
        private String dealId;
        private String description;
        private Boolean disableUi;
        private Double duration;
        private Integer height;
        private Boolean linear;
        private Double skipTimeOffset;
        private Boolean skippable;
        private String surveyUrl;
        private String title;
        private String traffickingParameters;
        private Set<e9k> uiElements;
        private List<UniversalAdIdData> universalAdIds;
        private Integer vastMediaBitrate;
        private Integer vastMediaHeight;
        private Integer vastMediaWidth;
        private Integer width;

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData build() {
            return new AutoValue_AdData(this.adId, this.creativeId, this.creativeAdId, this.adSystem, this.linear, this.skippable, this.skipTimeOffset, this.disableUi, this.title, this.description, this.contentType, this.advertiserName, this.surveyUrl, this.dealId, this.width, this.height, this.vastMediaBitrate, this.vastMediaHeight, this.vastMediaWidth, this.traffickingParameters, this.clickThroughUrl, this.duration, this.adPodInfo, this.uiElements, this.companions, this.adWrapperIds, this.adWrapperSystems, this.adWrapperCreativeIds, this.universalAdIds, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdId(String str) {
            this.adId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdPodInfo(AdPodInfoData adPodInfoData) {
            this.adPodInfo = adPodInfoData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdSystem(String str) {
            this.adSystem = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdWrapperCreativeIds(List<String> list) {
            this.adWrapperCreativeIds = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdWrapperIds(List<String> list) {
            this.adWrapperIds = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdWrapperSystems(List<String> list) {
            this.adWrapperSystems = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setAdvertiserName(String str) {
            this.advertiserName = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setClickThroughUrl(String str) {
            this.clickThroughUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setCompanions(List<CompanionAdData> list) {
            this.companions = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setContentType(String str) {
            this.contentType = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setCreativeAdId(String str) {
            this.creativeAdId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setCreativeId(String str) {
            this.creativeId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setDealId(String str) {
            this.dealId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setDisableUi(Boolean bool) {
            this.disableUi = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setDuration(Double d) {
            this.duration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setHeight(Integer num) {
            this.height = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setLinear(Boolean bool) {
            this.linear = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setSkipTimeOffset(Double d) {
            this.skipTimeOffset = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setSkippable(Boolean bool) {
            this.skippable = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setSurveyUrl(String str) {
            this.surveyUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setTraffickingParameters(String str) {
            this.traffickingParameters = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setUiElements(Set<e9k> set) {
            this.uiElements = set;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setUniversalAdIds(List<UniversalAdIdData> list) {
            this.universalAdIds = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setVastMediaBitrate(Integer num) {
            this.vastMediaBitrate = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setVastMediaHeight(Integer num) {
            this.vastMediaHeight = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setVastMediaWidth(Integer num) {
            this.vastMediaWidth = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.AdData.Builder
        public AdData.Builder setWidth(Integer num) {
            this.width = num;
            return this;
        }
    }

    private AutoValue_AdData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Double d, @Nullable Boolean bool3, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str11, @Nullable String str12, @Nullable Double d2, @Nullable AdPodInfoData adPodInfoData, @Nullable Set<e9k> set, @Nullable List<CompanionAdData> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable List<UniversalAdIdData> list5) {
        this.adId = str;
        this.creativeId = str2;
        this.creativeAdId = str3;
        this.adSystem = str4;
        this.linear = bool;
        this.skippable = bool2;
        this.skipTimeOffset = d;
        this.disableUi = bool3;
        this.title = str5;
        this.description = str6;
        this.contentType = str7;
        this.advertiserName = str8;
        this.surveyUrl = str9;
        this.dealId = str10;
        this.width = num;
        this.height = num2;
        this.vastMediaBitrate = num3;
        this.vastMediaHeight = num4;
        this.vastMediaWidth = num5;
        this.traffickingParameters = str11;
        this.clickThroughUrl = str12;
        this.duration = d2;
        this.adPodInfo = adPodInfoData;
        this.uiElements = set;
        this.companions = list;
        this.adWrapperIds = list2;
        this.adWrapperSystems = list3;
        this.adWrapperCreativeIds = list4;
        this.universalAdIds = list5;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String adId() {
        return this.adId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public AdPodInfoData adPodInfo() {
        return this.adPodInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String adSystem() {
        return this.adSystem;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public List<String> adWrapperCreativeIds() {
        return this.adWrapperCreativeIds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public List<String> adWrapperIds() {
        return this.adWrapperIds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public List<String> adWrapperSystems() {
        return this.adWrapperSystems;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String advertiserName() {
        return this.advertiserName;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public List<CompanionAdData> companions() {
        return this.companions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String contentType() {
        return this.contentType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String creativeAdId() {
        return this.creativeAdId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String creativeId() {
        return this.creativeId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String dealId() {
        return this.dealId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String description() {
        return this.description;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public Boolean disableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public Double duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdData) {
            AdData adData = (AdData) obj;
            String str = this.adId;
            if (str != null ? str.equals(adData.adId()) : adData.adId() == null) {
                String str2 = this.creativeId;
                if (str2 != null ? str2.equals(adData.creativeId()) : adData.creativeId() == null) {
                    String str3 = this.creativeAdId;
                    if (str3 != null ? str3.equals(adData.creativeAdId()) : adData.creativeAdId() == null) {
                        String str4 = this.adSystem;
                        if (str4 != null ? str4.equals(adData.adSystem()) : adData.adSystem() == null) {
                            Boolean bool = this.linear;
                            if (bool != null ? bool.equals(adData.linear()) : adData.linear() == null) {
                                Boolean bool2 = this.skippable;
                                if (bool2 != null ? bool2.equals(adData.skippable()) : adData.skippable() == null) {
                                    Double d = this.skipTimeOffset;
                                    if (d != null ? d.equals(adData.skipTimeOffset()) : adData.skipTimeOffset() == null) {
                                        Boolean bool3 = this.disableUi;
                                        if (bool3 != null ? bool3.equals(adData.disableUi()) : adData.disableUi() == null) {
                                            String str5 = this.title;
                                            if (str5 != null ? str5.equals(adData.title()) : adData.title() == null) {
                                                String str6 = this.description;
                                                if (str6 != null ? str6.equals(adData.description()) : adData.description() == null) {
                                                    String str7 = this.contentType;
                                                    if (str7 != null ? str7.equals(adData.contentType()) : adData.contentType() == null) {
                                                        String str8 = this.advertiserName;
                                                        if (str8 != null ? str8.equals(adData.advertiserName()) : adData.advertiserName() == null) {
                                                            String str9 = this.surveyUrl;
                                                            if (str9 != null ? str9.equals(adData.surveyUrl()) : adData.surveyUrl() == null) {
                                                                String str10 = this.dealId;
                                                                if (str10 != null ? str10.equals(adData.dealId()) : adData.dealId() == null) {
                                                                    Integer num = this.width;
                                                                    if (num != null ? num.equals(adData.width()) : adData.width() == null) {
                                                                        Integer num2 = this.height;
                                                                        if (num2 != null ? num2.equals(adData.height()) : adData.height() == null) {
                                                                            Integer num3 = this.vastMediaBitrate;
                                                                            if (num3 != null ? num3.equals(adData.vastMediaBitrate()) : adData.vastMediaBitrate() == null) {
                                                                                Integer num4 = this.vastMediaHeight;
                                                                                if (num4 != null ? num4.equals(adData.vastMediaHeight()) : adData.vastMediaHeight() == null) {
                                                                                    Integer num5 = this.vastMediaWidth;
                                                                                    if (num5 != null ? num5.equals(adData.vastMediaWidth()) : adData.vastMediaWidth() == null) {
                                                                                        String str11 = this.traffickingParameters;
                                                                                        if (str11 != null ? str11.equals(adData.traffickingParameters()) : adData.traffickingParameters() == null) {
                                                                                            String str12 = this.clickThroughUrl;
                                                                                            if (str12 != null ? str12.equals(adData.clickThroughUrl()) : adData.clickThroughUrl() == null) {
                                                                                                Double d2 = this.duration;
                                                                                                if (d2 != null ? d2.equals(adData.duration()) : adData.duration() == null) {
                                                                                                    AdPodInfoData adPodInfoData = this.adPodInfo;
                                                                                                    if (adPodInfoData != null ? adPodInfoData.equals(adData.adPodInfo()) : adData.adPodInfo() == null) {
                                                                                                        Set<e9k> set = this.uiElements;
                                                                                                        if (set != null ? set.equals(adData.uiElements()) : adData.uiElements() == null) {
                                                                                                            List<CompanionAdData> list = this.companions;
                                                                                                            if (list != null ? list.equals(adData.companions()) : adData.companions() == null) {
                                                                                                                List<String> list2 = this.adWrapperIds;
                                                                                                                if (list2 != null ? list2.equals(adData.adWrapperIds()) : adData.adWrapperIds() == null) {
                                                                                                                    List<String> list3 = this.adWrapperSystems;
                                                                                                                    if (list3 != null ? list3.equals(adData.adWrapperSystems()) : adData.adWrapperSystems() == null) {
                                                                                                                        List<String> list4 = this.adWrapperCreativeIds;
                                                                                                                        if (list4 != null ? list4.equals(adData.adWrapperCreativeIds()) : adData.adWrapperCreativeIds() == null) {
                                                                                                                            List<UniversalAdIdData> list5 = this.universalAdIds;
                                                                                                                            if (list5 != null ? list5.equals(adData.universalAdIds()) : adData.universalAdIds() == null) {
                                                                                                                                return true;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.adId;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.creativeId;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        String str3 = this.creativeAdId;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.adSystem;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Boolean bool = this.linear;
        int hashCode5 = (hashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.skippable;
        int hashCode6 = (hashCode5 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Double d = this.skipTimeOffset;
        int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
        Boolean bool3 = this.disableUi;
        int hashCode8 = (hashCode7 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        String str5 = this.title;
        int hashCode9 = (hashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.description;
        int hashCode10 = (hashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.contentType;
        int hashCode11 = (hashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.advertiserName;
        int hashCode12 = (hashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.surveyUrl;
        int hashCode13 = (hashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.dealId;
        int hashCode14 = (hashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        Integer num = this.width;
        int hashCode15 = (hashCode14 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.height;
        int hashCode16 = (hashCode15 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.vastMediaBitrate;
        int hashCode17 = (hashCode16 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Integer num4 = this.vastMediaHeight;
        int hashCode18 = (hashCode17 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        Integer num5 = this.vastMediaWidth;
        int hashCode19 = (hashCode18 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
        String str11 = this.traffickingParameters;
        int hashCode20 = (hashCode19 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        String str12 = this.clickThroughUrl;
        int hashCode21 = (hashCode20 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        Double d2 = this.duration;
        int hashCode22 = (hashCode21 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
        AdPodInfoData adPodInfoData = this.adPodInfo;
        int hashCode23 = (hashCode22 ^ (adPodInfoData == null ? 0 : adPodInfoData.hashCode())) * 1000003;
        Set<e9k> set = this.uiElements;
        int hashCode24 = (hashCode23 ^ (set == null ? 0 : set.hashCode())) * 1000003;
        List<CompanionAdData> list = this.companions;
        int hashCode25 = (hashCode24 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.adWrapperIds;
        int hashCode26 = (hashCode25 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List<String> list3 = this.adWrapperSystems;
        int hashCode27 = (hashCode26 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List<String> list4 = this.adWrapperCreativeIds;
        int hashCode28 = (hashCode27 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        List<UniversalAdIdData> list5 = this.universalAdIds;
        return hashCode28 ^ (list5 != null ? list5.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public Integer height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public Boolean linear() {
        return this.linear;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public Double skipTimeOffset() {
        return this.skipTimeOffset;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public Boolean skippable() {
        return this.skippable;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String surveyUrl() {
        return this.surveyUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String title() {
        return this.title;
    }

    public String toString() {
        List<UniversalAdIdData> list = this.universalAdIds;
        List<String> list2 = this.adWrapperCreativeIds;
        List<String> list3 = this.adWrapperSystems;
        List<String> list4 = this.adWrapperIds;
        List<CompanionAdData> list5 = this.companions;
        Set<e9k> set = this.uiElements;
        String valueOf = String.valueOf(this.adPodInfo);
        String valueOf2 = String.valueOf(set);
        String valueOf3 = String.valueOf(list5);
        String valueOf4 = String.valueOf(list4);
        String valueOf5 = String.valueOf(list3);
        String valueOf6 = String.valueOf(list2);
        String valueOf7 = String.valueOf(list);
        String str = this.adId;
        int length = String.valueOf(str).length();
        String str2 = this.creativeId;
        int length2 = String.valueOf(str2).length();
        String str3 = this.creativeAdId;
        int length3 = String.valueOf(str3).length();
        String str4 = this.adSystem;
        int length4 = String.valueOf(str4).length();
        Boolean bool = this.linear;
        int length5 = String.valueOf(bool).length();
        Boolean bool2 = this.skippable;
        int length6 = String.valueOf(bool2).length();
        Double d = this.skipTimeOffset;
        int length7 = String.valueOf(d).length();
        Boolean bool3 = this.disableUi;
        int length8 = String.valueOf(bool3).length();
        String str5 = this.title;
        int length9 = String.valueOf(str5).length();
        String str6 = this.description;
        int length10 = String.valueOf(str6).length();
        String str7 = this.contentType;
        int length11 = String.valueOf(str7).length();
        String str8 = this.advertiserName;
        int length12 = String.valueOf(str8).length();
        String str9 = this.surveyUrl;
        int length13 = String.valueOf(str9).length();
        String str10 = this.dealId;
        String valueOf8 = String.valueOf(str10);
        String str11 = this.traffickingParameters;
        Integer num = this.vastMediaWidth;
        Integer num2 = this.vastMediaHeight;
        Integer num3 = this.vastMediaBitrate;
        Integer num4 = this.height;
        Integer num5 = this.width;
        Double d2 = this.duration;
        String str12 = this.clickThroughUrl;
        int length14 = String.valueOf(num4).length() + length + 25 + length2 + 15 + length3 + 11 + length4 + 9 + length5 + 12 + length6 + 17 + length7 + 12 + length8 + 8 + length9 + 14 + length10 + 14 + length11 + 17 + length12 + 12 + length13 + 9 + valueOf8.length() + 8 + String.valueOf(num5).length() + 9;
        int length15 = String.valueOf(num3).length() + length14 + 19;
        int length16 = String.valueOf(num).length() + length15 + 18 + String.valueOf(num2).length() + 17;
        StringBuilder sb = new StringBuilder(valueOf7.length() + mz1.d(mz1.d(mz1.d(mz1.d(mz1.d(mz1.d(mz1.d(length16 + 24 + String.valueOf(str11).length() + 18 + String.valueOf(str12).length() + 11, 12, String.valueOf(d2)), 13, valueOf), 13, valueOf2), 15, valueOf3), 19, valueOf4), 23, valueOf5), 17, valueOf6) + 1);
        bf3.v(sb, "AdData{adId=", str, ", creativeId=", str2);
        bf3.v(sb, ", creativeAdId=", str3, ", adSystem=", str4);
        sb.append(", linear=");
        sb.append(bool);
        sb.append(", skippable=");
        sb.append(bool2);
        sb.append(", skipTimeOffset=");
        sb.append(d);
        sb.append(", disableUi=");
        sb.append(bool3);
        bf3.v(sb, ", title=", str5, ", description=", str6);
        bf3.v(sb, ", contentType=", str7, ", advertiserName=", str8);
        bf3.v(sb, ", surveyUrl=", str9, ", dealId=", str10);
        fn0.w(num5, num4, ", width=", ", height=", sb);
        fn0.w(num3, num2, ", vastMediaBitrate=", ", vastMediaHeight=", sb);
        fn0.x(num, ", vastMediaWidth=", ", traffickingParameters=", str11, sb);
        sb.append(", clickThroughUrl=");
        sb.append(str12);
        sb.append(", duration=");
        sb.append(d2);
        bf3.v(sb, ", adPodInfo=", valueOf, ", uiElements=", valueOf2);
        bf3.v(sb, ", companions=", valueOf3, ", adWrapperIds=", valueOf4);
        bf3.v(sb, ", adWrapperSystems=", valueOf5, ", adWrapperCreativeIds=", valueOf6);
        return wt3.m(", universalAdIds=", valueOf7, sb, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public String traffickingParameters() {
        return this.traffickingParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public Set<e9k> uiElements() {
        return this.uiElements;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public List<UniversalAdIdData> universalAdIds() {
        return this.universalAdIds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public Integer vastMediaBitrate() {
        return this.vastMediaBitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public Integer vastMediaHeight() {
        return this.vastMediaHeight;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public Integer vastMediaWidth() {
        return this.vastMediaWidth;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.AdData
    @Nullable
    public Integer width() {
        return this.width;
    }

    public /* synthetic */ AutoValue_AdData(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Double d, Boolean bool3, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str11, String str12, Double d2, AdPodInfoData adPodInfoData, Set set, List list, List list2, List list3, List list4, List list5, byte[] bArr) {
        this(str, str2, str3, str4, bool, bool2, d, bool3, str5, str6, str7, str8, str9, str10, num, num2, num3, num4, num5, str11, str12, d2, adPodInfoData, set, list, list2, list3, list4, list5);
    }
}
