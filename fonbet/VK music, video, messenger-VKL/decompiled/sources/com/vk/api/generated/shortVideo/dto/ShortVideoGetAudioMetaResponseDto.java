package com.vk.api.generated.shortVideo.dto;

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

/* compiled from: ShortVideoGetAudioMetaResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetAudioMetaResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetAudioMetaResponseDto> CREATOR = new a();

    @pmi0("start_position")
    private final Integer startPosition;

    @pmi0("url")
    private final String url;

    @pmi0("waveform")
    private final List<Integer> waveform;

    /* compiled from: ShortVideoGetAudioMetaResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetAudioMetaResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetAudioMetaResponseDto createFromParcel(Parcel parcel) {
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
            return new ShortVideoGetAudioMetaResponseDto(readString, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetAudioMetaResponseDto[] newArray(int i) {
            return new ShortVideoGetAudioMetaResponseDto[i];
        }
    }

    public ShortVideoGetAudioMetaResponseDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.startPosition;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Integer> e() {
        return this.waveform;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGetAudioMetaResponseDto)) {
            return false;
        }
        ShortVideoGetAudioMetaResponseDto shortVideoGetAudioMetaResponseDto = (ShortVideoGetAudioMetaResponseDto) obj;
        return epx.f(this.url, shortVideoGetAudioMetaResponseDto.url) && epx.f(this.waveform, shortVideoGetAudioMetaResponseDto.waveform) && epx.f(this.startPosition, shortVideoGetAudioMetaResponseDto.startPosition);
    }

    public final String getUrl() {
        return this.url;
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
        StringBuilder sb = new StringBuilder("ShortVideoGetAudioMetaResponseDto(url=");
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

    public ShortVideoGetAudioMetaResponseDto(String str, List<Integer> list, Integer num) {
        this.url = str;
        this.waveform = list;
        this.startPosition = num;
    }

    public /* synthetic */ ShortVideoGetAudioMetaResponseDto(String str, List list, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }
}
