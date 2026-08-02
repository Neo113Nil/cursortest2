package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogSectionStyleDto.kt */
/* loaded from: classes14.dex */
public final class CatalogSectionStyleDto implements Parcelable {
    public static final Parcelable.Creator<CatalogSectionStyleDto> CREATOR = new a();

    @pmi0("navbar_overlap")
    private final Boolean navbarOverlap;

    @pmi0("no_top_separator")
    private final Boolean noTopSeparator;

    @pmi0("subsection_menu")
    private final SubsectionMenuDto subsectionMenu;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogSectionStyleDto.kt */
    public static final class SubsectionMenuDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubsectionMenuDto[] $VALUES;
        public static final Parcelable.Creator<SubsectionMenuDto> CREATOR;

        @pmi0("drawer")
        public static final SubsectionMenuDto DRAWER;

        @pmi0("library_hide")
        public static final SubsectionMenuDto LIBRARY_HIDE;

        @pmi0("tabs")
        public static final SubsectionMenuDto TABS;

        @pmi0("toggle_safe_child_mode")
        public static final SubsectionMenuDto TOGGLE_SAFE_CHILD_MODE;
        private final String value;

        /* compiled from: CatalogSectionStyleDto.kt */
        public static final class a implements Parcelable.Creator<SubsectionMenuDto> {
            @Override // android.os.Parcelable.Creator
            public final SubsectionMenuDto createFromParcel(Parcel parcel) {
                return SubsectionMenuDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SubsectionMenuDto[] newArray(int i) {
                return new SubsectionMenuDto[i];
            }
        }

        static {
            SubsectionMenuDto subsectionMenuDto = new SubsectionMenuDto("TABS", 0, "tabs");
            TABS = subsectionMenuDto;
            SubsectionMenuDto subsectionMenuDto2 = new SubsectionMenuDto("DRAWER", 1, "drawer");
            DRAWER = subsectionMenuDto2;
            SubsectionMenuDto subsectionMenuDto3 = new SubsectionMenuDto("LIBRARY_HIDE", 2, "library_hide");
            LIBRARY_HIDE = subsectionMenuDto3;
            SubsectionMenuDto subsectionMenuDto4 = new SubsectionMenuDto("TOGGLE_SAFE_CHILD_MODE", 3, "toggle_safe_child_mode");
            TOGGLE_SAFE_CHILD_MODE = subsectionMenuDto4;
            SubsectionMenuDto[] subsectionMenuDtoArr = {subsectionMenuDto, subsectionMenuDto2, subsectionMenuDto3, subsectionMenuDto4};
            $VALUES = subsectionMenuDtoArr;
            $ENTRIES = new asp(subsectionMenuDtoArr);
            CREATOR = new a();
        }

        private SubsectionMenuDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SubsectionMenuDto valueOf(String str) {
            return (SubsectionMenuDto) Enum.valueOf(SubsectionMenuDto.class, str);
        }

        public static SubsectionMenuDto[] values() {
            return (SubsectionMenuDto[]) $VALUES.clone();
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

    /* compiled from: CatalogSectionStyleDto.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionStyleDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
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
            return new CatalogSectionStyleDto(valueOf, valueOf2, parcel.readInt() != 0 ? SubsectionMenuDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionStyleDto[] newArray(int i) {
            return new CatalogSectionStyleDto[i];
        }
    }

    public CatalogSectionStyleDto() {
        this(null, null, null, 7, null);
    }

    public final Boolean d() {
        return this.navbarOverlap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.noTopSeparator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSectionStyleDto)) {
            return false;
        }
        CatalogSectionStyleDto catalogSectionStyleDto = (CatalogSectionStyleDto) obj;
        return epx.f(this.noTopSeparator, catalogSectionStyleDto.noTopSeparator) && epx.f(this.navbarOverlap, catalogSectionStyleDto.navbarOverlap) && this.subsectionMenu == catalogSectionStyleDto.subsectionMenu;
    }

    public final int hashCode() {
        Boolean bool = this.noTopSeparator;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.navbarOverlap;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        SubsectionMenuDto subsectionMenuDto = this.subsectionMenu;
        return hashCode2 + (subsectionMenuDto != null ? subsectionMenuDto.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogSectionStyleDto(noTopSeparator=" + this.noTopSeparator + ", navbarOverlap=" + this.navbarOverlap + ", subsectionMenu=" + this.subsectionMenu + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.noTopSeparator;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.navbarOverlap;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        SubsectionMenuDto subsectionMenuDto = this.subsectionMenu;
        if (subsectionMenuDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subsectionMenuDto.writeToParcel(parcel, i);
        }
    }

    public CatalogSectionStyleDto(Boolean bool, Boolean bool2, SubsectionMenuDto subsectionMenuDto) {
        this.noTopSeparator = bool;
        this.navbarOverlap = bool2;
        this.subsectionMenu = subsectionMenuDto;
    }

    public /* synthetic */ CatalogSectionStyleDto(Boolean bool, Boolean bool2, SubsectionMenuDto subsectionMenuDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : subsectionMenuDto);
    }
}
