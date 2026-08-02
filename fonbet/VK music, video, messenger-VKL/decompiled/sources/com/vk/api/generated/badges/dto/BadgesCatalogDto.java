package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: BadgesCatalogDto.kt */
/* loaded from: classes14.dex */
public final class BadgesCatalogDto implements Parcelable {
    public static final Parcelable.Creator<BadgesCatalogDto> CREATOR = new a();

    @pmi0("balance")
    private final int balance;

    @pmi0("donut_block")
    private final BadgesDonutBlockDto donutBlock;

    @pmi0("sections")
    private final List<BadgesCatalogSectionDto> sections;

    /* compiled from: BadgesCatalogDto.kt */
    public static final class a implements Parcelable.Creator<BadgesCatalogDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesCatalogDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(BadgesCatalogSectionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new BadgesCatalogDto(arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : BadgesDonutBlockDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesCatalogDto[] newArray(int i) {
            return new BadgesCatalogDto[i];
        }
    }

    public BadgesCatalogDto(List<BadgesCatalogSectionDto> list, int i, BadgesDonutBlockDto badgesDonutBlockDto) {
        this.sections = list;
        this.balance = i;
        this.donutBlock = badgesDonutBlockDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesCatalogDto)) {
            return false;
        }
        BadgesCatalogDto badgesCatalogDto = (BadgesCatalogDto) obj;
        return epx.f(this.sections, badgesCatalogDto.sections) && this.balance == badgesCatalogDto.balance && epx.f(this.donutBlock, badgesCatalogDto.donutBlock);
    }

    public final int hashCode() {
        int a2 = shy.a(this.balance, this.sections.hashCode() * 31, 31);
        BadgesDonutBlockDto badgesDonutBlockDto = this.donutBlock;
        return a2 + (badgesDonutBlockDto == null ? 0 : badgesDonutBlockDto.hashCode());
    }

    public final String toString() {
        return "BadgesCatalogDto(sections=" + this.sections + ", balance=" + this.balance + ", donutBlock=" + this.donutBlock + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.sections);
        while (a2.hasNext()) {
            ((BadgesCatalogSectionDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.balance);
        BadgesDonutBlockDto badgesDonutBlockDto = this.donutBlock;
        if (badgesDonutBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesDonutBlockDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BadgesCatalogDto(List list, int i, BadgesDonutBlockDto badgesDonutBlockDto, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : badgesDonutBlockDto);
    }
}
