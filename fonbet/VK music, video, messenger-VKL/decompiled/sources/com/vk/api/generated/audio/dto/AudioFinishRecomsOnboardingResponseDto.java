package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioFinishRecomsOnboardingResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioFinishRecomsOnboardingResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioFinishRecomsOnboardingResponseDto> CREATOR = new a();

    @pmi0("actions")
    private final List<AudioOnboardingFinalDto> actions;

    /* compiled from: AudioFinishRecomsOnboardingResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioFinishRecomsOnboardingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioFinishRecomsOnboardingResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AudioOnboardingFinalDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AudioFinishRecomsOnboardingResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioFinishRecomsOnboardingResponseDto[] newArray(int i) {
            return new AudioFinishRecomsOnboardingResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioFinishRecomsOnboardingResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioFinishRecomsOnboardingResponseDto) && epx.f(this.actions, ((AudioFinishRecomsOnboardingResponseDto) obj).actions);
    }

    public final int hashCode() {
        List<AudioOnboardingFinalDto> list = this.actions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AudioFinishRecomsOnboardingResponseDto(actions="), this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AudioOnboardingFinalDto> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AudioOnboardingFinalDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public AudioFinishRecomsOnboardingResponseDto(List<AudioOnboardingFinalDto> list) {
        this.actions = list;
    }

    public /* synthetic */ AudioFinishRecomsOnboardingResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
