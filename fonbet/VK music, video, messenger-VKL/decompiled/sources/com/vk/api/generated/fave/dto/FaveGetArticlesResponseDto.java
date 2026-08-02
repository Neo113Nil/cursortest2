package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: FaveGetArticlesResponseDto.kt */
/* loaded from: classes14.dex */
public final class FaveGetArticlesResponseDto implements Parcelable {
    public static final Parcelable.Creator<FaveGetArticlesResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<ArticlesArticleDto> items;

    /* compiled from: FaveGetArticlesResponseDto.kt */
    public static final class a implements Parcelable.Creator<FaveGetArticlesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveGetArticlesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(FaveGetArticlesResponseDto.class, parcel, arrayList, i, 1);
            }
            return new FaveGetArticlesResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FaveGetArticlesResponseDto[] newArray(int i) {
            return new FaveGetArticlesResponseDto[i];
        }
    }

    public FaveGetArticlesResponseDto(int i, List<ArticlesArticleDto> list) {
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
        if (!(obj instanceof FaveGetArticlesResponseDto)) {
            return false;
        }
        FaveGetArticlesResponseDto faveGetArticlesResponseDto = (FaveGetArticlesResponseDto) obj;
        return this.count == faveGetArticlesResponseDto.count && epx.f(this.items, faveGetArticlesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveGetArticlesResponseDto(count=");
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
