package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedItemDigestButtonDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemDigestButtonDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemDigestButtonDto> CREATOR = new a();

    @pmi0("action")
    private final BaseOwnerButtonActionDto action;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedItemDigestButtonDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("primary")
        public static final StyleDto PRIMARY;
        private final String value;

        /* compiled from: NewsfeedItemDigestButtonDto.kt */
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
            StyleDto styleDto = new StyleDto("PRIMARY", 0, "primary");
            PRIMARY = styleDto;
            StyleDto[] styleDtoArr = {styleDto};
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

    /* compiled from: NewsfeedItemDigestButtonDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemDigestButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDigestButtonDto createFromParcel(Parcel parcel) {
            return new NewsfeedItemDigestButtonDto(parcel.readString(), parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel), (BaseOwnerButtonActionDto) parcel.readParcelable(NewsfeedItemDigestButtonDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDigestButtonDto[] newArray(int i) {
            return new NewsfeedItemDigestButtonDto[i];
        }
    }

    public NewsfeedItemDigestButtonDto(String str, StyleDto styleDto, BaseOwnerButtonActionDto baseOwnerButtonActionDto) {
        this.title = str;
        this.style = styleDto;
        this.action = baseOwnerButtonActionDto;
    }

    public final BaseOwnerButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StyleDto e() {
        return this.style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestButtonDto)) {
            return false;
        }
        NewsfeedItemDigestButtonDto newsfeedItemDigestButtonDto = (NewsfeedItemDigestButtonDto) obj;
        return epx.f(this.title, newsfeedItemDigestButtonDto.title) && this.style == newsfeedItemDigestButtonDto.style && epx.f(this.action, newsfeedItemDigestButtonDto.action);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        StyleDto styleDto = this.style;
        int hashCode2 = (hashCode + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        BaseOwnerButtonActionDto baseOwnerButtonActionDto = this.action;
        return hashCode2 + (baseOwnerButtonActionDto != null ? baseOwnerButtonActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedItemDigestButtonDto(title=" + this.title + ", style=" + this.style + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.action, i);
    }

    public /* synthetic */ NewsfeedItemDigestButtonDto(String str, StyleDto styleDto, BaseOwnerButtonActionDto baseOwnerButtonActionDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : styleDto, (i & 4) != 0 ? null : baseOwnerButtonActionDto);
    }
}
