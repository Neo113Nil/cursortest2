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

/* compiled from: OwnersGetVideoContentResponseDto.kt */
/* loaded from: classes15.dex */
public final class OwnersGetVideoContentResponseDto implements Parcelable {
    public static final Parcelable.Creator<OwnersGetVideoContentResponseDto> CREATOR = new a();

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("videos")
    private final List<OwnersContentVideoItemDto> videos;

    /* compiled from: OwnersGetVideoContentResponseDto.kt */
    public static final class a implements Parcelable.Creator<OwnersGetVideoContentResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersGetVideoContentResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(OwnersContentVideoItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new OwnersGetVideoContentResponseDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersGetVideoContentResponseDto[] newArray(int i) {
            return new OwnersGetVideoContentResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OwnersGetVideoContentResponseDto() {
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
        if (!(obj instanceof OwnersGetVideoContentResponseDto)) {
            return false;
        }
        OwnersGetVideoContentResponseDto ownersGetVideoContentResponseDto = (OwnersGetVideoContentResponseDto) obj;
        return epx.f(this.videos, ownersGetVideoContentResponseDto.videos) && epx.f(this.nextFrom, ownersGetVideoContentResponseDto.nextFrom);
    }

    public final int hashCode() {
        List<OwnersContentVideoItemDto> list = this.videos;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextFrom;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnersGetVideoContentResponseDto(videos=");
        sb.append(this.videos);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<OwnersContentVideoItemDto> list = this.videos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((OwnersContentVideoItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nextFrom);
    }

    public OwnersGetVideoContentResponseDto(List<OwnersContentVideoItemDto> list, String str) {
        this.videos = list;
        this.nextFrom = str;
    }

    public /* synthetic */ OwnersGetVideoContentResponseDto(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
