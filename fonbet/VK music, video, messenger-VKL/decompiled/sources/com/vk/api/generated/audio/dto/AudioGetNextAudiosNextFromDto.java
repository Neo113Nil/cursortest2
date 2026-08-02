package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioGetNextAudiosNextFromDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetNextAudiosNextFromDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetNextAudiosNextFromDto> CREATOR = new a();

    @pmi0("audio_id")
    private final String audioId;

    @pmi0(SignalingProtocol.KEY_OFFSET)
    private final String offset;

    @pmi0("playlist_id")
    private final String playlistId;

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("source")
    private final String source;

    /* compiled from: AudioGetNextAudiosNextFromDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetNextAudiosNextFromDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetNextAudiosNextFromDto createFromParcel(Parcel parcel) {
            return new AudioGetNextAudiosNextFromDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetNextAudiosNextFromDto[] newArray(int i) {
            return new AudioGetNextAudiosNextFromDto[i];
        }
    }

    public AudioGetNextAudiosNextFromDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetNextAudiosNextFromDto)) {
            return false;
        }
        AudioGetNextAudiosNextFromDto audioGetNextAudiosNextFromDto = (AudioGetNextAudiosNextFromDto) obj;
        return epx.f(this.audioId, audioGetNextAudiosNextFromDto.audioId) && epx.f(this.playlistId, audioGetNextAudiosNextFromDto.playlistId) && epx.f(this.sectionId, audioGetNextAudiosNextFromDto.sectionId) && epx.f(this.source, audioGetNextAudiosNextFromDto.source) && epx.f(this.offset, audioGetNextAudiosNextFromDto.offset);
    }

    public final int hashCode() {
        String str = this.audioId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.playlistId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sectionId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.offset;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetNextAudiosNextFromDto(audioId=");
        sb.append(this.audioId);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", sectionId=");
        sb.append(this.sectionId);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", offset=");
        return ho8.a(sb, this.offset, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.audioId);
        parcel.writeString(this.playlistId);
        parcel.writeString(this.sectionId);
        parcel.writeString(this.source);
        parcel.writeString(this.offset);
    }

    public AudioGetNextAudiosNextFromDto(String str, String str2, String str3, String str4, String str5) {
        this.audioId = str;
        this.playlistId = str2;
        this.sectionId = str3;
        this.source = str4;
        this.offset = str5;
    }

    public /* synthetic */ AudioGetNextAudiosNextFromDto(String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
