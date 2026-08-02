package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ShortVideoShortVideoRestrictionDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoRestrictionDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoRestrictionDto> CREATOR = new a();

    @pmi0("blur")
    private final Boolean blur;

    @pmi0("button")
    private final ShortVideoShortVideoRestrictionButtonDto button;

    @pmi0("can_play")
    private final Boolean canPlay;

    @pmi0("card_icon")
    private final List<BaseImageDto> cardIcon;

    @pmi0("disclaimer_type")
    private final Integer disclaimerType;

    @pmi0("icon_name")
    private final String iconName;

    @pmi0("list_icon")
    private final List<BaseImageDto> listIcon;

    @pmi0("mute_info_link")
    private final String muteInfoLink;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: ShortVideoShortVideoRestrictionDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoRestrictionDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoRestrictionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList2 = null;
            ShortVideoShortVideoRestrictionButtonDto createFromParcel = parcel.readInt() == 0 ? null : ShortVideoShortVideoRestrictionButtonDto.CREATOR.createFromParcel(parcel);
            int i = 0;
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
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(ShortVideoShortVideoRestrictionDto.class, parcel, arrayList, i2, 1);
                }
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(ShortVideoShortVideoRestrictionDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new ShortVideoShortVideoRestrictionDto(readString, readString2, createFromParcel, valueOf, valueOf2, arrayList, valueOf3, arrayList2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoRestrictionDto[] newArray(int i) {
            return new ShortVideoShortVideoRestrictionDto[i];
        }
    }

    public ShortVideoShortVideoRestrictionDto(String str, String str2, ShortVideoShortVideoRestrictionButtonDto shortVideoShortVideoRestrictionButtonDto, Boolean bool, Boolean bool2, List<BaseImageDto> list, Integer num, List<BaseImageDto> list2, String str3, String str4) {
        this.title = str;
        this.text = str2;
        this.button = shortVideoShortVideoRestrictionButtonDto;
        this.blur = bool;
        this.canPlay = bool2;
        this.cardIcon = list;
        this.disclaimerType = num;
        this.listIcon = list2;
        this.iconName = str3;
        this.muteInfoLink = str4;
    }

    public final Boolean d() {
        return this.blur;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ShortVideoShortVideoRestrictionButtonDto e() {
        return this.button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoRestrictionDto)) {
            return false;
        }
        ShortVideoShortVideoRestrictionDto shortVideoShortVideoRestrictionDto = (ShortVideoShortVideoRestrictionDto) obj;
        return epx.f(this.title, shortVideoShortVideoRestrictionDto.title) && epx.f(this.text, shortVideoShortVideoRestrictionDto.text) && epx.f(this.button, shortVideoShortVideoRestrictionDto.button) && epx.f(this.blur, shortVideoShortVideoRestrictionDto.blur) && epx.f(this.canPlay, shortVideoShortVideoRestrictionDto.canPlay) && epx.f(this.cardIcon, shortVideoShortVideoRestrictionDto.cardIcon) && epx.f(this.disclaimerType, shortVideoShortVideoRestrictionDto.disclaimerType) && epx.f(this.listIcon, shortVideoShortVideoRestrictionDto.listIcon) && epx.f(this.iconName, shortVideoShortVideoRestrictionDto.iconName) && epx.f(this.muteInfoLink, shortVideoShortVideoRestrictionDto.muteInfoLink);
    }

    public final Boolean f() {
        return this.canPlay;
    }

    public final List<BaseImageDto> g() {
        return this.cardIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ShortVideoShortVideoRestrictionButtonDto shortVideoShortVideoRestrictionButtonDto = this.button;
        int hashCode3 = (hashCode2 + (shortVideoShortVideoRestrictionButtonDto == null ? 0 : shortVideoShortVideoRestrictionButtonDto.hashCode())) * 31;
        Boolean bool = this.blur;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canPlay;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<BaseImageDto> list = this.cardIcon;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.disclaimerType;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list2 = this.listIcon;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.iconName;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.muteInfoLink;
        return hashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Integer i() {
        return this.disclaimerType;
    }

    public final List<BaseImageDto> j() {
        return this.listIcon;
    }

    public final String k() {
        return this.muteInfoLink;
    }

    public final String l() {
        return this.text;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoRestrictionDto(title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", blur=");
        sb.append(this.blur);
        sb.append(", canPlay=");
        sb.append(this.canPlay);
        sb.append(", cardIcon=");
        sb.append(this.cardIcon);
        sb.append(", disclaimerType=");
        sb.append(this.disclaimerType);
        sb.append(", listIcon=");
        sb.append(this.listIcon);
        sb.append(", iconName=");
        sb.append(this.iconName);
        sb.append(", muteInfoLink=");
        return ho8.a(sb, this.muteInfoLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        ShortVideoShortVideoRestrictionButtonDto shortVideoShortVideoRestrictionButtonDto = this.button;
        if (shortVideoShortVideoRestrictionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoRestrictionButtonDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.blur;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canPlay;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<BaseImageDto> list = this.cardIcon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.disclaimerType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseImageDto> list2 = this.listIcon;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.iconName);
        parcel.writeString(this.muteInfoLink);
    }

    public /* synthetic */ ShortVideoShortVideoRestrictionDto(String str, String str2, ShortVideoShortVideoRestrictionButtonDto shortVideoShortVideoRestrictionButtonDto, Boolean bool, Boolean bool2, List list, Integer num, List list2, String str3, String str4, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : shortVideoShortVideoRestrictionButtonDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4);
    }
}
