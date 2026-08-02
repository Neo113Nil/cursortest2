package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedItemDigestHeaderDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemDigestHeaderDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemDigestHeaderDto> CREATOR = new a();

    @pmi0("badge_text")
    private final String badgeText;

    @pmi0("button")
    private final NewsfeedItemDigestButtonDto button;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedItemDigestHeaderDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("multiline")
        public static final StyleDto MULTILINE;

        @pmi0("singleline")
        public static final StyleDto SINGLELINE;
        private final String value;

        /* compiled from: NewsfeedItemDigestHeaderDto.kt */
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
            StyleDto styleDto = new StyleDto("SINGLELINE", 0, "singleline");
            SINGLELINE = styleDto;
            StyleDto styleDto2 = new StyleDto("MULTILINE", 1, "multiline");
            MULTILINE = styleDto2;
            StyleDto[] styleDtoArr = {styleDto, styleDto2};
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

    /* compiled from: NewsfeedItemDigestHeaderDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemDigestHeaderDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDigestHeaderDto createFromParcel(Parcel parcel) {
            return new NewsfeedItemDigestHeaderDto(parcel.readString(), StyleDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : NewsfeedItemDigestButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDigestHeaderDto[] newArray(int i) {
            return new NewsfeedItemDigestHeaderDto[i];
        }
    }

    public NewsfeedItemDigestHeaderDto(String str, StyleDto styleDto, String str2, String str3, NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto) {
        this.title = str;
        this.style = styleDto;
        this.subtitle = str2;
        this.badgeText = str3;
        this.button = newsfeedItemDigestButtonDto;
    }

    public final String d() {
        return this.badgeText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NewsfeedItemDigestButtonDto e() {
        return this.button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestHeaderDto)) {
            return false;
        }
        NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = (NewsfeedItemDigestHeaderDto) obj;
        return epx.f(this.title, newsfeedItemDigestHeaderDto.title) && this.style == newsfeedItemDigestHeaderDto.style && epx.f(this.subtitle, newsfeedItemDigestHeaderDto.subtitle) && epx.f(this.badgeText, newsfeedItemDigestHeaderDto.badgeText) && epx.f(this.button, newsfeedItemDigestHeaderDto.button);
    }

    public final StyleDto f() {
        return this.style;
    }

    public final String g() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.style.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badgeText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto = this.button;
        return hashCode3 + (newsfeedItemDigestButtonDto != null ? newsfeedItemDigestButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedItemDigestHeaderDto(title=" + this.title + ", style=" + this.style + ", subtitle=" + this.subtitle + ", badgeText=" + this.badgeText + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        this.style.writeToParcel(parcel, i);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.badgeText);
        NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto = this.button;
        if (newsfeedItemDigestButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedItemDigestButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NewsfeedItemDigestHeaderDto(String str, StyleDto styleDto, String str2, String str3, NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto, int i, zcl zclVar) {
        this(str, styleDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : newsfeedItemDigestButtonDto);
    }
}
