package com.vk.api.generated.explore.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.superApp.dto.SuperAppAccessibilityDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetAdditionalHeaderIconDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetFooterDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetHeaderRightTypeDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetTypeInformerRootStyleRowDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetTypeInformerRowDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetUpdatedTimeDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ExploreWidgetPayloadDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetPayloadDto implements Parcelable {
    public static final Parcelable.Creator<ExploreWidgetPayloadDto> CREATOR = new a();

    @pmi0("accessibility")
    private final SuperAppAccessibilityDto accessibility;

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("additional_header")
    private final String additionalHeader;

    @pmi0("additional_header_icon")
    private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

    @pmi0("footer")
    private final SuperAppUniversalWidgetFooterDto footer;

    @pmi0("header_icon")
    private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

    @pmi0("header_right_type")
    private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

    @pmi0("header_title")
    private final String headerTitle;

    @pmi0("root_style")
    private final List<SuperAppUniversalWidgetTypeInformerRootStyleRowDto> rootStyle;

    @pmi0("rows")
    private final List<SuperAppUniversalWidgetTypeInformerRowDto> rows;

    @pmi0("state")
    private final String state;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("updated_time")
    private final SuperAppUniversalWidgetUpdatedTimeDto updatedTime;

    @pmi0("weight")
    private final Float weight;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExploreWidgetPayloadDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("universal_informer")
        public static final TypeDto UNIVERSAL_INFORMER;
        private final String value;

        /* compiled from: ExploreWidgetPayloadDto.kt */
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
            TypeDto typeDto = new TypeDto("UNIVERSAL_INFORMER", 0, "universal_informer");
            UNIVERSAL_INFORMER = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
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

    /* compiled from: ExploreWidgetPayloadDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetPayloadDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetPayloadDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(SuperAppUniversalWidgetTypeInformerRootStyleRowDto.CREATOR, parcel, arrayList3, i, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(SuperAppUniversalWidgetTypeInformerRowDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(ExploreWidgetPayloadDto.class.getClassLoader());
            SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto2 = (SuperAppUniversalWidgetFooterDto) parcel.readParcelable(ExploreWidgetPayloadDto.class.getClassLoader());
            SuperAppUniversalWidgetUpdatedTimeDto createFromParcel = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetUpdatedTimeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            SuperAppAccessibilityDto createFromParcel2 = parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel);
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            TypeDto createFromParcel3 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            Float f = valueOf;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            SuperAppUniversalWidgetAdditionalHeaderIconDto createFromParcel4 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel);
            SuperAppUniversalWidgetHeaderRightTypeDto createFromParcel5 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                superAppUniversalWidgetFooterDto = superAppUniversalWidgetFooterDto2;
                superAppUniversalWidgetAdditionalHeaderIconDto = createFromParcel4;
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                superAppUniversalWidgetFooterDto = superAppUniversalWidgetFooterDto2;
                ArrayList arrayList4 = new ArrayList(readInt3);
                superAppUniversalWidgetAdditionalHeaderIconDto = createFromParcel4;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList4, i3, 1);
                    arrayList3 = arrayList3;
                    createFromParcel5 = createFromParcel5;
                }
                arrayList2 = arrayList4;
            }
            return new ExploreWidgetPayloadDto(arrayList3, arrayList, superAppUniversalWidgetActionDto, superAppUniversalWidgetFooterDto, createFromParcel, readString, createFromParcel2, f, createFromParcel3, readString2, readString3, readString4, superAppUniversalWidgetAdditionalHeaderIconDto, createFromParcel5, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetPayloadDto[] newArray(int i) {
            return new ExploreWidgetPayloadDto[i];
        }
    }

    public ExploreWidgetPayloadDto(List<SuperAppUniversalWidgetTypeInformerRootStyleRowDto> list, List<SuperAppUniversalWidgetTypeInformerRowDto> list2, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List<SuperAppUniversalWidgetImageItemDto> list3) {
        this.rootStyle = list;
        this.rows = list2;
        this.action = superAppUniversalWidgetActionDto;
        this.footer = superAppUniversalWidgetFooterDto;
        this.updatedTime = superAppUniversalWidgetUpdatedTimeDto;
        this.trackCode = str;
        this.accessibility = superAppAccessibilityDto;
        this.weight = f;
        this.type = typeDto;
        this.state = str2;
        this.headerTitle = str3;
        this.additionalHeader = str4;
        this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
        this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
        this.headerIcon = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreWidgetPayloadDto)) {
            return false;
        }
        ExploreWidgetPayloadDto exploreWidgetPayloadDto = (ExploreWidgetPayloadDto) obj;
        return epx.f(this.rootStyle, exploreWidgetPayloadDto.rootStyle) && epx.f(this.rows, exploreWidgetPayloadDto.rows) && epx.f(this.action, exploreWidgetPayloadDto.action) && epx.f(this.footer, exploreWidgetPayloadDto.footer) && epx.f(this.updatedTime, exploreWidgetPayloadDto.updatedTime) && epx.f(this.trackCode, exploreWidgetPayloadDto.trackCode) && epx.f(this.accessibility, exploreWidgetPayloadDto.accessibility) && epx.f(this.weight, exploreWidgetPayloadDto.weight) && this.type == exploreWidgetPayloadDto.type && epx.f(this.state, exploreWidgetPayloadDto.state) && epx.f(this.headerTitle, exploreWidgetPayloadDto.headerTitle) && epx.f(this.additionalHeader, exploreWidgetPayloadDto.additionalHeader) && epx.f(this.additionalHeaderIcon, exploreWidgetPayloadDto.additionalHeaderIcon) && this.headerRightType == exploreWidgetPayloadDto.headerRightType && epx.f(this.headerIcon, exploreWidgetPayloadDto.headerIcon);
    }

    public final int hashCode() {
        int hashCode = this.rootStyle.hashCode() * 31;
        List<SuperAppUniversalWidgetTypeInformerRowDto> list = this.rows;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
        SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto = this.footer;
        int hashCode4 = (hashCode3 + (superAppUniversalWidgetFooterDto == null ? 0 : superAppUniversalWidgetFooterDto.hashCode())) * 31;
        SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
        int hashCode5 = (hashCode4 + (superAppUniversalWidgetUpdatedTimeDto == null ? 0 : superAppUniversalWidgetUpdatedTimeDto.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
        int hashCode7 = (hashCode6 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
        Float f = this.weight;
        int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode9 = (hashCode8 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        String str2 = this.state;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.headerTitle;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.additionalHeader;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
        int hashCode13 = (hashCode12 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
        SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
        int hashCode14 = (hashCode13 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
        List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
        return hashCode14 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExploreWidgetPayloadDto(rootStyle=");
        sb.append(this.rootStyle);
        sb.append(", rows=");
        sb.append(this.rows);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", footer=");
        sb.append(this.footer);
        sb.append(", updatedTime=");
        sb.append(this.updatedTime);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", accessibility=");
        sb.append(this.accessibility);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", headerTitle=");
        sb.append(this.headerTitle);
        sb.append(", additionalHeader=");
        sb.append(this.additionalHeader);
        sb.append(", additionalHeaderIcon=");
        sb.append(this.additionalHeaderIcon);
        sb.append(", headerRightType=");
        sb.append(this.headerRightType);
        sb.append(", headerIcon=");
        return ms9.a(')', sb, this.headerIcon);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.rootStyle);
        while (a2.hasNext()) {
            ((SuperAppUniversalWidgetTypeInformerRootStyleRowDto) a2.next()).writeToParcel(parcel, i);
        }
        List<SuperAppUniversalWidgetTypeInformerRowDto> list = this.rows;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((SuperAppUniversalWidgetTypeInformerRowDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.action, i);
        parcel.writeParcelable(this.footer, i);
        SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
        if (superAppUniversalWidgetUpdatedTimeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetUpdatedTimeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
        if (superAppAccessibilityDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppAccessibilityDto.writeToParcel(parcel, i);
        }
        Float f2 = this.weight;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.state);
        parcel.writeString(this.headerTitle);
        parcel.writeString(this.additionalHeader);
        SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
        if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
        if (superAppUniversalWidgetHeaderRightTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
        }
        List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list2, 1);
        while (f3.hasNext()) {
            ((SuperAppUniversalWidgetImageItemDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ExploreWidgetPayloadDto(List list, List list2, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List list3, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : superAppUniversalWidgetActionDto, (i & 8) != 0 ? null : superAppUniversalWidgetFooterDto, (i & 16) != 0 ? null : superAppUniversalWidgetUpdatedTimeDto, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : superAppAccessibilityDto, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : typeDto, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 8192) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 16384) != 0 ? null : list3);
    }
}
