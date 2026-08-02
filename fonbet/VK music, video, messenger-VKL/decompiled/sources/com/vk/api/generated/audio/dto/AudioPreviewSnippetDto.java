package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: AudioPreviewSnippetDto.kt */
/* loaded from: classes14.dex */
public final class AudioPreviewSnippetDto implements Parcelable {
    public static final Parcelable.Creator<AudioPreviewSnippetDto> CREATOR = new a();

    @pmi0("audio_ids")
    private final List<String> audioIds;

    @pmi0("audios")
    private final List<AudioAudioDto> audios;

    @pmi0("image")
    private final String image;

    @pmi0("nav_url")
    private final String navUrl;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final AudioPreviewSnippetTypeDto type;

    /* compiled from: AudioPreviewSnippetDto.kt */
    public static final class a implements Parcelable.Creator<AudioPreviewSnippetDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPreviewSnippetDto createFromParcel(Parcel parcel) {
            AudioPreviewSnippetTypeDto createFromParcel = AudioPreviewSnippetTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AudioPreviewSnippetDto.class, parcel, arrayList, i, 1);
            }
            return new AudioPreviewSnippetDto(createFromParcel, readString, readString2, readString3, readString4, arrayList, parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPreviewSnippetDto[] newArray(int i) {
            return new AudioPreviewSnippetDto[i];
        }
    }

    public AudioPreviewSnippetDto(AudioPreviewSnippetTypeDto audioPreviewSnippetTypeDto, String str, String str2, String str3, String str4, List<AudioAudioDto> list, List<String> list2, String str5) {
        this.type = audioPreviewSnippetTypeDto;
        this.title = str;
        this.text = str2;
        this.navUrl = str3;
        this.image = str4;
        this.audios = list;
        this.audioIds = list2;
        this.trackCode = str5;
    }

    public final List<String> d() {
        return this.audioIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AudioAudioDto> e() {
        return this.audios;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPreviewSnippetDto)) {
            return false;
        }
        AudioPreviewSnippetDto audioPreviewSnippetDto = (AudioPreviewSnippetDto) obj;
        return this.type == audioPreviewSnippetDto.type && epx.f(this.title, audioPreviewSnippetDto.title) && epx.f(this.text, audioPreviewSnippetDto.text) && epx.f(this.navUrl, audioPreviewSnippetDto.navUrl) && epx.f(this.image, audioPreviewSnippetDto.image) && epx.f(this.audios, audioPreviewSnippetDto.audios) && epx.f(this.audioIds, audioPreviewSnippetDto.audioIds) && epx.f(this.trackCode, audioPreviewSnippetDto.trackCode);
    }

    public final String f() {
        return this.image;
    }

    public final String g() {
        return this.navUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.trackCode.hashCode() + fw3.a(fw3.a(urd0.a(urd0.a(urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.text), 31, this.navUrl), 31, this.image), 31, this.audios), 31, this.audioIds);
    }

    public final String i() {
        return this.text;
    }

    public final AudioPreviewSnippetTypeDto j() {
        return this.type;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPreviewSnippetDto(type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", navUrl=");
        sb.append(this.navUrl);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", audios=");
        sb.append(this.audios);
        sb.append(", audioIds=");
        sb.append(this.audioIds);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.navUrl);
        parcel.writeString(this.image);
        Iterator a2 = ao.a(parcel, this.audios);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeStringList(this.audioIds);
        parcel.writeString(this.trackCode);
    }
}
