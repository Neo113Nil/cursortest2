package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioBooksChapterProgressStatusDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksChapterProgressStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioBooksChapterProgressStatusDto[] $VALUES;
    public static final Parcelable.Creator<AudioBooksChapterProgressStatusDto> CREATOR;

    @pmi0("done")
    public static final AudioBooksChapterProgressStatusDto DONE;

    @pmi0("in_progress")
    public static final AudioBooksChapterProgressStatusDto IN_PROGRESS;

    @pmi0("unread")
    public static final AudioBooksChapterProgressStatusDto UNREAD;
    private final String value;

    /* compiled from: AudioBooksChapterProgressStatusDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksChapterProgressStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBooksChapterProgressStatusDto createFromParcel(Parcel parcel) {
            return AudioBooksChapterProgressStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksChapterProgressStatusDto[] newArray(int i) {
            return new AudioBooksChapterProgressStatusDto[i];
        }
    }

    static {
        AudioBooksChapterProgressStatusDto audioBooksChapterProgressStatusDto = new AudioBooksChapterProgressStatusDto("UNREAD", 0, "unread");
        UNREAD = audioBooksChapterProgressStatusDto;
        AudioBooksChapterProgressStatusDto audioBooksChapterProgressStatusDto2 = new AudioBooksChapterProgressStatusDto("IN_PROGRESS", 1, "in_progress");
        IN_PROGRESS = audioBooksChapterProgressStatusDto2;
        AudioBooksChapterProgressStatusDto audioBooksChapterProgressStatusDto3 = new AudioBooksChapterProgressStatusDto("DONE", 2, "done");
        DONE = audioBooksChapterProgressStatusDto3;
        AudioBooksChapterProgressStatusDto[] audioBooksChapterProgressStatusDtoArr = {audioBooksChapterProgressStatusDto, audioBooksChapterProgressStatusDto2, audioBooksChapterProgressStatusDto3};
        $VALUES = audioBooksChapterProgressStatusDtoArr;
        $ENTRIES = new asp(audioBooksChapterProgressStatusDtoArr);
        CREATOR = new a();
    }

    private AudioBooksChapterProgressStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioBooksChapterProgressStatusDto valueOf(String str) {
        return (AudioBooksChapterProgressStatusDto) Enum.valueOf(AudioBooksChapterProgressStatusDto.class, str);
    }

    public static AudioBooksChapterProgressStatusDto[] values() {
        return (AudioBooksChapterProgressStatusDto[]) $VALUES.clone();
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
