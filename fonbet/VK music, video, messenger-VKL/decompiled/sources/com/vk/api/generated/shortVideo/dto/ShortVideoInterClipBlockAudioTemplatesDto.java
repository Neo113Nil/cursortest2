package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ShortVideoInterClipBlockAudioTemplatesDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoInterClipBlockAudioTemplatesDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoInterClipBlockAudioTemplatesDto> CREATOR = new a();

    @pmi0("after_video")
    private final String afterVideo;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("description")
    private final String description;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    /* compiled from: ShortVideoInterClipBlockAudioTemplatesDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoInterClipBlockAudioTemplatesDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoInterClipBlockAudioTemplatesDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ShortVideoInterClipBlockAudioTemplatesDto.class, parcel, arrayList, i, 1);
            }
            return new ShortVideoInterClipBlockAudioTemplatesDto(arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoInterClipBlockAudioTemplatesDto[] newArray(int i) {
            return new ShortVideoInterClipBlockAudioTemplatesDto[i];
        }
    }

    public ShortVideoInterClipBlockAudioTemplatesDto(List<VideoVideoFullDto> list, String str, String str2, String str3) {
        this.items = list;
        this.afterVideo = str;
        this.buttonText = str2;
        this.description = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoInterClipBlockAudioTemplatesDto)) {
            return false;
        }
        ShortVideoInterClipBlockAudioTemplatesDto shortVideoInterClipBlockAudioTemplatesDto = (ShortVideoInterClipBlockAudioTemplatesDto) obj;
        return epx.f(this.items, shortVideoInterClipBlockAudioTemplatesDto.items) && epx.f(this.afterVideo, shortVideoInterClipBlockAudioTemplatesDto.afterVideo) && epx.f(this.buttonText, shortVideoInterClipBlockAudioTemplatesDto.buttonText) && epx.f(this.description, shortVideoInterClipBlockAudioTemplatesDto.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + urd0.a(urd0.a(this.items.hashCode() * 31, 31, this.afterVideo), 31, this.buttonText);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoInterClipBlockAudioTemplatesDto(items=");
        sb.append(this.items);
        sb.append(", afterVideo=");
        sb.append(this.afterVideo);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.afterVideo);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.description);
    }
}
