package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioVoiceAssistantSourceDto.kt */
/* loaded from: classes14.dex */
public final class AudioVoiceAssistantSourceDto implements Parcelable {
    public static final Parcelable.Creator<AudioVoiceAssistantSourceDto> CREATOR = new a();

    @pmi0("album_uid")
    private final String albumUid;

    @pmi0("artist")
    private final String artist;

    @pmi0("audio_hash")
    private final String audioHash;

    @pmi0("cpp_hash")
    private final String cppHash;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("media_type")
    private final String mediaType;

    @pmi0("name")
    private final String name;

    @pmi0("phrase_id")
    private final String phraseId;

    @pmi0("skill_name")
    private final String skillName;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    @pmi0("uid")
    private final String uid;

    @pmi0("url")
    private final String url;

    /* compiled from: AudioVoiceAssistantSourceDto.kt */
    public static final class a implements Parcelable.Creator<AudioVoiceAssistantSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioVoiceAssistantSourceDto createFromParcel(Parcel parcel) {
            return new AudioVoiceAssistantSourceDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioVoiceAssistantSourceDto[] newArray(int i) {
            return new AudioVoiceAssistantSourceDto[i];
        }
    }

    public AudioVoiceAssistantSourceDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final String d() {
        return this.albumUid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.artist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioVoiceAssistantSourceDto)) {
            return false;
        }
        AudioVoiceAssistantSourceDto audioVoiceAssistantSourceDto = (AudioVoiceAssistantSourceDto) obj;
        return epx.f(this.type, audioVoiceAssistantSourceDto.type) && epx.f(this.name, audioVoiceAssistantSourceDto.name) && epx.f(this.url, audioVoiceAssistantSourceDto.url) && epx.f(this.uid, audioVoiceAssistantSourceDto.uid) && epx.f(this.audioHash, audioVoiceAssistantSourceDto.audioHash) && epx.f(this.artist, audioVoiceAssistantSourceDto.artist) && epx.f(this.albumUid, audioVoiceAssistantSourceDto.albumUid) && epx.f(this.duration, audioVoiceAssistantSourceDto.duration) && epx.f(this.mediaType, audioVoiceAssistantSourceDto.mediaType) && epx.f(this.title, audioVoiceAssistantSourceDto.title) && epx.f(this.cppHash, audioVoiceAssistantSourceDto.cppHash) && epx.f(this.phraseId, audioVoiceAssistantSourceDto.phraseId) && epx.f(this.skillName, audioVoiceAssistantSourceDto.skillName);
    }

    public final String f() {
        return this.audioHash;
    }

    public final String g() {
        return this.cppHash;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.uid;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.audioHash;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.artist;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.albumUid;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.duration;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.mediaType;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.title;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cppHash;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.phraseId;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.skillName;
        return hashCode12 + (str12 != null ? str12.hashCode() : 0);
    }

    public final Integer i() {
        return this.duration;
    }

    public final String j() {
        return this.name;
    }

    public final String k() {
        return this.phraseId;
    }

    public final String l() {
        return this.skillName;
    }

    public final String n() {
        return this.uid;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioVoiceAssistantSourceDto(type=");
        sb.append(this.type);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", audioHash=");
        sb.append(this.audioHash);
        sb.append(", artist=");
        sb.append(this.artist);
        sb.append(", albumUid=");
        sb.append(this.albumUid);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", mediaType=");
        sb.append(this.mediaType);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", cppHash=");
        sb.append(this.cppHash);
        sb.append(", phraseId=");
        sb.append(this.phraseId);
        sb.append(", skillName=");
        return ho8.a(sb, this.skillName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeString(this.uid);
        parcel.writeString(this.audioHash);
        parcel.writeString(this.artist);
        parcel.writeString(this.albumUid);
        Integer num = this.duration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.mediaType);
        parcel.writeString(this.title);
        parcel.writeString(this.cppHash);
        parcel.writeString(this.phraseId);
        parcel.writeString(this.skillName);
    }

    public AudioVoiceAssistantSourceDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, String str10, String str11, String str12) {
        this.type = str;
        this.name = str2;
        this.url = str3;
        this.uid = str4;
        this.audioHash = str5;
        this.artist = str6;
        this.albumUid = str7;
        this.duration = num;
        this.mediaType = str8;
        this.title = str9;
        this.cppHash = str10;
        this.phraseId = str11;
        this.skillName = str12;
    }

    public /* synthetic */ AudioVoiceAssistantSourceDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, String str10, String str11, String str12, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12);
    }
}
