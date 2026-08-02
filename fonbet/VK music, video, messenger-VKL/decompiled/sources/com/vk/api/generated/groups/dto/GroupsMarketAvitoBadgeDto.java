package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: GroupsMarketAvitoBadgeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsMarketAvitoBadgeDto implements Parcelable {
    public static final Parcelable.Creator<GroupsMarketAvitoBadgeDto> CREATOR = new a();

    @pmi0("icon")
    private final BaseImageDto icon;

    @pmi0("link_status")
    private final LinkStatusDto linkStatus;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsMarketAvitoBadgeDto.kt */
    public static final class LinkStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkStatusDto[] $VALUES;

        @pmi0("0")
        public static final LinkStatusDto ACTIVE;
        public static final Parcelable.Creator<LinkStatusDto> CREATOR;

        @pmi0("1")
        public static final LinkStatusDto INACTIVE;

        @pmi0("2")
        public static final LinkStatusDto PENDING;
        private final int value;

        /* compiled from: GroupsMarketAvitoBadgeDto.kt */
        public static final class a implements Parcelable.Creator<LinkStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final LinkStatusDto createFromParcel(Parcel parcel) {
                return LinkStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LinkStatusDto[] newArray(int i) {
                return new LinkStatusDto[i];
            }
        }

        static {
            LinkStatusDto linkStatusDto = new LinkStatusDto(SignalingProtocol.STATE_ACTIVE, 0, 0);
            ACTIVE = linkStatusDto;
            LinkStatusDto linkStatusDto2 = new LinkStatusDto("INACTIVE", 1, 1);
            INACTIVE = linkStatusDto2;
            LinkStatusDto linkStatusDto3 = new LinkStatusDto("PENDING", 2, 2);
            PENDING = linkStatusDto3;
            LinkStatusDto[] linkStatusDtoArr = {linkStatusDto, linkStatusDto2, linkStatusDto3};
            $VALUES = linkStatusDtoArr;
            $ENTRIES = new asp(linkStatusDtoArr);
            CREATOR = new a();
        }

        private LinkStatusDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static LinkStatusDto valueOf(String str) {
            return (LinkStatusDto) Enum.valueOf(LinkStatusDto.class, str);
        }

        public static LinkStatusDto[] values() {
            return (LinkStatusDto[]) $VALUES.clone();
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

    /* compiled from: GroupsMarketAvitoBadgeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsMarketAvitoBadgeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsMarketAvitoBadgeDto createFromParcel(Parcel parcel) {
            return new GroupsMarketAvitoBadgeDto(BaseImageDto.CREATOR.createFromParcel(parcel), parcel.readString(), LinkStatusDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsMarketAvitoBadgeDto[] newArray(int i) {
            return new GroupsMarketAvitoBadgeDto[i];
        }
    }

    public GroupsMarketAvitoBadgeDto(BaseImageDto baseImageDto, String str, LinkStatusDto linkStatusDto) {
        this.icon = baseImageDto;
        this.title = str;
        this.linkStatus = linkStatusDto;
    }

    public final BaseImageDto d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final LinkStatusDto e() {
        return this.linkStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsMarketAvitoBadgeDto)) {
            return false;
        }
        GroupsMarketAvitoBadgeDto groupsMarketAvitoBadgeDto = (GroupsMarketAvitoBadgeDto) obj;
        return epx.f(this.icon, groupsMarketAvitoBadgeDto.icon) && epx.f(this.title, groupsMarketAvitoBadgeDto.title) && this.linkStatus == groupsMarketAvitoBadgeDto.linkStatus;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.linkStatus.hashCode() + urd0.a(this.icon.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        return "GroupsMarketAvitoBadgeDto(icon=" + this.icon + ", title=" + this.title + ", linkStatus=" + this.linkStatus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.icon.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        this.linkStatus.writeToParcel(parcel, i);
    }
}
