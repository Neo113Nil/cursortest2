package com.vk.api.generated.video.dto;

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

/* compiled from: VideoAgreeDisclaimerResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoAgreeDisclaimerResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoAgreeDisclaimerResponseDto> CREATOR = new a();

    @pmi0("disclaimer_types")
    private final List<Integer> disclaimerTypes;

    @pmi0("expiration_time")
    private final Integer expirationTime;

    /* compiled from: VideoAgreeDisclaimerResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoAgreeDisclaimerResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAgreeDisclaimerResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
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
            return new VideoAgreeDisclaimerResponseDto(arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAgreeDisclaimerResponseDto[] newArray(int i) {
            return new VideoAgreeDisclaimerResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoAgreeDisclaimerResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAgreeDisclaimerResponseDto)) {
            return false;
        }
        VideoAgreeDisclaimerResponseDto videoAgreeDisclaimerResponseDto = (VideoAgreeDisclaimerResponseDto) obj;
        return epx.f(this.disclaimerTypes, videoAgreeDisclaimerResponseDto.disclaimerTypes) && epx.f(this.expirationTime, videoAgreeDisclaimerResponseDto.expirationTime);
    }

    public final int hashCode() {
        List<Integer> list = this.disclaimerTypes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.expirationTime;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAgreeDisclaimerResponseDto(disclaimerTypes=");
        sb.append(this.disclaimerTypes);
        sb.append(", expirationTime=");
        return uqi.b(sb, this.expirationTime, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Integer> list = this.disclaimerTypes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Integer num = this.expirationTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public VideoAgreeDisclaimerResponseDto(List<Integer> list, Integer num) {
        this.disclaimerTypes = list;
        this.expirationTime = num;
    }

    public /* synthetic */ VideoAgreeDisclaimerResponseDto(List list, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}
