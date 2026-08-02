package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.D1;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AdsItemBlockAdBannerBaseLinkDto.kt */
/* loaded from: classes14.dex */
public final class AdsItemBlockAdBannerBaseLinkDto implements Parcelable {
    public static final Parcelable.Creator<AdsItemBlockAdBannerBaseLinkDto> CREATOR = new a();

    @pmi0("link_url")
    private final String linkUrl;

    @pmi0("link_url_target")
    private final LinkUrlTargetDto linkUrlTarget;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemBlockAdBannerBaseLinkDto.kt */
    public static final class LinkUrlTargetDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkUrlTargetDto[] $VALUES;
        public static final Parcelable.Creator<LinkUrlTargetDto> CREATOR;

        @pmi0(D1.e)
        public static final LinkUrlTargetDto EXTERNAL;

        @pmi0("internal")
        public static final LinkUrlTargetDto INTERNAL;

        @pmi0("internal_hidden")
        public static final LinkUrlTargetDto INTERNAL_HIDDEN;
        private final String value;

        /* compiled from: AdsItemBlockAdBannerBaseLinkDto.kt */
        public static final class a implements Parcelable.Creator<LinkUrlTargetDto> {
            @Override // android.os.Parcelable.Creator
            public final LinkUrlTargetDto createFromParcel(Parcel parcel) {
                return LinkUrlTargetDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LinkUrlTargetDto[] newArray(int i) {
                return new LinkUrlTargetDto[i];
            }
        }

        static {
            LinkUrlTargetDto linkUrlTargetDto = new LinkUrlTargetDto("INTERNAL", 0, "internal");
            INTERNAL = linkUrlTargetDto;
            LinkUrlTargetDto linkUrlTargetDto2 = new LinkUrlTargetDto("EXTERNAL", 1, D1.e);
            EXTERNAL = linkUrlTargetDto2;
            LinkUrlTargetDto linkUrlTargetDto3 = new LinkUrlTargetDto("INTERNAL_HIDDEN", 2, "internal_hidden");
            INTERNAL_HIDDEN = linkUrlTargetDto3;
            LinkUrlTargetDto[] linkUrlTargetDtoArr = {linkUrlTargetDto, linkUrlTargetDto2, linkUrlTargetDto3};
            $VALUES = linkUrlTargetDtoArr;
            $ENTRIES = new asp(linkUrlTargetDtoArr);
            CREATOR = new a();
        }

        private LinkUrlTargetDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LinkUrlTargetDto valueOf(String str) {
            return (LinkUrlTargetDto) Enum.valueOf(LinkUrlTargetDto.class, str);
        }

        public static LinkUrlTargetDto[] values() {
            return (LinkUrlTargetDto[]) $VALUES.clone();
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

    /* compiled from: AdsItemBlockAdBannerBaseLinkDto.kt */
    public static final class a implements Parcelable.Creator<AdsItemBlockAdBannerBaseLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdBannerBaseLinkDto createFromParcel(Parcel parcel) {
            return new AdsItemBlockAdBannerBaseLinkDto(parcel.readString(), parcel.readInt() == 0 ? null : LinkUrlTargetDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdBannerBaseLinkDto[] newArray(int i) {
            return new AdsItemBlockAdBannerBaseLinkDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdsItemBlockAdBannerBaseLinkDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.linkUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final LinkUrlTargetDto e() {
        return this.linkUrlTarget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdBannerBaseLinkDto)) {
            return false;
        }
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto = (AdsItemBlockAdBannerBaseLinkDto) obj;
        return epx.f(this.linkUrl, adsItemBlockAdBannerBaseLinkDto.linkUrl) && this.linkUrlTarget == adsItemBlockAdBannerBaseLinkDto.linkUrlTarget;
    }

    public final int hashCode() {
        String str = this.linkUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        return hashCode + (linkUrlTargetDto != null ? linkUrlTargetDto.hashCode() : 0);
    }

    public final String toString() {
        return "AdsItemBlockAdBannerBaseLinkDto(linkUrl=" + this.linkUrl + ", linkUrlTarget=" + this.linkUrlTarget + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.linkUrl);
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        if (linkUrlTargetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkUrlTargetDto.writeToParcel(parcel, i);
        }
    }

    public AdsItemBlockAdBannerBaseLinkDto(String str, LinkUrlTargetDto linkUrlTargetDto) {
        this.linkUrl = str;
        this.linkUrlTarget = linkUrlTargetDto;
    }

    public /* synthetic */ AdsItemBlockAdBannerBaseLinkDto(String str, LinkUrlTargetDto linkUrlTargetDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : linkUrlTargetDto);
    }
}
