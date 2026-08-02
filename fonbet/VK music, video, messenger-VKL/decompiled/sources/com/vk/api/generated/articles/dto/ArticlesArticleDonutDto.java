package com.vk.api.generated.articles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ArticlesArticleDonutDto.kt */
/* loaded from: classes14.dex */
public final class ArticlesArticleDonutDto implements Parcelable {
    public static final Parcelable.Creator<ArticlesArticleDonutDto> CREATOR = new a();

    @pmi0("is_donut")
    private final boolean isDonut;

    @pmi0("placeholder")
    private final ArticlesArticleDonutPlaceholderDto placeholder;

    /* compiled from: ArticlesArticleDonutDto.kt */
    public static final class a implements Parcelable.Creator<ArticlesArticleDonutDto> {
        @Override // android.os.Parcelable.Creator
        public final ArticlesArticleDonutDto createFromParcel(Parcel parcel) {
            return new ArticlesArticleDonutDto(parcel.readInt() != 0, parcel.readInt() == 0 ? null : ArticlesArticleDonutPlaceholderDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ArticlesArticleDonutDto[] newArray(int i) {
            return new ArticlesArticleDonutDto[i];
        }
    }

    public ArticlesArticleDonutDto(boolean z, ArticlesArticleDonutPlaceholderDto articlesArticleDonutPlaceholderDto) {
        this.isDonut = z;
        this.placeholder = articlesArticleDonutPlaceholderDto;
    }

    public final ArticlesArticleDonutPlaceholderDto d() {
        return this.placeholder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isDonut;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticlesArticleDonutDto)) {
            return false;
        }
        ArticlesArticleDonutDto articlesArticleDonutDto = (ArticlesArticleDonutDto) obj;
        return this.isDonut == articlesArticleDonutDto.isDonut && epx.f(this.placeholder, articlesArticleDonutDto.placeholder);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isDonut) * 31;
        ArticlesArticleDonutPlaceholderDto articlesArticleDonutPlaceholderDto = this.placeholder;
        return hashCode + (articlesArticleDonutPlaceholderDto == null ? 0 : articlesArticleDonutPlaceholderDto.hashCode());
    }

    public final String toString() {
        return "ArticlesArticleDonutDto(isDonut=" + this.isDonut + ", placeholder=" + this.placeholder + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDonut ? 1 : 0);
        ArticlesArticleDonutPlaceholderDto articlesArticleDonutPlaceholderDto = this.placeholder;
        if (articlesArticleDonutPlaceholderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            articlesArticleDonutPlaceholderDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ArticlesArticleDonutDto(boolean z, ArticlesArticleDonutPlaceholderDto articlesArticleDonutPlaceholderDto, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : articlesArticleDonutPlaceholderDto);
    }
}
