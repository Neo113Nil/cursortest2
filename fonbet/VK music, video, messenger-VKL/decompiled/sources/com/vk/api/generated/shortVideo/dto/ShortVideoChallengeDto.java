package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoChallengeDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoChallengeDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoChallengeDto> CREATOR = new a();

    @pmi0("action_button")
    private final ActionLinksActionDto actionButton;

    @pmi0("author_id")
    private final UserId authorId;

    @pmi0("banner")
    private final ShortVideoChallengeBannerDto banner;

    @pmi0("camera_params")
    private final ShortVideoChallengeCameraParamsDto cameraParams;

    @pmi0("description")
    private final String description;

    @pmi0("disclaimer")
    private final String disclaimer;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("is_active")
    private final BaseBoolIntDto isActive;

    @pmi0("pinned_items")
    private final List<ShortVideoChallengePinnedItemDto> pinnedItems;

    @pmi0("rules")
    private final List<ShortVideoChallengeRulesItemDto> rules;

    @pmi0(TtmlNode.TAG_STYLE)
    private final ShortVideoChallengeStyleDto style;

    @pmi0("terms")
    private final ShortVideoChallengeTermsDto terms;

    /* compiled from: ShortVideoChallengeDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoChallengeDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(ShortVideoChallengeDto.class, parcel, arrayList4, i2, 1);
                }
                arrayList = arrayList4;
            }
            String readString = parcel.readString();
            ShortVideoChallengeCameraParamsDto createFromParcel = parcel.readInt() == 0 ? null : ShortVideoChallengeCameraParamsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(ShortVideoChallengePinnedItemDto.CREATOR, parcel, arrayList5, i3, 1);
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(ShortVideoChallengeRulesItemDto.CREATOR, parcel, arrayList6, i, 1);
                }
                arrayList3 = arrayList6;
            }
            return new ShortVideoChallengeDto(arrayList, readString, createFromParcel, arrayList2, arrayList3, parcel.readInt() == 0 ? null : ShortVideoChallengeTermsDto.CREATOR.createFromParcel(parcel), parcel.readString(), (UserId) parcel.readParcelable(ShortVideoChallengeDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(ShortVideoChallengeDto.class.getClassLoader()), parcel.readInt() == 0 ? null : ShortVideoChallengeStyleDto.CREATOR.createFromParcel(parcel), (ActionLinksActionDto) parcel.readParcelable(ShortVideoChallengeDto.class.getClassLoader()), parcel.readInt() != 0 ? ShortVideoChallengeBannerDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeDto[] newArray(int i) {
            return new ShortVideoChallengeDto[i];
        }
    }

    public ShortVideoChallengeDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final ActionLinksActionDto d() {
        return this.actionButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UserId e() {
        return this.authorId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoChallengeDto)) {
            return false;
        }
        ShortVideoChallengeDto shortVideoChallengeDto = (ShortVideoChallengeDto) obj;
        return epx.f(this.image, shortVideoChallengeDto.image) && epx.f(this.description, shortVideoChallengeDto.description) && epx.f(this.cameraParams, shortVideoChallengeDto.cameraParams) && epx.f(this.pinnedItems, shortVideoChallengeDto.pinnedItems) && epx.f(this.rules, shortVideoChallengeDto.rules) && epx.f(this.terms, shortVideoChallengeDto.terms) && epx.f(this.disclaimer, shortVideoChallengeDto.disclaimer) && epx.f(this.authorId, shortVideoChallengeDto.authorId) && this.isActive == shortVideoChallengeDto.isActive && epx.f(this.style, shortVideoChallengeDto.style) && epx.f(this.actionButton, shortVideoChallengeDto.actionButton) && epx.f(this.banner, shortVideoChallengeDto.banner);
    }

    public final ShortVideoChallengeBannerDto f() {
        return this.banner;
    }

    public final ShortVideoChallengeCameraParamsDto g() {
        return this.cameraParams;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        List<BaseImageDto> list = this.image;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ShortVideoChallengeCameraParamsDto shortVideoChallengeCameraParamsDto = this.cameraParams;
        int hashCode3 = (hashCode2 + (shortVideoChallengeCameraParamsDto == null ? 0 : shortVideoChallengeCameraParamsDto.hashCode())) * 31;
        List<ShortVideoChallengePinnedItemDto> list2 = this.pinnedItems;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ShortVideoChallengeRulesItemDto> list3 = this.rules;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ShortVideoChallengeTermsDto shortVideoChallengeTermsDto = this.terms;
        int hashCode6 = (hashCode5 + (shortVideoChallengeTermsDto == null ? 0 : shortVideoChallengeTermsDto.hashCode())) * 31;
        String str2 = this.disclaimer;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.authorId;
        int hashCode8 = (hashCode7 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isActive;
        int hashCode9 = (hashCode8 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        ShortVideoChallengeStyleDto shortVideoChallengeStyleDto = this.style;
        int hashCode10 = (hashCode9 + (shortVideoChallengeStyleDto == null ? 0 : shortVideoChallengeStyleDto.hashCode())) * 31;
        ActionLinksActionDto actionLinksActionDto = this.actionButton;
        int hashCode11 = (hashCode10 + (actionLinksActionDto == null ? 0 : actionLinksActionDto.hashCode())) * 31;
        ShortVideoChallengeBannerDto shortVideoChallengeBannerDto = this.banner;
        return hashCode11 + (shortVideoChallengeBannerDto != null ? shortVideoChallengeBannerDto.hashCode() : 0);
    }

    public final String i() {
        return this.disclaimer;
    }

    public final List<BaseImageDto> j() {
        return this.image;
    }

    public final List<ShortVideoChallengePinnedItemDto> k() {
        return this.pinnedItems;
    }

    public final List<ShortVideoChallengeRulesItemDto> l() {
        return this.rules;
    }

    public final ShortVideoChallengeStyleDto n() {
        return this.style;
    }

    public final ShortVideoChallengeTermsDto o() {
        return this.terms;
    }

    public final String toString() {
        return "ShortVideoChallengeDto(image=" + this.image + ", description=" + this.description + ", cameraParams=" + this.cameraParams + ", pinnedItems=" + this.pinnedItems + ", rules=" + this.rules + ", terms=" + this.terms + ", disclaimer=" + this.disclaimer + ", authorId=" + this.authorId + ", isActive=" + this.isActive + ", style=" + this.style + ", actionButton=" + this.actionButton + ", banner=" + this.banner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.description);
        ShortVideoChallengeCameraParamsDto shortVideoChallengeCameraParamsDto = this.cameraParams;
        if (shortVideoChallengeCameraParamsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoChallengeCameraParamsDto.writeToParcel(parcel, i);
        }
        List<ShortVideoChallengePinnedItemDto> list2 = this.pinnedItems;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((ShortVideoChallengePinnedItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<ShortVideoChallengeRulesItemDto> list3 = this.rules;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((ShortVideoChallengeRulesItemDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        ShortVideoChallengeTermsDto shortVideoChallengeTermsDto = this.terms;
        if (shortVideoChallengeTermsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoChallengeTermsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.disclaimer);
        parcel.writeParcelable(this.authorId, i);
        parcel.writeParcelable(this.isActive, i);
        ShortVideoChallengeStyleDto shortVideoChallengeStyleDto = this.style;
        if (shortVideoChallengeStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoChallengeStyleDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.actionButton, i);
        ShortVideoChallengeBannerDto shortVideoChallengeBannerDto = this.banner;
        if (shortVideoChallengeBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoChallengeBannerDto.writeToParcel(parcel, i);
        }
    }

    public ShortVideoChallengeDto(List<BaseImageDto> list, String str, ShortVideoChallengeCameraParamsDto shortVideoChallengeCameraParamsDto, List<ShortVideoChallengePinnedItemDto> list2, List<ShortVideoChallengeRulesItemDto> list3, ShortVideoChallengeTermsDto shortVideoChallengeTermsDto, String str2, UserId userId, BaseBoolIntDto baseBoolIntDto, ShortVideoChallengeStyleDto shortVideoChallengeStyleDto, ActionLinksActionDto actionLinksActionDto, ShortVideoChallengeBannerDto shortVideoChallengeBannerDto) {
        this.image = list;
        this.description = str;
        this.cameraParams = shortVideoChallengeCameraParamsDto;
        this.pinnedItems = list2;
        this.rules = list3;
        this.terms = shortVideoChallengeTermsDto;
        this.disclaimer = str2;
        this.authorId = userId;
        this.isActive = baseBoolIntDto;
        this.style = shortVideoChallengeStyleDto;
        this.actionButton = actionLinksActionDto;
        this.banner = shortVideoChallengeBannerDto;
    }

    public /* synthetic */ ShortVideoChallengeDto(List list, String str, ShortVideoChallengeCameraParamsDto shortVideoChallengeCameraParamsDto, List list2, List list3, ShortVideoChallengeTermsDto shortVideoChallengeTermsDto, String str2, UserId userId, BaseBoolIntDto baseBoolIntDto, ShortVideoChallengeStyleDto shortVideoChallengeStyleDto, ActionLinksActionDto actionLinksActionDto, ShortVideoChallengeBannerDto shortVideoChallengeBannerDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : shortVideoChallengeCameraParamsDto, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : shortVideoChallengeTermsDto, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : userId, (i & 256) != 0 ? null : baseBoolIntDto, (i & 512) != 0 ? null : shortVideoChallengeStyleDto, (i & 1024) != 0 ? null : actionLinksActionDto, (i & 2048) != 0 ? null : shortVideoChallengeBannerDto);
    }
}
