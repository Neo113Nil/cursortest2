package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesAudioMessageDto.kt */
/* loaded from: classes15.dex */
public final class MessagesAudioMessageDto implements Parcelable {
    public static final Parcelable.Creator<MessagesAudioMessageDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("duration")
    private final int duration;

    @pmi0("id")
    private final int id;

    @pmi0("link_mp3")
    private final String linkMp3;

    @pmi0("link_ogg")
    private final String linkOgg;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("speech_recogniser_transcription")
    private final String speechRecogniserTranscription;

    @pmi0("transcript")
    private final String transcript;

    @pmi0("transcript_error")
    private final Integer transcriptError;

    @pmi0("transcript_rate_enabled")
    private final Boolean transcriptRateEnabled;

    @pmi0("transcript_state")
    private final TranscriptStateDto transcriptState;

    @pmi0("transcript_update_time")
    private final Integer transcriptUpdateTime;

    @pmi0("waveform")
    private final List<Integer> waveform;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesAudioMessageDto.kt */
    public static final class TranscriptStateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TranscriptStateDto[] $VALUES;
        public static final Parcelable.Creator<TranscriptStateDto> CREATOR;

        @pmi0("done")
        public static final TranscriptStateDto DONE;

        @pmi0("error")
        public static final TranscriptStateDto ERROR;

        @pmi0("in_progress")
        public static final TranscriptStateDto IN_PROGRESS;
        private final String value;

        /* compiled from: MessagesAudioMessageDto.kt */
        public static final class a implements Parcelable.Creator<TranscriptStateDto> {
            @Override // android.os.Parcelable.Creator
            public final TranscriptStateDto createFromParcel(Parcel parcel) {
                return TranscriptStateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TranscriptStateDto[] newArray(int i) {
                return new TranscriptStateDto[i];
            }
        }

        static {
            TranscriptStateDto transcriptStateDto = new TranscriptStateDto("IN_PROGRESS", 0, "in_progress");
            IN_PROGRESS = transcriptStateDto;
            TranscriptStateDto transcriptStateDto2 = new TranscriptStateDto("DONE", 1, "done");
            DONE = transcriptStateDto2;
            TranscriptStateDto transcriptStateDto3 = new TranscriptStateDto("ERROR", 2, "error");
            ERROR = transcriptStateDto3;
            TranscriptStateDto[] transcriptStateDtoArr = {transcriptStateDto, transcriptStateDto2, transcriptStateDto3};
            $VALUES = transcriptStateDtoArr;
            $ENTRIES = new asp(transcriptStateDtoArr);
            CREATOR = new a();
        }

        private TranscriptStateDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TranscriptStateDto valueOf(String str) {
            return (TranscriptStateDto) Enum.valueOf(TranscriptStateDto.class, str);
        }

        public static TranscriptStateDto[] values() {
            return (TranscriptStateDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MessagesAudioMessageDto.kt */
    public static final class a implements Parcelable.Creator<MessagesAudioMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesAudioMessageDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(MessagesAudioMessageDto.class.getClassLoader());
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            TranscriptStateDto createFromParcel = parcel.readInt() == 0 ? null : TranscriptStateDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesAudioMessageDto(readInt, readInt2, readString, readString2, userId, arrayList, readString3, readString4, valueOf2, createFromParcel, valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesAudioMessageDto[] newArray(int i) {
            return new MessagesAudioMessageDto[i];
        }
    }

    public MessagesAudioMessageDto(int i, int i2, String str, String str2, UserId userId, List<Integer> list, String str3, String str4, Integer num, TranscriptStateDto transcriptStateDto, Boolean bool, Integer num2, String str5) {
        this.duration = i;
        this.id = i2;
        this.linkMp3 = str;
        this.linkOgg = str2;
        this.ownerId = userId;
        this.waveform = list;
        this.accessKey = str3;
        this.transcript = str4;
        this.transcriptError = num;
        this.transcriptState = transcriptStateDto;
        this.transcriptRateEnabled = bool;
        this.transcriptUpdateTime = num2;
        this.speechRecogniserTranscription = str5;
    }

    public final String d() {
        return this.accessKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.linkMp3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesAudioMessageDto)) {
            return false;
        }
        MessagesAudioMessageDto messagesAudioMessageDto = (MessagesAudioMessageDto) obj;
        return this.duration == messagesAudioMessageDto.duration && this.id == messagesAudioMessageDto.id && epx.f(this.linkMp3, messagesAudioMessageDto.linkMp3) && epx.f(this.linkOgg, messagesAudioMessageDto.linkOgg) && epx.f(this.ownerId, messagesAudioMessageDto.ownerId) && epx.f(this.waveform, messagesAudioMessageDto.waveform) && epx.f(this.accessKey, messagesAudioMessageDto.accessKey) && epx.f(this.transcript, messagesAudioMessageDto.transcript) && epx.f(this.transcriptError, messagesAudioMessageDto.transcriptError) && this.transcriptState == messagesAudioMessageDto.transcriptState && epx.f(this.transcriptRateEnabled, messagesAudioMessageDto.transcriptRateEnabled) && epx.f(this.transcriptUpdateTime, messagesAudioMessageDto.transcriptUpdateTime) && epx.f(this.speechRecogniserTranscription, messagesAudioMessageDto.speechRecogniserTranscription);
    }

    public final String f() {
        return this.linkOgg;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = fw3.a(bh10.a(urd0.a(urd0.a(shy.a(this.id, Integer.hashCode(this.duration) * 31, 31), 31, this.linkMp3), 31, this.linkOgg), 31, this.ownerId.b), 31, this.waveform);
        String str = this.accessKey;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transcript;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.transcriptError;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        TranscriptStateDto transcriptStateDto = this.transcriptState;
        int hashCode4 = (hashCode3 + (transcriptStateDto == null ? 0 : transcriptStateDto.hashCode())) * 31;
        Boolean bool = this.transcriptRateEnabled;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.transcriptUpdateTime;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.speechRecogniserTranscription;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesAudioMessageDto(duration=");
        sb.append(this.duration);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", linkMp3=");
        sb.append(this.linkMp3);
        sb.append(", linkOgg=");
        sb.append(this.linkOgg);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", waveform=");
        sb.append(this.waveform);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", transcript=");
        sb.append(this.transcript);
        sb.append(", transcriptError=");
        sb.append(this.transcriptError);
        sb.append(", transcriptState=");
        sb.append(this.transcriptState);
        sb.append(", transcriptRateEnabled=");
        sb.append(this.transcriptRateEnabled);
        sb.append(", transcriptUpdateTime=");
        sb.append(this.transcriptUpdateTime);
        sb.append(", speechRecogniserTranscription=");
        return ho8.a(sb, this.speechRecogniserTranscription, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.duration);
        parcel.writeInt(this.id);
        parcel.writeString(this.linkMp3);
        parcel.writeString(this.linkOgg);
        parcel.writeParcelable(this.ownerId, i);
        Iterator a2 = ao.a(parcel, this.waveform);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeString(this.accessKey);
        parcel.writeString(this.transcript);
        Integer num = this.transcriptError;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        TranscriptStateDto transcriptStateDto = this.transcriptState;
        if (transcriptStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transcriptStateDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.transcriptRateEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num2 = this.transcriptUpdateTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.speechRecogniserTranscription);
    }

    public /* synthetic */ MessagesAudioMessageDto(int i, int i2, String str, String str2, UserId userId, List list, String str3, String str4, Integer num, TranscriptStateDto transcriptStateDto, Boolean bool, Integer num2, String str5, int i3, zcl zclVar) {
        this(i, i2, str, str2, userId, list, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? null : num, (i3 & 512) != 0 ? null : transcriptStateDto, (i3 & 1024) != 0 ? null : bool, (i3 & 2048) != 0 ? null : num2, (i3 & 4096) != 0 ? null : str5);
    }
}
