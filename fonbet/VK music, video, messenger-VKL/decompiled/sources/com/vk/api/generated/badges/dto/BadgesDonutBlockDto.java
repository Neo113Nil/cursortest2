package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: BadgesDonutBlockDto.kt */
/* loaded from: classes14.dex */
public final class BadgesDonutBlockDto implements Parcelable {
    public static final Parcelable.Creator<BadgesDonutBlockDto> CREATOR = new a();

    @pmi0("amounts")
    private final List<BadgesDonutAmountDto> amounts;

    @pmi0("badge_image")
    private final BadgesBadgeImageDto badgeImage;

    @pmi0("block_image")
    private final BaseImageDto blockImage;

    @pmi0("can_post_comment")
    private final boolean canPostComment;

    @pmi0("max_price")
    private final int maxPrice;

    @pmi0("min_price")
    private final int minPrice;

    @pmi0("stars_image")
    private final BaseImageDto starsImage;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: BadgesDonutBlockDto.kt */
    public static final class a implements Parcelable.Creator<BadgesDonutBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesDonutBlockDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(BadgesDonutAmountDto.CREATOR, parcel, arrayList, i, 1);
            }
            BadgesBadgeImageDto createFromParcel = BadgesBadgeImageDto.CREATOR.createFromParcel(parcel);
            BaseImageDto baseImageDto = (BaseImageDto) parcel.readParcelable(BadgesDonutBlockDto.class.getClassLoader());
            BaseImageDto baseImageDto2 = (BaseImageDto) parcel.readParcelable(BadgesDonutBlockDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            boolean z = true;
            int readInt3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new BadgesDonutBlockDto(readString, readString2, arrayList, createFromParcel, baseImageDto, baseImageDto2, readInt2, readInt3, z);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesDonutBlockDto[] newArray(int i) {
            return new BadgesDonutBlockDto[i];
        }
    }

    public BadgesDonutBlockDto(String str, String str2, List<BadgesDonutAmountDto> list, BadgesBadgeImageDto badgesBadgeImageDto, BaseImageDto baseImageDto, BaseImageDto baseImageDto2, int i, int i2, boolean z) {
        this.title = str;
        this.subtitle = str2;
        this.amounts = list;
        this.badgeImage = badgesBadgeImageDto;
        this.blockImage = baseImageDto;
        this.starsImage = baseImageDto2;
        this.minPrice = i;
        this.maxPrice = i2;
        this.canPostComment = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesDonutBlockDto)) {
            return false;
        }
        BadgesDonutBlockDto badgesDonutBlockDto = (BadgesDonutBlockDto) obj;
        return epx.f(this.title, badgesDonutBlockDto.title) && epx.f(this.subtitle, badgesDonutBlockDto.subtitle) && epx.f(this.amounts, badgesDonutBlockDto.amounts) && epx.f(this.badgeImage, badgesDonutBlockDto.badgeImage) && epx.f(this.blockImage, badgesDonutBlockDto.blockImage) && epx.f(this.starsImage, badgesDonutBlockDto.starsImage) && this.minPrice == badgesDonutBlockDto.minPrice && this.maxPrice == badgesDonutBlockDto.maxPrice && this.canPostComment == badgesDonutBlockDto.canPostComment;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canPostComment) + shy.a(this.maxPrice, shy.a(this.minPrice, (this.starsImage.hashCode() + ((this.blockImage.hashCode() + ((this.badgeImage.hashCode() + fw3.a(urd0.a(this.title.hashCode() * 31, 31, this.subtitle), 31, this.amounts)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesDonutBlockDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", amounts=");
        sb.append(this.amounts);
        sb.append(", badgeImage=");
        sb.append(this.badgeImage);
        sb.append(", blockImage=");
        sb.append(this.blockImage);
        sb.append(", starsImage=");
        sb.append(this.starsImage);
        sb.append(", minPrice=");
        sb.append(this.minPrice);
        sb.append(", maxPrice=");
        sb.append(this.maxPrice);
        sb.append(", canPostComment=");
        return q0.a(sb, this.canPostComment, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Iterator a2 = ao.a(parcel, this.amounts);
        while (a2.hasNext()) {
            ((BadgesDonutAmountDto) a2.next()).writeToParcel(parcel, i);
        }
        this.badgeImage.writeToParcel(parcel, i);
        parcel.writeParcelable(this.blockImage, i);
        parcel.writeParcelable(this.starsImage, i);
        parcel.writeInt(this.minPrice);
        parcel.writeInt(this.maxPrice);
        parcel.writeInt(this.canPostComment ? 1 : 0);
    }
}
