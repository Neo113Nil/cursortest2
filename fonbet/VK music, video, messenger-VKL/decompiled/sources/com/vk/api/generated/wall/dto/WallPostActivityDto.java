package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.base.dto.BaseBottomExtensionDto;
import com.vk.api.generated.classifieds.dto.ClassifiedsBottomExtensionDto;
import com.vk.api.generated.classifieds.dto.ClassifiedsDetectResultDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallPostActivityDto.kt */
/* loaded from: classes.dex */
public abstract class WallPostActivityDto implements Parcelable {

    /* compiled from: WallPostActivityDto.kt */
    public static final class Deserializer implements a9y<WallPostActivityDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "discriminator");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1528451439:
                        if (f.equals("share_to_story")) {
                            return (WallPostActivityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallPostActivityShareToStoryDto.class);
                        }
                        break;
                    case -1155856182:
                        if (f.equals("classifieds_bottom_extension")) {
                            return (WallPostActivityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallPostActivityClassifiedsBottomExtensionDto.class);
                        }
                        break;
                    case -100845781:
                        if (f.equals("bottom_extension")) {
                            return (WallPostActivityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallPostActivityBottomExtensionDto.class);
                        }
                        break;
                    case 96891546:
                        if (f.equals(NotificationCompat.CATEGORY_EVENT)) {
                            return (WallPostActivityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallPostActivityEventDto.class);
                        }
                        break;
                    case 102974396:
                        if (f.equals("likes")) {
                            return (WallPostActivityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallPostActivityLikesDto.class);
                        }
                        break;
                    case 108401386:
                        if (f.equals("reply")) {
                            return (WallPostActivityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallPostActivityReplyDto.class);
                        }
                        break;
                    case 145389109:
                        if (f.equals("reply_input")) {
                            return (WallPostActivityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallPostActivityReplyInputDto.class);
                        }
                        break;
                    case 1140324129:
                        if (f.equals("classifieds_detected")) {
                            return (WallPostActivityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallPostActivityClassifiedsDetectedDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: WallPostActivityDto.kt */
    /* loaded from: classes15.dex */
    public static final class WallPostActivityBottomExtensionDto extends WallPostActivityDto implements Parcelable {
        public static final Parcelable.Creator<WallPostActivityBottomExtensionDto> CREATOR = new a();

        @pmi0("bottom_extension")
        private final BaseBottomExtensionDto bottomExtension;

        @pmi0("discriminator")
        private final DiscriminatorDto discriminator;

        @pmi0("type")
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallPostActivityDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;

            @pmi0("bottom_extension")
            public static final DiscriminatorDto BOTTOM_EXTENSION;

            @pmi0("classifieds_bottom_extension")
            public static final DiscriminatorDto CLASSIFIEDS_BOTTOM_EXTENSION;

            @pmi0("classifieds_detected")
            public static final DiscriminatorDto CLASSIFIEDS_DETECTED;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_EVENT)
            public static final DiscriminatorDto EVENT;

            @pmi0("likes")
            public static final DiscriminatorDto LIKES;

            @pmi0("reply")
            public static final DiscriminatorDto REPLY;

            @pmi0("reply_input")
            public static final DiscriminatorDto REPLY_INPUT;

            @pmi0("share_to_story")
            public static final DiscriminatorDto SHARE_TO_STORY;
            private final String value;

            /* compiled from: WallPostActivityDto.kt */
            public static final class a implements Parcelable.Creator<DiscriminatorDto> {
                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto createFromParcel(Parcel parcel) {
                    return DiscriminatorDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto[] newArray(int i) {
                    return new DiscriminatorDto[i];
                }
            }

            static {
                DiscriminatorDto discriminatorDto = new DiscriminatorDto("LIKES", 0, "likes");
                LIKES = discriminatorDto;
                DiscriminatorDto discriminatorDto2 = new DiscriminatorDto("REPLY", 1, "reply");
                REPLY = discriminatorDto2;
                DiscriminatorDto discriminatorDto3 = new DiscriminatorDto("REPLY_INPUT", 2, "reply_input");
                REPLY_INPUT = discriminatorDto3;
                DiscriminatorDto discriminatorDto4 = new DiscriminatorDto("EVENT", 3, NotificationCompat.CATEGORY_EVENT);
                EVENT = discriminatorDto4;
                DiscriminatorDto discriminatorDto5 = new DiscriminatorDto("SHARE_TO_STORY", 4, "share_to_story");
                SHARE_TO_STORY = discriminatorDto5;
                DiscriminatorDto discriminatorDto6 = new DiscriminatorDto("BOTTOM_EXTENSION", 5, "bottom_extension");
                BOTTOM_EXTENSION = discriminatorDto6;
                DiscriminatorDto discriminatorDto7 = new DiscriminatorDto("CLASSIFIEDS_DETECTED", 6, "classifieds_detected");
                CLASSIFIEDS_DETECTED = discriminatorDto7;
                DiscriminatorDto discriminatorDto8 = new DiscriminatorDto("CLASSIFIEDS_BOTTOM_EXTENSION", 7, "classifieds_bottom_extension");
                CLASSIFIEDS_BOTTOM_EXTENSION = discriminatorDto8;
                DiscriminatorDto[] discriminatorDtoArr = {discriminatorDto, discriminatorDto2, discriminatorDto3, discriminatorDto4, discriminatorDto5, discriminatorDto6, discriminatorDto7, discriminatorDto8};
                $VALUES = discriminatorDtoArr;
                $ENTRIES = new asp(discriminatorDtoArr);
                CREATOR = new a();
            }

            private DiscriminatorDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static DiscriminatorDto valueOf(String str) {
                return (DiscriminatorDto) Enum.valueOf(DiscriminatorDto.class, str);
            }

            public static DiscriminatorDto[] values() {
                return (DiscriminatorDto[]) $VALUES.clone();
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

        /* compiled from: WallPostActivityDto.kt */
        public static final class a implements Parcelable.Creator<WallPostActivityBottomExtensionDto> {
            @Override // android.os.Parcelable.Creator
            public final WallPostActivityBottomExtensionDto createFromParcel(Parcel parcel) {
                return new WallPostActivityBottomExtensionDto(parcel.readInt() == 0 ? null : BaseBottomExtensionDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? DiscriminatorDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final WallPostActivityBottomExtensionDto[] newArray(int i) {
                return new WallPostActivityBottomExtensionDto[i];
            }
        }

        public WallPostActivityBottomExtensionDto() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallPostActivityBottomExtensionDto)) {
                return false;
            }
            WallPostActivityBottomExtensionDto wallPostActivityBottomExtensionDto = (WallPostActivityBottomExtensionDto) obj;
            return epx.f(this.bottomExtension, wallPostActivityBottomExtensionDto.bottomExtension) && epx.f(this.type, wallPostActivityBottomExtensionDto.type) && this.discriminator == wallPostActivityBottomExtensionDto.discriminator;
        }

        public final int hashCode() {
            BaseBottomExtensionDto baseBottomExtensionDto = this.bottomExtension;
            int hashCode = (baseBottomExtensionDto == null ? 0 : baseBottomExtensionDto.hashCode()) * 31;
            String str = this.type;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DiscriminatorDto discriminatorDto = this.discriminator;
            return hashCode2 + (discriminatorDto != null ? discriminatorDto.hashCode() : 0);
        }

        public final String toString() {
            return "WallPostActivityBottomExtensionDto(bottomExtension=" + this.bottomExtension + ", type=" + this.type + ", discriminator=" + this.discriminator + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            BaseBottomExtensionDto baseBottomExtensionDto = this.bottomExtension;
            if (baseBottomExtensionDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                baseBottomExtensionDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.type);
            DiscriminatorDto discriminatorDto = this.discriminator;
            if (discriminatorDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                discriminatorDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ WallPostActivityBottomExtensionDto(BaseBottomExtensionDto baseBottomExtensionDto, String str, DiscriminatorDto discriminatorDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : baseBottomExtensionDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : discriminatorDto);
        }

        public WallPostActivityBottomExtensionDto(BaseBottomExtensionDto baseBottomExtensionDto, String str, DiscriminatorDto discriminatorDto) {
            super(null);
            this.bottomExtension = baseBottomExtensionDto;
            this.type = str;
            this.discriminator = discriminatorDto;
        }
    }

    /* compiled from: WallPostActivityDto.kt */
    /* loaded from: classes15.dex */
    public static final class WallPostActivityClassifiedsBottomExtensionDto extends WallPostActivityDto implements Parcelable {
        public static final Parcelable.Creator<WallPostActivityClassifiedsBottomExtensionDto> CREATOR = new a();

        @pmi0("classifieds_bottom_extension")
        private final ClassifiedsBottomExtensionDto classifiedsBottomExtension;

        @pmi0("discriminator")
        private final DiscriminatorDto discriminator;

        @pmi0("type")
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallPostActivityDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;

            @pmi0("bottom_extension")
            public static final DiscriminatorDto BOTTOM_EXTENSION;

            @pmi0("classifieds_bottom_extension")
            public static final DiscriminatorDto CLASSIFIEDS_BOTTOM_EXTENSION;

            @pmi0("classifieds_detected")
            public static final DiscriminatorDto CLASSIFIEDS_DETECTED;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_EVENT)
            public static final DiscriminatorDto EVENT;

            @pmi0("likes")
            public static final DiscriminatorDto LIKES;

            @pmi0("reply")
            public static final DiscriminatorDto REPLY;

            @pmi0("reply_input")
            public static final DiscriminatorDto REPLY_INPUT;

            @pmi0("share_to_story")
            public static final DiscriminatorDto SHARE_TO_STORY;
            private final String value;

            /* compiled from: WallPostActivityDto.kt */
            public static final class a implements Parcelable.Creator<DiscriminatorDto> {
                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto createFromParcel(Parcel parcel) {
                    return DiscriminatorDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto[] newArray(int i) {
                    return new DiscriminatorDto[i];
                }
            }

            static {
                DiscriminatorDto discriminatorDto = new DiscriminatorDto("LIKES", 0, "likes");
                LIKES = discriminatorDto;
                DiscriminatorDto discriminatorDto2 = new DiscriminatorDto("REPLY", 1, "reply");
                REPLY = discriminatorDto2;
                DiscriminatorDto discriminatorDto3 = new DiscriminatorDto("REPLY_INPUT", 2, "reply_input");
                REPLY_INPUT = discriminatorDto3;
                DiscriminatorDto discriminatorDto4 = new DiscriminatorDto("EVENT", 3, NotificationCompat.CATEGORY_EVENT);
                EVENT = discriminatorDto4;
                DiscriminatorDto discriminatorDto5 = new DiscriminatorDto("SHARE_TO_STORY", 4, "share_to_story");
                SHARE_TO_STORY = discriminatorDto5;
                DiscriminatorDto discriminatorDto6 = new DiscriminatorDto("BOTTOM_EXTENSION", 5, "bottom_extension");
                BOTTOM_EXTENSION = discriminatorDto6;
                DiscriminatorDto discriminatorDto7 = new DiscriminatorDto("CLASSIFIEDS_DETECTED", 6, "classifieds_detected");
                CLASSIFIEDS_DETECTED = discriminatorDto7;
                DiscriminatorDto discriminatorDto8 = new DiscriminatorDto("CLASSIFIEDS_BOTTOM_EXTENSION", 7, "classifieds_bottom_extension");
                CLASSIFIEDS_BOTTOM_EXTENSION = discriminatorDto8;
                DiscriminatorDto[] discriminatorDtoArr = {discriminatorDto, discriminatorDto2, discriminatorDto3, discriminatorDto4, discriminatorDto5, discriminatorDto6, discriminatorDto7, discriminatorDto8};
                $VALUES = discriminatorDtoArr;
                $ENTRIES = new asp(discriminatorDtoArr);
                CREATOR = new a();
            }

            private DiscriminatorDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static DiscriminatorDto valueOf(String str) {
                return (DiscriminatorDto) Enum.valueOf(DiscriminatorDto.class, str);
            }

            public static DiscriminatorDto[] values() {
                return (DiscriminatorDto[]) $VALUES.clone();
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

        /* compiled from: WallPostActivityDto.kt */
        public static final class a implements Parcelable.Creator<WallPostActivityClassifiedsBottomExtensionDto> {
            @Override // android.os.Parcelable.Creator
            public final WallPostActivityClassifiedsBottomExtensionDto createFromParcel(Parcel parcel) {
                return new WallPostActivityClassifiedsBottomExtensionDto(parcel.readInt() == 0 ? null : ClassifiedsBottomExtensionDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? DiscriminatorDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final WallPostActivityClassifiedsBottomExtensionDto[] newArray(int i) {
                return new WallPostActivityClassifiedsBottomExtensionDto[i];
            }
        }

        public WallPostActivityClassifiedsBottomExtensionDto() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallPostActivityClassifiedsBottomExtensionDto)) {
                return false;
            }
            WallPostActivityClassifiedsBottomExtensionDto wallPostActivityClassifiedsBottomExtensionDto = (WallPostActivityClassifiedsBottomExtensionDto) obj;
            return epx.f(this.classifiedsBottomExtension, wallPostActivityClassifiedsBottomExtensionDto.classifiedsBottomExtension) && epx.f(this.type, wallPostActivityClassifiedsBottomExtensionDto.type) && this.discriminator == wallPostActivityClassifiedsBottomExtensionDto.discriminator;
        }

        public final int hashCode() {
            ClassifiedsBottomExtensionDto classifiedsBottomExtensionDto = this.classifiedsBottomExtension;
            int hashCode = (classifiedsBottomExtensionDto == null ? 0 : classifiedsBottomExtensionDto.hashCode()) * 31;
            String str = this.type;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DiscriminatorDto discriminatorDto = this.discriminator;
            return hashCode2 + (discriminatorDto != null ? discriminatorDto.hashCode() : 0);
        }

        public final String toString() {
            return "WallPostActivityClassifiedsBottomExtensionDto(classifiedsBottomExtension=" + this.classifiedsBottomExtension + ", type=" + this.type + ", discriminator=" + this.discriminator + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            ClassifiedsBottomExtensionDto classifiedsBottomExtensionDto = this.classifiedsBottomExtension;
            if (classifiedsBottomExtensionDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                classifiedsBottomExtensionDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.type);
            DiscriminatorDto discriminatorDto = this.discriminator;
            if (discriminatorDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                discriminatorDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ WallPostActivityClassifiedsBottomExtensionDto(ClassifiedsBottomExtensionDto classifiedsBottomExtensionDto, String str, DiscriminatorDto discriminatorDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : classifiedsBottomExtensionDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : discriminatorDto);
        }

        public WallPostActivityClassifiedsBottomExtensionDto(ClassifiedsBottomExtensionDto classifiedsBottomExtensionDto, String str, DiscriminatorDto discriminatorDto) {
            super(null);
            this.classifiedsBottomExtension = classifiedsBottomExtensionDto;
            this.type = str;
            this.discriminator = discriminatorDto;
        }
    }

    /* compiled from: WallPostActivityDto.kt */
    /* loaded from: classes15.dex */
    public static final class WallPostActivityClassifiedsDetectedDto extends WallPostActivityDto implements Parcelable {
        public static final Parcelable.Creator<WallPostActivityClassifiedsDetectedDto> CREATOR = new a();

        @pmi0("classifieds_detected")
        private final ClassifiedsDetectResultDto classifiedsDetected;

        @pmi0("discriminator")
        private final DiscriminatorDto discriminator;

        @pmi0("type")
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallPostActivityDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;

            @pmi0("bottom_extension")
            public static final DiscriminatorDto BOTTOM_EXTENSION;

            @pmi0("classifieds_bottom_extension")
            public static final DiscriminatorDto CLASSIFIEDS_BOTTOM_EXTENSION;

            @pmi0("classifieds_detected")
            public static final DiscriminatorDto CLASSIFIEDS_DETECTED;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_EVENT)
            public static final DiscriminatorDto EVENT;

            @pmi0("likes")
            public static final DiscriminatorDto LIKES;

            @pmi0("reply")
            public static final DiscriminatorDto REPLY;

            @pmi0("reply_input")
            public static final DiscriminatorDto REPLY_INPUT;

            @pmi0("share_to_story")
            public static final DiscriminatorDto SHARE_TO_STORY;
            private final String value;

            /* compiled from: WallPostActivityDto.kt */
            public static final class a implements Parcelable.Creator<DiscriminatorDto> {
                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto createFromParcel(Parcel parcel) {
                    return DiscriminatorDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto[] newArray(int i) {
                    return new DiscriminatorDto[i];
                }
            }

            static {
                DiscriminatorDto discriminatorDto = new DiscriminatorDto("LIKES", 0, "likes");
                LIKES = discriminatorDto;
                DiscriminatorDto discriminatorDto2 = new DiscriminatorDto("REPLY", 1, "reply");
                REPLY = discriminatorDto2;
                DiscriminatorDto discriminatorDto3 = new DiscriminatorDto("REPLY_INPUT", 2, "reply_input");
                REPLY_INPUT = discriminatorDto3;
                DiscriminatorDto discriminatorDto4 = new DiscriminatorDto("EVENT", 3, NotificationCompat.CATEGORY_EVENT);
                EVENT = discriminatorDto4;
                DiscriminatorDto discriminatorDto5 = new DiscriminatorDto("SHARE_TO_STORY", 4, "share_to_story");
                SHARE_TO_STORY = discriminatorDto5;
                DiscriminatorDto discriminatorDto6 = new DiscriminatorDto("BOTTOM_EXTENSION", 5, "bottom_extension");
                BOTTOM_EXTENSION = discriminatorDto6;
                DiscriminatorDto discriminatorDto7 = new DiscriminatorDto("CLASSIFIEDS_DETECTED", 6, "classifieds_detected");
                CLASSIFIEDS_DETECTED = discriminatorDto7;
                DiscriminatorDto discriminatorDto8 = new DiscriminatorDto("CLASSIFIEDS_BOTTOM_EXTENSION", 7, "classifieds_bottom_extension");
                CLASSIFIEDS_BOTTOM_EXTENSION = discriminatorDto8;
                DiscriminatorDto[] discriminatorDtoArr = {discriminatorDto, discriminatorDto2, discriminatorDto3, discriminatorDto4, discriminatorDto5, discriminatorDto6, discriminatorDto7, discriminatorDto8};
                $VALUES = discriminatorDtoArr;
                $ENTRIES = new asp(discriminatorDtoArr);
                CREATOR = new a();
            }

            private DiscriminatorDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static DiscriminatorDto valueOf(String str) {
                return (DiscriminatorDto) Enum.valueOf(DiscriminatorDto.class, str);
            }

            public static DiscriminatorDto[] values() {
                return (DiscriminatorDto[]) $VALUES.clone();
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

        /* compiled from: WallPostActivityDto.kt */
        public static final class a implements Parcelable.Creator<WallPostActivityClassifiedsDetectedDto> {
            @Override // android.os.Parcelable.Creator
            public final WallPostActivityClassifiedsDetectedDto createFromParcel(Parcel parcel) {
                return new WallPostActivityClassifiedsDetectedDto(parcel.readInt() == 0 ? null : ClassifiedsDetectResultDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? DiscriminatorDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final WallPostActivityClassifiedsDetectedDto[] newArray(int i) {
                return new WallPostActivityClassifiedsDetectedDto[i];
            }
        }

        public WallPostActivityClassifiedsDetectedDto() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallPostActivityClassifiedsDetectedDto)) {
                return false;
            }
            WallPostActivityClassifiedsDetectedDto wallPostActivityClassifiedsDetectedDto = (WallPostActivityClassifiedsDetectedDto) obj;
            return epx.f(this.classifiedsDetected, wallPostActivityClassifiedsDetectedDto.classifiedsDetected) && epx.f(this.type, wallPostActivityClassifiedsDetectedDto.type) && this.discriminator == wallPostActivityClassifiedsDetectedDto.discriminator;
        }

        public final int hashCode() {
            ClassifiedsDetectResultDto classifiedsDetectResultDto = this.classifiedsDetected;
            int hashCode = (classifiedsDetectResultDto == null ? 0 : classifiedsDetectResultDto.hashCode()) * 31;
            String str = this.type;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DiscriminatorDto discriminatorDto = this.discriminator;
            return hashCode2 + (discriminatorDto != null ? discriminatorDto.hashCode() : 0);
        }

        public final String toString() {
            return "WallPostActivityClassifiedsDetectedDto(classifiedsDetected=" + this.classifiedsDetected + ", type=" + this.type + ", discriminator=" + this.discriminator + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            ClassifiedsDetectResultDto classifiedsDetectResultDto = this.classifiedsDetected;
            if (classifiedsDetectResultDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                classifiedsDetectResultDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.type);
            DiscriminatorDto discriminatorDto = this.discriminator;
            if (discriminatorDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                discriminatorDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ WallPostActivityClassifiedsDetectedDto(ClassifiedsDetectResultDto classifiedsDetectResultDto, String str, DiscriminatorDto discriminatorDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : classifiedsDetectResultDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : discriminatorDto);
        }

        public WallPostActivityClassifiedsDetectedDto(ClassifiedsDetectResultDto classifiedsDetectResultDto, String str, DiscriminatorDto discriminatorDto) {
            super(null);
            this.classifiedsDetected = classifiedsDetectResultDto;
            this.type = str;
            this.discriminator = discriminatorDto;
        }
    }

    /* compiled from: WallPostActivityDto.kt */
    /* loaded from: classes15.dex */
    public static final class WallPostActivityEventDto extends WallPostActivityDto implements Parcelable {
        public static final Parcelable.Creator<WallPostActivityEventDto> CREATOR = new a();

        @pmi0("discriminator")
        private final DiscriminatorDto discriminator;

        @pmi0(NotificationCompat.CATEGORY_EVENT)
        private final WallPostActivityEventEventDto event;

        @pmi0("type")
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallPostActivityDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;

            @pmi0("bottom_extension")
            public static final DiscriminatorDto BOTTOM_EXTENSION;

            @pmi0("classifieds_bottom_extension")
            public static final DiscriminatorDto CLASSIFIEDS_BOTTOM_EXTENSION;

            @pmi0("classifieds_detected")
            public static final DiscriminatorDto CLASSIFIEDS_DETECTED;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_EVENT)
            public static final DiscriminatorDto EVENT;

            @pmi0("likes")
            public static final DiscriminatorDto LIKES;

            @pmi0("reply")
            public static final DiscriminatorDto REPLY;

            @pmi0("reply_input")
            public static final DiscriminatorDto REPLY_INPUT;

            @pmi0("share_to_story")
            public static final DiscriminatorDto SHARE_TO_STORY;
            private final String value;

            /* compiled from: WallPostActivityDto.kt */
            public static final class a implements Parcelable.Creator<DiscriminatorDto> {
                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto createFromParcel(Parcel parcel) {
                    return DiscriminatorDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto[] newArray(int i) {
                    return new DiscriminatorDto[i];
                }
            }

            static {
                DiscriminatorDto discriminatorDto = new DiscriminatorDto("LIKES", 0, "likes");
                LIKES = discriminatorDto;
                DiscriminatorDto discriminatorDto2 = new DiscriminatorDto("REPLY", 1, "reply");
                REPLY = discriminatorDto2;
                DiscriminatorDto discriminatorDto3 = new DiscriminatorDto("REPLY_INPUT", 2, "reply_input");
                REPLY_INPUT = discriminatorDto3;
                DiscriminatorDto discriminatorDto4 = new DiscriminatorDto("EVENT", 3, NotificationCompat.CATEGORY_EVENT);
                EVENT = discriminatorDto4;
                DiscriminatorDto discriminatorDto5 = new DiscriminatorDto("SHARE_TO_STORY", 4, "share_to_story");
                SHARE_TO_STORY = discriminatorDto5;
                DiscriminatorDto discriminatorDto6 = new DiscriminatorDto("BOTTOM_EXTENSION", 5, "bottom_extension");
                BOTTOM_EXTENSION = discriminatorDto6;
                DiscriminatorDto discriminatorDto7 = new DiscriminatorDto("CLASSIFIEDS_DETECTED", 6, "classifieds_detected");
                CLASSIFIEDS_DETECTED = discriminatorDto7;
                DiscriminatorDto discriminatorDto8 = new DiscriminatorDto("CLASSIFIEDS_BOTTOM_EXTENSION", 7, "classifieds_bottom_extension");
                CLASSIFIEDS_BOTTOM_EXTENSION = discriminatorDto8;
                DiscriminatorDto[] discriminatorDtoArr = {discriminatorDto, discriminatorDto2, discriminatorDto3, discriminatorDto4, discriminatorDto5, discriminatorDto6, discriminatorDto7, discriminatorDto8};
                $VALUES = discriminatorDtoArr;
                $ENTRIES = new asp(discriminatorDtoArr);
                CREATOR = new a();
            }

            private DiscriminatorDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static DiscriminatorDto valueOf(String str) {
                return (DiscriminatorDto) Enum.valueOf(DiscriminatorDto.class, str);
            }

            public static DiscriminatorDto[] values() {
                return (DiscriminatorDto[]) $VALUES.clone();
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

        /* compiled from: WallPostActivityDto.kt */
        public static final class a implements Parcelable.Creator<WallPostActivityEventDto> {
            @Override // android.os.Parcelable.Creator
            public final WallPostActivityEventDto createFromParcel(Parcel parcel) {
                return new WallPostActivityEventDto(parcel.readInt() == 0 ? null : WallPostActivityEventEventDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? DiscriminatorDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final WallPostActivityEventDto[] newArray(int i) {
                return new WallPostActivityEventDto[i];
            }
        }

        public WallPostActivityEventDto() {
            this(null, null, null, 7, null);
        }

        public final WallPostActivityEventEventDto d() {
            return this.event;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallPostActivityEventDto)) {
                return false;
            }
            WallPostActivityEventDto wallPostActivityEventDto = (WallPostActivityEventDto) obj;
            return epx.f(this.event, wallPostActivityEventDto.event) && epx.f(this.type, wallPostActivityEventDto.type) && this.discriminator == wallPostActivityEventDto.discriminator;
        }

        public final int hashCode() {
            WallPostActivityEventEventDto wallPostActivityEventEventDto = this.event;
            int hashCode = (wallPostActivityEventEventDto == null ? 0 : wallPostActivityEventEventDto.hashCode()) * 31;
            String str = this.type;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DiscriminatorDto discriminatorDto = this.discriminator;
            return hashCode2 + (discriminatorDto != null ? discriminatorDto.hashCode() : 0);
        }

        public final String toString() {
            return "WallPostActivityEventDto(event=" + this.event + ", type=" + this.type + ", discriminator=" + this.discriminator + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            WallPostActivityEventEventDto wallPostActivityEventEventDto = this.event;
            if (wallPostActivityEventEventDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostActivityEventEventDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.type);
            DiscriminatorDto discriminatorDto = this.discriminator;
            if (discriminatorDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                discriminatorDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ WallPostActivityEventDto(WallPostActivityEventEventDto wallPostActivityEventEventDto, String str, DiscriminatorDto discriminatorDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : wallPostActivityEventEventDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : discriminatorDto);
        }

        public WallPostActivityEventDto(WallPostActivityEventEventDto wallPostActivityEventEventDto, String str, DiscriminatorDto discriminatorDto) {
            super(null);
            this.event = wallPostActivityEventEventDto;
            this.type = str;
            this.discriminator = discriminatorDto;
        }
    }

    /* compiled from: WallPostActivityDto.kt */
    /* loaded from: classes15.dex */
    public static final class WallPostActivityLikesDto extends WallPostActivityDto implements Parcelable {
        public static final Parcelable.Creator<WallPostActivityLikesDto> CREATOR = new a();

        @pmi0("discriminator")
        private final DiscriminatorDto discriminator;

        @pmi0("likes")
        private final WallPostActivityLikesLikesDto likes;

        @pmi0("type")
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallPostActivityDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;

            @pmi0("bottom_extension")
            public static final DiscriminatorDto BOTTOM_EXTENSION;

            @pmi0("classifieds_bottom_extension")
            public static final DiscriminatorDto CLASSIFIEDS_BOTTOM_EXTENSION;

            @pmi0("classifieds_detected")
            public static final DiscriminatorDto CLASSIFIEDS_DETECTED;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_EVENT)
            public static final DiscriminatorDto EVENT;

            @pmi0("likes")
            public static final DiscriminatorDto LIKES;

            @pmi0("reply")
            public static final DiscriminatorDto REPLY;

            @pmi0("reply_input")
            public static final DiscriminatorDto REPLY_INPUT;

            @pmi0("share_to_story")
            public static final DiscriminatorDto SHARE_TO_STORY;
            private final String value;

            /* compiled from: WallPostActivityDto.kt */
            public static final class a implements Parcelable.Creator<DiscriminatorDto> {
                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto createFromParcel(Parcel parcel) {
                    return DiscriminatorDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto[] newArray(int i) {
                    return new DiscriminatorDto[i];
                }
            }

            static {
                DiscriminatorDto discriminatorDto = new DiscriminatorDto("LIKES", 0, "likes");
                LIKES = discriminatorDto;
                DiscriminatorDto discriminatorDto2 = new DiscriminatorDto("REPLY", 1, "reply");
                REPLY = discriminatorDto2;
                DiscriminatorDto discriminatorDto3 = new DiscriminatorDto("REPLY_INPUT", 2, "reply_input");
                REPLY_INPUT = discriminatorDto3;
                DiscriminatorDto discriminatorDto4 = new DiscriminatorDto("EVENT", 3, NotificationCompat.CATEGORY_EVENT);
                EVENT = discriminatorDto4;
                DiscriminatorDto discriminatorDto5 = new DiscriminatorDto("SHARE_TO_STORY", 4, "share_to_story");
                SHARE_TO_STORY = discriminatorDto5;
                DiscriminatorDto discriminatorDto6 = new DiscriminatorDto("BOTTOM_EXTENSION", 5, "bottom_extension");
                BOTTOM_EXTENSION = discriminatorDto6;
                DiscriminatorDto discriminatorDto7 = new DiscriminatorDto("CLASSIFIEDS_DETECTED", 6, "classifieds_detected");
                CLASSIFIEDS_DETECTED = discriminatorDto7;
                DiscriminatorDto discriminatorDto8 = new DiscriminatorDto("CLASSIFIEDS_BOTTOM_EXTENSION", 7, "classifieds_bottom_extension");
                CLASSIFIEDS_BOTTOM_EXTENSION = discriminatorDto8;
                DiscriminatorDto[] discriminatorDtoArr = {discriminatorDto, discriminatorDto2, discriminatorDto3, discriminatorDto4, discriminatorDto5, discriminatorDto6, discriminatorDto7, discriminatorDto8};
                $VALUES = discriminatorDtoArr;
                $ENTRIES = new asp(discriminatorDtoArr);
                CREATOR = new a();
            }

            private DiscriminatorDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static DiscriminatorDto valueOf(String str) {
                return (DiscriminatorDto) Enum.valueOf(DiscriminatorDto.class, str);
            }

            public static DiscriminatorDto[] values() {
                return (DiscriminatorDto[]) $VALUES.clone();
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

        /* compiled from: WallPostActivityDto.kt */
        public static final class a implements Parcelable.Creator<WallPostActivityLikesDto> {
            @Override // android.os.Parcelable.Creator
            public final WallPostActivityLikesDto createFromParcel(Parcel parcel) {
                return new WallPostActivityLikesDto(parcel.readInt() == 0 ? null : WallPostActivityLikesLikesDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? DiscriminatorDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final WallPostActivityLikesDto[] newArray(int i) {
                return new WallPostActivityLikesDto[i];
            }
        }

        public WallPostActivityLikesDto() {
            this(null, null, null, 7, null);
        }

        public final WallPostActivityLikesLikesDto d() {
            return this.likes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallPostActivityLikesDto)) {
                return false;
            }
            WallPostActivityLikesDto wallPostActivityLikesDto = (WallPostActivityLikesDto) obj;
            return epx.f(this.likes, wallPostActivityLikesDto.likes) && epx.f(this.type, wallPostActivityLikesDto.type) && this.discriminator == wallPostActivityLikesDto.discriminator;
        }

        public final int hashCode() {
            WallPostActivityLikesLikesDto wallPostActivityLikesLikesDto = this.likes;
            int hashCode = (wallPostActivityLikesLikesDto == null ? 0 : wallPostActivityLikesLikesDto.hashCode()) * 31;
            String str = this.type;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DiscriminatorDto discriminatorDto = this.discriminator;
            return hashCode2 + (discriminatorDto != null ? discriminatorDto.hashCode() : 0);
        }

        public final String toString() {
            return "WallPostActivityLikesDto(likes=" + this.likes + ", type=" + this.type + ", discriminator=" + this.discriminator + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            WallPostActivityLikesLikesDto wallPostActivityLikesLikesDto = this.likes;
            if (wallPostActivityLikesLikesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostActivityLikesLikesDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.type);
            DiscriminatorDto discriminatorDto = this.discriminator;
            if (discriminatorDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                discriminatorDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ WallPostActivityLikesDto(WallPostActivityLikesLikesDto wallPostActivityLikesLikesDto, String str, DiscriminatorDto discriminatorDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : wallPostActivityLikesLikesDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : discriminatorDto);
        }

        public WallPostActivityLikesDto(WallPostActivityLikesLikesDto wallPostActivityLikesLikesDto, String str, DiscriminatorDto discriminatorDto) {
            super(null);
            this.likes = wallPostActivityLikesLikesDto;
            this.type = str;
            this.discriminator = discriminatorDto;
        }
    }

    /* compiled from: WallPostActivityDto.kt */
    /* loaded from: classes15.dex */
    public static final class WallPostActivityReplyDto extends WallPostActivityDto implements Parcelable {
        public static final Parcelable.Creator<WallPostActivityReplyDto> CREATOR = new a();

        @pmi0("comments")
        private final List<WallWallCommentDto> comments;

        @pmi0("discriminator")
        private final DiscriminatorDto discriminator;

        @pmi0("display_type")
        private final DisplayTypeDto displayType;

        @pmi0("pinned_comment_raw_id")
        private final String pinnedCommentRawId;

        @pmi0("post_author_id")
        private final UserId postAuthorId;

        @pmi0("type")
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallPostActivityDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;

            @pmi0("bottom_extension")
            public static final DiscriminatorDto BOTTOM_EXTENSION;

            @pmi0("classifieds_bottom_extension")
            public static final DiscriminatorDto CLASSIFIEDS_BOTTOM_EXTENSION;

            @pmi0("classifieds_detected")
            public static final DiscriminatorDto CLASSIFIEDS_DETECTED;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_EVENT)
            public static final DiscriminatorDto EVENT;

            @pmi0("likes")
            public static final DiscriminatorDto LIKES;

            @pmi0("reply")
            public static final DiscriminatorDto REPLY;

            @pmi0("reply_input")
            public static final DiscriminatorDto REPLY_INPUT;

            @pmi0("share_to_story")
            public static final DiscriminatorDto SHARE_TO_STORY;
            private final String value;

            /* compiled from: WallPostActivityDto.kt */
            public static final class a implements Parcelable.Creator<DiscriminatorDto> {
                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto createFromParcel(Parcel parcel) {
                    return DiscriminatorDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto[] newArray(int i) {
                    return new DiscriminatorDto[i];
                }
            }

            static {
                DiscriminatorDto discriminatorDto = new DiscriminatorDto("LIKES", 0, "likes");
                LIKES = discriminatorDto;
                DiscriminatorDto discriminatorDto2 = new DiscriminatorDto("REPLY", 1, "reply");
                REPLY = discriminatorDto2;
                DiscriminatorDto discriminatorDto3 = new DiscriminatorDto("REPLY_INPUT", 2, "reply_input");
                REPLY_INPUT = discriminatorDto3;
                DiscriminatorDto discriminatorDto4 = new DiscriminatorDto("EVENT", 3, NotificationCompat.CATEGORY_EVENT);
                EVENT = discriminatorDto4;
                DiscriminatorDto discriminatorDto5 = new DiscriminatorDto("SHARE_TO_STORY", 4, "share_to_story");
                SHARE_TO_STORY = discriminatorDto5;
                DiscriminatorDto discriminatorDto6 = new DiscriminatorDto("BOTTOM_EXTENSION", 5, "bottom_extension");
                BOTTOM_EXTENSION = discriminatorDto6;
                DiscriminatorDto discriminatorDto7 = new DiscriminatorDto("CLASSIFIEDS_DETECTED", 6, "classifieds_detected");
                CLASSIFIEDS_DETECTED = discriminatorDto7;
                DiscriminatorDto discriminatorDto8 = new DiscriminatorDto("CLASSIFIEDS_BOTTOM_EXTENSION", 7, "classifieds_bottom_extension");
                CLASSIFIEDS_BOTTOM_EXTENSION = discriminatorDto8;
                DiscriminatorDto[] discriminatorDtoArr = {discriminatorDto, discriminatorDto2, discriminatorDto3, discriminatorDto4, discriminatorDto5, discriminatorDto6, discriminatorDto7, discriminatorDto8};
                $VALUES = discriminatorDtoArr;
                $ENTRIES = new asp(discriminatorDtoArr);
                CREATOR = new a();
            }

            private DiscriminatorDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static DiscriminatorDto valueOf(String str) {
                return (DiscriminatorDto) Enum.valueOf(DiscriminatorDto.class, str);
            }

            public static DiscriminatorDto[] values() {
                return (DiscriminatorDto[]) $VALUES.clone();
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
        /* compiled from: WallPostActivityDto.kt */
        public static final class DisplayTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DisplayTypeDto[] $VALUES;
            public static final Parcelable.Creator<DisplayTypeDto> CREATOR;

            @pmi0(BuildConfig.FLAVOR)
            public static final DisplayTypeDto DEFAULT;

            @pmi0("on_content")
            public static final DisplayTypeDto ON_CONTENT;
            private final String value;

            /* compiled from: WallPostActivityDto.kt */
            public static final class a implements Parcelable.Creator<DisplayTypeDto> {
                @Override // android.os.Parcelable.Creator
                public final DisplayTypeDto createFromParcel(Parcel parcel) {
                    return DisplayTypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DisplayTypeDto[] newArray(int i) {
                    return new DisplayTypeDto[i];
                }
            }

            static {
                DisplayTypeDto displayTypeDto = new DisplayTypeDto("DEFAULT", 0, BuildConfig.FLAVOR);
                DEFAULT = displayTypeDto;
                DisplayTypeDto displayTypeDto2 = new DisplayTypeDto("ON_CONTENT", 1, "on_content");
                ON_CONTENT = displayTypeDto2;
                DisplayTypeDto[] displayTypeDtoArr = {displayTypeDto, displayTypeDto2};
                $VALUES = displayTypeDtoArr;
                $ENTRIES = new asp(displayTypeDtoArr);
                CREATOR = new a();
            }

            private DisplayTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static DisplayTypeDto valueOf(String str) {
                return (DisplayTypeDto) Enum.valueOf(DisplayTypeDto.class, str);
            }

            public static DisplayTypeDto[] values() {
                return (DisplayTypeDto[]) $VALUES.clone();
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

        /* compiled from: WallPostActivityDto.kt */
        public static final class a implements Parcelable.Creator<WallPostActivityReplyDto> {
            @Override // android.os.Parcelable.Creator
            public final WallPostActivityReplyDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(WallWallCommentDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new WallPostActivityReplyDto(arrayList, (UserId) parcel.readParcelable(WallPostActivityReplyDto.class.getClassLoader()), parcel.readInt() == 0 ? null : DisplayTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? DiscriminatorDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final WallPostActivityReplyDto[] newArray(int i) {
                return new WallPostActivityReplyDto[i];
            }
        }

        public WallPostActivityReplyDto() {
            this(null, null, null, null, null, null, 63, null);
        }

        public final List<WallWallCommentDto> d() {
            return this.comments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final DisplayTypeDto e() {
            return this.displayType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallPostActivityReplyDto)) {
                return false;
            }
            WallPostActivityReplyDto wallPostActivityReplyDto = (WallPostActivityReplyDto) obj;
            return epx.f(this.comments, wallPostActivityReplyDto.comments) && epx.f(this.postAuthorId, wallPostActivityReplyDto.postAuthorId) && this.displayType == wallPostActivityReplyDto.displayType && epx.f(this.pinnedCommentRawId, wallPostActivityReplyDto.pinnedCommentRawId) && epx.f(this.type, wallPostActivityReplyDto.type) && this.discriminator == wallPostActivityReplyDto.discriminator;
        }

        public final UserId f() {
            return this.postAuthorId;
        }

        public final int hashCode() {
            List<WallWallCommentDto> list = this.comments;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            UserId userId = this.postAuthorId;
            int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            DisplayTypeDto displayTypeDto = this.displayType;
            int hashCode3 = (hashCode2 + (displayTypeDto == null ? 0 : displayTypeDto.hashCode())) * 31;
            String str = this.pinnedCommentRawId;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.type;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DiscriminatorDto discriminatorDto = this.discriminator;
            return hashCode5 + (discriminatorDto != null ? discriminatorDto.hashCode() : 0);
        }

        public final String toString() {
            return "WallPostActivityReplyDto(comments=" + this.comments + ", postAuthorId=" + this.postAuthorId + ", displayType=" + this.displayType + ", pinnedCommentRawId=" + this.pinnedCommentRawId + ", type=" + this.type + ", discriminator=" + this.discriminator + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<WallWallCommentDto> list = this.comments;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((WallWallCommentDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.postAuthorId, i);
            DisplayTypeDto displayTypeDto = this.displayType;
            if (displayTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                displayTypeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.pinnedCommentRawId);
            parcel.writeString(this.type);
            DiscriminatorDto discriminatorDto = this.discriminator;
            if (discriminatorDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                discriminatorDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ WallPostActivityReplyDto(List list, UserId userId, DisplayTypeDto displayTypeDto, String str, String str2, DiscriminatorDto discriminatorDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : displayTypeDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : discriminatorDto);
        }

        public WallPostActivityReplyDto(List<WallWallCommentDto> list, UserId userId, DisplayTypeDto displayTypeDto, String str, String str2, DiscriminatorDto discriminatorDto) {
            super(null);
            this.comments = list;
            this.postAuthorId = userId;
            this.displayType = displayTypeDto;
            this.pinnedCommentRawId = str;
            this.type = str2;
            this.discriminator = discriminatorDto;
        }
    }

    /* compiled from: WallPostActivityDto.kt */
    /* loaded from: classes15.dex */
    public static final class WallPostActivityReplyInputDto extends WallPostActivityDto implements Parcelable {
        public static final Parcelable.Creator<WallPostActivityReplyInputDto> CREATOR = new a();

        @pmi0("comments")
        private final List<WallWallCommentDto> comments;

        @pmi0("discriminator")
        private final DiscriminatorDto discriminator;

        @pmi0("type")
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallPostActivityDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;

            @pmi0("bottom_extension")
            public static final DiscriminatorDto BOTTOM_EXTENSION;

            @pmi0("classifieds_bottom_extension")
            public static final DiscriminatorDto CLASSIFIEDS_BOTTOM_EXTENSION;

            @pmi0("classifieds_detected")
            public static final DiscriminatorDto CLASSIFIEDS_DETECTED;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_EVENT)
            public static final DiscriminatorDto EVENT;

            @pmi0("likes")
            public static final DiscriminatorDto LIKES;

            @pmi0("reply")
            public static final DiscriminatorDto REPLY;

            @pmi0("reply_input")
            public static final DiscriminatorDto REPLY_INPUT;

            @pmi0("share_to_story")
            public static final DiscriminatorDto SHARE_TO_STORY;
            private final String value;

            /* compiled from: WallPostActivityDto.kt */
            public static final class a implements Parcelable.Creator<DiscriminatorDto> {
                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto createFromParcel(Parcel parcel) {
                    return DiscriminatorDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto[] newArray(int i) {
                    return new DiscriminatorDto[i];
                }
            }

            static {
                DiscriminatorDto discriminatorDto = new DiscriminatorDto("LIKES", 0, "likes");
                LIKES = discriminatorDto;
                DiscriminatorDto discriminatorDto2 = new DiscriminatorDto("REPLY", 1, "reply");
                REPLY = discriminatorDto2;
                DiscriminatorDto discriminatorDto3 = new DiscriminatorDto("REPLY_INPUT", 2, "reply_input");
                REPLY_INPUT = discriminatorDto3;
                DiscriminatorDto discriminatorDto4 = new DiscriminatorDto("EVENT", 3, NotificationCompat.CATEGORY_EVENT);
                EVENT = discriminatorDto4;
                DiscriminatorDto discriminatorDto5 = new DiscriminatorDto("SHARE_TO_STORY", 4, "share_to_story");
                SHARE_TO_STORY = discriminatorDto5;
                DiscriminatorDto discriminatorDto6 = new DiscriminatorDto("BOTTOM_EXTENSION", 5, "bottom_extension");
                BOTTOM_EXTENSION = discriminatorDto6;
                DiscriminatorDto discriminatorDto7 = new DiscriminatorDto("CLASSIFIEDS_DETECTED", 6, "classifieds_detected");
                CLASSIFIEDS_DETECTED = discriminatorDto7;
                DiscriminatorDto discriminatorDto8 = new DiscriminatorDto("CLASSIFIEDS_BOTTOM_EXTENSION", 7, "classifieds_bottom_extension");
                CLASSIFIEDS_BOTTOM_EXTENSION = discriminatorDto8;
                DiscriminatorDto[] discriminatorDtoArr = {discriminatorDto, discriminatorDto2, discriminatorDto3, discriminatorDto4, discriminatorDto5, discriminatorDto6, discriminatorDto7, discriminatorDto8};
                $VALUES = discriminatorDtoArr;
                $ENTRIES = new asp(discriminatorDtoArr);
                CREATOR = new a();
            }

            private DiscriminatorDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static DiscriminatorDto valueOf(String str) {
                return (DiscriminatorDto) Enum.valueOf(DiscriminatorDto.class, str);
            }

            public static DiscriminatorDto[] values() {
                return (DiscriminatorDto[]) $VALUES.clone();
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

        /* compiled from: WallPostActivityDto.kt */
        public static final class a implements Parcelable.Creator<WallPostActivityReplyInputDto> {
            @Override // android.os.Parcelable.Creator
            public final WallPostActivityReplyInputDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(WallWallCommentDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new WallPostActivityReplyInputDto(arrayList, parcel.readString(), parcel.readInt() != 0 ? DiscriminatorDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final WallPostActivityReplyInputDto[] newArray(int i) {
                return new WallPostActivityReplyInputDto[i];
            }
        }

        public WallPostActivityReplyInputDto() {
            this(null, null, null, 7, null);
        }

        public final List<WallWallCommentDto> d() {
            return this.comments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallPostActivityReplyInputDto)) {
                return false;
            }
            WallPostActivityReplyInputDto wallPostActivityReplyInputDto = (WallPostActivityReplyInputDto) obj;
            return epx.f(this.comments, wallPostActivityReplyInputDto.comments) && epx.f(this.type, wallPostActivityReplyInputDto.type) && this.discriminator == wallPostActivityReplyInputDto.discriminator;
        }

        public final int hashCode() {
            List<WallWallCommentDto> list = this.comments;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.type;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DiscriminatorDto discriminatorDto = this.discriminator;
            return hashCode2 + (discriminatorDto != null ? discriminatorDto.hashCode() : 0);
        }

        public final String toString() {
            return "WallPostActivityReplyInputDto(comments=" + this.comments + ", type=" + this.type + ", discriminator=" + this.discriminator + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<WallWallCommentDto> list = this.comments;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((WallWallCommentDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.type);
            DiscriminatorDto discriminatorDto = this.discriminator;
            if (discriminatorDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                discriminatorDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ WallPostActivityReplyInputDto(List list, String str, DiscriminatorDto discriminatorDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : discriminatorDto);
        }

        public WallPostActivityReplyInputDto(List<WallWallCommentDto> list, String str, DiscriminatorDto discriminatorDto) {
            super(null);
            this.comments = list;
            this.type = str;
            this.discriminator = discriminatorDto;
        }
    }

    /* compiled from: WallPostActivityDto.kt */
    /* loaded from: classes15.dex */
    public static final class WallPostActivityShareToStoryDto extends WallPostActivityDto implements Parcelable {
        public static final Parcelable.Creator<WallPostActivityShareToStoryDto> CREATOR = new a();

        @pmi0("discriminator")
        private final DiscriminatorDto discriminator;

        @pmi0("type")
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallPostActivityDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;

            @pmi0("bottom_extension")
            public static final DiscriminatorDto BOTTOM_EXTENSION;

            @pmi0("classifieds_bottom_extension")
            public static final DiscriminatorDto CLASSIFIEDS_BOTTOM_EXTENSION;

            @pmi0("classifieds_detected")
            public static final DiscriminatorDto CLASSIFIEDS_DETECTED;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_EVENT)
            public static final DiscriminatorDto EVENT;

            @pmi0("likes")
            public static final DiscriminatorDto LIKES;

            @pmi0("reply")
            public static final DiscriminatorDto REPLY;

            @pmi0("reply_input")
            public static final DiscriminatorDto REPLY_INPUT;

            @pmi0("share_to_story")
            public static final DiscriminatorDto SHARE_TO_STORY;
            private final String value;

            /* compiled from: WallPostActivityDto.kt */
            public static final class a implements Parcelable.Creator<DiscriminatorDto> {
                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto createFromParcel(Parcel parcel) {
                    return DiscriminatorDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DiscriminatorDto[] newArray(int i) {
                    return new DiscriminatorDto[i];
                }
            }

            static {
                DiscriminatorDto discriminatorDto = new DiscriminatorDto("LIKES", 0, "likes");
                LIKES = discriminatorDto;
                DiscriminatorDto discriminatorDto2 = new DiscriminatorDto("REPLY", 1, "reply");
                REPLY = discriminatorDto2;
                DiscriminatorDto discriminatorDto3 = new DiscriminatorDto("REPLY_INPUT", 2, "reply_input");
                REPLY_INPUT = discriminatorDto3;
                DiscriminatorDto discriminatorDto4 = new DiscriminatorDto("EVENT", 3, NotificationCompat.CATEGORY_EVENT);
                EVENT = discriminatorDto4;
                DiscriminatorDto discriminatorDto5 = new DiscriminatorDto("SHARE_TO_STORY", 4, "share_to_story");
                SHARE_TO_STORY = discriminatorDto5;
                DiscriminatorDto discriminatorDto6 = new DiscriminatorDto("BOTTOM_EXTENSION", 5, "bottom_extension");
                BOTTOM_EXTENSION = discriminatorDto6;
                DiscriminatorDto discriminatorDto7 = new DiscriminatorDto("CLASSIFIEDS_DETECTED", 6, "classifieds_detected");
                CLASSIFIEDS_DETECTED = discriminatorDto7;
                DiscriminatorDto discriminatorDto8 = new DiscriminatorDto("CLASSIFIEDS_BOTTOM_EXTENSION", 7, "classifieds_bottom_extension");
                CLASSIFIEDS_BOTTOM_EXTENSION = discriminatorDto8;
                DiscriminatorDto[] discriminatorDtoArr = {discriminatorDto, discriminatorDto2, discriminatorDto3, discriminatorDto4, discriminatorDto5, discriminatorDto6, discriminatorDto7, discriminatorDto8};
                $VALUES = discriminatorDtoArr;
                $ENTRIES = new asp(discriminatorDtoArr);
                CREATOR = new a();
            }

            private DiscriminatorDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static DiscriminatorDto valueOf(String str) {
                return (DiscriminatorDto) Enum.valueOf(DiscriminatorDto.class, str);
            }

            public static DiscriminatorDto[] values() {
                return (DiscriminatorDto[]) $VALUES.clone();
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

        /* compiled from: WallPostActivityDto.kt */
        public static final class a implements Parcelable.Creator<WallPostActivityShareToStoryDto> {
            @Override // android.os.Parcelable.Creator
            public final WallPostActivityShareToStoryDto createFromParcel(Parcel parcel) {
                return new WallPostActivityShareToStoryDto(parcel.readString(), parcel.readInt() == 0 ? null : DiscriminatorDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final WallPostActivityShareToStoryDto[] newArray(int i) {
                return new WallPostActivityShareToStoryDto[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WallPostActivityShareToStoryDto() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallPostActivityShareToStoryDto)) {
                return false;
            }
            WallPostActivityShareToStoryDto wallPostActivityShareToStoryDto = (WallPostActivityShareToStoryDto) obj;
            return epx.f(this.type, wallPostActivityShareToStoryDto.type) && this.discriminator == wallPostActivityShareToStoryDto.discriminator;
        }

        public final int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            DiscriminatorDto discriminatorDto = this.discriminator;
            return hashCode + (discriminatorDto != null ? discriminatorDto.hashCode() : 0);
        }

        public final String toString() {
            return "WallPostActivityShareToStoryDto(type=" + this.type + ", discriminator=" + this.discriminator + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            DiscriminatorDto discriminatorDto = this.discriminator;
            if (discriminatorDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                discriminatorDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ WallPostActivityShareToStoryDto(String str, DiscriminatorDto discriminatorDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : discriminatorDto);
        }

        public WallPostActivityShareToStoryDto(String str, DiscriminatorDto discriminatorDto) {
            super(null);
            this.type = str;
            this.discriminator = discriminatorDto;
        }
    }

    public /* synthetic */ WallPostActivityDto(zcl zclVar) {
        this();
    }

    private WallPostActivityDto() {
    }
}
