package com.vk.api.generated.articles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ArticlesGetByLinkResponseDto.kt */
/* loaded from: classes14.dex */
public final class ArticlesGetByLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<ArticlesGetByLinkResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<ArticlesArticleDto> items;

    /* compiled from: ArticlesGetByLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<ArticlesGetByLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ArticlesGetByLinkResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(ArticlesGetByLinkResponseDto.class, parcel, arrayList, i, 1);
            }
            return new ArticlesGetByLinkResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ArticlesGetByLinkResponseDto[] newArray(int i) {
            return new ArticlesGetByLinkResponseDto[i];
        }
    }

    public ArticlesGetByLinkResponseDto(int i, List<ArticlesArticleDto> list) {
        this.count = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticlesGetByLinkResponseDto)) {
            return false;
        }
        ArticlesGetByLinkResponseDto articlesGetByLinkResponseDto = (ArticlesGetByLinkResponseDto) obj;
        return this.count == articlesGetByLinkResponseDto.count && epx.f(this.items, articlesGetByLinkResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticlesGetByLinkResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
