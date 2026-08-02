package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BadgesGetCatalogSectionResponseDto.kt */
/* loaded from: classes14.dex */
public final class BadgesGetCatalogSectionResponseDto implements Parcelable {
    public static final Parcelable.Creator<BadgesGetCatalogSectionResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("section")
    private final BadgesCatalogSectionDto section;

    /* compiled from: BadgesGetCatalogSectionResponseDto.kt */
    public static final class a implements Parcelable.Creator<BadgesGetCatalogSectionResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesGetCatalogSectionResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            BadgesCatalogSectionDto createFromParcel = parcel.readInt() == 0 ? null : BadgesCatalogSectionDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new BadgesGetCatalogSectionResponseDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesGetCatalogSectionResponseDto[] newArray(int i) {
            return new BadgesGetCatalogSectionResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BadgesGetCatalogSectionResponseDto() {
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
        if (!(obj instanceof BadgesGetCatalogSectionResponseDto)) {
            return false;
        }
        BadgesGetCatalogSectionResponseDto badgesGetCatalogSectionResponseDto = (BadgesGetCatalogSectionResponseDto) obj;
        return epx.f(this.section, badgesGetCatalogSectionResponseDto.section) && epx.f(this.badges, badgesGetCatalogSectionResponseDto.badges);
    }

    public final int hashCode() {
        BadgesCatalogSectionDto badgesCatalogSectionDto = this.section;
        int hashCode = (badgesCatalogSectionDto == null ? 0 : badgesCatalogSectionDto.hashCode()) * 31;
        List<BadgesBadgeDto> list = this.badges;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesGetCatalogSectionResponseDto(section=");
        sb.append(this.section);
        sb.append(", badges=");
        return ms9.a(')', sb, this.badges);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BadgesCatalogSectionDto badgesCatalogSectionDto = this.section;
        if (badgesCatalogSectionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesCatalogSectionDto.writeToParcel(parcel, i);
        }
        List<BadgesBadgeDto> list = this.badges;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((BadgesBadgeDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public BadgesGetCatalogSectionResponseDto(BadgesCatalogSectionDto badgesCatalogSectionDto, List<BadgesBadgeDto> list) {
        this.section = badgesCatalogSectionDto;
        this.badges = list;
    }

    public /* synthetic */ BadgesGetCatalogSectionResponseDto(BadgesCatalogSectionDto badgesCatalogSectionDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : badgesCatalogSectionDto, (i & 2) != 0 ? null : list);
    }
}
