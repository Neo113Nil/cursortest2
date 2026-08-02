package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioSignalCommonInfoDto.kt */
/* loaded from: classes14.dex */
public final class AudioSignalCommonInfoDto implements Parcelable {
    public static final Parcelable.Creator<AudioSignalCommonInfoDto> CREATOR = new a();

    @pmi0("audios")
    private final List<String> audios;

    @pmi0("cover")
    private final String cover;

    @pmi0("current_month")
    private final String currentMonth;

    @pmi0("id")
    private final String id;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioSignalCommonInfoDto.kt */
    public static final class a implements Parcelable.Creator<AudioSignalCommonInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioSignalCommonInfoDto createFromParcel(Parcel parcel) {
            return new AudioSignalCommonInfoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioSignalCommonInfoDto[] newArray(int i) {
            return new AudioSignalCommonInfoDto[i];
        }
    }

    public AudioSignalCommonInfoDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final List<String> d() {
        return this.audios;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.cover;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioSignalCommonInfoDto)) {
            return false;
        }
        AudioSignalCommonInfoDto audioSignalCommonInfoDto = (AudioSignalCommonInfoDto) obj;
        return epx.f(this.id, audioSignalCommonInfoDto.id) && epx.f(this.cover, audioSignalCommonInfoDto.cover) && epx.f(this.title, audioSignalCommonInfoDto.title) && epx.f(this.subtitle, audioSignalCommonInfoDto.subtitle) && epx.f(this.audios, audioSignalCommonInfoDto.audios) && epx.f(this.currentMonth, audioSignalCommonInfoDto.currentMonth);
    }

    public final String f() {
        return this.currentMonth;
    }

    public final String g() {
        return this.subtitle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cover;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.audios;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.currentMonth;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSignalCommonInfoDto(id=");
        sb.append(this.id);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", audios=");
        sb.append(this.audios);
        sb.append(", currentMonth=");
        return ho8.a(sb, this.currentMonth, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.cover);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeStringList(this.audios);
        parcel.writeString(this.currentMonth);
    }

    public AudioSignalCommonInfoDto(String str, String str2, String str3, String str4, List<String> list, String str5) {
        this.id = str;
        this.cover = str2;
        this.title = str3;
        this.subtitle = str4;
        this.audios = list;
        this.currentMonth = str5;
    }

    public /* synthetic */ AudioSignalCommonInfoDto(String str, String str2, String str3, String str4, List list, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5);
    }
}
