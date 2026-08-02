package com.vk.api.generated.media.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.video.dto.VideoRestrictionButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MediaRestrictionDto.kt */
/* loaded from: classes15.dex */
public final class MediaRestrictionDto implements Parcelable {
    public static final Parcelable.Creator<MediaRestrictionDto> CREATOR = new a();

    @pmi0("always_shown")
    private final BaseBoolIntDto alwaysShown;

    @pmi0("blur")
    private final BaseBoolIntDto blur;

    @pmi0("button")
    private final VideoRestrictionButtonDto button;

    @pmi0("can_play")
    private final BaseBoolIntDto canPlay;

    @pmi0("can_preview")
    private final BaseBoolIntDto canPreview;

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

    @pmi0("offer_vkvideo")
    private final BaseBoolIntDto offerVkvideo;

    @pmi0("report_placeholder_src")
    private final String reportPlaceholderSrc;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: MediaRestrictionDto.kt */
    public static final class a implements Parcelable.Creator<MediaRestrictionDto> {
        @Override // android.os.Parcelable.Creator
        public final MediaRestrictionDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            VideoRestrictionButtonDto createFromParcel = parcel.readInt() == 0 ? null : VideoRestrictionButtonDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel2 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel3 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel4 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(BaseImageDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new MediaRestrictionDto(readString, readString2, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, arrayList, valueOf, arrayList2, parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BaseBoolIntDto.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaRestrictionDto[] newArray(int i) {
            return new MediaRestrictionDto[i];
        }
    }

    public MediaRestrictionDto(String str, String str2, VideoRestrictionButtonDto videoRestrictionButtonDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, List<BaseImageDto> list, Integer num, List<BaseImageDto> list2, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, String str3, String str4, String str5) {
        this.title = str;
        this.text = str2;
        this.button = videoRestrictionButtonDto;
        this.blur = baseBoolIntDto;
        this.canPlay = baseBoolIntDto2;
        this.canPreview = baseBoolIntDto3;
        this.cardIcon = list;
        this.disclaimerType = num;
        this.listIcon = list2;
        this.alwaysShown = baseBoolIntDto4;
        this.offerVkvideo = baseBoolIntDto5;
        this.muteInfoLink = str3;
        this.iconName = str4;
        this.reportPlaceholderSrc = str5;
    }

    public final BaseBoolIntDto d() {
        return this.blur;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VideoRestrictionButtonDto e() {
        return this.button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaRestrictionDto)) {
            return false;
        }
        MediaRestrictionDto mediaRestrictionDto = (MediaRestrictionDto) obj;
        return epx.f(this.title, mediaRestrictionDto.title) && epx.f(this.text, mediaRestrictionDto.text) && epx.f(this.button, mediaRestrictionDto.button) && this.blur == mediaRestrictionDto.blur && this.canPlay == mediaRestrictionDto.canPlay && this.canPreview == mediaRestrictionDto.canPreview && epx.f(this.cardIcon, mediaRestrictionDto.cardIcon) && epx.f(this.disclaimerType, mediaRestrictionDto.disclaimerType) && epx.f(this.listIcon, mediaRestrictionDto.listIcon) && this.alwaysShown == mediaRestrictionDto.alwaysShown && this.offerVkvideo == mediaRestrictionDto.offerVkvideo && epx.f(this.muteInfoLink, mediaRestrictionDto.muteInfoLink) && epx.f(this.iconName, mediaRestrictionDto.iconName) && epx.f(this.reportPlaceholderSrc, mediaRestrictionDto.reportPlaceholderSrc);
    }

    public final BaseBoolIntDto f() {
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
        VideoRestrictionButtonDto videoRestrictionButtonDto = this.button;
        int hashCode3 = (hashCode2 + (videoRestrictionButtonDto == null ? 0 : videoRestrictionButtonDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.blur;
        int hashCode4 = (hashCode3 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canPlay;
        int hashCode5 = (hashCode4 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canPreview;
        int hashCode6 = (hashCode5 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        List<BaseImageDto> list = this.cardIcon;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.disclaimerType;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list2 = this.listIcon;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.alwaysShown;
        int hashCode10 = (hashCode9 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.offerVkvideo;
        int hashCode11 = (hashCode10 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        String str2 = this.muteInfoLink;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconName;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reportPlaceholderSrc;
        return hashCode13 + (str4 != null ? str4.hashCode() : 0);
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

    public final BaseBoolIntDto l() {
        return this.offerVkvideo;
    }

    public final String n() {
        return this.text;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRestrictionDto(title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", blur=");
        sb.append(this.blur);
        sb.append(", canPlay=");
        sb.append(this.canPlay);
        sb.append(", canPreview=");
        sb.append(this.canPreview);
        sb.append(", cardIcon=");
        sb.append(this.cardIcon);
        sb.append(", disclaimerType=");
        sb.append(this.disclaimerType);
        sb.append(", listIcon=");
        sb.append(this.listIcon);
        sb.append(", alwaysShown=");
        sb.append(this.alwaysShown);
        sb.append(", offerVkvideo=");
        sb.append(this.offerVkvideo);
        sb.append(", muteInfoLink=");
        sb.append(this.muteInfoLink);
        sb.append(", iconName=");
        sb.append(this.iconName);
        sb.append(", reportPlaceholderSrc=");
        return ho8.a(sb, this.reportPlaceholderSrc, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        VideoRestrictionButtonDto videoRestrictionButtonDto = this.button;
        if (videoRestrictionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoRestrictionButtonDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto = this.blur;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto2 = this.canPlay;
        if (baseBoolIntDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto2.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto3 = this.canPreview;
        if (baseBoolIntDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto3.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list = this.cardIcon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
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
                ((BaseImageDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        BaseBoolIntDto baseBoolIntDto4 = this.alwaysShown;
        if (baseBoolIntDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto4.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto5 = this.offerVkvideo;
        if (baseBoolIntDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto5.writeToParcel(parcel, i);
        }
        parcel.writeString(this.muteInfoLink);
        parcel.writeString(this.iconName);
        parcel.writeString(this.reportPlaceholderSrc);
    }

    public /* synthetic */ MediaRestrictionDto(String str, String str2, VideoRestrictionButtonDto videoRestrictionButtonDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, List list, Integer num, List list2, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, String str3, String str4, String str5, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : videoRestrictionButtonDto, (i & 8) != 0 ? null : baseBoolIntDto, (i & 16) != 0 ? null : baseBoolIntDto2, (i & 32) != 0 ? null : baseBoolIntDto3, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : baseBoolIntDto4, (i & 1024) != 0 ? null : baseBoolIntDto5, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5);
    }
}
