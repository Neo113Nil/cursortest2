package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoDonutPopupDto.kt */
/* loaded from: classes15.dex */
public final class VideoDonutPopupDto implements Parcelable {
    public static final Parcelable.Creator<VideoDonutPopupDto> CREATOR = new a();

    @pmi0("action")
    private final VideoDonutActionDto action;

    @pmi0("illustration")
    private final IllustrationDto illustration;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoDonutPopupDto.kt */
    public static final class IllustrationDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IllustrationDto[] $VALUES;
        public static final Parcelable.Creator<IllustrationDto> CREATOR;

        @pmi0("illustration_donut_logo_confetti_120h")
        public static final IllustrationDto ILLUSTRATION_DONUT_LOGO_CONFETTI_120H;
        private final String value;

        /* compiled from: VideoDonutPopupDto.kt */
        public static final class a implements Parcelable.Creator<IllustrationDto> {
            @Override // android.os.Parcelable.Creator
            public final IllustrationDto createFromParcel(Parcel parcel) {
                return IllustrationDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IllustrationDto[] newArray(int i) {
                return new IllustrationDto[i];
            }
        }

        static {
            IllustrationDto illustrationDto = new IllustrationDto("ILLUSTRATION_DONUT_LOGO_CONFETTI_120H", 0, "illustration_donut_logo_confetti_120h");
            ILLUSTRATION_DONUT_LOGO_CONFETTI_120H = illustrationDto;
            IllustrationDto[] illustrationDtoArr = {illustrationDto};
            $VALUES = illustrationDtoArr;
            $ENTRIES = new asp(illustrationDtoArr);
            CREATOR = new a();
        }

        private IllustrationDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IllustrationDto valueOf(String str) {
            return (IllustrationDto) Enum.valueOf(IllustrationDto.class, str);
        }

        public static IllustrationDto[] values() {
            return (IllustrationDto[]) $VALUES.clone();
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

    /* compiled from: VideoDonutPopupDto.kt */
    public static final class a implements Parcelable.Creator<VideoDonutPopupDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoDonutPopupDto createFromParcel(Parcel parcel) {
            return new VideoDonutPopupDto(IllustrationDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : VideoDonutActionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDonutPopupDto[] newArray(int i) {
            return new VideoDonutPopupDto[i];
        }
    }

    public VideoDonutPopupDto(IllustrationDto illustrationDto, String str, String str2, VideoDonutActionDto videoDonutActionDto) {
        this.illustration = illustrationDto;
        this.title = str;
        this.text = str2;
        this.action = videoDonutActionDto;
    }

    public final VideoDonutActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final IllustrationDto e() {
        return this.illustration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDonutPopupDto)) {
            return false;
        }
        VideoDonutPopupDto videoDonutPopupDto = (VideoDonutPopupDto) obj;
        return this.illustration == videoDonutPopupDto.illustration && epx.f(this.title, videoDonutPopupDto.title) && epx.f(this.text, videoDonutPopupDto.text) && epx.f(this.action, videoDonutPopupDto.action);
    }

    public final String f() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.illustration.hashCode() * 31, 31, this.title), 31, this.text);
        VideoDonutActionDto videoDonutActionDto = this.action;
        return a2 + (videoDonutActionDto == null ? 0 : videoDonutActionDto.hashCode());
    }

    public final String toString() {
        return "VideoDonutPopupDto(illustration=" + this.illustration + ", title=" + this.title + ", text=" + this.text + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.illustration.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        VideoDonutActionDto videoDonutActionDto = this.action;
        if (videoDonutActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoDonutActionDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoDonutPopupDto(IllustrationDto illustrationDto, String str, String str2, VideoDonutActionDto videoDonutActionDto, int i, zcl zclVar) {
        this(illustrationDto, str, str2, (i & 8) != 0 ? null : videoDonutActionDto);
    }
}
