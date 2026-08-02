package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: AudioSpecialProjectDto.kt */
/* loaded from: classes14.dex */
public final class AudioSpecialProjectDto implements Parcelable {
    public static final Parcelable.Creator<AudioSpecialProjectDto> CREATOR = new a();

    @pmi0("background_image")
    private final List<BaseImageDto> backgroundImage;

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioSpecialProjectDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("avatar")
        public static final StyleDto AVATAR;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("image")
        public static final StyleDto IMAGE;
        private final String value;

        /* compiled from: AudioSpecialProjectDto.kt */
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
            StyleDto styleDto = new StyleDto("IMAGE", 0, "image");
            IMAGE = styleDto;
            StyleDto styleDto2 = new StyleDto("AVATAR", 1, "avatar");
            AVATAR = styleDto2;
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

    /* compiled from: AudioSpecialProjectDto.kt */
    public static final class a implements Parcelable.Creator<AudioSpecialProjectDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioSpecialProjectDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(AudioSpecialProjectDto.class.getClassLoader());
            StyleDto createFromParcel = StyleDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(AudioSpecialProjectDto.class, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = bo.b(AudioSpecialProjectDto.class, parcel, arrayList2, i, 1);
            }
            return new AudioSpecialProjectDto(readString, readString2, baseLinkButtonDto, createFromParcel, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioSpecialProjectDto[] newArray(int i) {
            return new AudioSpecialProjectDto[i];
        }
    }

    public AudioSpecialProjectDto(String str, String str2, BaseLinkButtonDto baseLinkButtonDto, StyleDto styleDto, List<BaseImageDto> list, List<BaseImageDto> list2, String str3) {
        this.title = str;
        this.text = str2;
        this.button = baseLinkButtonDto;
        this.style = styleDto;
        this.image = list;
        this.backgroundImage = list2;
        this.trackCode = str3;
    }

    public final List<BaseImageDto> d() {
        return this.backgroundImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseLinkButtonDto e() {
        return this.button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioSpecialProjectDto)) {
            return false;
        }
        AudioSpecialProjectDto audioSpecialProjectDto = (AudioSpecialProjectDto) obj;
        return epx.f(this.title, audioSpecialProjectDto.title) && epx.f(this.text, audioSpecialProjectDto.text) && epx.f(this.button, audioSpecialProjectDto.button) && this.style == audioSpecialProjectDto.style && epx.f(this.image, audioSpecialProjectDto.image) && epx.f(this.backgroundImage, audioSpecialProjectDto.backgroundImage) && epx.f(this.trackCode, audioSpecialProjectDto.trackCode);
    }

    public final List<BaseImageDto> f() {
        return this.image;
    }

    public final StyleDto g() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.trackCode.hashCode() + fw3.a(fw3.a((this.style.hashCode() + ((this.button.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.text)) * 31)) * 31, 31, this.image), 31, this.backgroundImage);
    }

    public final String i() {
        return this.text;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpecialProjectDto(title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", backgroundImage=");
        sb.append(this.backgroundImage);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.button, i);
        this.style.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.backgroundImage);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        parcel.writeString(this.trackCode);
    }
}
