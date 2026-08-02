package com.vk.api.generated.splashscreens.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SplashscreensControlsCtaButtonDto.kt */
/* loaded from: classes15.dex */
public final class SplashscreensControlsCtaButtonDto implements Parcelable {
    public static final Parcelable.Creator<SplashscreensControlsCtaButtonDto> CREATOR = new a();

    @pmi0("action")
    private final SplashscreensControlsCtaButtonActionDto action;

    @pmi0("color_button")
    private final SplashscreensColorObjectDto colorButton;

    @pmi0("color_text")
    private final SplashscreensColorObjectDto colorText;

    @pmi0("show_on_slides")
    private final ShowOnSlidesDto showOnSlides;

    @pmi0("text")
    private final String text;

    @pmi0("visible_after_ms")
    private final int visibleAfterMs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SplashscreensControlsCtaButtonDto.kt */
    public static final class ShowOnSlidesDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ShowOnSlidesDto[] $VALUES;

        @pmi0("all")
        public static final ShowOnSlidesDto ALL;
        public static final Parcelable.Creator<ShowOnSlidesDto> CREATOR;

        @pmi0("last")
        public static final ShowOnSlidesDto LAST;
        private final String value;

        /* compiled from: SplashscreensControlsCtaButtonDto.kt */
        public static final class a implements Parcelable.Creator<ShowOnSlidesDto> {
            @Override // android.os.Parcelable.Creator
            public final ShowOnSlidesDto createFromParcel(Parcel parcel) {
                return ShowOnSlidesDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ShowOnSlidesDto[] newArray(int i) {
                return new ShowOnSlidesDto[i];
            }
        }

        static {
            ShowOnSlidesDto showOnSlidesDto = new ShowOnSlidesDto("LAST", 0, "last");
            LAST = showOnSlidesDto;
            ShowOnSlidesDto showOnSlidesDto2 = new ShowOnSlidesDto("ALL", 1, "all");
            ALL = showOnSlidesDto2;
            ShowOnSlidesDto[] showOnSlidesDtoArr = {showOnSlidesDto, showOnSlidesDto2};
            $VALUES = showOnSlidesDtoArr;
            $ENTRIES = new asp(showOnSlidesDtoArr);
            CREATOR = new a();
        }

        private ShowOnSlidesDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ShowOnSlidesDto valueOf(String str) {
            return (ShowOnSlidesDto) Enum.valueOf(ShowOnSlidesDto.class, str);
        }

        public static ShowOnSlidesDto[] values() {
            return (ShowOnSlidesDto[]) $VALUES.clone();
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

    /* compiled from: SplashscreensControlsCtaButtonDto.kt */
    public static final class a implements Parcelable.Creator<SplashscreensControlsCtaButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final SplashscreensControlsCtaButtonDto createFromParcel(Parcel parcel) {
            return new SplashscreensControlsCtaButtonDto(parcel.readInt(), parcel.readString(), ShowOnSlidesDto.CREATOR.createFromParcel(parcel), SplashscreensControlsCtaButtonActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SplashscreensColorObjectDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SplashscreensColorObjectDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SplashscreensControlsCtaButtonDto[] newArray(int i) {
            return new SplashscreensControlsCtaButtonDto[i];
        }
    }

    public SplashscreensControlsCtaButtonDto(int i, String str, ShowOnSlidesDto showOnSlidesDto, SplashscreensControlsCtaButtonActionDto splashscreensControlsCtaButtonActionDto, SplashscreensColorObjectDto splashscreensColorObjectDto, SplashscreensColorObjectDto splashscreensColorObjectDto2) {
        this.visibleAfterMs = i;
        this.text = str;
        this.showOnSlides = showOnSlidesDto;
        this.action = splashscreensControlsCtaButtonActionDto;
        this.colorButton = splashscreensColorObjectDto;
        this.colorText = splashscreensColorObjectDto2;
    }

    public final SplashscreensControlsCtaButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SplashscreensColorObjectDto e() {
        return this.colorButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashscreensControlsCtaButtonDto)) {
            return false;
        }
        SplashscreensControlsCtaButtonDto splashscreensControlsCtaButtonDto = (SplashscreensControlsCtaButtonDto) obj;
        return this.visibleAfterMs == splashscreensControlsCtaButtonDto.visibleAfterMs && epx.f(this.text, splashscreensControlsCtaButtonDto.text) && this.showOnSlides == splashscreensControlsCtaButtonDto.showOnSlides && epx.f(this.action, splashscreensControlsCtaButtonDto.action) && epx.f(this.colorButton, splashscreensControlsCtaButtonDto.colorButton) && epx.f(this.colorText, splashscreensControlsCtaButtonDto.colorText);
    }

    public final SplashscreensColorObjectDto f() {
        return this.colorText;
    }

    public final ShowOnSlidesDto g() {
        return this.showOnSlides;
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + ((this.showOnSlides.hashCode() + urd0.a(Integer.hashCode(this.visibleAfterMs) * 31, 31, this.text)) * 31)) * 31;
        SplashscreensColorObjectDto splashscreensColorObjectDto = this.colorButton;
        int hashCode2 = (hashCode + (splashscreensColorObjectDto == null ? 0 : splashscreensColorObjectDto.hashCode())) * 31;
        SplashscreensColorObjectDto splashscreensColorObjectDto2 = this.colorText;
        return hashCode2 + (splashscreensColorObjectDto2 != null ? splashscreensColorObjectDto2.hashCode() : 0);
    }

    public final String i() {
        return this.text;
    }

    public final int j() {
        return this.visibleAfterMs;
    }

    public final String toString() {
        return "SplashscreensControlsCtaButtonDto(visibleAfterMs=" + this.visibleAfterMs + ", text=" + this.text + ", showOnSlides=" + this.showOnSlides + ", action=" + this.action + ", colorButton=" + this.colorButton + ", colorText=" + this.colorText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.visibleAfterMs);
        parcel.writeString(this.text);
        this.showOnSlides.writeToParcel(parcel, i);
        this.action.writeToParcel(parcel, i);
        SplashscreensColorObjectDto splashscreensColorObjectDto = this.colorButton;
        if (splashscreensColorObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            splashscreensColorObjectDto.writeToParcel(parcel, i);
        }
        SplashscreensColorObjectDto splashscreensColorObjectDto2 = this.colorText;
        if (splashscreensColorObjectDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            splashscreensColorObjectDto2.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SplashscreensControlsCtaButtonDto(int i, String str, ShowOnSlidesDto showOnSlidesDto, SplashscreensControlsCtaButtonActionDto splashscreensControlsCtaButtonActionDto, SplashscreensColorObjectDto splashscreensColorObjectDto, SplashscreensColorObjectDto splashscreensColorObjectDto2, int i2, zcl zclVar) {
        this(i, str, showOnSlidesDto, splashscreensControlsCtaButtonActionDto, (i2 & 16) != 0 ? null : splashscreensColorObjectDto, (i2 & 32) != 0 ? null : splashscreensColorObjectDto2);
    }
}
