package com.vk.api.generated.vkStart.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.hihealth.HiHealthActivities;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkStartInputActivityDto.kt */
/* loaded from: classes15.dex */
public final class VkStartInputActivityDto implements Parcelable {
    public static final Parcelable.Creator<VkStartInputActivityDto> CREATOR = new a();

    @pmi0("data_source")
    private final String dataSource;

    @pmi0("description")
    private final String description;

    @pmi0("end_timestamp")
    private final Integer endTimestamp;

    @pmi0("end_timestamp_ms")
    private final Long endTimestampMs;

    @pmi0("id")
    private final String id;

    @pmi0("location_type")
    private final LocationTypeDto locationType;

    @pmi0("native_uuid")
    private final String nativeUuid;

    @pmi0(NotificationCompat.CATEGORY_PROGRESS)
    private final VkStartInputActivityProgressDto progress;

    @pmi0("routes")
    private final List<VkStartInputActivityRouteDto> routes;

    @pmi0("source")
    private final String source;

    @pmi0("start_timestamp")
    private final Integer startTimestamp;

    @pmi0("start_timestamp_ms")
    private final Long startTimestampMs;

    @pmi0("subtype")
    private final String subtype;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("user_input")
    private final Boolean userInput;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkStartInputActivityDto.kt */
    public static final class LocationTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LocationTypeDto[] $VALUES;
        public static final Parcelable.Creator<LocationTypeDto> CREATOR;

        @pmi0("indoor")
        public static final LocationTypeDto INDOOR;

        @pmi0("outdoor")
        public static final LocationTypeDto OUTDOOR;
        private final String value;

        /* compiled from: VkStartInputActivityDto.kt */
        public static final class a implements Parcelable.Creator<LocationTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final LocationTypeDto createFromParcel(Parcel parcel) {
                return LocationTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LocationTypeDto[] newArray(int i) {
                return new LocationTypeDto[i];
            }
        }

        static {
            LocationTypeDto locationTypeDto = new LocationTypeDto("INDOOR", 0, "indoor");
            INDOOR = locationTypeDto;
            LocationTypeDto locationTypeDto2 = new LocationTypeDto("OUTDOOR", 1, "outdoor");
            OUTDOOR = locationTypeDto2;
            LocationTypeDto[] locationTypeDtoArr = {locationTypeDto, locationTypeDto2};
            $VALUES = locationTypeDtoArr;
            $ENTRIES = new asp(locationTypeDtoArr);
            CREATOR = new a();
        }

        private LocationTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LocationTypeDto valueOf(String str) {
            return (LocationTypeDto) Enum.valueOf(LocationTypeDto.class, str);
        }

        public static LocationTypeDto[] values() {
            return (LocationTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkStartInputActivityDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(HiHealthActivities.CYCLING)
        public static final TypeDto CYCLING;

        @pmi0("other")
        public static final TypeDto OTHER;

        @pmi0(HiHealthActivities.RUNNING)
        public static final TypeDto RUNNING;

        @pmi0(HiHealthActivities.SWIMMING)
        public static final TypeDto SWIMMING;
        private final String value;

        /* compiled from: VkStartInputActivityDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("RUNNING", 0, HiHealthActivities.RUNNING);
            RUNNING = typeDto;
            TypeDto typeDto2 = new TypeDto("SWIMMING", 1, HiHealthActivities.SWIMMING);
            SWIMMING = typeDto2;
            TypeDto typeDto3 = new TypeDto("CYCLING", 2, HiHealthActivities.CYCLING);
            CYCLING = typeDto3;
            TypeDto typeDto4 = new TypeDto(NativeAdContent.ViewTag.OTHER, 3, "other");
            OTHER = typeDto4;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: VkStartInputActivityDto.kt */
    public static final class a implements Parcelable.Creator<VkStartInputActivityDto> {
        @Override // android.os.Parcelable.Creator
        public final VkStartInputActivityDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String str;
            ArrayList arrayList;
            String str2;
            VkStartInputActivityProgressDto vkStartInputActivityProgressDto;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            VkStartInputActivityProgressDto createFromParcel = VkStartInputActivityProgressDto.CREATOR.createFromParcel(parcel);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long valueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString3 = parcel.readString();
            Integer num = valueOf3;
            Long l = valueOf4;
            Long l2 = valueOf5;
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            TypeDto createFromParcel2 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            LocationTypeDto createFromParcel3 = parcel.readInt() == 0 ? null : LocationTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                str = readString;
                arrayList = new ArrayList(readInt);
                str2 = readString2;
                int i = 0;
                while (true) {
                    vkStartInputActivityProgressDto = createFromParcel;
                    if (i == readInt) {
                        break;
                    }
                    i = en.a(VkStartInputActivityRouteDto.CREATOR, parcel, arrayList, i, 1);
                    createFromParcel = vkStartInputActivityProgressDto;
                    valueOf2 = valueOf2;
                }
            } else {
                str = readString;
                str2 = readString2;
                arrayList = null;
                vkStartInputActivityProgressDto = createFromParcel;
            }
            return new VkStartInputActivityDto(str, str2, vkStartInputActivityProgressDto, valueOf2, num, l, l2, readString3, readString4, readString5, createFromParcel2, readString6, readString7, createFromParcel3, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VkStartInputActivityDto[] newArray(int i) {
            return new VkStartInputActivityDto[i];
        }
    }

    public VkStartInputActivityDto(String str, String str2, VkStartInputActivityProgressDto vkStartInputActivityProgressDto, Integer num, Integer num2, Long l, Long l2, String str3, String str4, String str5, TypeDto typeDto, String str6, String str7, LocationTypeDto locationTypeDto, Boolean bool, List<VkStartInputActivityRouteDto> list) {
        this.id = str;
        this.source = str2;
        this.progress = vkStartInputActivityProgressDto;
        this.startTimestamp = num;
        this.endTimestamp = num2;
        this.startTimestampMs = l;
        this.endTimestampMs = l2;
        this.title = str3;
        this.description = str4;
        this.nativeUuid = str5;
        this.type = typeDto;
        this.dataSource = str6;
        this.subtype = str7;
        this.locationType = locationTypeDto;
        this.userInput = bool;
        this.routes = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkStartInputActivityDto)) {
            return false;
        }
        VkStartInputActivityDto vkStartInputActivityDto = (VkStartInputActivityDto) obj;
        return epx.f(this.id, vkStartInputActivityDto.id) && epx.f(this.source, vkStartInputActivityDto.source) && epx.f(this.progress, vkStartInputActivityDto.progress) && epx.f(this.startTimestamp, vkStartInputActivityDto.startTimestamp) && epx.f(this.endTimestamp, vkStartInputActivityDto.endTimestamp) && epx.f(this.startTimestampMs, vkStartInputActivityDto.startTimestampMs) && epx.f(this.endTimestampMs, vkStartInputActivityDto.endTimestampMs) && epx.f(this.title, vkStartInputActivityDto.title) && epx.f(this.description, vkStartInputActivityDto.description) && epx.f(this.nativeUuid, vkStartInputActivityDto.nativeUuid) && this.type == vkStartInputActivityDto.type && epx.f(this.dataSource, vkStartInputActivityDto.dataSource) && epx.f(this.subtype, vkStartInputActivityDto.subtype) && this.locationType == vkStartInputActivityDto.locationType && epx.f(this.userInput, vkStartInputActivityDto.userInput) && epx.f(this.routes, vkStartInputActivityDto.routes);
    }

    public final int hashCode() {
        int hashCode = (this.progress.hashCode() + urd0.a(this.id.hashCode() * 31, 31, this.source)) * 31;
        Integer num = this.startTimestamp;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.endTimestamp;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.startTimestampMs;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTimestampMs;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.title;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nativeUuid;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode9 = (hashCode8 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        String str4 = this.dataSource;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subtype;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LocationTypeDto locationTypeDto = this.locationType;
        int hashCode12 = (hashCode11 + (locationTypeDto == null ? 0 : locationTypeDto.hashCode())) * 31;
        Boolean bool = this.userInput;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<VkStartInputActivityRouteDto> list = this.routes;
        return hashCode13 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkStartInputActivityDto(id=");
        sb.append(this.id);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", startTimestamp=");
        sb.append(this.startTimestamp);
        sb.append(", endTimestamp=");
        sb.append(this.endTimestamp);
        sb.append(", startTimestampMs=");
        sb.append(this.startTimestampMs);
        sb.append(", endTimestampMs=");
        sb.append(this.endTimestampMs);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", nativeUuid=");
        sb.append(this.nativeUuid);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", dataSource=");
        sb.append(this.dataSource);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", locationType=");
        sb.append(this.locationType);
        sb.append(", userInput=");
        sb.append(this.userInput);
        sb.append(", routes=");
        return ms9.a(')', sb, this.routes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.source);
        this.progress.writeToParcel(parcel, i);
        Integer num = this.startTimestamp;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.endTimestamp;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Long l = this.startTimestampMs;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Long l2 = this.endTimestampMs;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.nativeUuid);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.dataSource);
        parcel.writeString(this.subtype);
        LocationTypeDto locationTypeDto = this.locationType;
        if (locationTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            locationTypeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.userInput;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<VkStartInputActivityRouteDto> list = this.routes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VkStartInputActivityRouteDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkStartInputActivityDto(String str, String str2, VkStartInputActivityProgressDto vkStartInputActivityProgressDto, Integer num, Integer num2, Long l, Long l2, String str3, String str4, String str5, TypeDto typeDto, String str6, String str7, LocationTypeDto locationTypeDto, Boolean bool, List list, int i, zcl zclVar) {
        this(str, str2, vkStartInputActivityProgressDto, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : typeDto, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : locationTypeDto, (i & 16384) != 0 ? null : bool, (i & 32768) != 0 ? null : list);
    }
}
