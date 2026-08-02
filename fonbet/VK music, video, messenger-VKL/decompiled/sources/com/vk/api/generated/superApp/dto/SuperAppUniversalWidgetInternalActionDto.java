package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.unity3d.ads.BuildConfig;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppUniversalWidgetInternalActionDto implements Parcelable {

    /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
    public static final class Deserializer implements a9y<SuperAppUniversalWidgetInternalActionDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1337539862:
                        if (f.equals("locality_picker")) {
                            return (SuperAppUniversalWidgetInternalActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionLocalityPickerDto.class);
                        }
                        break;
                    case -743759368:
                        if (f.equals("share_me")) {
                            return (SuperAppUniversalWidgetInternalActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionShareMeDto.class);
                        }
                        break;
                    case 21116443:
                        if (f.equals("onboarding")) {
                            return (SuperAppUniversalWidgetInternalActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionOnboardingDto.class);
                        }
                        break;
                    case 104263205:
                        if (f.equals("music")) {
                            return (SuperAppUniversalWidgetInternalActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionMusicDto.class);
                        }
                        break;
                    case 1213382441:
                        if (f.equals("open_assistant")) {
                            return (SuperAppUniversalWidgetInternalActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionOpenAssistantDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionLocalityPickerDto extends SuperAppUniversalWidgetInternalActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionLocalityPickerDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("locality_picker")
            public static final TypeDto LOCALITY_PICKER;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
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
                TypeDto typeDto = new TypeDto("LOCALITY_PICKER", 0, "locality_picker");
                LOCALITY_PICKER = typeDto;
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

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionLocalityPickerDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionLocalityPickerDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionLocalityPickerDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionLocalityPickerDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionLocalityPickerDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionLocalityPickerDto(TypeDto typeDto, String str, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : str);
        }

        public final TypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionLocalityPickerDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionLocalityPickerDto superAppUniversalWidgetActionLocalityPickerDto = (SuperAppUniversalWidgetActionLocalityPickerDto) obj;
            return this.type == superAppUniversalWidgetActionLocalityPickerDto.type && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionLocalityPickerDto.accessibilityLabel);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionLocalityPickerDto(type=");
            sb.append(this.type);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.accessibilityLabel);
        }

        public SuperAppUniversalWidgetActionLocalityPickerDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.accessibilityLabel = str;
        }
    }

    /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionMusicDto extends SuperAppUniversalWidgetInternalActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionMusicDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("block_id")
        private final String blockId;

        @pmi0("extra")
        private final ExtraDto extra;

        @pmi0("item_id")
        private final Integer itemId;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class ExtraDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ExtraDto[] $VALUES;
            public static final Parcelable.Creator<ExtraDto> CREATOR;

            @pmi0("play")
            public static final ExtraDto PLAY;

            @pmi0("shuffle")
            public static final ExtraDto SHUFFLE;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
            public static final class a implements Parcelable.Creator<ExtraDto> {
                @Override // android.os.Parcelable.Creator
                public final ExtraDto createFromParcel(Parcel parcel) {
                    return ExtraDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraDto[] newArray(int i) {
                    return new ExtraDto[i];
                }
            }

            static {
                ExtraDto extraDto = new ExtraDto("PLAY", 0, "play");
                PLAY = extraDto;
                ExtraDto extraDto2 = new ExtraDto("SHUFFLE", 1, "shuffle");
                SHUFFLE = extraDto2;
                ExtraDto[] extraDtoArr = {extraDto, extraDto2};
                $VALUES = extraDtoArr;
                $ENTRIES = new asp(extraDtoArr);
                CREATOR = new a();
            }

            private ExtraDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ExtraDto valueOf(String str) {
                return (ExtraDto) Enum.valueOf(ExtraDto.class, str);
            }

            public static ExtraDto[] values() {
                return (ExtraDto[]) $VALUES.clone();
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
        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("music")
            public static final TypeDto MUSIC;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
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
                TypeDto typeDto = new TypeDto("MUSIC", 0, "music");
                MUSIC = typeDto;
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

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionMusicDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionMusicDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionMusicDto(TypeDto.CREATOR.createFromParcel(parcel), ExtraDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionMusicDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionMusicDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionMusicDto(TypeDto typeDto, ExtraDto extraDto, String str, Integer num, String str2, int i, zcl zclVar) {
            this(typeDto, extraDto, str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2);
        }

        public final String d() {
            return this.blockId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ExtraDto e() {
            return this.extra;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionMusicDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionMusicDto superAppUniversalWidgetActionMusicDto = (SuperAppUniversalWidgetActionMusicDto) obj;
            return this.type == superAppUniversalWidgetActionMusicDto.type && this.extra == superAppUniversalWidgetActionMusicDto.extra && epx.f(this.blockId, superAppUniversalWidgetActionMusicDto.blockId) && epx.f(this.itemId, superAppUniversalWidgetActionMusicDto.itemId) && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionMusicDto.accessibilityLabel);
        }

        public final Integer f() {
            return this.itemId;
        }

        public final TypeDto g() {
            return this.type;
        }

        public final int hashCode() {
            int a2 = urd0.a((this.extra.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.blockId);
            Integer num = this.itemId;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionMusicDto(type=");
            sb.append(this.type);
            sb.append(", extra=");
            sb.append(this.extra);
            sb.append(", blockId=");
            sb.append(this.blockId);
            sb.append(", itemId=");
            sb.append(this.itemId);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.extra.writeToParcel(parcel, i);
            parcel.writeString(this.blockId);
            Integer num = this.itemId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.accessibilityLabel);
        }

        public SuperAppUniversalWidgetActionMusicDto(TypeDto typeDto, ExtraDto extraDto, String str, Integer num, String str2) {
            super(null);
            this.type = typeDto;
            this.extra = extraDto;
            this.blockId = str;
            this.itemId = num;
            this.accessibilityLabel = str2;
        }
    }

    /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionOnboardingDto extends SuperAppUniversalWidgetInternalActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionOnboardingDto> CREATOR = new a();

        @pmi0("name")
        private final NameDto name;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class NameDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ NameDto[] $VALUES;
            public static final Parcelable.Creator<NameDto> CREATOR;

            @pmi0(BuildConfig.FLAVOR)
            public static final NameDto DEFAULT;

            @pmi0("redesign_v3_header")
            public static final NameDto REDESIGN_V3_HEADER;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
            public static final class a implements Parcelable.Creator<NameDto> {
                @Override // android.os.Parcelable.Creator
                public final NameDto createFromParcel(Parcel parcel) {
                    return NameDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final NameDto[] newArray(int i) {
                    return new NameDto[i];
                }
            }

            static {
                NameDto nameDto = new NameDto("DEFAULT", 0, BuildConfig.FLAVOR);
                DEFAULT = nameDto;
                NameDto nameDto2 = new NameDto("REDESIGN_V3_HEADER", 1, "redesign_v3_header");
                REDESIGN_V3_HEADER = nameDto2;
                NameDto[] nameDtoArr = {nameDto, nameDto2};
                $VALUES = nameDtoArr;
                $ENTRIES = new asp(nameDtoArr);
                CREATOR = new a();
            }

            private NameDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static NameDto valueOf(String str) {
                return (NameDto) Enum.valueOf(NameDto.class, str);
            }

            public static NameDto[] values() {
                return (NameDto[]) $VALUES.clone();
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
        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("onboarding")
            public static final TypeDto ONBOARDING;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
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
                TypeDto typeDto = new TypeDto("ONBOARDING", 0, "onboarding");
                ONBOARDING = typeDto;
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

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionOnboardingDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOnboardingDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionOnboardingDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NameDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOnboardingDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionOnboardingDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionOnboardingDto(TypeDto typeDto, NameDto nameDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : nameDto);
        }

        public final NameDto d() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final TypeDto e() {
            return this.type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionOnboardingDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionOnboardingDto superAppUniversalWidgetActionOnboardingDto = (SuperAppUniversalWidgetActionOnboardingDto) obj;
            return this.type == superAppUniversalWidgetActionOnboardingDto.type && this.name == superAppUniversalWidgetActionOnboardingDto.name;
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            NameDto nameDto = this.name;
            return hashCode + (nameDto == null ? 0 : nameDto.hashCode());
        }

        public final String toString() {
            return "SuperAppUniversalWidgetActionOnboardingDto(type=" + this.type + ", name=" + this.name + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            NameDto nameDto = this.name;
            if (nameDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                nameDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetActionOnboardingDto(TypeDto typeDto, NameDto nameDto) {
            super(null);
            this.type = typeDto;
            this.name = nameDto;
        }
    }

    /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionOpenAssistantDto extends SuperAppUniversalWidgetInternalActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionOpenAssistantDto> CREATOR = new a();

        @pmi0("suggest")
        private final SuperAppUniversalWidgetActionOpenAssistantSuggestDto suggest;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("open_assistant")
            public static final TypeDto OPEN_ASSISTANT;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
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
                TypeDto typeDto = new TypeDto("OPEN_ASSISTANT", 0, "open_assistant");
                OPEN_ASSISTANT = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionOpenAssistantDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOpenAssistantDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionOpenAssistantDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetActionOpenAssistantSuggestDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOpenAssistantDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionOpenAssistantDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionOpenAssistantDto(TypeDto typeDto, SuperAppUniversalWidgetActionOpenAssistantSuggestDto superAppUniversalWidgetActionOpenAssistantSuggestDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : superAppUniversalWidgetActionOpenAssistantSuggestDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionOpenAssistantDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionOpenAssistantDto superAppUniversalWidgetActionOpenAssistantDto = (SuperAppUniversalWidgetActionOpenAssistantDto) obj;
            return this.type == superAppUniversalWidgetActionOpenAssistantDto.type && epx.f(this.suggest, superAppUniversalWidgetActionOpenAssistantDto.suggest);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            SuperAppUniversalWidgetActionOpenAssistantSuggestDto superAppUniversalWidgetActionOpenAssistantSuggestDto = this.suggest;
            return hashCode + (superAppUniversalWidgetActionOpenAssistantSuggestDto == null ? 0 : superAppUniversalWidgetActionOpenAssistantSuggestDto.hashCode());
        }

        public final String toString() {
            return "SuperAppUniversalWidgetActionOpenAssistantDto(type=" + this.type + ", suggest=" + this.suggest + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            SuperAppUniversalWidgetActionOpenAssistantSuggestDto superAppUniversalWidgetActionOpenAssistantSuggestDto = this.suggest;
            if (superAppUniversalWidgetActionOpenAssistantSuggestDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetActionOpenAssistantSuggestDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetActionOpenAssistantDto(TypeDto typeDto, SuperAppUniversalWidgetActionOpenAssistantSuggestDto superAppUniversalWidgetActionOpenAssistantSuggestDto) {
            super(null);
            this.type = typeDto;
            this.suggest = superAppUniversalWidgetActionOpenAssistantSuggestDto;
        }
    }

    /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionShareMeDto extends SuperAppUniversalWidgetInternalActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionShareMeDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("share_me")
            public static final TypeDto SHARE_ME;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
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
                TypeDto typeDto = new TypeDto("SHARE_ME", 0, "share_me");
                SHARE_ME = typeDto;
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

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: SuperAppUniversalWidgetInternalActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionShareMeDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionShareMeDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionShareMeDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionShareMeDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionShareMeDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionShareMeDto(TypeDto typeDto, String str, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : str);
        }

        public final TypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionShareMeDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionShareMeDto superAppUniversalWidgetActionShareMeDto = (SuperAppUniversalWidgetActionShareMeDto) obj;
            return this.type == superAppUniversalWidgetActionShareMeDto.type && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionShareMeDto.accessibilityLabel);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionShareMeDto(type=");
            sb.append(this.type);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.accessibilityLabel);
        }

        public SuperAppUniversalWidgetActionShareMeDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.accessibilityLabel = str;
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetInternalActionDto(zcl zclVar) {
        this();
    }

    private SuperAppUniversalWidgetInternalActionDto() {
    }
}
