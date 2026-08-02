package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AudioStreamMixSettingsCategoryDto.kt */
/* loaded from: classes14.dex */
public final class AudioStreamMixSettingsCategoryDto implements Parcelable {
    public static final Parcelable.Creator<AudioStreamMixSettingsCategoryDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<AudioStreamMixSettingsOptionDto> options;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* compiled from: AudioStreamMixSettingsCategoryDto.kt */
    public static final class a implements Parcelable.Creator<AudioStreamMixSettingsCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixSettingsCategoryDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AudioStreamMixSettingsOptionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AudioStreamMixSettingsCategoryDto(readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixSettingsCategoryDto[] newArray(int i) {
            return new AudioStreamMixSettingsCategoryDto[i];
        }
    }

    public AudioStreamMixSettingsCategoryDto(String str, String str2, String str3, List<AudioStreamMixSettingsOptionDto> list) {
        this.id = str;
        this.title = str2;
        this.type = str3;
        this.options = list;
    }

    public final List<AudioStreamMixSettingsOptionDto> d() {
        return this.options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioStreamMixSettingsCategoryDto)) {
            return false;
        }
        AudioStreamMixSettingsCategoryDto audioStreamMixSettingsCategoryDto = (AudioStreamMixSettingsCategoryDto) obj;
        return epx.f(this.id, audioStreamMixSettingsCategoryDto.id) && epx.f(this.title, audioStreamMixSettingsCategoryDto.title) && epx.f(this.type, audioStreamMixSettingsCategoryDto.type) && epx.f(this.options, audioStreamMixSettingsCategoryDto.options);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.options.hashCode() + urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.type);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamMixSettingsCategoryDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", options=");
        return ms9.a(')', sb, this.options);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.type);
        Iterator a2 = ao.a(parcel, this.options);
        while (a2.hasNext()) {
            ((AudioStreamMixSettingsOptionDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
