package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoFeedClipsBlockItemsBlockInfoDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoFeedClipsBlockItemsBlockInfoDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoFeedClipsBlockItemsBlockInfoDto> CREATOR = new a();

    @pmi0("partner_badge")
    private final List<BaseImageDto> partnerBadge;

    @pmi0("partner_context")
    private final String partnerContext;

    /* compiled from: ShortVideoFeedClipsBlockItemsBlockInfoDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoFeedClipsBlockItemsBlockInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoFeedClipsBlockItemsBlockInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ShortVideoFeedClipsBlockItemsBlockInfoDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoFeedClipsBlockItemsBlockInfoDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoFeedClipsBlockItemsBlockInfoDto[] newArray(int i) {
            return new ShortVideoFeedClipsBlockItemsBlockInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoFeedClipsBlockItemsBlockInfoDto() {
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
        if (!(obj instanceof ShortVideoFeedClipsBlockItemsBlockInfoDto)) {
            return false;
        }
        ShortVideoFeedClipsBlockItemsBlockInfoDto shortVideoFeedClipsBlockItemsBlockInfoDto = (ShortVideoFeedClipsBlockItemsBlockInfoDto) obj;
        return epx.f(this.partnerContext, shortVideoFeedClipsBlockItemsBlockInfoDto.partnerContext) && epx.f(this.partnerBadge, shortVideoFeedClipsBlockItemsBlockInfoDto.partnerBadge);
    }

    public final int hashCode() {
        String str = this.partnerContext;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BaseImageDto> list = this.partnerBadge;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoFeedClipsBlockItemsBlockInfoDto(partnerContext=");
        sb.append(this.partnerContext);
        sb.append(", partnerBadge=");
        return ms9.a(')', sb, this.partnerBadge);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.partnerContext);
        List<BaseImageDto> list = this.partnerBadge;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public ShortVideoFeedClipsBlockItemsBlockInfoDto(String str, List<BaseImageDto> list) {
        this.partnerContext = str;
        this.partnerBadge = list;
    }

    public /* synthetic */ ShortVideoFeedClipsBlockItemsBlockInfoDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
