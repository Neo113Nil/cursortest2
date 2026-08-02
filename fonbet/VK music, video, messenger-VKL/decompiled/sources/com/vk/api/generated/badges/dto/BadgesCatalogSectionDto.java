package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BadgesCatalogSectionDto.kt */
/* loaded from: classes14.dex */
public final class BadgesCatalogSectionDto implements Parcelable {
    public static final Parcelable.Creator<BadgesCatalogSectionDto> CREATOR = new a();

    @pmi0("badge_ids")
    private final List<Integer> badgeIds;

    @pmi0("next_section_id")
    private final String nextSectionId;

    @pmi0("stat_id")
    private final String statId;

    @pmi0("title")
    private final String title;

    /* compiled from: BadgesCatalogSectionDto.kt */
    public static final class a implements Parcelable.Creator<BadgesCatalogSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesCatalogSectionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new BadgesCatalogSectionDto(readString, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesCatalogSectionDto[] newArray(int i) {
            return new BadgesCatalogSectionDto[i];
        }
    }

    public BadgesCatalogSectionDto(String str, List<Integer> list, String str2, String str3) {
        this.title = str;
        this.badgeIds = list;
        this.statId = str2;
        this.nextSectionId = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesCatalogSectionDto)) {
            return false;
        }
        BadgesCatalogSectionDto badgesCatalogSectionDto = (BadgesCatalogSectionDto) obj;
        return epx.f(this.title, badgesCatalogSectionDto.title) && epx.f(this.badgeIds, badgesCatalogSectionDto.badgeIds) && epx.f(this.statId, badgesCatalogSectionDto.statId) && epx.f(this.nextSectionId, badgesCatalogSectionDto.nextSectionId);
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(this.title.hashCode() * 31, 31, this.badgeIds), 31, this.statId);
        String str = this.nextSectionId;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesCatalogSectionDto(title=");
        sb.append(this.title);
        sb.append(", badgeIds=");
        sb.append(this.badgeIds);
        sb.append(", statId=");
        sb.append(this.statId);
        sb.append(", nextSectionId=");
        return ho8.a(sb, this.nextSectionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.badgeIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeString(this.statId);
        parcel.writeString(this.nextSectionId);
    }

    public /* synthetic */ BadgesCatalogSectionDto(String str, List list, String str2, String str3, int i, zcl zclVar) {
        this(str, list, str2, (i & 8) != 0 ? null : str3);
    }
}
