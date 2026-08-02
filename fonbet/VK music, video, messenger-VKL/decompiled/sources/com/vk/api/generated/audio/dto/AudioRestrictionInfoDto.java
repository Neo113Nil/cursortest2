package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioRestrictionInfoDto.kt */
/* loaded from: classes14.dex */
public final class AudioRestrictionInfoDto implements Parcelable {
    public static final Parcelable.Creator<AudioRestrictionInfoDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("restriction")
    private final AudioRestrictionDto restriction;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioRestrictionInfoDto.kt */
    public static final class a implements Parcelable.Creator<AudioRestrictionInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioRestrictionInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AudioRestrictionDto audioRestrictionDto = (AudioRestrictionDto) parcel.readParcelable(AudioRestrictionInfoDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(AudioRestrictionInfoDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AudioRestrictionInfoDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AudioRestrictionInfoDto(audioRestrictionDto, readString, readString2, baseLinkButtonDto, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioRestrictionInfoDto[] newArray(int i) {
            return new AudioRestrictionInfoDto[i];
        }
    }

    public AudioRestrictionInfoDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final BaseLinkButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.icons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioRestrictionInfoDto)) {
            return false;
        }
        AudioRestrictionInfoDto audioRestrictionInfoDto = (AudioRestrictionInfoDto) obj;
        return this.restriction == audioRestrictionInfoDto.restriction && epx.f(this.title, audioRestrictionInfoDto.title) && epx.f(this.text, audioRestrictionInfoDto.text) && epx.f(this.button, audioRestrictionInfoDto.button) && epx.f(this.icons, audioRestrictionInfoDto.icons);
    }

    public final AudioRestrictionDto f() {
        return this.restriction;
    }

    public final String g() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        AudioRestrictionDto audioRestrictionDto = this.restriction;
        int hashCode = (audioRestrictionDto == null ? 0 : audioRestrictionDto.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        int hashCode4 = (hashCode3 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        List<BaseImageDto> list = this.icons;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioRestrictionInfoDto(restriction=");
        sb.append(this.restriction);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", icons=");
        return ms9.a(')', sb, this.icons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.restriction, i);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.button, i);
        List<BaseImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public AudioRestrictionInfoDto(AudioRestrictionDto audioRestrictionDto, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, List<BaseImageDto> list) {
        this.restriction = audioRestrictionDto;
        this.title = str;
        this.text = str2;
        this.button = baseLinkButtonDto;
        this.icons = list;
    }

    public /* synthetic */ AudioRestrictionInfoDto(AudioRestrictionDto audioRestrictionDto, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : audioRestrictionDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : baseLinkButtonDto, (i & 16) != 0 ? null : list);
    }
}
