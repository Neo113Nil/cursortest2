package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AppsHintAppItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsHintAppItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsHintAppItemDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppDto f63app;

    @pmi0("description")
    private final String description;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsHintAppItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final TypeDto APP;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("game")
        public static final TypeDto GAME;

        @pmi0("vk_app")
        public static final TypeDto VK_APP;
        private final String value;

        /* compiled from: AppsHintAppItemDto.kt */
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
            TypeDto typeDto = new TypeDto("GAME", 0, "game");
            GAME = typeDto;
            TypeDto typeDto2 = new TypeDto("VK_APP", 1, "vk_app");
            VK_APP = typeDto2;
            TypeDto typeDto3 = new TypeDto("APP", 2, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            APP = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* compiled from: AppsHintAppItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsHintAppItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsHintAppItemDto createFromParcel(Parcel parcel) {
            return new AppsHintAppItemDto(TypeDto.CREATOR.createFromParcel(parcel), (AppsAppDto) parcel.readParcelable(AppsHintAppItemDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsHintAppItemDto[] newArray(int i) {
            return new AppsHintAppItemDto[i];
        }
    }

    public AppsHintAppItemDto(TypeDto typeDto, AppsAppDto appsAppDto, String str) {
        this.type = typeDto;
        this.f63app = appsAppDto;
        this.description = str;
    }

    public final AppsAppDto d() {
        return this.f63app;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsHintAppItemDto)) {
            return false;
        }
        AppsHintAppItemDto appsHintAppItemDto = (AppsHintAppItemDto) obj;
        return this.type == appsHintAppItemDto.type && epx.f(this.f63app, appsHintAppItemDto.f63app) && epx.f(this.description, appsHintAppItemDto.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + ((this.f63app.hashCode() + (this.type.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsHintAppItemDto(type=");
        sb.append(this.type);
        sb.append(", app=");
        sb.append(this.f63app);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f63app, i);
        parcel.writeString(this.description);
    }
}
