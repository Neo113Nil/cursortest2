package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsOpenStatusDto.kt */
/* loaded from: classes14.dex */
public final class GroupsOpenStatusDto implements Parcelable {
    public static final Parcelable.Creator<GroupsOpenStatusDto> CREATOR = new a();

    @pmi0("primary_text")
    private final String primaryText;

    @pmi0("secondary_text")
    private final String secondaryText;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsOpenStatusDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("break")
        public static final StyleDto BREAK;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final StyleDto CLOSE;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("open")
        public static final StyleDto OPEN;

        @pmi0("unknown")
        public static final StyleDto UNKNOWN;
        private final String value;

        /* compiled from: GroupsOpenStatusDto.kt */
        public static final class a implements Parcelable.Creator<StyleDto> {
            @Override // android.os.Parcelable.Creator
            public final StyleDto createFromParcel(Parcel parcel) {
                return StyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StyleDto[] newArray(int i) {
                return new StyleDto[i];
            }
        }

        static {
            StyleDto styleDto = new StyleDto("OPEN", 0, "open");
            OPEN = styleDto;
            StyleDto styleDto2 = new StyleDto("CLOSE", 1, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            CLOSE = styleDto2;
            StyleDto styleDto3 = new StyleDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown");
            UNKNOWN = styleDto3;
            StyleDto styleDto4 = new StyleDto("BREAK", 3, "break");
            BREAK = styleDto4;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3, styleDto4};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
            CREATOR = new a();
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
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

    /* compiled from: GroupsOpenStatusDto.kt */
    public static final class a implements Parcelable.Creator<GroupsOpenStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsOpenStatusDto createFromParcel(Parcel parcel) {
            return new GroupsOpenStatusDto(parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsOpenStatusDto[] newArray(int i) {
            return new GroupsOpenStatusDto[i];
        }
    }

    public GroupsOpenStatusDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.primaryText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.secondaryText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsOpenStatusDto)) {
            return false;
        }
        GroupsOpenStatusDto groupsOpenStatusDto = (GroupsOpenStatusDto) obj;
        return this.style == groupsOpenStatusDto.style && epx.f(this.primaryText, groupsOpenStatusDto.primaryText) && epx.f(this.secondaryText, groupsOpenStatusDto.secondaryText);
    }

    public final StyleDto f() {
        return this.style;
    }

    public final int hashCode() {
        StyleDto styleDto = this.style;
        int hashCode = (styleDto == null ? 0 : styleDto.hashCode()) * 31;
        String str = this.primaryText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsOpenStatusDto(style=");
        sb.append(this.style);
        sb.append(", primaryText=");
        sb.append(this.primaryText);
        sb.append(", secondaryText=");
        return ho8.a(sb, this.secondaryText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.primaryText);
        parcel.writeString(this.secondaryText);
    }

    public GroupsOpenStatusDto(StyleDto styleDto, String str, String str2) {
        this.style = styleDto;
        this.primaryText = str;
        this.secondaryText = str2;
    }

    public /* synthetic */ GroupsOpenStatusDto(StyleDto styleDto, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : styleDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
