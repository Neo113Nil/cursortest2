package com.vk.api.generated.tabbar.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TabbarItemSuggestDto.kt */
/* loaded from: classes15.dex */
public final class TabbarItemSuggestDto implements Parcelable {
    public static final Parcelable.Creator<TabbarItemSuggestDto> CREATOR = new a();

    @pmi0("replacement")
    private final TabbarItemDto replacement;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TabbarItemSuggestDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("add")
        public static final TypeDto ADD;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(SignalingProtocol.KEY_REMOVE)
        public static final TypeDto REMOVE;
        private final String value;

        /* compiled from: TabbarItemSuggestDto.kt */
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
            TypeDto typeDto = new TypeDto("ADD", 0, "add");
            ADD = typeDto;
            TypeDto typeDto2 = new TypeDto(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 1, SignalingProtocol.KEY_REMOVE);
            REMOVE = typeDto2;
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: TabbarItemSuggestDto.kt */
    public static final class a implements Parcelable.Creator<TabbarItemSuggestDto> {
        @Override // android.os.Parcelable.Creator
        public final TabbarItemSuggestDto createFromParcel(Parcel parcel) {
            return new TabbarItemSuggestDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : TabbarItemDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TabbarItemSuggestDto[] newArray(int i) {
            return new TabbarItemSuggestDto[i];
        }
    }

    public TabbarItemSuggestDto(TypeDto typeDto, String str, TabbarItemDto tabbarItemDto) {
        this.type = typeDto;
        this.subtitle = str;
        this.replacement = tabbarItemDto;
    }

    public final TabbarItemDto d() {
        return this.replacement;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabbarItemSuggestDto)) {
            return false;
        }
        TabbarItemSuggestDto tabbarItemSuggestDto = (TabbarItemSuggestDto) obj;
        return this.type == tabbarItemSuggestDto.type && epx.f(this.subtitle, tabbarItemSuggestDto.subtitle) && epx.f(this.replacement, tabbarItemSuggestDto.replacement);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.type.hashCode() * 31, 31, this.subtitle);
        TabbarItemDto tabbarItemDto = this.replacement;
        return a2 + (tabbarItemDto == null ? 0 : tabbarItemDto.hashCode());
    }

    public final String toString() {
        return "TabbarItemSuggestDto(type=" + this.type + ", subtitle=" + this.subtitle + ", replacement=" + this.replacement + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.subtitle);
        TabbarItemDto tabbarItemDto = this.replacement;
        if (tabbarItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tabbarItemDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ TabbarItemSuggestDto(TypeDto typeDto, String str, TabbarItemDto tabbarItemDto, int i, zcl zclVar) {
        this(typeDto, str, (i & 4) != 0 ? null : tabbarItemDto);
    }
}
