package com.blaze.blazesdk.app_configurations.models.ads;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import defpackage.b6h;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.km5;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u000223Bi\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ~\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\bHÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\r\u0010\u001fR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u000f\u0010\u001fR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001a¨\u00064"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto;", "", "type", "Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto$ConfigType;", "adsLocationType", "Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto$AdsLocationType;", "adLocationsIndexes", "", "", "interval", "startTime", "Ljava/util/Date;", "endTime", "isSkippable", "", "isActive", "distanceOfItemsToLoadAdsInAdvance", "<init>", "(Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto$ConfigType;Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto$AdsLocationType;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getType", "()Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto$ConfigType;", "getAdsLocationType", "()Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto$AdsLocationType;", "getAdLocationsIndexes", "()Ljava/util/List;", "getInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartTime", "()Ljava/util/Date;", "getEndTime", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDistanceOfItemsToLoadAdsInAdvance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto$ConfigType;Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto$AdsLocationType;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto;", "equals", "other", "hashCode", "toString", "", "ConfigType", "AdsLocationType", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AdsConfigurationsDto {
    public static final int $stable = 8;

    @b6h("adLocationsIndexes")
    @NotNull
    private final List<Integer> adLocationsIndexes;

    @b6h("adsLocationType")
    @Nullable
    private final AdsLocationType adsLocationType;

    @b6h("distanceOfItemsToLoadAdsInAdvance")
    @Nullable
    private final Integer distanceOfItemsToLoadAdsInAdvance;

    @b6h("endTime")
    @Nullable
    private final Date endTime;

    @b6h("interval")
    @Nullable
    private final Integer interval;

    @b6h("isActive")
    @Nullable
    private final Boolean isActive;

    @b6h("isSkippable")
    @Nullable
    private final Boolean isSkippable;

    @b6h("startTime")
    @Nullable
    private final Date startTime;

    @b6h("type")
    @Nullable
    private final ConfigType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto$AdsLocationType;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EveryXStories", "EveryXPages", "FixedPages", "FixedPercentages", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AdsLocationType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ AdsLocationType[] $VALUES;

        @NotNull
        private final String value;

        @b6h("EveryXStories")
        public static final AdsLocationType EveryXStories = new AdsLocationType("EveryXStories", 0, "EveryXStories");

        @b6h("EveryXPages")
        public static final AdsLocationType EveryXPages = new AdsLocationType("EveryXPages", 1, "EveryXPages");

        @b6h("FixedPages")
        public static final AdsLocationType FixedPages = new AdsLocationType("FixedPages", 2, "FixedPages");

        @b6h("FixedPercentages")
        public static final AdsLocationType FixedPercentages = new AdsLocationType("FixedPercentages", 3, "FixedPercentages");

        private static final /* synthetic */ AdsLocationType[] $values() {
            return new AdsLocationType[]{EveryXStories, EveryXPages, FixedPages, FixedPercentages};
        }

        static {
            AdsLocationType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private AdsLocationType(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static AdsLocationType valueOf(String str) {
            return (AdsLocationType) Enum.valueOf(AdsLocationType.class, str);
        }

        public static AdsLocationType[] values() {
            return (AdsLocationType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto$ConfigType;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Story", "Moment", "Video", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConfigType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ ConfigType[] $VALUES;

        @NotNull
        private final String value;

        @b6h("Story")
        public static final ConfigType Story = new ConfigType("Story", 0, "Story");

        @b6h("Moment")
        public static final ConfigType Moment = new ConfigType("Moment", 1, "Moment");

        @b6h("Video")
        public static final ConfigType Video = new ConfigType("Video", 2, "Video");

        private static final /* synthetic */ ConfigType[] $values() {
            return new ConfigType[]{Story, Moment, Video};
        }

        static {
            ConfigType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private ConfigType(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static ConfigType valueOf(String str) {
            return (ConfigType) Enum.valueOf(ConfigType.class, str);
        }

        public static ConfigType[] values() {
            return (ConfigType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Keep
    public AdsConfigurationsDto(@Nullable ConfigType configType, @Nullable AdsLocationType adsLocationType, @NotNull List<Integer> list, @Nullable Integer num, @Nullable Date date, @Nullable Date date2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num2) {
        list.getClass();
        this.type = configType;
        this.adsLocationType = adsLocationType;
        this.adLocationsIndexes = list;
        this.interval = num;
        this.startTime = date;
        this.endTime = date2;
        this.isSkippable = bool;
        this.isActive = bool2;
        this.distanceOfItemsToLoadAdsInAdvance = num2;
    }

    public static /* synthetic */ AdsConfigurationsDto copy$default(AdsConfigurationsDto adsConfigurationsDto, ConfigType configType, AdsLocationType adsLocationType, List list, Integer num, Date date, Date date2, Boolean bool, Boolean bool2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            configType = adsConfigurationsDto.type;
        }
        if ((i & 2) != 0) {
            adsLocationType = adsConfigurationsDto.adsLocationType;
        }
        if ((i & 4) != 0) {
            list = adsConfigurationsDto.adLocationsIndexes;
        }
        if ((i & 8) != 0) {
            num = adsConfigurationsDto.interval;
        }
        if ((i & 16) != 0) {
            date = adsConfigurationsDto.startTime;
        }
        if ((i & 32) != 0) {
            date2 = adsConfigurationsDto.endTime;
        }
        if ((i & 64) != 0) {
            bool = adsConfigurationsDto.isSkippable;
        }
        if ((i & 128) != 0) {
            bool2 = adsConfigurationsDto.isActive;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num2 = adsConfigurationsDto.distanceOfItemsToLoadAdsInAdvance;
        }
        Boolean bool3 = bool2;
        Integer num3 = num2;
        Date date3 = date2;
        Boolean bool4 = bool;
        Date date4 = date;
        List list2 = list;
        return adsConfigurationsDto.copy(configType, adsLocationType, list2, num, date4, date3, bool4, bool3, num3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ConfigType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final AdsLocationType getAdsLocationType() {
        return this.adsLocationType;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.adLocationsIndexes;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getInterval() {
        return this.interval;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Date getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Date getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsSkippable() {
        return this.isSkippable;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getIsActive() {
        return this.isActive;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getDistanceOfItemsToLoadAdsInAdvance() {
        return this.distanceOfItemsToLoadAdsInAdvance;
    }

    @NotNull
    public final AdsConfigurationsDto copy(@Nullable ConfigType type, @Nullable AdsLocationType adsLocationType, @NotNull List<Integer> adLocationsIndexes, @Nullable Integer interval, @Nullable Date startTime, @Nullable Date endTime, @Nullable Boolean isSkippable, @Nullable Boolean isActive, @Nullable Integer distanceOfItemsToLoadAdsInAdvance) {
        adLocationsIndexes.getClass();
        return new AdsConfigurationsDto(type, adsLocationType, adLocationsIndexes, interval, startTime, endTime, isSkippable, isActive, distanceOfItemsToLoadAdsInAdvance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsConfigurationsDto)) {
            return false;
        }
        AdsConfigurationsDto adsConfigurationsDto = (AdsConfigurationsDto) other;
        return this.type == adsConfigurationsDto.type && this.adsLocationType == adsConfigurationsDto.adsLocationType && Intrinsics.c(this.adLocationsIndexes, adsConfigurationsDto.adLocationsIndexes) && Intrinsics.c(this.interval, adsConfigurationsDto.interval) && Intrinsics.c(this.startTime, adsConfigurationsDto.startTime) && Intrinsics.c(this.endTime, adsConfigurationsDto.endTime) && Intrinsics.c(this.isSkippable, adsConfigurationsDto.isSkippable) && Intrinsics.c(this.isActive, adsConfigurationsDto.isActive) && Intrinsics.c(this.distanceOfItemsToLoadAdsInAdvance, adsConfigurationsDto.distanceOfItemsToLoadAdsInAdvance);
    }

    @NotNull
    public final List<Integer> getAdLocationsIndexes() {
        return this.adLocationsIndexes;
    }

    @Nullable
    public final AdsLocationType getAdsLocationType() {
        return this.adsLocationType;
    }

    @Nullable
    public final Integer getDistanceOfItemsToLoadAdsInAdvance() {
        return this.distanceOfItemsToLoadAdsInAdvance;
    }

    @Nullable
    public final Date getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Integer getInterval() {
        return this.interval;
    }

    @Nullable
    public final Date getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final ConfigType getType() {
        return this.type;
    }

    public int hashCode() {
        ConfigType configType = this.type;
        int hashCode = (configType == null ? 0 : configType.hashCode()) * 31;
        AdsLocationType adsLocationType = this.adsLocationType;
        int d = dmi.d((hashCode + (adsLocationType == null ? 0 : adsLocationType.hashCode())) * 31, 31, this.adLocationsIndexes);
        Integer num = this.interval;
        int hashCode2 = (d + (num == null ? 0 : num.hashCode())) * 31;
        Date date = this.startTime;
        int hashCode3 = (hashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endTime;
        int hashCode4 = (hashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Boolean bool = this.isSkippable;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isActive;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.distanceOfItemsToLoadAdsInAdvance;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isActive() {
        return this.isActive;
    }

    @Nullable
    public final Boolean isSkippable() {
        return this.isSkippable;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AdsConfigurationsDto(type=");
        sb.append(this.type);
        sb.append(", adsLocationType=");
        sb.append(this.adsLocationType);
        sb.append(", adLocationsIndexes=");
        sb.append(this.adLocationsIndexes);
        sb.append(", interval=");
        sb.append(this.interval);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", isSkippable=");
        sb.append(this.isSkippable);
        sb.append(", isActive=");
        sb.append(this.isActive);
        sb.append(", distanceOfItemsToLoadAdsInAdvance=");
        return bf3.n(sb, this.distanceOfItemsToLoadAdsInAdvance, ')');
    }

    @Keep
    public AdsConfigurationsDto(@Nullable ConfigType configType, @Nullable AdsLocationType adsLocationType, @Nullable Integer num, @Nullable Date date, @Nullable Date date2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num2) {
        this(configType, adsLocationType, null, num, date, date2, bool, bool2, num2, 4, null);
    }

    public AdsConfigurationsDto(ConfigType configType, AdsLocationType adsLocationType, List list, Integer num, Date date, Date date2, Boolean bool, Boolean bool2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(configType, adsLocationType, (i & 4) != 0 ? km5.a : list, num, date, date2, bool, bool2, num2);
    }
}
