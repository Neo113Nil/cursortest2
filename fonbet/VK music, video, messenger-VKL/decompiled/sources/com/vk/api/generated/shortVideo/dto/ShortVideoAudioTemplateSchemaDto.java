package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ShortVideoAudioTemplateSchemaDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoAudioTemplateSchemaDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoAudioTemplateSchemaDto> CREATOR = new a();

    @pmi0("audio_fragments")
    private final List<ShortVideoTemplateAudioFragmentDto> audioFragments;

    @pmi0("video_fragments")
    private final List<ShortVideoTemplateFragmentDto> videoFragments;

    /* compiled from: ShortVideoAudioTemplateSchemaDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoAudioTemplateSchemaDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoAudioTemplateSchemaDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(ShortVideoTemplateAudioFragmentDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(ShortVideoTemplateFragmentDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new ShortVideoAudioTemplateSchemaDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoAudioTemplateSchemaDto[] newArray(int i) {
            return new ShortVideoAudioTemplateSchemaDto[i];
        }
    }

    public ShortVideoAudioTemplateSchemaDto(List<ShortVideoTemplateAudioFragmentDto> list, List<ShortVideoTemplateFragmentDto> list2) {
        this.audioFragments = list;
        this.videoFragments = list2;
    }

    public final List<ShortVideoTemplateAudioFragmentDto> d() {
        return this.audioFragments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<ShortVideoTemplateFragmentDto> e() {
        return this.videoFragments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoAudioTemplateSchemaDto)) {
            return false;
        }
        ShortVideoAudioTemplateSchemaDto shortVideoAudioTemplateSchemaDto = (ShortVideoAudioTemplateSchemaDto) obj;
        return epx.f(this.audioFragments, shortVideoAudioTemplateSchemaDto.audioFragments) && epx.f(this.videoFragments, shortVideoAudioTemplateSchemaDto.videoFragments);
    }

    public final int hashCode() {
        return this.videoFragments.hashCode() + (this.audioFragments.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoAudioTemplateSchemaDto(audioFragments=");
        sb.append(this.audioFragments);
        sb.append(", videoFragments=");
        return ms9.a(')', sb, this.videoFragments);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.audioFragments);
        while (a2.hasNext()) {
            ((ShortVideoTemplateAudioFragmentDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.videoFragments);
        while (a3.hasNext()) {
            ((ShortVideoTemplateFragmentDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
