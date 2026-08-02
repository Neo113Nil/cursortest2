package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: VideoActionButtonsOnboardingSlideDto.kt */
/* loaded from: classes15.dex */
public final class VideoActionButtonsOnboardingSlideDto implements Parcelable {
    public static final Parcelable.Creator<VideoActionButtonsOnboardingSlideDto> CREATOR = new a();

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("id")
    private final int id;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("text")
    private final String text;

    /* compiled from: VideoActionButtonsOnboardingSlideDto.kt */
    public static final class a implements Parcelable.Creator<VideoActionButtonsOnboardingSlideDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoActionButtonsOnboardingSlideDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(VideoActionButtonsOnboardingSlideDto.class, parcel, arrayList, i, 1);
            }
            return new VideoActionButtonsOnboardingSlideDto(readInt, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoActionButtonsOnboardingSlideDto[] newArray(int i) {
            return new VideoActionButtonsOnboardingSlideDto[i];
        }
    }

    public VideoActionButtonsOnboardingSlideDto(int i, List<BaseImageDto> list, String str, String str2) {
        this.id = i;
        this.image = list;
        this.text = str;
        this.buttonText = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoActionButtonsOnboardingSlideDto)) {
            return false;
        }
        VideoActionButtonsOnboardingSlideDto videoActionButtonsOnboardingSlideDto = (VideoActionButtonsOnboardingSlideDto) obj;
        return this.id == videoActionButtonsOnboardingSlideDto.id && epx.f(this.image, videoActionButtonsOnboardingSlideDto.image) && epx.f(this.text, videoActionButtonsOnboardingSlideDto.text) && epx.f(this.buttonText, videoActionButtonsOnboardingSlideDto.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + urd0.a(fw3.a(Integer.hashCode(this.id) * 31, 31, this.image), 31, this.text);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoActionButtonsOnboardingSlideDto(id=");
        sb.append(this.id);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", buttonText=");
        return ho8.a(sb, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.text);
        parcel.writeString(this.buttonText);
    }
}
