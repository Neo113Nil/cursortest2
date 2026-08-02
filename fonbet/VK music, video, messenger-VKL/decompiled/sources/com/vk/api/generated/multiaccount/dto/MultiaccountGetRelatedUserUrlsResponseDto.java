package com.vk.api.generated.multiaccount.dto;

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

/* compiled from: MultiaccountGetRelatedUserUrlsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MultiaccountGetRelatedUserUrlsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MultiaccountGetRelatedUserUrlsResponseDto> CREATOR = new a();

    @pmi0("related_user_urls")
    private final List<MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto> relatedUserUrls;

    @pmi0("urls")
    private final List<MultiaccountGetRelatedUserUrlsUrlsObjectDto> urls;

    /* compiled from: MultiaccountGetRelatedUserUrlsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MultiaccountGetRelatedUserUrlsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MultiaccountGetRelatedUserUrlsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(MultiaccountGetRelatedUserUrlsUrlsObjectDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new MultiaccountGetRelatedUserUrlsResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MultiaccountGetRelatedUserUrlsResponseDto[] newArray(int i) {
            return new MultiaccountGetRelatedUserUrlsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiaccountGetRelatedUserUrlsResponseDto() {
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
        if (!(obj instanceof MultiaccountGetRelatedUserUrlsResponseDto)) {
            return false;
        }
        MultiaccountGetRelatedUserUrlsResponseDto multiaccountGetRelatedUserUrlsResponseDto = (MultiaccountGetRelatedUserUrlsResponseDto) obj;
        return epx.f(this.urls, multiaccountGetRelatedUserUrlsResponseDto.urls) && epx.f(this.relatedUserUrls, multiaccountGetRelatedUserUrlsResponseDto.relatedUserUrls);
    }

    public final int hashCode() {
        List<MultiaccountGetRelatedUserUrlsUrlsObjectDto> list = this.urls;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto> list2 = this.relatedUserUrls;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiaccountGetRelatedUserUrlsResponseDto(urls=");
        sb.append(this.urls);
        sb.append(", relatedUserUrls=");
        return ms9.a(')', sb, this.relatedUserUrls);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MultiaccountGetRelatedUserUrlsUrlsObjectDto> list = this.urls;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MultiaccountGetRelatedUserUrlsUrlsObjectDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto> list2 = this.relatedUserUrls;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public MultiaccountGetRelatedUserUrlsResponseDto(List<MultiaccountGetRelatedUserUrlsUrlsObjectDto> list, List<MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto> list2) {
        this.urls = list;
        this.relatedUserUrls = list2;
    }

    public /* synthetic */ MultiaccountGetRelatedUserUrlsResponseDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
