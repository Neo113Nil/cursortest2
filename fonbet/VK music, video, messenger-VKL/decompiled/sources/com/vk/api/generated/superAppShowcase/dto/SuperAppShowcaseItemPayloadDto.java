package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.generated.atum.dto.AtumAnyViewDto;
import com.vk.api.generated.superApp.dto.SuperAppAccessibilityDto;
import com.vk.api.generated.superApp.dto.SuperAppCustomMenuItemDto;
import com.vk.api.generated.superApp.dto.SuperAppMiniWidgetItemDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetAdditionalHeaderIconDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetHeaderRightTypeDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import com.vk.api.generated.superApp.dto.SuperAppWidgetOnboardingPanelActionDto;
import com.vk.api.generated.superApp.dto.SuperAppWidgetPayloadTypesDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import io.appmetrica.analytics.impl.L2;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ho8;
import xsna.ly80;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.up;
import xsna.urd0;
import xsna.xq;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;
import xsna.zyk0;

/* compiled from: SuperAppShowcaseItemPayloadDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseItemPayloadDto implements Parcelable {

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseItemPayloadDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -2028675097:
                        if (f.equals("section_poster")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseSectionPosterDto.class);
                        }
                        break;
                    case -1974402383:
                        if (f.equals("showcase_menu")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetShowcaseMenuDto.class);
                        }
                        break;
                    case -1953904281:
                        if (f.equals("section_scroll")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseSectionScrollDto.class);
                        }
                        break;
                    case -1665174726:
                        if (f.equals("half_tile")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseHalfTileDto.class);
                        }
                        break;
                    case -1335263606:
                        if (f.equals("section_video_banner")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseSectionVideoBannerDto.class);
                        }
                        break;
                    case -1169536864:
                        if (f.equals("services_menu")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseServicesMenuDto.class);
                        }
                        break;
                    case -907680051:
                        if (f.equals("scroll")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseScrollDto.class);
                        }
                        break;
                    case -58428729:
                        if (f.equals("mini_widgets")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppMiniWidgetsDto.class);
                        }
                        break;
                    case 3556653:
                        if (f.equals("text")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseWidgetTextDto.class);
                        }
                        break;
                    case 3560110:
                        if (f.equals("tile")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileDto.class);
                        }
                        break;
                    case 106940687:
                        if (f.equals(NotificationCompat.CATEGORY_PROMO)) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcasePromoDto.class);
                        }
                        break;
                    case 650136672:
                        if (f.equals("section_grid")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseSectionGridDto.class);
                        }
                        break;
                    case 1210865290:
                        if (f.equals("universal_full_width")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseUniversalFullWidthDto.class);
                        }
                        break;
                    case 1425957600:
                        if (f.equals("onboarding_panel")) {
                            return (SuperAppShowcaseItemPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetOnboardingPanelDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppMiniWidgetsDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppMiniWidgetsDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppMiniWidgetItemDto> items;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        @pmi0("widget_size")
        private final WidgetSizeDto widgetSize;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class WidgetSizeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ WidgetSizeDto[] $VALUES;

            @pmi0("big")
            public static final WidgetSizeDto BIG;
            public static final Parcelable.Creator<WidgetSizeDto> CREATOR;

            @pmi0("small")
            public static final WidgetSizeDto SMALL;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
            public static final class a implements Parcelable.Creator<WidgetSizeDto> {
                @Override // android.os.Parcelable.Creator
                public final WidgetSizeDto createFromParcel(Parcel parcel) {
                    return WidgetSizeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final WidgetSizeDto[] newArray(int i) {
                    return new WidgetSizeDto[i];
                }
            }

            static {
                WidgetSizeDto widgetSizeDto = new WidgetSizeDto("BIG", 0, "big");
                BIG = widgetSizeDto;
                WidgetSizeDto widgetSizeDto2 = new WidgetSizeDto("SMALL", 1, "small");
                SMALL = widgetSizeDto2;
                WidgetSizeDto[] widgetSizeDtoArr = {widgetSizeDto, widgetSizeDto2};
                $VALUES = widgetSizeDtoArr;
                $ENTRIES = new asp(widgetSizeDtoArr);
                CREATOR = new a();
            }

            private WidgetSizeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static WidgetSizeDto valueOf(String str) {
                return (WidgetSizeDto) Enum.valueOf(WidgetSizeDto.class, str);
            }

            public static WidgetSizeDto[] values() {
                return (WidgetSizeDto[]) $VALUES.clone();
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppMiniWidgetsDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppMiniWidgetsDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                WidgetSizeDto createFromParcel = WidgetSizeDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppMiniWidgetItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppMiniWidgetsDto(createFromParcel, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppMiniWidgetsDto[] newArray(int i) {
                return new SuperAppMiniWidgetsDto[i];
            }
        }

        public /* synthetic */ SuperAppMiniWidgetsDto(WidgetSizeDto widgetSizeDto, List list, String str, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(widgetSizeDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : superAppAccessibilityDto, (i & 16) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 32) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        public final SuperAppUniversalWidgetAdditionalHeaderIconDto d() {
            return this.additionalHeaderIcon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppUniversalWidgetHeaderRightTypeDto e() {
            return this.headerRightType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppMiniWidgetsDto)) {
                return false;
            }
            SuperAppMiniWidgetsDto superAppMiniWidgetsDto = (SuperAppMiniWidgetsDto) obj;
            return this.widgetSize == superAppMiniWidgetsDto.widgetSize && epx.f(this.items, superAppMiniWidgetsDto.items) && epx.f(this.trackCode, superAppMiniWidgetsDto.trackCode) && epx.f(this.accessibility, superAppMiniWidgetsDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppMiniWidgetsDto.additionalHeaderIcon) && this.headerRightType == superAppMiniWidgetsDto.headerRightType && epx.f(this.weight, superAppMiniWidgetsDto.weight) && this.type == superAppMiniWidgetsDto.type;
        }

        public final List<SuperAppMiniWidgetItemDto> f() {
            return this.items;
        }

        public final Float g() {
            return this.weight;
        }

        public final int hashCode() {
            int hashCode = this.widgetSize.hashCode() * 31;
            List<SuperAppMiniWidgetItemDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode4 = (hashCode3 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode7 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final WidgetSizeDto i() {
            return this.widgetSize;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppMiniWidgetsDto(widgetSize=");
            sb.append(this.widgetSize);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.widgetSize.writeToParcel(parcel, i);
            List<SuperAppMiniWidgetItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppMiniWidgetItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
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
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppMiniWidgetsDto(WidgetSizeDto widgetSizeDto, List<SuperAppMiniWidgetItemDto> list, String str, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.widgetSize = widgetSizeDto;
            this.items = list;
            this.trackCode = str;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseHalfTileDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseHalfTileDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
        private final SuperAppShowcaseHalfTileContentDto content;

        @pmi0("is_enabled")
        private final Boolean isEnabled;

        @pmi0("is_unremovable")
        private final Boolean isUnremovable;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("uid")
        private final String uid;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("half_tile")
            public static final TypeDto HALF_TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("HALF_TILE", 0, "half_tile");
                HALF_TILE = typeDto;
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseHalfTileDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseHalfTileDto.class.getClassLoader());
                SuperAppShowcaseHalfTileContentDto superAppShowcaseHalfTileContentDto = (SuperAppShowcaseHalfTileContentDto) parcel.readParcelable(SuperAppShowcaseHalfTileDto.class.getClassLoader());
                String readString = parcel.readString();
                float readFloat = parcel.readFloat();
                String readString2 = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SuperAppShowcaseHalfTileDto(createFromParcel, superAppUniversalWidgetActionDto, superAppShowcaseHalfTileContentDto, readString, readFloat, readString2, valueOf, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileDto[] newArray(int i) {
                return new SuperAppShowcaseHalfTileDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseHalfTileDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseHalfTileContentDto superAppShowcaseHalfTileContentDto, String str, float f, String str2, Boolean bool, Boolean bool2, int i, zcl zclVar) {
            this(typeDto, superAppUniversalWidgetActionDto, superAppShowcaseHalfTileContentDto, str, f, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppShowcaseHalfTileContentDto e() {
            return this.content;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseHalfTileDto)) {
                return false;
            }
            SuperAppShowcaseHalfTileDto superAppShowcaseHalfTileDto = (SuperAppShowcaseHalfTileDto) obj;
            return this.type == superAppShowcaseHalfTileDto.type && epx.f(this.action, superAppShowcaseHalfTileDto.action) && epx.f(this.content, superAppShowcaseHalfTileDto.content) && epx.f(this.trackCode, superAppShowcaseHalfTileDto.trackCode) && Float.compare(this.weight, superAppShowcaseHalfTileDto.weight) == 0 && epx.f(this.uid, superAppShowcaseHalfTileDto.uid) && epx.f(this.isEnabled, superAppShowcaseHalfTileDto.isEnabled) && epx.f(this.isUnremovable, superAppShowcaseHalfTileDto.isUnremovable);
        }

        public final float f() {
            return this.weight;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a((this.content.hashCode() + zyk0.a(this.action, this.type.hashCode() * 31, 31)) * 31, 31, this.trackCode), 31);
            String str = this.uid;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isEnabled;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isUnremovable;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseHalfTileDto(type=");
            sb.append(this.type);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", content=");
            sb.append(this.content);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", uid=");
            sb.append(this.uid);
            sb.append(", isEnabled=");
            sb.append(this.isEnabled);
            sb.append(", isUnremovable=");
            return tn.a(sb, this.isUnremovable, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.content, i);
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.uid);
            Boolean bool = this.isEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.isUnremovable;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
        }

        public SuperAppShowcaseHalfTileDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseHalfTileContentDto superAppShowcaseHalfTileContentDto, String str, float f, String str2, Boolean bool, Boolean bool2) {
            super(null);
            this.type = typeDto;
            this.action = superAppUniversalWidgetActionDto;
            this.content = superAppShowcaseHalfTileContentDto;
            this.trackCode = str;
            this.weight = f;
            this.uid = str2;
            this.isEnabled = bool;
            this.isUnremovable = bool2;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcasePromoDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcasePromoDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("image")
        private final SuperAppShowcasePromoCardImageDto image;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("is_enabled")
        private final Boolean isEnabled;

        @pmi0("is_unremovable")
        private final Boolean isUnremovable;

        @pmi0("state")
        private final String state;

        @pmi0("subtype")
        private final SubtypeDto subtype;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("uid")
        private final String uid;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_PROMO)
            public static final InnerTypeDto PROMO;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
            public static final class a implements Parcelable.Creator<InnerTypeDto> {
                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto createFromParcel(Parcel parcel) {
                    return InnerTypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto[] newArray(int i) {
                    return new InnerTypeDto[i];
                }
            }

            static {
                InnerTypeDto innerTypeDto = new InnerTypeDto("PROMO", 0, NotificationCompat.CATEGORY_PROMO);
                PROMO = innerTypeDto;
                InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
                $VALUES = innerTypeDtoArr;
                $ENTRIES = new asp(innerTypeDtoArr);
                CREATOR = new a();
            }

            private InnerTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static InnerTypeDto valueOf(String str) {
                return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
            }

            public static InnerTypeDto[] values() {
                return (InnerTypeDto[]) $VALUES.clone();
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
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class SubtypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ SubtypeDto[] $VALUES;

            @pmi0("card")
            public static final SubtypeDto CARD;
            public static final Parcelable.Creator<SubtypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
            public static final class a implements Parcelable.Creator<SubtypeDto> {
                @Override // android.os.Parcelable.Creator
                public final SubtypeDto createFromParcel(Parcel parcel) {
                    return SubtypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SubtypeDto[] newArray(int i) {
                    return new SubtypeDto[i];
                }
            }

            static {
                SubtypeDto subtypeDto = new SubtypeDto("CARD", 0, "card");
                CARD = subtypeDto;
                SubtypeDto[] subtypeDtoArr = {subtypeDto};
                $VALUES = subtypeDtoArr;
                $ENTRIES = new asp(subtypeDtoArr);
                CREATOR = new a();
            }

            private SubtypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static SubtypeDto valueOf(String str) {
                return (SubtypeDto) Enum.valueOf(SubtypeDto.class, str);
            }

            public static SubtypeDto[] values() {
                return (SubtypeDto[]) $VALUES.clone();
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
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_PROMO)
            public static final TypeDto PROMO;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("PROMO", 0, NotificationCompat.CATEGORY_PROMO);
                PROMO = typeDto;
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcasePromoDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcasePromoDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                InnerTypeDto createFromParcel2 = InnerTypeDto.CREATOR.createFromParcel(parcel);
                SubtypeDto createFromParcel3 = SubtypeDto.CREATOR.createFromParcel(parcel);
                SuperAppShowcasePromoCardImageDto createFromParcel4 = SuperAppShowcasePromoCardImageDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcasePromoDto.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                float readFloat = parcel.readFloat();
                String readString3 = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SuperAppShowcasePromoDto(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, superAppUniversalWidgetActionDto, readString, readString2, readFloat, readString3, valueOf, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcasePromoDto[] newArray(int i) {
                return new SuperAppShowcasePromoDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcasePromoDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SubtypeDto subtypeDto, SuperAppShowcasePromoCardImageDto superAppShowcasePromoCardImageDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, String str2, float f, String str3, Boolean bool, Boolean bool2, int i, zcl zclVar) {
            this(typeDto, innerTypeDto, subtypeDto, superAppShowcasePromoCardImageDto, superAppUniversalWidgetActionDto, str, str2, f, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : bool2);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppShowcasePromoCardImageDto e() {
            return this.image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcasePromoDto)) {
                return false;
            }
            SuperAppShowcasePromoDto superAppShowcasePromoDto = (SuperAppShowcasePromoDto) obj;
            return this.type == superAppShowcasePromoDto.type && this.innerType == superAppShowcasePromoDto.innerType && this.subtype == superAppShowcasePromoDto.subtype && epx.f(this.image, superAppShowcasePromoDto.image) && epx.f(this.action, superAppShowcasePromoDto.action) && epx.f(this.state, superAppShowcasePromoDto.state) && epx.f(this.trackCode, superAppShowcasePromoDto.trackCode) && Float.compare(this.weight, superAppShowcasePromoDto.weight) == 0 && epx.f(this.uid, superAppShowcasePromoDto.uid) && epx.f(this.isEnabled, superAppShowcasePromoDto.isEnabled) && epx.f(this.isUnremovable, superAppShowcasePromoDto.isUnremovable);
        }

        public final String f() {
            return this.state;
        }

        public final float g() {
            return this.weight;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(urd0.a(zyk0.a(this.action, (this.image.hashCode() + ((this.subtype.hashCode() + ((this.innerType.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31, this.state), 31, this.trackCode), 31);
            String str = this.uid;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isEnabled;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isUnremovable;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcasePromoDto(type=");
            sb.append(this.type);
            sb.append(", innerType=");
            sb.append(this.innerType);
            sb.append(", subtype=");
            sb.append(this.subtype);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", uid=");
            sb.append(this.uid);
            sb.append(", isEnabled=");
            sb.append(this.isEnabled);
            sb.append(", isUnremovable=");
            return tn.a(sb, this.isUnremovable, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.innerType.writeToParcel(parcel, i);
            this.subtype.writeToParcel(parcel, i);
            this.image.writeToParcel(parcel, i);
            parcel.writeParcelable(this.action, i);
            parcel.writeString(this.state);
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.uid);
            Boolean bool = this.isEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.isUnremovable;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
        }

        public SuperAppShowcasePromoDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SubtypeDto subtypeDto, SuperAppShowcasePromoCardImageDto superAppShowcasePromoCardImageDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, String str2, float f, String str3, Boolean bool, Boolean bool2) {
            super(null);
            this.type = typeDto;
            this.innerType = innerTypeDto;
            this.subtype = subtypeDto;
            this.image = superAppShowcasePromoCardImageDto;
            this.action = superAppUniversalWidgetActionDto;
            this.state = str;
            this.trackCode = str2;
            this.weight = f;
            this.uid = str3;
            this.isEnabled = bool;
            this.isUnremovable = bool2;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseScrollDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseScrollDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("header_text")
        private final String headerText;

        @pmi0("items")
        private final List<SuperAppShowcaseScrollItemDto> items;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("uid")
        private final String uid;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("scroll")
            public static final TypeDto SCROLL;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("SCROLL", 0, "scroll");
                SCROLL = typeDto;
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseScrollDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseScrollDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppShowcaseScrollItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseScrollDto(createFromParcel, readString, arrayList, (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseScrollDto.class.getClassLoader()), parcel.readString(), parcel.readFloat(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseScrollDto[] newArray(int i) {
                return new SuperAppShowcaseScrollDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseScrollDto(TypeDto typeDto, String str, List list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str2, float f, String str3, int i, zcl zclVar) {
            this(typeDto, str, list, superAppUniversalWidgetActionDto, str2, f, (i & 64) != 0 ? null : str3);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.headerText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseScrollDto)) {
                return false;
            }
            SuperAppShowcaseScrollDto superAppShowcaseScrollDto = (SuperAppShowcaseScrollDto) obj;
            return this.type == superAppShowcaseScrollDto.type && epx.f(this.headerText, superAppShowcaseScrollDto.headerText) && epx.f(this.items, superAppShowcaseScrollDto.items) && epx.f(this.action, superAppShowcaseScrollDto.action) && epx.f(this.trackCode, superAppShowcaseScrollDto.trackCode) && Float.compare(this.weight, superAppShowcaseScrollDto.weight) == 0 && epx.f(this.uid, superAppShowcaseScrollDto.uid);
        }

        public final List<SuperAppShowcaseScrollItemDto> f() {
            return this.items;
        }

        public final float g() {
            return this.weight;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(zyk0.a(this.action, fw3.a(urd0.a(this.type.hashCode() * 31, 31, this.headerText), 31, this.items), 31), 31, this.trackCode), 31);
            String str = this.uid;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseScrollDto(type=");
            sb.append(this.type);
            sb.append(", headerText=");
            sb.append(this.headerText);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", uid=");
            return ho8.a(sb, this.uid, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.headerText);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((SuperAppShowcaseScrollItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.action, i);
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.uid);
        }

        public SuperAppShowcaseScrollDto(TypeDto typeDto, String str, List<SuperAppShowcaseScrollItemDto> list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str2, float f, String str3) {
            super(null);
            this.type = typeDto;
            this.headerText = str;
            this.items = list;
            this.action = superAppUniversalWidgetActionDto;
            this.trackCode = str2;
            this.weight = f;
            this.uid = str3;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseSectionGridDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseSectionGridDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("items")
        private final List<SuperAppShowcaseSectionGridItemDto> items;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("section_grid")
            public static final TypeDto SECTION_GRID;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("SECTION_GRID", 0, "section_grid");
                SECTION_GRID = typeDto;
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseSectionGridDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSectionGridDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SuperAppShowcaseSectionGridDto.class, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseSectionGridDto(createFromParcel, arrayList, parcel.readString(), parcel.readFloat(), parcel.readString(), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseSectionGridDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSectionGridDto[] newArray(int i) {
                return new SuperAppShowcaseSectionGridDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseSectionGridDto(TypeDto typeDto, List list, String str, float f, String str2, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, int i, zcl zclVar) {
            this(typeDto, list, str, f, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : superAppUniversalWidgetActionDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseSectionGridDto)) {
                return false;
            }
            SuperAppShowcaseSectionGridDto superAppShowcaseSectionGridDto = (SuperAppShowcaseSectionGridDto) obj;
            return this.type == superAppShowcaseSectionGridDto.type && epx.f(this.items, superAppShowcaseSectionGridDto.items) && epx.f(this.trackCode, superAppShowcaseSectionGridDto.trackCode) && Float.compare(this.weight, superAppShowcaseSectionGridDto.weight) == 0 && epx.f(this.title, superAppShowcaseSectionGridDto.title) && epx.f(this.action, superAppShowcaseSectionGridDto.action);
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(fw3.a(this.type.hashCode() * 31, 31, this.items), 31, this.trackCode), 31);
            String str = this.title;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            return hashCode + (superAppUniversalWidgetActionDto != null ? superAppUniversalWidgetActionDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppShowcaseSectionGridDto(type=" + this.type + ", items=" + this.items + ", trackCode=" + this.trackCode + ", weight=" + this.weight + ", title=" + this.title + ", action=" + this.action + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.action, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseSectionGridDto(TypeDto typeDto, List<? extends SuperAppShowcaseSectionGridItemDto> list, String str, float f, String str2, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto) {
            super(null);
            this.type = typeDto;
            this.items = list;
            this.trackCode = str;
            this.weight = f;
            this.title = str2;
            this.action = superAppUniversalWidgetActionDto;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseSectionPosterDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseSectionPosterDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("image")
        private final List<SuperAppUniversalWidgetImageItemDto> image;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("user_stack")
        private final SuperAppShowcaseSectionPosterUserStackDto userStack;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("section_poster")
            public static final TypeDto SECTION_POSTER;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("SECTION_POSTER", 0, "section_poster");
                SECTION_POSTER = typeDto;
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseSectionPosterDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSectionPosterDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseSectionPosterDto.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseSectionPosterDto(createFromParcel, readString, superAppUniversalWidgetActionDto, arrayList, parcel.readString(), parcel.readFloat(), parcel.readInt() == 0 ? null : SuperAppShowcaseSectionPosterUserStackDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSectionPosterDto[] newArray(int i) {
                return new SuperAppShowcaseSectionPosterDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseSectionPosterDto(TypeDto typeDto, String str, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, List list, String str2, float f, SuperAppShowcaseSectionPosterUserStackDto superAppShowcaseSectionPosterUserStackDto, int i, zcl zclVar) {
            this(typeDto, str, superAppUniversalWidgetActionDto, list, str2, f, (i & 64) != 0 ? null : superAppShowcaseSectionPosterUserStackDto);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<SuperAppUniversalWidgetImageItemDto> e() {
            return this.image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseSectionPosterDto)) {
                return false;
            }
            SuperAppShowcaseSectionPosterDto superAppShowcaseSectionPosterDto = (SuperAppShowcaseSectionPosterDto) obj;
            return this.type == superAppShowcaseSectionPosterDto.type && epx.f(this.title, superAppShowcaseSectionPosterDto.title) && epx.f(this.action, superAppShowcaseSectionPosterDto.action) && epx.f(this.image, superAppShowcaseSectionPosterDto.image) && epx.f(this.trackCode, superAppShowcaseSectionPosterDto.trackCode) && Float.compare(this.weight, superAppShowcaseSectionPosterDto.weight) == 0 && epx.f(this.userStack, superAppShowcaseSectionPosterDto.userStack);
        }

        public final SuperAppShowcaseSectionPosterUserStackDto f() {
            return this.userStack;
        }

        public final float g() {
            return this.weight;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(fw3.a(zyk0.a(this.action, urd0.a(this.type.hashCode() * 31, 31, this.title), 31), 31, this.image), 31, this.trackCode), 31);
            SuperAppShowcaseSectionPosterUserStackDto superAppShowcaseSectionPosterUserStackDto = this.userStack;
            return a2 + (superAppShowcaseSectionPosterUserStackDto == null ? 0 : superAppShowcaseSectionPosterUserStackDto.hashCode());
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            return "SuperAppShowcaseSectionPosterDto(type=" + this.type + ", title=" + this.title + ", action=" + this.action + ", image=" + this.image + ", trackCode=" + this.trackCode + ", weight=" + this.weight + ", userStack=" + this.userStack + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.action, i);
            Iterator a2 = ao.a(parcel, this.image);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            SuperAppShowcaseSectionPosterUserStackDto superAppShowcaseSectionPosterUserStackDto = this.userStack;
            if (superAppShowcaseSectionPosterUserStackDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppShowcaseSectionPosterUserStackDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppShowcaseSectionPosterDto(TypeDto typeDto, String str, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, List<SuperAppUniversalWidgetImageItemDto> list, String str2, float f, SuperAppShowcaseSectionPosterUserStackDto superAppShowcaseSectionPosterUserStackDto) {
            super(null);
            this.type = typeDto;
            this.title = str;
            this.action = superAppUniversalWidgetActionDto;
            this.image = list;
            this.trackCode = str2;
            this.weight = f;
            this.userStack = superAppShowcaseSectionPosterUserStackDto;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseSectionScrollDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseSectionScrollDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("ad_info")
        private final SuperAppShowcaseSectionScrollAdInfoDto adInfo;

        @pmi0("items")
        private final List<SuperAppShowcaseSectionScrollItemDto> items;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("section_scroll")
            public static final TypeDto SECTION_SCROLL;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("SECTION_SCROLL", 0, "section_scroll");
                SECTION_SCROLL = typeDto;
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseSectionScrollDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSectionScrollDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SuperAppShowcaseSectionScrollDto.class, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseSectionScrollDto(createFromParcel, readString, arrayList, parcel.readString(), parcel.readFloat(), parcel.readString(), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseSectionScrollDto.class.getClassLoader()), parcel.readInt() == 0 ? null : SuperAppShowcaseSectionScrollAdInfoDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSectionScrollDto[] newArray(int i) {
                return new SuperAppShowcaseSectionScrollDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseSectionScrollDto(TypeDto typeDto, String str, List list, String str2, float f, String str3, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseSectionScrollAdInfoDto superAppShowcaseSectionScrollAdInfoDto, int i, zcl zclVar) {
            this(typeDto, str, list, str2, f, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : superAppUniversalWidgetActionDto, (i & 128) != 0 ? null : superAppShowcaseSectionScrollAdInfoDto);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppShowcaseSectionScrollAdInfoDto e() {
            return this.adInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseSectionScrollDto)) {
                return false;
            }
            SuperAppShowcaseSectionScrollDto superAppShowcaseSectionScrollDto = (SuperAppShowcaseSectionScrollDto) obj;
            return this.type == superAppShowcaseSectionScrollDto.type && epx.f(this.title, superAppShowcaseSectionScrollDto.title) && epx.f(this.items, superAppShowcaseSectionScrollDto.items) && epx.f(this.trackCode, superAppShowcaseSectionScrollDto.trackCode) && Float.compare(this.weight, superAppShowcaseSectionScrollDto.weight) == 0 && epx.f(this.subtitle, superAppShowcaseSectionScrollDto.subtitle) && epx.f(this.action, superAppShowcaseSectionScrollDto.action) && epx.f(this.adInfo, superAppShowcaseSectionScrollDto.adInfo);
        }

        public final List<SuperAppShowcaseSectionScrollItemDto> f() {
            return this.items;
        }

        public final String g() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(fw3.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.items), 31, this.trackCode), 31);
            String str = this.subtitle;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode2 = (hashCode + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppShowcaseSectionScrollAdInfoDto superAppShowcaseSectionScrollAdInfoDto = this.adInfo;
            return hashCode2 + (superAppShowcaseSectionScrollAdInfoDto != null ? superAppShowcaseSectionScrollAdInfoDto.hashCode() : 0);
        }

        public final float i() {
            return this.weight;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            return "SuperAppShowcaseSectionScrollDto(type=" + this.type + ", title=" + this.title + ", items=" + this.items + ", trackCode=" + this.trackCode + ", weight=" + this.weight + ", subtitle=" + this.subtitle + ", action=" + this.action + ", adInfo=" + this.adInfo + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.action, i);
            SuperAppShowcaseSectionScrollAdInfoDto superAppShowcaseSectionScrollAdInfoDto = this.adInfo;
            if (superAppShowcaseSectionScrollAdInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppShowcaseSectionScrollAdInfoDto.writeToParcel(parcel, i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseSectionScrollDto(TypeDto typeDto, String str, List<? extends SuperAppShowcaseSectionScrollItemDto> list, String str2, float f, String str3, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseSectionScrollAdInfoDto superAppShowcaseSectionScrollAdInfoDto) {
            super(null);
            this.type = typeDto;
            this.title = str;
            this.items = list;
            this.trackCode = str2;
            this.weight = f;
            this.subtitle = str3;
            this.action = superAppUniversalWidgetActionDto;
            this.adInfo = superAppShowcaseSectionScrollAdInfoDto;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseSectionVideoBannerDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseSectionVideoBannerDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("bottom")
        private final List<SuperAppShowcaseSectionVideoBannerBottomDto> bottom;

        @pmi0("image")
        private final List<SuperAppUniversalWidgetImageItemDto> image;

        @pmi0("state")
        private final String state;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("video")
        private final VideoVideoFullDto video;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("section_video_banner")
            public static final TypeDto SECTION_VIDEO_BANNER;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("SECTION_VIDEO_BANNER", 0, "section_video_banner");
                SECTION_VIDEO_BANNER = typeDto;
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseSectionVideoBannerDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSectionVideoBannerDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseSectionVideoBannerDto.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                int readInt2 = parcel.readInt();
                int i2 = 0;
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i2 != readInt2) {
                    i2 = bo.b(SuperAppShowcaseSectionVideoBannerDto.class, parcel, arrayList2, i2, 1);
                }
                return new SuperAppShowcaseSectionVideoBannerDto(createFromParcel, readString, superAppUniversalWidgetActionDto, arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readFloat(), (VideoVideoFullDto) parcel.readParcelable(SuperAppShowcaseSectionVideoBannerDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSectionVideoBannerDto[] newArray(int i) {
                return new SuperAppShowcaseSectionVideoBannerDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseSectionVideoBannerDto(TypeDto typeDto, String str, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, List list, List list2, String str2, String str3, float f, VideoVideoFullDto videoVideoFullDto, int i, zcl zclVar) {
            this(typeDto, str, superAppUniversalWidgetActionDto, list, list2, str2, str3, f, (i & 256) != 0 ? null : videoVideoFullDto);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<SuperAppShowcaseSectionVideoBannerBottomDto> e() {
            return this.bottom;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseSectionVideoBannerDto)) {
                return false;
            }
            SuperAppShowcaseSectionVideoBannerDto superAppShowcaseSectionVideoBannerDto = (SuperAppShowcaseSectionVideoBannerDto) obj;
            return this.type == superAppShowcaseSectionVideoBannerDto.type && epx.f(this.title, superAppShowcaseSectionVideoBannerDto.title) && epx.f(this.action, superAppShowcaseSectionVideoBannerDto.action) && epx.f(this.image, superAppShowcaseSectionVideoBannerDto.image) && epx.f(this.bottom, superAppShowcaseSectionVideoBannerDto.bottom) && epx.f(this.state, superAppShowcaseSectionVideoBannerDto.state) && epx.f(this.trackCode, superAppShowcaseSectionVideoBannerDto.trackCode) && Float.compare(this.weight, superAppShowcaseSectionVideoBannerDto.weight) == 0 && epx.f(this.video, superAppShowcaseSectionVideoBannerDto.video);
        }

        public final List<SuperAppUniversalWidgetImageItemDto> f() {
            return this.image;
        }

        public final String g() {
            return this.state;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(urd0.a(fw3.a(fw3.a(zyk0.a(this.action, urd0.a(this.type.hashCode() * 31, 31, this.title), 31), 31, this.image), 31, this.bottom), 31, this.state), 31, this.trackCode), 31);
            VideoVideoFullDto videoVideoFullDto = this.video;
            return a2 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode());
        }

        public final VideoVideoFullDto i() {
            return this.video;
        }

        public final float j() {
            return this.weight;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            return "SuperAppShowcaseSectionVideoBannerDto(type=" + this.type + ", title=" + this.title + ", action=" + this.action + ", image=" + this.image + ", bottom=" + this.bottom + ", state=" + this.state + ", trackCode=" + this.trackCode + ", weight=" + this.weight + ", video=" + this.video + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.action, i);
            Iterator a2 = ao.a(parcel, this.image);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
            }
            Iterator a3 = ao.a(parcel, this.bottom);
            while (a3.hasNext()) {
                parcel.writeParcelable((Parcelable) a3.next(), i);
            }
            parcel.writeString(this.state);
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeParcelable(this.video, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseSectionVideoBannerDto(TypeDto typeDto, String str, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, List<SuperAppUniversalWidgetImageItemDto> list, List<? extends SuperAppShowcaseSectionVideoBannerBottomDto> list2, String str2, String str3, float f, VideoVideoFullDto videoVideoFullDto) {
            super(null);
            this.type = typeDto;
            this.title = str;
            this.action = superAppUniversalWidgetActionDto;
            this.image = list;
            this.bottom = list2;
            this.state = str2;
            this.trackCode = str3;
            this.weight = f;
            this.video = videoVideoFullDto;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseServicesMenuDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseServicesMenuDto> CREATOR = new a();

        @pmi0("items")
        private final List<SuperAppShowcaseServicesMenuItemDto> items;

        @pmi0("more_item")
        private final SuperAppShowcaseServicesMenuMoreItemDto moreItem;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("services_menu")
            public static final TypeDto SERVICES_MENU;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("SERVICES_MENU", 0, "services_menu");
                SERVICES_MENU = typeDto;
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseServicesMenuDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppShowcaseServicesMenuItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseServicesMenuDto(createFromParcel, arrayList, SuperAppShowcaseServicesMenuMoreItemDto.CREATOR.createFromParcel(parcel), parcel.readFloat(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuDto[] newArray(int i) {
                return new SuperAppShowcaseServicesMenuDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseServicesMenuDto(TypeDto typeDto, List list, SuperAppShowcaseServicesMenuMoreItemDto superAppShowcaseServicesMenuMoreItemDto, float f, String str, int i, zcl zclVar) {
            this(typeDto, list, superAppShowcaseServicesMenuMoreItemDto, f, (i & 16) != 0 ? null : str);
        }

        public final List<SuperAppShowcaseServicesMenuItemDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppShowcaseServicesMenuMoreItemDto e() {
            return this.moreItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseServicesMenuDto)) {
                return false;
            }
            SuperAppShowcaseServicesMenuDto superAppShowcaseServicesMenuDto = (SuperAppShowcaseServicesMenuDto) obj;
            return this.type == superAppShowcaseServicesMenuDto.type && epx.f(this.items, superAppShowcaseServicesMenuDto.items) && epx.f(this.moreItem, superAppShowcaseServicesMenuDto.moreItem) && Float.compare(this.weight, superAppShowcaseServicesMenuDto.weight) == 0 && epx.f(this.trackCode, superAppShowcaseServicesMenuDto.trackCode);
        }

        public final float f() {
            return this.weight;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, (this.moreItem.hashCode() + fw3.a(this.type.hashCode() * 31, 31, this.items)) * 31, 31);
            String str = this.trackCode;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseServicesMenuDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", moreItem=");
            sb.append(this.moreItem);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", trackCode=");
            return ho8.a(sb, this.trackCode, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((SuperAppShowcaseServicesMenuItemDto) a2.next()).writeToParcel(parcel, i);
            }
            this.moreItem.writeToParcel(parcel, i);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.trackCode);
        }

        public SuperAppShowcaseServicesMenuDto(TypeDto typeDto, List<SuperAppShowcaseServicesMenuItemDto> list, SuperAppShowcaseServicesMenuMoreItemDto superAppShowcaseServicesMenuMoreItemDto, float f, String str) {
            super(null);
            this.type = typeDto;
            this.items = list;
            this.moreItem = superAppShowcaseServicesMenuMoreItemDto;
            this.weight = f;
            this.trackCode = str;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0(L2.g)
        private final SuperAppShowcaseTileBackgroundDto background;

        @pmi0("badge_info")
        private final SuperAppShowcaseBadgeDto badgeInfo;

        @pmi0("foreground")
        private final List<SuperAppShowcaseTileForegroundDto> foreground;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("is_enabled")
        private final Boolean isEnabled;

        @pmi0("is_unremovable")
        private final Boolean isUnremovable;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("uid")
        private final String uid;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("tile")
            public static final InnerTypeDto TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
            public static final class a implements Parcelable.Creator<InnerTypeDto> {
                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto createFromParcel(Parcel parcel) {
                    return InnerTypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto[] newArray(int i) {
                    return new InnerTypeDto[i];
                }
            }

            static {
                InnerTypeDto innerTypeDto = new InnerTypeDto("TILE", 0, "tile");
                TILE = innerTypeDto;
                InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
                $VALUES = innerTypeDtoArr;
                $ENTRIES = new asp(innerTypeDtoArr);
                CREATOR = new a();
            }

            private InnerTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static InnerTypeDto valueOf(String str) {
                return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
            }

            public static InnerTypeDto[] values() {
                return (InnerTypeDto[]) $VALUES.clone();
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
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("tile")
            public static final TypeDto TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("TILE", 0, "tile");
                TILE = typeDto;
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                InnerTypeDto createFromParcel2 = InnerTypeDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseTileDto.class.getClassLoader());
                SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto = (SuperAppShowcaseTileBackgroundDto) parcel.readParcelable(SuperAppShowcaseTileDto.class.getClassLoader());
                String readString = parcel.readString();
                float readFloat = parcel.readFloat();
                String readString2 = parcel.readString();
                int i = 0;
                ArrayList arrayList = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    while (i != readInt) {
                        i = bo.b(SuperAppShowcaseTileDto.class, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SuperAppShowcaseTileDto(createFromParcel, createFromParcel2, superAppUniversalWidgetActionDto, superAppShowcaseTileBackgroundDto, readString, readFloat, readString2, valueOf, valueOf2, arrayList, (SuperAppShowcaseBadgeDto) parcel.readParcelable(SuperAppShowcaseTileDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileDto[] newArray(int i) {
                return new SuperAppShowcaseTileDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto, String str, float f, String str2, Boolean bool, Boolean bool2, List list, SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto, int i, zcl zclVar) {
            this(typeDto, innerTypeDto, superAppUniversalWidgetActionDto, superAppShowcaseTileBackgroundDto, str, f, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : superAppShowcaseBadgeDto);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppShowcaseTileBackgroundDto e() {
            return this.background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileDto)) {
                return false;
            }
            SuperAppShowcaseTileDto superAppShowcaseTileDto = (SuperAppShowcaseTileDto) obj;
            return this.type == superAppShowcaseTileDto.type && this.innerType == superAppShowcaseTileDto.innerType && epx.f(this.action, superAppShowcaseTileDto.action) && epx.f(this.background, superAppShowcaseTileDto.background) && epx.f(this.trackCode, superAppShowcaseTileDto.trackCode) && Float.compare(this.weight, superAppShowcaseTileDto.weight) == 0 && epx.f(this.uid, superAppShowcaseTileDto.uid) && epx.f(this.isEnabled, superAppShowcaseTileDto.isEnabled) && epx.f(this.isUnremovable, superAppShowcaseTileDto.isUnremovable) && epx.f(this.foreground, superAppShowcaseTileDto.foreground) && epx.f(this.badgeInfo, superAppShowcaseTileDto.badgeInfo);
        }

        public final SuperAppShowcaseBadgeDto f() {
            return this.badgeInfo;
        }

        public final List<SuperAppShowcaseTileForegroundDto> g() {
            return this.foreground;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a((this.background.hashCode() + zyk0.a(this.action, (this.innerType.hashCode() + (this.type.hashCode() * 31)) * 31, 31)) * 31, 31, this.trackCode), 31);
            String str = this.uid;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isEnabled;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isUnremovable;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            List<SuperAppShowcaseTileForegroundDto> list = this.foreground;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto = this.badgeInfo;
            return hashCode4 + (superAppShowcaseBadgeDto != null ? superAppShowcaseBadgeDto.hashCode() : 0);
        }

        public final float i() {
            return this.weight;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            return "SuperAppShowcaseTileDto(type=" + this.type + ", innerType=" + this.innerType + ", action=" + this.action + ", background=" + this.background + ", trackCode=" + this.trackCode + ", weight=" + this.weight + ", uid=" + this.uid + ", isEnabled=" + this.isEnabled + ", isUnremovable=" + this.isUnremovable + ", foreground=" + this.foreground + ", badgeInfo=" + this.badgeInfo + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.innerType.writeToParcel(parcel, i);
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.background, i);
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.uid);
            Boolean bool = this.isEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.isUnremovable;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            List<SuperAppShowcaseTileForegroundDto> list = this.foreground;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeParcelable(this.badgeInfo, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto, String str, float f, String str2, Boolean bool, Boolean bool2, List<? extends SuperAppShowcaseTileForegroundDto> list, SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto) {
            super(null);
            this.type = typeDto;
            this.innerType = innerTypeDto;
            this.action = superAppUniversalWidgetActionDto;
            this.background = superAppShowcaseTileBackgroundDto;
            this.trackCode = str;
            this.weight = f;
            this.uid = str2;
            this.isEnabled = bool;
            this.isUnremovable = bool2;
            this.foreground = list;
            this.badgeInfo = superAppShowcaseBadgeDto;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseUniversalFullWidthDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseUniversalFullWidthDto> CREATOR = new a();

        @pmi0("any_view")
        private final AtumAnyViewDto anyView;

        @pmi0("is_enabled")
        private final Boolean isEnabled;

        @pmi0("is_unremovable")
        private final Boolean isUnremovable;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("uid")
        private final String uid;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("universal_full_width")
            public static final TypeDto UNIVERSAL_FULL_WIDTH;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("UNIVERSAL_FULL_WIDTH", 0, "universal_full_width");
                UNIVERSAL_FULL_WIDTH = typeDto;
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseUniversalFullWidthDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseUniversalFullWidthDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                AtumAnyViewDto atumAnyViewDto = (AtumAnyViewDto) parcel.readParcelable(SuperAppShowcaseUniversalFullWidthDto.class.getClassLoader());
                String readString = parcel.readString();
                float readFloat = parcel.readFloat();
                String readString2 = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SuperAppShowcaseUniversalFullWidthDto(createFromParcel, atumAnyViewDto, readString, readFloat, readString2, valueOf, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseUniversalFullWidthDto[] newArray(int i) {
                return new SuperAppShowcaseUniversalFullWidthDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseUniversalFullWidthDto(TypeDto typeDto, AtumAnyViewDto atumAnyViewDto, String str, float f, String str2, Boolean bool, Boolean bool2, int i, zcl zclVar) {
            this(typeDto, atumAnyViewDto, str, f, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2);
        }

        public final AtumAnyViewDto d() {
            return this.anyView;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final float e() {
            return this.weight;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseUniversalFullWidthDto)) {
                return false;
            }
            SuperAppShowcaseUniversalFullWidthDto superAppShowcaseUniversalFullWidthDto = (SuperAppShowcaseUniversalFullWidthDto) obj;
            return this.type == superAppShowcaseUniversalFullWidthDto.type && epx.f(this.anyView, superAppShowcaseUniversalFullWidthDto.anyView) && epx.f(this.trackCode, superAppShowcaseUniversalFullWidthDto.trackCode) && Float.compare(this.weight, superAppShowcaseUniversalFullWidthDto.weight) == 0 && epx.f(this.uid, superAppShowcaseUniversalFullWidthDto.uid) && epx.f(this.isEnabled, superAppShowcaseUniversalFullWidthDto.isEnabled) && epx.f(this.isUnremovable, superAppShowcaseUniversalFullWidthDto.isUnremovable);
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a((this.anyView.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.trackCode), 31);
            String str = this.uid;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isEnabled;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isUnremovable;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseUniversalFullWidthDto(type=");
            sb.append(this.type);
            sb.append(", anyView=");
            sb.append(this.anyView);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", uid=");
            sb.append(this.uid);
            sb.append(", isEnabled=");
            sb.append(this.isEnabled);
            sb.append(", isUnremovable=");
            return tn.a(sb, this.isUnremovable, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.anyView, i);
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.uid);
            Boolean bool = this.isEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.isUnremovable;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
        }

        public SuperAppShowcaseUniversalFullWidthDto(TypeDto typeDto, AtumAnyViewDto atumAnyViewDto, String str, float f, String str2, Boolean bool, Boolean bool2) {
            super(null);
            this.type = typeDto;
            this.anyView = atumAnyViewDto;
            this.trackCode = str;
            this.weight = f;
            this.uid = str2;
            this.isEnabled = bool;
            this.isUnremovable = bool2;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseWidgetTextDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseWidgetTextDto> CREATOR = new a();

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("text")
            public static final TypeDto TEXT;
            private final String value;

            /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("TEXT", 0, "text");
                TEXT = typeDto;
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

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseWidgetTextDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseWidgetTextDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseWidgetTextDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseWidgetTextDto[] newArray(int i) {
                return new SuperAppShowcaseWidgetTextDto[i];
            }
        }

        public SuperAppShowcaseWidgetTextDto(TypeDto typeDto, String str, float f) {
            super(null);
            this.type = typeDto;
            this.text = str;
            this.weight = f;
        }

        public final String d() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final float e() {
            return this.weight;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseWidgetTextDto)) {
                return false;
            }
            SuperAppShowcaseWidgetTextDto superAppShowcaseWidgetTextDto = (SuperAppShowcaseWidgetTextDto) obj;
            return this.type == superAppShowcaseWidgetTextDto.type && epx.f(this.text, superAppShowcaseWidgetTextDto.text) && Float.compare(this.weight, superAppShowcaseWidgetTextDto.weight) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.weight) + urd0.a(this.type.hashCode() * 31, 31, this.text);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseWidgetTextDto(type=");
            sb.append(this.type);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", weight=");
            return xq.c(')', this.weight, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            parcel.writeFloat(this.weight);
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetOnboardingPanelDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetOnboardingPanelDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("action")
        private final SuperAppWidgetOnboardingPanelActionDto action;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("closable")
        private final boolean closable;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("icon")
        private final List<SuperAppUniversalWidgetImageItemDto> icon;

        @pmi0("icon_color")
        private final List<String> iconColor;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetOnboardingPanelDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetOnboardingPanelDto createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppWidgetOnboardingPanelDto(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), (SuperAppWidgetOnboardingPanelActionDto) parcel.readParcelable(SuperAppWidgetOnboardingPanelDto.class.getClassLoader()), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetOnboardingPanelDto[] newArray(int i) {
                return new SuperAppWidgetOnboardingPanelDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetOnboardingPanelDto(List list, String str, String str2, boolean z, String str3, List list2, SuperAppWidgetOnboardingPanelActionDto superAppWidgetOnboardingPanelActionDto, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(list, str, str2, z, str3, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : superAppWidgetOnboardingPanelActionDto, (i & 128) != 0 ? null : superAppAccessibilityDto, (i & 256) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 512) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        public final SuperAppWidgetOnboardingPanelActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.closable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetOnboardingPanelDto)) {
                return false;
            }
            SuperAppWidgetOnboardingPanelDto superAppWidgetOnboardingPanelDto = (SuperAppWidgetOnboardingPanelDto) obj;
            return epx.f(this.icon, superAppWidgetOnboardingPanelDto.icon) && epx.f(this.title, superAppWidgetOnboardingPanelDto.title) && epx.f(this.subtitle, superAppWidgetOnboardingPanelDto.subtitle) && this.closable == superAppWidgetOnboardingPanelDto.closable && epx.f(this.trackCode, superAppWidgetOnboardingPanelDto.trackCode) && epx.f(this.iconColor, superAppWidgetOnboardingPanelDto.iconColor) && epx.f(this.action, superAppWidgetOnboardingPanelDto.action) && epx.f(this.accessibility, superAppWidgetOnboardingPanelDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetOnboardingPanelDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetOnboardingPanelDto.headerRightType && epx.f(this.weight, superAppWidgetOnboardingPanelDto.weight) && this.type == superAppWidgetOnboardingPanelDto.type;
        }

        public final List<SuperAppUniversalWidgetImageItemDto> f() {
            return this.icon;
        }

        public final List<String> g() {
            return this.iconColor;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = urd0.a(qoy.b(urd0.a(urd0.a(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.closable), 31, this.trackCode);
            List<String> list = this.iconColor;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppWidgetOnboardingPanelActionDto superAppWidgetOnboardingPanelActionDto = this.action;
            int hashCode2 = (hashCode + (superAppWidgetOnboardingPanelActionDto == null ? 0 : superAppWidgetOnboardingPanelActionDto.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode3 = (hashCode2 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode6 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String i() {
            return this.subtitle;
        }

        public final Float j() {
            return this.weight;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetOnboardingPanelDto(icon=");
            sb.append(this.icon);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", closable=");
            sb.append(this.closable);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", iconColor=");
            sb.append(this.iconColor);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.icon);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.closable ? 1 : 0);
            parcel.writeString(this.trackCode);
            parcel.writeStringList(this.iconColor);
            parcel.writeParcelable(this.action, i);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
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
            Float f = this.weight;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetOnboardingPanelDto(List<SuperAppUniversalWidgetImageItemDto> list, String str, String str2, boolean z, String str3, List<String> list2, SuperAppWidgetOnboardingPanelActionDto superAppWidgetOnboardingPanelActionDto, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.icon = list;
            this.title = str;
            this.subtitle = str2;
            this.closable = z;
            this.trackCode = str3;
            this.iconColor = list2;
            this.action = superAppWidgetOnboardingPanelActionDto;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetShowcaseMenuDto extends SuperAppShowcaseItemPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetShowcaseMenuDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("footer")
        private final SuperAppCustomMenuItemDto footer;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppCustomMenuItemDto> items;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppShowcaseItemPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetShowcaseMenuDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetShowcaseMenuDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppCustomMenuItemDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SuperAppWidgetShowcaseMenuDto(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : SuperAppCustomMenuItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetShowcaseMenuDto[] newArray(int i) {
                return new SuperAppWidgetShowcaseMenuDto[i];
            }
        }

        public SuperAppWidgetShowcaseMenuDto() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public final SuperAppUniversalWidgetAdditionalHeaderIconDto d() {
            return this.additionalHeaderIcon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppCustomMenuItemDto e() {
            return this.footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetShowcaseMenuDto)) {
                return false;
            }
            SuperAppWidgetShowcaseMenuDto superAppWidgetShowcaseMenuDto = (SuperAppWidgetShowcaseMenuDto) obj;
            return epx.f(this.items, superAppWidgetShowcaseMenuDto.items) && epx.f(this.trackCode, superAppWidgetShowcaseMenuDto.trackCode) && epx.f(this.footer, superAppWidgetShowcaseMenuDto.footer) && epx.f(this.accessibility, superAppWidgetShowcaseMenuDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetShowcaseMenuDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetShowcaseMenuDto.headerRightType && epx.f(this.weight, superAppWidgetShowcaseMenuDto.weight) && this.type == superAppWidgetShowcaseMenuDto.type;
        }

        public final SuperAppUniversalWidgetHeaderRightTypeDto f() {
            return this.headerRightType;
        }

        public final List<SuperAppCustomMenuItemDto> g() {
            return this.items;
        }

        public final int hashCode() {
            List<SuperAppCustomMenuItemDto> list = this.items;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.trackCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppCustomMenuItemDto superAppCustomMenuItemDto = this.footer;
            int hashCode3 = (hashCode2 + (superAppCustomMenuItemDto == null ? 0 : superAppCustomMenuItemDto.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode4 = (hashCode3 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode7 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final Float i() {
            return this.weight;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetShowcaseMenuDto(items=");
            sb.append(this.items);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<SuperAppCustomMenuItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppCustomMenuItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackCode);
            SuperAppCustomMenuItemDto superAppCustomMenuItemDto = this.footer;
            if (superAppCustomMenuItemDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppCustomMenuItemDto.writeToParcel(parcel, i);
            }
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
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
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppWidgetShowcaseMenuDto(List list, String str, SuperAppCustomMenuItemDto superAppCustomMenuItemDto, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : superAppCustomMenuItemDto, (i & 8) != 0 ? null : superAppAccessibilityDto, (i & 16) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 32) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        public SuperAppWidgetShowcaseMenuDto(List<SuperAppCustomMenuItemDto> list, String str, SuperAppCustomMenuItemDto superAppCustomMenuItemDto, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.items = list;
            this.trackCode = str;
            this.footer = superAppCustomMenuItemDto;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    public /* synthetic */ SuperAppShowcaseItemPayloadDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseItemPayloadDto() {
    }
}
