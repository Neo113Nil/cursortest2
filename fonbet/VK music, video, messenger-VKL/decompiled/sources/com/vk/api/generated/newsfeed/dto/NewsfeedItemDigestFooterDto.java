package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedItemDigestFooterDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemDigestFooterDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemDigestFooterDto> CREATOR = new a();

    @pmi0("button")
    private final NewsfeedItemDigestButtonDto button;

    @pmi0("feed_id")
    private final String feedId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedItemDigestFooterDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("button")
        public static final StyleDto BUTTON;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("text")
        public static final StyleDto TEXT;
        private final String value;

        /* compiled from: NewsfeedItemDigestFooterDto.kt */
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
            StyleDto styleDto = new StyleDto("TEXT", 0, "text");
            TEXT = styleDto;
            StyleDto styleDto2 = new StyleDto("BUTTON", 1, "button");
            BUTTON = styleDto2;
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

    /* compiled from: NewsfeedItemDigestFooterDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemDigestFooterDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDigestFooterDto createFromParcel(Parcel parcel) {
            return new NewsfeedItemDigestFooterDto(StyleDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : NewsfeedItemDigestButtonDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDigestFooterDto[] newArray(int i) {
            return new NewsfeedItemDigestFooterDto[i];
        }
    }

    public NewsfeedItemDigestFooterDto(StyleDto styleDto, String str, NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto, String str2) {
        this.style = styleDto;
        this.text = str;
        this.button = newsfeedItemDigestButtonDto;
        this.feedId = str2;
    }

    public final NewsfeedItemDigestButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.feedId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestFooterDto)) {
            return false;
        }
        NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto = (NewsfeedItemDigestFooterDto) obj;
        return this.style == newsfeedItemDigestFooterDto.style && epx.f(this.text, newsfeedItemDigestFooterDto.text) && epx.f(this.button, newsfeedItemDigestFooterDto.button) && epx.f(this.feedId, newsfeedItemDigestFooterDto.feedId);
    }

    public final StyleDto f() {
        return this.style;
    }

    public final String g() {
        return this.text;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.style.hashCode() * 31, 31, this.text);
        NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto = this.button;
        int hashCode = (a2 + (newsfeedItemDigestButtonDto == null ? 0 : newsfeedItemDigestButtonDto.hashCode())) * 31;
        String str = this.feedId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemDigestFooterDto(style=");
        sb.append(this.style);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", feedId=");
        return ho8.a(sb, this.feedId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.style.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto = this.button;
        if (newsfeedItemDigestButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedItemDigestButtonDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.feedId);
    }

    public /* synthetic */ NewsfeedItemDigestFooterDto(StyleDto styleDto, String str, NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto, String str2, int i, zcl zclVar) {
        this(styleDto, str, (i & 4) != 0 ? null : newsfeedItemDigestButtonDto, (i & 8) != 0 ? null : str2);
    }
}
