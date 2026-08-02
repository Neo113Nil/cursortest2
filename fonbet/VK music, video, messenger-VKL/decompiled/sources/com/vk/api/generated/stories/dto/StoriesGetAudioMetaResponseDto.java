package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoriesGetAudioMetaResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetAudioMetaResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetAudioMetaResponseDto> CREATOR = new a();

    @pmi0("start_position")
    private final Integer startPosition;

    @pmi0("url")
    private final String url;

    @pmi0("waveform")
    private final List<Integer> waveform;

    /* compiled from: StoriesGetAudioMetaResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetAudioMetaResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetAudioMetaResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            return new StoriesGetAudioMetaResponseDto(readString, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetAudioMetaResponseDto[] newArray(int i) {
            return new StoriesGetAudioMetaResponseDto[i];
        }
    }

    public StoriesGetAudioMetaResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetAudioMetaResponseDto)) {
            return false;
        }
        StoriesGetAudioMetaResponseDto storiesGetAudioMetaResponseDto = (StoriesGetAudioMetaResponseDto) obj;
        return epx.f(this.url, storiesGetAudioMetaResponseDto.url) && epx.f(this.waveform, storiesGetAudioMetaResponseDto.waveform) && epx.f(this.startPosition, storiesGetAudioMetaResponseDto.startPosition);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Integer> list = this.waveform;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.startPosition;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetAudioMetaResponseDto(url=");
        sb.append(this.url);
        sb.append(", waveform=");
        sb.append(this.waveform);
        sb.append(", startPosition=");
        return uqi.b(sb, this.startPosition, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        List<Integer> list = this.waveform;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Integer num = this.startPosition;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public StoriesGetAudioMetaResponseDto(String str, List<Integer> list, Integer num) {
        this.url = str;
        this.waveform = list;
        this.startPosition = num;
    }

    public /* synthetic */ StoriesGetAudioMetaResponseDto(String str, List list, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }
}
