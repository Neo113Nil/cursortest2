package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioRestrictionDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioBooksChapterDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksChapterDto implements Parcelable {
    public static final Parcelable.Creator<AudioBooksChapterDto> CREATOR = new a();

    @pmi0("audio_file")
    private final AudioBooksAudioFileDto audioFile;

    @pmi0("content_restricted")
    private final AudioRestrictionDto contentRestricted;

    @pmi0("flags_context")
    private final Integer flagsContext;

    @pmi0("id")
    private final String id;

    @pmi0("progress_status")
    private final AudioBooksChapterProgressStatusDto progressStatus;

    @pmi0("progress_time")
    private final int progressTime;

    @pmi0("special_project_id")
    private final Integer specialProjectId;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: AudioBooksChapterDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksChapterDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBooksChapterDto createFromParcel(Parcel parcel) {
            return new AudioBooksChapterDto(parcel.readString(), parcel.readString(), parcel.readInt(), AudioBooksChapterProgressStatusDto.CREATOR.createFromParcel(parcel), AudioBooksAudioFileDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (AudioRestrictionDto) parcel.readParcelable(AudioBooksChapterDto.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksChapterDto[] newArray(int i) {
            return new AudioBooksChapterDto[i];
        }
    }

    public AudioBooksChapterDto(String str, String str2, int i, AudioBooksChapterProgressStatusDto audioBooksChapterProgressStatusDto, AudioBooksAudioFileDto audioBooksAudioFileDto, String str3, Integer num, AudioRestrictionDto audioRestrictionDto, Integer num2) {
        this.id = str;
        this.title = str2;
        this.progressTime = i;
        this.progressStatus = audioBooksChapterProgressStatusDto;
        this.audioFile = audioBooksAudioFileDto;
        this.trackCode = str3;
        this.specialProjectId = num;
        this.contentRestricted = audioRestrictionDto;
        this.flagsContext = num2;
    }

    public final AudioBooksAudioFileDto d() {
        return this.audioFile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.flagsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBooksChapterDto)) {
            return false;
        }
        AudioBooksChapterDto audioBooksChapterDto = (AudioBooksChapterDto) obj;
        return epx.f(this.id, audioBooksChapterDto.id) && epx.f(this.title, audioBooksChapterDto.title) && this.progressTime == audioBooksChapterDto.progressTime && this.progressStatus == audioBooksChapterDto.progressStatus && epx.f(this.audioFile, audioBooksChapterDto.audioFile) && epx.f(this.trackCode, audioBooksChapterDto.trackCode) && epx.f(this.specialProjectId, audioBooksChapterDto.specialProjectId) && this.contentRestricted == audioBooksChapterDto.contentRestricted && epx.f(this.flagsContext, audioBooksChapterDto.flagsContext);
    }

    public final AudioBooksChapterProgressStatusDto f() {
        return this.progressStatus;
    }

    public final int g() {
        return this.progressTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.audioFile.hashCode() + ((this.progressStatus.hashCode() + shy.a(this.progressTime, urd0.a(this.id.hashCode() * 31, 31, this.title), 31)) * 31)) * 31, 31, this.trackCode);
        Integer num = this.specialProjectId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        AudioRestrictionDto audioRestrictionDto = this.contentRestricted;
        int hashCode2 = (hashCode + (audioRestrictionDto == null ? 0 : audioRestrictionDto.hashCode())) * 31;
        Integer num2 = this.flagsContext;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final Integer i() {
        return this.specialProjectId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksChapterDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", progressTime=");
        sb.append(this.progressTime);
        sb.append(", progressStatus=");
        sb.append(this.progressStatus);
        sb.append(", audioFile=");
        sb.append(this.audioFile);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", specialProjectId=");
        sb.append(this.specialProjectId);
        sb.append(", contentRestricted=");
        sb.append(this.contentRestricted);
        sb.append(", flagsContext=");
        return uqi.b(sb, this.flagsContext, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.progressTime);
        this.progressStatus.writeToParcel(parcel, i);
        this.audioFile.writeToParcel(parcel, i);
        parcel.writeString(this.trackCode);
        Integer num = this.specialProjectId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.contentRestricted, i);
        Integer num2 = this.flagsContext;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ AudioBooksChapterDto(String str, String str2, int i, AudioBooksChapterProgressStatusDto audioBooksChapterProgressStatusDto, AudioBooksAudioFileDto audioBooksAudioFileDto, String str3, Integer num, AudioRestrictionDto audioRestrictionDto, Integer num2, int i2, zcl zclVar) {
        this(str, str2, i, audioBooksChapterProgressStatusDto, audioBooksAudioFileDto, str3, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : audioRestrictionDto, (i2 & 256) != 0 ? null : num2);
    }
}
