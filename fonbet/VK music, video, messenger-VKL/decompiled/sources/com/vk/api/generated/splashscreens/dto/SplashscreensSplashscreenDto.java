package com.vk.api.generated.splashscreens.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SplashscreensSplashscreenDto.kt */
/* loaded from: classes15.dex */
public final class SplashscreensSplashscreenDto implements Parcelable {
    public static final Parcelable.Creator<SplashscreensSplashscreenDto> CREATOR = new a();

    @pmi0("campaign_name")
    private final String campaignName;

    @pmi0("controls")
    private final SplashscreensControlsDto controls;

    @pmi0("finish_at")
    private final Integer finishAt;

    @pmi0("id")
    private final int id;

    @pmi0("is_fullscreen_media_content")
    private final boolean isFullscreenMediaContent;

    @pmi0("show_at")
    private final Integer showAt;

    @pmi0("slides")
    private final List<SplashscreensSlideDto> slides;

    /* compiled from: SplashscreensSplashscreenDto.kt */
    public static final class a implements Parcelable.Creator<SplashscreensSplashscreenDto> {
        @Override // android.os.Parcelable.Creator
        public final SplashscreensSplashscreenDto createFromParcel(Parcel parcel) {
            int i;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(SplashscreensSlideDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new SplashscreensSplashscreenDto(readInt, readString, z, arrayList, SplashscreensControlsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SplashscreensSplashscreenDto[] newArray(int i) {
            return new SplashscreensSplashscreenDto[i];
        }
    }

    public SplashscreensSplashscreenDto(int i, String str, boolean z, List<SplashscreensSlideDto> list, SplashscreensControlsDto splashscreensControlsDto, Integer num, Integer num2) {
        this.id = i;
        this.campaignName = str;
        this.isFullscreenMediaContent = z;
        this.slides = list;
        this.controls = splashscreensControlsDto;
        this.showAt = num;
        this.finishAt = num2;
    }

    public final String d() {
        return this.campaignName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SplashscreensControlsDto e() {
        return this.controls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashscreensSplashscreenDto)) {
            return false;
        }
        SplashscreensSplashscreenDto splashscreensSplashscreenDto = (SplashscreensSplashscreenDto) obj;
        return this.id == splashscreensSplashscreenDto.id && epx.f(this.campaignName, splashscreensSplashscreenDto.campaignName) && this.isFullscreenMediaContent == splashscreensSplashscreenDto.isFullscreenMediaContent && epx.f(this.slides, splashscreensSplashscreenDto.slides) && epx.f(this.controls, splashscreensSplashscreenDto.controls) && epx.f(this.showAt, splashscreensSplashscreenDto.showAt) && epx.f(this.finishAt, splashscreensSplashscreenDto.finishAt);
    }

    public final Integer f() {
        return this.showAt;
    }

    public final List<SplashscreensSlideDto> g() {
        return this.slides;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.controls.hashCode() + fw3.a(qoy.b(urd0.a(Integer.hashCode(this.id) * 31, 31, this.campaignName), 31, this.isFullscreenMediaContent), 31, this.slides)) * 31;
        Integer num = this.showAt;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.finishAt;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean i() {
        return this.isFullscreenMediaContent;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplashscreensSplashscreenDto(id=");
        sb.append(this.id);
        sb.append(", campaignName=");
        sb.append(this.campaignName);
        sb.append(", isFullscreenMediaContent=");
        sb.append(this.isFullscreenMediaContent);
        sb.append(", slides=");
        sb.append(this.slides);
        sb.append(", controls=");
        sb.append(this.controls);
        sb.append(", showAt=");
        sb.append(this.showAt);
        sb.append(", finishAt=");
        return uqi.b(sb, this.finishAt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.campaignName);
        parcel.writeInt(this.isFullscreenMediaContent ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.slides);
        while (a2.hasNext()) {
            ((SplashscreensSlideDto) a2.next()).writeToParcel(parcel, i);
        }
        this.controls.writeToParcel(parcel, i);
        Integer num = this.showAt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.finishAt;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ SplashscreensSplashscreenDto(int i, String str, boolean z, List list, SplashscreensControlsDto splashscreensControlsDto, Integer num, Integer num2, int i2, zcl zclVar) {
        this(i, str, z, list, splashscreensControlsDto, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : num2);
    }
}
