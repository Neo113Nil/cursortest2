package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: DonutPaywallSnippetDto.kt */
/* loaded from: classes14.dex */
public final class DonutPaywallSnippetDto implements Parcelable {
    public static final Parcelable.Creator<DonutPaywallSnippetDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("icon")
    private final IconDto icon;

    @pmi0("photos")
    private final List<BaseImageDto> photos;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutPaywallSnippetDto.kt */
    public static final class IconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconDto[] $VALUES;

        @pmi0("article")
        public static final IconDto ARTICLE;

        @pmi0("audio")
        public static final IconDto AUDIO;
        public static final Parcelable.Creator<IconDto> CREATOR;

        @pmi0("image")
        public static final IconDto IMAGE;

        @pmi0("playlist")
        public static final IconDto PLAYLIST;

        @pmi0("podcast")
        public static final IconDto PODCAST;

        @pmi0("poll")
        public static final IconDto POLL;

        @pmi0("text")
        public static final IconDto TEXT;

        @pmi0("video")
        public static final IconDto VIDEO;

        @pmi0("without_icon")
        public static final IconDto WITHOUT_ICON;
        private final String value;

        /* compiled from: DonutPaywallSnippetDto.kt */
        public static final class a implements Parcelable.Creator<IconDto> {
            @Override // android.os.Parcelable.Creator
            public final IconDto createFromParcel(Parcel parcel) {
                return IconDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconDto[] newArray(int i) {
                return new IconDto[i];
            }
        }

        static {
            IconDto iconDto = new IconDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
            VIDEO = iconDto;
            IconDto iconDto2 = new IconDto("IMAGE", 1, "image");
            IMAGE = iconDto2;
            IconDto iconDto3 = new IconDto("POLL", 2, "poll");
            POLL = iconDto3;
            IconDto iconDto4 = new IconDto("PLAYLIST", 3, "playlist");
            PLAYLIST = iconDto4;
            IconDto iconDto5 = new IconDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 4, "audio");
            AUDIO = iconDto5;
            IconDto iconDto6 = new IconDto("PODCAST", 5, "podcast");
            PODCAST = iconDto6;
            IconDto iconDto7 = new IconDto("TEXT", 6, "text");
            TEXT = iconDto7;
            IconDto iconDto8 = new IconDto("ARTICLE", 7, "article");
            ARTICLE = iconDto8;
            IconDto iconDto9 = new IconDto("WITHOUT_ICON", 8, "without_icon");
            WITHOUT_ICON = iconDto9;
            IconDto[] iconDtoArr = {iconDto, iconDto2, iconDto3, iconDto4, iconDto5, iconDto6, iconDto7, iconDto8, iconDto9};
            $VALUES = iconDtoArr;
            $ENTRIES = new asp(iconDtoArr);
            CREATOR = new a();
        }

        private IconDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IconDto valueOf(String str) {
            return (IconDto) Enum.valueOf(IconDto.class, str);
        }

        public static IconDto[] values() {
            return (IconDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: DonutPaywallSnippetDto.kt */
    public static final class a implements Parcelable.Creator<DonutPaywallSnippetDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutPaywallSnippetDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            IconDto createFromParcel = IconDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(DonutPaywallSnippetDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(DonutPaywallSnippetDto.class, parcel, arrayList, i, 1);
                }
            }
            return new DonutPaywallSnippetDto(createFromParcel, readString, readString2, baseLinkButtonDto, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutPaywallSnippetDto[] newArray(int i) {
            return new DonutPaywallSnippetDto[i];
        }
    }

    public DonutPaywallSnippetDto(IconDto iconDto, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, List<BaseImageDto> list) {
        this.icon = iconDto;
        this.title = str;
        this.subtitle = str2;
        this.button = baseLinkButtonDto;
        this.photos = list;
    }

    public final BaseLinkButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final IconDto e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutPaywallSnippetDto)) {
            return false;
        }
        DonutPaywallSnippetDto donutPaywallSnippetDto = (DonutPaywallSnippetDto) obj;
        return this.icon == donutPaywallSnippetDto.icon && epx.f(this.title, donutPaywallSnippetDto.title) && epx.f(this.subtitle, donutPaywallSnippetDto.subtitle) && epx.f(this.button, donutPaywallSnippetDto.button) && epx.f(this.photos, donutPaywallSnippetDto.photos);
    }

    public final List<BaseImageDto> f() {
        return this.photos;
    }

    public final String g() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.button.hashCode() + urd0.a(urd0.a(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31;
        List<BaseImageDto> list = this.photos;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutPaywallSnippetDto(icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", photos=");
        return ms9.a(')', sb, this.photos);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.icon.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.button, i);
        List<BaseImageDto> list = this.photos;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ DonutPaywallSnippetDto(IconDto iconDto, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, List list, int i, zcl zclVar) {
        this(iconDto, str, str2, baseLinkButtonDto, (i & 16) != 0 ? null : list);
    }
}
