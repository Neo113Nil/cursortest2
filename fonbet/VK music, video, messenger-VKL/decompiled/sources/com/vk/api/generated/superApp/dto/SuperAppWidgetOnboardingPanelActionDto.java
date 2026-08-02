package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.core.JsonStringDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;
import xsna.zyk0;

/* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppWidgetOnboardingPanelActionDto implements Parcelable {

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    public static final class Deserializer implements a9y<SuperAppWidgetOnboardingPanelActionDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -743759368:
                        if (f.equals("share_me")) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionShareMeDto.class);
                        }
                        break;
                    case -650560904:
                        if (f.equals("open_settings")) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionOpenSettingsDto.class);
                        }
                        break;
                    case -624136624:
                        if (f.equals("send_message")) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionSendMessageDto.class);
                        }
                        break;
                    case -504306182:
                        if (f.equals("open_url")) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionOpenUrlDto.class);
                        }
                        break;
                    case -478042873:
                        if (f.equals("vk_internal")) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionVkInternalDto.class);
                        }
                        break;
                    case -172220347:
                        if (f.equals("callback")) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionCallbackDto.class);
                        }
                        break;
                    case 3045982:
                        if (f.equals(NotificationCompat.CATEGORY_CALL)) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionCallDto.class);
                        }
                        break;
                    case 170703335:
                        if (f.equals("grant_access")) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionGrantAccessDto.class);
                        }
                        break;
                    case 514841930:
                        if (f.equals("subscribe")) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionSubscribeDto.class);
                        }
                        break;
                    case 689656590:
                        if (f.equals("open_native_app")) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionOpenNativeAppDto.class);
                        }
                        break;
                    case 850282638:
                        if (f.equals("open_mini_app")) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionOpenAppDto.class);
                        }
                        break;
                    case 1545944263:
                        if (f.equals("open_game")) {
                            return (SuperAppWidgetOnboardingPanelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetActionOpenAppDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionCallDto extends SuperAppWidgetOnboardingPanelActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionCallDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("peer_id")
        private final int peerId;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0(NotificationCompat.CATEGORY_CALL)
            public static final TypeDto CALL;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("CALL", 0, NotificationCompat.CATEGORY_CALL);
                CALL = typeDto;
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

        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionCallDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionCallDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionCallDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionCallDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionCallDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionCallDto(TypeDto typeDto, int i, String str, int i2, zcl zclVar) {
            this(typeDto, i, (i2 & 4) != 0 ? null : str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionCallDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionCallDto superAppUniversalWidgetActionCallDto = (SuperAppUniversalWidgetActionCallDto) obj;
            return this.type == superAppUniversalWidgetActionCallDto.type && this.peerId == superAppUniversalWidgetActionCallDto.peerId && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionCallDto.accessibilityLabel);
        }

        public final int hashCode() {
            int a2 = shy.a(this.peerId, this.type.hashCode() * 31, 31);
            String str = this.accessibilityLabel;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionCallDto(type=");
            sb.append(this.type);
            sb.append(", peerId=");
            sb.append(this.peerId);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.peerId);
            parcel.writeString(this.accessibilityLabel);
        }

        public SuperAppUniversalWidgetActionCallDto(TypeDto typeDto, int i, String str) {
            super(null);
            this.type = typeDto;
            this.peerId = i;
            this.accessibilityLabel = str;
        }
    }

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionCallbackDto extends SuperAppWidgetOnboardingPanelActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionCallbackDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("payload")
        private final JsonStringDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("callback")
            public static final TypeDto CALLBACK;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("CALLBACK", 0, "callback");
                CALLBACK = typeDto;
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

        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionCallbackDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionCallbackDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionCallbackDto(TypeDto.CREATOR.createFromParcel(parcel), (JsonStringDto) parcel.readValue(SuperAppUniversalWidgetActionCallbackDto.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionCallbackDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionCallbackDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionCallbackDto(TypeDto typeDto, JsonStringDto jsonStringDto, String str, int i, zcl zclVar) {
            this(typeDto, jsonStringDto, (i & 4) != 0 ? null : str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionCallbackDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionCallbackDto superAppUniversalWidgetActionCallbackDto = (SuperAppUniversalWidgetActionCallbackDto) obj;
            return this.type == superAppUniversalWidgetActionCallbackDto.type && epx.f(this.payload, superAppUniversalWidgetActionCallbackDto.payload) && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionCallbackDto.accessibilityLabel);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.type.hashCode() * 31, 31, this.payload.a);
            String str = this.accessibilityLabel;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionCallbackDto(type=");
            sb.append(this.type);
            sb.append(", payload=");
            sb.append(this.payload);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeValue(this.payload);
            parcel.writeString(this.accessibilityLabel);
        }

        public SuperAppUniversalWidgetActionCallbackDto(TypeDto typeDto, JsonStringDto jsonStringDto, String str) {
            super(null);
            this.type = typeDto;
            this.payload = jsonStringDto;
            this.accessibilityLabel = str;
        }
    }

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionGrantAccessDto extends SuperAppWidgetOnboardingPanelActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionGrantAccessDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("needed_permissions")
        private final List<SuperAppUniversalWidgetPermissionsDto> neededPermissions;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("grant_access")
            public static final TypeDto GRANT_ACCESS;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("GRANT_ACCESS", 0, "grant_access");
                GRANT_ACCESS = typeDto;
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

        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionGrantAccessDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionGrantAccessDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetPermissionsDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppUniversalWidgetActionGrantAccessDto(createFromParcel, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionGrantAccessDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionGrantAccessDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionGrantAccessDto(TypeDto typeDto, List list, String str, int i, zcl zclVar) {
            this(typeDto, list, (i & 4) != 0 ? null : str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionGrantAccessDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionGrantAccessDto superAppUniversalWidgetActionGrantAccessDto = (SuperAppUniversalWidgetActionGrantAccessDto) obj;
            return this.type == superAppUniversalWidgetActionGrantAccessDto.type && epx.f(this.neededPermissions, superAppUniversalWidgetActionGrantAccessDto.neededPermissions) && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionGrantAccessDto.accessibilityLabel);
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.neededPermissions);
            String str = this.accessibilityLabel;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionGrantAccessDto(type=");
            sb.append(this.type);
            sb.append(", neededPermissions=");
            sb.append(this.neededPermissions);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.neededPermissions);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetPermissionsDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.accessibilityLabel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppUniversalWidgetActionGrantAccessDto(TypeDto typeDto, List<? extends SuperAppUniversalWidgetPermissionsDto> list, String str) {
            super(null);
            this.type = typeDto;
            this.neededPermissions = list;
            this.accessibilityLabel = str;
        }
    }

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionOpenAppDto extends SuperAppWidgetOnboardingPanelActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionOpenAppDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("app_launch_params")
        private final SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto appLaunchParams;

        @pmi0("item_id")
        private final Integer itemId;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("open_game")
            public static final TypeDto OPEN_GAME;

            @pmi0("open_mini_app")
            public static final TypeDto OPEN_MINI_APP;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("OPEN_MINI_APP", 0, "open_mini_app");
                OPEN_MINI_APP = typeDto;
                TypeDto typeDto2 = new TypeDto("OPEN_GAME", 1, "open_game");
                OPEN_GAME = typeDto2;
                TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionOpenAppDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOpenAppDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionOpenAppDto(TypeDto.CREATOR.createFromParcel(parcel), SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOpenAppDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionOpenAppDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionOpenAppDto(TypeDto typeDto, SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto superAppUniversalWidgetActionOpenAppAppLaunchParamsDto, String str, Integer num, String str2, String str3, int i, zcl zclVar) {
            this(typeDto, superAppUniversalWidgetActionOpenAppAppLaunchParamsDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
        }

        public final String d() {
            return this.accessibilityLabel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto e() {
            return this.appLaunchParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionOpenAppDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionOpenAppDto superAppUniversalWidgetActionOpenAppDto = (SuperAppUniversalWidgetActionOpenAppDto) obj;
            return this.type == superAppUniversalWidgetActionOpenAppDto.type && epx.f(this.appLaunchParams, superAppUniversalWidgetActionOpenAppDto.appLaunchParams) && epx.f(this.url, superAppUniversalWidgetActionOpenAppDto.url) && epx.f(this.itemId, superAppUniversalWidgetActionOpenAppDto.itemId) && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionOpenAppDto.accessibilityLabel) && epx.f(this.trackCode, superAppUniversalWidgetActionOpenAppDto.trackCode);
        }

        public final Integer f() {
            return this.itemId;
        }

        public final TypeDto g() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            int hashCode = (this.appLaunchParams.hashCode() + (this.type.hashCode() * 31)) * 31;
            String str = this.url;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.itemId;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.accessibilityLabel;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.trackCode;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionOpenAppDto(type=");
            sb.append(this.type);
            sb.append(", appLaunchParams=");
            sb.append(this.appLaunchParams);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", itemId=");
            sb.append(this.itemId);
            sb.append(", accessibilityLabel=");
            sb.append(this.accessibilityLabel);
            sb.append(", trackCode=");
            return ho8.a(sb, this.trackCode, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.appLaunchParams.writeToParcel(parcel, i);
            parcel.writeString(this.url);
            Integer num = this.itemId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.accessibilityLabel);
            parcel.writeString(this.trackCode);
        }

        public SuperAppUniversalWidgetActionOpenAppDto(TypeDto typeDto, SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto superAppUniversalWidgetActionOpenAppAppLaunchParamsDto, String str, Integer num, String str2, String str3) {
            super(null);
            this.type = typeDto;
            this.appLaunchParams = superAppUniversalWidgetActionOpenAppAppLaunchParamsDto;
            this.url = str;
            this.itemId = num;
            this.accessibilityLabel = str2;
            this.trackCode = str3;
        }
    }

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionOpenNativeAppDto extends SuperAppWidgetOnboardingPanelActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionOpenNativeAppDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0(CampaignEx.JSON_KEY_DEEP_LINK_URL)
        private final String deepLink;

        @pmi0("fallback_action")
        private final SuperAppUniversalWidgetActionDto fallbackAction;

        @pmi0("package_name")
        private final String packageName;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("open_native_app")
            public static final TypeDto OPEN_NATIVE_APP;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("OPEN_NATIVE_APP", 0, "open_native_app");
                OPEN_NATIVE_APP = typeDto;
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

        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionOpenNativeAppDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOpenNativeAppDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionOpenNativeAppDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetActionOpenNativeAppDto.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOpenNativeAppDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionOpenNativeAppDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionOpenNativeAppDto(TypeDto typeDto, String str, String str2, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str3, int i, zcl zclVar) {
            this(typeDto, str, str2, superAppUniversalWidgetActionDto, (i & 16) != 0 ? null : str3);
        }

        public final String d() {
            return this.accessibilityLabel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.deepLink;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionOpenNativeAppDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionOpenNativeAppDto superAppUniversalWidgetActionOpenNativeAppDto = (SuperAppUniversalWidgetActionOpenNativeAppDto) obj;
            return this.type == superAppUniversalWidgetActionOpenNativeAppDto.type && epx.f(this.packageName, superAppUniversalWidgetActionOpenNativeAppDto.packageName) && epx.f(this.deepLink, superAppUniversalWidgetActionOpenNativeAppDto.deepLink) && epx.f(this.fallbackAction, superAppUniversalWidgetActionOpenNativeAppDto.fallbackAction) && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionOpenNativeAppDto.accessibilityLabel);
        }

        public final SuperAppUniversalWidgetActionDto f() {
            return this.fallbackAction;
        }

        public final String g() {
            return this.packageName;
        }

        public final int hashCode() {
            int a2 = zyk0.a(this.fallbackAction, urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.packageName), 31, this.deepLink), 31);
            String str = this.accessibilityLabel;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionOpenNativeAppDto(type=");
            sb.append(this.type);
            sb.append(", packageName=");
            sb.append(this.packageName);
            sb.append(", deepLink=");
            sb.append(this.deepLink);
            sb.append(", fallbackAction=");
            sb.append(this.fallbackAction);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.packageName);
            parcel.writeString(this.deepLink);
            parcel.writeParcelable(this.fallbackAction, i);
            parcel.writeString(this.accessibilityLabel);
        }

        public SuperAppUniversalWidgetActionOpenNativeAppDto(TypeDto typeDto, String str, String str2, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str3) {
            super(null);
            this.type = typeDto;
            this.packageName = str;
            this.deepLink = str2;
            this.fallbackAction = superAppUniversalWidgetActionDto;
            this.accessibilityLabel = str3;
        }
    }

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionOpenSettingsDto extends SuperAppWidgetOnboardingPanelActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionOpenSettingsDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("open_settings")
            public static final TypeDto OPEN_SETTINGS;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("OPEN_SETTINGS", 0, "open_settings");
                OPEN_SETTINGS = typeDto;
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

        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionOpenSettingsDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOpenSettingsDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionOpenSettingsDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOpenSettingsDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionOpenSettingsDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionOpenSettingsDto(TypeDto typeDto, String str, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionOpenSettingsDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionOpenSettingsDto superAppUniversalWidgetActionOpenSettingsDto = (SuperAppUniversalWidgetActionOpenSettingsDto) obj;
            return this.type == superAppUniversalWidgetActionOpenSettingsDto.type && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionOpenSettingsDto.accessibilityLabel);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionOpenSettingsDto(type=");
            sb.append(this.type);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.accessibilityLabel);
        }

        public SuperAppUniversalWidgetActionOpenSettingsDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.accessibilityLabel = str;
        }
    }

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionOpenUrlDto extends SuperAppWidgetOnboardingPanelActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionOpenUrlDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("item_id")
        private final Integer itemId;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("open_url")
            public static final TypeDto OPEN_URL;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("OPEN_URL", 0, "open_url");
                OPEN_URL = typeDto;
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

        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionOpenUrlDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOpenUrlDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionOpenUrlDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionOpenUrlDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionOpenUrlDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionOpenUrlDto(TypeDto typeDto, String str, Integer num, String str2, int i, zcl zclVar) {
            this(typeDto, str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2);
        }

        public final String d() {
            return this.accessibilityLabel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Integer e() {
            return this.itemId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionOpenUrlDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionOpenUrlDto superAppUniversalWidgetActionOpenUrlDto = (SuperAppUniversalWidgetActionOpenUrlDto) obj;
            return this.type == superAppUniversalWidgetActionOpenUrlDto.type && epx.f(this.url, superAppUniversalWidgetActionOpenUrlDto.url) && epx.f(this.itemId, superAppUniversalWidgetActionOpenUrlDto.itemId) && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionOpenUrlDto.accessibilityLabel);
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            int a2 = urd0.a(this.type.hashCode() * 31, 31, this.url);
            Integer num = this.itemId;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionOpenUrlDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", itemId=");
            sb.append(this.itemId);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.url);
            Integer num = this.itemId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.accessibilityLabel);
        }

        public SuperAppUniversalWidgetActionOpenUrlDto(TypeDto typeDto, String str, Integer num, String str2) {
            super(null);
            this.type = typeDto;
            this.url = str;
            this.itemId = num;
            this.accessibilityLabel = str2;
        }
    }

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionSendMessageDto extends SuperAppWidgetOnboardingPanelActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionSendMessageDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("message")
        private final SuperAppUniversalWidgetActionSendMessageMessageDto message;

        @pmi0("peer_id")
        private final int peerId;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("send_message")
            public static final TypeDto SEND_MESSAGE;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("SEND_MESSAGE", 0, "send_message");
                SEND_MESSAGE = typeDto;
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

        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionSendMessageDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionSendMessageDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionSendMessageDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt(), SuperAppUniversalWidgetActionSendMessageMessageDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionSendMessageDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionSendMessageDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionSendMessageDto(TypeDto typeDto, int i, SuperAppUniversalWidgetActionSendMessageMessageDto superAppUniversalWidgetActionSendMessageMessageDto, String str, int i2, zcl zclVar) {
            this(typeDto, i, superAppUniversalWidgetActionSendMessageMessageDto, (i2 & 8) != 0 ? null : str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionSendMessageDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionSendMessageDto superAppUniversalWidgetActionSendMessageDto = (SuperAppUniversalWidgetActionSendMessageDto) obj;
            return this.type == superAppUniversalWidgetActionSendMessageDto.type && this.peerId == superAppUniversalWidgetActionSendMessageDto.peerId && epx.f(this.message, superAppUniversalWidgetActionSendMessageDto.message) && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionSendMessageDto.accessibilityLabel);
        }

        public final int hashCode() {
            int hashCode = (this.message.hashCode() + shy.a(this.peerId, this.type.hashCode() * 31, 31)) * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionSendMessageDto(type=");
            sb.append(this.type);
            sb.append(", peerId=");
            sb.append(this.peerId);
            sb.append(", message=");
            sb.append(this.message);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.peerId);
            this.message.writeToParcel(parcel, i);
            parcel.writeString(this.accessibilityLabel);
        }

        public SuperAppUniversalWidgetActionSendMessageDto(TypeDto typeDto, int i, SuperAppUniversalWidgetActionSendMessageMessageDto superAppUniversalWidgetActionSendMessageMessageDto, String str) {
            super(null);
            this.type = typeDto;
            this.peerId = i;
            this.message = superAppUniversalWidgetActionSendMessageMessageDto;
            this.accessibilityLabel = str;
        }
    }

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionShareMeDto extends SuperAppWidgetOnboardingPanelActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionShareMeDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("share_me")
            public static final TypeDto SHARE_ME;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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

        public final String d() {
            return this.accessibilityLabel;
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

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionSubscribeDto extends SuperAppWidgetOnboardingPanelActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionSubscribeDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("extra")
        private final SuperAppUniversalWidgetActionSubscribeExtraDto extra;

        @pmi0("object_id")
        private final long objectId;

        @pmi0("object_type")
        private final ObjectTypeDto objectType;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class ObjectTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ObjectTypeDto[] $VALUES;
            public static final Parcelable.Creator<ObjectTypeDto> CREATOR;

            @pmi0("group")
            public static final ObjectTypeDto GROUP;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
            public static final class a implements Parcelable.Creator<ObjectTypeDto> {
                @Override // android.os.Parcelable.Creator
                public final ObjectTypeDto createFromParcel(Parcel parcel) {
                    return ObjectTypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ObjectTypeDto[] newArray(int i) {
                    return new ObjectTypeDto[i];
                }
            }

            static {
                ObjectTypeDto objectTypeDto = new ObjectTypeDto("GROUP", 0, "group");
                GROUP = objectTypeDto;
                ObjectTypeDto[] objectTypeDtoArr = {objectTypeDto};
                $VALUES = objectTypeDtoArr;
                $ENTRIES = new asp(objectTypeDtoArr);
                CREATOR = new a();
            }

            private ObjectTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ObjectTypeDto valueOf(String str) {
                return (ObjectTypeDto) Enum.valueOf(ObjectTypeDto.class, str);
            }

            public static ObjectTypeDto[] values() {
                return (ObjectTypeDto[]) $VALUES.clone();
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
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("subscribe")
            public static final TypeDto SUBSCRIBE;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("SUBSCRIBE", 0, "subscribe");
                SUBSCRIBE = typeDto;
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

        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionSubscribeDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionSubscribeDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionSubscribeDto(TypeDto.CREATOR.createFromParcel(parcel), ObjectTypeDto.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetActionSubscribeExtraDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionSubscribeDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionSubscribeDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionSubscribeDto(TypeDto typeDto, ObjectTypeDto objectTypeDto, long j, SuperAppUniversalWidgetActionSubscribeExtraDto superAppUniversalWidgetActionSubscribeExtraDto, String str, int i, zcl zclVar) {
            this(typeDto, objectTypeDto, j, (i & 8) != 0 ? null : superAppUniversalWidgetActionSubscribeExtraDto, (i & 16) != 0 ? null : str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionSubscribeDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionSubscribeDto superAppUniversalWidgetActionSubscribeDto = (SuperAppUniversalWidgetActionSubscribeDto) obj;
            return this.type == superAppUniversalWidgetActionSubscribeDto.type && this.objectType == superAppUniversalWidgetActionSubscribeDto.objectType && this.objectId == superAppUniversalWidgetActionSubscribeDto.objectId && epx.f(this.extra, superAppUniversalWidgetActionSubscribeDto.extra) && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionSubscribeDto.accessibilityLabel);
        }

        public final int hashCode() {
            int a2 = bh10.a((this.objectType.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.objectId);
            SuperAppUniversalWidgetActionSubscribeExtraDto superAppUniversalWidgetActionSubscribeExtraDto = this.extra;
            int hashCode = (a2 + (superAppUniversalWidgetActionSubscribeExtraDto == null ? 0 : superAppUniversalWidgetActionSubscribeExtraDto.hashCode())) * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionSubscribeDto(type=");
            sb.append(this.type);
            sb.append(", objectType=");
            sb.append(this.objectType);
            sb.append(", objectId=");
            sb.append(this.objectId);
            sb.append(", extra=");
            sb.append(this.extra);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.objectType.writeToParcel(parcel, i);
            parcel.writeLong(this.objectId);
            SuperAppUniversalWidgetActionSubscribeExtraDto superAppUniversalWidgetActionSubscribeExtraDto = this.extra;
            if (superAppUniversalWidgetActionSubscribeExtraDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetActionSubscribeExtraDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.accessibilityLabel);
        }

        public SuperAppUniversalWidgetActionSubscribeDto(TypeDto typeDto, ObjectTypeDto objectTypeDto, long j, SuperAppUniversalWidgetActionSubscribeExtraDto superAppUniversalWidgetActionSubscribeExtraDto, String str) {
            super(null);
            this.type = typeDto;
            this.objectType = objectTypeDto;
            this.objectId = j;
            this.extra = superAppUniversalWidgetActionSubscribeExtraDto;
            this.accessibilityLabel = str;
        }
    }

    /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetActionVkInternalDto extends SuperAppWidgetOnboardingPanelActionDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetActionVkInternalDto> CREATOR = new a();

        @pmi0("accessibility_label")
        private final String accessibilityLabel;

        @pmi0("fallback_action")
        private final SuperAppUniversalWidgetActionDto fallbackAction;

        @pmi0("payload")
        private final SuperAppUniversalWidgetInternalActionDto payload;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("vk_internal")
            public static final TypeDto VK_INTERNAL;
            private final String value;

            /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("VK_INTERNAL", 0, "vk_internal");
                VK_INTERNAL = typeDto;
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

        /* compiled from: SuperAppWidgetOnboardingPanelActionDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionVkInternalDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionVkInternalDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetActionVkInternalDto(TypeDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetActionVkInternalDto.class.getClassLoader()), (SuperAppUniversalWidgetInternalActionDto) parcel.readParcelable(SuperAppUniversalWidgetActionVkInternalDto.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetActionVkInternalDto[] newArray(int i) {
                return new SuperAppUniversalWidgetActionVkInternalDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetActionVkInternalDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetInternalActionDto superAppUniversalWidgetInternalActionDto, String str, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : superAppUniversalWidgetActionDto, (i & 4) != 0 ? null : superAppUniversalWidgetInternalActionDto, (i & 8) != 0 ? null : str);
        }

        public final String d() {
            return this.accessibilityLabel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppUniversalWidgetActionDto e() {
            return this.fallbackAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetActionVkInternalDto)) {
                return false;
            }
            SuperAppUniversalWidgetActionVkInternalDto superAppUniversalWidgetActionVkInternalDto = (SuperAppUniversalWidgetActionVkInternalDto) obj;
            return this.type == superAppUniversalWidgetActionVkInternalDto.type && epx.f(this.fallbackAction, superAppUniversalWidgetActionVkInternalDto.fallbackAction) && epx.f(this.payload, superAppUniversalWidgetActionVkInternalDto.payload) && epx.f(this.accessibilityLabel, superAppUniversalWidgetActionVkInternalDto.accessibilityLabel);
        }

        public final SuperAppUniversalWidgetInternalActionDto f() {
            return this.payload;
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.fallbackAction;
            int hashCode2 = (hashCode + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppUniversalWidgetInternalActionDto superAppUniversalWidgetInternalActionDto = this.payload;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetInternalActionDto == null ? 0 : superAppUniversalWidgetInternalActionDto.hashCode())) * 31;
            String str = this.accessibilityLabel;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionVkInternalDto(type=");
            sb.append(this.type);
            sb.append(", fallbackAction=");
            sb.append(this.fallbackAction);
            sb.append(", payload=");
            sb.append(this.payload);
            sb.append(", accessibilityLabel=");
            return ho8.a(sb, this.accessibilityLabel, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.fallbackAction, i);
            parcel.writeParcelable(this.payload, i);
            parcel.writeString(this.accessibilityLabel);
        }

        public SuperAppUniversalWidgetActionVkInternalDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetInternalActionDto superAppUniversalWidgetInternalActionDto, String str) {
            super(null);
            this.type = typeDto;
            this.fallbackAction = superAppUniversalWidgetActionDto;
            this.payload = superAppUniversalWidgetInternalActionDto;
            this.accessibilityLabel = str;
        }
    }

    public /* synthetic */ SuperAppWidgetOnboardingPanelActionDto(zcl zclVar) {
        this();
    }

    private SuperAppWidgetOnboardingPanelActionDto() {
    }
}
