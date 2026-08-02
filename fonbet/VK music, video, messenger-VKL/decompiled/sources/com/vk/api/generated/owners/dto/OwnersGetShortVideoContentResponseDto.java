package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnersGetShortVideoContentResponseDto.kt */
/* loaded from: classes15.dex */
public final class OwnersGetShortVideoContentResponseDto implements Parcelable {
    public static final Parcelable.Creator<OwnersGetShortVideoContentResponseDto> CREATOR = new a();

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("short_videos")
    private final List<OwnersContentShortVideoItemDto> shortVideos;

    /* compiled from: OwnersGetShortVideoContentResponseDto.kt */
    public static final class a implements Parcelable.Creator<OwnersGetShortVideoContentResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersGetShortVideoContentResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(OwnersContentShortVideoItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new OwnersGetShortVideoContentResponseDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersGetShortVideoContentResponseDto[] newArray(int i) {
            return new OwnersGetShortVideoContentResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OwnersGetShortVideoContentResponseDto() {
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
        if (!(obj instanceof OwnersGetShortVideoContentResponseDto)) {
            return false;
        }
        OwnersGetShortVideoContentResponseDto ownersGetShortVideoContentResponseDto = (OwnersGetShortVideoContentResponseDto) obj;
        return epx.f(this.shortVideos, ownersGetShortVideoContentResponseDto.shortVideos) && epx.f(this.nextFrom, ownersGetShortVideoContentResponseDto.nextFrom);
    }

    public final int hashCode() {
        List<OwnersContentShortVideoItemDto> list = this.shortVideos;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextFrom;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnersGetShortVideoContentResponseDto(shortVideos=");
        sb.append(this.shortVideos);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<OwnersContentShortVideoItemDto> list = this.shortVideos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((OwnersContentShortVideoItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nextFrom);
    }

    public OwnersGetShortVideoContentResponseDto(List<OwnersContentShortVideoItemDto> list, String str) {
        this.shortVideos = list;
        this.nextFrom = str;
    }

    public /* synthetic */ OwnersGetShortVideoContentResponseDto(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
