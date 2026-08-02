package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SpacesCallPreviewParticipantsDto.kt */
/* loaded from: classes15.dex */
public final class SpacesCallPreviewParticipantsDto implements Parcelable {
    public static final Parcelable.Creator<SpacesCallPreviewParticipantsDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("list")
    private final List<UserId> list;

    /* compiled from: SpacesCallPreviewParticipantsDto.kt */
    public static final class a implements Parcelable.Creator<SpacesCallPreviewParticipantsDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesCallPreviewParticipantsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SpacesCallPreviewParticipantsDto.class, parcel, arrayList, i, 1);
                }
            }
            return new SpacesCallPreviewParticipantsDto(arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesCallPreviewParticipantsDto[] newArray(int i) {
            return new SpacesCallPreviewParticipantsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpacesCallPreviewParticipantsDto() {
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
        if (!(obj instanceof SpacesCallPreviewParticipantsDto)) {
            return false;
        }
        SpacesCallPreviewParticipantsDto spacesCallPreviewParticipantsDto = (SpacesCallPreviewParticipantsDto) obj;
        return epx.f(this.list, spacesCallPreviewParticipantsDto.list) && epx.f(this.count, spacesCallPreviewParticipantsDto.count);
    }

    public final int hashCode() {
        List<UserId> list = this.list;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.count;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesCallPreviewParticipantsDto(list=");
        sb.append(this.list);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<UserId> list = this.list;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public SpacesCallPreviewParticipantsDto(List<UserId> list, Integer num) {
        this.list = list;
        this.count = num;
    }

    public /* synthetic */ SpacesCallPreviewParticipantsDto(List list, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}
