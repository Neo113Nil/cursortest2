package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketItemRejectInfoDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemRejectInfoDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemRejectInfoDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<BaseLinkButtonActionDto> buttons;

    @pmi0("description")
    private final String description;

    @pmi0("in_progress")
    private final boolean inProgress;

    @pmi0("info_link")
    private final String infoLink;

    @pmi0("moderation_status")
    private final int moderationStatus;

    @pmi0("title")
    private final String title;

    @pmi0("write_to_support_link")
    private final String writeToSupportLink;

    /* compiled from: MarketItemRejectInfoDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemRejectInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemRejectInfoDto createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(BaseLinkButtonActionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketItemRejectInfoDto(readString, readString2, readInt, readString3, readString4, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemRejectInfoDto[] newArray(int i) {
            return new MarketItemRejectInfoDto[i];
        }
    }

    public MarketItemRejectInfoDto(String str, String str2, int i, String str3, String str4, boolean z, List<BaseLinkButtonActionDto> list) {
        this.title = str;
        this.description = str2;
        this.moderationStatus = i;
        this.infoLink = str3;
        this.writeToSupportLink = str4;
        this.inProgress = z;
        this.buttons = list;
    }

    public final List<BaseLinkButtonActionDto> d() {
        return this.buttons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.inProgress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemRejectInfoDto)) {
            return false;
        }
        MarketItemRejectInfoDto marketItemRejectInfoDto = (MarketItemRejectInfoDto) obj;
        return epx.f(this.title, marketItemRejectInfoDto.title) && epx.f(this.description, marketItemRejectInfoDto.description) && this.moderationStatus == marketItemRejectInfoDto.moderationStatus && epx.f(this.infoLink, marketItemRejectInfoDto.infoLink) && epx.f(this.writeToSupportLink, marketItemRejectInfoDto.writeToSupportLink) && this.inProgress == marketItemRejectInfoDto.inProgress && epx.f(this.buttons, marketItemRejectInfoDto.buttons);
    }

    public final String f() {
        return this.infoLink;
    }

    public final int g() {
        return this.moderationStatus;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(shy.a(this.moderationStatus, urd0.a(this.title.hashCode() * 31, 31, this.description), 31), 31, this.infoLink), 31, this.writeToSupportLink), 31, this.inProgress);
        List<BaseLinkButtonActionDto> list = this.buttons;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String i() {
        return this.writeToSupportLink;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemRejectInfoDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", moderationStatus=");
        sb.append(this.moderationStatus);
        sb.append(", infoLink=");
        sb.append(this.infoLink);
        sb.append(", writeToSupportLink=");
        sb.append(this.writeToSupportLink);
        sb.append(", inProgress=");
        sb.append(this.inProgress);
        sb.append(", buttons=");
        return ms9.a(')', sb, this.buttons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.moderationStatus);
        parcel.writeString(this.infoLink);
        parcel.writeString(this.writeToSupportLink);
        parcel.writeInt(this.inProgress ? 1 : 0);
        List<BaseLinkButtonActionDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((BaseLinkButtonActionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketItemRejectInfoDto(String str, String str2, int i, String str3, String str4, boolean z, List list, int i2, zcl zclVar) {
        this(str, str2, i, str3, str4, z, (i2 & 64) != 0 ? null : list);
    }
}
