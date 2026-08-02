package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.FreeBox;
import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioBooksAccessStatusDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksAccessStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioBooksAccessStatusDto[] $VALUES;
    public static final Parcelable.Creator<AudioBooksAccessStatusDto> CREATOR;

    @pmi0(FreeBox.TYPE)
    public static final AudioBooksAccessStatusDto FREE;

    @pmi0("paid")
    public static final AudioBooksAccessStatusDto PAID;

    @pmi0(X3.i.d0)
    public static final AudioBooksAccessStatusDto STARTED;
    private final String value;

    /* compiled from: AudioBooksAccessStatusDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksAccessStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBooksAccessStatusDto createFromParcel(Parcel parcel) {
            return AudioBooksAccessStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksAccessStatusDto[] newArray(int i) {
            return new AudioBooksAccessStatusDto[i];
        }
    }

    static {
        AudioBooksAccessStatusDto audioBooksAccessStatusDto = new AudioBooksAccessStatusDto("FREE", 0, FreeBox.TYPE);
        FREE = audioBooksAccessStatusDto;
        AudioBooksAccessStatusDto audioBooksAccessStatusDto2 = new AudioBooksAccessStatusDto("PAID", 1, "paid");
        PAID = audioBooksAccessStatusDto2;
        AudioBooksAccessStatusDto audioBooksAccessStatusDto3 = new AudioBooksAccessStatusDto(SignalingProtocol.STATE_STARTED, 2, X3.i.d0);
        STARTED = audioBooksAccessStatusDto3;
        AudioBooksAccessStatusDto[] audioBooksAccessStatusDtoArr = {audioBooksAccessStatusDto, audioBooksAccessStatusDto2, audioBooksAccessStatusDto3};
        $VALUES = audioBooksAccessStatusDtoArr;
        $ENTRIES = new asp(audioBooksAccessStatusDtoArr);
        CREATOR = new a();
    }

    private AudioBooksAccessStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioBooksAccessStatusDto valueOf(String str) {
        return (AudioBooksAccessStatusDto) Enum.valueOf(AudioBooksAccessStatusDto.class, str);
    }

    public static AudioBooksAccessStatusDto[] values() {
        return (AudioBooksAccessStatusDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
