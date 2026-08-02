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

/* compiled from: AudioLyricsDataDto.kt */
/* loaded from: classes14.dex */
public final class AudioLyricsDataDto implements Parcelable {
    public static final Parcelable.Creator<AudioLyricsDataDto> CREATOR = new a();

    @pmi0("language")
    private final String language;

    @pmi0("text")
    private final List<String> text;

    @pmi0("timestamps")
    private final List<AudioLyricsTimelinesDto> timestamps;

    /* compiled from: AudioLyricsDataDto.kt */
    public static final class a implements Parcelable.Creator<AudioLyricsDataDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioLyricsDataDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AudioLyricsTimelinesDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AudioLyricsDataDto(readString, createStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioLyricsDataDto[] newArray(int i) {
            return new AudioLyricsDataDto[i];
        }
    }

    public AudioLyricsDataDto() {
        this(null, null, null, 7, null);
    }

    public final List<String> d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AudioLyricsTimelinesDto> e() {
        return this.timestamps;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioLyricsDataDto)) {
            return false;
        }
        AudioLyricsDataDto audioLyricsDataDto = (AudioLyricsDataDto) obj;
        return epx.f(this.language, audioLyricsDataDto.language) && epx.f(this.text, audioLyricsDataDto.text) && epx.f(this.timestamps, audioLyricsDataDto.timestamps);
    }

    public final int hashCode() {
        String str = this.language;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.text;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AudioLyricsTimelinesDto> list2 = this.timestamps;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioLyricsDataDto(language=");
        sb.append(this.language);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", timestamps=");
        return ms9.a(')', sb, this.timestamps);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.language);
        parcel.writeStringList(this.text);
        List<AudioLyricsTimelinesDto> list = this.timestamps;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AudioLyricsTimelinesDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public AudioLyricsDataDto(String str, List<String> list, List<AudioLyricsTimelinesDto> list2) {
        this.language = str;
        this.text = list;
        this.timestamps = list2;
    }

    public /* synthetic */ AudioLyricsDataDto(String str, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
