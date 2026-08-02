package com.vk.api.generated.media.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MediaPopupDto.kt */
/* loaded from: classes15.dex */
public final class MediaPopupDto implements Parcelable {
    public static final Parcelable.Creator<MediaPopupDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("buttons")
    private final List<BaseLinkButtonDto> buttons;

    @pmi0("emoji_icons")
    private final String emojiIcons;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("id")
    private final String id;

    @pmi0("image_mode")
    private final ImageModeDto imageMode;

    @pmi0("music_subscription_event")
    private final String musicSubscriptionEvent;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    @pmi0("vk_icons_icon")
    private final String vkIconsIcon;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaPopupDto.kt */
    public static final class ImageModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageModeDto[] $VALUES;

        @pmi0("big")
        public static final ImageModeDto BIG;
        public static final Parcelable.Creator<ImageModeDto> CREATOR;

        @pmi0("emoji")
        public static final ImageModeDto EMOJI;

        @pmi0("round")
        public static final ImageModeDto ROUND;

        @pmi0("small")
        public static final ImageModeDto SMALL;
        private final String value;

        /* compiled from: MediaPopupDto.kt */
        public static final class a implements Parcelable.Creator<ImageModeDto> {
            @Override // android.os.Parcelable.Creator
            public final ImageModeDto createFromParcel(Parcel parcel) {
                return ImageModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ImageModeDto[] newArray(int i) {
                return new ImageModeDto[i];
            }
        }

        static {
            ImageModeDto imageModeDto = new ImageModeDto("ROUND", 0, "round");
            ROUND = imageModeDto;
            ImageModeDto imageModeDto2 = new ImageModeDto("SMALL", 1, "small");
            SMALL = imageModeDto2;
            ImageModeDto imageModeDto3 = new ImageModeDto("BIG", 2, "big");
            BIG = imageModeDto3;
            ImageModeDto imageModeDto4 = new ImageModeDto("EMOJI", 3, "emoji");
            EMOJI = imageModeDto4;
            ImageModeDto[] imageModeDtoArr = {imageModeDto, imageModeDto2, imageModeDto3, imageModeDto4};
            $VALUES = imageModeDtoArr;
            $ENTRIES = new asp(imageModeDtoArr);
            CREATOR = new a();
        }

        private ImageModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ImageModeDto valueOf(String str) {
            return (ImageModeDto) Enum.valueOf(ImageModeDto.class, str);
        }

        public static ImageModeDto[] values() {
            return (ImageModeDto[]) $VALUES.clone();
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

    /* compiled from: MediaPopupDto.kt */
    public static final class a implements Parcelable.Creator<MediaPopupDto> {
        @Override // android.os.Parcelable.Creator
        public final MediaPopupDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(MediaPopupDto.class.getClassLoader());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(MediaPopupDto.class, parcel, arrayList3, i2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(MediaPopupDto.class, parcel, arrayList4, i, 1);
                }
                arrayList2 = arrayList4;
            }
            String readString3 = parcel.readString();
            ImageModeDto imageModeDto = null;
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                imageModeDto = ImageModeDto.CREATOR.createFromParcel(parcel);
            }
            return new MediaPopupDto(readString, readString2, baseLinkButtonDto, arrayList, arrayList2, readString3, readString4, imageModeDto, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaPopupDto[] newArray(int i) {
            return new MediaPopupDto[i];
        }
    }

    public MediaPopupDto(String str, String str2, BaseLinkButtonDto baseLinkButtonDto, List<BaseLinkButtonDto> list, List<BaseImageDto> list2, String str3, String str4, ImageModeDto imageModeDto, String str5, String str6) {
        this.title = str;
        this.id = str2;
        this.button = baseLinkButtonDto;
        this.buttons = list;
        this.icons = list2;
        this.musicSubscriptionEvent = str3;
        this.text = str4;
        this.imageMode = imageModeDto;
        this.emojiIcons = str5;
        this.vkIconsIcon = str6;
    }

    public final BaseLinkButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseLinkButtonDto> e() {
        return this.buttons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPopupDto)) {
            return false;
        }
        MediaPopupDto mediaPopupDto = (MediaPopupDto) obj;
        return epx.f(this.title, mediaPopupDto.title) && epx.f(this.id, mediaPopupDto.id) && epx.f(this.button, mediaPopupDto.button) && epx.f(this.buttons, mediaPopupDto.buttons) && epx.f(this.icons, mediaPopupDto.icons) && epx.f(this.musicSubscriptionEvent, mediaPopupDto.musicSubscriptionEvent) && epx.f(this.text, mediaPopupDto.text) && this.imageMode == mediaPopupDto.imageMode && epx.f(this.emojiIcons, mediaPopupDto.emojiIcons) && epx.f(this.vkIconsIcon, mediaPopupDto.vkIconsIcon);
    }

    public final List<BaseImageDto> f() {
        return this.icons;
    }

    public final ImageModeDto g() {
        return this.imageMode;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        int hashCode3 = (hashCode2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        List<BaseLinkButtonDto> list = this.buttons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.icons;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.musicSubscriptionEvent;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageModeDto imageModeDto = this.imageMode;
        int hashCode8 = (hashCode7 + (imageModeDto == null ? 0 : imageModeDto.hashCode())) * 31;
        String str4 = this.emojiIcons;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.vkIconsIcon;
        return hashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.text;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaPopupDto(title=");
        sb.append(this.title);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", icons=");
        sb.append(this.icons);
        sb.append(", musicSubscriptionEvent=");
        sb.append(this.musicSubscriptionEvent);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", imageMode=");
        sb.append(this.imageMode);
        sb.append(", emojiIcons=");
        sb.append(this.emojiIcons);
        sb.append(", vkIconsIcon=");
        return ho8.a(sb, this.vkIconsIcon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.id);
        parcel.writeParcelable(this.button, i);
        List<BaseLinkButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseImageDto> list2 = this.icons;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.musicSubscriptionEvent);
        parcel.writeString(this.text);
        ImageModeDto imageModeDto = this.imageMode;
        if (imageModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageModeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.emojiIcons);
        parcel.writeString(this.vkIconsIcon);
    }

    public /* synthetic */ MediaPopupDto(String str, String str2, BaseLinkButtonDto baseLinkButtonDto, List list, List list2, String str3, String str4, ImageModeDto imageModeDto, String str5, String str6, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : baseLinkButtonDto, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : imageModeDto, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6);
    }
}
